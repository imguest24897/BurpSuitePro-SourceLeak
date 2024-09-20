/*    */ package com.install4j.runtime.beans.actions.finish;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import java.io.File;
/*    */ import java.net.MalformedURLException;
/*    */ import java.net.URL;
/*    */ 
/*    */ public class ShowFileAction
/*    */   extends SystemInstallOrUninstallAction
/*    */ {
/*    */   private File file;
/*    */   
/*    */   public File getFile() {
/* 16 */     return (File)replaceWithTextOverride("file", this.file, File.class);
/*    */   }
/*    */   
/*    */   public void setFile(File file) {
/* 20 */     this.file = file;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) {
/* 25 */     if (getFile() == null) {
/* 26 */       return false;
/*    */     }
/* 28 */     File destinationFile = context.getDestinationFile(replaceVariables(getFile()));
/* 29 */     if (!destinationFile.exists()) {
/* 30 */       return false;
/*    */     }
/*    */ 
/*    */     
/*    */     try {
/* 35 */       URL url = destinationFile.toURI().toURL();
/* 36 */       Util.showUrl(url);
/* 37 */     } catch (MalformedURLException e) {
/* 38 */       e.printStackTrace();
/* 39 */       return false;
/*    */     } 
/*    */     
/* 42 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 47 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\finish\ShowFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */