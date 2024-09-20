/*     */ package com.install4j.api.events;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import java.io.File;
/*     */ import java.net.URL;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class InstallerDownloadEvent
/*     */   extends InstallerEvent
/*     */ {
/*     */   private URL url;
/*     */   private File downloadFile;
/*     */   private long downloadSize;
/*  27 */   private Set<DownloadProgressListener> downloadProgressListeners = new LinkedHashSet<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InstallerDownloadEvent(Object source, Context context, EventType type, boolean success, URL url, File downloadFile, long downloadSize) {
/*  40 */     super(source, context, type, success);
/*  41 */     init(url, downloadFile, downloadSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public InstallerDownloadEvent(Object source, Context context, EventType type, URL url, File downloadFile, long downloadSize) {
/*  54 */     super(source, context, type);
/*  55 */     init(url, downloadFile, downloadSize);
/*     */   }
/*     */   
/*     */   private void init(URL url, File destinationFile, long downloadSize) {
/*  59 */     this.url = url;
/*  60 */     this.downloadFile = destinationFile;
/*  61 */     this.downloadSize = downloadSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public URL getUrl() {
/*  69 */     return this.url;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public File getDownloadFile() {
/*  77 */     return this.downloadFile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getDownloadSize() {
/*  85 */     return this.downloadSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addDownloadProgressListener(DownloadProgressListener listener) {
/*  94 */     this.downloadProgressListeners.add(listener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set<DownloadProgressListener> getDownloadProgressListeners() {
/* 102 */     return this.downloadProgressListeners;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 107 */     return super.toString() + " [url " + this.url + ", file " + this.downloadFile + ", size " + this.downloadSize + "]";
/*     */   }
/*     */ 
/*     */   
/*     */   public String getVerbose() {
/* 112 */     String ret = super.getVerbose() + ": " + this.url + " to " + this.downloadFile;
/* 113 */     if (getType() == EventType.BEFORE_DOWNLOAD) {
/* 114 */       ret = ret + "; size: " + this.downloadSize + " bytes";
/*     */     }
/* 116 */     return ret;
/*     */   }
/*     */   
/*     */   public static interface DownloadProgressListener {
/*     */     void downloadCompleted(long param1Long);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\events\InstallerDownloadEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */