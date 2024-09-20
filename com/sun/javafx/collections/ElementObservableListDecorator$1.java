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
/*    */ class null
/*    */   implements Callback<E, InvalidationListener>
/*    */ {
/*    */   public InvalidationListener call(final E e) {
/* 54 */     return new InvalidationListener()
/*    */       {
/*    */         public void invalidated(Observable param2Observable)
/*    */         {
/* 58 */           ElementObservableListDecorator.access$000(ElementObservableListDecorator.this);
/* 59 */           byte b = 0;
/* 60 */           if (ElementObservableListDecorator.this.decoratedList instanceof java.util.RandomAccess) {
/* 61 */             int i = ElementObservableListDecorator.this.size();
/* 62 */             for (; b < i; b++) {
/* 63 */               if (ElementObservableListDecorator.this.get(b) == e) {
/* 64 */                 ElementObservableListDecorator.access$100(ElementObservableListDecorator.this, b);
/*    */               }
/*    */             } 
/*    */           } else {
/* 68 */             for (Iterator iterator = ElementObservableListDecorator.this.iterator(); iterator.hasNext(); ) {
/* 69 */               if (iterator.next() == e) {
/* 70 */                 ElementObservableListDecorator.access$200(ElementObservableListDecorator.this, b);
/*    */               }
/* 72 */               b++;
/*    */             } 
/*    */           } 
/* 75 */           ElementObservableListDecorator.access$300(ElementObservableListDecorator.this);
/*    */         }
/*    */       };
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ElementObservableListDecorator$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */