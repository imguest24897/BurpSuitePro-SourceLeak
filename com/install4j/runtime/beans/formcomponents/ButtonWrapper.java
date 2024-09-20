/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.beans.ExternalFile;
/*    */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.formcomponents.AbstractFormComponent;
/*    */ import com.install4j.api.formcomponents.FormComponent;
/*    */ import com.install4j.api.formcomponents.FormEnvironment;
/*    */ import com.install4j.runtime.util.IconHelper;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.Icon;
/*    */ import javax.swing.JButton;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public class ButtonWrapper {
/*    */   private JButton button;
/*    */   private AbstractFormComponent formComponent;
/*    */   private ActionListener actionListener;
/*    */   
/*    */   public ButtonWrapper(AbstractFormComponent formComponent) {
/* 21 */     this.formComponent = formComponent;
/*    */   }
/*    */   
/*    */   public JButton getButton() {
/* 25 */     return this.button;
/*    */   }
/*    */   
/*    */   public ActionListener getActionListener() {
/* 29 */     return this.actionListener;
/*    */   }
/*    */   
/*    */   public void initialize(String buttonText) {
/* 33 */     initialize(buttonText, null);
/*    */   }
/*    */   
/*    */   public void initialize(String buttonText, @Nullable String buttonName) {
/* 37 */     this.button.setText(this.formComponent.replaceFormVariables(buttonText, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/* 38 */     if (buttonText != null && buttonName != null) {
/* 39 */       this.button.setName(buttonName);
/*    */     }
/*    */   }
/*    */   
/*    */   public void setFormEnvironment(FormEnvironment formEnvironment) {
/* 44 */     if (this.button != null && formEnvironment != null) {
/* 45 */       this.button.setName(formEnvironment.getId((FormComponent)this.formComponent));
/*    */     }
/*    */   }
/*    */   
/*    */   public JButton createCenterComponent(Context context, ExternalFile buttonIconFile, ActionListener actionListener) {
/* 50 */     this.actionListener = actionListener;
/* 51 */     this.button = new JButton();
/* 52 */     if (buttonIconFile != null) {
/* 53 */       IconHelper.withIcon(buttonIconFile, context, icon -> {
/*    */             this.button.setIcon(icon);
/*    */             return null;
/*    */           });
/*    */     }
/* 58 */     this.button.addActionListener(actionListener);
/* 59 */     return this.button;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\ButtonWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */