/*    */ package com.install4j.runtime.beans.screens;
/*    */ 
/*    */ public abstract class SystemProgressScreen
/*    */   extends SystemFormScreen
/*    */ {
/*    */   public boolean isPreviousVisible() {
/*  7 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isNextVisible() {
/* 12 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isHiddenForPrevious() {
/* 17 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void activated() {
/* 22 */     super.activated();
/* 23 */     getContext().goForward(1, true, true);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\screens\SystemProgressScreen.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */