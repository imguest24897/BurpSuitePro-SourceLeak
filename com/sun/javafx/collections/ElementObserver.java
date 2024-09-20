/*    */ package com.sun.javafx.collections;
/*    */ 
/*    */ import java.util.IdentityHashMap;
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.Observable;
/*    */ import javafx.collections.ObservableListBase;
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
/*    */ final class ElementObserver<E>
/*    */ {
/*    */   private Callback<E, Observable[]> extractor;
/*    */   private final Callback<E, InvalidationListener> listenerGenerator;
/*    */   private final ObservableListBase<E> list;
/*    */   
/*    */   private static class ElementsMapElement
/*    */   {
/*    */     InvalidationListener listener;
/*    */     int counter;
/*    */     
/*    */     public ElementsMapElement(InvalidationListener param1InvalidationListener) {
/* 41 */       this.listener = param1InvalidationListener;
/* 42 */       this.counter = 1;
/*    */     }
/*    */     
/*    */     public void increment() {
/* 46 */       this.counter++;
/*    */     }
/*    */     
/*    */     public int decrement() {
/* 50 */       return --this.counter;
/*    */     }
/*    */     
/*    */     private InvalidationListener getListener() {
/* 54 */       return this.listener;
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 61 */   private IdentityHashMap<E, ElementsMapElement> elementsMap = new IdentityHashMap<>();
/*    */ 
/*    */   
/*    */   ElementObserver(Callback<E, Observable[]> paramCallback, Callback<E, InvalidationListener> paramCallback1, ObservableListBase<E> paramObservableListBase) {
/* 65 */     this.extractor = paramCallback;
/* 66 */     this.listenerGenerator = paramCallback1;
/* 67 */     this.list = paramObservableListBase;
/*    */   }
/*    */ 
/*    */   
/*    */   void attachListener(E paramE) {
/* 72 */     if (this.elementsMap != null && paramE != null) {
/* 73 */       if (this.elementsMap.containsKey(paramE)) {
/* 74 */         ((ElementsMapElement)this.elementsMap.get(paramE)).increment();
/*    */       } else {
/* 76 */         InvalidationListener invalidationListener = (InvalidationListener)this.listenerGenerator.call(paramE);
/* 77 */         for (Observable observable : (Observable[])this.extractor.call(paramE)) {
/* 78 */           observable.addListener(invalidationListener);
/*    */         }
/* 80 */         this.elementsMap.put(paramE, new ElementsMapElement(invalidationListener));
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   void detachListener(E paramE) {
/* 86 */     if (this.elementsMap != null && paramE != null) {
/* 87 */       ElementsMapElement elementsMapElement = this.elementsMap.get(paramE);
/* 88 */       for (Observable observable : (Observable[])this.extractor.call(paramE)) {
/* 89 */         observable.removeListener(elementsMapElement.getListener());
/*    */       }
/* 91 */       if (elementsMapElement.decrement() == 0)
/* 92 */         this.elementsMap.remove(paramE); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ElementObserver.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */