/*     */ package com.install4j.runtime.beans.actions.text;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.files.BackupFileForRollbackAction;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.FilenameFilter;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintWriter;
/*     */ import java.util.List;
/*     */ 
/*     */ public class FixCrLfAction extends AbstractModifyMultipleFilesAction {
/*     */   private String[] suffixes;
/*     */   private boolean recursive;
/*     */   
/*     */   public String[] getSuffixes() {
/*  19 */     return (String[])replaceWithTextOverride("suffixes", replaceVariables(this.suffixes), String[].class);
/*     */   }
/*     */   
/*     */   public void setSuffixes(String[] suffixes) {
/*  23 */     this.suffixes = suffixes;
/*     */   }
/*     */   
/*     */   public boolean isRecursive() {
/*  27 */     return replaceWithTextOverride("recursive", this.recursive);
/*     */   }
/*     */   
/*     */   public void setRecursive(boolean recursive) {
/*  31 */     this.recursive = recursive;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean modifyFile(File file, Context context) throws IOException, UserCanceledException {
/*  36 */     return fixFiles(file, createFilenameFilter(), true, context);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean fileMustExist() {
/*  41 */     return true;
/*     */   }
/*     */   
/*     */   private FilenameFilter createFilenameFilter() {
/*  45 */     String[] usedSuffixes = getSuffixes();
/*     */     
/*  47 */     return (dir, name) -> {
/*     */         if (usedSuffixes == null || usedSuffixes.length == 0 || (new File(dir, name)).isDirectory()) {
/*     */           return true;
/*     */         }
/*     */         for (String usedSuffix : usedSuffixes) {
/*     */           if (name.endsWith(usedSuffix)) {
/*     */             return true;
/*     */           }
/*     */         } 
/*     */         return false;
/*     */       };
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean fixFiles(File usedFile, FilenameFilter fileNameFilter, boolean fixDirectoryContent, Context context) throws UserCanceledException {
/*  62 */     if (usedFile.isDirectory()) {
/*  63 */       boolean success = true;
/*  64 */       if (fixDirectoryContent) {
/*  65 */         File[] files = usedFile.listFiles(fileNameFilter);
/*  66 */         if (files != null) {
/*  67 */           for (File child : files) {
/*  68 */             if (!fixFiles(child, fileNameFilter, isRecursive(), context)) {
/*  69 */               success = false;
/*     */             }
/*     */           } 
/*     */         }
/*     */       } 
/*  74 */       return success;
/*     */     } 
/*  76 */     if (context instanceof InstallerContext) {
/*  77 */       BackupFileForRollbackAction backupAction = new BackupFileForRollbackAction(usedFile, false);
/*  78 */       backupAction.install((InstallerContext)context);
/*  79 */       addRollbackAction((InstallAction)backupAction);
/*     */     } 
/*     */     
/*  82 */     return fixSingleFile(usedFile);
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean fixSingleFile(File usedFile) {
/*     */     try {
/*  88 */       long modified = usedFile.lastModified();
/*     */       
/*  90 */       List<String> lines = new ArrayList<>();
/*  91 */       BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(usedFile))); 
/*     */       try { String line;
/*  93 */         while ((line = br.readLine()) != null) {
/*  94 */           lines.add(line);
/*     */         }
/*  96 */         br.close(); } catch (Throwable throwable) { try { br.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*     */          throw throwable; }
/*  98 */        PrintWriter pw = new PrintWriter(new FileOutputStream(usedFile)); 
/*  99 */       try { for (String line : lines) {
/* 100 */           pw.println(line);
/*     */         }
/* 102 */         pw.close(); } catch (Throwable throwable) { try { pw.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*     */          throw throwable; }
/* 104 */        usedFile.setLastModified(modified);
/* 105 */       return true;
/* 106 */     } catch (IOException e) {
/* 107 */       e.printStackTrace();
/* 108 */       return false;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\text\FixCrLfAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */