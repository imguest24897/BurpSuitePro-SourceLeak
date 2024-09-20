/*    */ package com.install4j.runtime.beans.formcomponents;
/*    */ 
/*    */ import com.install4j.api.beans.ReplacementMode;
/*    */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*    */ import com.install4j.runtime.beans.TextBinder;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ public class FormEnvironmentTextBinder
/*    */   extends TextBinder
/*    */ {
/*    */   private FormEnvironmentImpl formEnvironment;
/*    */   
/*    */   public FormEnvironmentTextBinder(FormEnvironmentImpl formEnvironment) {
/* 15 */     this.formEnvironment = formEnvironment;
/*    */   }
/*    */ 
/*    */   
/*    */   protected String replaceVariables(String text) {
/* 20 */     return this.formEnvironment.replaceFormVariables(text, ReplacementMode.PLAIN, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void setReplacementRecording(ArrayList<String> replacementRecording) {
/* 25 */     super.setReplacementRecording(replacementRecording);
/* 26 */     this.formEnvironment.setReplacementRecording(replacementRecording);
/*    */   }
/*    */   
/*    */   public void formVariableChanged(String variableName) {
/* 30 */     processBindings("form:" + variableName);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\formcomponents\FormEnvironmentTextBinder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */