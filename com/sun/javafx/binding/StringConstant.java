/*    */ package com.sun.javafx.binding;
/*    */ 
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.binding.StringExpression;
/*    */ import javafx.beans.value.ChangeListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class StringConstant
/*    */   extends StringExpression
/*    */ {
/*    */   private final String value;
/*    */   
/*    */   private StringConstant(String paramString) {
/* 37 */     this.value = paramString;
/*    */   }
/*    */   
/*    */   public static StringConstant valueOf(String paramString) {
/* 41 */     return new StringConstant(paramString);
/*    */   }
/*    */ 
/*    */   
/*    */   public String get() {
/* 46 */     return this.value;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getValue() {
/* 51 */     return this.value;
/*    */   }
/*    */   
/*    */   public void addListener(InvalidationListener paramInvalidationListener) {}
/*    */   
/*    */   public void addListener(ChangeListener<? super String> paramChangeListener) {}
/*    */   
/*    */   public void removeListener(InvalidationListener paramInvalidationListener) {}
/*    */   
/*    */   public void removeListener(ChangeListener<? super String> paramChangeListener) {}
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\StringConstant.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */