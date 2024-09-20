/*    */ package com.install4j.runtime.installer;
/*    */ 
/*    */ import com.install4j.api.Util;
/*    */ import com.install4j.runtime.beans.applications.ExecutionMode;
/*    */ import com.install4j.runtime.installer.config.InstallerConfig;
/*    */ import com.install4j.runtime.installer.controller.Controller;
/*    */ import com.install4j.runtime.installer.controller.ScreenExecutor;
/*    */ import com.install4j.runtime.installer.frontend.Messages;
/*    */ import com.install4j.runtime.installer.frontend.UninstallerWizardScreenExecutor;
/*    */ import com.install4j.runtime.installer.frontend.headless.UninstallerConsoleScreenExecutor;
/*    */ import com.install4j.runtime.installer.frontend.headless.UninstallerUnattendedScreenExecutor;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import com.install4j.runtime.installer.helper.MsiHelper;
/*    */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*    */ import javax.swing.SwingUtilities;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Uninstaller
/*    */ {
/*    */   public static void main(String[] args) {
/* 26 */     if (!HelperCommunication.executeAsHelper(args)) {
/*    */       try {
/* 28 */         InstallerUtil.setInProcess(false);
/* 29 */         runInProcess(args);
/* 30 */       } catch (Throwable t) {
/* 31 */         InstallerUtil.reportException(t);
/* 32 */         System.exit(1);
/*    */       } 
/*    */     }
/*    */   }
/*    */   
/*    */   private static void runInProcess(String[] args) {
/* 38 */     InstallerConfig.setCurrentApplicationId("uninstaller");
/* 39 */     ScreenExecutor screenExecutor = getScreenExecutor(args);
/* 40 */     if (MsiHelper.isMsiStartMsiMatch() && !Boolean.getBoolean("install4j.allowNoMsi") && !Boolean.getBoolean("install4j.upgradeUninstall")) {
/* 41 */       Util.showErrorMessage(Messages.getString(".MsiUninstallerMismatch"));
/* 42 */       System.exit(1);
/*    */     } 
/* 44 */     (new Controller(screenExecutor)).start();
/*    */   }
/*    */   private static ScreenExecutor getScreenExecutor(String[] args) {
/*    */     ScreenExecutor screenExecutor;
/* 48 */     InstallerUtil.CommandLineOptions commandLineOptions = InstallerUtil.parseCommandLine(args);
/*    */     
/* 50 */     Application.initInstallationDirectory();
/*    */     
/* 52 */     ExecutionMode executionMode = InstallerUtil.getExecutionMode(commandLineOptions, true);
/*    */ 
/*    */ 
/*    */     
/* 56 */     if (executionMode == ExecutionMode.UNATTENDED || executionMode == ExecutionMode.UNATTENDED_WITH_PROGRESS) {
/*    */       
/* 58 */       InstallerUtil.setUnattended(true);
/* 59 */       UninstallerUnattendedScreenExecutor uninstallerUnattendedScreenExecutor = new UninstallerUnattendedScreenExecutor(commandLineOptions.quietOverwrite, commandLineOptions.noFileFailures, commandLineOptions.wait, InstallerUtil.getSplash(commandLineOptions, executionMode), InstallerUtil.isUnattendedAlerts(commandLineOptions, executionMode));
/* 60 */     } else if (executionMode == ExecutionMode.CONSOLE) {
/*    */       
/* 62 */       InstallerUtil.setConsole(true);
/* 63 */       UninstallerConsoleScreenExecutor uninstallerConsoleScreenExecutor = new UninstallerConsoleScreenExecutor();
/*    */     } else {
/* 65 */       ScreenExecutor[] screenExecutors = new ScreenExecutor[1];
/*    */       try {
/* 67 */         SwingUtilities.invokeAndWait(() -> screenExecutors[0] = (ScreenExecutor)new UninstallerWizardScreenExecutor());
/* 68 */       } catch (InterruptedException|java.lang.reflect.InvocationTargetException e) {
/* 69 */         throw new RuntimeException(e);
/*    */       } 
/* 71 */       screenExecutor = screenExecutors[0];
/*    */     } 
/*    */ 
/*    */     
/* 75 */     InstallerVariables.initCommandLine(commandLineOptions.varFileName, commandLineOptions.commandLineVars);
/* 76 */     return screenExecutor;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\Uninstaller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */