/*     */ package com.github.weisj.jsvg.nodes.filter;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
/*     */ import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
/*     */ import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.nodes.container.ContainerNode;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.GraphicsUtil;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.util.List;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ 
/*     */ 
/*     */ @ElementCategories({Category.FilterPrimitive})
/*     */ @PermittedContent(anyOf = {FeMergeNode.class})
/*     */ public final class FeMerge
/*     */   extends ContainerNode
/*     */   implements FilterPrimitive
/*     */ {
/*     */   public static final String TAG = "feMerge";
/*     */   private FilterPrimitiveBase filterPrimitiveBase;
/*     */   private FilterChannelKey[] inputChannels;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  54 */     return "feMerge";
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  59 */     super.build(attributeNode);
/*     */     
/*  61 */     this.filterPrimitiveBase = new FilterPrimitiveBase(attributeNode);
/*     */     
/*  63 */     List<FeMergeNode> nodes = childrenOfType(FeMergeNode.class);
/*  64 */     this.inputChannels = new FilterChannelKey[nodes.size()];
/*  65 */     for (int i = 0; i < this.inputChannels.length; i++) {
/*  66 */       this.inputChannels[i] = ((FeMergeNode)nodes.get(i)).inputChannel();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isValid() {
/*  72 */     return (this.inputChannels.length > 0);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Length x() {
/*  77 */     return this.filterPrimitiveBase.x;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Length y() {
/*  82 */     return this.filterPrimitiveBase.y;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Length width() {
/*  87 */     return this.filterPrimitiveBase.width;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Length height() {
/*  92 */     return this.filterPrimitiveBase.height;
/*     */   }
/*     */ 
/*     */   
/*     */   public void layoutFilter(@NotNull RenderContext context, @NotNull FilterLayoutContext filterLayoutContext) {
/*  97 */     if (this.inputChannels.length == 0) {
/*  98 */       this.filterPrimitiveBase.saveLayoutResult(filterLayoutContext
/*  99 */           .resultChannels().get((FilterChannelKey)DefaultFilterChannel.SourceGraphic), filterLayoutContext);
/*     */       
/*     */       return;
/*     */     } 
/* 103 */     LayoutBounds result = filterLayoutContext.resultChannels().get(this.inputChannels[0]);
/* 104 */     for (int i = 1; i < this.inputChannels.length; i++) {
/* 105 */       LayoutBounds channelBounds = filterLayoutContext.resultChannels().get(this.inputChannels[i]);
/* 106 */       result = result.union(channelBounds);
/*     */     } 
/* 108 */     this.filterPrimitiveBase.saveLayoutResult(result, filterLayoutContext);
/*     */   }
/*     */ 
/*     */   
/*     */   public void applyFilter(@NotNull RenderContext context, @NotNull FilterContext filterContext) {
/* 113 */     if (this.inputChannels.length == 0) {
/* 114 */       this.filterPrimitiveBase.saveResult(this.filterPrimitiveBase
/* 115 */           .channel((FilterChannelKey)DefaultFilterChannel.SourceGraphic, filterContext), filterContext);
/*     */       
/*     */       return;
/*     */     } 
/* 119 */     Channel in = this.filterPrimitiveBase.channel(this.inputChannels[0], filterContext);
/* 120 */     Channel result = in;
/* 121 */     if (this.inputChannels.length > 1) {
/* 122 */       BufferedImage dst = in.toBufferedImageNonAliased(context);
/* 123 */       Graphics2D imgGraphics = GraphicsUtil.createGraphics(dst);
/* 124 */       for (int i = 1; i < this.inputChannels.length; i++) {
/* 125 */         Channel channel = this.filterPrimitiveBase.channel(this.inputChannels[i], filterContext);
/* 126 */         imgGraphics.drawImage(context.createImage(channel.producer()), null, context.targetComponent());
/*     */       } 
/* 128 */       result = new ImageProducerChannel(dst.getSource());
/*     */     } 
/* 130 */     this.filterPrimitiveBase.saveResult(result, filterContext);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FeMerge.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */