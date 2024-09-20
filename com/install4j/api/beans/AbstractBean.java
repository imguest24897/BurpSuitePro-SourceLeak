/*     */ package com.install4j.api.beans;
/*     */ 
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import java.io.File;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractBean
/*     */   implements Bean
/*     */ {
/*     */   public static String replaceVariables(String value) throws UndefinedVariableException {
/*  36 */     return InstallerVariables.replaceVariables(value);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String replaceVariables(String value, ReplacementMode replacementMode) throws UndefinedVariableException {
/*  49 */     return InstallerVariables.replaceVariables(value, replacementMode);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String replaceVariables(String value, VariableErrorHandlingDescriptor errorHandlingDescriptor) throws UndefinedVariableException {
/*  62 */     return InstallerVariables.replaceVariables(value, ReplacementMode.PLAIN, errorHandlingDescriptor);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String replaceVariables(String value, ReplacementMode replacementMode, VariableErrorHandlingDescriptor errorHandlingDescriptor) throws UndefinedVariableException {
/*  77 */     return InstallerVariables.replaceVariables(value, replacementMode, errorHandlingDescriptor);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static File replaceVariables(File file) throws UndefinedVariableException {
/*  91 */     return InstallerVariables.replaceVariables(file);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String[] replaceVariables(String[] values) throws UndefinedVariableException {
/* 103 */     return replaceVariables(values, VariableErrorHandlingDescriptor.DEFAULT);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String[] replaceVariables(String[] values, VariableErrorHandlingDescriptor errorHandlingDescriptor) throws UndefinedVariableException {
/* 141 */     return InstallerVariables.replaceVariables((Object[])values, errorHandlingDescriptor);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static File[] replaceVariables(File[] files) throws UndefinedVariableException {
/* 153 */     if (files == null) {
/* 154 */       return null;
/*     */     }
/* 156 */     String[] replacedFileNames = InstallerVariables.replaceVariables((Object[])files, VariableErrorHandlingDescriptor.DEFAULT);
/* 157 */     File[] replacedFiles = new File[replacedFileNames.length];
/* 158 */     for (int i = 0; i < replacedFileNames.length; i++) {
/* 159 */       replacedFiles[i] = new File(replacedFileNames[i]);
/*     */     }
/* 161 */     return replacedFiles;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean executeActionListSync(ActionList actionList, Object... extraScriptParameters) throws UserCanceledException {
/* 181 */     return ContextImpl.getSingleContextInt().executeActionListSync(actionList, extraScriptParameters);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void executeActionListAsync(ActionList actionList, Object... extraScriptParameters) {
/* 196 */     ContextImpl.getSingleContextInt().executeActionListAsync(actionList, extraScriptParameters);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void rollbackActionList(ActionList actionList) {
/* 207 */     ContextImpl.getSingleContextInt().rollbackActionList(actionList);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> T getTextOverrideValue(Bean bean, String propertyName, Class<T> resultType) {
/* 226 */     return (T)InstallerVariables.getTextOverrideValue(bean, propertyName, resultType);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static <T> T replaceWithTextOverride(Bean bean, String propertyName, T defaultValue, Class<T> resultType) {
/* 236 */     T textOverride = getTextOverrideValue(bean, propertyName, resultType);
/* 237 */     return (textOverride != null) ? textOverride : defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected <T> T replaceWithTextOverride(String propertyName, T defaultValue, Class resultType) {
/* 246 */     return replaceWithTextOverride(this, propertyName, defaultValue, resultType);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean replaceWithTextOverride(String propertyName, boolean defaultValue) {
/* 254 */     Boolean overrideValue = getTextOverrideValue(this, propertyName, Boolean.class);
/* 255 */     return (overrideValue != null) ? overrideValue.booleanValue() : defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected int replaceWithTextOverride(String propertyName, int defaultValue) {
/* 263 */     Integer overrideValue = getTextOverrideValue(this, propertyName, Integer.class);
/* 264 */     return (overrideValue != null) ? overrideValue.intValue() : defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected long replaceWithTextOverride(String propertyName, long defaultValue) {
/* 272 */     Long overrideValue = getTextOverrideValue(this, propertyName, Long.class);
/* 273 */     return (overrideValue != null) ? overrideValue.longValue() : defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected short replaceWithTextOverride(String propertyName, short defaultValue) {
/* 281 */     Short overrideValue = getTextOverrideValue(this, propertyName, Short.class);
/* 282 */     return (overrideValue != null) ? overrideValue.shortValue() : defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected byte replaceWithTextOverride(String propertyName, byte defaultValue) {
/* 290 */     Byte overrideValue = getTextOverrideValue(this, propertyName, Byte.class);
/* 291 */     return (overrideValue != null) ? overrideValue.byteValue() : defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected char replaceWithTextOverride(String propertyName, char defaultValue) {
/* 299 */     Character overrideValue = getTextOverrideValue(this, propertyName, Character.class);
/* 300 */     return (overrideValue != null) ? overrideValue.charValue() : defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float replaceWithTextOverride(String propertyName, float defaultValue) {
/* 308 */     Float overrideValue = getTextOverrideValue(this, propertyName, Float.class);
/* 309 */     return (overrideValue != null) ? overrideValue.floatValue() : defaultValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected double replaceWithTextOverride(String propertyName, double defaultValue) {
/* 317 */     Double overrideValue = getTextOverrideValue(this, propertyName, Double.class);
/* 318 */     return (overrideValue != null) ? overrideValue.doubleValue() : defaultValue;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beans\AbstractBean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */