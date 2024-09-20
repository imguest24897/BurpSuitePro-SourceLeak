/*    */ package com.github.weisj.jsvg.nodes.filter;
/*    */ 
/*    */ import com.github.weisj.jsvg.geometry.size.Length;
/*    */ import com.github.weisj.jsvg.nodes.AbstractSVGNode;
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
/*    */ import org.jetbrains.annotations.MustBeInvokedByOverriders;
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
/*    */ public abstract class AbstractFilterPrimitive
/*    */   extends AbstractSVGNode
/*    */   implements FilterPrimitive
/*    */ {
/*    */   private FilterPrimitiveBase filterPrimitiveBase;
/*    */   
/*    */   @MustBeInvokedByOverriders
/*    */   public void build(@NotNull AttributeNode attributeNode) {
/* 39 */     super.build(attributeNode);
/* 40 */     this.filterPrimitiveBase = new FilterPrimitiveBase(attributeNode);
/*    */   }
/*    */   @NotNull
/*    */   protected final FilterPrimitiveBase impl() {
/* 44 */     return this.filterPrimitiveBase;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Length x() {
/* 49 */     return (impl()).x;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Length y() {
/* 54 */     return (impl()).y;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Length width() {
/* 59 */     return (impl()).width;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Length height() {
/* 64 */     return (impl()).height;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\filter\AbstractFilterPrimitive.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */