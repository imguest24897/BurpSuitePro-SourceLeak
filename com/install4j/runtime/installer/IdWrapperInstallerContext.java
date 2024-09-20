/*    */ package com.install4j.runtime.installer;
/*    */ import com.install4j.api.context.FileOptions;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.UninstallMode;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import java.io.File;
/*    */ 
/*    */ public class IdWrapperInstallerContext extends IdWrapperContext implements InstallerContext {
/*    */   public IdWrapperInstallerContext(InstallerContextImpl parentContext, String unqualifiedIdNamespace) {
/* 10 */     super(parentContext, unqualifiedIdNamespace);
/*    */   }
/*    */   
/*    */   protected InstallerContext getInstallerParentContext() {
/* 14 */     return (InstallerContext)getParentContext();
/*    */   }
/*    */ 
/*    */   
/*    */   public void setInstallationDirectory(File installationDirectory) {
/* 19 */     getInstallerParentContext().setInstallationDirectory(installationDirectory);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isUpdateInstallation() {
/* 24 */     return getInstallerParentContext().isUpdateInstallation();
/*    */   }
/*    */ 
/*    */   
/*    */   public File getInstallerFile() {
/* 29 */     return getInstallerParentContext().getInstallerFile();
/*    */   }
/*    */ 
/*    */   
/*    */   public String getMediaName() {
/* 34 */     return getInstallerParentContext().getMediaName();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean installFile(File sourceFile, File destFile) throws UserCanceledException {
/* 39 */     return getInstallerParentContext().installFile(sourceFile, destFile);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean installFile(File sourceFile, File destFile, FileOptions options) throws UserCanceledException {
/* 44 */     return getInstallerParentContext().installFile(sourceFile, destFile, options);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean installFile(File sourceFile, File destFile, FileOptions options, ProgressInterface progressInterface, int fromPercent, int toPercent) throws UserCanceledException {
/* 49 */     return getInstallerParentContext().installFile(sourceFile, destFile, options, progressInterface, fromPercent, toPercent);
/*    */   }
/*    */ 
/*    */   
/*    */   public void installDirectory(File directory, UninstallMode uninstallMode) {
/* 54 */     getInstallerParentContext().installDirectory(directory, uninstallMode);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerUninstallFile(File file) {
/* 59 */     getInstallerParentContext().registerUninstallFile(file);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\IdWrapperInstallerContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */