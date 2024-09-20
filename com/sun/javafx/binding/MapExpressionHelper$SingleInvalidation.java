/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableMapValue;
/*     */ import javafx.collections.MapChangeListener;
/*     */ import javafx.collections.ObservableMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends MapExpressionHelper<K, V>
/*     */ {
/*     */   private final InvalidationListener listener;
/*     */   
/*     */   private SingleInvalidation(ObservableMapValue<K, V> paramObservableMapValue, InvalidationListener paramInvalidationListener) {
/* 128 */     super(paramObservableMapValue);
/* 129 */     this.listener = paramInvalidationListener;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> addListener(InvalidationListener paramInvalidationListener) {
/* 134 */     return new MapExpressionHelper.Generic<>(this.observable, this.listener, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> removeListener(InvalidationListener paramInvalidationListener) {
/* 139 */     return paramInvalidationListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> addListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 144 */     return new MapExpressionHelper.Generic<>(this.observable, this.listener, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> removeListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 149 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 154 */     return new MapExpressionHelper.Generic<>(this.observable, this.listener, paramMapChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 159 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 164 */     this.listener.invalidated((Observable)this.observable);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 169 */     this.listener.invalidated((Observable)this.observable);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\MapExpressionHelper$SingleInvalidation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */