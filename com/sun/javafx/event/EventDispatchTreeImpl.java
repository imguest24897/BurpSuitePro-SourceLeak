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
/*     */ 
/*     */ public final class EventDispatchTreeImpl
/*     */   implements EventDispatchTree
/*     */ {
/*     */   private static final int CAPACITY_GROWTH_FACTOR = 8;
/*     */   private static final int NULL_INDEX = -1;
/*     */   private EventDispatcher[] dispatchers;
/*     */   private int[] nextChildren;
/*     */   private int[] nextSiblings;
/*     */   private int reservedCount;
/*  48 */   private int rootIndex = -1;
/*  49 */   private int tailFirstIndex = -1;
/*  50 */   private int tailLastIndex = -1;
/*     */   
/*     */   private boolean expandTailFirstPath;
/*     */   
/*     */   public void reset() {
/*  55 */     for (byte b = 0; b < this.reservedCount; b++) {
/*  56 */       this.dispatchers[b] = null;
/*     */     }
/*     */     
/*  59 */     this.reservedCount = 0;
/*  60 */     this.rootIndex = -1;
/*  61 */     this.tailFirstIndex = -1;
/*  62 */     this.tailLastIndex = -1;
/*     */   }
/*     */ 
/*     */   
/*     */   public EventDispatchTree createTree() {
/*  67 */     return new EventDispatchTreeImpl();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EventDispatchTree mergeTree(EventDispatchTree paramEventDispatchTree) {
/*  74 */     if (this.tailFirstIndex != -1) {
/*  75 */       if (this.rootIndex != -1) {
/*  76 */         this.expandTailFirstPath = true;
/*  77 */         expandTail(this.rootIndex);
/*     */       } else {
/*  79 */         this.rootIndex = this.tailFirstIndex;
/*     */       } 
/*     */       
/*  82 */       this.tailFirstIndex = -1;
/*  83 */       this.tailLastIndex = -1;
/*     */     } 
/*     */     
/*  86 */     EventDispatchTreeImpl eventDispatchTreeImpl = (EventDispatchTreeImpl)paramEventDispatchTree;
/*     */ 
/*     */     
/*  89 */     int i = (eventDispatchTreeImpl.rootIndex != -1) ? eventDispatchTreeImpl.rootIndex : eventDispatchTreeImpl.tailFirstIndex;
/*     */     
/*  91 */     if (this.rootIndex == -1) {
/*  92 */       this.rootIndex = copyTreeLevel(eventDispatchTreeImpl, i);
/*     */     } else {
/*  94 */       mergeTreeLevel(eventDispatchTreeImpl, this.rootIndex, i);
/*     */     } 
/*     */     
/*  97 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public EventDispatchTree append(EventDispatcher paramEventDispatcher) {
/* 102 */     ensureCapacity(this.reservedCount + 1);
/*     */     
/* 104 */     this.dispatchers[this.reservedCount] = paramEventDispatcher;
/* 105 */     this.nextSiblings[this.reservedCount] = -1;
/* 106 */     this.nextChildren[this.reservedCount] = -1;
/* 107 */     if (this.tailFirstIndex == -1) {
/* 108 */       this.tailFirstIndex = this.reservedCount;
/*     */     } else {
/* 110 */       this.nextChildren[this.tailLastIndex] = this.reservedCount;
/*     */     } 
/*     */     
/* 113 */     this.tailLastIndex = this.reservedCount;
/* 114 */     this.reservedCount++;
/*     */     
/* 116 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public EventDispatchTree prepend(EventDispatcher paramEventDispatcher) {
/* 121 */     ensureCapacity(this.reservedCount + 1);
/*     */     
/* 123 */     this.dispatchers[this.reservedCount] = paramEventDispatcher;
/* 124 */     this.nextSiblings[this.reservedCount] = -1;
/* 125 */     this.nextChildren[this.reservedCount] = this.rootIndex;
/*     */     
/* 127 */     this.rootIndex = this.reservedCount;
/* 128 */     this.reservedCount++;
/*     */     
/* 130 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public Event dispatchEvent(Event paramEvent) {
/* 135 */     if (this.rootIndex == -1) {
/* 136 */       if (this.tailFirstIndex == -1) {
/* 137 */         return paramEvent;
/*     */       }
/*     */       
/* 140 */       this.rootIndex = this.tailFirstIndex;
/* 141 */       this.tailFirstIndex = -1;
/* 142 */       this.tailLastIndex = -1;
/*     */     } 
/*     */ 
/*     */     
/* 146 */     int i = this.reservedCount;
/* 147 */     int j = this.rootIndex;
/* 148 */     int k = this.tailFirstIndex;
/* 149 */     int m = this.tailLastIndex;
/*     */     
/* 151 */     Event event = null;
/* 152 */     int n = this.rootIndex;
/*     */     do {
/* 154 */       this.rootIndex = this.nextChildren[n];
/*     */       
/* 156 */       Event event1 = this.dispatchers[n].dispatchEvent(paramEvent, this);
/* 157 */       if (event1 != null)
/*     */       {
/* 159 */         event = (event != null) ? paramEvent : event1;
/*     */       }
/*     */       
/* 162 */       n = this.nextSiblings[n];
/* 163 */     } while (n != -1);
/*     */ 
/*     */     
/* 166 */     this.reservedCount = i;
/* 167 */     this.rootIndex = j;
/* 168 */     this.tailFirstIndex = k;
/* 169 */     this.tailLastIndex = m;
/*     */     
/* 171 */     return event;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 176 */     int i = (this.rootIndex != -1) ? this.rootIndex : this.tailFirstIndex;
/* 177 */     if (i == -1) {
/* 178 */       return "()";
/*     */     }
/*     */     
/* 181 */     StringBuilder stringBuilder = new StringBuilder();
/* 182 */     appendTreeLevel(stringBuilder, i);
/*     */     
/* 184 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   private void ensureCapacity(int paramInt) {
/* 188 */     int i = paramInt + 8 - 1 & 0xFFFFFFF8;
/*     */     
/* 190 */     if (i == 0) {
/*     */       return;
/*     */     }
/*     */     
/* 194 */     if (this.dispatchers == null || this.dispatchers.length < i) {
/* 195 */       EventDispatcher[] arrayOfEventDispatcher = new EventDispatcher[i];
/*     */       
/* 197 */       int[] arrayOfInt1 = new int[i];
/* 198 */       int[] arrayOfInt2 = new int[i];
/*     */       
/* 200 */       if (this.reservedCount > 0) {
/* 201 */         System.arraycopy(this.dispatchers, 0, arrayOfEventDispatcher, 0, this.reservedCount);
/*     */         
/* 203 */         System.arraycopy(this.nextChildren, 0, arrayOfInt1, 0, this.reservedCount);
/*     */         
/* 205 */         System.arraycopy(this.nextSiblings, 0, arrayOfInt2, 0, this.reservedCount);
/*     */       } 
/*     */ 
/*     */       
/* 209 */       this.dispatchers = arrayOfEventDispatcher;
/* 210 */       this.nextChildren = arrayOfInt1;
/* 211 */       this.nextSiblings = arrayOfInt2;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void expandTail(int paramInt) {
/* 216 */     int i = paramInt;
/* 217 */     while (i != -1) {
/* 218 */       if (this.nextChildren[i] != -1) {
/* 219 */         expandTail(this.nextChildren[i]);
/*     */       }
/* 221 */       else if (this.expandTailFirstPath) {
/* 222 */         this.nextChildren[i] = this.tailFirstIndex;
/* 223 */         this.expandTailFirstPath = false;
/*     */       } else {
/*     */         
/* 226 */         int j = copyTreeLevel(this, this.tailFirstIndex);
/* 227 */         this.nextChildren[i] = j;
/*     */       } 
/*     */ 
/*     */       
/* 231 */       i = this.nextSiblings[i];
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void mergeTreeLevel(EventDispatchTreeImpl paramEventDispatchTreeImpl, int paramInt1, int paramInt2) {
/* 238 */     int i = paramInt2;
/* 239 */     while (i != -1) {
/* 240 */       EventDispatcher eventDispatcher = paramEventDispatchTreeImpl.dispatchers[i];
/* 241 */       int j = paramInt1;
/* 242 */       int k = paramInt1;
/*     */       
/* 244 */       while (j != -1 && eventDispatcher != this.dispatchers[j]) {
/*     */         
/* 246 */         k = j;
/* 247 */         j = this.nextSiblings[j];
/*     */       } 
/*     */       
/* 250 */       if (j == -1) {
/* 251 */         int m = copySubtree(paramEventDispatchTreeImpl, i);
/* 252 */         this.nextSiblings[k] = m;
/* 253 */         this.nextSiblings[m] = -1;
/*     */       } else {
/* 255 */         int m = this.nextChildren[j];
/* 256 */         int n = getChildIndex(paramEventDispatchTreeImpl, i);
/* 257 */         if (m != -1) {
/* 258 */           mergeTreeLevel(paramEventDispatchTreeImpl, m, n);
/*     */         }
/*     */         else {
/*     */           
/* 262 */           m = copyTreeLevel(paramEventDispatchTreeImpl, n);
/*     */           
/* 264 */           this.nextChildren[j] = m;
/*     */         } 
/*     */       } 
/*     */       
/* 268 */       i = paramEventDispatchTreeImpl.nextSiblings[i];
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private int copyTreeLevel(EventDispatchTreeImpl paramEventDispatchTreeImpl, int paramInt) {
/* 274 */     if (paramInt == -1) {
/* 275 */       return -1;
/*     */     }
/*     */     
/* 278 */     int i = paramInt;
/* 279 */     int j = copySubtree(paramEventDispatchTreeImpl, i);
/* 280 */     int k = j;
/*     */     
/* 282 */     i = paramEventDispatchTreeImpl.nextSiblings[i];
/* 283 */     while (i != -1) {
/* 284 */       int m = copySubtree(paramEventDispatchTreeImpl, i);
/* 285 */       this.nextSiblings[k] = m;
/*     */       
/* 287 */       k = m;
/* 288 */       i = paramEventDispatchTreeImpl.nextSiblings[i];
/*     */     } 
/*     */     
/* 291 */     this.nextSiblings[k] = -1;
/* 292 */     return j;
/*     */   }
/*     */ 
/*     */   
/*     */   private int copySubtree(EventDispatchTreeImpl paramEventDispatchTreeImpl, int paramInt) {
/* 297 */     ensureCapacity(this.reservedCount + 1);
/* 298 */     int i = this.reservedCount++;
/*     */ 
/*     */     
/* 301 */     int j = copyTreeLevel(paramEventDispatchTreeImpl, getChildIndex(paramEventDispatchTreeImpl, paramInt));
/* 302 */     this.dispatchers[i] = paramEventDispatchTreeImpl.dispatchers[paramInt];
/* 303 */     this.nextChildren[i] = j;
/*     */     
/* 305 */     return i;
/*     */   }
/*     */ 
/*     */   
/*     */   private void appendTreeLevel(StringBuilder paramStringBuilder, int paramInt) {
/* 310 */     paramStringBuilder.append('(');
/*     */     
/* 312 */     int i = paramInt;
/* 313 */     appendSubtree(paramStringBuilder, i);
/*     */     
/* 315 */     i = this.nextSiblings[i];
/* 316 */     while (i != -1) {
/* 317 */       paramStringBuilder.append(",");
/* 318 */       appendSubtree(paramStringBuilder, i);
/* 319 */       i = this.nextSiblings[i];
/*     */     } 
/*     */     
/* 322 */     paramStringBuilder.append(')');
/*     */   }
/*     */ 
/*     */   
/*     */   private void appendSubtree(StringBuilder paramStringBuilder, int paramInt) {
/* 327 */     paramStringBuilder.append(this.dispatchers[paramInt]);
/*     */     
/* 329 */     int i = getChildIndex(this, paramInt);
/* 330 */     if (i != -1) {
/* 331 */       paramStringBuilder.append("->");
/* 332 */       appendTreeLevel(paramStringBuilder, i);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static int getChildIndex(EventDispatchTreeImpl paramEventDispatchTreeImpl, int paramInt) {
/* 338 */     int i = paramEventDispatchTreeImpl.nextChildren[paramInt];
/* 339 */     if (i == -1 && paramInt != paramEventDispatchTreeImpl.tailLastIndex)
/*     */     {
/* 341 */       i = paramEventDispatchTreeImpl.tailFirstIndex;
/*     */     }
/*     */     
/* 344 */     return i;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\EventDispatchTreeImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */