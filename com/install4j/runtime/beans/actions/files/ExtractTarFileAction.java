/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ import com.exe4j.runtime.util.FileUtil;
/*    */ import com.install4j.api.beans.Bean;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.api.unix.UnixFileSystem;
/*    */ import com.install4j.runtime.installer.ContextImpl;
/*    */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import com.install4j.runtime.installer.helper.content.CountingInputStream;
/*    */ import com.install4j.runtime.installer.helper.content.apache.archivers.tar.TarArchiveEntry;
/*    */ import com.install4j.runtime.installer.helper.content.apache.archivers.tar.TarArchiveInputStream;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.RandomAccessFile;
/*    */ 
/*    */ public class ExtractTarFileAction extends AbstractExtractArchiveAction {
/* 19 */   public static final SymlinkHandler DEFAULT_SYMLINK_HANDLER = UnixFileSystem::createLink;
/*    */ 
/*    */   
/*    */   protected boolean extract(Context context, File archiveFile, File destinationDirectory) throws IOException {
/* 23 */     ProgressAdapter progressAdapter = new ProgressAdapter(context.getProgressInterface(), 0, 100);
/* 24 */     initProgress((ProgressInterface)progressAdapter, 0);
/*    */     try {
/* 26 */       extractTarFile(archiveFile, destinationDirectory, (ProgressInterface)progressAdapter, isShowProgress(), (isShowProgress() && isShowFileNames()), tarArchiveEntry -> { String entryName = tarArchiveEntry.getName(); File entryFile = new File(entryName); return ContextImpl.runBooleanScript(context, getFileFilter(), (Bean)this, new Object[] { entryFile, Boolean.valueOf(tarArchiveEntry.isDirectory()), Boolean.valueOf(tarArchiveEntry.isSymbolicLink()) }) ? entryName : null; }DEFAULT_SYMLINK_HANDLER);
/*    */ 
/*    */ 
/*    */     
/*    */     }
/*    */     finally {
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 36 */       initProgress((ProgressInterface)progressAdapter, 100);
/*    */     } 
/* 38 */     return true;
/*    */   }
/*    */   
/*    */   public static void extractTarFile(File archiveFile, File destinationDirectory, final ProgressInterface progressInterface, boolean showProgress, boolean showFileNames, AbstractExtractArchiveAction.TarEntryMapper tarEntryMapper, SymlinkHandler symlinkHandler) throws IOException {
/* 42 */     final long fileLength = archiveFile.length();
/* 43 */     if (fileLength < 2L) {
/* 44 */       throw new IOException("length of " + archiveFile + " < 2");
/*    */     }
/*    */     
/* 47 */     RandomAccessFile randomAccessFile = new RandomAccessFile(archiveFile, "r"); try {
/* 48 */       byte[] signature = new byte[2];
/* 49 */       randomAccessFile.readFully(signature);
/* 50 */       randomAccessFile.seek(0L);
/* 51 */       final CountingInputStream countingIn = new CountingInputStream(new BufferedInputStream(new FileInputStream(randomAccessFile.getFD())));
/* 52 */       FileUtil.CopyProgressListener copyProgressListener = null;
/*    */       
/* 54 */       if (showProgress) {
/* 55 */         copyProgressListener = new FileUtil.CopyProgressListener() {
/* 56 */             long lastProgress = 0L;
/*    */ 
/*    */             
/*    */             public boolean progressPerformed(long val) {
/* 60 */               long newProgress = countingIn.getCount() * 100L / fileLength;
/* 61 */               if (newProgress > 100L) {
/* 62 */                 newProgress = 100L;
/*    */               }
/* 64 */               if (newProgress > this.lastProgress) {
/* 65 */                 this.lastProgress = newProgress;
/* 66 */                 progressInterface.setPercentCompleted((int)newProgress);
/*    */               } 
/* 68 */               return true;
/*    */             }
/*    */           };
/*    */       }
/*    */       
/* 73 */       TarArchiveInputStream in = new TarArchiveInputStream(FileUtil.isGzipStream(signature) ? new GZIPInputStream((InputStream)countingIn) : (InputStream)countingIn);
/* 74 */       TarArchiveEntry tarEntry = in.getNextTarEntry();
/* 75 */       while (tarEntry != null) {
/* 76 */         String entryName = tarEntry.getName();
/* 77 */         String targetEntryName = tarEntryMapper.mapEntry(tarEntry);
/* 78 */         if (targetEntryName != null) {
/* 79 */           File destFile = new File(destinationDirectory, targetEntryName);
/* 80 */           if (showFileNames) {
/* 81 */             progressInterface.setDetailMessage(InstallerUtil.cleanupName(entryName));
/*    */           }
/* 83 */           if (tarEntry.isSymbolicLink()) {
/* 84 */             symlinkHandler.handle(tarEntry.getLinkName(), destFile);
/* 85 */           } else if (tarEntry.isDirectory()) {
/* 86 */             destFile.mkdirs();
/*    */           } else {
/* 88 */             destFile.getParentFile().mkdirs();
/* 89 */             FileUtil.extractFile((InputStream)in, destFile, tarEntry.getSize(), copyProgressListener, false);
/*    */           } 
/* 91 */           destFile.setLastModified(tarEntry.getModTime().getTime());
/* 92 */           UnixFileSystem.setMode(tarEntry.getMode(), destFile);
/*    */         } 
/* 94 */         tarEntry = in.getNextTarEntry();
/*    */       } 
/* 96 */       in.close();
/* 97 */       randomAccessFile.close();
/*    */     } catch (Throwable throwable) {
/*    */       try {
/*    */         randomAccessFile.close();
/*    */       } catch (Throwable throwable1) {
/*    */         throwable.addSuppressed(throwable1);
/*    */       } 
/*    */       throw throwable;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static interface SymlinkHandler {
/*    */     void handle(String param1String, File param1File) throws IOException;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\ExtractTarFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */