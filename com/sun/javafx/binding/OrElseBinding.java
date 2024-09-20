/*    */ package com.sun.javafx.binding;
/*    */ 
/*    */ import java.util.Objects;
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.value.ChangeListener;
/*    */ import javafx.beans.value.ObservableValue;
/*    */ import javafx.util.Subscription;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class OrElseBinding<T>
/*    */   extends LazyObjectBinding<T>
/*    */ {
/*    */   private final ObservableValue<T> source;
/*    */   private final T constant;
/*    */   
/*    */   public OrElseBinding(ObservableValue<T> paramObservableValue, T paramT) {
/* 39 */     this.source = Objects.<ObservableValue<T>>requireNonNull(paramObservableValue, "source cannot be null");
/* 40 */     this.constant = paramT;
/*    */   }
/*    */ 
/*    */   
/*    */   protected T computeValue() {
/* 45 */     Object object = this.source.getValue();
/*    */     
/* 47 */     return (object == null) ? this.constant : (T)object;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Subscription observeSources() {
/* 52 */     return this.source.subscribe(this::invalidate);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\OrElseBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */