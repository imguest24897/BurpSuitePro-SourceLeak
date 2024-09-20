/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ import java.util.Set;
/*    */ 
/*    */ public enum VariableSelectionMode {
/*  6 */   EXCLUDE("All except specified response file variables")
/*    */   {
/*    */     public boolean isIncluded(String variableName, Set<String> variables) {
/*  9 */       return !variables.contains(variableName);
/*    */     }
/*    */   },
/* 12 */   INCLUDE("Only specified response file variables")
/*    */   {
/*    */     public boolean isIncluded(String variableName, Set<String> variables) {
/* 15 */       return variables.contains(variableName);
/*    */     } };
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   VariableSelectionMode(String verbose) {
/* 21 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/* 28 */     return this.verbose;
/*    */   }
/*    */   
/*    */   public abstract boolean isIncluded(String paramString, Set<String> paramSet);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\VariableSelectionMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */