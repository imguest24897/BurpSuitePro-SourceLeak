/*    */ package com.github.weisj.jsvg.util;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ public final class ConstantProvider<T>
/*    */   implements Provider<T>
/*    */ {
/*    */   @NotNull
/*    */   private final T t;
/*    */   
/*    */   public ConstantProvider(@NotNull T t) {
/* 30 */     this.t = t;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public T get() {
/* 35 */     return this.t;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsv\\util\ConstantProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */