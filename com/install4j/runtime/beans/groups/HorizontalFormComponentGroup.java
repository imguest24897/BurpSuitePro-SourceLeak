/*    */ package com.install4j.runtime.beans.groups;
/*    */ 
/*    */ import com.install4j.api.beans.Anchor;
/*    */ import com.install4j.api.formcomponents.GroupType;
/*    */ 
/*    */ public class HorizontalFormComponentGroup
/*    */   extends LayoutManagerGroup
/*    */ {
/*    */   public static final int DEFAULT_CELL_SPACING = 5;
/*    */   private boolean alignFirstLabel = true;
/*    */   private boolean makeSameHeight;
/*    */   
/*    */   public boolean isAlignFirstLabel() {
/* 14 */     return replaceWithTextOverride("alignFirstLabel", this.alignFirstLabel);
/*    */   }
/*    */   
/*    */   public void setAlignFirstLabel(boolean alignFirstLabel) {
/* 18 */     this.alignFirstLabel = alignFirstLabel;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isMakeSameHeight() {
/* 23 */     return replaceWithTextOverride("makeSameHeight", this.makeSameHeight);
/*    */   }
/*    */   
/*    */   public void setMakeSameHeight(boolean makeSameHeight) {
/* 27 */     this.makeSameHeight = makeSameHeight;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected int getDefaultCellSpacing() {
/* 34 */     return 5;
/*    */   }
/*    */ 
/*    */   
/*    */   public GroupOrientation getGroupOrientation() {
/* 39 */     return GroupOrientation.HORIZONTAL;
/*    */   }
/*    */ 
/*    */   
/*    */   public GroupType getGroupType() {
/* 44 */     return GroupType.HORIZONTAL;
/*    */   }
/*    */ 
/*    */   
/*    */   public Anchor getDefaultAnchor() {
/* 49 */     return Anchor.WEST;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isBaselineOverride() {
/* 54 */     return !isMakeSameHeight();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\groups\HorizontalFormComponentGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */