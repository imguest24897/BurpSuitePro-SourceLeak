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
/*    */ public enum LineJoin
/*    */ {
/* 31 */   Miter(0),
/*    */   
/* 33 */   Round(1),
/* 34 */   Bevel(2);
/*    */   
/*    */   private final int awtCode;
/*    */   
/*    */   LineJoin(int awtCode) {
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\stroke\LineJoin.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */