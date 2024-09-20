/*    */ package com.github.weisj.jsvg.attributes.filter;
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
/*    */ public enum ColorChannel
/*    */ {
/* 25 */   R(2),
/* 26 */   G(1),
/* 27 */   B(0),
/* 28 */   A(3);
/*    */   
/*    */   private final int index;
/*    */   
/*    */   ColorChannel(int index) {
/* 33 */     this.index = index;
/*    */   }
/*    */   
/*    */   public int value(int pixelData) {
/* 37 */     return pixelData >> this.index * 8 & 0xFF;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\github\weisj\jsvg\attributes\filter\ColorChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */