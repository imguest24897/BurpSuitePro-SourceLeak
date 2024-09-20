/*    */ package com.install4j.api;
/*    */ 
/*    */ import com.install4j.runtime.installer.helper.apiimpl.ServiceInfoImpl;
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
/*    */ public class ServiceInfo
/*    */ {
/*    */   public static boolean isServiceRunning(File serviceFile) {
/* 18 */     return ServiceInfoImpl.isServiceRunning(serviceFile);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean isServiceInstalled(File serviceFile) {
/* 27 */     return ServiceInfoImpl.isServiceInstalled(serviceFile);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\ServiceInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */