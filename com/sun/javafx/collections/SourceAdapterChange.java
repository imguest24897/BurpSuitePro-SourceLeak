/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import java.util.List;
/*    */ import javafx.collections.ListChangeListener;
/*    */ import javafx.collections.ObservableList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SourceAdapterChange<E>
/*    */   extends ListChangeListener.Change<E>
/*    */ {
/*    */   private final ListChangeListener.Change<? extends E> change;
/*    */   private int[] perm;
/*    */   
/*    */   public SourceAdapterChange(ObservableList<E> paramObservableList, ListChangeListener.Change<? extends E> paramChange) {
/* 38 */     super(paramObservableList);
/* 39 */     this.change = paramChange;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean next() {
/* 44 */     this.perm = null;
/* 45 */     return this.change.next();
/*    */   }
/*    */ 
/*    */   
/*    */   public void reset() {
/* 50 */     this.change.reset();
/*    */   }
/*    */ 
/*    */   
/*    */   public int getTo() {
/* 55 */     return this.change.getTo();
/*    */   }
/*    */ 
/*    */   
/*    */   public List<E> getRemoved() {
/* 60 */     return this.change.getRemoved();
/*    */   }
/*    */ 
/*    */   
/*    */   public int getFrom() {
/* 65 */     return this.change.getFrom();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean wasUpdated() {
/* 70 */     return this.change.wasUpdated();
/*    */   }
/*    */ 
/*    */   
/*    */   protected int[] getPermutation() {
/* 75 */     if (this.perm == null) {
/* 76 */       if (this.change.wasPermutated()) {
/* 77 */         int i = this.change.getFrom();
/* 78 */         int j = this.change.getTo() - i;
/* 79 */         this.perm = new int[j];
/* 80 */         for (byte b = 0; b < j; b++) {
/* 81 */           this.perm[b] = this.change.getPermutation(i + b);
/*    */         }
/*    */       } else {
/* 84 */         this.perm = new int[0];
/*    */       } 
/*    */     }
/* 87 */     return this.perm;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 92 */     return this.change.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\SourceAdapterChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */