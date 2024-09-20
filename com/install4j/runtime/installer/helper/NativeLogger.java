/*    */ package com.install4j.runtime.installer.helper;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.installer.config.InstallerConfig;
/*    */ 
/*    */ 
/*    */ public class NativeLogger
/*    */ {
/*    */   private static native void cleanup0();
/*    */   
/*    */   public static void cleanup() {
/* 12 */     if (Util.isWindows()) {
/*    */       try {
/* 14 */         cleanup0();
/* 15 */       } catch (Throwable t) {
/* 16 */         if (System.getProperty("exe4j.moduleName") != null) {
/* 17 */           t.printStackTrace();
/*    */         }
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   public static void registerCleanup() {
/* 24 */     if (InstallerConfig.isInstaller() && Util.isWindows())
/* 25 */       Runtime.getRuntime().addShutdownHook(new Thread("helper_log_shutdown")
/*    */           {
/*    */             public void run() {
/* 28 */               NativeLogger.cleanup();
/*    */             }
/*    */           }); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\NativeLogger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */