/*    */ package com.install4j.runtime.installer.platform.macos;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.installer.platform.unix.Execution;
/*    */ import com.install4j.runtime.installer.platform.win32.Common;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class MacFileSystem
/*    */ {
/*    */   static {
/* 12 */     Common.init();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean setExtendedAttribute(File destFile, String name, String value, boolean hex) {
/* 20 */     if (!Util.isMacOS()) return false;
/*    */     
/*    */     try {
/*    */       String[] command;
/* 24 */       if (hex) {
/* 25 */         command = new String[] { "xattr", "-w", "-s", "-x", name, value, destFile.getAbsolutePath() };
/*    */       } else {
/* 27 */         command = new String[] { "xattr", "-w", "-s", name, value, destFile.getAbsolutePath() };
/*    */       } 
/* 29 */       return Execution.executeAndWait(command, null);
/* 30 */     } catch (IOException e) {
/* 31 */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void setDefaultHandlerForURLScheme(String scheme, String bundleId) {
/* 36 */     if (!Util.isMacOS())
/*    */       return; 
/* 38 */     setDefaultHandlerForURLScheme0(scheme, bundleId);
/*    */   }
/*    */   
/*    */   public static void notifyChange(File file) {
/* 42 */     if (!Util.isMacOS())
/*    */       return; 
/* 44 */     notifyChange0(file.getAbsolutePath());
/*    */   }
/*    */   
/*    */   public static void registerUrl(File file) {
/* 48 */     if (!Util.isMacOS())
/*    */       return; 
/* 50 */     registerUrl0(file.getAbsolutePath());
/*    */   }
/*    */   
/*    */   public static void notifyBundleChange(File appBundle) {
/* 54 */     notifyChange(appBundle);
/* 55 */     notifyChange(new File(appBundle, "Contents/Info.plist"));
/* 56 */     notifyChange(new File(appBundle, "Contents/Resources/app.icns"));
/* 57 */     registerUrl(appBundle);
/*    */   }
/*    */   
/*    */   private static native void notifyChange0(String paramString);
/*    */   
/*    */   private static native int setDefaultHandlerForURLScheme0(String paramString1, String paramString2);
/*    */   
/*    */   private static native int registerUrl0(String paramString);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\MacFileSystem.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */