/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ import java.io.File;
/*    */ 
/*    */ public enum FileTarget {
/*  6 */   EVERYTHING("Files and directories")
/*    */   {
/*    */     public boolean isIncluded(File file) {
/*  9 */       return true;
/*    */     }
/*    */   },
/* 12 */   FILES("Files")
/*    */   {
/*    */     public boolean isIncluded(File file) {
/* 15 */       return file.isFile();
/*    */     }
/*    */   },
/* 18 */   DIRECTORIES("Directories")
/*    */   {
/*    */     public boolean isIncluded(File file) {
/* 21 */       return file.isDirectory();
/*    */     }
/*    */   };
/*    */   
/*    */   private final String verbose;
/*    */   
/*    */   FileTarget(String verbose) {
/* 28 */     this.verbose = verbose;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 33 */     return this.verbose;
/*    */   }
/*    */   
/*    */   public abstract boolean isIncluded(File paramFile);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\FileTarget.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */