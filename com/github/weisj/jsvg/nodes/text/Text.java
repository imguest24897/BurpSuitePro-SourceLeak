/*    */ package com.github.weisj.jsvg.nodes.text;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.Anchor;
/*    */ import com.github.weisj.jsvg.nodes.prototype.HasContext;
/*    */ import com.github.weisj.jsvg.nodes.prototype.HasGeometryContext;
/*    */ import com.github.weisj.jsvg.nodes.prototype.impl.HasGeometryContextImpl;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Shape;
/*    */ import java.awt.geom.Path2D;
/*    */ import java.awt.geom.Rectangle2D;
/*    */ import java.util.List;
/*    */ import java.util.Set;
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
/*    */ @ElementCategories({Category.Graphic, Category.TextContent})
/*    */ @PermittedContent(categories = {Category.Animation, Category.Descriptive, Category.TextContentChild}, anyOf = {Anchor.class}, charData = true)
/*    */ public final class Text
/*    */   extends LinearTextContainer
/*    */   implements HasGeometryContext.ByDelegate
/*    */ {
/*    */   public static final String TAG = "text";
/*    */   private HasGeometryContext geometryContext;
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 48 */     return "text";
/*    */   }
/*    */ 
/*    */   
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 53 */     super.build(attributeNode);
/* 54 */     this.geometryContext = HasGeometryContextImpl.parse(attributeNode);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public HasGeometryContext geometryContextDelegate() {
/* 59 */     return this.geometryContext;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\Text.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */