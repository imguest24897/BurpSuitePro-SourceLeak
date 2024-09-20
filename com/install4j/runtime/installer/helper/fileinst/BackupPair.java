/*     */ package com.install4j.runtime.installer.helper.fileinst;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.Serializable;
/*     */ 
/*     */ abstract class BackupPair
/*     */   implements Serializable {
/*     */   protected InstallFile originalFile;
/*     */   protected long modTime;
/*     */   protected boolean elevated;
/*     */   protected boolean previouslyCreated = false;
/*     */   protected int rollbackId;
/*     */   
/*     */   public static BackupPair createRegular(InstallFile originalFile, long modTime, boolean elevated, File backupFile) {
/*  18 */     return new Regular(originalFile, modTime, elevated, backupFile);
/*     */   }
/*     */   
/*     */   public static BackupPair createSymlink(InstallFile originalFile, long modTime, boolean elevated, String linkTarget) {
/*  22 */     return new Symlink(originalFile, modTime, elevated, linkTarget);
/*     */   }
/*     */   
/*     */   protected BackupPair(InstallFile originalFile, long modTime, boolean elevated) {
/*  26 */     this.originalFile = originalFile;
/*  27 */     this.modTime = modTime;
/*  28 */     this.elevated = elevated;
/*     */   }
/*     */   
/*     */   public boolean isPreviouslyCreated() {
/*  32 */     return this.previouslyCreated;
/*     */   }
/*     */   
/*     */   public void setPreviouslyCreated(boolean previouslyCreated) {
/*  36 */     this.previouslyCreated = previouslyCreated;
/*     */   }
/*     */   
/*     */   public InstallFile getOriginalFile() {
/*  40 */     return this.originalFile;
/*     */   }
/*     */   
/*     */   public long getModTime() {
/*  44 */     return this.modTime;
/*     */   }
/*     */   
/*     */   public boolean isElevated() {
/*  48 */     return this.elevated;
/*     */   }
/*     */   
/*     */   public int getRollbackId() {
/*  52 */     return this.rollbackId;
/*     */   }
/*     */   
/*     */   public void setRollbackId(int rollbackId) {
/*  56 */     this.rollbackId = rollbackId;
/*     */   }
/*     */   
/*     */   public abstract void restore();
/*     */   
/*     */   public void cleanup() {}
/*     */   
/*     */   private static class Regular
/*     */     extends BackupPair {
/*     */     private final File backupFile;
/*     */     
/*     */     protected Regular(InstallFile originalFile, long modTime, boolean elevated, File backupFile) {
/*  68 */       super(originalFile, modTime, elevated);
/*  69 */       this.backupFile = backupFile;
/*     */     }
/*     */ 
/*     */     
/*     */     public void restore() {
/*     */       try {
/*  75 */         getOriginalFile().delete();
/*  76 */         if (!this.backupFile.renameTo(getOriginalFile())) {
/*  77 */           FileUtil.copyFile(this.backupFile, getOriginalFile());
/*     */         }
/*  79 */         getOriginalFile().setLastModified(getModTime());
/*  80 */       } catch (IOException iOException) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void cleanup() {
/*  86 */       this.backupFile.delete();
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/*  91 */       return getOriginalFile() + ", backup: " + this.backupFile;
/*     */     }
/*     */   }
/*     */   
/*     */   private static class Symlink extends BackupPair {
/*     */     private final String linkTarget;
/*     */     
/*     */     protected Symlink(InstallFile originalFile, long modTime, boolean elevated, String linkTarget) {
/*  99 */       super(originalFile, modTime, elevated);
/* 100 */       this.linkTarget = linkTarget;
/*     */     }
/*     */ 
/*     */     
/*     */     public void restore() {
/* 105 */       UnixFileSystem.createLink(this.linkTarget, this.originalFile);
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 110 */       return getOriginalFile() + ", linkTarget: " + this.linkTarget;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\fileinst\BackupPair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */