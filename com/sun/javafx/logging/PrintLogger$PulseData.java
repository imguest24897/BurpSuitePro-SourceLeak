/*     */ package com.sun.javafx.logging;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ final class PulseData
/*     */ {
/*     */   PulseData next;
/* 344 */   volatile int state = 0;
/*     */   long startTime;
/*     */   long interval;
/*     */   int pulseCount;
/*     */   boolean pushedRender;
/* 349 */   StringBuffer message = new StringBuffer();
/* 350 */   Map<String, PrintLogger.Counter> counters = new ConcurrentHashMap<>();
/*     */   
/*     */   void init(int paramInt) {
/* 353 */     this.state = 1;
/* 354 */     this.pulseCount = paramInt;
/* 355 */     this.startTime = System.nanoTime();
/* 356 */     this.interval = 0L;
/* 357 */     this.pushedRender = false;
/*     */   }
/*     */   
/*     */   void printAndReset() {
/* 361 */     long l1 = System.nanoTime();
/* 362 */     long l2 = (l1 - this.startTime) / 1000000L;
/*     */     
/* 364 */     if (this.state != 2) {
/* 365 */       System.err.println("\nWARNING: logging incomplete state");
/*     */     }
/*     */     
/* 368 */     if (l2 <= PrintLogger.THRESHOLD) {
/*     */       
/* 370 */       if (this.pulseCount != -1) {
/* 371 */         System.err.print(((PrintLogger.this.wrapCount++ % 10 == 0) ? "\n[" : "[") + ((PrintLogger.this.wrapCount++ % 10 == 0) ? "\n[" : "[") + " " + this.pulseCount + "ms:" + this.interval + "ms]");
/*     */       }
/*     */     } else {
/*     */       
/* 375 */       if (this.pulseCount == -1) {
/* 376 */         System.err.println("\n\nINTER PULSE LOG DATA");
/*     */       } else {
/*     */         
/* 379 */         System.err.print("\n\nPULSE: " + this.pulseCount + " [" + this.interval + "ms:" + l2 + "ms]");
/*     */         
/* 381 */         if (!this.pushedRender) {
/* 382 */           System.err.print(" Required No Rendering");
/*     */         }
/* 384 */         System.err.println();
/*     */       } 
/* 386 */       System.err.print(this.message);
/* 387 */       if (!this.counters.isEmpty()) {
/* 388 */         System.err.println("Counters:");
/* 389 */         ArrayList<?> arrayList = new ArrayList(this.counters.entrySet());
/* 390 */         Collections.sort(arrayList, (paramEntry1, paramEntry2) -> ((String)paramEntry1.getKey()).compareTo((String)paramEntry2.getKey()));
/* 391 */         for (Map.Entry entry : arrayList) {
/* 392 */           System.err.println("\t" + (String)entry.getKey() + ": " + ((PrintLogger.Counter)entry.getValue()).value);
/*     */         }
/*     */       } 
/* 395 */       PrintLogger.this.wrapCount = 0;
/*     */     } 
/*     */ 
/*     */     
/* 399 */     this.message.setLength(0);
/* 400 */     this.counters.clear();
/* 401 */     this.state = 0;
/* 402 */     if (PrintLogger.EXIT_ON_PULSE > 0 && this.pulseCount >= PrintLogger.EXIT_ON_PULSE) {
/* 403 */       System.err.println("Exiting after pulse #" + this.pulseCount);
/* 404 */       System.exit(0);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\logging\PrintLogger$PulseData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */