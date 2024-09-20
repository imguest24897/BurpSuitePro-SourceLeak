/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.BitSet;
/*     */ import java.util.Collection;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.RandomAccess;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.collections.ModifiableObservableListBase;
/*     */ import javafx.collections.ObservableListBase;
/*     */ import javafx.util.Callback;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ObservableListWrapper<E>
/*     */   extends ModifiableObservableListBase<E>
/*     */   implements SortableList<E>, RandomAccess
/*     */ {
/*     */   private final List<E> backingList;
/*     */   private final ElementObserver<E> elementObserver;
/*     */   private SortHelper helper;
/*     */   
/*     */   public ObservableListWrapper(List<E> paramList) {
/*  52 */     this.backingList = paramList;
/*  53 */     this.elementObserver = null;
/*     */   }
/*     */   
/*     */   public ObservableListWrapper(List<E> paramList, Callback<E, Observable[]> paramCallback) {
/*  57 */     this.backingList = paramList;
/*  58 */     this.elementObserver = new ElementObserver<>(paramCallback, new Callback<E, InvalidationListener>()
/*     */         {
/*     */           public InvalidationListener call(final E e)
/*     */           {
/*  62 */             return new InvalidationListener()
/*     */               {
/*     */                 public void invalidated(Observable param2Observable)
/*     */                 {
/*  66 */                   ObservableListWrapper.this.beginChange();
/*  67 */                   byte b = 0;
/*  68 */                   int i = ObservableListWrapper.this.size();
/*  69 */                   for (; b < i; b++) {
/*  70 */                     if (ObservableListWrapper.this.get(b) == e) {
/*  71 */                       ObservableListWrapper.this.nextUpdate(b);
/*     */                     }
/*     */                   } 
/*  74 */                   ObservableListWrapper.this.endChange();
/*     */                 }
/*     */               };
/*     */           }
/*     */         }(ObservableListBase<E>)this);
/*  79 */     int i = this.backingList.size();
/*  80 */     for (byte b = 0; b < i; b++) {
/*  81 */       this.elementObserver.attachListener(this.backingList.get(b));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public E get(int paramInt) {
/*  88 */     return this.backingList.get(paramInt);
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/*  93 */     return this.backingList.size();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doAdd(int paramInt, E paramE) {
/*  98 */     Objects.checkIndex(paramInt, size() + 1);
/*  99 */     if (this.elementObserver != null)
/* 100 */       this.elementObserver.attachListener(paramE); 
/* 101 */     this.backingList.add(paramInt, paramE);
/*     */   }
/*     */ 
/*     */   
/*     */   protected E doSet(int paramInt, E paramE) {
/* 106 */     E e = this.backingList.set(paramInt, paramE);
/* 107 */     if (this.elementObserver != null) {
/* 108 */       this.elementObserver.detachListener(e);
/* 109 */       this.elementObserver.attachListener(paramE);
/*     */     } 
/* 111 */     return e;
/*     */   }
/*     */ 
/*     */   
/*     */   protected E doRemove(int paramInt) {
/* 116 */     E e = this.backingList.remove(paramInt);
/* 117 */     if (this.elementObserver != null)
/* 118 */       this.elementObserver.detachListener(e); 
/* 119 */     return e;
/*     */   }
/*     */ 
/*     */   
/*     */   public int indexOf(Object paramObject) {
/* 124 */     return this.backingList.indexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/* 129 */     return this.backingList.lastIndexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean contains(Object paramObject) {
/* 134 */     return this.backingList.contains(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsAll(Collection<?> paramCollection) {
/* 139 */     return this.backingList.containsAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public void clear() {
/* 144 */     if (this.elementObserver != null) {
/* 145 */       int i = size();
/* 146 */       for (byte b = 0; b < i; b++) {
/* 147 */         this.elementObserver.detachListener(get(b));
/*     */       }
/*     */     } 
/* 150 */     if (hasListeners()) {
/* 151 */       beginChange();
/* 152 */       nextRemove(0, (List)this);
/*     */     } 
/* 154 */     this.backingList.clear();
/* 155 */     this.modCount++;
/* 156 */     if (hasListeners()) {
/* 157 */       endChange();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void remove(int paramInt1, int paramInt2) {
/* 163 */     Objects.checkFromToIndex(paramInt1, paramInt2, size());
/* 164 */     beginChange();
/* 165 */     for (int i = paramInt1; i < paramInt2; i++) {
/* 166 */       remove(paramInt1);
/*     */     }
/* 168 */     endChange();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeAll(Collection<?> paramCollection) {
/* 174 */     if (paramCollection.isEmpty() || this.backingList.isEmpty()) {
/* 175 */       return false;
/*     */     }
/*     */     
/* 178 */     beginChange();
/* 179 */     BitSet bitSet = new BitSet(paramCollection.size()); int i;
/* 180 */     for (i = 0; i < size(); i++) {
/* 181 */       if (paramCollection.contains(get(i))) {
/* 182 */         bitSet.set(i);
/*     */       }
/*     */     } 
/* 185 */     if (!bitSet.isEmpty()) {
/* 186 */       i = size();
/* 187 */       while ((i = bitSet.previousSetBit(i - 1)) >= 0) {
/* 188 */         remove(i);
/*     */       }
/*     */     } 
/* 191 */     endChange();
/* 192 */     return !bitSet.isEmpty();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean retainAll(Collection<?> paramCollection) {
/* 198 */     if (paramCollection.isEmpty() && !this.backingList.isEmpty()) {
/* 199 */       clear();
/* 200 */       return true;
/*     */     } 
/*     */     
/* 203 */     if (this.backingList.isEmpty()) {
/* 204 */       return false;
/*     */     }
/*     */     
/* 207 */     beginChange();
/* 208 */     BitSet bitSet = new BitSet(paramCollection.size()); int i;
/* 209 */     for (i = 0; i < size(); i++) {
/* 210 */       if (!paramCollection.contains(get(i))) {
/* 211 */         bitSet.set(i);
/*     */       }
/*     */     } 
/* 214 */     if (!bitSet.isEmpty()) {
/* 215 */       i = size();
/* 216 */       while ((i = bitSet.previousSetBit(i - 1)) >= 0) {
/* 217 */         remove(i);
/*     */       }
/*     */     } 
/* 220 */     endChange();
/* 221 */     return !bitSet.isEmpty();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void doSort(Comparator<? super E> paramComparator) {
/* 228 */     int[] arrayOfInt = getSortHelper().sort(this.backingList, paramComparator);
/* 229 */     fireChange(new NonIterableChange.SimplePermutationChange(0, size(), arrayOfInt, this));
/*     */   }
/*     */   
/*     */   private SortHelper getSortHelper() {
/* 233 */     if (this.helper == null) {
/* 234 */       this.helper = new SortHelper();
/*     */     }
/* 236 */     return this.helper;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableListWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */