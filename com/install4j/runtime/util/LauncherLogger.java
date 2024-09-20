/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface LauncherLogger
/*    */ {
/*  8 */   public static final LauncherLogger STDERR_LOGGER = new LauncherLogger()
/*    */     {
/*    */       public void info(String str) {}
/*    */ 
/*    */ 
/*    */       
/*    */       public void error(String str) {
/* 15 */         System.err.println(str);
/*    */       }
/*    */ 
/*    */       
/*    */       public void error(Throwable throwable) {
/* 20 */         throwable.printStackTrace();
/*    */       }
/*    */     };
/*    */   
/*    */   void info(String paramString);
/*    */   
/*    */   void error(String paramString);
/*    */   
/*    */   void error(Throwable paramThrowable);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\LauncherLogger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */