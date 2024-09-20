/*     */ package com.install4j.runtime.beans.actions.files;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.charset.Charset;
/*     */ import java.nio.charset.UnsupportedCharsetException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Enumeration;
/*     */ import java.util.List;
/*     */ import java.util.zip.ZipEntry;
/*     */ import java.util.zip.ZipFile;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public abstract class AbstractZipFileAction
/*     */   extends SystemInstallOrUninstallAction
/*     */ {
/*     */   private File zipFile;
/*  30 */   private ArchiveFileOperationRoot zipRoot = ArchiveFileOperationRoot.INSTALLATION_DIRECTORY;
/*     */   private boolean showProgress = true;
/*     */   private String fileNameEncoding;
/*     */   
/*     */   public boolean isShowProgress() {
/*  35 */     return replaceWithTextOverride("showProgress", this.showProgress);
/*     */   }
/*     */   
/*     */   public void setShowProgress(boolean showProgress) {
/*  39 */     this.showProgress = showProgress;
/*     */   }
/*     */   
/*     */   public File getZipFile() {
/*  43 */     return (File)replaceWithTextOverride("zipFile", replaceVariables(this.zipFile), File.class);
/*     */   }
/*     */   
/*     */   public void setZipFile(File zipFile) {
/*  47 */     this.zipFile = zipFile;
/*     */   }
/*     */   
/*     */   public ArchiveFileOperationRoot getZipRoot() {
/*  51 */     return (ArchiveFileOperationRoot)replaceWithTextOverride("zipRoot", this.zipRoot, ArchiveFileOperationRoot.class);
/*     */   }
/*     */   
/*     */   public void setZipRoot(ArchiveFileOperationRoot zipRoot) {
/*  55 */     this.zipRoot = zipRoot;
/*     */   }
/*     */   
/*     */   public String getFileNameEncoding() {
/*  59 */     return replaceVariables(replaceVariables(this.fileNameEncoding));
/*     */   }
/*     */   
/*     */   public void setFileNameEncoding(String fileNameEncoding) {
/*  63 */     this.fileNameEncoding = fileNameEncoding;
/*     */   }
/*     */   protected abstract File getTargetDirectory(Context paramContext);
/*     */   
/*     */   protected abstract boolean passesFileFilter(String paramString, Context paramContext);
/*     */   
/*     */   protected void createFile(File destFile, InputStream zipIn, ZipEntry zipEntry, long currentSize, ProgressAdapter progressAdapter) throws UserCanceledException, IOException {
/*  70 */     createDirectory(destFile.getParentFile());
/*  71 */     FileUtil.extractFile(zipIn, destFile, currentSize, (FileUtil.CopyProgressListener)progressAdapter, false);
/*     */   }
/*     */   
/*     */   protected void createDirectory(File destFile) throws IOException {
/*  75 */     if (!destFile.exists()) {
/*  76 */       destFile.mkdirs();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/*  82 */     File usedSourceFile = resolveRelativeFile(getZipFile(), getZipRoot(), context);
/*  83 */     if (!usedSourceFile.exists()) {
/*  84 */       Logger.getInstance().error(this, usedSourceFile + " does not exist");
/*  85 */       return false;
/*     */     } 
/*     */     try {
/*  88 */       return zipActions(context, usedSourceFile);
/*  89 */     } catch (IOException e) {
/*  90 */       e.printStackTrace();
/*  91 */       Logger.getInstance().error(this, "exception " + e);
/*  92 */       Logger.getInstance().log(e);
/*  93 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected boolean zipActions(Context context, File usedSourceFile) throws IOException, UserCanceledException {
/*  98 */     extractZip(context, usedSourceFile, getTargetDirectory(context));
/*  99 */     return true;
/*     */   }
/*     */   
/*     */   private void extractZip(Context context, File sourceFile, File destDir) throws IOException, UserCanceledException {
/* 103 */     ProgressAdapter progressAdapter = new ProgressAdapter(context.getProgressInterface(), 0, getExtractionPercent());
/*     */     
/* 105 */     boolean showProgress = isShowProgress();
/* 106 */     List<Long> fileSizes = new ArrayList<>();
/*     */     
/* 108 */     try { ZipFile zipFile = openZipFile(sourceFile, getFileNameEncoding()); 
/*     */       try { long maxProgress;
/* 110 */         if (showProgress) {
/* 111 */           progressAdapter.setPercentCompleted(0);
/* 112 */           if (isShowFileNames()) {
/* 113 */             progressAdapter.setDetailMessage("");
/*     */           }
/*     */           
/* 116 */           maxProgress = getMaxProgress(zipFile, fileSizes);
/*     */         } else {
/* 118 */           maxProgress = Long.MAX_VALUE;
/*     */         } 
/*     */         
/* 121 */         long currentProgress = 0L;
/*     */         
/* 123 */         int index = 0;
/* 124 */         Enumeration<? extends ZipEntry> entries = zipFile.entries();
/* 125 */         while (entries.hasMoreElements()) {
/* 126 */           ZipEntry zipEntry = entries.nextElement();
/* 127 */           if (context.isCancelling()) {
/* 128 */             throw new UserCanceledException();
/*     */           }
/*     */           
/* 131 */           String entryName = getEntryName(zipEntry);
/* 132 */           if (passesFileFilter(entryName, context)) {
/* 133 */             if (showProgress && isShowFileNames()) {
/* 134 */               progressAdapter.setDetailMessage(InstallerUtil.cleanupName(entryName));
/*     */             }
/*     */             
/* 137 */             long nextProgress = currentProgress + 153600L;
/* 138 */             long currentSize = fileSizes.isEmpty() ? 0L : ((Long)fileSizes.get(index++)).longValue();
/* 139 */             File destFile = getDestinationFile(destDir, entryName);
/* 140 */             saveInfo(destFile, zipEntry);
/* 141 */             if (zipEntry.isDirectory()) {
/* 142 */               createDirectory(destFile);
/* 143 */               destFile.setLastModified(zipEntry.getTime());
/* 144 */               directoryCreated(destFile);
/*     */             } else {
/* 146 */               nextProgress += currentSize;
/*     */               
/* 148 */               ProgressAdapter progressAdapter1 = null;
/* 149 */               if (showProgress) {
/* 150 */                 progressAdapter1 = new ProgressAdapter((ProgressInterface)progressAdapter, (int)(currentProgress * 100L / maxProgress), (int)(nextProgress * 100L / maxProgress));
/*     */               }
/*     */ 
/*     */               
/* 154 */               createFile(destFile, zipFile.getInputStream(zipEntry), zipEntry, currentSize, progressAdapter1);
/* 155 */               fileCreated(destFile);
/*     */             } 
/* 157 */             if (context.isCancelling()) {
/* 158 */               throw new UserCanceledException();
/*     */             }
/*     */             
/* 161 */             currentProgress = nextProgress;
/* 162 */             if (showProgress) {
/* 163 */               progressAdapter.setPercentCompleted((int)(currentProgress * 100L / maxProgress));
/*     */             }
/*     */           } 
/*     */         } 
/* 167 */         if (zipFile != null) zipFile.close();  } catch (Throwable throwable) { if (zipFile != null)
/* 168 */           try { zipFile.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }  } finally { if (showProgress) {
/* 169 */         progressAdapter.setPercentCompleted(100);
/* 170 */         if (isShowFileNames()) {
/* 171 */           progressAdapter.setDetailMessage("");
/*     */         }
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private File getDestinationFile(File destDir, String entryName) {
/* 179 */     File destFile = new File(destDir, entryName);
/*     */     try {
/* 181 */       return destFile.getCanonicalFile();
/* 182 */     } catch (IOException ex) {
/* 183 */       return destFile;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void saveInfo(File destFile, ZipEntry zipEntry) {}
/*     */   
/*     */   public boolean isShowFileNames() {
/* 191 */     return true;
/*     */   }
/*     */   
/*     */   protected int getExtractionPercent() {
/* 195 */     return 100;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void directoryCreated(File destFile) {}
/*     */ 
/*     */   
/*     */   protected void fileCreated(File destFile) {}
/*     */ 
/*     */   
/*     */   protected boolean matchesFileFilter(String entryName, Context context, ScriptProperty fileFilter) {
/* 206 */     File entryFile = new File(entryName);
/* 207 */     return ContextImpl.runBooleanScript(context, fileFilter, (Bean)this, new Object[] { entryFile, Boolean.valueOf(entryName.endsWith(File.separator)) });
/*     */   }
/*     */   
/*     */   private static String getEntryName(ZipEntry zipEntry) {
/* 211 */     String zipName = zipEntry.getName();
/* 212 */     if (InstallerUtil.isWindows()) {
/* 213 */       zipName = zipName.replace('/', '\\');
/*     */     } else {
/* 215 */       zipName = zipName.replace('\\', '/');
/*     */     } 
/* 217 */     return zipName;
/*     */   }
/*     */   
/*     */   private long getMaxProgress(ZipFile zipFile, List<Long> fileSizes) throws IOException {
/* 221 */     long maxProgress = 0L;
/*     */     
/* 223 */     Enumeration<? extends ZipEntry> entries = zipFile.entries();
/* 224 */     while (entries.hasMoreElements()) {
/* 225 */       ZipEntry zipEntry = entries.nextElement();
/* 226 */       long size = zipEntry.isDirectory() ? 0L : zipEntry.getSize();
/* 227 */       fileSizes.add(Long.valueOf(size));
/* 228 */       maxProgress += size + 153600L;
/*     */     } 
/* 230 */     return maxProgress;
/*     */   }
/*     */   
/*     */   private static ZipFile openZipFile(File file, String encoding) throws IOException {
/* 234 */     if (encoding != null && !encoding.isEmpty()) {
/*     */       try {
/* 236 */         return new ZipFile(file, Charset.forName(encoding));
/* 237 */       } catch (UnsupportedCharsetException e) {
/* 238 */         Logger.getInstance().log(e);
/* 239 */         return new ZipFile(file);
/*     */       } 
/*     */     }
/* 242 */     return new ZipFile(file);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\AbstractZipFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */