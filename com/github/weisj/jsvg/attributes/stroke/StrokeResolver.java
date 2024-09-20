/*    */ package com.github.weisj.jsvg.attributes.stroke;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import com.github.weisj.jsvg.geometry.size.Unit;
/*    */ import com.github.weisj.jsvg.renderer.StrokeContext;
/*    */ import java.awt.BasicStroke;
/*    */ import java.awt.Stroke;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class StrokeResolver
/*    */ {
/*    */   @NotNull
/*    */   public static Stroke resolve(float pathLengthFactor, @NotNull MeasureContext measureContext, @NotNull StrokeContext context) {
/* 39 */     Length strokeWidth = context.strokeWidth;
/* 40 */     LineCap lineCap = context.lineCap;
/* 41 */     LineJoin lineJoin = context.lineJoin;
/* 42 */     float miterLimit = context.miterLimit;
/*    */     
/* 44 */     Length[] dashPattern = context.dashPattern;
/* 45 */     Length dashOffset = context.dashOffset;
/*    */     
/* 47 */     assert strokeWidth != null;
/* 48 */     assert lineCap != null;
/* 49 */     assert lineJoin != null;
/* 50 */     assert Length.isSpecified(miterLimit);
/* 51 */     assert dashOffset != null;
/*    */ 
/*    */     
/* 54 */     miterLimit = Math.max(1.0F, miterLimit);
/*    */     
/* 56 */     float[] dashes = new float[dashPattern.length];
/* 57 */     float offsetLength = 0.0F;
/* 58 */     for (int i = 0; i < dashes.length; i++) {
/* 59 */       float dash = dashPattern[i].resolveLength(measureContext);
/* 60 */       if (dashPattern[i].unit() != Unit.PERCENTAGE) {
/* 61 */         dash *= pathLengthFactor;
/*    */       }
/* 63 */       offsetLength += dash;
/* 64 */       dashes[i] = dash;
/*    */     } 
/*    */     
/* 67 */     float phase = dashOffset.resolveLength(measureContext);
/* 68 */     if (dashOffset.unit() != Unit.PERCENTAGE) {
/* 69 */       phase *= pathLengthFactor;
/*    */     }
/* 71 */     if (phase < 0.0F) phase += offsetLength;
/*    */     
/* 73 */     if (dashes.length == 0) {
/* 74 */       return new BasicStroke(strokeWidth.resolveLength(measureContext), lineCap.awtCode(), lineJoin.awtCode(), miterLimit);
/*    */     }
/*    */     
/* 77 */     return new BasicStroke(strokeWidth.resolveLength(measureContext), lineCap.awtCode(), lineJoin.awtCode(), miterLimit, dashes, phase);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\stroke\StrokeResolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */