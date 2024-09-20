/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.util.Map;
/*     */ import javafx.beans.InvalidationListener;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class SingleMapChange<K, V>
/*     */   extends MapExpressionHelper<K, V>
/*     */ {
/*     */   private final MapChangeListener<? super K, ? super V> listener;
/*     */   private ObservableMap<K, V> currentValue;
/*     */   
/*     */   private SingleMapChange(ObservableMapValue<K, V> paramObservableMapValue, MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 235 */     super(paramObservableMapValue);
/* 236 */     this.listener = paramMapChangeListener;
/* 237 */     this.currentValue = (ObservableMap<K, V>)paramObservableMapValue.getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> addListener(InvalidationListener paramInvalidationListener) {
/* 242 */     return new MapExpressionHelper.Generic<>(this.observable, paramInvalidationListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> removeListener(InvalidationListener paramInvalidationListener) {
/* 247 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> addListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 252 */     return new MapExpressionHelper.Generic<>(this.observable, paramChangeListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> removeListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 257 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 262 */     return new MapExpressionHelper.Generic<>(this.observable, this.listener, paramMapChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected MapExpressionHelper<K, V> removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 267 */     return paramMapChangeListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 272 */     ObservableMap<K, V> observableMap = this.currentValue;
/* 273 */     this.currentValue = (ObservableMap<K, V>)this.observable.getValue();
/* 274 */     if (this.currentValue != observableMap) {
/* 275 */       MapExpressionHelper.SimpleChange<K, V> simpleChange = new MapExpressionHelper.SimpleChange<>((ObservableMap<K, V>)this.observable);
/* 276 */       if (this.currentValue == null) {
/* 277 */         for (Map.Entry entry : observableMap.entrySet()) {
/* 278 */           this.listener.onChanged(simpleChange.setRemoved((K)entry.getKey(), (V)entry.getValue()));
/*     */         }
/* 280 */       } else if (observableMap == null) {
/* 281 */         for (Map.Entry entry : this.currentValue.entrySet()) {
/* 282 */           this.listener.onChanged(simpleChange.setAdded((K)entry.getKey(), (V)entry.getValue()));
/*     */         }
/*     */       } else {
/* 285 */         for (Map.Entry entry : observableMap.entrySet()) {
/* 286 */           Object object1 = entry.getKey();
/* 287 */           Object object2 = entry.getValue();
/* 288 */           if (this.currentValue.containsKey(object1)) {
/* 289 */             Object object = this.currentValue.get(object1);
/* 290 */             if ((object2 == null) ? (object != null) : !object.equals(object2))
/* 291 */               this.listener.onChanged(simpleChange.setPut((K)object1, (V)object2, (V)object)); 
/*     */             continue;
/*     */           } 
/* 294 */           this.listener.onChanged(simpleChange.setRemoved((K)object1, (V)object2));
/*     */         } 
/*     */         
/* 297 */         for (Map.Entry entry : this.currentValue.entrySet()) {
/* 298 */           Object object = entry.getKey();
/* 299 */           if (!observableMap.containsKey(object)) {
/* 300 */             this.listener.onChanged(simpleChange.setAdded((K)object, (V)entry.getValue()));
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 309 */     this.listener.onChanged(new MapExpressionHelper.SimpleChange<>((ObservableMap<K, V>)this.observable, paramChange));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\MapExpressionHelper$SingleMapChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */