/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.util.concurrent.ThreadFactory;
/*    */ import java.util.concurrent.atomic.AtomicInteger;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class DaemonThreadFactory
/*    */   implements ThreadFactory {
/*    */   private final String namePrefix;
/* 10 */   private final AtomicInteger threadNumber = new AtomicInteger(1);
/*    */   
/*    */   public DaemonThreadFactory(String namePrefix) {
/* 13 */     this.namePrefix = namePrefix;
/*    */   }
/*    */ 
/*    */   
/*    */   public Thread newThread(@NotNull Runnable r) {
/* 18 */     Thread thread = new Thread(r, this.namePrefix + this.threadNumber.getAndIncrement());
/* 19 */     thread.setDaemon(true);
/* 20 */     return thread;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\DaemonThreadFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */