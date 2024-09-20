/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import javafx.collections.ObservableSet;
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
/*    */ public class SetAdapterChange<E>
/*    */   extends SetChangeListener.Change<E>
/*    */ {
/*    */   private final SetChangeListener.Change<? extends E> change;
/*    */   
/*    */   public SetAdapterChange(ObservableSet<E> paramObservableSet, SetChangeListener.Change<? extends E> paramChange) {
/* 36 */     super(paramObservableSet);
/* 37 */     this.change = paramChange;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 42 */     return this.change.toString();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean wasAdded() {
/* 47 */     return this.change.wasAdded();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean wasRemoved() {
/* 52 */     return this.change.wasRemoved();
/*    */   }
/*    */ 
/*    */   
/*    */   public E getElementAdded() {
/* 57 */     return (E)this.change.getElementAdded();
/*    */   }
/*    */ 
/*    */   
/*    */   public E getElementRemoved() {
/* 62 */     return (E)this.change.getElementRemoved();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\SetAdapterChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */