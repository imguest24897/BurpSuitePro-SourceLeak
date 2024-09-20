/*    */ package com.install4j.runtime.beans.actions.finish;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.LauncherSetup;
/*    */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*    */ import com.install4j.runtime.installer.InstallerContextImpl;
/*    */ import com.install4j.runtime.installer.config.InstallerConfig;
/*    */ import com.install4j.runtime.installer.config.MacSpecificConfig;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*    */ import com.install4j.runtime.installer.helper.content.ContentInstaller;
/*    */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*    */ import com.install4j.runtime.installer.platform.macos.MacFileSystem;
/*    */ import java.io.File;
/*    */ 
/*    */ public class ExecuteLauncherAction
/*    */   extends SystemInstallOrUninstallAction {
/* 21 */   private String launcherId = "";
/*    */   private String[] arguments;
/*    */   
/*    */   public String getLauncherId() {
/* 25 */     return replaceVariables(this.launcherId);
/*    */   }
/*    */   
/*    */   public void setLauncherId(String launcherId) {
/* 29 */     this.launcherId = launcherId;
/*    */   }
/*    */   
/*    */   public String[] getArguments() {
/* 33 */     return (String[])replaceWithTextOverride("arguments", replaceVariables(this.arguments), String[].class);
/*    */   }
/*    */   
/*    */   public void setArguments(String[] arguments) {
/* 37 */     this.arguments = arguments;
/*    */   }
/*    */   
/*    */   public boolean execute(Context context) {
/*    */     final File launcherFile;
/* 42 */     LauncherSetup launcher = context.getLauncherById(getLauncherId());
/* 43 */     if (launcher == null) {
/* 44 */       return false;
/*    */     }
/*    */ 
/*    */     
/* 48 */     MacSpecificConfig macSpecificConfig = InstallerConfig.getCurrentInstance().getMacSpecificConfig();
/* 49 */     if (Util.isMacosInstaller() && macSpecificConfig.isSingleBundle()) {
/* 50 */       launcherFile = context.getDestinationFile(macSpecificConfig.getSingleBundleName());
/*    */     } else {
/* 52 */       launcherFile = context.getDestinationFile(new File(replaceVariables(launcher.getRelativeFileName())));
/*    */     } 
/*    */     
/* 55 */     final String[] arguments = getArguments();
/* 56 */     if (InstallerConfig.isInstaller() && Util.isMacosInstaller() && InstallerConfig.getCurrentInstance().getMacSpecificConfig().isSingleBundle()) {
/* 57 */       Util.logInfo(this, "Deferring execution of launcher for single bundle installer");
/* 58 */       final ExecutionContext executionContext = HelperCommunication.getInstance().isElevatedHelper() ? ExecutionContext.ELEVATED : ExecutionContext.UNELEVATED;
/* 59 */       HelperCommunication.getInstance().executeAction(ContentInstaller.getExecutionContext(), (CommunicationAction)new RunAction()
/*    */           {
/*    */             protected void run(Context context) {
/* 62 */               ExecuteLauncherAction.registerSingleBundleExecutableLauncher(launcherFile, arguments, executionContext);
/*    */             }
/*    */           });
/* 65 */       return true;
/*    */     } 
/* 67 */     return launch(launcherFile, arguments, ExecutionContext.SAME);
/*    */   }
/*    */ 
/*    */   
/*    */   private static void registerSingleBundleExecutableLauncher(File launcherFile, String[] arguments, ExecutionContext executionContext) {
/* 72 */     InstallerContextImpl.registerAfterFinishAction(() -> {
/*    */           MacFileSystem.notifyBundleChange(launcherFile);
/*    */           launch(launcherFile, arguments, executionContext);
/*    */         });
/*    */   }
/*    */   
/*    */   private static boolean launch(File launcherFile, String[] arguments, ExecutionContext executionContext) {
/* 79 */     Util.logInfo(null, "Launching " + launcherFile);
/* 80 */     return LaunchHelper.launchFinishExecutable(launcherFile, arguments, launcherFile.getParentFile(), executionContext);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isRollbackSupported() {
/* 85 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\finish\ExecuteLauncherAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */