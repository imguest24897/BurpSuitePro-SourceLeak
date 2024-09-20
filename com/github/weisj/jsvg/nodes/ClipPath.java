/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.attributes.UnitType;
/*    */ import com.github.weisj.jsvg.nodes.container.ContainerNode;
/*    */ import com.github.weisj.jsvg.nodes.prototype.ShapedContainer;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
/*    */ import com.github.weisj.jsvg.nodes.text.Text;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Shape;
/*    */ import java.awt.geom.Area;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @ElementCategories({})
/*    */ @PermittedContent(categories = {Category.Animation, Category.Descriptive, Category.Shape}, anyOf = {Use.class, Text.class})
/*    */ public final class ClipPath
/*    */   extends ContainerNode
/*    */   implements ShapedContainer<SVGNode>
/*    */ {
/*    */   public static final String TAG = "clippath";
/*    */   private boolean isValid;
/*    */   private UnitType clipPathUnits;
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 53 */     return "clippath";
/*    */   }
/*    */   
/*    */   public boolean isValid() {
/* 57 */     return this.isValid;
/*    */   }
/*    */ 
/*    */   
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 62 */     super.build(attributeNode);
/* 63 */     this.isValid = checkIsValid();
/* 64 */     this.clipPathUnits = (UnitType)attributeNode.getEnum("clipPathUnits", (Enum)UnitType.UserSpaceOnUse);
/*    */   }
/*    */   
/*    */   private boolean checkIsValid() {
/* 68 */     for (SVGNode child : children()) {
/* 69 */       if (!(child instanceof Use))
/* 70 */         continue;  SVGNode referenced = ((Use)child).referencedNode();
/* 71 */       if (referenced != null && 
/* 72 */         !isAcceptableType(referenced)) {
/* 73 */         return false;
/*    */       }
/*    */     } 
/* 76 */     return true;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Shape clipShape(@NotNull RenderContext context, @NotNull Rectangle2D elementBounds) {
/* 81 */     Shape shape = elementShape(context);
/* 82 */     if (this.clipPathUnits == UnitType.ObjectBoundingBox) {
/* 83 */       shape = this.clipPathUnits.viewTransform(elementBounds).createTransformedShape(shape);
/*    */     }
/* 85 */     Area areaShape = new Area(shape);
/* 86 */     if (areaShape.isRectangular()) {
/* 87 */       return areaShape.getBounds();
/*    */     }
/* 89 */     return areaShape;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\ClipPath.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */