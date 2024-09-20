/*     */ package com.sun.javafx.collections;
/*     */ 
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
/*     */ class null
/*     */   implements ListIterator<E>
/*     */ {
/* 103 */   private final ListIterator<E> backingIt = ObservableSequentialListWrapper.this.backingList.listIterator(index);
/*     */   
/*     */   private E lastReturned;
/*     */   
/*     */   public boolean hasNext() {
/* 108 */     return this.backingIt.hasNext();
/*     */   }
/*     */ 
/*     */   
/*     */   public E next() {
/* 113 */     return this.lastReturned = this.backingIt.next();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hasPrevious() {
/* 118 */     return this.backingIt.hasPrevious();
/*     */   }
/*     */ 
/*     */   
/*     */   public E previous() {
/* 123 */     return this.lastReturned = this.backingIt.previous();
/*     */   }
/*     */ 
/*     */   
/*     */   public int nextIndex() {
/* 128 */     return this.backingIt.nextIndex();
/*     */   }
/*     */ 
/*     */   
/*     */   public int previousIndex() {
/* 133 */     return this.backingIt.previousIndex();
/*     */   }
/*     */ 
/*     */   
/*     */   public void remove() {
/* 138 */     ObservableSequentialListWrapper.access$300(ObservableSequentialListWrapper.this);
/* 139 */     int i = previousIndex();
/* 140 */     this.backingIt.remove();
/* 141 */     ObservableSequentialListWrapper.access$400(ObservableSequentialListWrapper.this, i, this.lastReturned);
/* 142 */     ObservableSequentialListWrapper.access$500(ObservableSequentialListWrapper.this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void set(E paramE) {
/* 147 */     ObservableSequentialListWrapper.access$600(ObservableSequentialListWrapper.this);
/* 148 */     int i = previousIndex();
/* 149 */     this.backingIt.set(paramE);
/* 150 */     ObservableSequentialListWrapper.access$700(ObservableSequentialListWrapper.this, i, this.lastReturned);
/* 151 */     ObservableSequentialListWrapper.access$800(ObservableSequentialListWrapper.this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void add(E paramE) {
/* 156 */     ObservableSequentialListWrapper.access$900(ObservableSequentialListWrapper.this);
/* 157 */     int i = nextIndex();
/* 158 */     this.backingIt.add(paramE);
/* 159 */     ObservableSequentialListWrapper.access$1000(ObservableSequentialListWrapper.this, i, i + 1);
/* 160 */     ObservableSequentialListWrapper.access$1100(ObservableSequentialListWrapper.this);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableSequentialListWrapper$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */