/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ import com.install4j.api.beans.Bean;
/*    */ import com.install4j.api.beans.ScriptProperty;
/*    */ import com.install4j.api.context.WizardContext;
/*    */ import com.install4j.api.formcomponents.AbstractFormComponent;
/*    */ import com.install4j.api.formcomponents.FormComponent;
/*    */ import javax.swing.AbstractButton;
/*    */ import javax.swing.ButtonModel;
/*    */ import javax.swing.InputVerifier;
/*    */ import javax.swing.JComponent;
/*    */ 
/*    */ public class TextComponentUtil {
/*    */   public static void addInputVerifier(final AbstractFormComponent formComponent, final ScriptProperty inputVerifier, JComponent component, final InputVerifierParameterProvider parameterProvider) {
/* 14 */     if (inputVerifier != null)
/* 15 */       component.setInputVerifier(new InputVerifier()
/*    */           {
/*    */             public boolean verify(JComponent input) {
/*    */               try {
/* 19 */                 Boolean result = (Boolean)formComponent.getContext().runScript(inputVerifier, (Bean)formComponent, parameterProvider
/*    */ 
/*    */                     
/* 22 */                     .createInputVerifierParameters());
/*    */                 
/* 24 */                 if (result != null && !result.booleanValue()) {
/* 25 */                   TextComponentUtil.disarmAllButtons(formComponent);
/* 26 */                   return false;
/*    */                 } 
/* 28 */               } catch (Exception e) {
/* 29 */                 e.printStackTrace();
/*    */               } 
/* 31 */               return true;
/*    */             }
/*    */           }); 
/*    */   }
/*    */   public static interface InputVerifierParameterProvider {
/*    */     Object[] createInputVerifierParameters(); }
/*    */   
/*    */   private static void disarmAllButtons(AbstractFormComponent formComponent) {
/* 39 */     WizardContext wizardContext = formComponent.getContext().getWizardContext();
/* 40 */     if (wizardContext instanceof WizardScreenExecutor) {
/* 41 */       ((WizardScreenExecutor)wizardContext).disarmButtons();
/*    */     }
/* 43 */     FormComponent[] formComponents = formComponent.getFormEnvironment().getFormComponents();
/* 44 */     for (FormComponent component : formComponents) {
/* 45 */       if (component.getConfigurationObjectClass() != null) {
/* 46 */         Object configurationObject = component.getConfigurationObject();
/* 47 */         if (configurationObject instanceof AbstractButton) {
/* 48 */           ButtonModel model = ((AbstractButton)configurationObject).getModel();
/* 49 */           model.setArmed(false);
/* 50 */           model.setPressed(false);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\TextComponentUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */