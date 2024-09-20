/*     */ package com.install4j.runtime.beans.actions.files;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.exe4j.runtime.util.NullOutputStream;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.zip.CRC32;
/*     */ import java.util.zip.CheckedInputStream;
/*     */ import java.util.zip.ZipEntry;
/*     */ import java.util.zip.ZipOutputStream;
/*     */ 
/*     */ public class CreateZipFileAction
/*     */   extends AbstractRecursiveFileAction {
/*     */   private File zipFile;
/*  24 */   private ArchiveFileOperationRoot zipRoot = ArchiveFileOperationRoot.INSTALLATION_DIRECTORY;
/*     */   
/*     */   private boolean addTopLevelDirectoriesToRelativePath;
/*     */   
/*     */   private transient ZipOutputStream zipOutputStream;
/*     */   
/*     */   protected transient Map<File, Integer> fileToMethod;
/*  31 */   private ZipMethod method = ZipMethod.DEFLATED;
/*     */   
/*     */   public CreateZipFileAction(Map<File, Integer> fileToMethod) {
/*  34 */     this.fileToMethod = fileToMethod;
/*     */   }
/*     */ 
/*     */   
/*     */   public CreateZipFileAction() {}
/*     */   
/*     */   public File getZipFile() {
/*  41 */     return (File)replaceWithTextOverride("zipFile", replaceVariables(this.zipFile), File.class);
/*     */   }
/*     */   
/*     */   public void setZipFile(File zipFile) {
/*  45 */     this.zipFile = zipFile;
/*     */   }
/*     */   
/*     */   public ArchiveFileOperationRoot getZipRoot() {
/*  49 */     return (ArchiveFileOperationRoot)replaceWithTextOverride("zipRoot", this.zipRoot, ArchiveFileOperationRoot.class);
/*     */   }
/*     */   
/*     */   public void setZipRoot(ArchiveFileOperationRoot zipRoot) {
/*  53 */     this.zipRoot = zipRoot;
/*     */   }
/*     */   
/*     */   public ZipMethod getMethod() {
/*  57 */     return (ZipMethod)replaceWithTextOverride("method", this.method, ZipMethod.class);
/*     */   }
/*     */   
/*     */   public void setMethod(ZipMethod method) {
/*  61 */     this.method = method;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isAddTopLevelDirectoriesToRelativePath() {
/*  66 */     return replaceWithTextOverride("addTopLevelDirectoriesToRelativePath", this.addTopLevelDirectoriesToRelativePath);
/*     */   }
/*     */   
/*     */   public void setAddTopLevelDirectoriesToRelativePath(boolean addTopLevelDirectoriesToRelativePath) {
/*  70 */     this.addTopLevelDirectoriesToRelativePath = addTopLevelDirectoriesToRelativePath;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/*     */     try {
/*  77 */       File zipFile = resolveRelativeFile(getZipFile(), getZipRoot(), context);
/*  78 */       this.zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFile));
/*  79 */     } catch (IOException e) {
/*  80 */       Logger.getInstance().log(e);
/*  81 */       return false;
/*     */     } 
/*     */     
/*  84 */     boolean success = super.execute(context);
/*  85 */     if (success) {
/*     */       try {
/*  87 */         this.zipOutputStream.close();
/*  88 */       } catch (IOException e) {
/*  89 */         Logger.getInstance().log(e);
/*  90 */         return false;
/*     */       } 
/*     */     }
/*  93 */     return success;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isRecursive() {
/*  98 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean executeForSingleRecursiveFile(Context context, File file, File relativeSourceFile, ProgressAdapter progressAdapter) throws UserCanceledException, IOException {
/* 103 */     String entryName = relativeSourceFile.getPath().replace('\\', '/');
/* 104 */     if (entryName.startsWith("./")) {
/* 105 */       entryName = entryName.substring(2);
/*     */     }
/* 107 */     if (file.isDirectory()) {
/* 108 */       entryName = entryName + "/";
/*     */     }
/* 110 */     if (!Objects.equals(entryName, "./")) {
/* 111 */       Logger.getInstance().info(null, "adding entry " + entryName);
/* 112 */       ZipEntry zipEntry = new ZipEntry(entryName);
/* 113 */       zipEntry.setTime(file.lastModified());
/* 114 */       if (file.isFile()) {
/* 115 */         int usedMethod = getMethod().getIntValue();
/* 116 */         if (this.fileToMethod != null) {
/* 117 */           Integer previousMethod = this.fileToMethod.get(file);
/* 118 */           if (previousMethod != null) {
/* 119 */             usedMethod = previousMethod.intValue();
/*     */           }
/*     */         } 
/* 122 */         if (usedMethod == 0) {
/* 123 */           CheckedInputStream in = new CheckedInputStream(new FileInputStream(file), new CRC32()); 
/* 124 */           try { FileUtil.pumpStream(in, (OutputStream)new NullOutputStream());
/* 125 */             zipEntry.setCrc(in.getChecksum().getValue());
/* 126 */             in.close(); } catch (Throwable throwable) { try { in.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/* 127 */            long length = file.length();
/* 128 */           zipEntry.setSize(length);
/* 129 */           zipEntry.setCompressedSize(length);
/*     */         } 
/*     */         
/* 132 */         zipEntry.setMethod(usedMethod);
/*     */       } 
/* 134 */       this.zipOutputStream.putNextEntry(zipEntry);
/* 135 */       if (file.isFile()) {
/* 136 */         FileInputStream in = new FileInputStream(file); 
/* 137 */         try { FileUtil.pumpStream(in, this.zipOutputStream, (FileUtil.CopyProgressListener)progressAdapter);
/* 138 */           in.close(); } catch (Throwable throwable) { try { in.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/*     */       
/* 140 */       }  this.zipOutputStream.closeEntry();
/*     */     } 
/*     */     
/* 143 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\CreateZipFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */