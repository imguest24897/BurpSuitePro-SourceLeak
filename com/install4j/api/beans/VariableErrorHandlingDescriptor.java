/*     */ package com.install4j.api.beans;
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
/*     */ public class VariableErrorHandlingDescriptor
/*     */ {
/*  19 */   public static final VariableErrorHandlingDescriptor DEFAULT = new VariableErrorHandlingDescriptor(VariableErrorHandling.EXCEPTION, VariableErrorHandling.ERROR_MESSAGE, VariableErrorHandling.ERROR_MESSAGE);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  28 */   public static final VariableErrorHandlingDescriptor ALWAYS_IGNORE = new VariableErrorHandlingDescriptor(VariableErrorHandling.IGNORE);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  33 */   public static final VariableErrorHandlingDescriptor ALWAYS_ERROR_MESSAGE = new VariableErrorHandlingDescriptor(VariableErrorHandling.ERROR_MESSAGE);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  38 */   public static final VariableErrorHandlingDescriptor ALWAYS_EXCEPTION = new VariableErrorHandlingDescriptor(VariableErrorHandling.EXCEPTION);
/*     */   
/*     */   private VariableErrorHandling installerVariables;
/*     */   private VariableErrorHandling i18nKeys;
/*     */   private VariableErrorHandling compilerVariables;
/*     */   private VariableErrorHandling formVariables;
/*     */   
/*     */   private VariableErrorHandlingDescriptor(VariableErrorHandling variableErrorHandling) {
/*  46 */     this(variableErrorHandling, variableErrorHandling, variableErrorHandling);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VariableErrorHandlingDescriptor(VariableErrorHandling installerVariables, VariableErrorHandling i18nKeys, VariableErrorHandling compilerVariables) {
/*  55 */     this(installerVariables, i18nKeys, compilerVariables, VariableErrorHandling.ERROR_MESSAGE);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VariableErrorHandlingDescriptor(VariableErrorHandling installerVariables, VariableErrorHandling i18nKeys, VariableErrorHandling compilerVariables, VariableErrorHandling formVariables) {
/*  66 */     this.installerVariables = installerVariables;
/*  67 */     this.i18nKeys = i18nKeys;
/*  68 */     this.compilerVariables = compilerVariables;
/*  69 */     this.formVariables = formVariables;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VariableErrorHandling getInstallerVariables() {
/*  77 */     return this.installerVariables;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VariableErrorHandling getI18nKeys() {
/*  85 */     return this.i18nKeys;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VariableErrorHandling getCompilerVariables() {
/*  93 */     return this.compilerVariables;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VariableErrorHandling getFormVariables() {
/* 101 */     return this.formVariables;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beans\VariableErrorHandlingDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */