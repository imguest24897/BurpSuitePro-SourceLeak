/*     */ package com.install4j.runtime.beans.actions.properties;
/*     */ 
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.AllowDirectFieldAccess;
/*     */ import com.install4j.runtime.beans.actions.files.BackupFileForRollbackAction;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.StringReader;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class WritePropertiesFileAction
/*     */   extends AbstractPropertiesFileAction {
/*  22 */   private LineSeparator lineSeparator = LineSeparator.SYSTEM;
/*     */   
/*     */   private boolean merge = true;
/*     */   private boolean updateExistingKeys = false;
/*     */   private boolean updateExistingComments = false;
/*  27 */   private PropertiesSource propertiesSource = PropertiesSource.DIRECT;
/*  28 */   private String sourcePropertyDefinitions = "";
/*  29 */   private String sourceVariableName = "";
/*     */   private ExternalFile sourceFile;
/*     */   private boolean replaceInstallerVariables = true;
/*  32 */   private PropertiesSortMode propertiesSortMode = PropertiesSortMode.UNSORTED_APPEND;
/*     */   
/*     */   public LineSeparator getLineSeparator() {
/*  35 */     return (LineSeparator)replaceWithTextOverride("lineSeparator", this.lineSeparator, LineSeparator.class);
/*     */   }
/*     */   
/*     */   public void setLineSeparator(LineSeparator lineSeparator) {
/*  39 */     this.lineSeparator = lineSeparator;
/*     */   }
/*     */   
/*     */   public boolean isMerge() {
/*  43 */     return replaceWithTextOverride("merge", this.merge);
/*     */   }
/*     */   
/*     */   public void setMerge(boolean merge) {
/*  47 */     this.merge = merge;
/*     */   }
/*     */   
/*     */   public boolean isUpdateExistingKeys() {
/*  51 */     return replaceWithTextOverride("updateExistingKeys", this.updateExistingKeys);
/*     */   }
/*     */   
/*     */   public void setUpdateExistingKeys(boolean updateExistingKeys) {
/*  55 */     this.updateExistingKeys = updateExistingKeys;
/*     */   }
/*     */   
/*     */   public boolean isUpdateExistingComments() {
/*  59 */     return replaceWithTextOverride("updateExistingComments", this.updateExistingComments);
/*     */   }
/*     */   
/*     */   public void setUpdateExistingComments(boolean updateExistingComments) {
/*  63 */     this.updateExistingComments = updateExistingComments;
/*     */   }
/*     */   
/*     */   public PropertiesSource getPropertiesSource() {
/*  67 */     return (PropertiesSource)replaceWithTextOverride("propertiesSource", this.propertiesSource, PropertiesSource.class);
/*     */   }
/*     */   
/*     */   public void setPropertiesSource(PropertiesSource propertiesSource) {
/*  71 */     this.propertiesSource = propertiesSource;
/*     */   }
/*     */   
/*     */   public String getSourcePropertyDefinitions() {
/*  75 */     return replaceVariables(this.sourcePropertyDefinitions);
/*     */   }
/*     */   
/*     */   @AllowDirectFieldAccess
/*     */   public String getSourcePropertyDefinitionsRaw() {
/*  80 */     return this.sourcePropertyDefinitions;
/*     */   }
/*     */   
/*     */   public void setSourcePropertyDefinitions(String sourcePropertyDefinitions) {
/*  84 */     this.sourcePropertyDefinitions = sourcePropertyDefinitions;
/*     */   }
/*     */   
/*     */   public String getSourceVariableName() {
/*  88 */     return replaceVariables(replaceVariables(this.sourceVariableName));
/*     */   }
/*     */   
/*     */   public void setSourceVariableName(String sourceVariableName) {
/*  92 */     this.sourceVariableName = sourceVariableName;
/*     */   }
/*     */   
/*     */   public ExternalFile getSourceFile() {
/*  96 */     return (ExternalFile)replaceWithTextOverride("sourceFile", this.sourceFile, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setSourceFile(ExternalFile sourceFile) {
/* 100 */     this.sourceFile = sourceFile;
/*     */   }
/*     */   
/*     */   public boolean isReplaceInstallerVariables() {
/* 104 */     return replaceWithTextOverride("replaceInstallerVariables", this.replaceInstallerVariables);
/*     */   }
/*     */   
/*     */   public void setReplaceInstallerVariables(boolean replaceInstallerVariables) {
/* 108 */     this.replaceInstallerVariables = replaceInstallerVariables;
/*     */   }
/*     */   
/*     */   public PropertiesSortMode getPropertiesSortMode() {
/* 112 */     return (PropertiesSortMode)replaceWithTextOverride("propertiesSortMode", this.propertiesSortMode, PropertiesSortMode.class);
/*     */   }
/*     */   
/*     */   public void setPropertiesSortMode(PropertiesSortMode propertiesSortMode) {
/* 116 */     this.propertiesSortMode = propertiesSortMode;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/* 122 */     PropertiesWriteParameters parameters = new PropertiesWriteParameters(getEncoding(), getCharsetName(), getLineSeparator());
/*     */     
/* 124 */     File usedFile = resolveRelativeFile(getFile(), context);
/* 125 */     TextProperties targetProperties = new TextProperties();
/* 126 */     if (usedFile.exists()) {
/* 127 */       if (isMerge()) {
/*     */         try {
/* 129 */           targetProperties.read(usedFile, parameters);
/* 130 */         } catch (IOException e) {
/* 131 */           Logger.getInstance().error(this, "Could not read properties file");
/* 132 */           Logger.getInstance().log(e);
/* 133 */           return false;
/*     */         } 
/* 135 */         Logger.getInstance().info(this, "Merging existing properties file with " + targetProperties.size() + " properties");
/*     */       } 
/* 137 */       if (context instanceof InstallerContext && !isSuppressRollback()) {
/* 138 */         BackupFileForRollbackAction backupAction = new BackupFileForRollbackAction(usedFile, true);
/* 139 */         backupAction.install((InstallerContext)context);
/* 140 */         addRollbackAction((InstallAction)backupAction);
/*     */       } 
/*     */     } 
/*     */     
/* 144 */     TextProperties sourceProperties = new TextProperties();
/* 145 */     if (!fillSourceProperties(sourceProperties, context)) {
/* 146 */       return false;
/*     */     }
/*     */     
/* 149 */     TextProperties mergedProperties = mergeProperties(sourceProperties, targetProperties);
/*     */     
/*     */     try {
/* 152 */       mergedProperties.write(usedFile, parameters);
/* 153 */     } catch (IOException e) {
/* 154 */       Logger.getInstance().log(e);
/* 155 */       return false;
/*     */     } 
/*     */     
/* 158 */     return true;
/*     */   }
/*     */   
/*     */   private boolean fillSourceProperties(TextProperties sourceProperties, Context context) {
/*     */     try {
/* 163 */       switch (getPropertiesSource()) {
/*     */         case UNSORTED_APPEND:
/* 165 */           return fillSourcePropertiesDirect(sourceProperties);
/*     */         case UNSORTED_PREPEND:
/* 167 */           return fillSourcePropertiesFile(sourceProperties, context);
/*     */         case KEYS_ALPHABETICALLY:
/* 169 */           return fillSourcePropertiesVariable(sourceProperties, context);
/*     */       } 
/* 171 */       throw new RuntimeException(getPropertiesSource().name());
/*     */     }
/* 173 */     catch (IOException e) {
/* 174 */       Logger.getInstance().error(this, "Invalid property definitions");
/* 175 */       Logger.getInstance().log(e);
/* 176 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean fillSourcePropertiesDirect(TextProperties sourceProperties) throws IOException {
/* 181 */     sourceProperties.read(new StringReader(getSourcePropertyDefinitionsRaw()));
/* 182 */     return true;
/*     */   }
/*     */   
/*     */   private boolean fillSourcePropertiesFile(TextProperties sourceProperties, Context context) throws IOException {
/* 186 */     File usedSourceFile = context.getExternalFile(getSourceFile(), false);
/* 187 */     if (!usedSourceFile.exists()) {
/* 188 */       Logger.getInstance().error(this, "Properties source file " + usedSourceFile + " does not exist");
/* 189 */       return false;
/*     */     } 
/* 191 */     PropertiesFileParameters parameters = new PropertiesFileParameters(getEncoding(), getCharsetName());
/* 192 */     sourceProperties.read(usedSourceFile, parameters);
/* 193 */     return true;
/*     */   }
/*     */   
/*     */   private boolean fillSourcePropertiesVariable(TextProperties sourceProperties, Context context) {
/* 197 */     String variableName = getSourceVariableName();
/* 198 */     Object variable = context.getVariable(variableName);
/* 199 */     if (variable == null) {
/* 200 */       Logger.getInstance().error(this, "Properties source variable " + variableName + " has not been set");
/* 201 */       return false;
/*     */     } 
/* 203 */     if (!(variable instanceof Map)) {
/* 204 */       Logger.getInstance().error(this, "Properties source variable " + variableName + " is not an instance of java.util.Map");
/* 205 */       return false;
/*     */     } 
/* 207 */     if (variable instanceof TextProperties) {
/* 208 */       sourceProperties.putAll((TextProperties)variable);
/*     */     } else {
/* 210 */       Map<?, ?> map = (Map<?, ?>)variable;
/* 211 */       for (Map.Entry<?, ?> entry : map.entrySet()) {
/* 212 */         Object key = entry.getKey();
/* 213 */         Object value = entry.getValue();
/* 214 */         if (key != null && value != null) {
/* 215 */           sourceProperties.put(key.toString(), value.toString());
/*     */         }
/*     */       } 
/*     */     } 
/* 219 */     return true;
/*     */   }
/*     */   
/*     */   private TextProperties mergeProperties(TextProperties sourceProperties, TextProperties targetProperties) {
/* 223 */     TextProperties newProperties = new TextProperties();
/* 224 */     for (Map.Entry<String, String> entry : sourceProperties.entrySet()) {
/* 225 */       String key = entry.getKey();
/* 226 */       boolean keyAlreadyPresent = targetProperties.containsKey(key);
/*     */       
/* 228 */       String value = maybeReplaceVariables(entry.getValue());
/* 229 */       if (isUpdateExistingKeys() && keyAlreadyPresent) {
/* 230 */         targetProperties.put(key, value);
/* 231 */       } else if (!keyAlreadyPresent) {
/* 232 */         newProperties.put(key, value);
/*     */       } 
/* 234 */       String comment = maybeReplaceVariables(sourceProperties.getPrefix(key));
/* 235 */       if (comment != null) {
/* 236 */         if (isUpdateExistingComments() && keyAlreadyPresent) {
/* 237 */           targetProperties.setPrefix(key, comment); continue;
/* 238 */         }  if (!keyAlreadyPresent) {
/* 239 */           newProperties.setPrefix(key, comment);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 244 */     PropertiesSortMode propertiesSortMode = getPropertiesSortMode();
/* 245 */     switch (propertiesSortMode) {
/*     */       case UNSORTED_APPEND:
/* 247 */         targetProperties.putAll(newProperties);
/* 248 */         return targetProperties;
/*     */       case UNSORTED_PREPEND:
/* 250 */         newProperties.putAll(targetProperties);
/* 251 */         return newProperties;
/*     */       case KEYS_ALPHABETICALLY:
/* 253 */         targetProperties.putAll(newProperties);
/* 254 */         return sortKeys(targetProperties);
/*     */     } 
/* 256 */     throw new RuntimeException(propertiesSortMode.name());
/*     */   }
/*     */ 
/*     */   
/*     */   private TextProperties sortKeys(TextProperties textProperties) {
/* 261 */     List<String> keys = new ArrayList<>(textProperties.keySet());
/* 262 */     Collections.sort(keys);
/*     */     
/* 264 */     TextProperties sortedProperties = new TextProperties();
/* 265 */     for (String key : keys) {
/* 266 */       sortedProperties.put(key, textProperties.get(key));
/* 267 */       String prefix = textProperties.getPrefix(key);
/* 268 */       if (prefix != null) {
/* 269 */         sortedProperties.setPrefix(key, prefix);
/*     */       }
/*     */     } 
/*     */     
/* 273 */     return sortedProperties;
/*     */   }
/*     */   
/*     */   private String maybeReplaceVariables(String text) {
/* 277 */     if (text != null && isReplaceInstallerVariables()) {
/* 278 */       return replaceVariables(text, VariableErrorHandlingDescriptor.ALWAYS_EXCEPTION);
/*     */     }
/* 280 */     return text;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\properties\WritePropertiesFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */