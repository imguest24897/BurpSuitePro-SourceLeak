/*    */ package com.sun.javafx.binding;
/*    */ 
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.value.ChangeListener;
/*    */ import javafx.beans.value.ObservableDoubleValue;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class DoubleConstant
/*    */   implements ObservableDoubleValue
/*    */ {
/*    */   private final double value;
/*    */   
/*    */   private DoubleConstant(double paramDouble) {
/* 40 */     this.value = paramDouble;
/*    */   }
/*    */   
/*    */   public static DoubleConstant valueOf(double paramDouble) {
/* 44 */     return new DoubleConstant(paramDouble);
/*    */   }
/*    */ 
/*    */   
/*    */   public double get() {
/* 49 */     return this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public Double getValue() {
/* 54 */     return Double.valueOf(this.value);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void addListener(InvalidationListener paramInvalidationListener) {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void addListener(ChangeListener<? super Number> paramChangeListener) {}
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void removeListener(InvalidationListener paramInvalidationListener) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public void removeListener(ChangeListener<? super Number> paramChangeListener) {}
/*    */ 
/*    */ 
/*    */   
/*    */   public int intValue() {
/* 79 */     return (int)this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public long longValue() {
/* 84 */     return (long)this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public float floatValue() {
/* 89 */     return (float)this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public double doubleValue() {
/* 94 */     return this.value;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\DoubleConstant.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */