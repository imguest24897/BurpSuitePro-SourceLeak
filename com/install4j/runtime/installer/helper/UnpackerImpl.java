/*    */ package com.install4j.runtime.installer.helper;
/*    */ 
/*    */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*    */ import java.io.File;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.util.concurrent.Executors;
/*    */ import java.util.concurrent.ScheduledExecutorService;
/*    */ import java.util.concurrent.ScheduledFuture;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import java.util.jar.JarOutputStream;
/*    */ import java.util.jar.Pack200;
/*    */ 
/*    */ class UnpackerImpl
/*    */ {
/*    */   private static final long POLLING_INTERVAL = 100L;
/* 17 */   private static ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
/*    */   
/*    */   static boolean unpack(File tempFile, File destFile, ProgressAdapter progressAdapter) throws IOException {
/* 20 */     Pack200.Unpacker unpacker = Pack200.newUnpacker();
/* 21 */     ScheduledFuture<?> scheduledFuture = null;
/* 22 */     if (progressAdapter != null) {
/* 23 */       progressAdapter.setMaxCopyProgress(100L);
/* 24 */       scheduledFuture = executor.scheduleWithFixedDelay(() -> {
/*    */             try {
/*    */               String progressValue = (String)unpacker.properties().get("unpack.progress");
/*    */               if (progressValue != null) {
/*    */                 int progress = Integer.parseInt(progressValue);
/*    */                 progressAdapter.setPercentCompleted(progress);
/*    */                 progressAdapter.setSecondaryPercentCompleted(progress);
/*    */               } 
/* 32 */             } catch (NumberFormatException numberFormatException) {}
/*    */           }100L, 100L, TimeUnit.MILLISECONDS);
/*    */     } 
/*    */     
/*    */     try {
/* 37 */       JarOutputStream out = new JarOutputStream(new FileOutputStream(destFile));
/* 38 */       unpacker.unpack(tempFile, out);
/* 39 */       out.close();
/* 40 */       return true;
/*    */     } finally {
/* 42 */       if (scheduledFuture != null)
/* 43 */         scheduledFuture.cancel(true); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\UnpackerImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */