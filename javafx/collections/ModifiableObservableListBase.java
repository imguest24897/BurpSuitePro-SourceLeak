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
/*     */ public abstract class ModifiableObservableListBase<E>
/*     */   extends ObservableListBase<E>
/*     */ {
/*     */   public boolean setAll(Collection<? extends E> paramCollection) {
/*  92 */     if (paramCollection.isEmpty() && isEmpty()) {
/*  93 */       return false;
/*     */     }
/*     */     
/*  96 */     beginChange();
/*     */     try {
/*  98 */       clear();
/*  99 */       addAll(paramCollection);
/* 100 */       return true;
/*     */     } finally {
/* 102 */       endChange();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean addAll(Collection<? extends E> paramCollection) {
/* 109 */     if (paramCollection.isEmpty()) {
/* 110 */       return false;
/*     */     }
/*     */     
/* 113 */     beginChange();
/*     */     try {
/* 115 */       return super.addAll(paramCollection);
/*     */     } finally {
/* 117 */       endChange();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(int paramInt, Collection<? extends E> paramCollection) {
/* 123 */     if (paramInt < 0 || paramInt > size()) {
/* 124 */       throw new IndexOutOfBoundsException("Index: " + paramInt);
/*     */     }
/*     */ 
/*     */     
/* 128 */     if (paramCollection.isEmpty()) {
/* 129 */       return false;
/*     */     }
/*     */     
/* 132 */     beginChange();
/*     */     try {
/* 134 */       return super.addAll(paramInt, paramCollection);
/*     */     } finally {
/* 136 */       endChange();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void removeRange(int paramInt1, int paramInt2) {
/* 142 */     if (paramInt1 < 0 || paramInt1 > size()) {
/* 143 */       throw new IndexOutOfBoundsException("Index: " + paramInt1);
/*     */     }
/*     */ 
/*     */     
/* 147 */     if (paramInt1 == paramInt2) {
/*     */       return;
/*     */     }
/*     */     
/* 151 */     beginChange();
/*     */     try {
/* 153 */       super.removeRange(paramInt1, paramInt2);
/*     */     } finally {
/* 155 */       endChange();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeAll(Collection<?> paramCollection) {
/* 162 */     if (paramCollection.isEmpty() || isEmpty()) {
/* 163 */       return false;
/*     */     }
/*     */     
/* 166 */     beginChange();
/*     */     try {
/* 168 */       return super.removeAll(paramCollection);
/*     */     } finally {
/* 170 */       endChange();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean retainAll(Collection<?> paramCollection) {
/* 177 */     if (paramCollection.isEmpty() && !isEmpty()) {
/* 178 */       clear();
/* 179 */       return true;
/*     */     } 
/*     */     
/* 182 */     if (isEmpty()) {
/* 183 */       return false;
/*     */     }
/*     */     
/* 186 */     beginChange();
/*     */     try {
/* 188 */       return super.retainAll(paramCollection);
/*     */     } finally {
/* 190 */       endChange();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void add(int paramInt, E paramE) {
/* 196 */     doAdd(paramInt, paramE);
/* 197 */     beginChange();
/* 198 */     nextAdd(paramInt, paramInt + 1);
/* 199 */     this.modCount++;
/* 200 */     endChange();
/*     */   }
/*     */ 
/*     */   
/*     */   public E set(int paramInt, E paramE) {
/* 205 */     E e = doSet(paramInt, paramE);
/* 206 */     beginChange();
/* 207 */     nextSet(paramInt, e);
/* 208 */     endChange();
/* 209 */     return e;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean remove(Object paramObject) {
/* 214 */     int i = indexOf(paramObject);
/* 215 */     if (i != -1) {
/* 216 */       remove(i);
/* 217 */       return true;
/*     */     } 
/* 219 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public E remove(int paramInt) {
/* 224 */     E e = doRemove(paramInt);
/* 225 */     beginChange();
/* 226 */     nextRemove(paramInt, e);
/* 227 */     this.modCount++;
/* 228 */     endChange();
/* 229 */     return e;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<E> subList(int paramInt1, int paramInt2) {
/* 234 */     return new SubObservableList(super.subList(paramInt1, paramInt2));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract E get(int paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public abstract int size();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract void doAdd(int paramInt, E paramE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract E doSet(int paramInt, E paramE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract E doRemove(int paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   class SubObservableList
/*     */     implements List<E>
/*     */   {
/*     */     private List<E> sublist;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public SubObservableList(List<E> param1List) {
/* 299 */       this.sublist = param1List;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public int size() {
/* 305 */       return this.sublist.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isEmpty() {
/* 310 */       return this.sublist.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean contains(Object param1Object) {
/* 315 */       return this.sublist.contains(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public Iterator<E> iterator() {
/* 320 */       return this.sublist.iterator();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object[] toArray() {
/* 325 */       return this.sublist.toArray();
/*     */     }
/*     */ 
/*     */     
/*     */     public <T> T[] toArray(T[] param1ArrayOfT) {
/* 330 */       return this.sublist.toArray(param1ArrayOfT);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean add(E param1E) {
/* 335 */       return this.sublist.add(param1E);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean remove(Object param1Object) {
/* 340 */       return this.sublist.remove(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean containsAll(Collection<?> param1Collection) {
/* 345 */       return this.sublist.containsAll(param1Collection);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean addAll(Collection<? extends E> param1Collection) {
/* 351 */       if (param1Collection.isEmpty()) {
/* 352 */         return false;
/*     */       }
/*     */       
/* 355 */       ModifiableObservableListBase.this.beginChange();
/*     */       try {
/* 357 */         return this.sublist.addAll(param1Collection);
/*     */       } finally {
/* 359 */         ModifiableObservableListBase.this.endChange();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean addAll(int param1Int, Collection<? extends E> param1Collection) {
/* 365 */       if (param1Int < 0 || param1Int > this.sublist.size()) {
/* 366 */         throw new IndexOutOfBoundsException("Index: " + param1Int);
/*     */       }
/*     */ 
/*     */       
/* 370 */       if (param1Collection.isEmpty()) {
/* 371 */         return false;
/*     */       }
/*     */       
/* 374 */       ModifiableObservableListBase.this.beginChange();
/*     */       try {
/* 376 */         return this.sublist.addAll(param1Int, param1Collection);
/*     */       } finally {
/* 378 */         ModifiableObservableListBase.this.endChange();
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean removeAll(Collection<?> param1Collection) {
/* 385 */       if (param1Collection.isEmpty() || this.sublist.isEmpty()) {
/* 386 */         return false;
/*     */       }
/*     */       
/* 389 */       ModifiableObservableListBase.this.beginChange();
/*     */       try {
/* 391 */         return this.sublist.removeAll(param1Collection);
/*     */       } finally {
/* 393 */         ModifiableObservableListBase.this.endChange();
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean retainAll(Collection<?> param1Collection) {
/* 400 */       if (param1Collection.isEmpty() && !this.sublist.isEmpty()) {
/* 401 */         this.sublist.clear();
/* 402 */         return true;
/*     */       } 
/*     */       
/* 405 */       if (this.sublist.isEmpty()) {
/* 406 */         return false;
/*     */       }
/*     */       
/* 409 */       ModifiableObservableListBase.this.beginChange();
/*     */       try {
/* 411 */         return this.sublist.retainAll(param1Collection);
/*     */       } finally {
/* 413 */         ModifiableObservableListBase.this.endChange();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void clear() {
/* 419 */       ModifiableObservableListBase.this.beginChange();
/*     */       try {
/* 421 */         this.sublist.clear();
/*     */       } finally {
/* 423 */         ModifiableObservableListBase.this.endChange();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public E get(int param1Int) {
/* 429 */       return this.sublist.get(param1Int);
/*     */     }
/*     */ 
/*     */     
/*     */     public E set(int param1Int, E param1E) {
/* 434 */       return this.sublist.set(param1Int, param1E);
/*     */     }
/*     */ 
/*     */     
/*     */     public void add(int param1Int, E param1E) {
/* 439 */       this.sublist.add(param1Int, param1E);
/*     */     }
/*     */ 
/*     */     
/*     */     public E remove(int param1Int) {
/* 444 */       return this.sublist.remove(param1Int);
/*     */     }
/*     */ 
/*     */     
/*     */     public int indexOf(Object param1Object) {
/* 449 */       return this.sublist.indexOf(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public int lastIndexOf(Object param1Object) {
/* 454 */       return this.sublist.lastIndexOf(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public ListIterator<E> listIterator() {
/* 459 */       return this.sublist.listIterator();
/*     */     }
/*     */ 
/*     */     
/*     */     public ListIterator<E> listIterator(int param1Int) {
/* 464 */       return this.sublist.listIterator(param1Int);
/*     */     }
/*     */ 
/*     */     
/*     */     public List<E> subList(int param1Int1, int param1Int2) {
/* 469 */       return new SubObservableList(this.sublist.subList(param1Int1, param1Int2));
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean equals(Object param1Object) {
/* 474 */       return this.sublist.equals(param1Object);
/*     */     }
/*     */ 
/*     */     
/*     */     public int hashCode() {
/* 479 */       return this.sublist.hashCode();
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 484 */       return this.sublist.toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\collections\ModifiableObservableListBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */