/*    */ package com.github.weisj.jsvg.attributes.font;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.HasMatchName;
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.geometry.size.Unit;
/*    */ import com.google.errorprone.annotations.Immutable;
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
/*    */ @Immutable
/*    */ public enum PredefinedFontSize
/*    */   implements HasMatchName, FontSize
/*    */ {
/* 33 */   xxSmall("xx-small", 0.6F),
/* 34 */   xSmall("x-small", 0.75F),
/* 35 */   small(0.8888889F),
/* 36 */   medium(1.0F),
/* 37 */   large(1.2F),
/* 38 */   xLarge("x-large", 1.5F),
/* 39 */   xxLarge("xx-large", 2.0F),
/* 40 */   xxxLarge("xxx-large", 3.0F),
/* 41 */   larger(1.3F),
/* 42 */   smaller(0.7F),
/* 43 */   Number(0.0F);
/*    */   @NotNull
/*    */   private final String matchName;
/*    */   private final float scalingFactor;
/*    */   
/*    */   PredefinedFontSize(String matchName, float scalingFactor) {
/* 49 */     this.matchName = matchName;
/* 50 */     this.scalingFactor = scalingFactor;
/*    */   }
/*    */   
/*    */   PredefinedFontSize(float scalingFactor) {
/* 54 */     this.scalingFactor = scalingFactor;
/* 55 */     this.matchName = name();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String matchName() {
/* 60 */     return this.matchName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Length size(@NotNull Length parentSize) {
/* 65 */     if (this == Number) throw new UnsupportedOperationException("Number font-size needs to parsed explicitly"); 
/* 66 */     if (this == smaller || this == larger) return parentSize.multiply(this.scalingFactor); 
/* 67 */     return Unit.Raw.valueOf(SVGFont.defaultFontSize() * this.scalingFactor);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\font\PredefinedFontSize.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */