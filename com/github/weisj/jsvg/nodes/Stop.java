/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.paint.PaintParser;
/*    */ import com.github.weisj.jsvg.geometry.path.BezierPathCommand;
/*    */ import com.github.weisj.jsvg.geometry.path.PathParser;
/*    */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*    */ import com.github.weisj.jsvg.nodes.animation.Set;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.util.ColorUtil;
/*    */ import java.awt.Color;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ @ElementCategories({Category.Gradient})
/*    */ @PermittedContent(anyOf = {Animate.class, Set.class})
/*    */ public final class Stop
/*    */   extends AbstractSVGNode
/*    */ {
/*    */   public static final String TAG = "stop";
/*    */   private float offset;
/*    */   @NotNull
/* 48 */   private Color color = PaintParser.DEFAULT_COLOR;
/*    */   @Nullable
/*    */   private BezierPathCommand path;
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 54 */     return "stop";
/*    */   }
/*    */   @NotNull
/*    */   public Color color() {
/* 58 */     return this.color;
/*    */   }
/*    */   
/*    */   public float offset() {
/* 62 */     return this.offset;
/*    */   }
/*    */   @Nullable
/*    */   public BezierPathCommand bezierCommand() {
/* 66 */     return this.path;
/*    */   }
/*    */ 
/*    */   
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 71 */     super.build(attributeNode);
/* 72 */     Color c = attributeNode.getColor("stop-color");
/* 73 */     float opacity = attributeNode.getPercentage("stop-opacity", c.getAlpha() / 255.0F);
/* 74 */     this.color = ColorUtil.withAlpha(c, opacity);
/* 75 */     this.offset = attributeNode.getPercentage("offset", 0.0F);
/* 76 */     String pathData = attributeNode.getValue("path");
/* 77 */     this.path = (new PathParser(pathData)).parseMeshCommand();
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 82 */     return "Stop{color=" + this.color + ", offset=" + this.offset + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Stop.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */