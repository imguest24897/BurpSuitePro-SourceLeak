/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class ObservableValues
/*     */   implements Collection<V>
/*     */ {
/*     */   public int size() {
/* 388 */     return ObservableMapWrapper.this.backingMap.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 393 */     return ObservableMapWrapper.this.backingMap.isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean contains(Object paramObject) {
/* 398 */     return ObservableMapWrapper.this.backingMap.values().contains(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<V> iterator() {
/* 403 */     return new Iterator()
/*     */       {
/* 405 */         private Iterator<Map.Entry<K, V>> entryIt = ObservableMapWrapper.this.backingMap.entrySet().iterator();
/*     */         private K lastKey;
/*     */         private V lastValue;
/*     */         
/*     */         public boolean hasNext() {
/* 410 */           return this.entryIt.hasNext();
/*     */         }
/*     */ 
/*     */         
/*     */         public V next() {
/* 415 */           Map.Entry entry = this.entryIt.next();
/* 416 */           this.lastKey = (K)entry.getKey();
/* 417 */           this.lastValue = (V)entry.getValue();
/* 418 */           return this.lastValue;
/*     */         }
/*     */ 
/*     */         
/*     */         public void remove() {
/* 423 */           this.entryIt.remove();
/* 424 */           ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange(ObservableMapWrapper.this, this.lastKey, this.lastValue, null, false, true));
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 432 */     return ObservableMapWrapper.this.backingMap.values().toArray();
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> T[] toArray(T[] paramArrayOfT) {
/* 437 */     return (T[])ObservableMapWrapper.this.backingMap.values().toArray((Object[])paramArrayOfT);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean add(V paramV) {
/* 442 */     throw new UnsupportedOperationException("Not supported.");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean remove(Object paramObject) {
/* 447 */     for (Iterator<V> iterator = iterator(); iterator.hasNext();) {
/* 448 */       if (iterator.next().equals(paramObject)) {
/* 449 */         iterator.remove();
/* 450 */         return true;
/*     */       } 
/*     */     } 
/* 453 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsAll(Collection<?> paramCollection) {
/* 458 */     return ObservableMapWrapper.this.backingMap.values().containsAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(Collection<? extends V> paramCollection) {
/* 463 */     throw new UnsupportedOperationException("Not supported.");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeAll(Collection<?> paramCollection) {
/* 469 */     if (paramCollection.isEmpty() || ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 470 */       return false;
/*     */     }
/*     */     
/* 473 */     return removeRetain(paramCollection, true);
/*     */   }
/*     */   
/*     */   private boolean removeRetain(Collection<?> paramCollection, boolean paramBoolean) {
/* 477 */     boolean bool = false;
/* 478 */     for (Iterator<Map.Entry> iterator = ObservableMapWrapper.this.backingMap.entrySet().iterator(); iterator.hasNext(); ) {
/* 479 */       Map.Entry entry = iterator.next();
/* 480 */       if (paramBoolean == paramCollection.contains(entry.getValue())) {
/* 481 */         bool = true;
/* 482 */         Object object1 = entry.getKey();
/* 483 */         Object object2 = entry.getValue();
/* 484 */         iterator.remove();
/* 485 */         ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange(ObservableMapWrapper.this, (K)object1, (V)object2, null, false, true));
/*     */       } 
/*     */     } 
/* 488 */     return bool;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean retainAll(Collection<?> paramCollection) {
/* 494 */     if (paramCollection.isEmpty() && !ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 495 */       clear();
/* 496 */       return true;
/*     */     } 
/*     */     
/* 499 */     if (ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 500 */       return false;
/*     */     }
/*     */     
/* 503 */     return removeRetain(paramCollection, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 508 */     ObservableMapWrapper.this.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 513 */     return ObservableMapWrapper.this.backingMap.values().toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 518 */     return ObservableMapWrapper.this.backingMap.values().equals(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 523 */     return ObservableMapWrapper.this.backingMap.values().hashCode();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableMapWrapper$ObservableValues.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */