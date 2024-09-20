/*    */ package com.install4j.runtime.installer.controller;
/*    */ 
/*    */ public class ControllerCommand
/*    */ {
/*  5 */   public static final ControllerCommand CANCEL = new ControllerCommand("cancel");
/*    */   
/*    */   private String verbose;
/*    */   
/*    */   protected ControllerCommand(String verbose) {
/* 10 */     this.verbose = verbose;
/*    */   }
/*    */   
/*    */   public boolean isAddHistoryEntry() {
/* 14 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 19 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\ControllerCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */