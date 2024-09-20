/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.UnitType;
/*    */ import com.github.weisj.jsvg.attributes.filter.FilterChannelKey;
/*    */ import java.awt.RenderingHints;
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
/*    */ public final class FilterContext
/*    */ {
/*    */   private final Filter.FilterInfo info;
/*    */   @NotNull
/*    */   private final UnitType primitiveUnits;
/*    */   @NotNull
/* 33 */   private final ChannelStorage<Channel> resultChannels = new ChannelStorage<>();
/*    */   
/*    */   @NotNull
/*    */   private final RenderingHints renderingHints;
/*    */ 
/*    */   
/*    */   public FilterContext(@NotNull Filter.FilterInfo info, @NotNull UnitType primitiveUnits, @NotNull RenderingHints renderingHints) {
/* 40 */     this.info = info;
/* 41 */     this.primitiveUnits = primitiveUnits;
/* 42 */     this.renderingHints = renderingHints;
/*    */   }
/*    */   @NotNull
/*    */   public Filter.FilterInfo info() {
/* 46 */     return this.info;
/*    */   }
/*    */   @NotNull
/*    */   public UnitType primitiveUnits() {
/* 50 */     return this.primitiveUnits;
/*    */   }
/*    */   @NotNull
/*    */   public RenderingHints renderingHints() {
/* 54 */     return this.renderingHints;
/*    */   }
/*    */   @NotNull
/*    */   public ChannelStorage<Channel> resultChannels() {
/* 58 */     return this.resultChannels;
/*    */   }
/*    */   @NotNull
/*    */   public Channel getChannel(@NotNull FilterChannelKey key) {
/* 62 */     return this.resultChannels.get(key);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FilterContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */