/*     */ package com.install4j.runtime.beans.actions.files;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.FileOptions;
/*     */ import com.install4j.api.context.OverwriteMode;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UninstallMode;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class CopyFileAction extends AbstractRecursiveFileAction {
/*  18 */   private ArchiveFileOperationRoot destinationRoot = ArchiveFileOperationRoot.INSTALLATION_DIRECTORY;
/*     */   private File destinationFile;
/*  20 */   private OverwriteMode overwriteMode = OverwriteMode.ALWAYS_ASK_EXCEPT_FOR_UPDATE;
/*  21 */   private String mode = "644";
/*  22 */   private String directoryMode = "755";
/*     */   private boolean shared = false;
/*  24 */   private UninstallMode uninstallMode = UninstallMode.IF_CREATED;
/*     */   
/*     */   private boolean delay = false;
/*     */   
/*     */   private boolean triggerReboot = true;
/*     */   private transient boolean toSingleFile;
/*     */   
/*     */   public boolean isDelay() {
/*  32 */     return replaceWithTextOverride("delay", this.delay);
/*     */   }
/*     */   
/*     */   public void setDelay(boolean delay) {
/*  36 */     this.delay = delay;
/*     */   }
/*     */   
/*     */   public boolean isTriggerReboot() {
/*  40 */     return replaceWithTextOverride("triggerReboot", this.triggerReboot);
/*     */   }
/*     */   
/*     */   public void setTriggerReboot(boolean triggerReboot) {
/*  44 */     this.triggerReboot = triggerReboot;
/*     */   }
/*     */   
/*     */   public String getDirectoryMode() {
/*  48 */     return replaceVariables(this.directoryMode);
/*     */   }
/*     */   
/*     */   public void setDirectoryMode(String directoryMode) {
/*  52 */     this.directoryMode = directoryMode;
/*     */   }
/*     */   
/*     */   public File getDestinationFile() {
/*  56 */     return (File)replaceWithTextOverride("destinationFile", replaceVariables(this.destinationFile), File.class);
/*     */   }
/*     */   
/*     */   public void setDestinationFile(File destinationFile) {
/*  60 */     this.destinationFile = destinationFile;
/*     */   }
/*     */   
/*     */   public ArchiveFileOperationRoot getDestinationRoot() {
/*  64 */     return (ArchiveFileOperationRoot)replaceWithTextOverride("destinationRoot", this.destinationRoot, ArchiveFileOperationRoot.class);
/*     */   }
/*     */   
/*     */   public void setDestinationRoot(ArchiveFileOperationRoot destinationRoot) {
/*  68 */     this.destinationRoot = destinationRoot;
/*     */   }
/*     */   
/*     */   public OverwriteMode getOverwriteMode() {
/*  72 */     return (OverwriteMode)replaceWithTextOverride("overwriteMode", this.overwriteMode, OverwriteMode.class);
/*     */   }
/*     */   
/*     */   public void setOverwriteMode(OverwriteMode overwriteMode) {
/*  76 */     this.overwriteMode = overwriteMode;
/*     */   }
/*     */   
/*     */   public UninstallMode getUninstallMode() {
/*  80 */     return (UninstallMode)replaceWithTextOverride("uninstallMode", this.uninstallMode, UninstallMode.class);
/*     */   }
/*     */   
/*     */   public void setUninstallMode(UninstallMode uninstallMode) {
/*  84 */     this.uninstallMode = uninstallMode;
/*     */   }
/*     */   
/*     */   public String getMode() {
/*  88 */     return replaceVariables(this.mode);
/*     */   }
/*     */   
/*     */   public void setMode(String mode) {
/*  92 */     this.mode = mode;
/*     */   }
/*     */   
/*     */   public boolean isShared() {
/*  96 */     return replaceWithTextOverride("shared", this.shared);
/*     */   }
/*     */   
/*     */   public void setShared(boolean shared) {
/* 100 */     this.shared = shared;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArchiveFileOperationRoot getInitialFilesRoot() {
/* 105 */     return ArchiveFileOperationRoot.INSTALLATION_DIRECTORY;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean executeForMultipleFilesAction(Context context, File[] files) throws UserCanceledException {
/* 111 */     File destinationFile = getUsedDestinationFile(context);
/*     */     
/* 113 */     this.toSingleFile = false;
/* 114 */     if (!destinationFile.isDirectory()) {
/* 115 */       if (files.length > 1) {
/* 116 */         Logger.getInstance().log(this, "Destination file " + destinationFile + " is not a directory and there are more than one source files", false);
/* 117 */         return false;
/* 118 */       }  if (context.getDestinationFile(files[0]).isFile()) {
/* 119 */         this.toSingleFile = true;
/*     */       }
/*     */     } 
/*     */     
/* 123 */     FileInstaller.getInstance().resetCurrentRebootRequired();
/*     */     try {
/* 125 */       return super.executeForMultipleFilesAction(context, files);
/*     */     } finally {
/* 127 */       if (isTriggerReboot() && isDelay() && FileInstaller.getInstance().isCurrentRebootRequired()) {
/* 128 */         context.triggerReboot(true);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private File getUsedDestinationFile(Context context) {
/* 134 */     return resolveRelativeFile(getDestinationFile(), getDestinationRoot(), context);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean executeForSingleRecursiveFile(Context context, File file, File relativeSourceFile, ProgressAdapter progressAdapter) throws UserCanceledException, IOException {
/* 139 */     FileInstaller fileInstaller = FileInstaller.getInstance();
/*     */     
/* 141 */     File destinationFile = getUsedDestinationFile(context);
/* 142 */     if (file.isDirectory()) {
/* 143 */       File parentDirectory = getCanonicalFileNoError(new File(destinationFile, relativeSourceFile.getPath()));
/* 144 */       fileInstaller.createDirectory(parentDirectory, getUninstallMode());
/* 145 */       long time = file.lastModified();
/* 146 */       if (time > 0L) {
/* 147 */         parentDirectory.setLastModified(time);
/*     */       }
/* 149 */       if (!InstallerUtil.isWindows()) {
/* 150 */         UnixFileSystem.setMode(getDirectoryMode(), parentDirectory);
/*     */       }
/*     */     } else {
/*     */       File destFile;
/*     */       
/* 155 */       if (this.toSingleFile) {
/* 156 */         destFile = destinationFile;
/*     */       } else {
/* 158 */         destFile = getCanonicalFileNoError(new File(destinationFile, relativeSourceFile.getPath()));
/*     */       } 
/* 160 */       Util.logInfo(null, getActionName() + " " + file + " to " + destFile);
/*     */       
/* 162 */       if (isInOverriddenTargetDir(destFile)) {
/* 163 */         if (!FileUtil.copyFile(file, destFile, (FileUtil.CopyProgressListener)progressAdapter)) {
/* 164 */           return false;
/*     */         }
/* 166 */         destFile.setLastModified(file.lastModified());
/*     */       }
/* 168 */       else if (!fileInstaller.install(file, destFile, new FileOptions(file
/* 169 */             .lastModified(), getMode(), getOverwriteMode(), isShared(), isDelay(), getUninstallMode()), (ProgressInterface)progressAdapter)) {
/* 170 */         return false;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 175 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean isAddTopLevelDirectoriesToRelativePath() {
/* 180 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isRecursive() {
/* 185 */     return true;
/*     */   }
/*     */   
/*     */   private File getCanonicalFileNoError(File file) {
/*     */     try {
/* 190 */       return file.getCanonicalFile();
/* 191 */     } catch (IOException e) {
/* 192 */       return file;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected String getActionName() {
/* 197 */     return "Copy";
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\CopyFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */