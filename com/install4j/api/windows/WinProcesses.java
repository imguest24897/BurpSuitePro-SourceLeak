/*    */ package com.install4j.api.windows;
/*    */ 
/*    */ import com.install4j.api.ProcessInfo;
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import com.install4j.runtime.installer.helper.RunningProcessChecker;
/*    */ import com.install4j.runtime.installer.platform.win32.Misc;
/*    */ import java.util.Collection;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WinProcesses
/*    */ {
/*    */   public static Info[] getRunningProcesses() {
/* 22 */     if (!Util.isWindows()) {
/* 23 */       return new Info[0];
/*    */     }
/* 25 */     Collection<ProcessInfo> processes = RunningProcessChecker.getAllRunningProcesses();
/* 26 */     Info[] infos = new Info[processes.size()];
/* 27 */     int i = 0;
/* 28 */     for (ProcessInfo processInfo : processes) {
/* 29 */       infos[i++] = (Info)processInfo;
/*    */     }
/* 31 */     return infos;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean areInstalledLaunchersRunning() {
/* 41 */     if (!InstallerUtil.isWindows()) {
/* 42 */       return false;
/*    */     }
/* 44 */     return RunningProcessChecker.areInstalledLaunchersRunning();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String getWindowTitle(int processId) {
/* 53 */     return Misc.getWindowTitle(processId);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean terminateProcesses(int[] processIds) {
/* 62 */     return (Misc.terminateProcesses(processIds, true, 0) == 1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean closeProcesses(int[] processIds, int timeout) {
/* 72 */     return (Misc.terminateProcesses(processIds, false, timeout) == 1);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static class Info
/*    */     extends ProcessInfo
/*    */   {
/*    */     public Info(int processId, String moduleName) {
/* 84 */       super(processId, moduleName);
/*    */     }
/*    */ 
/*    */     
/*    */     public String getWindowTitle() {
/* 89 */       return WinProcesses.getWindowTitle(getProcessId());
/*    */     }
/*    */ 
/*    */     
/*    */     public String toString() {
/* 94 */       return "Info{" + super.toString();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\WinProcesses.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */