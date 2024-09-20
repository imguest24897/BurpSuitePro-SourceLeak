/*    */ package com.install4j.runtime.installer.controller;
/*    */ 
/*    */ public abstract class CheckingScreenChangeCommand
/*    */   extends ActionCallbackCommand {
/*    */   private boolean checkCondition;
/*    */   private boolean executeActions;
/*    */   
/*    */   public CheckingScreenChangeCommand(String verbose, boolean checkCondition, boolean executeActions, ActionCallback actionCallback) {
/*  9 */     super(verbose, actionCallback);
/* 10 */     this.checkCondition = checkCondition;
/* 11 */     this.executeActions = executeActions;
/*    */   }
/*    */   
/*    */   public boolean isCheckCondition() {
/* 15 */     return this.checkCondition;
/*    */   }
/*    */   
/*    */   public boolean isExecuteActions() {
/* 19 */     return this.executeActions;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\CheckingScreenChangeCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */