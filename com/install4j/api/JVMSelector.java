/*    */ package com.install4j.api;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.apiimpl.JVMSelectorImpl;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JVMSelector
/*    */ {
/*    */   public static JVMLocation[] getJVMLocations() {
/* 26 */     return JVMSelectorImpl.getJVMLocations();
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
/*    */   public static JVMLocation[] getJVMLocations(String minVersion, String maxVersion, boolean jdkOnly, File[] additionalLocations) {
/* 42 */     return JVMSelectorImpl.getJVMLocations(minVersion, maxVersion, jdkOnly, additionalLocations);
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
/*    */   public static JVMLocation getJVMLocation(File javaHome, String minVersion, String maxVersion, boolean jdkOnly) {
/* 55 */     return JVMSelectorImpl.getJVMLocation(javaHome, minVersion, maxVersion, jdkOnly);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void setPreferredJVM(String javaHome) {
/* 65 */     JVMSelectorImpl.setPreferredJVM(javaHome);
/*    */   }
/*    */   
/*    */   public static interface JVMLocation {
/*    */     File getJavaHome();
/*    */     
/*    */     String getVersion();
/*    */     
/*    */     boolean isJDK();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\JVMSelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */