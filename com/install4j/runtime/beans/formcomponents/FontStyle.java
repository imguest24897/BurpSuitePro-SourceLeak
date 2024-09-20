/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum FontStyle
/*    */ {
/*  8 */   UNCHANGED("Unchanged", 0),
/*  9 */   PLAIN("Plain", 0),
/* 10 */   BOLD("Bold", 1),
/* 11 */   ITALIC("Italic", 2),
/* 12 */   BOLD_ITALIC("Bold & Italic", 3);
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   private final int style;
/*    */   
/*    */   FontStyle(String verbose, int style) {
/* 19 */     this.verbose = verbose;
/* 20 */     this.style = style;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 25 */     return this.verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getStyle() {
/* 30 */     return this.style;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\FontStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */