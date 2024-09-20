/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import javafx.collections.SetChangeListener;
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
/*    */ class SimpleAddChange
/*    */   extends SetChangeListener.Change<E>
/*    */ {
/*    */   private final E added;
/*    */   
/*    */   public SimpleAddChange(E paramE) {
/* 60 */     super(paramObservableSetWrapper);
/* 61 */     this.added = paramE;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean wasAdded() {
/* 66 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean wasRemoved() {
/* 71 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public E getElementAdded() {
/* 76 */     return this.added;
/*    */   }
/*    */ 
/*    */   
/*    */   public E getElementRemoved() {
/* 81 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 86 */     return "added " + String.valueOf(this.added);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableSetWrapper$SimpleAddChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */