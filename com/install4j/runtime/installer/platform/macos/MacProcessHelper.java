/*     */ package com.install4j.runtime.installer.platform.macos;
/*     */ import com.install4j.api.macos.MacProcesses;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.platform.unix.Execution;
/*     */ import com.install4j.runtime.installer.platform.win32.Common;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ public class MacProcessHelper {
/*     */   static {
/*  17 */     Common.init();
/*     */   }
/*     */   
/*  20 */   private static final Pattern PATTERN_MODULE_NAME = Pattern.compile("-Dexe4j.moduleName=(.*)");
/*     */   
/*     */   private static final int MIN_TIMEOUT = 400;
/*     */   
/*     */   public static final int TIMEOUT_STEP = 200;
/*     */ 
/*     */   
/*     */   public static void reboot() {
/*  28 */     reboot0();
/*     */   }
/*     */   
/*     */   public static boolean terminateProcesses(int[] processIds, boolean force, int closeTimeout) {
/*  32 */     List<String> command = new ArrayList<>();
/*  33 */     command.add("/bin/kill");
/*  34 */     if (force) {
/*  35 */       command.add("-9");
/*     */     }
/*  37 */     for (int processId : processIds) {
/*  38 */       command.add(String.valueOf(processId));
/*     */     }
/*  40 */     StringBuffer output = new StringBuffer();
/*     */     try {
/*  42 */       Execution.executeAndWait(command.<String>toArray(new String[0]), output);
/*  43 */     } catch (IOException e) {
/*  44 */       Logger.getImpl().log(e);
/*  45 */       return false;
/*     */     } 
/*     */     
/*  48 */     if (closeTimeout < 400) {
/*  49 */       closeTimeout = 400;
/*     */     }
/*     */     
/*  52 */     while (closeTimeout > 0) {
/*  53 */       if (checkProcessesExited(processIds)) {
/*  54 */         return true;
/*     */       }
/*     */       
/*     */       try {
/*  58 */         Thread.sleep(200L);
/*  59 */       } catch (InterruptedException e) {
/*  60 */         e.printStackTrace();
/*     */       } 
/*  62 */       closeTimeout -= 200;
/*     */     } 
/*  64 */     return false;
/*     */   }
/*     */   
/*     */   private static boolean checkProcessesExited(int[] processIds) {
/*  68 */     for (int processId : processIds) {
/*     */       try {
/*  70 */         if (!Execution.executeAndWait(new String[] { "/bin/kill", "-0", String.valueOf(processId) }, null)) {
/*  71 */           return false;
/*     */         }
/*  73 */       } catch (IOException e) {
/*  74 */         Logger.getImpl().log(e);
/*  75 */         return false;
/*     */       } 
/*     */     } 
/*  78 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public static MacProcesses.Info[] getRunningProcesses() {
/*  83 */     List<MacProcesses.Info> processes = new ArrayList<>();
/*  84 */     Map<Integer, MacProcesses.Info> pidToProcess = new HashMap<>();
/*  85 */     addGuiProcesses(processes, pidToProcess);
/*     */     try {
/*  87 */       addCommandLineProcesses(processes, pidToProcess);
/*  88 */     } catch (IOException e) {
/*  89 */       Logger.getImpl().log(e);
/*     */     } 
/*  91 */     return processes.<MacProcesses.Info>toArray(new MacProcesses.Info[0]);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static void addGuiProcesses(List<MacProcesses.Info> processes, Map<Integer, MacProcesses.Info> pidToProcess) {
/*  97 */     GuiInfo[] guiInfos = getGuiProcesses0(GuiInfo.class);
/*  98 */     if (guiInfos != null) {
/*  99 */       for (GuiInfo guiInfo : guiInfos) {
/* 100 */         MacProcesses.Info info = new MacProcesses.Info(guiInfo.pid, "", guiInfo.displayedName, guiInfo.bundleIdentifier, guiInfo.backgroundOnly);
/* 101 */         if (!processes.contains(info)) {
/* 102 */           processes.add(info);
/* 103 */           pidToProcess.put(Integer.valueOf(guiInfo.pid), info);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static void addCommandLineProcesses(List<MacProcesses.Info> processes, Map<Integer, MacProcesses.Info> pidToProcess) throws IOException {
/* 110 */     StringBuffer output = new StringBuffer();
/* 111 */     Execution.executeAndWait(new String[] { "/bin/ps", "-axo", "pid,args" }, output);
/* 112 */     String[] lines = output.toString().split("\n");
/* 113 */     for (String line : lines) {
/* 114 */       if (!line.trim().isEmpty()) {
/*     */ 
/*     */         
/* 117 */         String[] columns = line.trim().split(" ", 2);
/*     */         try {
/* 119 */           int pid = Integer.parseInt(columns[0]);
/* 120 */           String moduleName = getModuleNameFromCommandLine(columns[1]);
/* 121 */           MacProcesses.Info guiProcessInfo = pidToProcess.get(Integer.valueOf(pid));
/* 122 */           if (guiProcessInfo == null) {
/* 123 */             MacProcesses.Info info = new MacProcesses.Info(pid, moduleName, (new File(moduleName)).getName(), null, true);
/* 124 */             processes.add(info);
/* 125 */             pidToProcess.put(Integer.valueOf(pid), info);
/* 126 */           } else if (guiProcessInfo.getModuleName().isEmpty()) {
/* 127 */             processes.remove(guiProcessInfo);
/* 128 */             MacProcesses.Info info = new MacProcesses.Info(pid, moduleName, guiProcessInfo.getDisplayedName(), guiProcessInfo.getBundleIdentifier(), guiProcessInfo.isBackgroundOnly());
/* 129 */             processes.add(info);
/* 130 */             pidToProcess.put(Integer.valueOf(pid), info);
/*     */           } 
/* 132 */         } catch (NumberFormatException numberFormatException) {}
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static String getModuleNameFromCommandLine(String commandLine) {
/* 139 */     Matcher matcher = PATTERN_MODULE_NAME.matcher(commandLine);
/* 140 */     if (matcher.find()) {
/* 141 */       return getLongestExistingPath(matcher.group(1));
/*     */     }
/* 143 */     return getLongestExistingPath(commandLine);
/*     */   }
/*     */ 
/*     */   
/*     */   private static String getLongestExistingPath(String commandLine) {
/* 148 */     String[] components = commandLine.split(" ");
/* 149 */     for (int max = components.length; max > 0; max--) {
/* 150 */       StringBuilder buffer = new StringBuilder();
/* 151 */       for (int i = 0; i < max; i++) {
/* 152 */         if (i > 0) {
/* 153 */           buffer.append(' ');
/*     */         }
/* 155 */         buffer.append(components[i]);
/*     */       } 
/* 157 */       String fileName = buffer.toString();
/*     */       try {
/* 159 */         if ((new File(fileName)).exists()) {
/* 160 */           return fileName;
/*     */         }
/* 162 */       } catch (Exception exception) {}
/*     */     } 
/*     */ 
/*     */     
/* 166 */     return commandLine;
/*     */   }
/*     */   private static native void reboot0();
/*     */   
/*     */   private static native GuiInfo[] getGuiProcesses0(Class<GuiInfo> paramClass);
/*     */   
/*     */   public static class GuiInfo { final int pid;
/*     */     final String displayedName;
/*     */     
/*     */     private GuiInfo(int pid, String displayedName, String bundleIdentifier, boolean backgroundOnly) {
/* 176 */       this.pid = pid;
/* 177 */       this.displayedName = displayedName;
/* 178 */       this.bundleIdentifier = bundleIdentifier;
/* 179 */       this.backgroundOnly = backgroundOnly;
/*     */     }
/*     */     final String bundleIdentifier; final boolean backgroundOnly;
/*     */     
/*     */     public String toString() {
/* 184 */       return "GuiInfo{pid=" + this.pid + ", displayedName='" + this.displayedName + '\'' + ", bundleIdentifier='" + this.bundleIdentifier + '\'' + ", backgroundOnly=" + this.backgroundOnly + '}';
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\MacProcessHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */