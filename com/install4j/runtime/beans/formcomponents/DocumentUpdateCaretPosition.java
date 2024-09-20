/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.runtime.util.HtmlTextPane;
/*    */ 
/*    */ public enum DocumentUpdateCaretPosition {
/*  6 */   START("Start of document", HtmlTextPane.CaretTarget.START),
/*  7 */   END("End of document", HtmlTextPane.CaretTarget.END),
/*  8 */   UNCHANGED("Unchanged", HtmlTextPane.CaretTarget.UNCHANGED);
/*    */   
/*    */   private final String verbose;
/*    */   private final HtmlTextPane.CaretTarget caretTarget;
/*    */   
/*    */   DocumentUpdateCaretPosition(String verbose, HtmlTextPane.CaretTarget caretTarget) {
/* 14 */     this.verbose = verbose;
/* 15 */     this.caretTarget = caretTarget;
/*    */   }
/*    */   
/*    */   public HtmlTextPane.CaretTarget getCaretTarget() {
/* 19 */     return this.caretTarget;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 24 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\DocumentUpdateCaretPosition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */