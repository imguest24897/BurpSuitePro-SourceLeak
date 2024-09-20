/*    */ package com.sun.javafx.binding;
/*    */ 
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.value.ChangeListener;
/*    */ import javafx.beans.value.ObservableObjectValue;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ObjectConstant<T>
/*    */   implements ObservableObjectValue<T>
/*    */ {
/*    */   private final T value;
/*    */   
/*    */   private ObjectConstant(T paramT) {
/* 37 */     this.value = paramT;
/*    */   }
/*    */   
/*    */   public static <T> ObjectConstant<T> valueOf(T paramT) {
/* 41 */     return new ObjectConstant<>(paramT);
/*    */   }
/*    */ 
/*    */   
/*    */   public T get() {
/* 46 */     return this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public T getValue() {
/* 51 */     return this.value;
/*    */   }
/*    */   
/*    */   public void addListener(InvalidationListener paramInvalidationListener) {}
/*    */   
/*    */   public void addListener(ChangeListener<? super T> paramChangeListener) {}
/*    */   
/*    */   public void removeListener(InvalidationListener paramInvalidationListener) {}
/*    */   
/*    */   public void removeListener(ChangeListener<? super T> paramChangeListener) {}
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ObjectConstant.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */