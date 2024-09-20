/*    */ package com.sun.javafx.property.adapter;
/*    */ 
/*    */ import java.security.PrivilegedAction;
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
/*    */ class null
/*    */   implements PrivilegedAction<Object>
/*    */ {
/*    */   public Object run() {
/* 62 */     ThreadGroup threadGroup1 = Thread.currentThread().getThreadGroup();
/* 63 */     ThreadGroup threadGroup2 = threadGroup1;
/* 64 */     while (threadGroup2 != null) {
/* 65 */       threadGroup1 = threadGroup2; threadGroup2 = threadGroup1.getParent();
/* 66 */     }  Thread thread = new Thread(threadGroup1, Disposer.disposerInstance, "Property Disposer");
/*    */     
/* 68 */     thread.setContextClassLoader(null);
/* 69 */     thread.setDaemon(true);
/* 70 */     thread.setPriority(10);
/* 71 */     thread.start();
/* 72 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\property\adapter\Disposer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */