/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.install4j.api.actions.Action;
/*    */ import com.install4j.runtime.beans.actions.FailureStrategy;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import java.util.Map;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ 
/*    */ public class LinkActionBeanConfig
/*    */   extends ActionBeanConfig
/*    */   implements LinkBeanConfig
/*    */ {
/*    */   private ActionBeanConfig delegate;
/*    */   private String targetId;
/*    */   
/*    */   protected void read(Element element) {
/* 18 */     super.read(element);
/* 19 */     this.targetId = readAttribute(element, "targetId", this.targetId);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setDelegate(Map id2BeanConfig) {
/* 24 */     this.delegate = (ActionBeanConfig)id2BeanConfig.get(getIdInNamespace(this.targetId));
/*    */   }
/*    */ 
/*    */   
/*    */   public AbstractBeanConfig getDelegate() {
/* 29 */     return this.delegate;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getConditionClassName() {
/* 34 */     return this.delegate.getConditionClassName();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackBarrier() {
/* 39 */     return this.delegate.isRollbackBarrier();
/*    */   }
/*    */ 
/*    */   
/*    */   public int getRollbackBarrierExitCode() {
/* 44 */     return this.delegate.getRollbackBarrierExitCode();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isInstantiated() {
/* 49 */     return this.delegate.isInstantiated();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isElevate() {
/* 54 */     return this.delegate.isElevate();
/*    */   }
/*    */ 
/*    */   
/*    */   public ExecutionContext getExecutionContext() {
/* 59 */     return this.delegate.getExecutionContext();
/*    */   }
/*    */ 
/*    */   
/*    */   public Action getOrInstantiateAction(boolean suppressErrors) {
/* 64 */     return this.delegate.getOrInstantiateAction(suppressErrors);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isExecuted() {
/* 69 */     return this.delegate.isExecuted();
/*    */   }
/*    */ 
/*    */   
/*    */   public void setExecuted(boolean executed) {
/* 74 */     this.delegate.setExecuted(executed);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isInitialized() {
/* 79 */     return this.delegate.isInitialized();
/*    */   }
/*    */ 
/*    */   
/*    */   public void setInitialized(boolean initialized) {
/* 84 */     this.delegate.setInitialized(initialized);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isMultiExec() {
/* 89 */     return this.delegate.isMultiExec();
/*    */   }
/*    */ 
/*    */   
/*    */   public FailureStrategy getFailureStrategy() {
/* 94 */     return this.delegate.getFailureStrategy();
/*    */   }
/*    */ 
/*    */   
/*    */   public String getErrorMessage() {
/* 99 */     return this.delegate.getErrorMessage();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\LinkActionBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */