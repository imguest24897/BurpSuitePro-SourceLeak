/*    */ package com.install4j.runtime.beans.screens.installationcomponents;
/*    */ 
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentNode;
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentTreeModel;
/*    */ import com.install4j.runtime.installer.config.ComponentConfig;
/*    */ import com.install4j.runtime.installer.config.ComponentNodeConfig;
/*    */ import java.util.Enumeration;
/*    */ import java.util.List;
/*    */ import java.util.Objects;
/*    */ import javax.swing.tree.DefaultMutableTreeNode;
/*    */ import javax.swing.tree.TreeNode;
/*    */ 
/*    */ public class InstallationComponentNode extends ComponentNode {
/*    */   public InstallationComponentNode(ComponentConfig config, InstallationComponentTreeModel model) {
/* 15 */     super((ComponentNodeConfig)config, model);
/*    */   }
/*    */   
/*    */   public ComponentConfig getComponentConfig() {
/* 19 */     return (ComponentConfig)getComponentNodeConfig();
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean isChangeable() {
/* 24 */     ComponentConfig componentConfig = getComponentConfig();
/* 25 */     return (!componentConfig.isMandatory() && componentConfig.isChangeable());
/*    */   }
/*    */ 
/*    */   
/*    */   public void setSelected(boolean selected, boolean directUserAction) {
/* 30 */     super.setSelected(selected, directUserAction);
/*    */     
/* 32 */     List<String> dependencies = getComponentConfig().getDependencies();
/*    */     
/* 34 */     ComponentTreeModel model = getModel();
/* 35 */     Enumeration<TreeNode> en = ((DefaultMutableTreeNode)model.getRoot()).preorderEnumeration();
/* 36 */     while (en.hasMoreElements()) {
/* 37 */       DefaultMutableTreeNode node = (DefaultMutableTreeNode)en.nextElement();
/* 38 */       if (node instanceof InstallationComponentNode) {
/* 39 */         InstallationComponentNode componentNode = (InstallationComponentNode)node;
/*    */         
/* 41 */         for (String id : dependencies) {
/* 42 */           if (Objects.equals(componentNode.getComponentConfig().getId(), id))
/* 43 */             model.nodeChanged((TreeNode)componentNode); 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\installationcomponents\InstallationComponentNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */