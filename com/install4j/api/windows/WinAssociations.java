/*    */ package com.install4j.api.windows;
/*    */ 
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.platform.win32.FileAssociations;
/*    */ import java.io.File;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WinAssociations
/*    */ {
/*    */   public static void create(String extension, String description, File iconFile, File executable) {
/*    */     try {
/* 24 */       FileAssociations.create(extension, description, iconFile, executable, null);
/* 25 */     } catch (UserCanceledException userCanceledException) {}
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean exists(String extension) {
/* 35 */     return (FileAssociations.exists(extension, RegistryRoot.HKEY_CURRENT_USER) || FileAssociations.exists(extension, RegistryRoot.HKEY_CLASSES_ROOT));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String getExecutable(String extension) {
/* 44 */     String executable = FileAssociations.getExecutable(extension, RegistryRoot.HKEY_CURRENT_USER);
/* 45 */     if (executable != null) {
/* 46 */       return executable;
/*    */     }
/* 48 */     return FileAssociations.getExecutable(extension, RegistryRoot.HKEY_CLASSES_ROOT);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void remove(String extension) {
/*    */     try {
/* 59 */       FileAssociations.remove(extension, RegistryRoot.HKEY_CURRENT_USER, true);
/* 60 */       FileAssociations.remove(extension, RegistryRoot.HKEY_CLASSES_ROOT, true);
/* 61 */     } catch (UserCanceledException e) {
/* 62 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\WinAssociations.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */