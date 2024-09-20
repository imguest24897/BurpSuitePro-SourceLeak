/*    */ package com.github.weisj.jsvg.geometry;
/*    */ 
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Shape;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class FillRuleAwareAWTSVGShape
/*    */   extends AWTSVGShape<Path2D>
/*    */ {
/*    */   public FillRuleAwareAWTSVGShape(@NotNull Path2D shape) {
/* 35 */     super(shape);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Shape shape(@NotNull RenderContext context, boolean validate) {
/* 40 */     this.shape.setWindingRule((context.fillRule()).awtWindingRule);
/* 41 */     return super.shape(context, validate);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\geometry\FillRuleAwareAWTSVGShape.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */