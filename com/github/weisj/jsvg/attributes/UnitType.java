/*    */ package com.github.weisj.jsvg.attributes;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import java.awt.geom.AffineTransform;
/*    */ import java.awt.geom.Rectangle2D;
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
/*    */ public enum UnitType
/*    */ {
/* 33 */   UserSpaceOnUse,
/* 34 */   ObjectBoundingBox;
/*    */   
/*    */   @NotNull
/*    */   public MeasureContext deriveMeasure(@NotNull MeasureContext measure) {
/* 38 */     return deriveMeasure(measure, 1.0D, 1.0D);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public MeasureContext deriveMeasure(@NotNull MeasureContext measure, double objectWidth, double objectHeight) {
/* 43 */     if (this == ObjectBoundingBox) {
/* 44 */       return measure.derive((float)objectWidth, (float)objectHeight);
/*    */     }
/* 46 */     return measure;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public AffineTransform viewTransform(@NotNull Rectangle2D bounds) {
/* 51 */     if (this == ObjectBoundingBox) {
/* 52 */       AffineTransform at = AffineTransform.getTranslateInstance(bounds.getX(), bounds.getY());
/* 53 */       at.scale(bounds.getWidth(), bounds.getHeight());
/* 54 */       return at;
/*    */     } 
/* 56 */     return new AffineTransform();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public Rectangle2D.Double computeViewBounds(@NotNull MeasureContext measure, @NotNull Rectangle2D elementBounds, @NotNull Length x, @NotNull Length y, @NotNull Length width, @NotNull Length height) {
/* 63 */     MeasureContext patternMeasure = deriveMeasure(measure, elementBounds.getWidth(), elementBounds.getHeight());
/*    */ 
/*    */     
/* 66 */     Rectangle2D.Double viewBounds = new Rectangle2D.Double(x.resolveWidth(patternMeasure), y.resolveHeight(patternMeasure), width.resolveWidth(patternMeasure), height.resolveHeight(patternMeasure));
/* 67 */     if (this == ObjectBoundingBox) {
/* 68 */       viewBounds.x += elementBounds.getX();
/* 69 */       viewBounds.y += elementBounds.getY();
/*    */     } 
/* 71 */     return viewBounds;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\UnitType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */