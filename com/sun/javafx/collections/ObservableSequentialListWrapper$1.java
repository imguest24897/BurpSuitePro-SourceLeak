/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import java.util.Iterator;
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
/*    */ class null
/*    */   implements Callback<E, InvalidationListener>
/*    */ {
/*    */   public InvalidationListener call(final E e) {
/* 57 */     return new InvalidationListener()
/*    */       {
/*    */         public void invalidated(Observable param2Observable)
/*    */         {
/* 61 */           ObservableSequentialListWrapper.access$000(ObservableSequentialListWrapper.this);
/* 62 */           byte b = 0;
/* 63 */           for (Iterator iterator = ObservableSequentialListWrapper.this.backingList.iterator(); iterator.hasNext(); ) {
/* 64 */             if (iterator.next() == e) {
/* 65 */               ObservableSequentialListWrapper.access$100(ObservableSequentialListWrapper.this, b);
/*    */             }
/* 67 */             b++;
/*    */           } 
/* 69 */           ObservableSequentialListWrapper.access$200(ObservableSequentialListWrapper.this);
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableSequentialListWrapper$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */