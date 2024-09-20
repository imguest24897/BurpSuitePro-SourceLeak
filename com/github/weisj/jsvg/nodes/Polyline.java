/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.Category;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.ElementCategories;
/*    */ import com.github.weisj.jsvg.nodes.prototype.spec.PermittedContent;
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
/*    */ @ElementCategories({Category.BasicShape, Category.Graphic, Category.Shape})
/*    */ @PermittedContent(categories = {Category.Animation, Category.Descriptive})
/*    */ public final class Polyline
/*    */   extends AbstractPolyShape
/*    */ {
/*    */   public static final String TAG = "polyline";
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 37 */     return "polyline";
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean doClose() {
/* 42 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean shouldPaintStartEndMarkersInMiddle() {
/* 47 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\Polyline.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */