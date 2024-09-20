/*     */ package com.github.weisj.jsvg;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.ViewBox;
/*     */ import com.github.weisj.jsvg.attributes.font.SVGFont;
/*     */ import com.github.weisj.jsvg.geometry.size.FloatSize;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.nodes.SVG;
/*     */ import com.github.weisj.jsvg.nodes.SVGNode;
/*     */ import com.github.weisj.jsvg.renderer.NodeRenderer;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.RenderingHints;
/*     */ import java.awt.Shape;
/*     */ import java.util.Objects;
/*     */ import javax.swing.JComponent;
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
/*     */ public final class SVGDocument
/*     */ {
/*     */   private static final boolean DEBUG = false;
/*     */   @NotNull
/*     */   private final SVG root;
/*     */   @NotNull
/*     */   private final FloatSize size;
/*     */   
/*     */   public SVGDocument(@NotNull SVG root) {
/*  46 */     this.root = root;
/*  47 */     float em = SVGFont.defaultFontSize();
/*  48 */     this.size = root.sizeForTopLevel(em, SVGFont.exFromEm(em));
/*     */   }
/*     */   @NotNull
/*     */   public FloatSize size() {
/*  52 */     return this.size;
/*     */   }
/*     */   
/*     */   public void render(@Nullable JComponent component, @NotNull Graphics2D g) {
/*  56 */     render(component, g, null);
/*     */   }
/*     */   
/*     */   public void render(@Nullable JComponent component, @NotNull Graphics2D graphics2D, @Nullable ViewBox bounds) {
/*  60 */     Graphics2D g = (Graphics2D)graphics2D.create();
/*  61 */     setupSVGRenderingHints(g);
/*     */     
/*  63 */     Font f = g.getFont();
/*  64 */     if (f == null && component != null) f = component.getFont(); 
/*  65 */     float defaultEm = (f != null) ? f.getSize2D() : SVGFont.defaultFontSize();
/*  66 */     float defaultEx = SVGFont.exFromEm(defaultEm);
/*     */ 
/*     */ 
/*     */     
/*  70 */     MeasureContext initialMeasure = (bounds != null) ? MeasureContext.createInitial(bounds.size(), defaultEm, defaultEx) : MeasureContext.createInitial(this.root.sizeForTopLevel(defaultEm, defaultEx), defaultEm, defaultEx);
/*  71 */     RenderContext context = RenderContext.createInitial(component, initialMeasure);
/*     */     
/*  73 */     if (bounds == null) bounds = new ViewBox(this.root.size(context));
/*     */     
/*  75 */     this.root.applyTransform(g, context);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     g.clip((Shape)bounds);
/*  85 */     g.translate(bounds.x, bounds.y);
/*     */     
/*  87 */     NodeRenderer.Info info = NodeRenderer.createRenderInfo((SVGNode)this.root, context, g, null); 
/*  88 */     try { Objects.requireNonNull(info);
/*  89 */       this.root.renderWithSize(bounds.size(), this.root.viewBox(context), info.context, info.g);
/*  90 */       if (info != null) info.close();  } catch (Throwable throwable) { if (info != null)
/*     */         try { info.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }
/*  92 */      g.dispose();
/*     */   }
/*     */   
/*     */   private void setupSVGRenderingHints(@NotNull Graphics2D g) {
/*  96 */     Object aaHint = g.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
/*  97 */     if (aaHint != RenderingHints.VALUE_ANTIALIAS_DEFAULT) setSVGRenderingHint(g, SVGRenderingHints.KEY_IMAGE_ANTIALIASING, 
/*     */           
/*  99 */           (aaHint == RenderingHints.VALUE_ANTIALIAS_ON) ? 
/* 100 */           SVGRenderingHints.VALUE_IMAGE_ANTIALIASING_ON : 
/* 101 */           SVGRenderingHints.VALUE_IMAGE_ANTIALIASING_OFF); 
/*     */   }
/*     */   
/*     */   private void setSVGRenderingHint(@NotNull Graphics2D g, @NotNull RenderingHints.Key key, @NotNull Object o) {
/* 105 */     if (g.getRenderingHint(key) == null)
/* 106 */       g.setRenderingHint(key, o); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\SVGDocument.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */