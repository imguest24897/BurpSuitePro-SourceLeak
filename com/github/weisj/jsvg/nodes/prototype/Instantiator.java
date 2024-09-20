/*    */ package com.github.weisj.jsvg.nodes.prototype;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.SVGNode;
/*    */ import com.github.weisj.jsvg.renderer.ContextElementAttributes;
/*    */ import com.github.weisj.jsvg.renderer.RenderContext;
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
/*    */ public interface Instantiator
/*    */ {
/*    */   boolean canInstantiate(@NotNull SVGNode paramSVGNode);
/*    */   
/*    */   @NotNull
/*    */   default ContextElementAttributes createContextAttributes(@NotNull RenderContext context) {
/* 35 */     return new ContextElementAttributes(context.fillPaint(), context.strokePaint());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\Instantiator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */