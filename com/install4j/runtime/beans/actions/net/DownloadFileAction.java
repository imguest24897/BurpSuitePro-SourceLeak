/*     */ package com.install4j.runtime.beans.actions.net;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.files.BackupFileForRollbackAction;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.frontend.NoPercentageProgressDelegate;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.content.ChecksumChecker;
/*     */ import com.install4j.runtime.installer.helper.content.Downloader;
/*     */ import com.install4j.runtime.launcher.integration.UpdateLog;
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.security.MessageDigest;
/*     */ import java.util.Objects;
/*     */ 
/*     */ public class DownloadFileAction
/*     */   extends DownloadAction
/*     */ {
/*     */   private File targetFile;
/*     */   private boolean showProgress = true;
/*     */   private boolean showFileName = true;
/*     */   private boolean deleteOnExit = false;
/*     */   private boolean checkDigest = false;
/*  30 */   private String digestUrl = "";
/*  31 */   private DigestAlgorithm digestAlgorithm = DigestAlgorithm.SHA256;
/*     */   private boolean dontAskForRetry = false;
/*     */   private boolean retryIfInterrupted = true;
/*     */   
/*     */   public boolean isCheckDigest() {
/*  36 */     return replaceWithTextOverride("checkDigest", this.checkDigest);
/*     */   }
/*     */   
/*     */   public void setCheckDigest(boolean checkForMd5Sums) {
/*  40 */     this.checkDigest = checkForMd5Sums;
/*     */   }
/*     */   
/*     */   public String getDigestUrl() {
/*  44 */     return replaceVariables(replaceVariables(this.digestUrl));
/*     */   }
/*     */   
/*     */   public void setDigestUrl(String digestUrl) {
/*  48 */     this.digestUrl = digestUrl;
/*     */   }
/*     */   
/*     */   public DigestAlgorithm getDigestAlgorithm() {
/*  52 */     return (DigestAlgorithm)replaceWithTextOverride("digestAlgorithm", this.digestAlgorithm, DigestAlgorithm.class);
/*     */   }
/*     */   
/*     */   public void setDigestAlgorithm(DigestAlgorithm digestAlgorithm) {
/*  56 */     this.digestAlgorithm = digestAlgorithm;
/*     */   }
/*     */   
/*     */   public boolean isDontAskForRetry() {
/*  60 */     return replaceWithTextOverride("dontAskForRetry", this.dontAskForRetry);
/*     */   }
/*     */   
/*     */   public void setDontAskForRetry(boolean dontAskForRetry) {
/*  64 */     this.dontAskForRetry = dontAskForRetry;
/*     */   }
/*     */   
/*     */   public boolean isRetryIfInterrupted() {
/*  68 */     return replaceWithTextOverride("retryIfInterrupted", this.retryIfInterrupted);
/*     */   }
/*     */   
/*     */   public void setRetryIfInterrupted(boolean retryIfInterrupted) {
/*  72 */     this.retryIfInterrupted = retryIfInterrupted;
/*     */   }
/*     */   
/*     */   public File getTargetFile() {
/*  76 */     return (File)replaceWithTextOverride("targetFile", replaceVariables(this.targetFile), File.class);
/*     */   }
/*     */   
/*     */   public void setTargetFile(File targetFile) {
/*  80 */     this.targetFile = targetFile;
/*     */   }
/*     */   
/*     */   public boolean isShowProgress() {
/*  84 */     return replaceWithTextOverride("showProgress", this.showProgress);
/*     */   }
/*     */   
/*     */   public void setShowProgress(boolean showProgress) {
/*  88 */     this.showProgress = showProgress;
/*     */   }
/*     */   
/*     */   public boolean isShowFileName() {
/*  92 */     return replaceWithTextOverride("showFileName", this.showFileName);
/*     */   }
/*     */   
/*     */   public void setShowFileName(boolean showFileName) {
/*  96 */     this.showFileName = showFileName;
/*     */   }
/*     */   
/*     */   public boolean isDeleteOnExit() {
/* 100 */     return replaceWithTextOverride("deleteOnExit", this.deleteOnExit);
/*     */   }
/*     */   
/*     */   public void setDeleteOnExit(boolean deleteOnExit) {
/* 104 */     this.deleteOnExit = deleteOnExit;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/*     */     NoPercentageProgressDelegate noPercentageProgressDelegate;
/* 110 */     File file = context.getDestinationFile(getTargetFile());
/*     */     
/* 112 */     ProgressInterface progressInterface = context.getProgressInterface();
/* 113 */     if (isShowProgress()) {
/* 114 */       if (isShowFileName()) {
/* 115 */         String fileName = file.getName();
/* 116 */         progressInterface.setStatusMessage(wrapMessageInNobr(
/* 117 */               Messages.format(Messages.getString(".DownloadingWithFileName"), new Object[] { "<b>" + fileName + "</b>" })));
/*     */       } else {
/*     */         
/* 120 */         progressInterface.setStatusMessage(Messages.getString(".Downloading"));
/*     */       } 
/*     */     } else {
/* 123 */       noPercentageProgressDelegate = new NoPercentageProgressDelegate(progressInterface);
/*     */     } 
/*     */     
/* 126 */     BackupFileForRollbackAction backupFileForRollbackAction = null;
/* 127 */     if (context instanceof InstallerContext && file.exists()) {
/* 128 */       backupFileForRollbackAction = new BackupFileForRollbackAction(file, true);
/* 129 */       backupFileForRollbackAction.install((InstallerContext)context);
/* 130 */       addRollbackAction((InstallAction)backupFileForRollbackAction);
/*     */     } 
/*     */     try {
/* 133 */       Downloader downloader = createDownloader(context, isShowProgress() ? (ProgressInterface)noPercentageProgressDelegate : null);
/*     */     }
/* 135 */     catch (IOException e) {
/* 136 */       UpdateLog.logIfUpdater(e);
/*     */       
/* 138 */       if (isShowError()) {
/* 139 */         Util.showErrorMessage(Messages.format(Messages.getString("updater.DownloadError"), new Object[] { getUrl() }));
/*     */       }
/*     */       
/* 142 */       Logger.getInstance().error(this, "Could not download file");
/* 143 */       Logger.getInstance().log(e);
/* 144 */       if (backupFileForRollbackAction != null) {
/* 145 */         backupFileForRollbackAction.rollback((InstallerContext)context);
/* 146 */         backupFileForRollbackAction = null;
/*     */       } 
/* 148 */       return false;
/* 149 */     } catch (Throwable t) {
/* 150 */       UpdateLog.logIfUpdater(t);
/* 151 */       throw t;
/*     */     } finally {
/* 153 */       if (backupFileForRollbackAction != null) {
/* 154 */         addRollbackAction((InstallAction)backupFileForRollbackAction);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean doDownload(Downloader downloader, Context context, File file, String url, boolean deleteOnExit, boolean retryIfInterrupted, boolean checkDigest, String digestUrl, DigestAlgorithm digestAlgorithm, boolean dontAskForRetry) throws UserCanceledException, IOException {
/* 161 */     MessageDigest messageDigest = digestAlgorithm.createMessageDigest();
/* 162 */     downloader.setMessageDigest(messageDigest);
/*     */     
/* 164 */     boolean success = true;
/* 165 */     String expectedChecksum = null, actualChecksum = null, actualSha1 = null, actualMD5 = null;
/*     */ 
/*     */     
/*     */     while (true) {
/* 169 */       UpdateLog.logIfUpdater(1, "downloading " + url + " to " + file + " (exists: " + file.exists() + ")");
/* 170 */       boolean retry = false;
/*     */       try {
/* 172 */         downloader.connect(url);
/* 173 */       } catch (UserCanceledException e) {
/* 174 */         if (context.isCancelling()) {
/* 175 */           throw new UserCanceledException();
/*     */         }
/* 177 */         success = false;
/*     */       } 
/*     */       
/* 180 */       if (success) {
/*     */         try {
/* 182 */           downloader.download(file, -1L, deleteOnExit);
/* 183 */           if (messageDigest instanceof DualDigest) {
/* 184 */             DualDigest dualDigest = (DualDigest)messageDigest;
/* 185 */             actualSha1 = ChecksumChecker.getHexStringFromBytes(dualDigest.getSha256().digest());
/* 186 */             actualMD5 = ChecksumChecker.getHexStringFromBytes(dualDigest.getMd5().digest());
/*     */           } else {
/* 188 */             actualChecksum = ChecksumChecker.getHexStringFromBytes(messageDigest.digest());
/*     */           } 
/* 190 */         } catch (FileNotFoundException e) {
/* 191 */           throw e;
/* 192 */         } catch (IOException e) {
/* 193 */           if (retryIfInterrupted) {
/* 194 */             UpdateLog.logIfUpdater(1, "retry after " + e);
/* 195 */             Logger.getInstance().error(DownloadFileAction.class, "Could not download file");
/* 196 */             Logger.getInstance().log(e);
/* 197 */             retry = success = askRetry(Messages.getString(".DownloadInterrupted"));
/*     */           } else {
/* 199 */             throw e;
/*     */           } 
/*     */         } 
/*     */       } else {
/* 203 */         UpdateLog.logIfUpdater(1, "could not connect to " + url);
/*     */       } 
/* 205 */       if (!retry)
/*     */       
/* 207 */       { if (success) {
/* 208 */           if (expectedChecksum == null) {
/* 209 */             if (checkDigest) {
/* 210 */               expectedChecksum = ChecksumChecker.getExpectedDigest(downloader, context, digestUrl, url, digestAlgorithm, file.getName());
/*     */             } else {
/* 212 */               expectedChecksum = "";
/*     */             } 
/*     */           }
/* 215 */           if (!Objects.equals("", expectedChecksum)) {
/* 216 */             if (messageDigest instanceof DualDigest) {
/* 217 */               if (expectedChecksum.length() > 32) {
/* 218 */                 actualChecksum = actualSha1;
/*     */               } else {
/* 220 */                 actualChecksum = actualMD5;
/*     */               } 
/*     */             }
/* 223 */             Logger.getInstance().info(DownloadFileAction.class, "Expected digest " + expectedChecksum + ", actual digest " + actualChecksum);
/* 224 */             if (!Objects.equals(expectedChecksum, actualChecksum)) {
/* 225 */               downloader.resetLastTransfer();
/* 226 */               if (dontAskForRetry) {
/* 227 */                 success = false;
/*     */               } else {
/* 229 */                 success = askRetry(Messages.getString(".DownloadFileCorrupt"));
/*     */               } 
/* 231 */               UpdateLog.logIfUpdater(1, "checksums did not match: expected: " + expectedChecksum + ", actual: " + actualChecksum);
/*     */             } 
/*     */           } 
/*     */         } 
/* 235 */         if (!success || Objects.equals("", expectedChecksum) || Objects.equals(actualChecksum, expectedChecksum))
/*     */           break;  } 
/* 237 */     }  if (!success) {
/* 238 */       UpdateLog.logIfUpdater(1, "did not retry to download " + url);
/*     */     } else {
/* 240 */       UpdateLog.logIfUpdater(1, "downloaded " + url + " to " + file + " (size: " + file.length() + ")");
/*     */     } 
/* 242 */     return success;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\net\DownloadFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */