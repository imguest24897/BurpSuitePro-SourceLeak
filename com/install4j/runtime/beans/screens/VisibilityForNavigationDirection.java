/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ public enum VisibilityForNavigationDirection {
/*  4 */   ALL("Both with Next and Back buttons"),
/*  5 */   NEXT_ONLY("Only with Next button"),
/*  6 */   BACK_ONLY("Only with Back button");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   VisibilityForNavigationDirection(String verbose) {
/* 11 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 16 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\VisibilityForNavigationDirection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */