/*     */ package com.install4j.runtime.beans.screens.componentselection;
/*     */ 
/*     */ import com.install4j.runtime.installer.config.ComponentNodeConfig;
/*     */ import java.util.Enumeration;
/*     */ import javax.swing.tree.DefaultMutableTreeNode;
/*     */ import javax.swing.tree.TreeNode;
/*     */ import javax.swing.tree.TreePath;
/*     */ 
/*     */ public class ComponentNode
/*     */   extends DefaultMutableTreeNode implements ComponentNodeConfig.ComponentChangeListener {
/*     */   private ComponentNodeConfig config;
/*     */   private ComponentTreeModel model;
/*     */   private boolean inUserSelectionChange;
/*     */   
/*     */   public ComponentNode(ComponentNodeConfig config, ComponentTreeModel model) {
/*  16 */     this.model = model;
/*  17 */     this.config = config;
/*  18 */     if (config != null) {
/*  19 */       config.addComponentChangeListener(this);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void selectionChanged(ComponentNodeConfig componentNodeConfig) {
/*  25 */     this.model.getTree().selectionChanged(this, !this.inUserSelectionChange);
/*  26 */     redrawNodeAndParents();
/*     */   }
/*     */ 
/*     */   
/*     */   public void changeableChanged(ComponentNodeConfig componentNodeConfig) {
/*  31 */     redrawNodeAndParents();
/*     */   }
/*     */   
/*     */   public void setModel(ComponentTreeModel model) {
/*  35 */     this.model = model;
/*     */   }
/*     */ 
/*     */   
/*     */   public void hiddenChanged(ComponentNodeConfig componentNodeConfig) {
/*  40 */     ComponentFolderNode parentNode = (ComponentFolderNode)getParent();
/*  41 */     if (parentNode != null) {
/*  42 */       if (componentNodeConfig.isHidden()) {
/*  43 */         parentNode.hide(this);
/*     */       } else {
/*  45 */         parentNode.show(this);
/*     */       } 
/*  47 */       parentNode.checkState();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void redrawNodeAndParents() {
/*  52 */     changed();
/*  53 */     ComponentFolderNode parentNode = (ComponentFolderNode)getParent();
/*  54 */     if (parentNode != null) {
/*  55 */       parentNode.checkState();
/*     */     }
/*     */   }
/*     */   
/*     */   public ComponentNodeConfig getComponentNodeConfig() {
/*  60 */     return this.config;
/*     */   }
/*     */   
/*     */   public boolean isSelected() {
/*  64 */     return this.config.isSelected();
/*     */   }
/*     */   
/*     */   public void setSelected(boolean selected, boolean directUserAction) {
/*  68 */     if (!isChangeable()) {
/*     */       return;
/*     */     }
/*  71 */     this.inUserSelectionChange = directUserAction;
/*     */     try {
/*  73 */       this.config.setSelected(selected);
/*     */ 
/*     */       
/*  76 */       changed();
/*     */       
/*  78 */       if (this.children != null) {
/*  79 */         setChildrenSelected(selected);
/*  80 */         if (!selected && getSelectedChildrenCount() > 0) {
/*  81 */           int oldCount = 0; int newCount;
/*  82 */           while (oldCount != (newCount = getSelectedChildrenCount())) {
/*  83 */             setChildrenSelected(false);
/*  84 */             oldCount = newCount;
/*     */           } 
/*     */         } 
/*     */       } 
/*  88 */       Enumeration<TreeNode> en = ((DefaultMutableTreeNode)this.model.getRoot()).depthFirstEnumeration();
/*  89 */       while (en.hasMoreElements()) {
/*  90 */         DefaultMutableTreeNode node = (DefaultMutableTreeNode)en.nextElement();
/*  91 */         if (node.isLeaf()) {
/*  92 */           ((ComponentFolderNode)node.getParent()).checkState();
/*     */         }
/*     */       } 
/*     */     } finally {
/*     */       
/*  97 */       this.inUserSelectionChange = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private int getSelectedChildrenCount() {
/* 102 */     int count = 0;
/* 103 */     for (TreeNode child : this.children) {
/* 104 */       ComponentNode node = (ComponentNode)child;
/* 105 */       if (node.isSelected()) {
/* 106 */         count++;
/*     */       }
/*     */     } 
/* 109 */     return count;
/*     */   }
/*     */   
/*     */   private void setChildrenSelected(boolean selected) {
/* 113 */     for (TreeNode child : this.children) {
/* 114 */       ComponentNode node = (ComponentNode)child;
/* 115 */       node.setSelected(selected, false);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void changed() {
/* 120 */     if (this.model != null) {
/* 121 */       this.model.nodeChanged(this);
/*     */     }
/*     */   }
/*     */   
/*     */   protected boolean isChangeable() {
/* 126 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDisplayDescription(boolean displayDescription) {
/* 131 */     if (this.config == null) {
/*     */       return;
/*     */     }
/* 134 */     this.config.setDisplayDescription(displayDescription);
/* 135 */     ComponentTree tree = this.model.getTree();
/*     */ 
/*     */     
/* 138 */     tree.setEditable(true);
/* 139 */     tree.startEditingAtPath(new TreePath((Object[])getPath()));
/* 140 */     tree.stopEditing();
/* 141 */     tree.setEditable(false);
/*     */     
/* 143 */     changed();
/*     */   }
/*     */   
/*     */   public void toggleDisplayDescription() {
/* 147 */     setDisplayDescription(!this.config.isDisplayDescription());
/*     */   }
/*     */   
/*     */   protected ComponentTreeModel getModel() {
/* 151 */     return this.model;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\componentselection\ComponentNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */