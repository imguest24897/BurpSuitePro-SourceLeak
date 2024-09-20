/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.events.EventType;
/*     */ import com.install4j.api.events.InstallerDownloadEvent;
/*     */ import com.install4j.api.events.InstallerEvent;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.security.DigestOutputStream;
/*     */ import java.security.MessageDigest;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.util.Collections;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class Downloader
/*     */   extends TransferFileHandler {
/*     */   private MessageDigest md;
/*     */   
/*     */   public Downloader(Context context, ProgressInterface progressInterface) {
/*  29 */     super(context, progressInterface);
/*     */   }
/*     */   
/*     */   public Downloader(int mode, ProgressInterface progressInterface) {
/*  33 */     super(mode, progressInterface);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void init(ProgressInterface progressInterface) {
/*  38 */     super.init(progressInterface);
/*     */     try {
/*  40 */       this.md = MessageDigest.getInstance("SHA-256");
/*  41 */     } catch (NoSuchAlgorithmException e) {
/*  42 */       System.out.println(e.getMessage());
/*     */     } 
/*     */   }
/*     */   
/*     */   public void setMessageDigest(MessageDigest md) {
/*  47 */     this.md = md;
/*     */   }
/*     */   
/*     */   public byte[] digest() {
/*  51 */     return this.md.digest();
/*     */   }
/*     */ 
/*     */   
/*     */   protected void connectionInitialized(HttpConnection connection) {
/*  56 */     super.connectionInitialized(connection);
/*  57 */     setFileSize(connection.getContentLengthLong());
/*     */   }
/*     */   
/*     */   public void download(File outputFile, long defaultFileSize, boolean deleteOnExit) throws IOException, UserCanceledException {
/*     */     Set<InstallerDownloadEvent.DownloadProgressListener> progressListeners;
/*  62 */     File parentFile = outputFile.getParentFile();
/*  63 */     if (!parentFile.exists()) {
/*  64 */       parentFile.mkdirs();
/*     */     }
/*     */     
/*  67 */     initProgress(defaultFileSize);
/*     */     
/*  69 */     HttpConnection connection = getConnection();
/*  70 */     Context context = getContext();
/*  71 */     ContextInt contextInt = ContextImpl.getContextInt(context);
/*     */     
/*  73 */     if (contextInt != null) {
/*  74 */       InstallerDownloadEvent downloadEvent = new InstallerDownloadEvent(contextInt.getEventSource(), context, EventType.BEFORE_DOWNLOAD, connection.getURL(), outputFile, getTotalSize());
/*  75 */       contextInt.fireInstallerEvent((InstallerEvent)downloadEvent);
/*  76 */       progressListeners = downloadEvent.getDownloadProgressListeners();
/*     */     } else {
/*  78 */       progressListeners = Collections.emptySet();
/*     */     } 
/*     */     
/*     */     try {
/*  82 */       updateProgress(true, progressListeners);
/*     */       
/*  84 */       this.md.reset();
/*  85 */       OutputStream out = new DigestOutputStream(new FileOutputStream(outputFile), this.md);
/*     */       try {
/*  87 */         long count = FileUtil.pumpStream(connection.getInputStream(), out, val -> {
/*     */               addProgress(val);
/*     */               
/*     */               if (isCancelled()) {
/*     */                 return false;
/*     */               }
/*     */               
/*     */               updateProgress(false, progressListeners);
/*     */               return true;
/*     */             });
/*  97 */         if (isCancelled()) {
/*  98 */           if (context != null && contextInt != null) {
/*  99 */             Logger.getInstance().info(contextInt.getEventSource(), "Download was canceled by the user");
/*     */           }
/* 101 */           fireAfterDownloadEvent(contextInt, EventType.AFTER_DOWNLOAD, outputFile, false);
/* 102 */           throw new UserCanceledException();
/*     */         } 
/* 104 */         long fileSize = getFileSize();
/* 105 */         if (count != fileSize && fileSize != -1L) {
/* 106 */           throw new IOException("file size not correct: " + count + ", expected: " + fileSize);
/*     */         }
/*     */         
/* 109 */         updateProgress(true, progressListeners);
/* 110 */         fireAfterDownloadEvent(contextInt, EventType.AFTER_DOWNLOAD, outputFile, true);
/*     */       } finally {
/*     */         try {
/* 113 */           out.close();
/* 114 */           connection.getInputStream().close();
/* 115 */         } catch (Throwable throwable) {}
/*     */ 
/*     */         
/* 118 */         if (deleteOnExit) {
/* 119 */           InstallerUtil.deleteOnExit(outputFile);
/*     */         }
/*     */       }
/*     */     
/* 123 */     } catch (IOException e) {
/* 124 */       if (getMode() == 3) {
/* 125 */         System.err.println(e.getMessage());
/*     */       }
/* 127 */       fireAfterDownloadEvent(contextInt, EventType.AFTER_DOWNLOAD, outputFile, false);
/* 128 */       resetLastTransfer();
/* 129 */       outputFile.delete();
/* 130 */       throw e;
/* 131 */     } catch (UserCanceledException e) {
/* 132 */       if (!outputFile.delete() && outputFile.exists()) {
/* 133 */         InstallerUtil.deleteOnExit(outputFile);
/*     */       }
/* 135 */       throw e;
/*     */     } 
/*     */   }
/*     */   
/*     */   private void fireAfterDownloadEvent(ContextInt contextInt, EventType eventType, File outputFile, boolean success) {
/* 140 */     if (contextInt != null) {
/* 141 */       contextInt.fireInstallerEvent((InstallerEvent)new InstallerDownloadEvent(contextInt.getEventSource(), getContext(), eventType, success, getConnection().getURL(), outputFile, getTotalSize()));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public Downloader connect(String urlString) throws IOException, UserCanceledException {
/* 147 */     return (Downloader)super.connect(urlString);
/*     */   }
/*     */ 
/*     */   
/*     */   public Downloader connect(String urlString, HttpRequestHandler.ConnectionPreparer connectionPreparer) throws IOException, UserCanceledException {
/* 152 */     return (Downloader)super.connect(urlString, connectionPreparer);
/*     */   }
/*     */   
/*     */   protected void updateProgress(boolean force, Set<InstallerDownloadEvent.DownloadProgressListener> progressListeners) {
/* 156 */     updateProgress(force);
/* 157 */     for (InstallerDownloadEvent.DownloadProgressListener progressListener : progressListeners)
/* 158 */       progressListener.downloadCompleted(getTotalProgress()); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\Downloader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */