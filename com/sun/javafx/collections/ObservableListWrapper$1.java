/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.Observable;
/*    */ import javafx.util.Callback;
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
/*    */ 
/*    */ 
/*    */ class null
/*    */   implements Callback<E, InvalidationListener>
/*    */ {
/*    */   public InvalidationListener call(final E e) {
/* 62 */     return new InvalidationListener()
/*    */       {
/*    */         public void invalidated(Observable param2Observable)
/*    */         {
/* 66 */           ObservableListWrapper.access$000(ObservableListWrapper.this);
/* 67 */           byte b = 0;
/* 68 */           int i = ObservableListWrapper.this.size();
/* 69 */           for (; b < i; b++) {
/* 70 */             if (ObservableListWrapper.this.get(b) == e) {
/* 71 */               ObservableListWrapper.access$100(ObservableListWrapper.this, b);
/*    */             }
/*    */           } 
/* 74 */           ObservableListWrapper.access$200(ObservableListWrapper.this);
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableListWrapper$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */