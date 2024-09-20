/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.WeakListener;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class MapContentBinding<K, V>
/*     */   implements MapChangeListener<K, V>, WeakListener
/*     */ {
/*     */   private final WeakReference<ObservableMap<K, V>> propertyRef1;
/*     */   private final WeakReference<ObservableMap<K, V>> propertyRef2;
/*     */   private boolean updating = false;
/*     */   
/*     */   public MapContentBinding(ObservableMap<K, V> paramObservableMap1, ObservableMap<K, V> paramObservableMap2) {
/* 284 */     this.propertyRef1 = new WeakReference<>(paramObservableMap1);
/* 285 */     this.propertyRef2 = new WeakReference<>(paramObservableMap2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onChanged(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 290 */     if (!this.updating) {
/* 291 */       ObservableMap observableMap1 = this.propertyRef1.get();
/* 292 */       ObservableMap observableMap2 = this.propertyRef2.get();
/* 293 */       if (observableMap1 == null || observableMap2 == null) {
/* 294 */         if (observableMap1 != null) {
/* 295 */           observableMap1.removeListener(this);
/*     */         }
/* 297 */         if (observableMap2 != null) {
/* 298 */           observableMap2.removeListener(this);
/*     */         }
/*     */       } else {
/*     */         try {
/* 302 */           this.updating = true;
/* 303 */           ObservableMap<Object, Object> observableMap = (observableMap1 == paramChange.getMap()) ? observableMap2 : observableMap1;
/* 304 */           if (paramChange.wasRemoved()) {
/* 305 */             observableMap.remove(paramChange.getKey());
/*     */           }
/* 307 */           if (paramChange.wasAdded()) {
/* 308 */             observableMap.put(paramChange.getKey(), paramChange.getValueAdded());
/*     */           }
/*     */         } finally {
/* 311 */           this.updating = false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasGarbageCollected() {
/* 319 */     return (this.propertyRef1.get() == null || this.propertyRef2.get() == null);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 324 */     ObservableMap observableMap1 = this.propertyRef1.get();
/* 325 */     ObservableMap observableMap2 = this.propertyRef2.get();
/* 326 */     byte b1 = (observableMap1 == null) ? 0 : observableMap1.hashCode();
/* 327 */     byte b2 = (observableMap2 == null) ? 0 : observableMap2.hashCode();
/* 328 */     return b1 * b2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 333 */     if (this == paramObject) {
/* 334 */       return true;
/*     */     }
/*     */     
/* 337 */     Object object1 = this.propertyRef1.get();
/* 338 */     Object object2 = this.propertyRef2.get();
/* 339 */     if (object1 == null || object2 == null) {
/* 340 */       return false;
/*     */     }
/*     */     
/* 343 */     if (paramObject instanceof MapContentBinding) { MapContentBinding mapContentBinding = (MapContentBinding)paramObject;
/* 344 */       Object object3 = mapContentBinding.propertyRef1.get();
/* 345 */       Object object4 = mapContentBinding.propertyRef2.get();
/* 346 */       if (object3 == null || object4 == null) {
/* 347 */         return false;
/*     */       }
/*     */       
/* 350 */       if (object1 == object3 && object2 == object4) {
/* 351 */         return true;
/*     */       }
/* 353 */       if (object1 == object4 && object2 == object3) {
/* 354 */         return true;
/*     */       } }
/*     */     
/* 357 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\BidirectionalContentBinding$MapContentBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */