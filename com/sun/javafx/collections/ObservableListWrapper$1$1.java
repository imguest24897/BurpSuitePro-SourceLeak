/*    */ package com.sun.javafx.collections;
/*    */ 
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
/* 66 */     ObservableListWrapper.access$000(this.this$1.this$0);
/* 67 */     byte b = 0;
/* 68 */     int i = this.this$1.this$0.size();
/* 69 */     for (; b < i; b++) {
/* 70 */       if (this.this$1.this$0.get(b) == e) {
/* 71 */         ObservableListWrapper.access$100(this.this$1.this$0, b);
/*    */       }
/*    */     } 
/* 74 */     ObservableListWrapper.access$200(this.this$1.this$0);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableListWrapper$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */