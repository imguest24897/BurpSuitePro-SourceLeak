/*     */ package com.install4j.runtime.beans.actions.files;
/*     */ 
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractRecursiveFileAction
/*     */   extends AbstractFileAction
/*     */ {
/*     */   private boolean recursive;
/*     */   private boolean showProgress = false;
/*     */   private boolean showFileNames = true;
/*     */   private transient long maxProgress;
/*     */   private transient long currentProgress;
/*     */   
/*     */   public boolean isRecursive() {
/*  23 */     return replaceWithTextOverride("recursive", this.recursive);
/*     */   }
/*     */   
/*     */   public void setRecursive(boolean recursive) {
/*  27 */     this.recursive = recursive;
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
/*     */   public boolean isShowFileNames() {
/*  39 */     return replaceWithTextOverride("showFileNames", this.showFileNames);
/*     */   }
/*     */   
/*     */   public void setShowFileNames(boolean showFileNames) {
/*  43 */     this.showFileNames = showFileNames;
/*     */   }
/*     */   
/*     */   protected abstract boolean executeForSingleRecursiveFile(Context paramContext, File paramFile1, File paramFile2, ProgressAdapter paramProgressAdapter) throws UserCanceledException, IOException;
/*     */   
/*     */   protected boolean postProcessDirectory(Context context, File file) throws UserCanceledException {
/*  49 */     return true;
/*     */   }
/*     */   
/*     */   protected boolean postProcessTopLevelFile(Context context, File file) throws UserCanceledException {
/*  53 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean executeForMultipleFilesAction(Context context, File[] files) throws UserCanceledException {
/*  58 */     ProgressInterface progressInterface = context.getProgressInterface();
/*     */     
/*  60 */     if (isShowProgress()) {
/*  61 */       this.currentProgress = 0L;
/*     */       
/*  63 */       progressInterface.setPercentCompleted(0);
/*  64 */       progressInterface.setDetailMessage("");
/*     */       
/*  66 */       this.maxProgress = 0L;
/*  67 */       for (File file : files) {
/*  68 */         File usedFile = context.getDestinationFile(file);
/*  69 */         if (usedFile.exists()) {
/*  70 */           this.maxProgress += getMaxProgressForSingleFile(usedFile, context);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     try {
/*  75 */       return super.executeForMultipleFilesAction(context, files);
/*     */     } finally {
/*  77 */       if (isShowProgress()) {
/*  78 */         progressInterface.setPercentCompleted(100);
/*  79 */         progressInterface.setDetailMessage("");
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected final boolean executeForSingleFile(Context context, File file) throws UserCanceledException, IOException {
/*     */     File relativeSourceFile;
/*  87 */     if (!file.isDirectory() || isAddTopLevelDirectoriesToRelativePath()) {
/*  88 */       relativeSourceFile = new File(file.getName());
/*     */     } else {
/*  90 */       relativeSourceFile = new File(".");
/*     */     } 
/*  92 */     return (executeForSingleFile(context, file, relativeSourceFile) && postProcessTopLevelFile(context, file));
/*     */   }
/*     */   
/*     */   protected boolean isAddTopLevelDirectoriesToRelativePath() {
/*  96 */     return true;
/*     */   }
/*     */   
/*     */   private boolean executeForSingleFile(Context context, File file, File relativeSourceFile) throws UserCanceledException, IOException {
/* 100 */     if (passesFileOrDirectoryFilter(file, context)) {
/* 101 */       ProgressInterface progressInterface = context.getProgressInterface();
/* 102 */       ProgressAdapter progressAdapter = null;
/* 103 */       long thisProgress = 153600L + (file.isFile() ? file.length() : 0L);
/* 104 */       if (isShowProgress()) {
/* 105 */         if (isShowFileNames()) {
/* 106 */           progressInterface.setDetailMessage(file.getName());
/*     */         }
/* 108 */         if (file.isFile()) {
/* 109 */           progressAdapter = new ProgressAdapter(progressInterface, (int)(this.currentProgress * 100L / this.maxProgress), (int)((this.currentProgress + thisProgress) * 100L / this.maxProgress));
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 114 */       if (!executeForSingleRecursiveFile(context, file, relativeSourceFile, progressAdapter)) {
/* 115 */         return false;
/*     */       }
/*     */       
/* 118 */       this.currentProgress += thisProgress;
/* 119 */       if (isShowProgress()) {
/* 120 */         progressInterface.setPercentCompleted((int)(this.currentProgress * 100L / this.maxProgress));
/*     */       }
/*     */       
/* 123 */       if (file.isDirectory()) {
/* 124 */         if (isRecursive() && 
/* 125 */           !recurse(context, file, relativeSourceFile)) {
/* 126 */           return false;
/*     */         }
/*     */         
/* 129 */         if (!postProcessDirectory(context, file)) {
/* 130 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 135 */     return true;
/*     */   }
/*     */   
/*     */   private boolean recurse(Context context, File file, File relativeSourceFile) throws IOException, UserCanceledException {
/* 139 */     boolean success = true;
/* 140 */     if (file.isDirectory() && followDir(file)) {
/* 141 */       File[] children = file.listFiles();
/* 142 */       if (children != null)
/* 143 */         for (File child : children) {
/* 144 */           if (child != null) {
/*     */ 
/*     */             
/* 147 */             File relativeChildSourceFile = new File(relativeSourceFile, child.getName());
/* 148 */             if (!executeForSingleFile(context, child, relativeChildSourceFile)) {
/* 149 */               success = false;
/*     */             }
/*     */           } 
/*     */         }  
/*     */     } 
/* 154 */     return success;
/*     */   }
/*     */   
/*     */   private boolean followDir(File usedFile) {
/* 158 */     return !Files.isSymbolicLink(usedFile.toPath());
/*     */   }
/*     */   
/*     */   private long getMaxProgressForSingleFile(File sourceFile, Context context) {
/* 162 */     if (!passesFileOrDirectoryFilter(sourceFile, context) || !sourceFile.exists()) {
/* 163 */       return 0L;
/*     */     }
/*     */     
/* 166 */     long ret = 153600L;
/* 167 */     if (sourceFile.isDirectory()) {
/* 168 */       File[] children = sourceFile.listFiles();
/* 169 */       if (children != null) {
/* 170 */         for (File child : children) {
/* 171 */           ret += getMaxProgressForSingleFile(child, context);
/*     */         }
/*     */       }
/*     */     } else {
/* 175 */       ret += sourceFile.length();
/*     */     } 
/*     */     
/* 178 */     return ret;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\AbstractRecursiveFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */