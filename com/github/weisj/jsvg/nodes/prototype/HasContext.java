/*    */ package com.github.weisj.jsvg.nodes.prototype;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.FillRule;
/*    */ import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
/*    */ import com.github.weisj.jsvg.renderer.FontRenderContext;
/*    */ import com.github.weisj.jsvg.renderer.PaintContext;
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
/*    */ 
/*    */ public interface HasContext
/*    */   extends HasPaintContext, HasFontContext, HasFontRenderContext, HasFillRule
/*    */ {
/*    */   public static interface ByDelegate
/*    */     extends HasContext
/*    */   {
/*    */     @NotNull
/*    */     HasContext contextDelegate();
/*    */     
/*    */     @NotNull
/*    */     default FillRule fillRule() {
/* 45 */       return contextDelegate().fillRule();
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     default Mutator<MeasurableFontSpec> fontSpec() {
/* 50 */       return contextDelegate().fontSpec();
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     default FontRenderContext fontRenderContext() {
/* 55 */       return contextDelegate().fontRenderContext();
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     default Mutator<PaintContext> paintContext() {
/* 60 */       return contextDelegate().paintContext();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\HasContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */