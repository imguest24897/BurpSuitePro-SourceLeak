/*    */ package com.install4j.runtime.installer.controller;
/*    */ 
/*    */ public class GoForwardCommand
/*    */   extends CheckingScreenChangeCommand {
/*    */   private int number;
/*    */   
/*    */   public GoForwardCommand(int number, boolean checkCondition, boolean executeActions, ActionCallback actionCallback) {
/*  8 */     super("move " + number + " screens" + (executeActions ? ", executing actions" : "") + (
/*  9 */         checkCondition ? ", checking condition" : ""), checkCondition, executeActions, actionCallback);
/* 10 */     this.number = number;
/*    */   }
/*    */   
/*    */   public int getNumber() {
/* 14 */     return this.number;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\GoForwardCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */