/*    */ package com.install4j.runtime.beans.actions.jdbc;
/*    */ 
/*    */ import com.install4j.api.beans.ActionList;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import java.sql.Connection;
/*    */ import java.sql.SQLException;
/*    */ 
/*    */ public class JdbcContainerAction
/*    */   extends AbstractJdbcAction {
/*    */   public ActionList getActionList() {
/* 12 */     return (ActionList)replaceWithTextOverride("actionList", this.actionList, ActionList.class);
/*    */   }
/*    */   private ActionList actionList;
/*    */   public void setActionList(ActionList actionList) {
/* 16 */     this.actionList = actionList;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean executeJdbcCall(Context context) throws UserCanceledException {
/* 21 */     return withConnection(connection -> {
/*    */           overrideVariable("sys.jdbc.connection", createConnection(), context);
/*    */           overrideVariable("sys.jdbc.errorMessagesVariableName", getErrorMessagesVariableName(), context);
/*    */           try {
/*    */             return executeActionListSync(getActionList(), new Object[0]);
/*    */           } finally {
/*    */             restoreVariables(context);
/*    */           } 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\jdbc\JdbcContainerAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */