/*     */ package com.install4j.api.context;
/*     */ 
/*     */ import java.util.Date;
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
/*     */ public class FileOptions
/*     */ {
/*     */   public static final String DEFAULT_MODE = "644";
/*  20 */   private long fileTime = (new Date()).getTime();
/*  21 */   private String mode = "644";
/*  22 */   private OverwriteMode overwriteMode = OverwriteMode.ALWAYS_ASK_EXCEPT_FOR_UPDATE;
/*     */   
/*     */   private boolean shared = false;
/*  25 */   private UninstallMode uninstallMode = UninstallMode.IF_CREATED;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean delayIfNecessary = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FileOptions() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FileOptions(String mode, OverwriteMode overwriteMode, boolean shared) {
/*  48 */     this.mode = mode;
/*  49 */     this.overwriteMode = overwriteMode;
/*  50 */     this.shared = shared;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FileOptions(long fileTime) {
/*  60 */     setFileTime(fileTime);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FileOptions(long fileTime, OverwriteMode overwriteMode) {
/*  71 */     setFileTime(fileTime);
/*  72 */     this.overwriteMode = overwriteMode;
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
/*     */   
/*     */   public FileOptions(long fileTime, String mode, OverwriteMode overwriteMode, boolean shared, UninstallMode uninstallMode) {
/*  86 */     setFileTime(fileTime);
/*  87 */     this.mode = mode;
/*  88 */     this.overwriteMode = overwriteMode;
/*  89 */     this.shared = shared;
/*  90 */     this.uninstallMode = uninstallMode;
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
/*     */ 
/*     */   
/*     */   public FileOptions(long fileTime, String mode, OverwriteMode overwriteMode, boolean shared, boolean delayIfNecessary, UninstallMode uninstallMode) {
/* 105 */     setFileTime(fileTime);
/* 106 */     this.mode = mode;
/* 107 */     this.overwriteMode = overwriteMode;
/* 108 */     this.shared = shared;
/* 109 */     this.delayIfNecessary = delayIfNecessary;
/* 110 */     this.uninstallMode = uninstallMode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FileOptions(OverwriteMode overwriteMode, UninstallMode uninstallMode) {
/* 121 */     this.overwriteMode = overwriteMode;
/* 122 */     this.uninstallMode = uninstallMode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long getFileTime() {
/* 130 */     return this.fileTime;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFileTime(long fileTime) {
/* 138 */     if (fileTime > 0L) {
/* 139 */       this.fileTime = fileTime;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMode() {
/* 148 */     return this.mode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMode(int intMode) {
/* 158 */     this.mode = Integer.toOctalString(intMode & 0x1FF);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMode(String mode) {
/* 166 */     this.mode = mode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public OverwriteMode getOverwriteMode() {
/* 174 */     return this.overwriteMode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOverwriteMode(OverwriteMode overwriteMode) {
/* 182 */     this.overwriteMode = overwriteMode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isShared() {
/* 190 */     return this.shared;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setShared(boolean shared) {
/* 198 */     this.shared = shared;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public UninstallMode getUninstallMode() {
/* 206 */     return this.uninstallMode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUninstallMode(UninstallMode uninstallMode) {
/* 214 */     this.uninstallMode = uninstallMode;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isDelayIfNecessary() {
/* 222 */     return this.delayIfNecessary;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDelayIfNecessary(boolean delayIfNecessary) {
/* 230 */     this.delayIfNecessary = delayIfNecessary;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 235 */     return "fileTime: " + new Date(this.fileTime) + ", mode: " + this.mode + ", overwriteMode: " + this.overwriteMode + ", shared: " + this.shared + ", uninstallMode: " + this.uninstallMode + ", delayIfNecessary: " + this.delayIfNecessary;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\FileOptions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */