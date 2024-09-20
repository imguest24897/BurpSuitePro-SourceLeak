/*    */ package com.install4j.runtime.beans.actions.control;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.ControlButtonType;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.api.context.WizardContext;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ 
/*    */ public class ChangeCancelButtonAction
/*    */   extends SystemInstallOrUninstallAction {
/* 11 */   private ButtonState buttonState = ButtonState.ENABLED;
/*    */   
/*    */   public ButtonState getButtonState() {
/* 14 */     return (ButtonState)replaceWithTextOverride("buttonState", this.buttonState, ButtonState.class);
/*    */   }
/*    */   
/*    */   public void setButtonState(ButtonState buttonState) {
/* 18 */     this.buttonState = buttonState;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 23 */     WizardContext wizardContext = context.getWizardContext();
/* 24 */     boolean hidden = (getButtonState() == ButtonState.HIDDEN);
/* 25 */     wizardContext.setControlButtonVisible(ControlButtonType.CANCEL, !hidden);
/* 26 */     if (!hidden) {
/* 27 */       wizardContext.setControlButtonVisible(ControlButtonType.CANCEL, (getButtonState() == ButtonState.ENABLED));
/*    */     }
/* 29 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 34 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\control\ChangeCancelButtonAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */