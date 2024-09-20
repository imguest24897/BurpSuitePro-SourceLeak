/*    */ package com.install4j.runtime.installer.config;
/*    */ 
/*    */ import com.install4j.runtime.beans.groups.Group;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import org.w3c.dom.Element;
/*    */ 
/*    */ public class LinkGroupBeanConfig
/*    */   extends GroupBeanConfig
/*    */   implements LinkBeanConfig
/*    */ {
/*    */   private GroupBeanConfig delegate;
/*    */   private String targetId;
/*    */   
/*    */   public LinkGroupBeanConfig(boolean screenGroup) {
/* 16 */     super(screenGroup);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void read(Element element) {
/* 21 */     super.read(element);
/* 22 */     this.targetId = readAttribute(element, "targetId", this.targetId);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setDelegate(Map id2BeanConfig) {
/* 27 */     this.delegate = (GroupBeanConfig)id2BeanConfig.get(getIdInNamespace(this.targetId));
/*    */   }
/*    */ 
/*    */   
/*    */   public AbstractBeanConfig getDelegate() {
/* 32 */     return this.delegate;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getConditionClassName() {
/* 37 */     return this.delegate.getConditionClassName();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackBarrier() {
/* 42 */     return this.delegate.isRollbackBarrier();
/*    */   }
/*    */ 
/*    */   
/*    */   public int getRollbackBarrierExitCode() {
/* 47 */     return this.delegate.getRollbackBarrierExitCode();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isInstantiated() {
/* 52 */     return this.delegate.isInstantiated();
/*    */   }
/*    */ 
/*    */   
/*    */   public Group getOrInstantiateGroup(boolean suppressErrors) {
/* 57 */     return this.delegate.getOrInstantiateGroup(suppressErrors);
/*    */   }
/*    */ 
/*    */   
/*    */   public List<AbstractBeanConfig> getBeanConfigs() {
/* 62 */     return this.delegate.getBeanConfigs();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\config\LinkGroupBeanConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */