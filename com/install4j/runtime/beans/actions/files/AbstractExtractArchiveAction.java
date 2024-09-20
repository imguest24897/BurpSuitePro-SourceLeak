/*     */ package com.install4j.runtime.beans.actions.files;
/*     */ 
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.content.apache.archivers.tar.TarArchiveEntry;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public abstract class AbstractExtractArchiveAction
/*     */   extends SystemInstallOrUninstallAction
/*     */ {
/*     */   private File archiveFile;
/*     */   private File destinationDirectory;
/*     */   private ScriptProperty fileFilter;
/*     */   private boolean showProgress = true;
/*     */   private boolean showFileNames = true;
/*     */   
/*     */   public File getArchiveFile() {
/*  23 */     return (File)replaceWithTextOverride("archiveFile", replaceVariables(this.archiveFile), File.class);
/*     */   }
/*     */   
/*     */   public void setArchiveFile(File archiveFile) {
/*  27 */     this.archiveFile = archiveFile;
/*     */   }
/*     */   
/*     */   public File getDestinationDirectory() {
/*  31 */     return (File)replaceWithTextOverride("destinationDirectory", replaceVariables(this.destinationDirectory), File.class);
/*     */   }
/*     */   
/*     */   public void setDestinationDirectory(File destinationDirectory) {
/*  35 */     this.destinationDirectory = destinationDirectory;
/*     */   }
/*     */   
/*     */   public ScriptProperty getFileFilter() {
/*  39 */     return (ScriptProperty)replaceWithTextOverride("fileFilter", this.fileFilter, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setFileFilter(ScriptProperty fileFilter) {
/*  43 */     this.fileFilter = fileFilter;
/*     */   }
/*     */   
/*     */   public boolean isShowProgress() {
/*  47 */     return replaceWithTextOverride("showProgress", this.showProgress);
/*     */   }
/*     */   
/*     */   public void setShowProgress(boolean showProgress) {
/*  51 */     this.showProgress = showProgress;
/*     */   }
/*     */   
/*     */   public boolean isShowFileNames() {
/*  55 */     return replaceWithTextOverride("showFileNames", this.showFileNames);
/*     */   }
/*     */   
/*     */   public void setShowFileNames(boolean showFileNames) {
/*  59 */     this.showFileNames = showFileNames;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/*  64 */     if (!isAvailable()) {
/*  65 */       return true;
/*     */     }
/*  67 */     File usedFile = context.getDestinationFile(getArchiveFile());
/*  68 */     if (usedFile == null || !usedFile.isFile()) {
/*  69 */       Logger.getInstance().error(this, "archive file " + getArchiveFile() + " (" + usedFile + ", " + getArchiveFile() + ") does not exist.");
/*  70 */       return false;
/*     */     } 
/*     */     
/*  73 */     File usedDestination = context.getDestinationFile(getDestinationDirectory());
/*  74 */     if (usedDestination == null) {
/*  75 */       Logger.getInstance().error(this, "could not resolve destination " + getDestinationDirectory() + ", " + getDestinationDirectory());
/*  76 */       return false;
/*     */     } 
/*     */     
/*     */     try {
/*  80 */       return extract(context, usedFile, usedDestination);
/*  81 */     } catch (IOException e) {
/*  82 */       Logger.getInstance().log(e);
/*     */ 
/*     */       
/*  85 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected abstract boolean extract(Context paramContext, File paramFile1, File paramFile2) throws IOException;
/*     */   
/*     */   protected final void initProgress(ProgressInterface progressInterface, int value) {
/*  92 */     if (isShowProgress()) {
/*  93 */       progressInterface.setPercentCompleted(value);
/*  94 */       if (isShowFileNames()) {
/*  95 */         progressInterface.setDetailMessage("");
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean isAvailable() {
/* 101 */     return true;
/*     */   }
/*     */   
/*     */   public static interface TarEntryMapper {
/*     */     String mapEntry(TarArchiveEntry param1TarArchiveEntry);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\AbstractExtractArchiveAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */