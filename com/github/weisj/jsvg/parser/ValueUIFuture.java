/*    */ package com.github.weisj.jsvg.parser;
/*    */ 
/*    */ import javax.swing.JComponent;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class ValueUIFuture<T>
/*    */   implements UIFuture<T>
/*    */ {
/*    */   private final T value;
/*    */   
/*    */   public ValueUIFuture(T value) {
/* 33 */     this.value = value;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean checkIfReady(@Nullable JComponent component) {
/* 38 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public T get() {
/* 43 */     return this.value;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\parser\ValueUIFuture.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */