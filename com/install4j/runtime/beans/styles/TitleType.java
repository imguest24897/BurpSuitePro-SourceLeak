/*    */ package com.install4j.runtime.beans.styles;
/*    */ 
/*    */ import com.install4j.api.styles.StyleContext;
/*    */ 
/*    */ public enum TitleType {
/*  6 */   TITLE("Title")
/*    */   {
/*    */     public String getTitle(StyleContext styleContext) {
/*  9 */       return styleContext.getTitle();
/*    */     }
/*    */   },
/* 12 */   SUB_TITLE("Subtitle")
/*    */   {
/*    */     public String getTitle(StyleContext styleContext) {
/* 15 */       return styleContext.getSubTitle();
/*    */     }
/*    */   };
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   TitleType(String verbose) {
/* 22 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 29 */     return this.verbose;
/*    */   }
/*    */   
/*    */   public abstract String getTitle(StyleContext paramStyleContext);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\styles\TitleType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */