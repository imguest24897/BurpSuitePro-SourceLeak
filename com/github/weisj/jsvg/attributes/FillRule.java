/*    */ package com.github.weisj.jsvg.attributes;
/*    */ 
/*    */ import com.github.weisj.jsvg.parser.AttributeNode;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum FillRule
/*    */ {
/* 40 */   Nonzero(1),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 47 */   EvenOdd(0),
/* 48 */   Inherit(Nonzero.awtWindingRule);
/*    */   
/*    */   public final int awtWindingRule;
/*    */   
/*    */   FillRule(int awtWindingRule) {
/* 53 */     this.awtWindingRule = awtWindingRule;
/*    */   }
/*    */   @NotNull
/*    */   public static FillRule parse(@NotNull AttributeNode attributeNode) {
/* 57 */     return (FillRule)attributeNode.getEnum("fill-rule", Inherit);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\FillRule.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */