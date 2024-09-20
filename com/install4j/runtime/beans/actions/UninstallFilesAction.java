/*     */ package com.install4j.runtime.beans.actions;
/*     */ import com.install4j.api.actions.AutoUninstallAction;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UninstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.AutoUninstallHandler;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.ContextIntProxy;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.Install4jClassLoader;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.MenuHelper;
/*     */ import com.install4j.runtime.installer.helper.RunningProcessChecker;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.content.JreInstaller;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.security.SecureRandom;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ public class UninstallFilesAction extends SystemInstallOrUninstallAction {
/*     */   public static final String PROPNAME_PACKAGE_UNINSTALL = "install4j.packageUninstall";
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/*  33 */     if (!(context instanceof UninstallerContext) && !Boolean.getBoolean("install4j.packageUninstall")) {
/*  34 */       Logger.getInstance().error(this, "UninstallFilesAction can only be used for uninstaller or for package pre-uninstallation.");
/*  35 */       return false;
/*     */     } 
/*     */     
/*  38 */     ServiceHandler.stopServices(context, false);
/*     */     
/*  40 */     String uninstallMessage = Messages.format(context.getMessage(".StatusUninstalling"), new Object[] { InstallerConfig.getCurrentInstance().getApplicationNameWithVersion() });
/*     */     
/*  42 */     ProgressInterface progressInterface = context.getProgressInterface();
/*  43 */     progressInterface.setDetailMessage("");
/*  44 */     progressInterface.setStatusMessage(uninstallMessage);
/*     */     
/*  46 */     if (!RunningProcessChecker.checkDefaultRunningLauncher()) {
/*  47 */       throw new UserCanceledException();
/*     */     }
/*     */     
/*  50 */     progressInterface.setDetailMessage("");
/*  51 */     progressInterface.setStatusMessage(uninstallMessage);
/*     */     
/*  53 */     if (!executeAutoUninstallActions()) {
/*  54 */       return false;
/*     */     }
/*     */     
/*  57 */     boolean uninstallForUpgrade = (context instanceof UninstallerContext && ((UninstallerContext)context).isUninstallForUpgrade());
/*  58 */     if (uninstallForUpgrade) {
/*  59 */       File responseFile = context.getDestinationFile(".install4j" + File.separator + "response.varfile");
/*  60 */       if (responseFile.isFile()) {
/*  61 */         FileInstaller.getInstance().addRetainedFile(responseFile);
/*     */       }
/*     */     } 
/*     */     
/*  65 */     progressInterface.setDetailMessage("");
/*  66 */     progressInterface.setStatusMessage(uninstallMessage);
/*     */     
/*  68 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/*     */     
/*  70 */     preloadClasses();
/*     */     
/*  72 */     InstallRegistry.unregisterApplication(config.getApplicationId(), context.getInstallationDirectory());
/*     */     
/*  74 */     JreInstaller.getInstance().prepareUninstall(context, uninstallForUpgrade);
/*     */     
/*  76 */     FileInstaller fileInstaller = FileInstaller.getInstance();
/*     */     try {
/*  78 */       for (String fileName : config.getUninstallDeleteEntries()) {
/*  79 */         fileInstaller.deleteFile(context.getDestinationFile(fileName));
/*     */       }
/*  81 */       fileInstaller.uninstall(uninstallForUpgrade, context.getInstallationDirectory());
/*     */     }
/*  83 */     catch (IOException e) {
/*  84 */       context.handleCriticalException(e);
/*     */     } 
/*     */ 
/*     */     
/*  88 */     if (!InstallerUtil.isWindows() && !InstallerUtil.isMacOS()) {
/*     */       try {
/*  90 */         Runtime.getRuntime().exec("kbuildsycoca");
/*  91 */         MenuHelper.updateDesktopDatabase();
/*  92 */       } catch (IOException iOException) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  97 */     if (InstallerUtil.isMacOS()) {
/*     */       try {
/*  99 */         Thread.sleep(1000L);
/* 100 */       } catch (InterruptedException e) {
/* 101 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */     
/* 105 */     return true;
/*     */   }
/*     */   
/*     */   private static void preloadClasses() {
/*     */     try {
/* 110 */       Install4jClassLoader.getInstance().loadClass("com.install4j.script.I4jScript_Internal_0");
/* 111 */     } catch (Throwable e) {
/* 112 */       Logger.getInstance().log(e);
/*     */     } 
/*     */     try {
/* 115 */       new SecureRandom();
/* 116 */     } catch (Throwable e) {
/* 117 */       Logger.getInstance().log(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean executeAutoUninstallActions() {
/* 122 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.MAXIMUM, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws Exception {
/*     */             try {
/*     */               UninstallerContext uninstallerContext;
/* 127 */               if (context instanceof UninstallerContext) {
/* 128 */                 uninstallerContext = (UninstallerContext)context;
/*     */               } else {
/* 130 */                 uninstallerContext = new UninstallFilesAction.UninstallerContextSham((ContextInt)context);
/*     */               } 
/* 132 */               if (!UninstallFilesAction.executeAutoUninstallActions(uninstallerContext)) {
/* 133 */                 return false;
/*     */               }
/* 135 */             } catch (IOException e) {
/* 136 */               Logger.getInstance().log(e);
/*     */             } 
/* 138 */             return true;
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static boolean executeAutoUninstallActions(UninstallerContext context, List<AutoUninstallAction> autoUninstallActions, List<AutoUninstallAction> retainedActions) {
/* 144 */     for (AutoUninstallAction autoUninstallAction : autoUninstallActions) {
/* 145 */       Logger.getInstance().info(autoUninstallAction, "executing auto uninstall");
/*     */       try {
/* 147 */         if (!autoUninstallAction.uninstall(context)) {
/* 148 */           Logger.getInstance().error(autoUninstallAction, "auto-uninstall action failed");
/*     */         }
/* 150 */       } catch (AutoUninstallNotPerformedException e) {
/* 151 */         retainedActions.add(autoUninstallAction);
/* 152 */       } catch (UserCanceledException e) {
/* 153 */         return false;
/* 154 */       } catch (Throwable t) {
/* 155 */         Logger.getInstance().error(autoUninstallAction, "auto-uninstall action exception:");
/* 156 */         Logger.getInstance().log(t);
/*     */       } 
/*     */     } 
/* 159 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean executeAutoUninstallActions(UninstallerContext context) throws IOException {
/* 163 */     File runtimeDirectory = context.getDestinationFile(".install4j");
/* 164 */     List<Integer> autoUninstallFileNumbers = AutoUninstallHandler.getAutoUninstallFileNumbers(runtimeDirectory);
/* 165 */     Collections.reverse(autoUninstallFileNumbers);
/*     */     
/* 167 */     for (Iterator<Integer> iterator = autoUninstallFileNumbers.iterator(); iterator.hasNext(); ) { int number = ((Integer)iterator.next()).intValue();
/* 168 */       File autoUninstallFile = new File(runtimeDirectory, "autoUninstall." + number);
/* 169 */       List<AutoUninstallAction> autoUninstallActions = AutoUninstallHandler.getAutoUninstallActionsFromFile(autoUninstallFile);
/* 170 */       List<AutoUninstallAction> retainedActions = new ArrayList<>();
/* 171 */       if (!executeAutoUninstallActions(context, autoUninstallActions, retainedActions)) {
/* 172 */         return false;
/*     */       }
/* 174 */       if (context.isUninstallForUpgrade()) {
/* 175 */         byte[] retainedBytes = AutoUninstallHandler.getPropertyFileBytes(retainedActions);
/* 176 */         if (retainedBytes != null) {
/* 177 */           FileInstaller.getInstance().addRetainedFile(autoUninstallFile); 
/* 178 */           try { FileOutputStream outputStream = new FileOutputStream(autoUninstallFile); 
/* 179 */             try { outputStream.write(retainedBytes);
/* 180 */               outputStream.close(); } catch (Throwable throwable) { try { outputStream.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  } catch (IOException e)
/* 181 */           { Logger.getInstance().log(e); }
/*     */         
/*     */         } 
/*     */       }  }
/*     */     
/* 186 */     return true;
/*     */   }
/*     */   
/*     */   public static class UninstallerContextSham extends ContextIntProxy implements UninstallerContext {
/*     */     public UninstallerContextSham(ContextInt parentContext) {
/* 191 */       super(parentContext);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isUninstallForUpgrade() {
/* 196 */       return false;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\UninstallFilesAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */