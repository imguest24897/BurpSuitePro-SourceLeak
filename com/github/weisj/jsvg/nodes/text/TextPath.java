/*     */ package com.github.weisj.jsvg.nodes.text;
/*     */ 
/*     */ import com.github.weisj.jsvg.attributes.FillRule;
/*     */ import com.github.weisj.jsvg.attributes.text.GlyphRenderMethod;
/*     */ import com.github.weisj.jsvg.attributes.text.Side;
/*     */ import com.github.weisj.jsvg.attributes.text.Spacing;
/*     */ import com.github.weisj.jsvg.geometry.SVGShape;
/*     */ import com.github.weisj.jsvg.geometry.size.Length;
/*     */ import com.github.weisj.jsvg.geometry.size.MeasureContext;
/*     */ import com.github.weisj.jsvg.geometry.util.ReversePathIterator;
/*     */ import com.github.weisj.jsvg.nodes.Anchor;
/*     */ import com.github.weisj.jsvg.nodes.ShapeNode;
/*     */ import com.github.weisj.jsvg.nodes.animation.Animate;
/*     */ import com.github.weisj.jsvg.nodes.animation.AnimateTransform;
/*     */ import com.github.weisj.jsvg.nodes.animation.Set;
/*     */ import com.github.weisj.jsvg.nodes.prototype.HasContext;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*     */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*     */ import com.github.weisj.jsvg.parser.AttributeNode;
/*     */ import com.github.weisj.jsvg.renderer.RenderContext;
/*     */ import com.github.weisj.jsvg.util.PathUtil;
/*     */ import java.awt.BasicStroke;
/*     */ import java.awt.Color;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.Shape;
/*     */ import java.awt.geom.Line2D;
/*     */ import java.awt.geom.Path2D;
/*     */ import java.awt.geom.PathIterator;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ @ElementCategories({Category.Graphic, Category.TextContent, Category.TextContentChild})
/*     */ @PermittedContent(categories = {Category.Descriptive}, anyOf = {Anchor.class, TextSpan.class, Animate.class, AnimateTransform.class, Set.class}, charData = true)
/*     */ public final class TextPath
/*     */   extends TextContainer
/*     */ {
/*     */   public static final String TAG = "textpath";
/*     */   private static final boolean DEBUG = false;
/*     */   private SVGShape pathShape;
/*     */   private Spacing spacing;
/*     */   private GlyphRenderMethod renderMethod;
/*     */   private Side side;
/*     */   private Length startOffset;
/*     */   
/*     */   @NotNull
/*     */   public String tagName() {
/*  74 */     return "textpath";
/*     */   }
/*     */ 
/*     */   
/*     */   public void build(@NotNull AttributeNode attributeNode) {
/*  79 */     super.build(attributeNode);
/*  80 */     this.renderMethod = (GlyphRenderMethod)attributeNode.getEnum("method", (Enum)GlyphRenderMethod.Align);
/*  81 */     this.side = (Side)attributeNode.getEnum("side", (Enum)Side.Left);
/*  82 */     this.spacing = (Spacing)attributeNode.getEnum("spacing", (Enum)Spacing.Auto);
/*     */     
/*  84 */     this.startOffset = attributeNode.getLength("startOffset", 0.0F);
/*     */     
/*  86 */     String pathData = attributeNode.getValue("path");
/*  87 */     if (pathData != null) {
/*  88 */       this.pathShape = (SVGShape)PathUtil.parseFromPathData(pathData, FillRule.EvenOdd);
/*     */     } else {
/*  90 */       String href = attributeNode.getHref();
/*     */       
/*  92 */       ShapeNode shaped = (ShapeNode)attributeNode.getElementByHref(ShapeNode.class, Category.Shape, href);
/*  93 */       if (shaped != null) {
/*  94 */         this.pathShape = (SVGShape)shaped.shape();
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isVisible(@NotNull RenderContext context) {
/* 101 */     return (this.pathShape != null && super.isVisible(context));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Shape untransformedElementShape(@NotNull RenderContext context) {
/* 106 */     Path2D textPath = new Path2D.Float();
/* 107 */     appendTextShape(createCursor(context), textPath, context);
/* 108 */     return textPath;
/*     */   }
/*     */ 
/*     */   
/*     */   public void render(@NotNull RenderContext context, @NotNull Graphics2D g) {
/* 113 */     renderSegment(createCursor(context), context, g);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private PathGlyphCursor createCursor(@NotNull RenderContext context) {
/* 122 */     return new PathGlyphCursor(
/* 123 */         createPathIterator(context), this.startOffset
/* 124 */         .resolveLength(context.measureContext()));
/*     */   }
/*     */   
/*     */   private void paintDebugPath(@NotNull RenderContext context, @NotNull Graphics2D g) {
/* 128 */     PathIterator pathIterator = createPathIterator(context);
/* 129 */     float startX = 0.0F;
/* 130 */     float startY = 0.0F;
/* 131 */     float curX = 0.0F;
/* 132 */     float curY = 0.0F;
/* 133 */     g.setStroke(new BasicStroke(0.5F));
/* 134 */     float[] cord = new float[2];
/* 135 */     while (!pathIterator.isDone()) {
/* 136 */       switch (pathIterator.currentSegment(cord)) {
/*     */         case 1:
/* 138 */           g.setColor(Color.MAGENTA);
/* 139 */           g.draw(new Line2D.Float(curX, curY, cord[0], cord[1]));
/* 140 */           g.setColor(Color.RED);
/* 141 */           g.fillRect((int)curX - 2, (int)curY - 2, 4, 4);
/* 142 */           g.fillRect((int)cord[0] - 2, (int)cord[1] - 2, 4, 4);
/* 143 */           curX = cord[0];
/* 144 */           curY = cord[1];
/*     */           break;
/*     */         case 0:
/* 147 */           curX = cord[0];
/* 148 */           curY = cord[1];
/* 149 */           startX = curX;
/* 150 */           startY = curY;
/*     */           break;
/*     */         case 4:
/* 153 */           g.setColor(Color.MAGENTA);
/* 154 */           g.draw(new Line2D.Float(curX, curY, startX, startY));
/* 155 */           g.setColor(Color.RED);
/* 156 */           g.fillRect((int)curX - 2, (int)curY - 2, 4, 4);
/* 157 */           g.fillRect((int)startX - 2, (int)startY - 2, 4, 4);
/* 158 */           curX = startX;
/* 159 */           curY = startY;
/*     */           break;
/*     */         default:
/* 162 */           throw new IllegalStateException();
/*     */       } 
/* 164 */       pathIterator.next();
/*     */     } 
/*     */   }
/*     */   @NotNull
/*     */   private PathIterator createPathIterator(@NotNull RenderContext context) {
/* 169 */     MeasureContext measureContext = context.measureContext();
/* 170 */     Shape path = this.pathShape.shape(context);
/*     */     
/* 172 */     float flatness = 0.1F * measureContext.ex();
/* 173 */     switch (this.side) {
/*     */       case Left:
/* 175 */         return path.getPathIterator(null, flatness);
/*     */       case Right:
/* 177 */         return (PathIterator)new ReversePathIterator(path.getPathIterator(null, flatness));
/*     */     } 
/* 179 */     throw new IllegalStateException();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected GlyphCursor createLocalCursor(@NotNull RenderContext context, @NotNull GlyphCursor current) {
/* 185 */     return new PathGlyphCursor(current, this.startOffset
/* 186 */         .resolveLength(context.measureContext()), 
/* 187 */         createPathIterator(context));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void cleanUpLocalCursor(@NotNull GlyphCursor current, @NotNull GlyphCursor local) {
/* 192 */     current.updateFrom(local);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\text\TextPath.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */