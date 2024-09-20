/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
/*    */ import com.github.weisj.jsvg.attributes.paint.AwtSVGPaint;
/*    */ import com.github.weisj.jsvg.attributes.paint.SVGPaint;
/*    */ import com.github.weisj.jsvg.geometry.size.FloatInsets;
/*    */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*    */ import com.github.weisj.jsvg.nodes.animation.Set;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.renderer.GraphicsUtil;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.AlphaComposite;
/*    */ import java.awt.Color;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Rectangle;
/*    */ import java.awt.image.BufferedImage;
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
/*    */ @ElementCategories({Category.FilterPrimitive})
/*    */ @PermittedContent(anyOf = {Animate.class, Set.class})
/*    */ public final class FeFlood
/*    */   extends AbstractFilterPrimitive
/*    */ {
/*    */   public static final String TAG = "feflood";
/*    */   private SVGPaint floodColor;
/*    */   private float floodOpacity;
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 54 */     return "feflood";
/*    */   }
/*    */ 
/*    */   
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 59 */     super.build(attributeNode);
/* 60 */     this.floodColor = attributeNode.getPaint("flood-color", (SVGPaint)new AwtSVGPaint(Color.BLACK));
/* 61 */     this.floodOpacity = attributeNode.getPercentage("flood-opacity", 1.0F);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
/* 67 */     LayoutBounds layoutBounds = new LayoutBounds(filterLayoutContext.filterPrimitiveRegion(context.measureContext(), this), new FloatInsets());
/*    */     
/* 69 */     impl().saveLayoutResult(layoutBounds, filterLayoutContext);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
/* 76 */     Filter.FilterInfo info = filterContext.info();
/* 77 */     BufferedImage img = new BufferedImage(info.imageWidth, info.imageHeight, 2);
/* 78 */     if (this.floodOpacity != 0.0F) {
/* 79 */       Graphics2D graphics = GraphicsUtil.createGraphics(img);
/* 80 */       graphics.setComposite(AlphaComposite.Src.derive(this.floodOpacity));
/* 81 */       Rectangle rect = new Rectangle(0, 0, img.getWidth(), img.getHeight());
/* 82 */       this.floodColor.fillShape(graphics, context, rect, rect);
/* 83 */       graphics.dispose();
/*    */     } 
/* 85 */     impl().saveResult(new ImageProducerChannel(img.getSource()), filterContext);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FeFlood.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */