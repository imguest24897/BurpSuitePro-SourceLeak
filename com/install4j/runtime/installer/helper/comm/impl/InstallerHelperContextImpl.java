/*    */ package com.install4j.runtime.installer.helper.comm.impl;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.FileOptions;
/*    */ import com.install4j.api.context.InstallerContext;
/*    */ import com.install4j.api.context.ProgressInterface;
/*    */ import com.install4j.api.context.UninstallMode;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.FetchStringAction;
/*    */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*    */ import java.io.File;
/*    */ 
/*    */ public class InstallerHelperContextImpl extends HelperContextImpl implements InstallerContext {
/*    */   public void setInstallationDirectory(final File installationDirectory) {
/* 18 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*    */         {
/*    */           protected void run(Context context) {
/* 21 */             ((InstallerContext)context).setInstallationDirectory(installationDirectory);
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public File getAdditionalUserJarsDir() {
/* 28 */     return (File)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*    */         {
/*    */           protected File fetchValue(Context context) throws UserCanceledException {
/* 31 */             return ContextImpl.getContextInt(context).getAdditionalUserJarsDir();
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isUpdateInstallation() {
/* 39 */     return this.helperCommunication.fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*    */         {
/*    */           protected boolean fetchValue(Context context) throws UserCanceledException {
/* 42 */             return ((InstallerContext)context).isUpdateInstallation();
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public File getInstallerFile() {
/* 49 */     return (File)this.helperCommunication.fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*    */         {
/*    */           protected File fetchValue(Context context) throws UserCanceledException {
/* 52 */             return ((InstallerContext)context).getInstallerFile();
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public String getMediaName() {
/* 59 */     return this.helperCommunication.fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*    */         {
/*    */           protected String fetchValue(Context context) throws UserCanceledException {
/* 62 */             return ((InstallerContext)context).getMediaName();
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean installFile(File sourceFile, File destFile) throws UserCanceledException {
/* 69 */     return FileInstaller.getInstance().install(sourceFile, destFile);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean installFile(File sourceFile, File destFile, FileOptions options) throws UserCanceledException {
/* 74 */     return FileInstaller.getInstance().install(sourceFile, destFile, options);
/*    */   }
/*    */ 
/*    */   
/*    */   public void registerUninstallFile(File file) {
/* 79 */     FileInstaller.getInstance().registerUninstallFile(file);
/*    */   }
/*    */   
/*    */   public boolean installFile(File sourceFile, File destFile, FileOptions options, ProgressInterface progressInterface, int fromPercent, int toPercent) throws UserCanceledException {
/*    */     ProgressAdapter progressAdapter;
/* 84 */     if (progressInterface != null) {
/* 85 */       progressAdapter = new ProgressAdapter(progressInterface, fromPercent, toPercent);
/*    */     }
/*    */     
/* 88 */     return FileInstaller.getInstance().install(sourceFile, destFile, options, (ProgressInterface)progressAdapter);
/*    */   }
/*    */ 
/*    */   
/*    */   public void installDirectory(File directory, UninstallMode uninstallMode) {
/* 93 */     FileInstaller.getInstance().createDirectory(directory, uninstallMode);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\impl\InstallerHelperContextImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */