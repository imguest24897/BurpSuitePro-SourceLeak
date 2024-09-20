/*    */ package com.sun.javafx.property.adapter;
/*    */ 
/*    */ import java.lang.ref.PhantomReference;
/*    */ import java.lang.ref.Reference;
/*    */ import java.lang.ref.ReferenceQueue;
/*    */ import java.security.AccessController;
/*    */ import java.security.PrivilegedAction;
/*    */ import java.util.Map;
/*    */ import java.util.concurrent.ConcurrentHashMap;
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
/*    */ public class Disposer
/*    */   implements Runnable
/*    */ {
/* 46 */   private static final ReferenceQueue<Object> queue = new ReferenceQueue();
/* 47 */   private static final Map<Reference<?>, Runnable> records = new ConcurrentHashMap<>();
/*    */ 
/*    */ 
/*    */   
/* 51 */   private static Disposer disposerInstance = new Disposer();
/*    */   
/*    */   static {
/* 54 */     Object object = AccessController.doPrivileged(new PrivilegedAction()
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */           
/*    */           public Object run()
/*    */           {
/* 62 */             ThreadGroup threadGroup1 = Thread.currentThread().getThreadGroup();
/* 63 */             ThreadGroup threadGroup2 = threadGroup1;
/* 64 */             while (threadGroup2 != null) {
/* 65 */               threadGroup1 = threadGroup2; threadGroup2 = threadGroup1.getParent();
/* 66 */             }  Thread thread = new Thread(threadGroup1, Disposer.disposerInstance, "Property Disposer");
/*    */             
/* 68 */             thread.setContextClassLoader(null);
/* 69 */             thread.setDaemon(true);
/* 70 */             thread.setPriority(10);
/* 71 */             thread.start();
/* 72 */             return null;
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void addRecord(Object paramObject, Runnable paramRunnable) {
/* 84 */     PhantomReference<?> phantomReference = new PhantomReference(paramObject, queue);
/* 85 */     records.put(phantomReference, paramRunnable);
/*    */   }
/*    */   
/*    */   public void run() {
/*    */     while (true) {
/*    */       try {
/*    */         while (true)
/* 92 */         { Reference<?> reference = queue.remove();
/* 93 */           reference.clear();
/* 94 */           Runnable runnable = records.remove(reference);
/* 95 */           runnable.run(); }  break;
/* 96 */       } catch (Exception exception) {
/* 97 */         System.out.println("Exception while removing reference: " + String.valueOf(exception));
/* 98 */         exception.printStackTrace();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\property\adapter\Disposer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */