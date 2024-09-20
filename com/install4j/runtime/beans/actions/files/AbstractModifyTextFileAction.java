/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ import com.install4j.runtime.beans.actions.properties.PropertiesFileHelper;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ 
/*    */ public abstract class AbstractModifyTextFileAction
/*    */   extends AbstractModifyMultipleFilesAction {
/*    */   private String encoding;
/*    */   private boolean failIfNoReplacement = false;
/*    */   private boolean escapeForPropertyFile = false;
/*    */   
/*    */   public String getEncoding() {
/* 13 */     return replaceVariables(replaceVariables(this.encoding));
/*    */   }
/*    */   
/*    */   public void setEncoding(String encoding) {
/* 17 */     this.encoding = encoding;
/*    */   }
/*    */   
/*    */   public boolean isEscapeForPropertyFile() {
/* 21 */     return replaceWithTextOverride("escapeForPropertyFile", this.escapeForPropertyFile);
/*    */   }
/*    */   
/*    */   public void setEscapeForPropertyFile(boolean escapeForPropertyFile) {
/* 25 */     this.escapeForPropertyFile = escapeForPropertyFile;
/*    */   }
/*    */   
/*    */   public boolean isFailIfNoReplacement() {
/* 29 */     return replaceWithTextOverride("failIfNoReplacement", this.failIfNoReplacement);
/*    */   }
/*    */   
/*    */   public void setFailIfNoReplacement(boolean failIfNoReplacement) {
/* 33 */     this.failIfNoReplacement = failIfNoReplacement;
/*    */   }
/*    */   
/*    */   protected String maybeEscape(String text, boolean regexpReplacement) {
/* 37 */     if (isEscapeForPropertyFile()) {
/* 38 */       return PropertiesFileHelper.escapeForPropertyFile(text, false, null, regexpReplacement);
/*    */     }
/* 40 */     return text;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean handleFound(boolean found) {
/* 45 */     if (isFailIfNoReplacement()) {
/* 46 */       if (!found) {
/* 47 */         Logger.getInstance().log(this, "No replacements were performed.", false);
/*    */       }
/* 49 */       return found;
/*    */     } 
/* 51 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\AbstractModifyTextFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */