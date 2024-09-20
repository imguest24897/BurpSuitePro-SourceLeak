/*    */ package com.install4j.runtime.installer.platform.win32;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class ShellLink
/*    */ {
/*    */   public static final int SW_SHOWNORMAL = 1;
/*    */   public static final int SW_SHOWMAXIMIZED = 3;
/*    */   public static final int SW_SHOWMINNOACTIVE = 7;
/*    */   
/*    */   static {
/* 14 */     Common.init();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static boolean init = false;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static synchronized void initialize() {
/* 26 */     if (InstallerUtil.isWindows() && !init) {
/* 27 */       init = true;
/* 28 */       initialize0();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static boolean create(File file, File shortcutTo, File iconFile, String arguments, boolean runAsAdministrator, String description, File workingDirectory, int showCmd) {
/* 34 */     initialize();
/*    */     try {
/* 36 */       String destPath = shortcutTo.getCanonicalPath();
/* 37 */       if (shortcutTo.isDirectory() && !destPath.endsWith("\\")) {
/* 38 */         destPath = destPath + "\\";
/*    */       }
/* 40 */       if (iconFile == null && !shortcutTo.isDirectory() && destPath.endsWith(".exe")) {
/* 41 */         iconFile = shortcutTo;
/*    */       }
/* 43 */       if (workingDirectory == null) {
/* 44 */         workingDirectory = shortcutTo.isDirectory() ? shortcutTo : shortcutTo.getParentFile();
/*    */       }
/* 46 */       workingDirectory = workingDirectory.getCanonicalFile();
/*    */       
/* 48 */       boolean ret = createWide0(file.getAbsolutePath(), destPath, workingDirectory
/* 49 */           .getAbsolutePath(), 
/* 50 */           (iconFile == null) ? null : iconFile.getAbsolutePath(), arguments, runAsAdministrator, description, showCmd);
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 55 */       if (ret) {
/* 56 */         changeNotify(file);
/*    */       }
/* 58 */       return ret;
/* 59 */     } catch (IOException e) {
/* 60 */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void changeNotify(File file) {
/* 65 */     changeNotify0(Common.getAnsiCString(file), Common.getAnsiCString(file.getParentFile()));
/*    */   }
/*    */   
/*    */   private static native boolean createWide0(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, String paramString6, int paramInt);
/*    */   
/*    */   private static native boolean changeNotify0(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2);
/*    */   
/*    */   private static native boolean initialize0();
/*    */   
/*    */   public static native boolean uninitialize();
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\ShellLink.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */