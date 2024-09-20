/*    */ package com.install4j.runtime.beans.screens.installationcomponents;
/*    */ 
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentFolderNode;
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentNode;
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentTree;
/*    */ import com.install4j.runtime.beans.screens.componentselection.ComponentTreeModel;
/*    */ import com.install4j.runtime.installer.config.ComponentConfig;
/*    */ import com.install4j.runtime.installer.config.ComponentFolderConfig;
/*    */ import com.install4j.runtime.installer.config.ComponentNodeConfig;
/*    */ import com.install4j.runtime.installer.config.InstallerConfig;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Enumeration;
/*    */ import javax.swing.tree.DefaultMutableTreeNode;
/*    */ import javax.swing.tree.MutableTreeNode;
/*    */ import javax.swing.tree.TreeNode;
/*    */ import javax.swing.tree.TreePath;
/*    */ 
/*    */ public class InstallationComponentTreeModel extends ComponentTreeModel {
/*    */   public InstallationComponentTreeModel(ComponentTree tree) {
/* 20 */     super(tree);
/*    */     
/* 22 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/* 23 */     DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode)this.root;
/* 24 */     if (config != null) {
/* 25 */       addFolder(rootNode, config.getComponentRoot());
/*    */     } else {
/*    */       
/* 28 */       addDemoNode(rootNode, 1);
/* 29 */       addDemoNode(rootNode, 2);
/* 30 */       addDemoNode(rootNode, 3);
/* 31 */       addFolder(rootNode, new ComponentFolderConfig(null));
/*    */     } 
/*    */   }
/*    */   
/*    */   public void addDemoNode(DefaultMutableTreeNode rootNode, int index) {
/* 36 */     ComponentConfig componentConfig = new ComponentConfig(null);
/* 37 */     componentConfig.setName("Installation component " + index);
/* 38 */     componentConfig.setDescription("This is the description for installation component " + index);
/* 39 */     componentConfig.setChangeable(true);
/* 40 */     componentConfig.setHideHelpButton(false);
/* 41 */     rootNode.add((MutableTreeNode)new InstallationComponentNode(componentConfig, this));
/*    */   }
/*    */ 
/*    */   
/*    */   public void checkFolders() {
/* 46 */     DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode)this.root;
/* 47 */     Enumeration<TreeNode> en = rootNode.depthFirstEnumeration();
/* 48 */     ArrayList<ComponentNode> nodesToHide = new ArrayList<>();
/* 49 */     while (en.hasMoreElements()) {
/* 50 */       ComponentNode node = (ComponentNode)en.nextElement();
/* 51 */       if (node.getComponentNodeConfig() == null) {
/*    */         continue;
/*    */       }
/* 54 */       if (node.getComponentNodeConfig().isHidden()) {
/* 55 */         nodesToHide.add(node); continue;
/* 56 */       }  if (node instanceof ComponentFolderNode) {
/* 57 */         ComponentFolderNode componentFolderNode = (ComponentFolderNode)node;
/* 58 */         ComponentFolderConfig componentFolderConfig = componentFolderNode.getComponentFolderConfig();
/* 59 */         if (componentFolderConfig.isExpanded()) {
/* 60 */           getTree().expandPath(new TreePath((Object[])node.getPath()));
/*    */         }
/* 62 */         componentFolderNode.checkState();
/*    */       } 
/*    */     } 
/* 65 */     for (ComponentNode node : nodesToHide) {
/* 66 */       ((ComponentFolderNode)node.getParent()).hide(node);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   private void addFolder(DefaultMutableTreeNode parentNode, ComponentFolderConfig folderConfig) {
/* 72 */     for (ComponentNodeConfig componentNodeConfig : folderConfig.getComponents()) {
/* 73 */       ComponentNode childNode = null;
/* 74 */       if (componentNodeConfig instanceof ComponentFolderConfig) {
/* 75 */         ComponentFolderConfig childFolderConfig = (ComponentFolderConfig)componentNodeConfig;
/* 76 */         ComponentFolderNode componentFolderNode = new ComponentFolderNode(childFolderConfig, this);
/* 77 */         addFolder((DefaultMutableTreeNode)componentFolderNode, childFolderConfig);
/* 78 */       } else if (componentNodeConfig instanceof ComponentConfig) {
/* 79 */         childNode = new InstallationComponentNode((ComponentConfig)componentNodeConfig, this);
/*    */       } 
/* 81 */       if (childNode != null)
/* 82 */         parentNode.add((MutableTreeNode)childNode); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\installationcomponents\InstallationComponentTreeModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */