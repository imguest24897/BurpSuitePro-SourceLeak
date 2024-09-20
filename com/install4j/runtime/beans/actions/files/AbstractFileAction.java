/*     */ package com.install4j.runtime.beans.actions.files;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public abstract class AbstractFileAction
/*     */   extends SystemInstallOrUninstallAction
/*     */ {
/*     */   public static final String ACTION_KEY_ARCHIVE = "archive";
/*     */   private File[] files;
/*  19 */   private ArchiveFileOperationRoot filesRoot = getInitialFilesRoot();
/*     */   private ScriptProperty fileFilter;
/*     */   private ScriptProperty directoryFilter;
/*     */   
/*     */   public File[] getFiles() {
/*  24 */     return (File[])replaceWithTextOverride("files", replaceVariables(this.files), File[].class);
/*     */   }
/*     */   
/*     */   public void setFiles(File[] files) {
/*  28 */     this.files = files;
/*     */   }
/*     */   
/*     */   public ArchiveFileOperationRoot getFilesRoot() {
/*  32 */     return (ArchiveFileOperationRoot)replaceWithTextOverride("filesRoot", this.filesRoot, ArchiveFileOperationRoot.class);
/*     */   }
/*     */   
/*     */   protected ArchiveFileOperationRoot getInitialFilesRoot() {
/*  36 */     return null;
/*     */   }
/*     */   
/*     */   public void setFilesRoot(ArchiveFileOperationRoot filesRoot) {
/*  40 */     this.filesRoot = filesRoot;
/*     */   }
/*     */   
/*     */   public ScriptProperty getFileFilter() {
/*  44 */     return (ScriptProperty)replaceWithTextOverride("fileFilter", this.fileFilter, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setFileFilter(ScriptProperty fileFilter) {
/*  48 */     this.fileFilter = fileFilter;
/*     */   }
/*     */   
/*     */   public ScriptProperty getDirectoryFilter() {
/*  52 */     return (ScriptProperty)replaceWithTextOverride("directoryFilter", this.directoryFilter, ScriptProperty.class);
/*     */   }
/*     */   
/*     */   public void setDirectoryFilter(ScriptProperty directoryFilter) {
/*  56 */     this.directoryFilter = directoryFilter;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/*  61 */     return executeForMultipleFilesAction(context, getFiles());
/*     */   }
/*     */   
/*     */   protected boolean executeForMultipleFilesAction(Context context, File[] files) throws UserCanceledException {
/*  65 */     if (files == null) {
/*  66 */       return true;
/*     */     }
/*  68 */     boolean success = true;
/*  69 */     for (File file : files) {
/*  70 */       File usedFile = resolveRelativeFile(file, getFilesRoot(), context);
/*     */       try {
/*  72 */         usedFile = usedFile.getCanonicalFile();
/*  73 */       } catch (IOException e) {
/*  74 */         Logger.getInstance().log(e);
/*     */       } 
/*  76 */       if (!usedFile.exists()) {
/*  77 */         Util.logInfo(this, "The file \"" + usedFile.getPath() + "\" does not exist");
/*  78 */         if (isErrorIfFileMissing()) {
/*  79 */           success = false;
/*     */         }
/*     */       } else {
/*     */         try {
/*  83 */           success &= executeForSingleFile(context, usedFile);
/*  84 */         } catch (IOException e) {
/*  85 */           success = false;
/*  86 */           Logger.getInstance().log(e);
/*     */         } 
/*     */       } 
/*     */     } 
/*  90 */     return success;
/*     */   }
/*     */   
/*     */   protected boolean isErrorIfFileMissing() {
/*  94 */     return true;
/*     */   }
/*     */   
/*     */   protected abstract boolean executeForSingleFile(Context paramContext, File paramFile) throws UserCanceledException, IOException;
/*     */   
/*     */   protected boolean passesFileOrDirectoryFilter(File file, Context context) {
/*     */     try {
/* 101 */       file = file.getCanonicalFile();
/* 102 */     } catch (IOException e) {
/* 103 */       e.printStackTrace();
/*     */     } 
/* 105 */     return ContextImpl.runBooleanScript(context, file.isDirectory() ? getDirectoryFilter() : getFileFilter(), (Bean)this, new Object[] { file });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\AbstractFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */