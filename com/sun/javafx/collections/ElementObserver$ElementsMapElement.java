/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import javafx.beans.InvalidationListener;
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
/*    */ class ElementsMapElement
/*    */ {
/*    */   InvalidationListener listener;
/*    */   int counter;
/*    */   
/*    */   public ElementsMapElement(InvalidationListener paramInvalidationListener) {
/* 41 */     this.listener = paramInvalidationListener;
/* 42 */     this.counter = 1;
/*    */   }
/*    */   
/*    */   public void increment() {
/* 46 */     this.counter++;
/*    */   }
/*    */   
/*    */   public int decrement() {
/* 50 */     return --this.counter;
/*    */   }
/*    */   
/*    */   private InvalidationListener getListener() {
/* 54 */     return this.listener;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ElementObserver$ElementsMapElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */