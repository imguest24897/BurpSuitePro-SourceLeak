/*    */ package com.github.weisj.jsvg.nodes.text;
/*    */ 
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.geom.Path2D;
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
/*    */ interface TextSegment
/*    */ {
/*    */   public static interface RenderableSegment
/*    */     extends TextSegment
/*    */   {
/*    */     void prepareSegmentForRendering(@NotNull GlyphCursor param1GlyphCursor, @NotNull RenderContext param1RenderContext);
/*    */     
/*    */     void renderSegmentWithoutLayout(@NotNull GlyphCursor param1GlyphCursor, @NotNull RenderContext param1RenderContext, @NotNull Graphics2D param1Graphics2D);
/*    */     
/*    */     boolean hasFixedLength();
/*    */     
/*    */     @NotNull
/*    */     TextMetrics computeTextMetrics(@NotNull RenderContext param1RenderContext, @NotNull UseTextLengthForCalculation param1UseTextLengthForCalculation);
/*    */     
/*    */     void appendTextShape(@NotNull GlyphCursor param1GlyphCursor, @NotNull Path2D param1Path2D, @NotNull RenderContext param1RenderContext);
/*    */     
/*    */     public enum UseTextLengthForCalculation
/*    */     {
/* 42 */       YES,
/* 43 */       NO;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\TextSegment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */