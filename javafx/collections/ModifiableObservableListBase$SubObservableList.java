/*     */ package javafx.collections;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class SubObservableList
/*     */   implements List<E>
/*     */ {
/*     */   private List<E> sublist;
/*     */   
/*     */   public SubObservableList(List<E> paramList) {
/* 299 */     this.sublist = paramList;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int size() {
/* 305 */     return this.sublist.size();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEmpty() {
/* 310 */     return this.sublist.isEmpty();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean contains(Object paramObject) {
/* 315 */     return this.sublist.contains(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<E> iterator() {
/* 320 */     return this.sublist.iterator();
/*     */   }
/*     */ 
/*     */   
/*     */   public Object[] toArray() {
/* 325 */     return this.sublist.toArray();
/*     */   }
/*     */ 
/*     */   
/*     */   public <T> T[] toArray(T[] paramArrayOfT) {
/* 330 */     return this.sublist.toArray(paramArrayOfT);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean add(E paramE) {
/* 335 */     return this.sublist.add(paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean remove(Object paramObject) {
/* 340 */     return this.sublist.remove(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsAll(Collection<?> paramCollection) {
/* 345 */     return this.sublist.containsAll(paramCollection);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean addAll(Collection<? extends E> paramCollection) {
/* 351 */     if (paramCollection.isEmpty()) {
/* 352 */       return false;
/*     */     }
/*     */     
/* 355 */     ModifiableObservableListBase.this.beginChange();
/*     */     try {
/* 357 */       return this.sublist.addAll(paramCollection);
/*     */     } finally {
/* 359 */       ModifiableObservableListBase.this.endChange();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(int paramInt, Collection<? extends E> paramCollection) {
/* 365 */     if (paramInt < 0 || paramInt > this.sublist.size()) {
/* 366 */       throw new IndexOutOfBoundsException("Index: " + paramInt);
/*     */     }
/*     */ 
/*     */     
/* 370 */     if (paramCollection.isEmpty()) {
/* 371 */       return false;
/*     */     }
/*     */     
/* 374 */     ModifiableObservableListBase.this.beginChange();
/*     */     try {
/* 376 */       return this.sublist.addAll(paramInt, paramCollection);
/*     */     } finally {
/* 378 */       ModifiableObservableListBase.this.endChange();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeAll(Collection<?> paramCollection) {
/* 385 */     if (paramCollection.isEmpty() || this.sublist.isEmpty()) {
/* 386 */       return false;
/*     */     }
/*     */     
/* 389 */     ModifiableObservableListBase.this.beginChange();
/*     */     try {
/* 391 */       return this.sublist.removeAll(paramCollection);
/*     */     } finally {
/* 393 */       ModifiableObservableListBase.this.endChange();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean retainAll(Collection<?> paramCollection) {
/* 400 */     if (paramCollection.isEmpty() && !this.sublist.isEmpty()) {
/* 401 */       this.sublist.clear();
/* 402 */       return true;
/*     */     } 
/*     */     
/* 405 */     if (this.sublist.isEmpty()) {
/* 406 */       return false;
/*     */     }
/*     */     
/* 409 */     ModifiableObservableListBase.this.beginChange();
/*     */     try {
/* 411 */       return this.sublist.retainAll(paramCollection);
/*     */     } finally {
/* 413 */       ModifiableObservableListBase.this.endChange();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 419 */     ModifiableObservableListBase.this.beginChange();
/*     */     try {
/* 421 */       this.sublist.clear();
/*     */     } finally {
/* 423 */       ModifiableObservableListBase.this.endChange();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public E get(int paramInt) {
/* 429 */     return this.sublist.get(paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public E set(int paramInt, E paramE) {
/* 434 */     return this.sublist.set(paramInt, paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   public void add(int paramInt, E paramE) {
/* 439 */     this.sublist.add(paramInt, paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   public E remove(int paramInt) {
/* 444 */     return this.sublist.remove(paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public int indexOf(Object paramObject) {
/* 449 */     return this.sublist.indexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/* 454 */     return this.sublist.lastIndexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public ListIterator<E> listIterator() {
/* 459 */     return this.sublist.listIterator();
/*     */   }
/*     */ 
/*     */   
/*     */   public ListIterator<E> listIterator(int paramInt) {
/* 464 */     return this.sublist.listIterator(paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public List<E> subList(int paramInt1, int paramInt2) {
/* 469 */     return new SubObservableList(this.sublist.subList(paramInt1, paramInt2));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 474 */     return this.sublist.equals(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 479 */     return this.sublist.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 484 */     return this.sublist.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\ModifiableObservableListBase$SubObservableList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */