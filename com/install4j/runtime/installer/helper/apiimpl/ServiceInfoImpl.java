/*    */ package com.install4j.runtime.installer.helper.apiimpl;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.installer.platform.unix.Execution;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ServiceInfoImpl
/*    */ {
/*    */   public static boolean isServiceRunning(File serviceFile) {
/* 13 */     if (!serviceFile.exists()) {
/* 14 */       return false;
/*    */     }
/*    */     
/* 17 */     StringBuffer output = new StringBuffer();
/*    */     try {
/* 19 */       int returnCode = Execution.executeWithReturnCode(new String[] { serviceFile.getAbsolutePath(), (
/* 20 */             Util.isWindows() ? "/" : "") + "status" }, output, false);
/* 21 */       return (returnCode == 0);
/* 22 */     } catch (IOException e) {
/* 23 */       return false;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static boolean isServiceInstalled(File serviceFile) {
/* 28 */     if (!serviceFile.exists()) {
/* 29 */       return false;
/*    */     }
/*    */     
/* 32 */     StringBuffer output = new StringBuffer();
/*    */     try {
/* 34 */       int returnCode = Execution.executeWithReturnCode(new String[] { serviceFile.getAbsolutePath(), (
/* 35 */             Util.isWindows() ? "/" : "") + "status" }, output, false);
/* 36 */       return (returnCode == 0 || returnCode == 3);
/* 37 */     } catch (IOException e) {
/* 38 */       return false;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\apiimpl\ServiceInfoImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */