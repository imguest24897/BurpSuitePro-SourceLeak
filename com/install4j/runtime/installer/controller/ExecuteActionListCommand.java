/*    */ package com.install4j.runtime.installer.controller;
/*    */ 
/*    */ import com.install4j.api.beans.ActionList;
/*    */ 
/*    */ public class ExecuteActionListCommand
/*    */   extends ActionCallbackCommand {
/*    */   private ActionList actionList;
/*    */   private final Object[] extraScriptParameters;
/*    */   
/*    */   public ExecuteActionListCommand(ActionCallback actionCallback, ActionList actionList, Object... extraScriptParameters) {
/* 11 */     super("execute action list", actionCallback);
/* 12 */     this.actionList = actionList;
/* 13 */     this.extraScriptParameters = extraScriptParameters;
/*    */   }
/*    */   
/*    */   public ActionList getActionList() {
/* 17 */     return this.actionList;
/*    */   }
/*    */   
/*    */   public Object[] getExtraScriptParameters() {
/* 21 */     return this.extraScriptParameters;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isAddHistoryEntry() {
/* 26 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\controller\ExecuteActionListCommand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */