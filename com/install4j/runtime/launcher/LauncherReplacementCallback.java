/*    */ package com.install4j.runtime.launcher;
/*    */ 
/*    */ import com.exe4j.runtime.util.FileUtil;
/*    */ import com.install4j.runtime.util.StringUtil;
/*    */ import java.io.File;
/*    */ 
/*    */ class LauncherReplacementCallback
/*    */   implements StringUtil.ReplacementCallback {
/*    */   private String exeBaseDir;
/*    */   private File installerTempDir;
/*    */   
/*    */   public LauncherReplacementCallback(File exeBaseDir, File installerTempDir) {
/* 13 */     this.exeBaseDir = FileUtil.getCanonicalPath(exeBaseDir) + File.separator;
/* 14 */     this.installerTempDir = installerTempDir;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getReplacement(String token, Object memento, boolean hasFallback) {
/* 19 */     if (token.equals("launcher:sys.launcherDirectory"))
/* 20 */       return this.exeBaseDir; 
/* 21 */     if (token.equals("launcher:sys.pathlistSeparator"))
/* 22 */       return ":"; 
/* 23 */     if (token.equals("launcher:sys.tempDir"))
/* 24 */       return System.getProperty("java.io.tmpdir") + File.separator; 
/* 25 */     if (token.equals("launcher:sys.launcherTempDirectory"))
/* 26 */       return ((this.installerTempDir != null) ? this.installerTempDir.getAbsolutePath() : System.getProperty("java.io.tmpdir")) + File.separator; 
/* 27 */     if (token.equals("launcher:sys.jvmHome")) {
/* 28 */       return System.getProperty("java.home") + File.separator;
/*    */     }
/* 30 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\LauncherReplacementCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */