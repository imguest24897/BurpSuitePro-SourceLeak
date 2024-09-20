/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import java.util.List;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.collections.ListChangeListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class ListContentBinding<E>
/*     */   implements ListChangeListener<E>, WeakListener
/*     */ {
/*     */   private final WeakReference<List<E>> listRef;
/*     */   
/*     */   public ListContentBinding(List<E> paramList) {
/* 108 */     this.listRef = new WeakReference<>(paramList);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onChanged(ListChangeListener.Change<? extends E> paramChange) {
/* 113 */     List list = this.listRef.get();
/* 114 */     if (list == null) {
/* 115 */       paramChange.getList().removeListener(this);
/*     */     } else {
/* 117 */       while (paramChange.next()) {
/* 118 */         if (paramChange.wasPermutated()) {
/* 119 */           list.subList(paramChange.getFrom(), paramChange.getTo()).clear();
/* 120 */           list.addAll(paramChange.getFrom(), paramChange.getList().subList(paramChange.getFrom(), paramChange.getTo())); continue;
/*     */         } 
/* 122 */         if (paramChange.wasRemoved()) {
/* 123 */           list.subList(paramChange.getFrom(), paramChange.getFrom() + paramChange.getRemovedSize()).clear();
/*     */         }
/* 125 */         if (paramChange.wasAdded()) {
/* 126 */           list.addAll(paramChange.getFrom(), paramChange.getAddedSubList());
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean wasGarbageCollected() {
/* 135 */     return (this.listRef.get() == null);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 140 */     List list = this.listRef.get();
/* 141 */     return (list == null) ? 0 : list.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 146 */     if (this == paramObject) {
/* 147 */       return true;
/*     */     }
/*     */     
/* 150 */     List list = this.listRef.get();
/* 151 */     if (list == null) {
/* 152 */       return false;
/*     */     }
/*     */     
/* 155 */     if (paramObject instanceof ListContentBinding) {
/* 156 */       ListContentBinding listContentBinding = (ListContentBinding)paramObject;
/* 157 */       List list1 = listContentBinding.listRef.get();
/* 158 */       return (list == list1);
/*     */     } 
/* 160 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ContentBinding$ListContentBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */