/*     */ package com.install4j.runtime.installer.config;
/*     */ 
/*     */ import com.install4j.api.actions.Action;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.runtime.beans.actions.FailureStrategy;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ 
/*     */ public class ActionBeanConfig
/*     */   extends AbstractBeanConfig
/*     */ {
/*     */   private Action instance;
/*     */   private boolean multiExec = false;
/*  17 */   private FailureStrategy failureStrategy = FailureStrategy.CONTINUE;
/*  18 */   private String errorMessage = "";
/*     */   
/*     */   private boolean elevate;
/*     */   private boolean executed = false;
/*     */   private boolean rolledBack = false;
/*     */   private boolean initialized = false;
/*  24 */   private int rollbackId = -1;
/*     */   
/*     */   public Action getOrInstantiateAction(boolean suppressErrors) {
/*  27 */     if (this.instance == null) {
/*  28 */       this.instance = (Action)instantiateBean(suppressErrors);
/*     */     }
/*  30 */     return this.instance;
/*     */   }
/*     */   
/*     */   public void setRollbackId(int rollbackId) {
/*  34 */     this.rollbackId = rollbackId;
/*     */   }
/*     */   
/*     */   public int getRollbackId() {
/*  38 */     return this.rollbackId;
/*     */   }
/*     */   
/*     */   public boolean isRolledBack() {
/*  42 */     return this.rolledBack;
/*     */   }
/*     */   
/*     */   public void setRolledBack(boolean rolledBack) {
/*  46 */     this.rolledBack = rolledBack;
/*     */   }
/*     */   
/*     */   public boolean isExecuted() {
/*  50 */     return this.executed;
/*     */   }
/*     */   
/*     */   public void setExecuted(boolean executed) {
/*  54 */     this.executed = executed;
/*     */   }
/*     */   
/*     */   public boolean isInitialized() {
/*  58 */     return this.initialized;
/*     */   }
/*     */   
/*     */   public void setInitialized(boolean initialized) {
/*  62 */     this.initialized = initialized;
/*     */   }
/*     */   
/*     */   public boolean isMultiExec() {
/*  66 */     return this.multiExec;
/*     */   }
/*     */   
/*     */   public FailureStrategy getFailureStrategy() {
/*  70 */     return this.failureStrategy;
/*     */   }
/*     */   
/*     */   public boolean isElevate() {
/*  74 */     return this.elevate;
/*     */   }
/*     */   
/*     */   public ExecutionContext getExecutionContext() {
/*  78 */     return isElevate() ? ExecutionContext.MAXIMUM : ExecutionContext.UNELEVATED;
/*     */   }
/*     */   
/*     */   public String getErrorMessage() {
/*  82 */     return InstallerVariables.replaceVariables(this.errorMessage);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInstantiated() {
/*  87 */     return (this.instance != null);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void clearInstance() {
/*  92 */     this.instance = null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void setBean(Bean bean) {
/*  97 */     this.instance = (Action)bean;
/*     */   }
/*     */   
/*     */   public void setInstance(Action action) {
/* 101 */     this.instance = action;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void read(Element element) {
/* 106 */     super.read(element);
/*     */     
/* 108 */     this.multiExec = readAttribute(element, "multiExec", this.multiExec);
/* 109 */     this.failureStrategy = readAttribute(element, "cancelOnFail", this.failureStrategy);
/* 110 */     this.errorMessage = readAttribute(element, "errorMessage", this.errorMessage);
/* 111 */     this.errorMessage = StringUtil.replace(this.errorMessage, "\\n", "\n");
/* 112 */     this.errorMessage = StringUtil.replace(this.errorMessage, "\\t", "\t");
/* 113 */     this.elevate = readAttribute(element, "elevate", this.elevate);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\ActionBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */