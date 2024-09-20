/*     */ package com.install4j.runtime.installer.config;
/*     */ 
/*     */ import com.install4j.api.context.WizardIndex;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.runtime.beans.screens.BackButtonType;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ 
/*     */ public class LinkScreenBeanConfig
/*     */   extends ScreenBeanConfig
/*     */   implements LinkBeanConfig
/*     */ {
/*     */   private ScreenBeanConfig delegate;
/*     */   private String targetId;
/*     */   
/*     */   protected void read(Element element) {
/*  19 */     super.read(element);
/*  20 */     this.targetId = readAttribute(element, "targetId", this.targetId);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDelegate(Map id2BeanConfig) {
/*  25 */     this.delegate = (ScreenBeanConfig)id2BeanConfig.get(getIdInNamespace(this.targetId));
/*     */   }
/*     */ 
/*     */   
/*     */   public AbstractBeanConfig getDelegate() {
/*  30 */     return this.delegate;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getConditionClassName() {
/*  35 */     return this.delegate.getConditionClassName();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isRollbackBarrier() {
/*  40 */     return this.delegate.isRollbackBarrier();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getRollbackBarrierExitCode() {
/*  45 */     return this.delegate.getRollbackBarrierExitCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public Screen getOrInstantiateScreen(boolean suppressErrors) {
/*  50 */     return this.delegate.getOrInstantiateScreen(suppressErrors);
/*     */   }
/*     */ 
/*     */   
/*     */   public BackButtonType getBackButtonType() {
/*  55 */     return this.delegate.getBackButtonType();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isFinishScreen() {
/*  60 */     return this.delegate.isFinishScreen();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPreActivationClassName() {
/*  65 */     return this.delegate.getPreActivationClassName();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPostActivationClassName() {
/*  70 */     return this.delegate.getPostActivationClassName();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getValidationClassName() {
/*  75 */     return this.delegate.getValidationClassName();
/*     */   }
/*     */ 
/*     */   
/*     */   public List<AbstractBeanConfig> getActionConfigs() {
/*  80 */     return this.delegate.getActionConfigs();
/*     */   }
/*     */ 
/*     */   
/*     */   public List<AbstractBeanConfig> getFormComponentConfigs() {
/*  85 */     return this.delegate.getFormComponentConfigs();
/*     */   }
/*     */ 
/*     */   
/*     */   public int getWizardIndexChangeType() {
/*  90 */     return this.delegate.getWizardIndexChangeType();
/*     */   }
/*     */ 
/*     */   
/*     */   public String getWizardIndexKey() {
/*  95 */     return this.delegate.getWizardIndexKey();
/*     */   }
/*     */ 
/*     */   
/*     */   public WizardIndex getWizardIndex() {
/* 100 */     return this.delegate.getWizardIndex();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isInstantiated() {
/* 105 */     return this.delegate.isInstantiated();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void clearInstance() {
/* 110 */     this.delegate.clearInstance();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\LinkScreenBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */