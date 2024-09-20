/*    */ package com.github.weisj.jsvg.attributes.paint;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Paint;
/*    */ import java.util.Objects;
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
/*    */ public final class AwtSVGPaint
/*    */   implements SimplePaintSVGPaint
/*    */ {
/*    */   @NotNull
/*    */   private final Paint paint;
/*    */   
/*    */   public AwtSVGPaint(@NotNull Paint paint) {
/* 35 */     this.paint = paint;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Paint paint() {
/* 40 */     return this.paint;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean equals(Object o) {
/* 45 */     if (this == o) return true; 
/* 46 */     if (!(o instanceof AwtSVGPaint)) return false; 
/* 47 */     AwtSVGPaint that = (AwtSVGPaint)o;
/* 48 */     return this.paint.equals(that.paint);
/*    */   }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/* 53 */     return Objects.hash(new Object[] { this.paint });
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 58 */     return "AwtSVGPaint{paint=" + 
/* 59 */       formatPaint() + '}';
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private String formatPaint() {
/* 64 */     if (this.paint instanceof Color) {
/* 65 */       Color c = (Color)this.paint;
/* 66 */       return "Color{r=" + c
/* 67 */         .getRed() + ",g=" + c
/* 68 */         .getGreen() + ",b=" + c
/* 69 */         .getBlue() + ",a=" + c
/* 70 */         .getAlpha() + "}";
/*    */     } 
/* 72 */     return this.paint.toString();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\paint\AwtSVGPaint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */