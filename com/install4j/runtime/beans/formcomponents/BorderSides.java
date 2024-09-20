/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BorderSides
/*    */ {
/*    */   private boolean top;
/*    */   private boolean right;
/*    */   private boolean bottom;
/*    */   private boolean left;
/*    */   
/*    */   public BorderSides() {
/* 13 */     this(false, false, false, false);
/*    */   }
/*    */   
/*    */   public BorderSides(boolean top, boolean right, boolean bottom, boolean left) {
/* 17 */     this.top = top;
/* 18 */     this.right = right;
/* 19 */     this.bottom = bottom;
/* 20 */     this.left = left;
/*    */   }
/*    */   
/*    */   public boolean isTop() {
/* 24 */     return this.top;
/*    */   }
/*    */   
/*    */   public void setTop(boolean top) {
/* 28 */     this.top = top;
/*    */   }
/*    */   
/*    */   public boolean isRight() {
/* 32 */     return this.right;
/*    */   }
/*    */   
/*    */   public void setRight(boolean right) {
/* 36 */     this.right = right;
/*    */   }
/*    */   
/*    */   public boolean isBottom() {
/* 40 */     return this.bottom;
/*    */   }
/*    */   
/*    */   public void setBottom(boolean bottom) {
/* 44 */     this.bottom = bottom;
/*    */   }
/*    */   
/*    */   public boolean isLeft() {
/* 48 */     return this.left;
/*    */   }
/*    */   
/*    */   public void setLeft(boolean left) {
/* 52 */     this.left = left;
/*    */   }
/*    */   
/*    */   public int getBorderFlags() {
/* 56 */     int flags = 0;
/* 57 */     if (this.top) {
/* 58 */       flags |= 0x1;
/*    */     }
/* 60 */     if (this.right) {
/* 61 */       flags |= 0x4;
/*    */     }
/* 63 */     if (this.left) {
/* 64 */       flags |= 0x8;
/*    */     }
/* 66 */     if (this.bottom) {
/* 67 */       flags |= 0x2;
/*    */     }
/* 69 */     return flags;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\BorderSides.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */