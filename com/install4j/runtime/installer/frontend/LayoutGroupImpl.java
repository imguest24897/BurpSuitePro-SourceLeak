/*    */ package com.install4j.runtime.installer.frontend;
/*    */ import com.install4j.api.formcomponents.FormComponent;
/*    */ import com.install4j.api.formcomponents.GroupType;
/*    */ import com.install4j.api.formcomponents.LayoutGroup;
/*    */ import com.install4j.runtime.beans.groups.FormComponentGroup;
/*    */ import com.install4j.runtime.installer.config.FormComponentProvider;
/*    */ import com.install4j.runtime.installer.config.GroupProvider;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ 
/*    */ public class LayoutGroupImpl implements LayoutGroup {
/*    */   private GroupProvider groupProvider;
/*    */   private List<?> children;
/*    */   
/*    */   public static List<?> createChildren(List<?> beanConfigs) {
/* 17 */     List<Object> children = new ArrayList(beanConfigs.size());
/* 18 */     for (Object bean : beanConfigs) {
/* 19 */       if (bean instanceof GroupProvider) {
/* 20 */         children.add(new LayoutGroupImpl((GroupProvider)bean)); continue;
/* 21 */       }  if (bean instanceof FormComponentProvider) {
/* 22 */         children.add(((FormComponentProvider)bean).getFormComponent());
/*    */       }
/*    */     } 
/* 25 */     return Collections.unmodifiableList(children);
/*    */   }
/*    */   
/*    */   public static LayoutGroup findLayoutGroupById(String id, List beans) {
/* 29 */     for (Object bean : beans) {
/* 30 */       if (bean instanceof LayoutGroup) {
/* 31 */         LayoutGroupImpl layoutGroup = (LayoutGroupImpl)bean;
/* 32 */         if (layoutGroup.getId().equals(id) || layoutGroup.getInternalId().equals(id)) {
/* 33 */           return layoutGroup;
/*    */         }
/* 35 */         LayoutGroup descendantGroup = findLayoutGroupById(id, layoutGroup.getChildren());
/* 36 */         if (descendantGroup != null) {
/* 37 */           return descendantGroup;
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 42 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public LayoutGroupImpl(GroupProvider groupProvider) {
/* 49 */     this.groupProvider = groupProvider;
/* 50 */     this.children = createChildren(groupProvider.getBeanConfigs());
/*    */   }
/*    */ 
/*    */   
/*    */   public GroupType getGroupType() {
/* 55 */     return getGroup().getGroupType();
/*    */   }
/*    */ 
/*    */   
/*    */   public void setEnabled(boolean enabled) {
/* 60 */     getGroup().setEnabled(enabled);
/* 61 */     for (Object bean : this.children) {
/* 62 */       if (bean instanceof LayoutGroup) {
/* 63 */         ((LayoutGroup)bean).setEnabled(enabled); continue;
/* 64 */       }  if (bean instanceof FormComponent) {
/* 65 */         ((FormComponent)bean).setEnabled(enabled);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void setVisible(boolean visible) {
/* 72 */     getGroup().setVisible(visible);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isVisible() {
/* 77 */     return getGroup().isVisible();
/*    */   }
/*    */ 
/*    */   
/*    */   public String getId() {
/* 82 */     return this.groupProvider.getDisplayedId();
/*    */   }
/*    */   
/*    */   public String getInternalId() {
/* 86 */     return this.groupProvider.getId();
/*    */   }
/*    */ 
/*    */   
/*    */   public List<?> getChildren() {
/* 91 */     return this.children;
/*    */   }
/*    */   
/*    */   public GroupProvider getGroupProvider() {
/* 95 */     return this.groupProvider;
/*    */   }
/*    */   
/*    */   public FormComponentGroup getGroup() {
/* 99 */     return (FormComponentGroup)this.groupProvider.getOrInstantiateBean();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\LayoutGroupImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */