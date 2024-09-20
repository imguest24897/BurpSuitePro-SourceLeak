/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableMapValue;
/*     */ import javafx.beans.value.ObservableValue;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends MapExpressionHelper<K, V>
/*     */ {
/*     */   private final ChangeListener<? super ObservableMap<K, V>> listener;
/*     */   private ObservableMap<K, V> currentValue;
/*     */   
/*     */   private SingleChange(ObservableMapValue<K, V> paramObservableMapValue, ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 179 */     super(paramObservableMapValue);
/* 180 */     this.listener = paramChangeListener;
/* 181 */     this.currentValue = (ObservableMap<K, V>)paramObservableMapValue.getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> addListener(InvalidationListener paramInvalidationListener) {
/* 186 */     return new MapExpressionHelper.Generic<>(this.observable, paramInvalidationListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> removeListener(InvalidationListener paramInvalidationListener) {
/* 191 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> addListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 196 */     return new MapExpressionHelper.Generic<>(this.observable, this.listener, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> removeListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 201 */     return paramChangeListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 206 */     return new MapExpressionHelper.Generic<>(this.observable, this.listener, paramMapChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 211 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 216 */     ObservableMap<K, V> observableMap = this.currentValue;
/* 217 */     this.currentValue = (ObservableMap<K, V>)this.observable.getValue();
/* 218 */     if (this.currentValue != observableMap) {
/* 219 */       this.listener.changed((ObservableValue)this.observable, observableMap, this.currentValue);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 225 */     this.listener.changed((ObservableValue)this.observable, this.currentValue, this.currentValue);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\MapExpressionHelper$SingleChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */