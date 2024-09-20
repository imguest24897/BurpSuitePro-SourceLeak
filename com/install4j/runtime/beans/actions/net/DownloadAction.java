/*    */ package com.install4j.runtime.beans.actions.net;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.runtime.installer.helper.content.Downloader;
/*    */ import com.install4j.runtime.installer.helper.content.HttpRequestHandler;
/*    */ 
/*    */ public abstract class DownloadAction extends AbstractHttpRequestAction {
/*    */   private boolean showError = true;
/*    */   
/*    */   public boolean isShowError() {
/* 12 */     return replaceWithTextOverride("showError", this.showError);
/*    */   }
/*    */   
/*    */   public void setShowError(boolean showError) {
/* 16 */     this.showError = showError;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 21 */     return false;
/*    */   }
/*    */   
/*    */   protected Downloader createDownloader(Context context, ProgressInterface progressInterface) {
/* 25 */     Downloader downloader = new Downloader(context, progressInterface);
/* 26 */     applyCommonProperties((HttpRequestHandler)downloader);
/* 27 */     return downloader;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\net\DownloadAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */