/*    */ package com.github.weisj.jsvg.attributes;
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
/*    */ public enum Overflow
/*    */ {
/* 25 */   Auto(false),
/* 26 */   Visible(false),
/*    */   
/* 28 */   Hidden(true),
/* 29 */   Scroll(true);
/*    */   
/*    */   private final boolean establishesClip;
/*    */   
/*    */   Overflow(boolean establishesClip) {
/* 34 */     this.establishesClip = establishesClip;
/*    */   }
/*    */   
/*    */   public boolean establishesClip() {
/* 38 */     return this.establishesClip;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\Overflow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */