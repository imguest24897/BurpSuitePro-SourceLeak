/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import java.text.NumberFormat;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class TransferFileHandler
/*     */   extends HttpRequestHandler
/*     */ {
/*     */   private NumberFormat largeNumberFormat;
/*     */   private NumberFormat numberFormat;
/*     */   private ProgressInterface progressInterface;
/*     */   private long totalSize;
/*  17 */   private long totalProgress = 0L;
/*     */   
/*     */   private String totalSizeVerbose;
/*     */   private long fileSize;
/*     */   private long currentFileProgress;
/*     */   private long startTime;
/*  23 */   private long lastProgressUpdateTime = 0L;
/*     */   
/*     */   private boolean progressEnabled = true;
/*     */   
/*     */   protected TransferFileHandler(Context context, ProgressInterface progressInterface) {
/*  28 */     super(context, (context.isUnattended() && !(progressInterface instanceof com.install4j.api.context.UnattendedProgressInterface)) ? 
/*  29 */         3 : (context.isConsole() ? 2 : 1));
/*  30 */     init(progressInterface);
/*     */   }
/*     */   
/*     */   protected TransferFileHandler(int mode, ProgressInterface progressInterface) {
/*  34 */     super(null, mode);
/*  35 */     init(progressInterface);
/*     */   }
/*     */   
/*     */   protected void init(ProgressInterface progressInterface) {
/*  39 */     this.progressInterface = progressInterface;
/*     */     
/*  41 */     this.numberFormat = NumberFormat.getNumberInstance();
/*  42 */     this.numberFormat.setMaximumFractionDigits(1);
/*  43 */     this.numberFormat.setMinimumFractionDigits(1);
/*     */     
/*  45 */     this.largeNumberFormat = NumberFormat.getNumberInstance();
/*  46 */     this.largeNumberFormat.setMaximumFractionDigits(0);
/*     */     
/*  48 */     this.totalSize = -1L;
/*     */   }
/*     */   
/*     */   public void setTotalSize(long totalSize) {
/*  52 */     if (this.progressEnabled) {
/*  53 */       this.totalSize = totalSize;
/*     */     }
/*     */   }
/*     */   
/*     */   public void setProgressEnabled(boolean progressEnabled) {
/*  58 */     this.progressEnabled = progressEnabled;
/*     */   }
/*     */   
/*     */   public boolean isProgressEnabled() {
/*  62 */     return this.progressEnabled;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void connectionInitialized(HttpConnection connection) {
/*  67 */     super.connectionInitialized(connection);
/*  68 */     if (this.progressEnabled) {
/*  69 */       this.currentFileProgress = 0L;
/*     */     }
/*     */   }
/*     */   
/*     */   protected void initProgress(long defaultFileSize) {
/*  74 */     if (this.fileSize == -1L) {
/*  75 */       this.fileSize = defaultFileSize;
/*     */     }
/*  77 */     if (this.progressEnabled) {
/*  78 */       if (this.totalSize == -1L) {
/*  79 */         this.totalSize = this.fileSize;
/*     */       }
/*     */       
/*  82 */       this.totalSizeVerbose = format(this.totalSize, 1048576L);
/*  83 */       if (this.progressInterface != null) {
/*  84 */         this.progressInterface.setIndeterminateProgress(false);
/*     */       }
/*     */       
/*  87 */       this.startTime = System.currentTimeMillis();
/*  88 */       this.currentFileProgress = 0L;
/*     */     } 
/*     */   }
/*     */   
/*     */   private String format(long longValue, long divider) {
/*  93 */     double val = longValue / divider;
/*  94 */     return ((val >= 1000.0D) ? this.largeNumberFormat : this.numberFormat).format(val);
/*     */   }
/*     */   
/*     */   public void resetLastTransfer() {
/*  98 */     if (this.progressEnabled) {
/*  99 */       this.totalProgress -= this.currentFileProgress;
/* 100 */       this.currentFileProgress = 0L;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void addProgress(long val) {
/* 105 */     if (this.progressEnabled) {
/* 106 */       this.currentFileProgress += val;
/* 107 */       this.totalProgress += val;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected long getFileSize() {
/* 112 */     return this.fileSize;
/*     */   }
/*     */   
/*     */   protected void setFileSize(long fileSize) {
/* 116 */     this.fileSize = fileSize;
/*     */   }
/*     */   
/*     */   protected long getTotalSize() {
/* 120 */     return this.totalSize;
/*     */   }
/*     */   
/*     */   protected long getTotalProgress() {
/* 124 */     return this.totalProgress;
/*     */   }
/*     */   
/*     */   protected void updateProgress(boolean force) {
/* 128 */     if (this.progressInterface == null || !this.progressEnabled) {
/*     */       return;
/*     */     }
/*     */     
/* 132 */     long currentTime = System.currentTimeMillis();
/*     */     
/* 134 */     if (this.totalSize > 0L && (force || currentTime - this.lastProgressUpdateTime > 500L)) {
/* 135 */       long rate = (long)(this.currentFileProgress / (currentTime - this.startTime) * 1000.0D);
/* 136 */       this.progressInterface.setDetailMessage(Messages.format(Messages.getString(".DownloadProgress"), new Object[] { format(this.totalProgress, 1048576L), this.totalSizeVerbose, format(100L * this.totalProgress, this.totalSize), format(rate, 1024L) }));
/* 137 */       this.progressInterface.setPercentCompleted((int)(this.totalProgress * 100L / this.totalSize));
/* 138 */       this.lastProgressUpdateTime = currentTime;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\TransferFileHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */