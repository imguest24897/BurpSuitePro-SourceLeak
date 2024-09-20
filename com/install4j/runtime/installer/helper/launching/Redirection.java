/*    */ package com.install4j.runtime.installer.helper.launching;
/*    */ 
/*    */ import java.io.File;
/*    */ 
/*    */ public abstract class Redirection {
/*    */   private File file;
/*    */   private boolean failOnFileError;
/*    */   
/*    */   protected Redirection(File file, boolean failOnFileError) {
/* 10 */     this.file = file;
/* 11 */     this.failOnFileError = failOnFileError;
/*    */   }
/*    */   
/*    */   public File getFile() {
/* 15 */     return this.file;
/*    */   }
/*    */   
/*    */   public boolean isFailOnFileError() {
/* 19 */     return this.failOnFileError;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\launching\Redirection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */