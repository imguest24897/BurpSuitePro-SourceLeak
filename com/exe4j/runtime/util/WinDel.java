/*     */ package com.exe4j.runtime.util;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintWriter;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ 
/*     */ public class WinDel {
/*  10 */   public static final String SEMAPHORE_NAME = System.getProperty("exe4j.semaphoreName");
/*     */   
/*     */   public static final String PROP_NAME_SEMAPHORE_NAME = "exe4j.semaphoreName";
/*     */   
/*     */   private static final String REBOOT_DELETION = "reboot_deletion";
/*     */   
/*     */   private static final String NO_REBOOT_DELETION = "no_reboot_deletion";
/*     */   
/*     */   private static final String FORCE_REBOOT = "force_reboot";
/*     */   
/*     */   public static final String I4JDEL_FILENAME = "i4jdel.exe";
/*     */   private static final String I4JDEL_TARGET_NAME = "i4jdel";
/*     */   private static final String EXTERNAL_EXECTUABLE_PREFIX_PARAMETER = "__i4j_windel";
/*     */   private static File i4jdelTempFile;
/*     */   public static final String LOGFILE_PROPERTY_NAME = "windel.logfile";
/*     */   private static boolean used;
/*     */   private static boolean reboot;
/*  27 */   private static String rebootMessage = "";
/*  28 */   private static String rebootErrorMessage = "";
/*     */   
/*  30 */   private static List<File> usedFiles = new ArrayList<File>();
/*  31 */   private static List<File> usedDirs = new ArrayList<File>();
/*     */   
/*     */   private static final String EOSMARKER = "EOSMARKER";
/*     */   static String externalExecutable;
/*     */   
/*  36 */   private static Launcher launcher = new Launcher()
/*     */     {
/*     */       public void launch(String... command) throws IOException
/*     */       {
/*  40 */         (new ProcessBuilder(command)).start();
/*     */       }
/*     */     }; public static interface Launcher {
/*     */     void launch(String... param1VarArgs) throws IOException; }
/*     */   public static void prepareDeletion(File delSourceFile) throws IOException {
/*  45 */     if (externalExecutable == null && i4jdelTempFile == null) {
/*  46 */       int i = 0;
/*  47 */       boolean nameFound = false;
/*  48 */       while (!nameFound && i < 50) {
/*  49 */         i4jdelTempFile = new File(System.getProperty("java.io.tmpdir"), "i4jdel" + i++ + ".exe");
/*     */         try {
/*  51 */           FileUtil.copyFile(delSourceFile, i4jdelTempFile);
/*  52 */           nameFound = true;
/*  53 */         } catch (IOException iOException) {}
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/*  58 */       if (!nameFound) {
/*  59 */         i4jdelTempFile = File.createTempFile("i4jd", ".exe");
/*  60 */         FileUtil.copyFile(delSourceFile, i4jdelTempFile);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void setRebootMessage(String rebootMessage, String rebootErrorMessage) {
/*  66 */     WinDel.rebootMessage = rebootMessage;
/*  67 */     WinDel.rebootErrorMessage = rebootErrorMessage;
/*     */   }
/*     */   
/*     */   public static void setReboot(boolean reboot) {
/*  71 */     WinDel.reboot = reboot;
/*     */   } public static void scheduleDeletion(Collection<File> files, Collection<File> dirs, boolean addOnly) throws IOException {
/*     */     File logFile;
/*     */     String[] launchCommand;
/*  75 */     usedFiles.addAll(files);
/*  76 */     usedDirs.addAll(dirs);
/*  77 */     if (addOnly) {
/*     */       return;
/*     */     }
/*  80 */     used = true;
/*     */ 
/*     */     
/*  83 */     String externalLogFileName = System.getProperty("windel.logfile");
/*  84 */     if (externalLogFileName == null) {
/*  85 */       logFile = File.createTempFile("i4j", null);
/*     */     } else {
/*  87 */       logFile = new File(externalLogFileName);
/*     */     } 
/*     */     
/*  90 */     OutputStream out = new FileOutputStream(logFile);
/*  91 */     PrintWriter pw = new PrintWriter(new OutputStreamWriter(out, "UTF-16LE"));
/*  92 */     pw.println(SEMAPHORE_NAME);
/*     */     
/*  94 */     if (externalLogFileName == null) {
/*  95 */       if (reboot) {
/*  96 */         pw.println("force_reboot");
/*  97 */       } else if (Boolean.getBoolean("install4j.noRebootDeletion")) {
/*  98 */         pw.println("no_reboot_deletion");
/*     */       } else {
/* 100 */         pw.println("reboot_deletion");
/*     */       } 
/* 102 */       pw.println(rebootMessage);
/* 103 */       pw.println("EOSMARKER");
/* 104 */       pw.println(rebootErrorMessage);
/* 105 */       pw.println("EOSMARKER");
/*     */     } 
/*     */     
/* 108 */     for (File file : usedFiles) {
/* 109 */       pw.println(file.getAbsolutePath());
/*     */     }
/*     */     
/* 112 */     pw.println();
/*     */     
/* 114 */     for (File file : usedDirs) {
/* 115 */       pw.println(file.getAbsolutePath());
/*     */     }
/*     */     
/* 118 */     pw.close();
/*     */ 
/*     */     
/* 121 */     if (externalExecutable != null) {
/* 122 */       launchCommand = new String[] { externalExecutable, "__i4j_windel", logFile.getAbsolutePath() };
/*     */     } else {
/* 124 */       launchCommand = new String[] { i4jdelTempFile.getAbsolutePath(), logFile.getName() };
/*     */     } 
/*     */     
/* 127 */     if (externalLogFileName == null) {
/* 128 */       for (int i = 0; i < 10; i++) {
/*     */         try {
/* 130 */           launcher.launch(launchCommand);
/*     */           return;
/* 132 */         } catch (IOException e) {
/*     */           try {
/* 134 */             Thread.sleep(200L);
/* 135 */           } catch (InterruptedException interruptedException) {}
/*     */         } 
/*     */       } 
/*     */       
/* 139 */       System.err.println("Could not run additional delete process");
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void setUsed(boolean used) {
/* 144 */     WinDel.used = used;
/*     */   }
/*     */   
/*     */   public static boolean isUsed() {
/* 148 */     return used;
/*     */   }
/*     */   
/*     */   public static void setLauncher(Launcher launcher) {
/* 152 */     WinDel.launcher = launcher;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\exe4j\runtim\\util\WinDel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */