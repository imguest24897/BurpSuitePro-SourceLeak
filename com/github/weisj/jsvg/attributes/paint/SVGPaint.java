/*     */ package com.github.weisj.jsvg.attributes.paint;
/*     */ 
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public interface SVGPaint
/*     */ {
/*  33 */   public static final AwtSVGPaint DEFAULT_PAINT = new AwtSVGPaint(PaintParser.DEFAULT_COLOR);
/*  34 */   public static final SVGPaint NONE = new SVGPaint()
/*     */     {
/*     */       public void fillShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {}
/*     */ 
/*     */ 
/*     */       
/*     */       public void drawShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {}
/*     */ 
/*     */ 
/*     */       
/*     */       public String toString() {
/*  45 */         return "SVGPaint.None";
/*     */       }
/*     */     };
/*  48 */   public static final SVGPaint CURRENT_COLOR = new SVGPaint()
/*     */     {
/*     */       public void fillShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds)
/*     */       {
/*  52 */         throw new IllegalStateException("Sentinel color CURRENT_COLOR shouldn't be used for painting directly");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public void drawShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
/*  58 */         throw new IllegalStateException("Sentinel color CURRENT_COLOR shouldn't be used for painting directly");
/*     */       }
/*     */ 
/*     */       
/*     */       public String toString() {
/*  63 */         return "SVGPaint.CurrentColor";
/*     */       }
/*     */     };
/*  66 */   public static final SVGPaint CONTEXT_FILL = new SVGPaint()
/*     */     {
/*     */       public void fillShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds)
/*     */       {
/*  70 */         throw new IllegalStateException("Sentinel color CONTEXT_FILL shouldn't be used for painting directly");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public void drawShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
/*  76 */         throw new IllegalStateException("Sentinel color CONTEXT_FILL shouldn't be used for painting directly");
/*     */       }
/*     */ 
/*     */       
/*     */       public String toString() {
/*  81 */         return "SVGPaint.ContextFill";
/*     */       }
/*     */     };
/*  84 */   public static final SVGPaint CONTEXT_STROKE = new SVGPaint()
/*     */     {
/*     */       public void fillShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds)
/*     */       {
/*  88 */         throw new IllegalStateException("Sentinel color CONTEXT_STROKE shouldn't be used for painting directly");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       public void drawShape(@NotNull Graphics2D g, @NotNull RenderContext context, @NotNull Shape shape, @Nullable Rectangle2D bounds) {
/*  94 */         throw new IllegalStateException("Sentinel color CONTEXT_STROKE shouldn't be used for painting directly");
/*     */       }
/*     */ 
/*     */       
/*     */       public String toString() {
/*  99 */         return "SVGPaint.ContextStroke";
/*     */       }
/*     */     };
/*     */ 
/*     */   
/*     */   void fillShape(@NotNull Graphics2D paramGraphics2D, @NotNull RenderContext paramRenderContext, @NotNull Shape paramShape, @Nullable Rectangle2D paramRectangle2D);
/*     */ 
/*     */   
/*     */   void drawShape(@NotNull Graphics2D paramGraphics2D, @NotNull RenderContext paramRenderContext, @NotNull Shape paramShape, @Nullable Rectangle2D paramRectangle2D);
/*     */   
/*     */   default boolean isVisible() {
/* 110 */     return (this != NONE);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\paint\SVGPaint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */