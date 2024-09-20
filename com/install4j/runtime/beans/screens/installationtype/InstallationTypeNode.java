/*    */ package com.install4j.runtime.beans.screens.installationtype;
/*    */ 
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentNode;
/*    */ import java.util.Enumeration;
/*    */ import javax.swing.tree.DefaultMutableTreeNode;
/*    */ import javax.swing.tree.TreeNode;
/*    */ 
/*    */ public class InstallationTypeNode
/*    */   extends ComponentNode {
/*    */   public InstallationTypeNode(InstallationTypeConfig config, InstallationTypeTreeModel model) {
/* 11 */     super(config, model);
/*    */   }
/*    */   
/*    */   public InstallationTypeConfig getInstallationTypeConfig() {
/* 15 */     return (InstallationTypeConfig)getComponentNodeConfig();
/*    */   }
/*    */ 
/*    */   
/*    */   public void setSelected(boolean selected, boolean directUserAction) {
/* 20 */     if (!selected) {
/*    */       return;
/*    */     }
/* 23 */     super.setSelected(true, directUserAction);
/*    */     
/* 25 */     Enumeration<TreeNode> en = ((DefaultMutableTreeNode)getModel().getRoot()).preorderEnumeration();
/* 26 */     while (en.hasMoreElements()) {
/* 27 */       DefaultMutableTreeNode node = (DefaultMutableTreeNode)en.nextElement();
/* 28 */       if (node instanceof InstallationTypeNode) {
/* 29 */         InstallationTypeNode installationTypeNode = (InstallationTypeNode)node;
/* 30 */         if (installationTypeNode != this) {
/* 31 */           installationTypeNode.getComponentNodeConfig().setSelected(false);
/* 32 */           getModel().nodeChanged((TreeNode)installationTypeNode);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\installationtype\InstallationTypeNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */