/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.WeakListener;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private final WeakReference<ObservableList<E>> propertyRef1;
/*     */   private final WeakReference<ObservableList<E>> propertyRef2;
/*     */   private boolean updating = false;
/*     */   
/*     */   public ListContentBinding(ObservableList<E> paramObservableList1, ObservableList<E> paramObservableList2) {
/* 106 */     this.propertyRef1 = new WeakReference<>(paramObservableList1);
/* 107 */     this.propertyRef2 = new WeakReference<>(paramObservableList2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onChanged(ListChangeListener.Change<? extends E> paramChange) {
/* 112 */     if (!this.updating) {
/* 113 */       ObservableList observableList1 = this.propertyRef1.get();
/* 114 */       ObservableList observableList2 = this.propertyRef2.get();
/* 115 */       if (observableList1 == null || observableList2 == null) {
/* 116 */         if (observableList1 != null) {
/* 117 */           observableList1.removeListener(this);
/*     */         }
/* 119 */         if (observableList2 != null) {
/* 120 */           observableList2.removeListener(this);
/*     */         }
/*     */       } else {
/*     */         try {
/* 124 */           this.updating = true;
/* 125 */           ObservableList observableList = (observableList1 == paramChange.getList()) ? observableList2 : observableList1;
/* 126 */           while (paramChange.next()) {
/* 127 */             if (paramChange.wasPermutated()) {
/* 128 */               observableList.remove(paramChange.getFrom(), paramChange.getTo());
/* 129 */               observableList.addAll(paramChange.getFrom(), paramChange.getList().subList(paramChange.getFrom(), paramChange.getTo())); continue;
/*     */             } 
/* 131 */             if (paramChange.wasRemoved()) {
/* 132 */               observableList.remove(paramChange.getFrom(), paramChange.getFrom() + paramChange.getRemovedSize());
/*     */             }
/* 134 */             if (paramChange.wasAdded()) {
/* 135 */               observableList.addAll(paramChange.getFrom(), paramChange.getAddedSubList());
/*     */             }
/*     */           } 
/*     */         } finally {
/*     */           
/* 140 */           this.updating = false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasGarbageCollected() {
/* 148 */     return (this.propertyRef1.get() == null || this.propertyRef2.get() == null);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 153 */     ObservableList observableList1 = this.propertyRef1.get();
/* 154 */     ObservableList observableList2 = this.propertyRef2.get();
/* 155 */     byte b1 = (observableList1 == null) ? 0 : observableList1.hashCode();
/* 156 */     byte b2 = (observableList2 == null) ? 0 : observableList2.hashCode();
/* 157 */     return b1 * b2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 162 */     if (this == paramObject) {
/* 163 */       return true;
/*     */     }
/*     */     
/* 166 */     Object object1 = this.propertyRef1.get();
/* 167 */     Object object2 = this.propertyRef2.get();
/* 168 */     if (object1 == null || object2 == null) {
/* 169 */       return false;
/*     */     }
/*     */     
/* 172 */     if (paramObject instanceof ListContentBinding) { ListContentBinding listContentBinding = (ListContentBinding)paramObject;
/* 173 */       Object object3 = listContentBinding.propertyRef1.get();
/* 174 */       Object object4 = listContentBinding.propertyRef2.get();
/* 175 */       if (object3 == null || object4 == null) {
/* 176 */         return false;
/*     */       }
/*     */       
/* 179 */       if (object1 == object3 && object2 == object4) {
/* 180 */         return true;
/*     */       }
/* 182 */       if (object1 == object4 && object2 == object3) {
/* 183 */         return true;
/*     */       } }
/*     */     
/* 186 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\BidirectionalContentBinding$ListContentBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */