/*     */ package com.install4j.runtime.beans.actions.net;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.frontend.NoPercentageProgressDelegate;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.content.HttpRequestHandler;
/*     */ import com.install4j.runtime.installer.helper.content.Uploader;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class UploadFileAction
/*     */   extends AbstractHttpRequestAction {
/*     */   private File file;
/*     */   private boolean showProgress = true;
/*     */   private boolean showFileName = true;
/*     */   private boolean retryIfInterrupted = true;
/*  20 */   private HttpUploadMethod uploadMethod = HttpUploadMethod.POST;
/*     */   
/*     */   public File getFile() {
/*  23 */     return (File)replaceWithTextOverride("file", replaceVariables(this.file), File.class);
/*     */   }
/*     */   
/*     */   public void setFile(File file) {
/*  27 */     this.file = file;
/*     */   }
/*     */   
/*     */   public boolean isShowProgress() {
/*  31 */     return replaceWithTextOverride("showProgress", this.showProgress);
/*     */   }
/*     */   
/*     */   public void setShowProgress(boolean showProgress) {
/*  35 */     this.showProgress = showProgress;
/*     */   }
/*     */   
/*     */   public boolean isShowFileName() {
/*  39 */     return replaceWithTextOverride("showFileName", this.showFileName);
/*     */   }
/*     */   
/*     */   public void setShowFileName(boolean showFileName) {
/*  43 */     this.showFileName = showFileName;
/*     */   }
/*     */   
/*     */   public boolean isRetryIfInterrupted() {
/*  47 */     return replaceWithTextOverride("retryIfInterrupted", this.retryIfInterrupted);
/*     */   }
/*     */   
/*     */   public void setRetryIfInterrupted(boolean retryIfInterrupted) {
/*  51 */     this.retryIfInterrupted = retryIfInterrupted;
/*     */   }
/*     */   
/*     */   public HttpUploadMethod getUploadMethod() {
/*  55 */     return (HttpUploadMethod)replaceWithTextOverride("uploadMethod", this.uploadMethod, HttpUploadMethod.class);
/*     */   }
/*     */   
/*     */   public void setUploadMethod(HttpUploadMethod uploadMethod) {
/*  59 */     this.uploadMethod = uploadMethod;
/*     */   }
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/*     */     NoPercentageProgressDelegate noPercentageProgressDelegate;
/*  64 */     File file = context.getDestinationFile(getFile());
/*     */     
/*  66 */     ProgressInterface progressInterface = context.getProgressInterface();
/*  67 */     if (isShowProgress()) {
/*  68 */       if (isShowFileName()) {
/*  69 */         String fileName = file.getName();
/*  70 */         progressInterface.setStatusMessage(wrapMessageInNobr(
/*  71 */               Messages.format(Messages.getString(".UploadingWithFileName"), new Object[] { "<b>" + fileName + "</b>" })));
/*     */       } else {
/*     */         
/*  74 */         progressInterface.setStatusMessage(Messages.getString(".Uploading"));
/*     */       } 
/*     */     } else {
/*  77 */       noPercentageProgressDelegate = new NoPercentageProgressDelegate(progressInterface);
/*     */     } 
/*     */     
/*  80 */     try { Uploader uploader = createUploader(context, isShowProgress() ? (ProgressInterface)noPercentageProgressDelegate : null); 
/*  81 */       try { boolean bool = doUpload(uploader, context, file, getUrl(), isRetryIfInterrupted());
/*  82 */         if (uploader != null) uploader.close();  return bool; } catch (Throwable throwable) { if (uploader != null) try { uploader.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }  } catch (IOException e)
/*  83 */     { Logger.getInstance().error(this, "Could not upload file");
/*  84 */       Logger.getInstance().log(e);
/*  85 */       return false; }
/*     */   
/*     */   }
/*     */   
/*     */   private Uploader createUploader(Context context, ProgressInterface progressInterface) {
/*  90 */     Uploader uploader = new Uploader(context, progressInterface);
/*  91 */     applyCommonProperties((HttpRequestHandler)uploader);
/*  92 */     uploader.setUploadMethod(getUploadMethod());
/*  93 */     return uploader;
/*     */   }
/*     */   
/*     */   private static boolean doUpload(Uploader uploader, Context context, File file, String url, boolean retryIfInterrupted) throws IOException, UserCanceledException {
/*     */     boolean retry;
/*     */     do {
/*     */       try {
/* 100 */         int responseCode = uploader.upload(url, file);
/* 101 */         boolean success = (responseCode / 200 == 1);
/* 102 */         Logger.getInstance().log(null, "Upload finished with response code " + responseCode, success);
/* 103 */         return success;
/* 104 */       } catch (IOException e) {
/* 105 */         if (retryIfInterrupted) {
/* 106 */           Logger.getInstance().error(null, "Could not upload file");
/* 107 */           Logger.getInstance().log(e);
/* 108 */           retry = askRetry(Messages.getString(".UploadInterrupted"));
/*     */         } else {
/* 110 */           throw e;
/*     */         } 
/* 112 */       } catch (UserCanceledException e) {
/* 113 */         if (context.isCancelling()) {
/* 114 */           throw e;
/*     */         }
/* 116 */         return false;
/*     */       }
/*     */     
/* 119 */     } while (retry);
/*     */     
/* 121 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isRollbackSupported() {
/* 126 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\net\UploadFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */