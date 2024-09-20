/*    */ package com.install4j.runtime.beans;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.util.function.Supplier;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class LazyColor
/*    */   extends DynamicLightOrDarkColor {
/*    */   public LazyColor(@NotNull Supplier<Color> colorSupplier) {
/* 10 */     super(colorSupplier, colorSupplier);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\LazyColor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */