/*    */ package com.install4j.runtime.util;
/*    */ import java.awt.SecondaryLoop;
/*    */ import java.awt.Toolkit;
/*    */ import java.util.concurrent.Callable;
/*    */ import java.util.concurrent.ExecutionException;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.Executors;
/*    */ import java.util.concurrent.Future;
/*    */ import java.util.concurrent.ThreadFactory;
/*    */ import java.util.concurrent.ThreadPoolExecutor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class SecondaryLoopHelper {
/* 14 */   private static final ExecutorService executor = new ThreadPoolExecutor(0, 2147483647, 10000L, TimeUnit.DAYS, new SynchronousQueue<>(), new ThreadFactory() {
/* 15 */         private ThreadFactory threadFactory = Executors.defaultThreadFactory();
/*    */ 
/*    */         
/*    */         public Thread newThread(@NotNull Runnable runnable) {
/* 19 */           Thread thread = this.threadFactory.newThread(runnable);
/* 20 */           thread.setDaemon(true);
/* 21 */           return thread;
/*    */         }
/*    */       });
/*    */   
/*    */   public static <V> V executeWithSecondaryLoopChecked(Callable<V> callable) throws Exception {
/* 26 */     SecondaryLoop secondaryLoop = Toolkit.getDefaultToolkit().getSystemEventQueue().createSecondaryLoop();
/*    */     
/* 28 */     Future<V> future = executor.submit(() -> {
/*    */           try {
/*    */             return callable.call();
/*    */           } finally {
/*    */             while (!secondaryLoop.exit()) {
/*    */               Thread.sleep(200L);
/*    */             }
/*    */           } 
/*    */         });
/* 37 */     secondaryLoop.enter();
/*    */     try {
/* 39 */       return future.get();
/* 40 */     } catch (InterruptedException e) {
/* 41 */       throw new RuntimeException(e);
/* 42 */     } catch (ExecutionException e) {
/* 43 */       if (e.getCause() instanceof Error)
/* 44 */         throw (Error)e.getCause(); 
/* 45 */       if (e.getCause() instanceof Exception) {
/* 46 */         throw (Exception)e.getCause();
/*    */       }
/* 48 */       throw new RuntimeException(e.getCause());
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static <V> V executeWithSecondaryLoop(Callable<V> callable) {
/*    */     try {
/* 55 */       return executeWithSecondaryLoopChecked(callable);
/* 56 */     } catch (Exception e) {
/* 57 */       if (e instanceof RuntimeException) {
/* 58 */         throw (RuntimeException)e;
/*    */       }
/* 60 */       throw new RuntimeException(e);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\SecondaryLoopHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */