/*    */ package com.install4j.runtime.beans.groups;
/*    */ 
/*    */ public class GroupOrientation
/*    */ {
/*  5 */   public static final GroupOrientation VERTICAL = new GroupOrientation("Vertical");
/*  6 */   public static final GroupOrientation HORIZONTAL = new GroupOrientation("Horizontal");
/*    */   
/*    */   private String verbose;
/*    */   
/*    */   private GroupOrientation(String verbose) {
/* 11 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 16 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\groups\GroupOrientation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */