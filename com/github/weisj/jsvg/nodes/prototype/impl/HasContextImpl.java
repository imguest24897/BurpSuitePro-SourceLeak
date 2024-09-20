/*    */ package com.github.weisj.jsvg.nodes.prototype.impl;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.FillRule;
/*    */ import com.github.weisj.jsvg.attributes.font.AttributeFontSpec;
/*    */ import com.github.weisj.jsvg.attributes.font.FontParser;
/*    */ import com.github.weisj.jsvg.attributes.font.MeasurableFontSpec;
/*    */ import com.github.weisj.jsvg.nodes.prototype.HasContext;
/*    */ import com.github.weisj.jsvg.nodes.prototype.Mutator;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
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
/*    */ public final class HasContextImpl
/*    */   implements HasContext
/*    */ {
/*    */   @NotNull
/*    */   private final PaintContext paintContext;
/*    */   @NotNull
/*    */   private final FontRenderContext fontRenderContext;
/*    */   @NotNull
/*    */   private final AttributeFontSpec fontSpec;
/*    */   @NotNull
/*    */   private final FillRule fillRule;
/*    */   
/*    */   private HasContextImpl(@NotNull PaintContext paintContext, @NotNull FontRenderContext fontRenderContext, @NotNull AttributeFontSpec fontSpec, @NotNull FillRule fillRule) {
/* 45 */     this.paintContext = paintContext;
/* 46 */     this.fontRenderContext = fontRenderContext;
/* 47 */     this.fontSpec = fontSpec;
/* 48 */     this.fillRule = fillRule;
/*    */   }
/*    */   @NotNull
/*    */   public static HasContext parse(@NotNull AttributeNode attributeNode) {
/* 52 */     return new HasContextImpl(
/* 53 */         PaintContext.parse(attributeNode), 
/* 54 */         FontRenderContext.parse(attributeNode), 
/* 55 */         FontParser.parseFontSpec(attributeNode), 
/* 56 */         FillRule.parse(attributeNode));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public FillRule fillRule() {
/* 61 */     return this.fillRule;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Mutator<MeasurableFontSpec> fontSpec() {
/* 66 */     return (Mutator<MeasurableFontSpec>)this.fontSpec;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public FontRenderContext fontRenderContext() {
/* 71 */     return this.fontRenderContext;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Mutator<PaintContext> paintContext() {
/* 76 */     return (Mutator<PaintContext>)this.paintContext;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\impl\HasContextImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */