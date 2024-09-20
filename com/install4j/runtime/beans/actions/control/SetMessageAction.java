/*    */ package com.install4j.runtime.beans.actions.control;
/*    */ 
/*    */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ 
/*    */ public class SetMessageAction
/*    */   extends SystemInstallOrUninstallAction {
/* 11 */   private String statusMessage = "";
/* 12 */   private String detailMessage = "";
/*    */   
/*    */   private boolean useStatus = false;
/*    */   private boolean useDetail = false;
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 18 */     ProgressInterface progressInterface = context.getProgressInterface();
/* 19 */     if (isUseStatus()) {
/* 20 */       progressInterface.setStatusMessage(getStatusMessage());
/*    */     }
/* 22 */     if (isUseDetail()) {
/* 23 */       progressInterface.setDetailMessage(getDetailMessage());
/*    */     }
/* 25 */     return true;
/*    */   }
/*    */   
/*    */   public String getStatusMessage() {
/* 29 */     return replaceVariables(replaceVariables(this.statusMessage, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*    */   }
/*    */   
/*    */   public void setStatusMessage(String statusMessage) {
/* 33 */     this.statusMessage = statusMessage;
/*    */   }
/*    */   
/*    */   public String getDetailMessage() {
/* 37 */     return replaceVariables(replaceVariables(this.detailMessage, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*    */   }
/*    */   
/*    */   public void setDetailMessage(String detailMessage) {
/* 41 */     this.detailMessage = detailMessage;
/*    */   }
/*    */   
/*    */   public boolean isUseStatus() {
/* 45 */     return replaceWithTextOverride("useStatus", this.useStatus);
/*    */   }
/*    */   
/*    */   public void setUseStatus(boolean useStatus) {
/* 49 */     this.useStatus = useStatus;
/*    */   }
/*    */   
/*    */   public boolean isUseDetail() {
/* 53 */     return replaceWithTextOverride("useDetail", this.useDetail);
/*    */   }
/*    */   
/*    */   public void setUseDetail(boolean useDetail) {
/* 57 */     this.useDetail = useDetail;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 62 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\control\SetMessageAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */