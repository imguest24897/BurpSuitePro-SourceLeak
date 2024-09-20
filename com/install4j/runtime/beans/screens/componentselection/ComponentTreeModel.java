/*    */ package com.install4j.runtime.beans.screens.componentselection;
/*    */ 
/*    */ import javax.swing.tree.DefaultTreeModel;
/*    */ 
/*    */ public class ComponentTreeModel
/*    */   extends DefaultTreeModel {
/*    */   private ComponentTree tree;
/*    */   
/*    */   public ComponentTreeModel(ComponentTree tree) {
/* 10 */     super(new ComponentFolderNode(null, null));
/* 11 */     ((ComponentFolderNode)getRoot()).setModel(this);
/* 12 */     this.tree = tree;
/*    */   }
/*    */   
/*    */   public ComponentTree getTree() {
/* 16 */     return this.tree;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\componentselection\ComponentTreeModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */