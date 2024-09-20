/*    */ package com.install4j.api.context;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum LauncherType
/*    */ {
/* 14 */   CONSOLE("console"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 19 */   GUI("gui"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 24 */   SERVICE("service"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 29 */   EXTERNAL("external"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 34 */   INSTALLER_APPLICATION("installer application");
/*    */   
/*    */   private final transient String verbose;
/*    */   
/*    */   LauncherType(String verbose) {
/* 39 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 44 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\LauncherType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */