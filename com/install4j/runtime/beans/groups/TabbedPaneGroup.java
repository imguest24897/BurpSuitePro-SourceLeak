/*    */ package com.install4j.runtime.beans.groups;
/*    */ 
/*    */ import com.install4j.api.beans.Anchor;
/*    */ import com.install4j.api.formcomponents.GroupType;
/*    */ import javax.swing.JComponent;
/*    */ import javax.swing.JTabbedPane;
/*    */ 
/*    */ public class TabbedPaneGroup
/*    */   extends FormComponentGroup {
/* 10 */   private TabPlacement tabPlacement = TabPlacement.TOP;
/* 11 */   private TabLayoutPolicy tabLayoutPolicy = TabLayoutPolicy.WRAP;
/*    */   private boolean fillHorizontal = false;
/*    */   private boolean fillVertical = false;
/*    */   private JTabbedPane tabbedPane;
/*    */   
/*    */   public TabPlacement getTabPlacement() {
/* 17 */     return (TabPlacement)replaceWithTextOverride("tabPlacement", this.tabPlacement, TabPlacement.class);
/*    */   }
/*    */   
/*    */   public void setTabPlacement(TabPlacement tabPlacement) {
/* 21 */     this.tabPlacement = tabPlacement;
/*    */   }
/*    */   
/*    */   public TabLayoutPolicy getTabLayoutPolicy() {
/* 25 */     return (TabLayoutPolicy)replaceWithTextOverride("tabLayoutPolicy", this.tabLayoutPolicy, TabLayoutPolicy.class);
/*    */   }
/*    */   
/*    */   public void setTabLayoutPolicy(TabLayoutPolicy tabLayoutPolicy) {
/* 29 */     this.tabLayoutPolicy = tabLayoutPolicy;
/*    */   }
/*    */   
/*    */   public boolean isFillHorizontal() {
/* 33 */     return replaceWithTextOverride("fillHorizontal", this.fillHorizontal);
/*    */   }
/*    */   
/*    */   public void setFillHorizontal(boolean fillHorizontal) {
/* 37 */     this.fillHorizontal = fillHorizontal;
/*    */   }
/*    */   
/*    */   public boolean isFillVertical() {
/* 41 */     return replaceWithTextOverride("fillVertical", this.fillVertical);
/*    */   }
/*    */   
/*    */   public void setFillVertical(boolean fillVertical) {
/* 45 */     this.fillVertical = fillVertical;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public GroupType getGroupType() {
/* 54 */     return GroupType.TABBED_PANE;
/*    */   }
/*    */ 
/*    */   
/*    */   public GroupOrientation getGroupOrientation() {
/* 59 */     return GroupOrientation.VERTICAL;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setVisible(boolean visible) {
/* 64 */     super.setVisible(visible);
/* 65 */     this.tabbedPane.setVisible(visible);
/*    */   }
/*    */ 
/*    */   
/*    */   public void setEnabled(boolean enabled) {
/* 70 */     super.setEnabled(enabled);
/* 71 */     this.tabbedPane.setEnabled(enabled);
/*    */   }
/*    */ 
/*    */   
/*    */   public Anchor getDefaultAnchor() {
/* 76 */     return Anchor.NORTHWEST;
/*    */   }
/*    */ 
/*    */   
/*    */   public JComponent createComponent(JComponent container) {
/* 81 */     this.tabbedPane = new JTabbedPane(getTabPlacement().getValue(), getTabLayoutPolicy().getValue());
/* 82 */     return this.tabbedPane;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isWidthOverride() {
/* 87 */     return isFillHorizontal();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isHeightOverride() {
/* 92 */     return isFillVertical();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\groups\TabbedPaneGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */