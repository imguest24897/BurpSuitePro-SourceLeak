/*    */ package com.install4j.runtime.installer.controller;
/*    */ 
/*    */ public class GoBackCommand
/*    */   extends ControllerCommand {
/*    */   private int number;
/*    */   private boolean useHistory;
/*    */   
/*    */   public GoBackCommand(int number, boolean useHistory) {
/*  9 */     super("go back " + number + " screens" + (useHistory ? " using history" : ""));
/* 10 */     this.number = number;
/* 11 */     this.useHistory = useHistory;
/*    */   }
/*    */   
/*    */   public int getNumber() {
/* 15 */     return this.number;
/*    */   }
/*    */   
/*    */   public boolean isUseHistory() {
/* 19 */     return this.useHistory;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\GoBackCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */