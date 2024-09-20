/*    */ package com.github.weisj.jsvg.nodes.container;
/*    */ 
/*    */ import com.github.weisj.jsvg.nodes.SVGNode;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
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
/*    */ public abstract class ContainerNode
/*    */   extends BaseContainerNode<SVGNode>
/*    */ {
/* 32 */   private final List<SVGNode> children = new ArrayList<>();
/*    */ 
/*    */   
/*    */   protected void doAdd(@NotNull SVGNode node) {
/* 36 */     this.children.add(node);
/*    */   }
/*    */ 
/*    */   
/*    */   public List<? extends SVGNode> children() {
/* 41 */     return this.children;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\container\ContainerNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */