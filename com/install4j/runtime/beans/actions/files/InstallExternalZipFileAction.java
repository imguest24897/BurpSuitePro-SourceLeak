/*    */ package com.install4j.runtime.beans.actions.files;
/*    */ import com.install4j.api.context.FileOptions;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.OverwriteMode;
/*    */ import com.install4j.api.context.UninstallMode;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*    */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.util.zip.ZipEntry;
/*    */ 
/*    */ public class InstallExternalZipFileAction extends AbstractExtractZipFileAction {
/* 15 */   private OverwriteMode overwriteMode = OverwriteMode.ALWAYS_ASK_EXCEPT_FOR_UPDATE;
/*    */   private boolean shared = false;
/* 17 */   private UninstallMode uninstallMode = UninstallMode.IF_CREATED;
/*    */   
/*    */   private boolean delay = false;
/*    */   
/*    */   private boolean triggerReboot = true;
/*    */   private transient FileInstaller fileInstaller;
/*    */   
/*    */   public boolean isDelay() {
/* 25 */     return replaceWithTextOverride("delay", this.delay);
/*    */   }
/*    */   
/*    */   public void setDelay(boolean delay) {
/* 29 */     this.delay = delay;
/*    */   }
/*    */   
/*    */   public boolean isTriggerReboot() {
/* 33 */     return replaceWithTextOverride("triggerReboot", this.triggerReboot);
/*    */   }
/*    */   
/*    */   public void setTriggerReboot(boolean triggerReboot) {
/* 37 */     this.triggerReboot = triggerReboot;
/*    */   }
/*    */   
/*    */   public OverwriteMode getOverwriteMode() {
/* 41 */     return (OverwriteMode)replaceWithTextOverride("overwriteMode", this.overwriteMode, OverwriteMode.class);
/*    */   }
/*    */   
/*    */   public void setOverwriteMode(OverwriteMode overwriteMode) {
/* 45 */     this.overwriteMode = overwriteMode;
/*    */   }
/*    */   
/*    */   public boolean isShared() {
/* 49 */     return replaceWithTextOverride("shared", this.shared);
/*    */   }
/*    */   
/*    */   public void setShared(boolean shared) {
/* 53 */     this.shared = shared;
/*    */   }
/*    */   
/*    */   public UninstallMode getUninstallMode() {
/* 57 */     return (UninstallMode)replaceWithTextOverride("uninstallMode", this.uninstallMode, UninstallMode.class);
/*    */   }
/*    */   
/*    */   public void setUninstallMode(UninstallMode uninstallMode) {
/* 61 */     this.uninstallMode = uninstallMode;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean install(InstallerContext context) throws UserCanceledException {
/* 66 */     this.fileInstaller = FileInstaller.getInstance();
/* 67 */     this.fileInstaller.resetCurrentRebootRequired();
/*    */     
/*    */     try {
/* 70 */       return super.install(context);
/*    */     } finally {
/* 72 */       if (isTriggerReboot() && isDelay() && this.fileInstaller.isCurrentRebootRequired()) {
/* 73 */         context.triggerReboot(true);
/*    */       }
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean uninstall(UninstallerContext context) throws UserCanceledException {
/* 80 */     Logger.getInstance().error(this, "This action does not work in an uninstaller");
/* 81 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void createFile(File destFile, InputStream zipIn, ZipEntry zipEntry, long currentSize, ProgressAdapter progressAdapter) throws UserCanceledException, IOException {
/* 86 */     FileOptions fileOptions = new FileOptions(zipEntry.getTime(), getMode(), getOverwriteMode(), isShared(), isDelay(), getUninstallMode());
/* 87 */     this.fileInstaller.install(zipIn, destFile, fileOptions, (ProgressInterface)progressAdapter, currentSize, false);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void createDirectory(File directory) throws IOException {
/* 92 */     this.fileInstaller.createDirectory(directory, getUninstallMode());
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\files\InstallExternalZipFileAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */