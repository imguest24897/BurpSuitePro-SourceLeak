/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
/*    */ import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
/*    */ import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.renderer.GraphicsUtil;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Composite;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Image;
/*    */ import java.awt.geom.AffineTransform;
/*    */ import java.awt.image.BufferedImage;
/*    */ import org.jetbrains.annotations.MustBeInvokedByOverriders;
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
/*    */ abstract class AbstractCompositeFilterPrimitive
/*    */   extends AbstractFilterPrimitive
/*    */ {
/*    */   private FilterChannelKey inputChannel2;
/*    */   
/*    */   @MustBeInvokedByOverriders
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 43 */     super.build(attributeNode);
/* 44 */     this.inputChannel2 = attributeNode.getFilterChannelKey("in2", DefaultFilterChannel.LastResult);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private Channel sourceChannel(@NotNull FilterPrimitiveBase impl, @NotNull FilterContext filterContext) {
/* 50 */     return impl.inputChannel(filterContext);
/*    */   } @NotNull
/*    */   protected abstract Composite composite();
/*    */   @NotNull
/*    */   private Channel destinationChannel(@NotNull FilterPrimitiveBase impl, @NotNull FilterContext filterContext) {
/* 55 */     return impl.channel(this.inputChannel2, filterContext);
/*    */   }
/*    */ 
/*    */   
/*    */   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
/* 60 */     LayoutBounds in = impl().layoutInput(filterLayoutContext);
/* 61 */     LayoutBounds in2 = filterLayoutContext.resultChannels().get(this.inputChannel2);
/* 62 */     impl().saveLayoutResult(in.union(in2), filterLayoutContext);
/*    */   }
/*    */ 
/*    */   
/*    */   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
/* 67 */     FilterPrimitiveBase impl = impl();
/* 68 */     BufferedImage dst = destinationChannel(impl, filterContext).toBufferedImageNonAliased(context);
/*    */     
/* 70 */     Image other = context.createImage(sourceChannel(impl, filterContext).producer());
/* 71 */     Graphics2D imgGraphics = GraphicsUtil.createGraphics(dst);
/* 72 */     imgGraphics.setComposite(composite());
/* 73 */     imgGraphics.drawImage(other, (AffineTransform)null, context.targetComponent());
/* 74 */     imgGraphics.dispose();
/*    */     
/* 76 */     impl.saveResult(new ImageProducerChannel(dst.getSource()), filterContext);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\AbstractCompositeFilterPrimitive.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */