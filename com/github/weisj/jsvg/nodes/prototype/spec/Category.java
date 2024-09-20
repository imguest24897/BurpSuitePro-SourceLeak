/*    */ package com.github.weisj.jsvg.nodes.prototype.spec;
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
/*    */ public enum Category
/*    */ {
/* 26 */   Animation(false),
/* 27 */   BasicShape,
/* 28 */   Container,
/*    */ 
/*    */   
/* 31 */   Descriptive(false),
/* 32 */   FilterPrimitive,
/* 33 */   Gradient,
/* 34 */   Graphic,
/* 35 */   GraphicsReferencing,
/* 36 */   Shape,
/* 37 */   Structural,
/* 38 */   TextContent,
/* 39 */   TextContentChild,
/* 40 */   None;
/*    */ 
/*    */ 
/*    */   
/*    */   private final boolean effectivelyAllowed;
/*    */ 
/*    */ 
/*    */   
/*    */   Category(boolean effectivelyAllowed) {
/* 49 */     this.effectivelyAllowed = effectivelyAllowed;
/*    */   }
/*    */   
/*    */   public boolean isEffectivelyAllowed() {
/* 53 */     return this.effectivelyAllowed;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\nodes\prototype\spec\Category.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */