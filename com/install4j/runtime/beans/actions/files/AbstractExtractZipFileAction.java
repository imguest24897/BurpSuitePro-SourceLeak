/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ 
/*    */ import com.install4j.api.beans.ScriptProperty;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.unix.UnixFileSystem;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AbstractExtractZipFileAction
/*    */   extends AbstractZipFileAction
/*    */ {
/*    */   private static final String DEFAULT_DIR_MODE = "755";
/*    */   private File destinationDirectory;
/* 16 */   private ArchiveFileOperationRoot destinationRoot = ArchiveFileOperationRoot.INSTALLATION_DIRECTORY;
/*    */   
/* 18 */   private String mode = "644";
/* 19 */   private String dirMode = "755";
/*    */   
/*    */   private boolean showFileNames = true;
/*    */   private ScriptProperty fileFilter;
/*    */   
/*    */   public File getDestinationDirectory() {
/* 25 */     return (File)replaceWithTextOverride("destinationDirectory", replaceVariables(this.destinationDirectory), File.class);
/*    */   }
/*    */   
/*    */   public void setDestinationDirectory(File destinationDirectory) {
/* 29 */     this.destinationDirectory = destinationDirectory;
/*    */   }
/*    */   
/*    */   public ArchiveFileOperationRoot getDestinationRoot() {
/* 33 */     return (ArchiveFileOperationRoot)replaceWithTextOverride("destinationRoot", this.destinationRoot, ArchiveFileOperationRoot.class);
/*    */   }
/*    */   
/*    */   public void setDestinationRoot(ArchiveFileOperationRoot destinationRoot) {
/* 37 */     this.destinationRoot = destinationRoot;
/*    */   }
/*    */   
/*    */   public String getMode() {
/* 41 */     return replaceVariables(replaceVariables(this.mode));
/*    */   }
/*    */   
/*    */   public void setMode(String mode) {
/* 45 */     this.mode = mode;
/*    */   }
/*    */   
/*    */   public String getDirMode() {
/* 49 */     return replaceVariables(replaceVariables(this.dirMode));
/*    */   }
/*    */   
/*    */   public void setDirMode(String dirMode) {
/* 53 */     this.dirMode = dirMode;
/*    */   }
/*    */   
/*    */   public ScriptProperty getFileFilter() {
/* 57 */     return (ScriptProperty)replaceWithTextOverride("fileFilter", this.fileFilter, ScriptProperty.class);
/*    */   }
/*    */   
/*    */   public void setFileFilter(ScriptProperty fileFilter) {
/* 61 */     this.fileFilter = fileFilter;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isShowFileNames() {
/* 66 */     return replaceWithTextOverride("showFileNames", this.showFileNames);
/*    */   }
/*    */   
/*    */   public void setShowFileNames(boolean showFileNames) {
/* 70 */     this.showFileNames = showFileNames;
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean passesFileFilter(String entryName, Context context) {
/* 75 */     return matchesFileFilter(entryName, context, getFileFilter());
/*    */   }
/*    */ 
/*    */   
/*    */   protected void directoryCreated(File destFile) {
/* 80 */     if (!InstallerUtil.isWindows()) {
/* 81 */       UnixFileSystem.setMode(getDirMode(), destFile);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   protected File getTargetDirectory(Context context) {
/* 87 */     return resolveRelativeFile(getDestinationDirectory(), getDestinationRoot(), context);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\AbstractExtractZipFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */