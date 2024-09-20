/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.Collection;
/*     */ import java.util.Comparator;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.ListIterator;
/*     */ import java.util.NoSuchElementException;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.collections.ModifiableObservableListBase;
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
/*     */ public class ObservableSequentialListWrapper<E>
/*     */   extends ModifiableObservableListBase<E>
/*     */   implements SortableList<E>
/*     */ {
/*     */   private final List<E> backingList;
/*     */   private final ElementObserver<E> elementObserver;
/*     */   private SortHelper helper;
/*     */   
/*     */   public ObservableSequentialListWrapper(List<E> paramList) {
/*  47 */     this.backingList = paramList;
/*  48 */     this.elementObserver = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObservableSequentialListWrapper(List<E> paramList, Callback<E, Observable[]> paramCallback) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial <init> : ()V
/*     */     //   4: aload_0
/*     */     //   5: aload_1
/*     */     //   6: putfield backingList : Ljava/util/List;
/*     */     //   9: aload_0
/*     */     //   10: new com/sun/javafx/collections/ElementObserver
/*     */     //   13: dup
/*     */     //   14: aload_2
/*     */     //   15: new com/sun/javafx/collections/ObservableSequentialListWrapper$1
/*     */     //   18: dup
/*     */     //   19: aload_0
/*     */     //   20: invokespecial <init> : (Lcom/sun/javafx/collections/ObservableSequentialListWrapper;)V
/*     */     //   23: aload_0
/*     */     //   24: invokespecial <init> : (Ljavafx/util/Callback;Ljavafx/util/Callback;Ljavafx/collections/ObservableListBase;)V
/*     */     //   27: putfield elementObserver : Lcom/sun/javafx/collections/ElementObserver;
/*     */     //   30: aload_0
/*     */     //   31: getfield backingList : Ljava/util/List;
/*     */     //   34: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   39: astore_3
/*     */     //   40: aload_3
/*     */     //   41: invokeinterface hasNext : ()Z
/*     */     //   46: ifeq -> 69
/*     */     //   49: aload_3
/*     */     //   50: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: aload_0
/*     */     //   58: getfield elementObserver : Lcom/sun/javafx/collections/ElementObserver;
/*     */     //   61: aload #4
/*     */     //   63: invokevirtual attachListener : (Ljava/lang/Object;)V
/*     */     //   66: goto -> 40
/*     */     //   69: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 0
/*     */     //   #52	-> 4
/*     */     //   #53	-> 9
/*     */     //   #74	-> 30
/*     */     //   #75	-> 57
/*     */     //   #76	-> 66
/*     */     //   #77	-> 69
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean contains(Object paramObject) {
/*  81 */     return this.backingList.contains(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean containsAll(Collection<?> paramCollection) {
/*  86 */     return this.backingList.containsAll(paramCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   public int indexOf(Object paramObject) {
/*  91 */     return this.backingList.indexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public int lastIndexOf(Object paramObject) {
/*  96 */     return this.backingList.lastIndexOf(paramObject);
/*     */   }
/*     */ 
/*     */   
/*     */   public ListIterator<E> listIterator(final int index) {
/* 101 */     return new ListIterator<E>()
/*     */       {
/* 103 */         private final ListIterator<E> backingIt = ObservableSequentialListWrapper.this.backingList.listIterator(index);
/*     */         
/*     */         private E lastReturned;
/*     */         
/*     */         public boolean hasNext() {
/* 108 */           return this.backingIt.hasNext();
/*     */         }
/*     */ 
/*     */         
/*     */         public E next() {
/* 113 */           return this.lastReturned = this.backingIt.next();
/*     */         }
/*     */ 
/*     */         
/*     */         public boolean hasPrevious() {
/* 118 */           return this.backingIt.hasPrevious();
/*     */         }
/*     */ 
/*     */         
/*     */         public E previous() {
/* 123 */           return this.lastReturned = this.backingIt.previous();
/*     */         }
/*     */ 
/*     */         
/*     */         public int nextIndex() {
/* 128 */           return this.backingIt.nextIndex();
/*     */         }
/*     */ 
/*     */         
/*     */         public int previousIndex() {
/* 133 */           return this.backingIt.previousIndex();
/*     */         }
/*     */ 
/*     */         
/*     */         public void remove() {
/* 138 */           ObservableSequentialListWrapper.this.beginChange();
/* 139 */           int i = previousIndex();
/* 140 */           this.backingIt.remove();
/* 141 */           ObservableSequentialListWrapper.this.nextRemove(i, this.lastReturned);
/* 142 */           ObservableSequentialListWrapper.this.endChange();
/*     */         }
/*     */ 
/*     */         
/*     */         public void set(E param1E) {
/* 147 */           ObservableSequentialListWrapper.this.beginChange();
/* 148 */           int i = previousIndex();
/* 149 */           this.backingIt.set(param1E);
/* 150 */           ObservableSequentialListWrapper.this.nextSet(i, this.lastReturned);
/* 151 */           ObservableSequentialListWrapper.this.endChange();
/*     */         }
/*     */ 
/*     */         
/*     */         public void add(E param1E) {
/* 156 */           ObservableSequentialListWrapper.this.beginChange();
/* 157 */           int i = nextIndex();
/* 158 */           this.backingIt.add(param1E);
/* 159 */           ObservableSequentialListWrapper.this.nextAdd(i, i + 1);
/* 160 */           ObservableSequentialListWrapper.this.endChange();
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   public Iterator<E> iterator() {
/* 167 */     return listIterator();
/*     */   }
/*     */ 
/*     */   
/*     */   public E get(int paramInt) {
/*     */     try {
/* 173 */       return this.backingList.listIterator(paramInt).next();
/* 174 */     } catch (NoSuchElementException noSuchElementException) {
/* 175 */       throw new IndexOutOfBoundsException("Index: " + paramInt);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean addAll(int paramInt, Collection<? extends E> paramCollection) {
/* 181 */     if (paramInt < 0 || paramInt > size()) {
/* 182 */       throw new IndexOutOfBoundsException("Index: " + paramInt);
/*     */     }
/*     */ 
/*     */     
/* 186 */     if (paramCollection.isEmpty()) {
/* 187 */       return false;
/*     */     }
/*     */     
/*     */     try {
/* 191 */       beginChange();
/* 192 */       boolean bool = false;
/* 193 */       ListIterator<E> listIterator = listIterator(paramInt);
/* 194 */       Iterator<? extends E> iterator = paramCollection.iterator();
/* 195 */       while (iterator.hasNext()) {
/* 196 */         listIterator.add(iterator.next());
/* 197 */         bool = true;
/*     */       } 
/* 199 */       endChange();
/* 200 */       return bool;
/* 201 */     } catch (NoSuchElementException noSuchElementException) {
/* 202 */       throw new IndexOutOfBoundsException("Index: " + paramInt);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 208 */     return this.backingList.size();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doAdd(int paramInt, E paramE) {
/*     */     try {
/* 214 */       this.backingList.listIterator(paramInt).add(paramE);
/* 215 */     } catch (NoSuchElementException noSuchElementException) {
/* 216 */       throw new IndexOutOfBoundsException("Index: " + paramInt);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected E doSet(int paramInt, E paramE) {
/*     */     try {
/* 223 */       ListIterator<E> listIterator = this.backingList.listIterator(paramInt);
/* 224 */       E e = listIterator.next();
/* 225 */       listIterator.set(paramE);
/* 226 */       return e;
/* 227 */     } catch (NoSuchElementException noSuchElementException) {
/* 228 */       throw new IndexOutOfBoundsException("Index: " + paramInt);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected E doRemove(int paramInt) {
/*     */     try {
/* 235 */       ListIterator<E> listIterator = this.backingList.listIterator(paramInt);
/* 236 */       E e = listIterator.next();
/* 237 */       listIterator.remove();
/* 238 */       return e;
/* 239 */     } catch (NoSuchElementException noSuchElementException) {
/* 240 */       throw new IndexOutOfBoundsException("Index: " + paramInt);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void doSort(Comparator<? super E> paramComparator) {
/* 248 */     int[] arrayOfInt = getSortHelper().sort(this.backingList, paramComparator);
/* 249 */     fireChange(new NonIterableChange.SimplePermutationChange(0, size(), arrayOfInt, this));
/*     */   }
/*     */   
/*     */   private SortHelper getSortHelper() {
/* 253 */     if (this.helper == null) {
/* 254 */       this.helper = new SortHelper();
/*     */     }
/* 256 */     return this.helper;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableSequentialListWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */