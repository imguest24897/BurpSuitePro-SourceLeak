/*     */ package com.install4j.runtime.launcher.integration;
/*     */ 
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.versionspecific.VersionSpecificHelper;
/*     */ import java.io.File;
/*     */ import java.io.PrintWriter;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.io.StringWriter;
/*     */ import java.io.Writer;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.text.DateFormat;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ 
/*     */ public class UpdateLog {
/*     */   private static final String PROPNAME_UPDATE_LOG = "install4j.updateLog";
/*  18 */   private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
/*  19 */   private static final String LAUNCHER_ID = System.getProperty("install4j.launcherId");
/*     */   
/*     */   private static final int MAXIMUM_RETAINED_BYTES = 40000;
/*  22 */   private static long pid = -1L;
/*     */   private static volatile String applicationName;
/*     */   private static volatile boolean updaterApplication;
/*     */   
/*     */   private static synchronized void writeString(String message) {
/*  27 */     File logFile = new File(AutomaticUpdate.getUpdateDir(), "update.log");
/*  28 */     logFile.getParentFile().mkdirs(); 
/*  29 */     try { RandomAccessFile raFile = new RandomAccessFile(logFile, "rw"); 
/*  30 */       try { if (UpdateConfig.tryLock(raFile.getChannel(), 40)) {
/*  31 */           long length = raFile.length();
/*     */           try {
/*  33 */             if (length > 200000L) {
/*  34 */               raFile.seek(length - 40000L);
/*  35 */               byte[] buffer = new byte[40000];
/*  36 */               raFile.readFully(buffer);
/*     */               
/*     */               int firstLineFeed;
/*  39 */               for (firstLineFeed = 0; firstLineFeed < 40000 && buffer[firstLineFeed] != 10; firstLineFeed++);
/*     */               
/*  41 */               raFile.seek(0L);
/*  42 */               length = (40000 - firstLineFeed - 1);
/*  43 */               raFile.write(buffer, firstLineFeed + 1, (int)length);
/*  44 */               raFile.setLength(length);
/*     */             } 
/*  46 */           } catch (Throwable throwable) {}
/*     */           
/*  48 */           raFile.seek(length);
/*  49 */           raFile.write((message + System.lineSeparator()).getBytes(StandardCharsets.UTF_8));
/*     */         } 
/*  51 */         raFile.close(); } catch (Throwable throwable) { try { raFile.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  } catch (Throwable e)
/*  52 */     { e.printStackTrace(); }
/*     */   
/*     */   }
/*     */   
/*     */   public static boolean enabled(int level) {
/*  57 */     String value = System.getProperty("install4j.updateLog", "");
/*  58 */     if (value.equals("true"))
/*  59 */       return (level <= 2); 
/*  60 */     if (value.length() > 0 && Character.isDigit(value.charAt(0))) {
/*     */       try {
/*  62 */         return (level <= Integer.parseInt(value));
/*  63 */       } catch (NumberFormatException e) {
/*  64 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*  67 */     return false;
/*     */   }
/*     */   
/*     */   public static void logIfUpdater(int level, String message) {
/*  71 */     if (updaterApplication) {
/*  72 */       log(level, message);
/*     */     }
/*     */   }
/*     */   
/*     */   public static synchronized void log(int level, String message) {
/*  77 */     if (enabled(level)) {
/*  78 */       if (pid == -1L) {
/*  79 */         pid = VersionSpecificHelper.getPid();
/*     */       }
/*  81 */       StringBuilder builder = new StringBuilder(DATE_FORMAT.format(new Date()));
/*  82 */       builder.append(" (PID ").append(pid);
/*  83 */       if (LAUNCHER_ID != null) {
/*  84 */         builder.append(", Launcher ID ").append(LAUNCHER_ID);
/*     */       }
/*  86 */       if (applicationName != null) {
/*  87 */         builder.append(", ").append(applicationName);
/*     */       } else {
/*  89 */         String currentApplicationId = InstallerConfig.getCurrentApplicationId();
/*  90 */         if (currentApplicationId != null) {
/*  91 */           builder.append(", App ID ").append(currentApplicationId);
/*     */         }
/*     */       } 
/*  94 */       builder.append("): ").append(message);
/*  95 */       writeString(builder.toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void logIfUpdater(int level, Throwable throwable) {
/* 100 */     if (updaterApplication) {
/* 101 */       log(level, throwable);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void logIfUpdater(Throwable throwable) {
/* 106 */     if (updaterApplication) {
/* 107 */       log(throwable);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void log(Throwable throwable) {
/* 112 */     log(1, throwable);
/*     */   }
/*     */   
/*     */   public static void log(int level, Throwable throwable) {
/* 116 */     if (enabled(level)) {
/* 117 */       StringWriter stringWriter = new StringWriter();
/* 118 */       PrintWriter pw = new PrintWriter(stringWriter)
/*     */         {
/*     */           public void println() {
/* 121 */             super.println();
/* 122 */             write("        ");
/*     */           }
/*     */         };
/* 125 */       throwable.printStackTrace(pw);
/* 126 */       log(1, stringWriter.toString());
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void addUpdateLogProperty(List<String> arguments) {
/* 131 */     String updateLogValue = System.getProperty("install4j.updateLog");
/* 132 */     if (updateLogValue != null) {
/* 133 */       arguments.add("-Dinstall4j.updateLog=" + updateLogValue);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setApplicationName(String applicationName) {
/* 138 */     UpdateLog.applicationName = applicationName;
/*     */   }
/*     */   
/*     */   public static boolean setUpdaterApplication(boolean updaterApplication) {
/* 142 */     boolean changed = (UpdateLog.updaterApplication != updaterApplication);
/* 143 */     UpdateLog.updaterApplication = updaterApplication;
/* 144 */     return changed;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\UpdateLog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */