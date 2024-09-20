/*    */ package com.github.weisj.jsvg.util;
/*    */ 
/*    */ import java.util.function.Supplier;
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
/*    */ 
/*    */ public final class LazyProvider<T>
/*    */   implements Provider<T>
/*    */ {
/*    */   @NotNull
/*    */   private final Supplier<T> supplier;
/*    */   private T t;
/*    */   
/*    */   public LazyProvider(@NotNull Supplier<T> supplier) {
/* 33 */     this.supplier = supplier;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public T get() {
/* 38 */     if (this.t == null) this.t = this.supplier.get(); 
/* 39 */     return this.t;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsv\\util\LazyProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */