/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.filter.DefaultFilterChannel;
/*    */ import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
/*    */ import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.geometry.size.Unit;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
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
/*    */ public final class FilterPrimitiveBase
/*    */ {
/*    */   @NotNull
/*    */   final Length x;
/*    */   @NotNull
/*    */   final Length y;
/*    */   @NotNull
/*    */   final Length width;
/*    */   @NotNull
/*    */   final Length height;
/*    */   @NotNull
/*    */   private final FilterChannelKey inputChannel;
/*    */   @NotNull
/*    */   private final FilterChannelKey resultChannel;
/*    */   
/*    */   public FilterPrimitiveBase(@NotNull AttributeNode attributeNode) {
/* 45 */     this.x = attributeNode.getLength("x", Unit.PERCENTAGE.valueOf(0.0F));
/* 46 */     this.y = attributeNode.getLength("y", Unit.PERCENTAGE.valueOf(0.0F));
/* 47 */     this.width = attributeNode.getLength("width", Unit.PERCENTAGE.valueOf(100.0F));
/* 48 */     this.height = attributeNode.getLength("height", Unit.PERCENTAGE.valueOf(100.0F));
/*    */     
/* 50 */     this.inputChannel = attributeNode.getFilterChannelKey("in", DefaultFilterChannel.LastResult);
/* 51 */     this.resultChannel = attributeNode.getFilterChannelKey("result", DefaultFilterChannel.LastResult);
/*    */   }
/*    */   @NotNull
/*    */   public Channel channel(@NotNull FilterChannelKey key, @NotNull FilterContext context) {
/* 55 */     return context.getChannel(key);
/*    */   }
/*    */   @NotNull
/*    */   public Channel inputChannel(@NotNull FilterContext context) {
/* 59 */     return channel(this.inputChannel, context);
/*    */   }
/*    */   @NotNull
/*    */   public LayoutBounds layoutInput(@NotNull FilterLayoutContext context) {
/* 63 */     return context.resultChannels().get(this.inputChannel);
/*    */   }
/*    */   
/*    */   public void noop(@NotNull FilterContext context) {
/* 67 */     saveResult(inputChannel(context), context);
/*    */   }
/*    */   
/*    */   public void saveLayoutResult(@NotNull LayoutBounds outputBounds, @NotNull FilterLayoutContext filterLayoutContext) {
/* 71 */     saveResultImpl(outputBounds, filterLayoutContext.resultChannels());
/*    */   }
/*    */   
/*    */   public void saveResult(@NotNull Channel output, @NotNull FilterContext filterContext) {
/* 75 */     saveResultImpl(output, filterContext.resultChannels());
/*    */   }
/*    */   
/*    */   private <T> void saveResultImpl(@NotNull T value, @NotNull ChannelStorage<T> storage) {
/* 79 */     storage.addResult(this.resultChannel, value);
/* 80 */     if (this.resultChannel != DefaultFilterChannel.LastResult)
/* 81 */       storage.addResult((FilterChannelKey)DefaultFilterChannel.LastResult, value); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FilterPrimitiveBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */