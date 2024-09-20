/*     */ package com.sun.javafx.event;
/*     */ 
/*     */ import javafx.event.Event;
/*     */ import javafx.event.EventDispatchChain;
/*     */ import javafx.event.EventDispatcher;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EventDispatchChainImpl
/*     */   implements EventDispatchChain
/*     */ {
/*     */   private static final int CAPACITY_GROWTH_FACTOR = 8;
/*     */   private EventDispatcher[] dispatchers;
/*     */   private int[] nextLinks;
/*     */   private int reservedCount;
/*     */   private int activeCount;
/*     */   private int headIndex;
/*     */   private int tailIndex;
/*     */   
/*     */   public void reset() {
/*  50 */     for (byte b = 0; b < this.reservedCount; b++) {
/*  51 */       this.dispatchers[b] = null;
/*     */     }
/*     */     
/*  54 */     this.reservedCount = 0;
/*  55 */     this.activeCount = 0;
/*  56 */     this.headIndex = 0;
/*  57 */     this.tailIndex = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public EventDispatchChain append(EventDispatcher paramEventDispatcher) {
/*  62 */     ensureCapacity(this.reservedCount + 1);
/*     */     
/*  64 */     if (this.activeCount == 0) {
/*  65 */       insertFirst(paramEventDispatcher);
/*  66 */       return this;
/*     */     } 
/*     */     
/*  69 */     this.dispatchers[this.reservedCount] = paramEventDispatcher;
/*  70 */     this.nextLinks[this.tailIndex] = this.reservedCount;
/*  71 */     this.tailIndex = this.reservedCount;
/*     */     
/*  73 */     this.activeCount++;
/*  74 */     this.reservedCount++;
/*     */     
/*  76 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public EventDispatchChain prepend(EventDispatcher paramEventDispatcher) {
/*  81 */     ensureCapacity(this.reservedCount + 1);
/*     */     
/*  83 */     if (this.activeCount == 0) {
/*  84 */       insertFirst(paramEventDispatcher);
/*  85 */       return this;
/*     */     } 
/*     */     
/*  88 */     this.dispatchers[this.reservedCount] = paramEventDispatcher;
/*  89 */     this.nextLinks[this.reservedCount] = this.headIndex;
/*  90 */     this.headIndex = this.reservedCount;
/*     */     
/*  92 */     this.activeCount++;
/*  93 */     this.reservedCount++;
/*     */     
/*  95 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public Event dispatchEvent(Event paramEvent) {
/* 100 */     if (this.activeCount == 0) {
/* 101 */       return paramEvent;
/*     */     }
/*     */ 
/*     */     
/* 105 */     int i = this.headIndex;
/* 106 */     int j = this.tailIndex;
/* 107 */     int k = this.activeCount;
/* 108 */     int m = this.reservedCount;
/*     */     
/* 110 */     EventDispatcher eventDispatcher = this.dispatchers[this.headIndex];
/* 111 */     this.headIndex = this.nextLinks[this.headIndex];
/* 112 */     this.activeCount--;
/*     */     
/* 114 */     Event event = eventDispatcher.dispatchEvent(paramEvent, this);
/*     */ 
/*     */     
/* 117 */     this.headIndex = i;
/* 118 */     this.tailIndex = j;
/* 119 */     this.activeCount = k;
/* 120 */     this.reservedCount = m;
/*     */     
/* 122 */     return event;
/*     */   }
/*     */   
/*     */   private void insertFirst(EventDispatcher paramEventDispatcher) {
/* 126 */     this.dispatchers[this.reservedCount] = paramEventDispatcher;
/* 127 */     this.headIndex = this.reservedCount;
/* 128 */     this.tailIndex = this.reservedCount;
/*     */     
/* 130 */     this.activeCount = 1;
/* 131 */     this.reservedCount++;
/*     */   }
/*     */   
/*     */   private void ensureCapacity(int paramInt) {
/* 135 */     int i = paramInt + 8 - 1 & 0xFFFFFFF8;
/*     */     
/* 137 */     if (i == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 141 */     if (this.dispatchers == null || this.dispatchers.length < i) {
/* 142 */       EventDispatcher[] arrayOfEventDispatcher = new EventDispatcher[i];
/*     */       
/* 144 */       int[] arrayOfInt = new int[i];
/*     */       
/* 146 */       if (this.reservedCount > 0) {
/* 147 */         System.arraycopy(this.dispatchers, 0, arrayOfEventDispatcher, 0, this.reservedCount);
/*     */         
/* 149 */         System.arraycopy(this.nextLinks, 0, arrayOfInt, 0, this.reservedCount);
/*     */       } 
/*     */       
/* 152 */       this.dispatchers = arrayOfEventDispatcher;
/* 153 */       this.nextLinks = arrayOfInt;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\EventDispatchChainImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */