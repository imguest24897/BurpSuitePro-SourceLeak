/*    */ package com.github.weisj.jsvg.nodes.prototype;
/*    */ 
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
/*    */ import java.awt.Graphics2D;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface Renderable
/*    */ {
/*    */   default boolean requiresInstantiation() {
/* 40 */     return false;
/*    */   }
/*    */   
/*    */   boolean isVisible(@NotNull RenderContext paramRenderContext);
/*    */   
/*    */   void render(@NotNull RenderContext paramRenderContext, @NotNull Graphics2D paramGraphics2D);
/*    */   
/*    */   default boolean parseIsVisible(@NotNull AttributeNode node) {
/* 48 */     return (!"none".equals(node.getValue("display")) && 
/* 49 */       !"hidden".equals(node.getValue("visibility")) && 
/* 50 */       !"collapse".equals(node.getValue("visibility")));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\Renderable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */