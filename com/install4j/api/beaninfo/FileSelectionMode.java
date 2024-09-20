/*    */ package com.install4j.api.beaninfo;
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
/*    */ public enum FileSelectionMode
/*    */ {
/* 14 */   FILES_ONLY(0),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 19 */   DIRECTORIES_ONLY(1),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 24 */   FILES_AND_DIRECTORIES(2);
/*    */   
/*    */   private final int mode;
/*    */   
/*    */   FileSelectionMode(int mode) {
/* 29 */     this.mode = mode;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getJFileChooserMode() {
/* 37 */     return this.mode;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\FileSelectionMode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */