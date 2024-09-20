/*     */ package com.install4j.api.macos;
/*     */ 
/*     */ import com.install4j.api.ProcessInfo;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.RunningProcessChecker;
/*     */ import com.install4j.runtime.installer.platform.macos.MacProcessHelper;
/*     */ import java.util.Collection;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MacProcesses
/*     */ {
/*     */   public static Info[] getRunningProcesses() {
/*  23 */     if (!Util.isMacOS()) {
/*  24 */       return new Info[0];
/*     */     }
/*  26 */     Collection<ProcessInfo> processes = RunningProcessChecker.getAllRunningProcesses();
/*  27 */     Info[] infos = new Info[processes.size()];
/*  28 */     int i = 0;
/*  29 */     for (ProcessInfo processInfo : processes) {
/*  30 */       infos[i++] = (Info)processInfo;
/*     */     }
/*  32 */     return infos;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean terminateProcesses(int[] processIds, boolean force, int timeout) {
/*  44 */     return MacProcessHelper.terminateProcesses(processIds, force, timeout);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean areInstalledLaunchersRunning() {
/*  54 */     if (!InstallerUtil.isMacOS()) {
/*  55 */       return false;
/*     */     }
/*  57 */     return RunningProcessChecker.areInstalledLaunchersRunning();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class Info
/*     */     extends ProcessInfo
/*     */   {
/*     */     private final String displayedName;
/*     */     
/*     */     private final String bundleIdentifier;
/*     */     
/*     */     private final boolean backgroundOnly;
/*     */ 
/*     */     
/*     */     public Info(int processId, String moduleName, String displayedName, String bundleIdentifier, boolean backgroundOnly) {
/*  73 */       super(processId, moduleName);
/*  74 */       this.displayedName = displayedName;
/*  75 */       this.bundleIdentifier = bundleIdentifier;
/*  76 */       this.backgroundOnly = backgroundOnly;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getWindowTitle() {
/*  81 */       String name = (this.bundleIdentifier == null) ? getModuleName() : this.displayedName;
/*  82 */       int index = name.indexOf(".app/Contents/MacOS/");
/*  83 */       if (index > -1) {
/*  84 */         return name.substring(0, index);
/*     */       }
/*  86 */       return name;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getDisplayedName() {
/*  96 */       return this.displayedName;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public String getBundleIdentifier() {
/* 104 */       return this.bundleIdentifier;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean isBackgroundOnly() {
/* 114 */       return this.backgroundOnly;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 119 */       return "Info{displayedName='" + this.displayedName + '\'' + ", bundleIdentifier=" + this.bundleIdentifier + ", backgroundOnly=" + this.backgroundOnly + ", " + super
/*     */ 
/*     */ 
/*     */         
/* 123 */         .toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\macos\MacProcesses.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */