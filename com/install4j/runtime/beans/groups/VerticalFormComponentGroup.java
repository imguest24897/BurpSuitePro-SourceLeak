/*    */ package com.install4j.runtime.beans.groups;
/*    */ 
/*    */ import com.install4j.api.beans.Anchor;
/*    */ import com.install4j.api.formcomponents.GroupType;
/*    */ import com.install4j.runtime.util.SizeGroup;
/*    */ 
/*    */ public class VerticalFormComponentGroup
/*    */   extends LayoutManagerGroup
/*    */ {
/*    */   private boolean makeSameWidth;
/*    */   
/*    */   public boolean isMakeSameWidth() {
/* 13 */     return replaceWithTextOverride("makeSameWidth", this.makeSameWidth);
/*    */   }
/*    */   
/*    */   public void setMakeSameWidth(boolean makeSameWidth) {
/* 17 */     this.makeSameWidth = makeSameWidth;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 22 */   private SizeGroup sizeGroup = new SizeGroup(true, false);
/*    */   
/*    */   public SizeGroup getSizeGroup() {
/* 25 */     return this.sizeGroup;
/*    */   }
/*    */ 
/*    */   
/*    */   protected int getDefaultCellSpacing() {
/* 30 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public GroupOrientation getGroupOrientation() {
/* 35 */     return GroupOrientation.VERTICAL;
/*    */   }
/*    */ 
/*    */   
/*    */   public GroupType getGroupType() {
/* 40 */     return GroupType.VERTICAL;
/*    */   }
/*    */ 
/*    */   
/*    */   public Anchor getDefaultAnchor() {
/* 45 */     return Anchor.NORTHWEST;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\groups\VerticalFormComponentGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */