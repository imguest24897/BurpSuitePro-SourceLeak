/*     */ package com.install4j.runtime.beans.actions.files;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.beans.ActionList;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.ProgressAdapterContext;
/*     */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.zip.ZipEntry;
/*     */ 
/*     */ public class ModifyZipFileAction
/*     */   extends AbstractZipFileAction {
/*     */   private ActionList actionList;
/*  22 */   private ZipMethod newFileMethod = ZipMethod.DEFLATED;
/*     */   
/*     */   private File tempDir;
/*  25 */   private Map<File, Integer> fileToMethod = new HashMap<>();
/*     */ 
/*     */   
/*     */   public ActionList getActionList() {
/*  29 */     return (ActionList)replaceWithTextOverride("actionList", this.actionList, ActionList.class);
/*     */   }
/*     */   
/*     */   public void setActionList(ActionList actionList) {
/*  33 */     this.actionList = actionList;
/*     */   }
/*     */   
/*     */   public ZipMethod getNewFileMethod() {
/*  37 */     return (ZipMethod)replaceWithTextOverride("newFileMethod", this.newFileMethod, ZipMethod.class);
/*     */   }
/*     */   
/*     */   public void setNewFileMethod(ZipMethod newFileMethod) {
/*  41 */     this.newFileMethod = newFileMethod;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void saveInfo(File destFile, ZipEntry zipEntry) {
/*  46 */     this.fileToMethod.put(destFile, Integer.valueOf(zipEntry.getMethod()));
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean zipActions(Context context, File usedSourceFile) throws IOException, UserCanceledException {
/*  51 */     if (getActionList() == null) {
/*  52 */       Logger.getInstance().log(this, "Nothing to do because no modification actions are configured.", true);
/*  53 */       return true;
/*     */     } 
/*     */     
/*  56 */     this.tempDir = File.createTempFile("install4j", "dir");
/*  57 */     this.tempDir.delete();
/*  58 */     if (!this.tempDir.mkdir()) {
/*  59 */       throw new IOException("Could not create temporary directory " + this.tempDir);
/*     */     }
/*     */     
/*  62 */     if (context instanceof InstallerContext && !isSuppressRollback()) {
/*  63 */       BackupFileForRollbackAction backupFileForRollbackAction = new BackupFileForRollbackAction(usedSourceFile, false, false, false);
/*  64 */       backupFileForRollbackAction.install((InstallerContext)context);
/*  65 */       addRollbackAction((InstallAction)backupFileForRollbackAction);
/*     */     } 
/*     */     try {
/*  68 */       return (super.zipActions(context, usedSourceFile) && 
/*  69 */         executeActionList(context) && 
/*  70 */         createZipFile(context));
/*     */     } finally {
/*  72 */       FileUtil.deleteDirectory(this.tempDir);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean executeActionList(Context context) throws UserCanceledException {
/*  77 */     overrideVariable("sys.overriddenTargetDir", this.tempDir, context);
/*  78 */     overrideVariable("sys.actionSuppressRollback", Boolean.valueOf(true), context);
/*     */     try {
/*  80 */       return executeActionListSync(getActionList(), new Object[0]);
/*     */     } finally {
/*  82 */       restoreVariables(context);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean createZipFile(Context context) throws UserCanceledException {
/*  87 */     CreateZipFileAction createZipFileAction = new CreateZipFileAction(this.fileToMethod);
/*  88 */     createZipFileAction.setZipFile(getZipFile());
/*  89 */     createZipFileAction.setFiles(new File[] { this.tempDir });
/*  90 */     createZipFileAction.setShowProgress(isShowProgress());
/*  91 */     createZipFileAction.setShowFileNames(false);
/*  92 */     createZipFileAction.setMethod(getNewFileMethod());
/*     */     
/*  94 */     ProgressAdapter progressAdapter = new ProgressAdapter(context.getProgressInterface(), getExtractionPercent(), 100);
/*  95 */     return createZipFileAction.execute((Context)new ProgressAdapterContext(context, (ProgressInterface)progressAdapter));
/*     */   }
/*     */ 
/*     */   
/*     */   protected File getTargetDirectory(Context context) {
/* 100 */     return this.tempDir;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean passesFileFilter(String entryName, Context context) {
/* 105 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   protected int getExtractionPercent() {
/* 110 */     return 50;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isShowFileNames() {
/* 115 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\ModifyZipFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */