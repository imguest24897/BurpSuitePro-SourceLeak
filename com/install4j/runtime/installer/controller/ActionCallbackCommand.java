/*    */ package com.install4j.runtime.installer.controller;
/*    */ 
/*    */ public abstract class ActionCallbackCommand
/*    */   extends ControllerCommand {
/*    */   private ActionCallback actionCallback;
/*    */   
/*    */   protected ActionCallbackCommand(String verbose, ActionCallback actionCallback) {
/*  8 */     super(verbose);
/*  9 */     this.actionCallback = actionCallback;
/*    */   }
/*    */   
/*    */   public ActionCallback getActionCallback() {
/* 13 */     return this.actionCallback;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\ActionCallbackCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */