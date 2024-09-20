/*     */ package com.install4j.runtime.beans.actions.files;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*     */ import com.install4j.runtime.installer.helper.FileAttributesHelper;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.platform.macos.VolumeInfo;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.nio.file.Files;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class ExtractDmgFileAction
/*     */   extends AbstractExtractArchiveAction
/*     */ {
/*     */   protected boolean extract(Context context, File archiveFile, File destinationDirectory) throws IOException {
/*  25 */     final ProgressAdapter progressInterface = new ProgressAdapter(context.getProgressInterface(), 0, 100);
/*  26 */     initProgress((ProgressInterface)progressAdapter, 0);
/*     */     
/*  28 */     File mountPoint = VolumeInfo.attachDmg(archiveFile, true);
/*  29 */     boolean attachPerformed = true;
/*  30 */     if (mountPoint == null) {
/*  31 */       attachPerformed = false;
/*  32 */       mountPoint = VolumeInfo.findAttachedDmg(archiveFile);
/*  33 */       if (mountPoint == null) {
/*  34 */         return false;
/*     */       }
/*     */     } 
/*     */     
/*  38 */     Set<String> excludedEntryNames = new HashSet<>();
/*  39 */     final long totalLength = countTotalLength(context, excludedEntryNames, mountPoint, mountPoint, "");
/*     */     
/*  41 */     FileUtil.CopyProgressListener copyProgressListener = null;
/*  42 */     if (isShowProgress()) {
/*  43 */       copyProgressListener = new FileUtil.CopyProgressListener() {
/*  44 */           long lastProgress = 0L;
/*  45 */           long copiedSoFar = 0L;
/*     */           
/*     */           public boolean progressPerformed(long val) {
/*  48 */             this.copiedSoFar += val;
/*     */             
/*  50 */             long newProgress = this.copiedSoFar * 100L / totalLength;
/*  51 */             if (newProgress > 100L) {
/*  52 */               newProgress = 100L;
/*     */             }
/*  54 */             if (newProgress > this.lastProgress) {
/*  55 */               this.lastProgress = newProgress;
/*  56 */               progressInterface.setPercentCompleted((int)newProgress);
/*     */             } 
/*  58 */             return true;
/*     */           }
/*     */         };
/*     */     }
/*     */     
/*     */     try {
/*  64 */       copyFiles(excludedEntryNames, copyProgressListener, (isShowProgress() && isShowFileNames()) ? (ProgressInterface)progressAdapter : null, mountPoint, destinationDirectory, "");
/*     */     } finally {
/*  66 */       if (attachPerformed && 
/*  67 */         !VolumeInfo.detach(mountPoint)) {
/*  68 */         Logger.getInstance().error(null, "could not detach " + archiveFile + " from " + mountPoint);
/*     */       }
/*     */     } 
/*     */     
/*  72 */     return true;
/*     */   }
/*     */   
/*     */   private void copyFiles(Set<String> excludedEntryNames, FileUtil.CopyProgressListener copyProgressListener, ProgressInterface fileNameProgressInterface, File sourceDir, File destinationDir, String prefix) throws IOException {
/*  76 */     File[] files = sourceDir.listFiles();
/*  77 */     if (files != null) {
/*  78 */       for (File file : files) {
/*  79 */         String entryName = getEntryName(prefix, file);
/*  80 */         if (!excludedEntryNames.contains(entryName)) {
/*  81 */           if (fileNameProgressInterface != null) {
/*  82 */             fileNameProgressInterface.setDetailMessage(entryName);
/*     */           }
/*  84 */           File destinationFile = new File(destinationDir, file.getName());
/*  85 */           if (Files.isSymbolicLink(file.toPath())) {
/*  86 */             UnixFileSystem.createLink(Files.readSymbolicLink(file.toPath()).toString(), destinationFile);
/*  87 */           } else if (file.isFile()) {
/*  88 */             FileUtil.copyFile(file, destinationFile, copyProgressListener);
/*  89 */           } else if (file.isDirectory()) {
/*  90 */             destinationFile.mkdirs();
/*  91 */             copyFiles(excludedEntryNames, copyProgressListener, fileNameProgressInterface, file, destinationFile, entryName);
/*     */           } 
/*  93 */           destinationFile.setLastModified(file.lastModified());
/*  94 */           UnixFileSystem.setMode(FileAttributesHelper.getPosixFilePermissions(file), destinationFile);
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private long countTotalLength(Context context, Set<String> excludedEntryNames, File mountPoint, File sourceDir, String prefix) {
/* 101 */     long length = 0L;
/* 102 */     File[] files = sourceDir.listFiles();
/* 103 */     if (files != null) {
/* 104 */       for (File file : files) {
/* 105 */         String entryName = getEntryName(prefix, file);
/* 106 */         if (matchesFileFilter(context, entryName, mountPoint)) {
/* 107 */           if (!Files.isSymbolicLink(file.toPath())) {
/* 108 */             if (file.isFile()) {
/* 109 */               length += file.length();
/* 110 */             } else if (file.isDirectory()) {
/* 111 */               length += countTotalLength(context, excludedEntryNames, mountPoint, file, entryName);
/*     */             } 
/*     */           }
/*     */         } else {
/* 115 */           excludedEntryNames.add(entryName);
/*     */         } 
/*     */       } 
/*     */     }
/* 119 */     return length;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private String getEntryName(String prefix, File file) {
/*     */     String newPrefix;
/* 125 */     if (prefix.isEmpty()) {
/* 126 */       newPrefix = file.getName();
/*     */     } else {
/* 128 */       newPrefix = prefix + File.separator + file.getName();
/*     */     } 
/* 130 */     return newPrefix;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isAvailable() {
/* 135 */     return Util.isMacOS();
/*     */   }
/*     */   
/*     */   private boolean matchesFileFilter(Context context, String entryName, File mountPoint) {
/* 139 */     File entryFile = new File(entryName);
/* 140 */     return ContextImpl.runBooleanScript(context, getFileFilter(), (Bean)this, new Object[] { entryFile, mountPoint });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\ExtractDmgFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */