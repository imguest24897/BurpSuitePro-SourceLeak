/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class SingleChange<K, V>
/*     */   extends MapListenerHelper<K, V>
/*     */ {
/*     */   private final MapChangeListener<? super K, ? super V> listener;
/*     */   
/*     */   private SingleChange(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 135 */     this.listener = paramMapChangeListener;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapListenerHelper<K, V> addListener(InvalidationListener paramInvalidationListener) {
/* 140 */     return new MapListenerHelper.Generic<>(paramInvalidationListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapListenerHelper<K, V> removeListener(InvalidationListener paramInvalidationListener) {
/* 145 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapListenerHelper<K, V> addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 150 */     return new MapListenerHelper.Generic<>(this.listener, paramMapChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapListenerHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 155 */     return paramMapChangeListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/*     */     try {
/* 161 */       this.listener.onChanged(paramChange);
/* 162 */     } catch (Exception exception) {
/* 163 */       Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\MapListenerHelper$SingleChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */