/*    */ package com.install4j.runtime.beans.actions.text;
/*    */ 
/*    */ import com.install4j.api.beans.PropertyLoggingInterceptor;
/*    */ import com.install4j.api.beans.ReplacementMode;
/*    */ import java.io.File;
/*    */ 
/*    */ public class RegexTextFileAction
/*    */   extends AbstractModifyTextFileInMemoryAction
/*    */   implements PropertyLoggingInterceptor {
/*    */   private String regex;
/*    */   private String replacement;
/*    */   private boolean replaceAll = true;
/*    */   private boolean quoteVariables = true;
/*    */   private boolean logReplacement = true;
/*    */   
/*    */   public String getRegex() {
/* 17 */     return replaceVariables(replaceVariables(this.regex, isQuoteVariables() ? ReplacementMode.REGEXP_MATCH : ReplacementMode.PLAIN));
/*    */   }
/*    */   
/*    */   public void setRegex(String regex) {
/* 21 */     this.regex = regex;
/*    */   }
/*    */   
/*    */   public String getReplacement() {
/* 25 */     return replaceVariables(replaceVariables(this.replacement, isQuoteVariables() ? ReplacementMode.REGEXP_REPLACEMENT : ReplacementMode.PLAIN));
/*    */   }
/*    */   
/*    */   public void setReplacement(String replacement) {
/* 29 */     this.replacement = replacement;
/*    */   }
/*    */   
/*    */   public boolean isReplaceAll() {
/* 33 */     return replaceWithTextOverride("replaceAll", this.replaceAll);
/*    */   }
/*    */   
/*    */   public void setReplaceAll(boolean replaceAll) {
/* 37 */     this.replaceAll = replaceAll;
/*    */   }
/*    */   
/*    */   public boolean isQuoteVariables() {
/* 41 */     return replaceWithTextOverride("quoteVariables", this.quoteVariables);
/*    */   }
/*    */   
/*    */   public void setQuoteVariables(boolean quoteVariables) {
/* 45 */     this.quoteVariables = quoteVariables;
/*    */   }
/*    */   
/*    */   public boolean isLogReplacement() {
/* 49 */     return replaceWithTextOverride("logReplacement", this.logReplacement);
/*    */   }
/*    */   
/*    */   public void setLogReplacement(boolean logReplacement) {
/* 53 */     this.logReplacement = logReplacement;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object getLogValueForProperty(String propertyName, Object propertyValue) {
/* 58 */     return maybeFilterLogReplacement(propertyName, "replacement", propertyValue, isLogReplacement());
/*    */   }
/*    */ 
/*    */   
/*    */   protected String modifyText(String origin, File file) {
/* 63 */     String replacement = maybeEscape(getReplacement(), true);
/* 64 */     if (isReplaceAll()) {
/* 65 */       return origin.replaceAll(getRegex(), replacement);
/*    */     }
/* 67 */     return origin.replaceFirst(getRegex(), replacement);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\text\RegexTextFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */