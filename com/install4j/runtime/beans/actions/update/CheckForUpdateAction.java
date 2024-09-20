/*    */ package com.install4j.runtime.beans.actions.update;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.beans.actions.net.DownloadAction;
/*    */ import com.install4j.runtime.installer.config.update.UpdateDescriptorImpl;
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import com.install4j.runtime.installer.helper.content.Downloader;
/*    */ import com.install4j.runtime.launcher.integration.UpdateLog;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.net.URL;
/*    */ 
/*    */ public class CheckForUpdateAction
/*    */   extends DownloadAction
/*    */ {
/* 19 */   private String variable = "";
/*    */   
/*    */   public String getVariable() {
/* 22 */     return replaceVariables(this.variable);
/*    */   }
/*    */   
/*    */   public void setVariable(String variable) {
/* 26 */     this.variable = variable;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/* 31 */     Downloader downloader = createDownloader(context, null);
/*    */     try {
/* 33 */       File tempFile = null;
/* 34 */       String url = getUrl();
/*    */ 
/*    */       
/* 37 */       try { tempFile = File.createTempFile("i4jupd", ".xml");
/* 38 */         downloader.connect(url).download(tempFile, -1L, true);
/* 39 */         UpdateLog.log(10, "check for update action: " + url);
/* 40 */         UpdateDescriptorImpl updateDescriptor = new UpdateDescriptorImpl();
/* 41 */         updateDescriptor.read(tempFile, new URL(url));
/*    */         
/* 43 */         context.setVariable(getVariable(), updateDescriptor); }
/* 44 */       catch (IOException e)
/* 45 */       { Logger.getInstance().error(this, "could not download file");
/* 46 */         Logger.getInstance().log(e);
/*    */         
/* 48 */         if (isShowError()) {
/* 49 */           Util.showErrorMessage(Messages.format(Messages.getString("updater.CheckForUpdateError"), new Object[] { url }));
/*    */         }
/*    */         
/* 52 */         boolean bool1 = false;
/*    */         
/* 54 */         if (tempFile != null)
/* 55 */           tempFile.delete();  return bool1; } finally { if (tempFile != null) tempFile.delete();
/*    */          }
/*    */ 
/*    */       
/* 59 */       boolean bool = true;
/* 60 */       if (downloader != null) downloader.close(); 
/*    */       return bool;
/*    */     } catch (Throwable throwable) {
/*    */       if (downloader != null)
/*    */         try {
/*    */           downloader.close();
/*    */         } catch (Throwable throwable1) {
/*    */           throwable.addSuppressed(throwable1);
/*    */         }  
/*    */       throw throwable;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\action\\update\CheckForUpdateAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */