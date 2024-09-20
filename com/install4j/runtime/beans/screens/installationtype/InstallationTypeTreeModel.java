/*    */ package com.install4j.runtime.beans.screens.installationtype;
/*    */ 
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentFolderNode;
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentTreeModel;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import javax.swing.tree.MutableTreeNode;
/*    */ 
/*    */ public class InstallationTypeTreeModel
/*    */   extends ComponentTreeModel {
/*    */   public InstallationTypeTreeModel(InstallationTypeTree tree) {
/* 12 */     super(tree);
/*    */     
/* 14 */     String initialId = tree.getInstallationTypeScreen().getInitialId();
/*    */     
/* 16 */     List<InstallationTypeConfig> configs = tree.getInstallationTypeScreen().getInstallationTypeConfigs();
/* 17 */     Iterator<InstallationTypeConfig> it = configs.iterator();
/* 18 */     boolean found = false;
/* 19 */     while (it.hasNext()) {
/* 20 */       InstallationTypeConfig config = it.next();
/* 21 */       if (config.getId().equals(initialId) || config.getDisplayedId().equals(initialId)) {
/* 22 */         config.setSelected(true);
/* 23 */         found = true;
/*    */       } else {
/* 25 */         config.setSelected(false);
/*    */       } 
/*    */       
/* 28 */       InstallationTypeNode installationTypeNode = new InstallationTypeNode(config, this);
/* 29 */       ((ComponentFolderNode)this.root).add((MutableTreeNode)installationTypeNode);
/*    */     } 
/* 31 */     if (!found && configs.size() > 0)
/* 32 */       ((InstallationTypeConfig)configs.get(0)).setSelected(true); 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\installationtype\InstallationTypeTreeModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */