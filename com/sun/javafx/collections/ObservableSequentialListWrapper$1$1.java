/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.Observable;
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
/*    */   implements InvalidationListener
/*    */ {
/*    */   public void invalidated(Observable paramObservable) {
/* 61 */     ObservableSequentialListWrapper.access$000(this.this$1.this$0);
/* 62 */     byte b = 0;
/* 63 */     for (Iterator iterator = this.this$1.this$0.backingList.iterator(); iterator.hasNext(); ) {
/* 64 */       if (iterator.next() == e) {
/* 65 */         ObservableSequentialListWrapper.access$100(this.this$1.this$0, b);
/*    */       }
/* 67 */       b++;
/*    */     } 
/* 69 */     ObservableSequentialListWrapper.access$200(this.this$1.this$0);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableSequentialListWrapper$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */