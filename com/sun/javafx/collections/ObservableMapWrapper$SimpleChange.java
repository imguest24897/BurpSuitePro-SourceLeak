/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import javafx.collections.MapChangeListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class SimpleChange
/*     */   extends MapChangeListener.Change<K, V>
/*     */ {
/*     */   private final K key;
/*     */   private final V old;
/*     */   private final V added;
/*     */   private final boolean wasAdded;
/*     */   private final boolean wasRemoved;
/*     */   
/*     */   public SimpleChange(K paramK, V paramV1, V paramV2, boolean paramBoolean1, boolean paramBoolean2) {
/*  62 */     super(paramObservableMapWrapper);
/*  63 */     assert paramBoolean1 || paramBoolean2;
/*  64 */     this.key = paramK;
/*  65 */     this.old = paramV1;
/*  66 */     this.added = paramV2;
/*  67 */     this.wasAdded = paramBoolean1;
/*  68 */     this.wasRemoved = paramBoolean2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasAdded() {
/*  73 */     return this.wasAdded;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasRemoved() {
/*  78 */     return this.wasRemoved;
/*     */   }
/*     */ 
/*     */   
/*     */   public K getKey() {
/*  83 */     return this.key;
/*     */   }
/*     */ 
/*     */   
/*     */   public V getValueAdded() {
/*  88 */     return this.added;
/*     */   }
/*     */ 
/*     */   
/*     */   public V getValueRemoved() {
/*  93 */     return this.old;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/*  98 */     StringBuilder stringBuilder = new StringBuilder();
/*  99 */     if (this.wasAdded) {
/* 100 */       if (this.wasRemoved) {
/* 101 */         stringBuilder.append(this.old).append(" replaced by ").append(this.added);
/*     */       } else {
/* 103 */         stringBuilder.append(this.added).append(" added");
/*     */       } 
/*     */     } else {
/* 106 */       stringBuilder.append(this.old).append(" removed");
/*     */     } 
/* 108 */     stringBuilder.append(" at key ").append(this.key);
/* 109 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableMapWrapper$SimpleChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */