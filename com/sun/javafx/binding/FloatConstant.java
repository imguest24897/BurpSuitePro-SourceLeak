/*    */ package com.sun.javafx.binding;
/*    */ 
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.value.ChangeListener;
/*    */ import javafx.beans.value.ObservableFloatValue;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class FloatConstant
/*    */   implements ObservableFloatValue
/*    */ {
/*    */   private final float value;
/*    */   
/*    */   private FloatConstant(float paramFloat) {
/* 40 */     this.value = paramFloat;
/*    */   }
/*    */   
/*    */   public static FloatConstant valueOf(float paramFloat) {
/* 44 */     return new FloatConstant(paramFloat);
/*    */   }
/*    */ 
/*    */   
/*    */   public float get() {
/* 49 */     return this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public Float getValue() {
/* 54 */     return Float.valueOf(this.value);
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
/* 89 */     return this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public double doubleValue() {
/* 94 */     return this.value;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\FloatConstant.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */