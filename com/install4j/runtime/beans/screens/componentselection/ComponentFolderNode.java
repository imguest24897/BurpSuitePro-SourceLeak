/*    */ package com.install4j.runtime.beans.screens.componentselection;
/*    */ 
/*    */ import com.install4j.runtime.installer.config.ComponentFolderConfig;
/*    */ import com.install4j.runtime.installer.config.ComponentNodeConfig;
/*    */ import java.util.Enumeration;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ import javax.swing.tree.TreeNode;
/*    */ 
/*    */ public class ComponentFolderNode extends ComponentNode {
/*    */   private boolean allSelected = false;
/*    */   private boolean changeable = true;
/* 13 */   private Set<ComponentNode> hiddenNodes = new HashSet<>();
/*    */   
/*    */   public ComponentFolderNode(ComponentFolderConfig config, ComponentTreeModel model) {
/* 16 */     super((ComponentNodeConfig)config, model);
/*    */   }
/*    */   
/*    */   public ComponentFolderConfig getComponentFolderConfig() {
/* 20 */     return (ComponentFolderConfig)getComponentNodeConfig();
/*    */   }
/*    */   
/*    */   public boolean isAllSelected() {
/* 24 */     return this.allSelected;
/*    */   }
/*    */ 
/*    */   
/*    */   public void checkState() {
/* 29 */     ComponentFolderConfig config = getComponentFolderConfig();
/* 30 */     if (config == null || config.isBlockStateChanges()) {
/*    */       return;
/*    */     }
/*    */     
/* 34 */     boolean hasSelected = false;
/* 35 */     boolean allSelected = true;
/* 36 */     boolean changeable = isChangeable();
/* 37 */     Enumeration<TreeNode> en = children();
/* 38 */     while (en.hasMoreElements()) {
/* 39 */       ComponentNode childNode = (ComponentNode)en.nextElement();
/* 40 */       if (childNode.isSelected()) {
/* 41 */         hasSelected = true;
/* 42 */         if (childNode instanceof ComponentFolderNode && !((ComponentFolderNode)childNode).isAllSelected())
/* 43 */           allSelected = false; 
/*    */         continue;
/*    */       } 
/* 46 */       allSelected = false;
/*    */     } 
/*    */ 
/*    */     
/* 50 */     boolean changed = (config.isSelected() != hasSelected || this.allSelected != allSelected || this.changeable != changeable);
/* 51 */     if (changed) {
/* 52 */       this.allSelected = allSelected;
/* 53 */       this.changeable = changeable;
/* 54 */       config.setSelected(hasSelected);
/* 55 */       changed();
/*    */     } 
/*    */     
/* 58 */     ((ComponentFolderNode)getParent()).checkState();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean isChangeable() {
/* 64 */     boolean defaultReturn = true;
/* 65 */     Enumeration<TreeNode> en = children();
/* 66 */     while (en.hasMoreElements()) {
/* 67 */       ComponentNode childNode = (ComponentNode)en.nextElement();
/* 68 */       if (childNode.isChangeable()) {
/* 69 */         return true;
/*    */       }
/* 71 */       defaultReturn = false;
/*    */     } 
/*    */     
/* 74 */     return defaultReturn;
/*    */   }
/*    */   
/*    */   public void hide(ComponentNode componentNode) {
/* 78 */     if (!this.hiddenNodes.contains(componentNode)) {
/* 79 */       getModel().removeNodeFromParent(componentNode);
/* 80 */       componentNode.setParent(this);
/* 81 */       this.hiddenNodes.add(componentNode);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void show(ComponentNode componentNode) {
/* 86 */     if (this.hiddenNodes.remove(componentNode)) {
/* 87 */       componentNode.setParent(null);
/* 88 */       getModel().insertNodeInto(componentNode, this, getChildCount());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\componentselection\ComponentFolderNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */