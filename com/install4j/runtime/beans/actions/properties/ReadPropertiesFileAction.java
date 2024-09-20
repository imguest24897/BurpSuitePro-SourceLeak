/*    */ package com.install4j.runtime.beans.actions.properties;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class ReadPropertiesFileAction
/*    */   extends AbstractPropertiesFileAction
/*    */ {
/*    */   private String variableName;
/*    */   private boolean merge;
/*    */   
/*    */   public String getVariableName() {
/* 17 */     return replaceVariables(this.variableName);
/*    */   }
/*    */   
/*    */   public void setVariableName(String variableName) {
/* 21 */     this.variableName = variableName;
/*    */   }
/*    */   
/*    */   public boolean isMerge() {
/* 25 */     return replaceWithTextOverride("merge", this.merge);
/*    */   }
/*    */   
/*    */   public void setMerge(boolean merge) {
/* 29 */     this.merge = merge;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 35 */     File usedFile = resolveRelativeFile(getFile(), context);
/* 36 */     if (!usedFile.exists()) {
/* 37 */       Logger.getInstance().error(this, "The file " + usedFile.getAbsolutePath() + " does not exist.");
/* 38 */       return false;
/*    */     } 
/*    */     
/* 41 */     PropertiesFileParameters parameters = new PropertiesFileParameters(getEncoding(), getCharsetName());
/* 42 */     TextProperties properties = getTextProperties(context);
/*    */     try {
/* 44 */       properties.read(usedFile, parameters);
/* 45 */     } catch (IOException e) {
/* 46 */       Logger.getInstance().log(e);
/* 47 */       return false;
/*    */     } 
/*    */     
/* 50 */     context.setVariable(getVariableName(), properties);
/*    */     
/* 52 */     return true;
/*    */   }
/*    */   
/*    */   private TextProperties getTextProperties(Context context) {
/* 56 */     TextProperties textProperties = new TextProperties();
/* 57 */     Object existingValue = context.getVariable(getVariableName());
/* 58 */     if (isMerge()) {
/* 59 */       if (existingValue instanceof TextProperties)
/* 60 */         return (TextProperties)existingValue; 
/* 61 */       if (existingValue instanceof Map) {
/* 62 */         Map map = (Map)existingValue;
/* 63 */         for (Object o : map.entrySet()) {
/* 64 */           Map.Entry entry = (Map.Entry)o;
/* 65 */           Object key = entry.getKey();
/* 66 */           Object value = entry.getValue();
/* 67 */           if (key != null && value != null) {
/* 68 */             textProperties.put(key.toString(), value.toString());
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 73 */     return textProperties;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\properties\ReadPropertiesFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */