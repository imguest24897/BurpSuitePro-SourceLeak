/*    */ package com.install4j.runtime.beans.actions.misc;
/*    */ 
/*    */ public class AddVmOptionsAction
/*    */   extends AbstractModifyVmOptionsAction {
/*    */   private String[] vmOptions;
/*    */   
/*    */   public String[] getVmOptions() {
/*  8 */     return (String[])replaceWithTextOverride("vmOptions", replaceVariables(this.vmOptions), String[].class);
/*    */   }
/*    */   
/*    */   public void setVmOptions(String[] vmOptions) {
/* 12 */     this.vmOptions = vmOptions;
/*    */   }
/*    */ 
/*    */   
/*    */   protected String[] getAddVmOptions() {
/* 17 */     return getVmOptions();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\AddVmOptionsAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */