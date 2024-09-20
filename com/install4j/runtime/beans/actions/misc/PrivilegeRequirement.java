/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ public enum PrivilegeRequirement {
/*  4 */   NONE("None"),
/*  5 */   ROOT("Require root"),
/*  6 */   OBTAIN("Try to obtain privileges");
/*    */   
/*    */   private final String name;
/*    */   
/*    */   PrivilegeRequirement(String name) {
/* 11 */     this.name = name;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 16 */     return this.name;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\PrivilegeRequirement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */