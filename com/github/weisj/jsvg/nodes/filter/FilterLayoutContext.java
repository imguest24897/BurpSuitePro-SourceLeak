/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.UnitType;
/*    */ import com.github.weisj.jsvg.attributes.filter.LayoutBounds;
/*    */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*    */ import java.awt.geom.Rectangle2D;
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
/*    */ public final class FilterLayoutContext
/*    */ {
/*    */   @NotNull
/*    */   private final UnitType primitiveUnits;
/*    */   @NotNull
/*    */   private final Rectangle2D elementBounds;
/*    */   @NotNull
/* 34 */   private final ChannelStorage<LayoutBounds> resultChannels = new ChannelStorage<>();
/*    */   
/*    */   @NotNull
/*    */   private final Rectangle2D clipBounds;
/*    */ 
/*    */   
/*    */   public FilterLayoutContext(@NotNull UnitType primitiveUnits, @NotNull Rectangle2D elementBounds, @NotNull Rectangle2D clipBounds) {
/* 41 */     this.primitiveUnits = primitiveUnits;
/* 42 */     this.elementBounds = elementBounds;
/* 43 */     this.clipBounds = clipBounds;
/*    */   }
/*    */   @NotNull
/*    */   public UnitType primitiveUnits() {
/* 47 */     return this.primitiveUnits;
/*    */   }
/*    */   @NotNull
/*    */   public Rectangle2D elementBounds() {
/* 51 */     return this.elementBounds;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Rectangle2D filterPrimitiveRegion(@NotNull MeasureContext context, @NotNull FilterPrimitive filterPrimitive) {
/* 56 */     return this.primitiveUnits.computeViewBounds(context, this.elementBounds, filterPrimitive
/* 57 */         .x(), filterPrimitive.y(), filterPrimitive.width(), filterPrimitive.height());
/*    */   }
/*    */   @NotNull
/*    */   public ChannelStorage<LayoutBounds> resultChannels() {
/* 61 */     return this.resultChannels;
/*    */   }
/*    */   @NotNull
/*    */   public Rectangle2D clipBounds() {
/* 65 */     return this.clipBounds;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\FilterLayoutContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */