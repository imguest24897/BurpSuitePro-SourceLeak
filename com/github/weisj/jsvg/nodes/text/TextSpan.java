/*    */ package com.github.weisj.jsvg.nodes.text;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.Anchor;
/*    */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*    */ import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
/*    */ import com.github.weisj.jsvg.nodes.animation.Set;
/*    */ import com.github.weisj.jsvg.nodes.prototype.HasContext;
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
/*    */ @ElementCategories({Category.TextContent, Category.TextContentChild})
/*    */ @PermittedContent(categories = {Category.Descriptive}, anyOf = {Anchor.class, TextSpan.class, Animate.class, AnimateTransform.class, Set.class}, charData = true)
/*    */ public final class TextSpan
/*    */   extends LinearTextContainer
/*    */ {
/*    */   public static final String TAG = "tspan";
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 45 */     return "tspan";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\TextSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */