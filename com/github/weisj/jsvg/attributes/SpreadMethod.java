/*    */ package com.github.weisj.jsvg.attributes;
/*    */ 
/*    */ import java.awt.MultipleGradientPaint;
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
/*    */ 
/*    */ 
/*    */ public enum SpreadMethod
/*    */ {
/* 29 */   Pad(MultipleGradientPaint.CycleMethod.NO_CYCLE),
/* 30 */   Reflect(MultipleGradientPaint.CycleMethod.REFLECT),
/* 31 */   Repeat(MultipleGradientPaint.CycleMethod.REPEAT);
/*    */   
/*    */   private final MultipleGradientPaint.CycleMethod cycleMethod;
/*    */   
/*    */   SpreadMethod(MultipleGradientPaint.CycleMethod cycleMethod) {
/* 36 */     this.cycleMethod = cycleMethod;
/*    */   }
/*    */   @NotNull
/*    */   public MultipleGradientPaint.CycleMethod cycleMethod() {
/* 40 */     return this.cycleMethod;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\SpreadMethod.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */