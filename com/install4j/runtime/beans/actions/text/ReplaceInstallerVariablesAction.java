/*    */ package com.install4j.runtime.beans.actions.text;
/*    */ 
/*    */ import com.install4j.api.beans.ReplacementMode;
/*    */ import com.install4j.api.beans.UndefinedVariableException;
/*    */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*    */ import java.io.File;
/*    */ 
/*    */ public class ReplaceInstallerVariablesAction
/*    */   extends AbstractModifyTextFileInMemoryAction
/*    */ {
/*    */   private boolean ignoreMissing = true;
/*    */   
/*    */   public boolean isIgnoreMissing() {
/* 14 */     return replaceWithTextOverride("ignoreMissing", this.ignoreMissing);
/*    */   }
/*    */   
/*    */   public void setIgnoreMissing(boolean ignoreMissing) {
/* 18 */     this.ignoreMissing = ignoreMissing;
/*    */   }
/*    */ 
/*    */   
/*    */   protected String modifyText(String origin, File file) {
/*    */     try {
/* 24 */       ReplacementMode replacementMode = isEscapeForPropertyFile() ? ReplacementMode.PROPERTIES_FILE : ReplacementMode.PLAIN;
/* 25 */       return replaceVariables(origin, replacementMode, isIgnoreMissing() ? VariableErrorHandlingDescriptor.ALWAYS_IGNORE : VariableErrorHandlingDescriptor.ALWAYS_EXCEPTION);
/* 26 */     } catch (UndefinedVariableException e) {
/* 27 */       throw new UndefinedVariableException(e.getMessage() + " in file " + file);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\text\ReplaceInstallerVariablesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */