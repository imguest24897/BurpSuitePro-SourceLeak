/*    */ package com.github.weisj.jsvg.nodes;
/*    */ 
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import org.jetbrains.annotations.MustBeInvokedByOverriders;
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
/*    */ public abstract class AbstractSVGNode
/*    */   implements SVGNode
/*    */ {
/*    */   @Nullable
/*    */   private String id;
/*    */   
/*    */   @Nullable
/*    */   public String id() {
/* 36 */     return this.id;
/*    */   }
/*    */ 
/*    */   
/*    */   @MustBeInvokedByOverriders
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 42 */     this.id = attributeNode.getValue("id");
/*    */   }
/*    */ 
/*    */   
/*    */   public void addContent(char[] content) {}
/*    */ 
/*    */   
/*    */   public String toString() {
/* 50 */     return getClass().getSimpleName() + "{id='" + this.id + '\'' + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\AbstractSVGNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */