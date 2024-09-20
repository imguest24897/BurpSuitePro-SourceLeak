/*   */ package com.install4j.runtime.launcher;
/*   */ 
/*   */ import com.install4j.runtime.util.StringUtil;
/*   */ import com.sun.istack.internal.Nullable;
/*   */ import java.io.File;
/*   */ 
/*   */ public interface LauncherHelper
/*   */ {
/* 9 */   public static final LauncherHelper INSTANCE = NoHelper.init();
/*   */   public static final String IMPLEMENTATION_CLASS_NAME = "com.install4j.runtime.launcher.FullLauncherHelper";
/*   */   
/*   */   void initIntegration();
/*   */   
/*   */   void setUnattended(boolean paramBoolean);
/*   */   
/*   */   String[] initVariables(Class<?> paramClass, String[] paramArrayOfString);
/*   */   
/*   */   String replaceVariables(String paramString);
/*   */   
/*   */   String replaceVariables(String paramString, StringUtil.ReplacementCallback paramReplacementCallback);
/*   */   
/*   */   void setPosixFilePermissions(File paramFile, String paramString);
/*   */   
/*   */   @Nullable
/*   */   String getUnixOwner(File paramFile);
/*   */   
/*   */   void watchDirectory(File paramFile, String paramString1, String paramString2, Runnable paramRunnable);
/*   */   
/*   */   File getInstallerFile(String paramString);
/*   */   
/*   */   void exit(int paramInt);
/*   */   
/*   */   long getPid();
/*   */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\LauncherHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */