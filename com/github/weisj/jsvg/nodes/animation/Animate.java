/*    */ package com.github.weisj.jsvg.nodes.animation;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.MetaSVGNode;
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
/*    */ @ElementCategories({Category.Animation})
/*    */ @PermittedContent(categories = {Category.Descriptive})
/*    */ public final class Animate
/*    */   extends MetaSVGNode
/*    */ {
/*    */   public static final String TAG = "animate";
/*    */   
/*    */   @NotNull
/*    */   public String tagName() {
/* 38 */     return "animate";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\animation\Animate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */