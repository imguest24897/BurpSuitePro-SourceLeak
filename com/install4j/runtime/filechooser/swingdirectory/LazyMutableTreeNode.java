/*    */ package com.install4j.runtime.filechooser.swingdirectory;
/*    */ 
/*    */ import javax.swing.tree.DefaultMutableTreeNode;
/*    */ 
/*    */ 
/*    */ abstract class LazyMutableTreeNode
/*    */   extends DefaultMutableTreeNode
/*    */ {
/*    */   private boolean loaded = false;
/*    */   
/*    */   public LazyMutableTreeNode() {}
/*    */   
/*    */   public LazyMutableTreeNode(Object userObject) {
/* 14 */     super(userObject);
/*    */   }
/*    */   
/*    */   public LazyMutableTreeNode(Object userObject, boolean allowsChildren) {
/* 18 */     super(userObject, allowsChildren);
/*    */   }
/*    */ 
/*    */   
/*    */   public int getChildCount() {
/* 23 */     synchronized (this) {
/* 24 */       if (!this.loaded) {
/* 25 */         this.loaded = true;
/* 26 */         loadChildren();
/*    */       } 
/*    */     } 
/* 29 */     return super.getChildCount();
/*    */   }
/*    */   
/*    */   public void clear() {
/* 33 */     removeAllChildren();
/* 34 */     this.loaded = false;
/*    */   }
/*    */   
/*    */   public boolean isLoaded() {
/* 38 */     return this.loaded;
/*    */   }
/*    */   
/*    */   protected abstract void loadChildren();
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\filechooser\swingdirectory\LazyMutableTreeNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */