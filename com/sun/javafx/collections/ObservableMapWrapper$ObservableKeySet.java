/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class ObservableKeySet
/*     */   implements Set<K>
/*     */ {
/*     */   public int size() {
/* 250 */     return ObservableMapWrapper.this.backingMap.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 255 */     return ObservableMapWrapper.this.backingMap.isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean contains(Object paramObject) {
/* 260 */     return ObservableMapWrapper.this.backingMap.keySet().contains(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<K> iterator() {
/* 265 */     return new Iterator()
/*     */       {
/* 267 */         private Iterator<Map.Entry<K, V>> entryIt = ObservableMapWrapper.this.backingMap.entrySet().iterator();
/*     */         private K lastKey;
/*     */         private V lastValue;
/*     */         
/*     */         public boolean hasNext() {
/* 272 */           return this.entryIt.hasNext();
/*     */         }
/*     */ 
/*     */         
/*     */         public K next() {
/* 277 */           Map.Entry entry = this.entryIt.next();
/* 278 */           this.lastKey = (K)entry.getKey();
/* 279 */           this.lastValue = (V)entry.getValue();
/* 280 */           return (K)entry.getKey();
/*     */         }
/*     */ 
/*     */         
/*     */         public void remove() {
/* 285 */           this.entryIt.remove();
/* 286 */           ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange(ObservableMapWrapper.this, this.lastKey, this.lastValue, null, false, true));
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 294 */     return ObservableMapWrapper.this.backingMap.keySet().toArray();
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> T[] toArray(T[] paramArrayOfT) {
/* 299 */     return (T[])ObservableMapWrapper.this.backingMap.keySet().toArray((Object[])paramArrayOfT);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean add(K paramK) {
/* 304 */     throw new UnsupportedOperationException("Not supported.");
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean remove(Object paramObject) {
/* 309 */     return (ObservableMapWrapper.this.remove(paramObject) != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsAll(Collection<?> paramCollection) {
/* 314 */     return ObservableMapWrapper.this.backingMap.keySet().containsAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(Collection<? extends K> paramCollection) {
/* 319 */     throw new UnsupportedOperationException("Not supported.");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean retainAll(Collection<?> paramCollection) {
/* 325 */     if (paramCollection.isEmpty() && !ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 326 */       clear();
/* 327 */       return true;
/*     */     } 
/*     */     
/* 330 */     if (ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 331 */       return false;
/*     */     }
/*     */     
/* 334 */     return removeRetain(paramCollection, false);
/*     */   }
/*     */   
/*     */   private boolean removeRetain(Collection<?> paramCollection, boolean paramBoolean) {
/* 338 */     boolean bool = false;
/* 339 */     for (Iterator<Map.Entry> iterator = ObservableMapWrapper.this.backingMap.entrySet().iterator(); iterator.hasNext(); ) {
/* 340 */       Map.Entry entry = iterator.next();
/* 341 */       if (paramBoolean == paramCollection.contains(entry.getKey())) {
/* 342 */         bool = true;
/* 343 */         Object object1 = entry.getKey();
/* 344 */         Object object2 = entry.getValue();
/* 345 */         iterator.remove();
/* 346 */         ObservableMapWrapper.this.callObservers(new ObservableMapWrapper.SimpleChange(ObservableMapWrapper.this, (K)object1, (V)object2, null, false, true));
/*     */       } 
/*     */     } 
/* 349 */     return bool;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeAll(Collection<?> paramCollection) {
/* 355 */     if (paramCollection.isEmpty() || ObservableMapWrapper.this.backingMap.isEmpty()) {
/* 356 */       return false;
/*     */     }
/*     */     
/* 359 */     return removeRetain(paramCollection, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 364 */     ObservableMapWrapper.this.clear();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 369 */     return ObservableMapWrapper.this.backingMap.keySet().toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 374 */     return ObservableMapWrapper.this.backingMap.keySet().equals(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 379 */     return ObservableMapWrapper.this.backingMap.keySet().hashCode();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableMapWrapper$ObservableKeySet.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */