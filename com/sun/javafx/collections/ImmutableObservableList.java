/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.AbstractList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.collections.ListChangeListener;
/*     */ import javafx.collections.ObservableList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ImmutableObservableList<E>
/*     */   extends AbstractList<E>
/*     */   implements ObservableList<E>
/*     */ {
/*     */   private final E[] elements;
/*     */   
/*     */   public ImmutableObservableList(E... paramVarArgs) {
/*  41 */     this
/*  42 */       .elements = (paramVarArgs == null || paramVarArgs.length == 0) ? null : Arrays.<E>copyOf(paramVarArgs, paramVarArgs.length);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(ListChangeListener<? super E> paramListChangeListener) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(ListChangeListener<? super E> paramListChangeListener) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean addAll(E... paramVarArgs) {
/*  67 */     throw new UnsupportedOperationException();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean setAll(E... paramVarArgs) {
/*  72 */     throw new UnsupportedOperationException();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean setAll(Collection<? extends E> paramCollection) {
/*  77 */     throw new UnsupportedOperationException();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeAll(E... paramVarArgs) {
/*  82 */     throw new UnsupportedOperationException();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean retainAll(E... paramVarArgs) {
/*  87 */     throw new UnsupportedOperationException();
/*     */   }
/*     */ 
/*     */   
/*     */   public void remove(int paramInt1, int paramInt2) {
/*  92 */     throw new UnsupportedOperationException();
/*     */   }
/*     */ 
/*     */   
/*     */   public E get(int paramInt) {
/*  97 */     if (paramInt < 0 || paramInt >= size()) {
/*  98 */       throw new IndexOutOfBoundsException();
/*     */     }
/* 100 */     return this.elements[paramInt];
/*     */   }
/*     */ 
/*     */   
/*     */   public int size() {
/* 105 */     return (this.elements == null) ? 0 : this.elements.length;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ImmutableObservableList.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */