/*    */ package com.install4j.runtime.installer.frontend;
/*    */ 
/*    */ import com.install4j.api.beans.ReplacementMode;
/*    */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*    */ import com.install4j.runtime.installer.InstallerVariables;
/*    */ import com.install4j.runtime.util.ExtendedResourceBundle;
/*    */ import java.util.Enumeration;
/*    */ import java.util.ResourceBundle;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class VariableResourceBundleWrapper
/*    */   extends ResourceBundle
/*    */   implements ExtendedResourceBundle {
/*    */   private ResourceBundle messages;
/*    */   private ReplacementMode nextReplacementMode;
/*    */   
/*    */   public VariableResourceBundleWrapper(ResourceBundle messages) {
/* 18 */     this.messages = messages;
/*    */   }
/*    */   
/*    */   public void setNextReplacementMode(ReplacementMode nextReplacementMode) {
/* 22 */     this.nextReplacementMode = nextReplacementMode;
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public Enumeration<String> getKeys() {
/* 28 */     return this.messages.getKeys();
/*    */   }
/*    */ 
/*    */   
/*    */   protected Object handleGetObject(@NotNull String key) {
/* 33 */     String value = (String)this.messages.getObject(key);
/* 34 */     value = InstallerVariables.replaceVariables(value, (this.nextReplacementMode != null) ? this.nextReplacementMode : ReplacementMode.PLAIN, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE);
/* 35 */     this.nextReplacementMode = null;
/* 36 */     return value;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean containsKeyDirectly(@NotNull String key) {
/* 41 */     if (this.messages instanceof ExtendedResourceBundle) {
/* 42 */       return ((ExtendedResourceBundle)this.messages).containsKeyDirectly(key);
/*    */     }
/* 44 */     return (handleGetObject(key) != null);
/*    */   }
/*    */ 
/*    */   
/*    */   public ResourceBundle getPlainMessages() {
/* 49 */     return this.messages;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\VariableResourceBundleWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */