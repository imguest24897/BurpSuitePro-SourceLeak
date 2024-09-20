/*    */ package com.install4j.api;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.apiimpl.ApplicationRegistryImpl;
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
/*    */ public class ApplicationRegistry
/*    */ {
/*    */   public static boolean checkApplicationId(File dir) {
/* 20 */     return ApplicationRegistryImpl.checkApplicationId(dir);
/*    */   }
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
/*    */   public static boolean isUpdateDirectory(File dir) {
/* 37 */     return ApplicationRegistryImpl.isUpdateDirectory(dir);
/*    */   }
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
/*    */   public static ApplicationInfo[] getApplicationInfoById(String id) {
/* 50 */     return ApplicationRegistryImpl.getApplicationInfoById(id);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ApplicationInfo getApplicationInfoByDir(File dir) {
/* 61 */     return (ApplicationInfo)ApplicationRegistryImpl.getApplicationInfoByDir(dir);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ApplicationInfo[] getAddOnApplicationInfoByDir(File dir) {
/* 72 */     return ApplicationRegistryImpl.getAddOnApplicationInfoByDir(dir);
/*    */   }
/*    */   
/*    */   public static interface ApplicationInfo {
/*    */     File getInstallationDirectory();
/*    */     
/*    */     String getId();
/*    */     
/*    */     String getName();
/*    */     
/*    */     String getVersion();
/*    */     
/*    */     String getMediaSetId();
/*    */     
/*    */     String getCompilerVariable(String param1String);
/*    */     
/*    */     Object getInstallerVariable(String param1String);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\ApplicationRegistry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */