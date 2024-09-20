/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ import com.install4j.api.unix.UnixFileSystem;
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ public class ExtractZipFileAction
/*    */   extends AbstractExtractZipFileAction
/*    */ {
/*    */   protected void fileCreated(File destFile) {
/* 11 */     UnixFileSystem.setMode(getMode(), destFile);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\ExtractZipFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */