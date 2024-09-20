/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class SizeGroup
/*    */ {
/*  8 */   private List<SizeGroupComponentWrapper> componentWrappers = new ArrayList<>();
/*    */   private boolean commonWidth;
/*    */   private boolean commonHeight;
/*    */   
/*    */   public SizeGroup(boolean commonWidth, boolean commonHeight) {
/* 13 */     this.commonWidth = commonWidth;
/* 14 */     this.commonHeight = commonHeight;
/*    */   }
/*    */   
/*    */   public void addComponentWrapper(SizeGroupComponentWrapper componentWrapper) {
/* 18 */     this.componentWrappers.add(componentWrapper);
/* 19 */     componentWrapper.setSizeGroup(this);
/*    */   }
/*    */   
/*    */   public boolean isCommonWidth() {
/* 23 */     return this.commonWidth;
/*    */   }
/*    */   
/*    */   public boolean isCommonHeight() {
/* 27 */     return this.commonHeight;
/*    */   }
/*    */   
/*    */   public int getCommonWidth() {
/* 31 */     int width = 0;
/* 32 */     for (SizeGroupComponentWrapper componentWrapper : this.componentWrappers) {
/* 33 */       width = Math.max(width, (componentWrapper.getIntrinsicPreferredSize()).width);
/*    */     }
/* 35 */     return width;
/*    */   }
/*    */   
/*    */   public int getCommonHeight() {
/* 39 */     int height = 0;
/* 40 */     for (SizeGroupComponentWrapper componentWrapper : this.componentWrappers) {
/* 41 */       height = Math.max(height, (componentWrapper.getIntrinsicPreferredSize()).height);
/*    */     }
/* 43 */     return height;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\SizeGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */