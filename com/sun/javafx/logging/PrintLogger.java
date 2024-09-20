/*     */ package com.sun.javafx.logging;
/*     */ 
/*     */ import java.security.AccessController;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Map;
/*     */ import java.util.concurrent.ConcurrentHashMap;
/*     */ import java.util.concurrent.atomic.AtomicInteger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class PrintLogger
/*     */   extends Logger
/*     */ {
/*  58 */   private static long THRESHOLD = ((Integer)AccessController.<Integer>doPrivileged(() -> Integer.getInteger("javafx.pulseLogger.threshold", 17))).intValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  65 */   private static final int EXIT_ON_PULSE = ((Integer)AccessController.<Integer>doPrivileged(() -> Integer.getInteger("javafx.pulseLogger.exitOnPulse", 0))).intValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  71 */   private int pulseCount = 1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final int INTER_PULSE_DATA = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  87 */   private volatile int wrapCount = 0;
/*     */   
/*     */   private volatile PulseData fxData;
/*     */   
/*     */   private volatile PulseData renderData;
/*     */   
/*     */   private long lastPulseStartTime;
/*     */   
/*     */   private Thread fxThread;
/*     */ 
/*     */   
/*     */   class ThreadLocalData
/*     */   {
/*     */     String phaseName;
/*     */     
/*     */     long phaseStart;
/*     */   }
/*     */ 
/*     */   
/* 106 */   private final ThreadLocal<ThreadLocalData> phaseData = new ThreadLocal<ThreadLocalData>()
/*     */     {
/*     */       public PrintLogger.ThreadLocalData initialValue()
/*     */       {
/* 110 */         return new PrintLogger.ThreadLocalData();
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private PulseData head;
/*     */ 
/*     */ 
/*     */   
/*     */   private PulseData tail;
/*     */ 
/*     */ 
/*     */   
/*     */   private AtomicInteger active;
/*     */ 
/*     */ 
/*     */   
/*     */   private static final int AVAILABLE = 0;
/*     */ 
/*     */   
/*     */   private static final int INCOMPLETE = 1;
/*     */ 
/*     */   
/*     */   private static final int COMPLETE = 2;
/*     */ 
/*     */ 
/*     */   
/*     */   private PrintLogger() {
/* 140 */     this.head = new PulseData();
/* 141 */     this.tail = new PulseData();
/* 142 */     this.head.next = this.tail;
/* 143 */     this.active = new AtomicInteger(0);
/*     */   }
/*     */   
/*     */   public static Logger createInstance() {
/* 147 */     boolean bool = PulseLogger.isPulseLoggingRequested();
/* 148 */     if (bool) {
/* 149 */       return new PrintLogger();
/*     */     }
/* 151 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private PulseData allocate(int paramInt) {
/*     */     PulseData pulseData;
/* 159 */     if (this.head != this.tail && this.head.state == 0) {
/* 160 */       pulseData = this.head;
/* 161 */       this.head = this.head.next;
/* 162 */       pulseData.next = null;
/*     */     } else {
/*     */       
/* 165 */       pulseData = new PulseData();
/*     */     } 
/* 167 */     this.tail.next = pulseData;
/* 168 */     this.tail = pulseData;
/* 169 */     pulseData.init(paramInt);
/* 170 */     return pulseData;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void pulseStart() {
/* 180 */     if (this.fxThread == null) {
/* 181 */       this.fxThread = Thread.currentThread();
/*     */     }
/* 183 */     if (this.fxData != null) {
/*     */       
/* 185 */       this.fxData.state = 2;
/* 186 */       if (this.active.incrementAndGet() == 1) {
/* 187 */         this.fxData.printAndReset();
/* 188 */         this.active.decrementAndGet();
/*     */       } 
/*     */     } 
/* 191 */     this.fxData = allocate(this.pulseCount++);
/* 192 */     if (this.lastPulseStartTime > 0L) {
/* 193 */       this.fxData.interval = (this.fxData.startTime - this.lastPulseStartTime) / 1000000L;
/*     */     }
/* 195 */     this.lastPulseStartTime = this.fxData.startTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderStart() {
/* 209 */     newPhase(null);
/* 210 */     this.fxData.pushedRender = true;
/* 211 */     this.renderData = this.fxData;
/* 212 */     this.active.incrementAndGet();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void pulseEnd() {
/* 224 */     if (this.fxData != null && !this.fxData.pushedRender) {
/* 225 */       this.fxData.state = 2;
/* 226 */       if (this.active.incrementAndGet() == 1) {
/* 227 */         this.fxData.printAndReset();
/* 228 */         this.active.decrementAndGet();
/*     */       } 
/*     */     } 
/* 231 */     this.fxData = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void renderEnd() {
/* 241 */     newPhase(null);
/* 242 */     this.renderData.state = 2;
/*     */     while (true) {
/* 244 */       this.renderData.printAndReset();
/* 245 */       if (this.active.decrementAndGet() == 0) {
/*     */         break;
/*     */       }
/* 248 */       this.renderData = this.renderData.next;
/*     */     } 
/* 250 */     this.renderData = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addMessage(String paramString) {
/*     */     PulseData pulseData;
/* 260 */     if (this.fxThread == null || Thread.currentThread() == this.fxThread) {
/* 261 */       if (this.fxData == null) {
/* 262 */         this.fxData = allocate(-1);
/*     */       }
/* 264 */       pulseData = this.fxData;
/*     */     } else {
/*     */       
/* 267 */       pulseData = this.renderData;
/*     */     } 
/* 269 */     if (pulseData == null) {
/*     */       return;
/*     */     }
/* 272 */     pulseData.message
/* 273 */       .append("T")
/* 274 */       .append(Thread.currentThread().getId())
/* 275 */       .append(" : ")
/* 276 */       .append(paramString)
/* 277 */       .append("\n");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void incrementCounter(String paramString) {
/*     */     PulseData pulseData;
/* 287 */     if (this.fxThread == null || Thread.currentThread() == this.fxThread) {
/* 288 */       if (this.fxData == null) {
/* 289 */         this.fxData = allocate(-1);
/*     */       }
/* 291 */       pulseData = this.fxData;
/*     */     } else {
/*     */       
/* 294 */       pulseData = this.renderData;
/*     */     } 
/* 296 */     if (pulseData == null) {
/*     */       return;
/*     */     }
/* 299 */     Map<String, Counter> map = pulseData.counters;
/* 300 */     Counter counter = map.get(paramString);
/* 301 */     if (counter == null) {
/* 302 */       counter = new Counter();
/* 303 */       map.put(paramString, counter);
/*     */     } 
/* 305 */     counter.value++;
/*     */   }
/*     */ 
/*     */   
/*     */   public void newPhase(String paramString) {
/* 310 */     long l = System.nanoTime();
/*     */     
/* 312 */     ThreadLocalData threadLocalData = this.phaseData.get();
/* 313 */     if (threadLocalData.phaseName != null) {
/* 314 */       PulseData pulseData = (Thread.currentThread() == this.fxThread) ? this.fxData : this.renderData;
/* 315 */       if (pulseData != null) {
/* 316 */         pulseData.message
/* 317 */           .append("T")
/* 318 */           .append(Thread.currentThread().getId())
/* 319 */           .append(" (").append((threadLocalData.phaseStart - pulseData.startTime) / 1000000L)
/* 320 */           .append(" +").append((l - threadLocalData.phaseStart) / 1000000L).append("ms): ")
/* 321 */           .append(threadLocalData.phaseName)
/* 322 */           .append("\n");
/*     */       }
/*     */     } 
/* 325 */     threadLocalData.phaseName = paramString;
/* 326 */     threadLocalData.phaseStart = l;
/*     */   }
/*     */   
/*     */   private static class Counter {
/*     */     int value;
/*     */   }
/*     */   
/*     */   private final class PulseData {
/*     */     PulseData next;
/*     */     volatile int state;
/*     */     long startTime;
/*     */     long interval;
/*     */     int pulseCount;
/*     */     boolean pushedRender;
/*     */     StringBuffer message;
/*     */     Map<String, PrintLogger.Counter> counters;
/*     */     
/*     */     private PulseData() {
/* 344 */       this.state = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 349 */       this.message = new StringBuffer();
/* 350 */       this.counters = new ConcurrentHashMap<>();
/*     */     }
/*     */     void init(int param1Int) {
/* 353 */       this.state = 1;
/* 354 */       this.pulseCount = param1Int;
/* 355 */       this.startTime = System.nanoTime();
/* 356 */       this.interval = 0L;
/* 357 */       this.pushedRender = false;
/*     */     }
/*     */     
/*     */     void printAndReset() {
/* 361 */       long l1 = System.nanoTime();
/* 362 */       long l2 = (l1 - this.startTime) / 1000000L;
/*     */       
/* 364 */       if (this.state != 2) {
/* 365 */         System.err.println("\nWARNING: logging incomplete state");
/*     */       }
/*     */       
/* 368 */       if (l2 <= PrintLogger.THRESHOLD) {
/*     */         
/* 370 */         if (this.pulseCount != -1) {
/* 371 */           System.err.print(((PrintLogger.this.wrapCount++ % 10 == 0) ? "\n[" : "[") + ((PrintLogger.this.wrapCount++ % 10 == 0) ? "\n[" : "[") + " " + this.pulseCount + "ms:" + this.interval + "ms]");
/*     */         }
/*     */       } else {
/*     */         
/* 375 */         if (this.pulseCount == -1) {
/* 376 */           System.err.println("\n\nINTER PULSE LOG DATA");
/*     */         } else {
/*     */           
/* 379 */           System.err.print("\n\nPULSE: " + this.pulseCount + " [" + this.interval + "ms:" + l2 + "ms]");
/*     */           
/* 381 */           if (!this.pushedRender) {
/* 382 */             System.err.print(" Required No Rendering");
/*     */           }
/* 384 */           System.err.println();
/*     */         } 
/* 386 */         System.err.print(this.message);
/* 387 */         if (!this.counters.isEmpty()) {
/* 388 */           System.err.println("Counters:");
/* 389 */           ArrayList<?> arrayList = new ArrayList(this.counters.entrySet());
/* 390 */           Collections.sort(arrayList, (param1Entry1, param1Entry2) -> ((String)param1Entry1.getKey()).compareTo((String)param1Entry2.getKey()));
/* 391 */           for (Map.Entry entry : arrayList) {
/* 392 */             System.err.println("\t" + (String)entry.getKey() + ": " + ((PrintLogger.Counter)entry.getValue()).value);
/*     */           }
/*     */         } 
/* 395 */         PrintLogger.this.wrapCount = 0;
/*     */       } 
/*     */ 
/*     */       
/* 399 */       this.message.setLength(0);
/* 400 */       this.counters.clear();
/* 401 */       this.state = 0;
/* 402 */       if (PrintLogger.EXIT_ON_PULSE > 0 && this.pulseCount >= PrintLogger.EXIT_ON_PULSE) {
/* 403 */         System.err.println("Exiting after pulse #" + this.pulseCount);
/* 404 */         System.exit(0);
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\logging\PrintLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */