/*    */ package com.install4j.runtime.launcher;
/*    */ 
/*    */ import com.exe4j.runtime.util.ResourceHelper;
/*    */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*    */ import com.install4j.runtime.util.StringUtil;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ class NoHelper
/*    */   implements LauncherHelper
/*    */ {
/*    */   static LauncherHelper init() {
/* 13 */     String javaVersion = System.getProperty("java.version", "");
/* 14 */     if (!javaVersion.startsWith("1.6") && !javaVersion.startsWith("1.7")) {
/*    */       try {
/* 16 */         return (LauncherHelper)Class.forName("com.install4j.runtime.launcher.FullLauncherHelper").newInstance();
/* 17 */       } catch (Throwable e) {
/* 18 */         System.err.println("could not init LaunchHelper implementation: " + e);
/*    */       } 
/*    */     }
/* 21 */     return new NoHelper();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void initIntegration() {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void setUnattended(boolean value) {}
/*    */ 
/*    */   
/*    */   public String[] initVariables(Class<?> mainClass, String[] args) {
/* 34 */     return args;
/*    */   }
/*    */ 
/*    */   
/*    */   public String replaceVariables(String value) {
/* 39 */     return value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String replaceVariables(String value, StringUtil.ReplacementCallback replacementCallback) {
/* 44 */     return StringUtil.replaceVariable(value, replacementCallback);
/*    */   }
/*    */   
/*    */   private static String quoteDollarSign(String s) {
/* 48 */     return s.replaceAll("\\$", "\\\\\\$");
/*    */   }
/*    */ 
/*    */   
/*    */   public void setPosixFilePermissions(File file, String permissions) {
/* 53 */     if (!LauncherUtil.isWindows()) {
/*    */       try {
/* 55 */         String filePath = quoteDollarSign(file.getAbsolutePath());
/* 56 */         (new ProcessBuilder(new String[] { "chmod", permissions, filePath })).start().waitFor();
/* 57 */       } catch (InterruptedException e) {
/* 58 */         e.printStackTrace();
/* 59 */       } catch (IOException e) {
/* 60 */         e.printStackTrace();
/*    */       } 
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   public String getUnixOwner(File file) {
/* 67 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void watchDirectory(File directory, String dirMode, String threadName, Runnable runnable) {}
/*    */ 
/*    */   
/*    */   public File getInstallerFile(String fileName) {
/* 76 */     File file = new File(ResourceHelper.getRuntimeDir(), fileName);
/* 77 */     if (file.exists() || !LauncherUtil.isMacOS()) {
/* 78 */       return file;
/*    */     }
/* 80 */     return (new File(fileName)).getAbsoluteFile();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void exit(int exitCode) {
/* 86 */     System.exit(exitCode);
/*    */   }
/*    */ 
/*    */   
/*    */   public long getPid() {
/* 91 */     return LauncherUtil.getPidFromMBean();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\NoHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */