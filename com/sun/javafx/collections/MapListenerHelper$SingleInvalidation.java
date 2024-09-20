/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class SingleInvalidation<K, V>
/*     */   extends MapListenerHelper<K, V>
/*     */ {
/*     */   private final InvalidationListener listener;
/*     */   
/*     */   private SingleInvalidation(InvalidationListener paramInvalidationListener) {
/*  97 */     this.listener = paramInvalidationListener;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapListenerHelper<K, V> addListener(InvalidationListener paramInvalidationListener) {
/* 102 */     return new MapListenerHelper.Generic<>(this.listener, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapListenerHelper<K, V> removeListener(InvalidationListener paramInvalidationListener) {
/* 107 */     return paramInvalidationListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapListenerHelper<K, V> addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 112 */     return new MapListenerHelper.Generic<>(this.listener, paramMapChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapListenerHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 117 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/*     */     try {
/* 123 */       this.listener.invalidated((Observable)paramChange.getMap());
/* 124 */     } catch (Exception exception) {
/* 125 */       Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\MapListenerHelper$SingleInvalidation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */