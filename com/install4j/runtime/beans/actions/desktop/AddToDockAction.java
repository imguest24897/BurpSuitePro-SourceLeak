/*     */ package com.install4j.runtime.beans.actions.desktop;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.actions.AutoUninstallAction;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UninstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallAction;
/*     */ import com.install4j.runtime.installer.InstallerContextImpl;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.platform.macos.PlistHelper;
/*     */ import com.install4j.runtime.installer.platform.unix.Execution;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.net.MalformedURLException;
/*     */ import java.util.Properties;
/*     */ 
/*     */ public class AddToDockAction
/*     */   extends SystemInstallAction implements AutoUninstallAction {
/*  27 */   private Properties persistentProperties = new Properties();
/*     */   
/*     */   private File executable;
/*     */   
/*     */   private static final String PROPNAME_EXECUTABLE = "executable";
/*     */   
/*     */   private static final String PLIST_NAME = "com.apple.dock";
/*     */   
/*     */   private static final String ARRAY_NAME = "persistent-apps";
/*     */   
/*     */   private static final String TILE_DATA_KEY = "tile-data";
/*     */   private static final String FILE_DATA_KEY = "file-data";
/*     */   private static final String CF_URL_STRING_KEY = "_CFURLString";
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*  42 */     if (InstallerUtil.isMacOS()) {
/*  43 */       File destinationFile = context.getDestinationFile(getExecutable());
/*  44 */       final String fileName = destinationFile.getAbsolutePath() + "/";
/*  45 */       doRollback(fileName);
/*  46 */       String fileUrl = getFileUrl(destinationFile);
/*  47 */       String label = destinationFile.getName();
/*  48 */       if (label.endsWith(".app")) label = label.substring(0, label.length() - 4);
/*     */ 
/*     */       
/*  51 */       final Object[][] dict = { { "tile-data", "tile-type" }, { { { "dock-extra", "file-data", "file-label" }, { Boolean.FALSE, { { "_CFURLString", "_CFURLStringType" }, { fileUrl, Integer.valueOf(15) } }, label } }, "file-tile" } };
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  56 */       final Properties persistentProperties = getPersistentProperties();
/*  57 */       if (Util.isMacosInstaller() && InstallerConfig.getCurrentInstance().getMacSpecificConfig().isSingleBundle())
/*  58 */       { InstallerContextImpl.registerAfterFinishAction(() -> HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */               {
/*     */                 protected void run(Context context) throws Exception {
/*  61 */                   AddToDockAction.addToPlist(fileName, dict, persistentProperties);
/*     */                 }
/*     */               })); }
/*     */       
/*  65 */       else if (!addToPlist(fileName, dict, persistentProperties)) { return false; }
/*     */     
/*     */     } 
/*  68 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean addToPlist(String fileName, Object[][] dict, Properties persistentProperties) {
/*  72 */     if (PlistHelper.addToPlist("com.apple.dock", "persistent-apps", dict)) {
/*  73 */       persistentProperties.setProperty("executable", fileName);
/*  74 */       restartDock();
/*     */     } else {
/*  76 */       return false;
/*     */     } 
/*  78 */     return true;
/*     */   }
/*     */   
/*     */   private static String getFileUrl(File destinationFile) {
/*  82 */     String fileUrl = "";
/*     */     try {
/*  84 */       fileUrl = destinationFile.toURI().toURL().toString();
/*  85 */     } catch (MalformedURLException e) {
/*  86 */       Logger.getImpl().log(e);
/*     */     } 
/*  88 */     return fileUrl;
/*     */   }
/*     */   
/*     */   private static void restartDock() {
/*     */     try {
/*  93 */       Execution.executeAndWait(new String[] { "killall", "Dock" }, null);
/*  94 */     } catch (IOException e) {
/*  95 */       Logger.getInstance().log(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Properties getPersistentProperties() {
/* 101 */     return (Properties)replaceWithTextOverride("persistentProperties", this.persistentProperties, Properties.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPersistentProperties(Properties properties) {
/* 106 */     this.persistentProperties = properties;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void rollback(InstallerContext context) {
/* 112 */     if (InstallerUtil.isMacOS()) {
/* 113 */       doRollback(context.getDestinationFile(getExecutable()).getAbsolutePath() + "/");
/* 114 */       restartDock();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean uninstall(UninstallerContext context) throws UserCanceledException {
/* 120 */     if (InstallerUtil.isMacOS()) {
/* 121 */       doRollback(getPersistentProperties().getProperty("executable"));
/* 122 */       restartDock();
/*     */     } 
/* 124 */     return true;
/*     */   }
/*     */   
/*     */   private static void doRollback(final String executable) {
/* 128 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) throws Exception {
/* 131 */             if (executable != null) {
/*     */               try {
/* 133 */                 String executableUrl = AddToDockAction.getFileUrl(new File(executable)).replaceAll("file:/*", "/");
/* 134 */                 if (PlistHelper.removeElementWithChild("com.apple.dock", "persistent-apps", new String[] { "tile-data", "file-data", "_CFURLString" }, executableUrl, true) || 
/* 135 */                   PlistHelper.removeElementWithChild("com.apple.dock", "persistent-apps", new String[] { "tile-data", "file-data", "_CFURLString" }, executable, true)) {
/*     */                   
/* 137 */                   PlistHelper.flushCache();
/*     */                 } else {
/* 139 */                   Logger.getInstance().error(null, "removing not successful: " + executableUrl);
/*     */                 } 
/* 141 */               } catch (IOException e) {
/* 142 */                 Logger.getInstance().log(e);
/*     */               } 
/*     */             }
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public File getExecutable() {
/* 150 */     return (File)replaceWithTextOverride("executable", replaceVariables(this.executable), File.class);
/*     */   }
/*     */   
/*     */   public void setExecutable(File executable) {
/* 154 */     this.executable = executable;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\AddToDockAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */