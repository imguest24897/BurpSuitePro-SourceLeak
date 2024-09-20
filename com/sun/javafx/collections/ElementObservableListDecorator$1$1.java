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
/*    */ class null
/*    */   implements InvalidationListener
/*    */ {
/*    */   public void invalidated(Observable paramObservable) {
/* 58 */     ElementObservableListDecorator.access$000(this.this$1.this$0);
/* 59 */     byte b = 0;
/* 60 */     if (this.this$1.this$0.decoratedList instanceof java.util.RandomAccess) {
/* 61 */       int i = this.this$1.this$0.size();
/* 62 */       for (; b < i; b++) {
/* 63 */         if (this.this$1.this$0.get(b) == e) {
/* 64 */           ElementObservableListDecorator.access$100(this.this$1.this$0, b);
/*    */         }
/*    */       } 
/*    */     } else {
/* 68 */       for (Iterator iterator = this.this$1.this$0.iterator(); iterator.hasNext(); ) {
/* 69 */         if (iterator.next() == e) {
/* 70 */           ElementObservableListDecorator.access$200(this.this$1.this$0, b);
/*    */         }
/* 72 */         b++;
/*    */       } 
/*    */     } 
/* 75 */     ElementObservableListDecorator.access$300(this.this$1.this$0);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ElementObservableListDecorator$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */