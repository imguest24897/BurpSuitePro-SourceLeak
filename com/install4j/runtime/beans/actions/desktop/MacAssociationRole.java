/*    */ package com.install4j.runtime.beans.actions.desktop;
/*    */ 
/*    */ public enum MacAssociationRole {
/*  4 */   VIEWER("Viewer"),
/*  5 */   EDITOR("Editor");
/*    */   
/*    */   private final String name;
/*    */   
/*    */   MacAssociationRole(String name) {
/* 10 */     this.name = name;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 15 */     return this.name;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\MacAssociationRole.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */