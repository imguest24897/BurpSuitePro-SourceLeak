/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ public enum ArchiveFileOperationRoot {
/*  4 */   INSTALLATION_DIRECTORY("Installation directory"),
/*  5 */   ARCHIVE("Archive root");
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   ArchiveFileOperationRoot(String verbose) {
/* 10 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 15 */     return this.verbose;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\ArchiveFileOperationRoot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */