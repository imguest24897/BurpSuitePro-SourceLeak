/*    */ package com.github.weisj.jsvg.attributes.stroke;
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
/*    */ public enum LineCap
/*    */ {
/* 31 */   Butt(0),
/*    */   
/* 33 */   Square(2),
/* 34 */   Round(1);
/*    */   
/*    */   private final int awtCode;
/*    */   
/*    */   LineCap(int awtCode) {
/* 39 */     this.awtCode = awtCode;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int awtCode() {
/* 46 */     return this.awtCode;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\stroke\LineCap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */