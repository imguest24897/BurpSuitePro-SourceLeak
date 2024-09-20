/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class MetaSVGNode
/*    */   implements SVGNode
/*    */ {
/*    */   @Nullable
/*    */   public String id() {
/* 41 */     return null;
/*    */   }
/*    */   
/*    */   public void build(@NotNull AttributeNode attributeNode) {}
/*    */   
/*    */   public void addContent(char[] content) {}
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\MetaSVGNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */