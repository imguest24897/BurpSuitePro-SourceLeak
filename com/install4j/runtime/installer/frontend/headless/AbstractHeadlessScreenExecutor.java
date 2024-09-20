/*     */ package com.install4j.runtime.installer.frontend.headless;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.DummyWizardContext;
/*     */ import com.install4j.runtime.installer.WizardContextInt;
/*     */ import com.install4j.runtime.installer.config.ScreenBeanConfig;
/*     */ import com.install4j.runtime.installer.controller.CommandSink;
/*     */ import com.install4j.runtime.installer.controller.ControllerCommand;
/*     */ import com.install4j.runtime.installer.controller.FinishCommand;
/*     */ import com.install4j.runtime.installer.controller.GoForwardCommand;
/*     */ import com.install4j.runtime.installer.controller.ScreenExecutor;
/*     */ import com.install4j.runtime.installer.frontend.FormPanel;
/*     */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.console.ConsoleImpl;
/*     */ import com.install4j.runtime.installer.helper.versionspecific.VersionSpecificHelper;
/*     */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*     */ import java.io.File;
/*     */ import java.io.FileDescriptor;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.lang.reflect.Field;
/*     */ import java.net.InetAddress;
/*     */ import java.security.AllPermission;
/*     */ import java.security.CodeSource;
/*     */ import java.security.Permission;
/*     */ import java.security.PermissionCollection;
/*     */ import java.security.Permissions;
/*     */ import java.security.Policy;
/*     */ import java.security.ProtectionDomain;
/*     */ import java.util.Collections;
/*     */ import javax.swing.JEditorPane;
/*     */ 
/*     */ public abstract class AbstractHeadlessScreenExecutor implements ScreenExecutor {
/*     */   public static boolean isExitCalled() {
/*  41 */     return exitCalled;
/*     */   }
/*     */   
/*     */   public static final String EMPTY_FONT_FILE_NAME = "i4jempty.ttf";
/*     */   private static volatile boolean exitCalled = false;
/*     */   private CommandSink commandSink;
/*     */   private ContextImpl contextImpl;
/*     */   private WizardContextInt dummyWizardContext;
/*     */   private boolean fileInstallerProgressInterfaceSet;
/*     */   
/*     */   public AbstractHeadlessScreenExecutor() {
/*  52 */     this.dummyWizardContext = (WizardContextInt)createWizardContext();
/*  53 */     this.contextImpl = createContext();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected DummyWizardContext createWizardContext() {
/*  60 */     return new DummyWizardContext();
/*     */   }
/*     */   
/*     */   protected void init(boolean headless) {
/*  64 */     if (headless) {
/*  65 */       InstallerUtil.setHeadlessProperty();
/*     */     }
/*     */     
/*  68 */     Policy.setPolicy(new AllowAllPolicy());
/*  69 */     VersionSpecificHelper.setSecurityManager(new CheckExitSecurityManager());
/*     */     
/*  71 */     if (!InstallerUtil.isInProcess()) {
/*  72 */       Runtime.getRuntime().addShutdownHook(new Thread("shutdown hook")
/*     */           {
/*     */             public void run() {
/*  75 */               if (!AbstractHeadlessScreenExecutor.exitCalled && AbstractHeadlessScreenExecutor.this.commandSink != null) {
/*  76 */                 AbstractHeadlessScreenExecutor.this.cancelImmediately();
/*     */               }
/*     */             }
/*     */           });
/*     */     }
/*     */     
/*  82 */     if (!HelperCommunication.getInstance().isElevatedHelper()) {
/*  83 */       GUIHelper.invokeOnEDT(() -> {
/*     */             if (!Util.isMacOS() && !Util.isWindows()) {
/*     */               initFontManager();
/*     */             }
/*     */             new FormPanel(Collections.emptyList(), (Context)getContext(), null, null);
/*     */             createEditorPane();
/*     */           });
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void execute(ScreenBeanConfig screenConfig, CommandSink commandSink, boolean previousPossible, ControllerCommand lastCommand) {
/*  97 */     setCommandSink(commandSink);
/*  98 */     if (!this.fileInstallerProgressInterfaceSet) {
/*  99 */       FileInstaller.getInstance().setDefaultProgressInterface(getProgressInterface());
/* 100 */       this.fileInstallerProgressInterfaceSet = true;
/*     */     } 
/*     */     try {
/* 103 */       ControllerCommand specialCommand = handleScreen(screenConfig);
/* 104 */       if (specialCommand != null) {
/* 105 */         commandSink.returnToController(specialCommand);
/*     */       } else {
/* 107 */         commandSink.returnToController((ControllerCommand)new GoForwardCommand(1, true, true, null));
/*     */       } 
/* 109 */     } catch (UserCanceledException e) {
/* 110 */       commandSink.returnToController(ControllerCommand.CANCEL);
/* 111 */     } catch (Throwable e) {
/* 112 */       getContext().handleCriticalException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCommandSink(CommandSink commandSink) {
/* 118 */     this.commandSink = commandSink;
/*     */   }
/*     */ 
/*     */   
/*     */   public void cancelImmediately() {
/* 123 */     ConsoleImpl.getInstance().cancel();
/* 124 */     ContextImpl.setCancelling();
/* 125 */     this.commandSink.returnToController(ControllerCommand.CANCEL);
/* 126 */     this.commandSink.waitForFinish();
/*     */   }
/*     */ 
/*     */   
/*     */   public CommandSink getCommandSink() {
/* 131 */     return this.commandSink;
/*     */   }
/*     */ 
/*     */   
/*     */   public ProgressInterface getDefaultProgressInterface() {
/* 136 */     return getProgressInterface();
/*     */   }
/*     */ 
/*     */   
/*     */   public WizardContextInt getWizardContext() {
/* 141 */     return this.dummyWizardContext;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRollback() {
/* 146 */     getProgressInterface().setStatusMessage(Messages.getString(".StatusRollback"));
/*     */   }
/*     */   
/*     */   protected ControllerCommand runValidationScript(ScreenBeanConfig screenConfig, Screen screen, Object... scriptParameters) {
/*     */     ControllerCommand storedCommand;
/*     */     boolean validated;
/* 152 */     getCommandSink().startStoreCommand();
/*     */     try {
/* 154 */       validated = getContext().runBooleanScript(screenConfig.getValidationClassName(), (Bean)screen, scriptParameters);
/*     */     } finally {
/* 156 */       storedCommand = getCommandSink().finishStoreCommand();
/*     */     } 
/* 158 */     if (storedCommand != null)
/* 159 */       return storedCommand; 
/* 160 */     if (!validated)
/* 161 */       return ControllerCommand.CANCEL; 
/* 162 */     if (screenConfig.isFinishScreen()) {
/* 163 */       return (ControllerCommand)new FinishCommand(null);
/*     */     }
/* 165 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void closeWindows() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public ActionCallback getActionCallback() {
/* 175 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void register(Screen screen, ScreenBeanConfig config) {
/* 180 */     getContext().applyToScreen(screen, config);
/*     */   }
/*     */ 
/*     */   
/*     */   public ContextImpl getContext() {
/* 185 */     return this.contextImpl;
/*     */   }
/*     */   
/*     */   public void initializeLazilyLoadedScreens() {}
/*     */   
/*     */   private static class AllowAllPolicy
/*     */     extends Policy {
/*     */     private AllowAllPolicy() {}
/*     */     
/*     */     public PermissionCollection getPermissions(CodeSource codesource) {
/* 195 */       Permissions permission = new Permissions();
/* 196 */       permission.add(new AllPermission());
/* 197 */       return permission;
/*     */     }
/*     */ 
/*     */     
/*     */     public PermissionCollection getPermissions(ProtectionDomain domain) {
/* 202 */       Permissions permission = new Permissions();
/* 203 */       permission.add(new AllPermission());
/* 204 */       return permission;
/*     */     }
/*     */ 
/*     */     
/*     */     public void refresh() {}
/*     */   }
/*     */ 
/*     */   
/*     */   private static class CheckExitSecurityManager
/*     */     extends SecurityManager
/*     */   {
/*     */     private CheckExitSecurityManager() {}
/*     */ 
/*     */     
/*     */     public void checkPermission(Permission perm) {}
/*     */ 
/*     */     
/*     */     public void checkPermission(Permission perm, Object context) {}
/*     */ 
/*     */     
/*     */     public void checkCreateClassLoader() {}
/*     */     
/*     */     public void checkAccess(Thread t) {}
/*     */     
/*     */     public void checkAccess(ThreadGroup g) {}
/*     */     
/*     */     public void checkExit(int status) {
/* 231 */       AbstractHeadlessScreenExecutor.exitCalled = true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void checkExec(String cmd) {}
/*     */ 
/*     */     
/*     */     public void checkLink(String lib) {}
/*     */ 
/*     */     
/*     */     public void checkRead(FileDescriptor fd) {}
/*     */ 
/*     */     
/*     */     public void checkRead(String file) {}
/*     */ 
/*     */     
/*     */     public void checkRead(String file, Object context) {}
/*     */ 
/*     */     
/*     */     public void checkWrite(FileDescriptor fd) {}
/*     */ 
/*     */     
/*     */     public void checkWrite(String file) {}
/*     */ 
/*     */     
/*     */     public void checkDelete(String file) {}
/*     */ 
/*     */     
/*     */     public void checkConnect(String host, int port) {}
/*     */ 
/*     */     
/*     */     public void checkConnect(String host, int port, Object context) {}
/*     */ 
/*     */     
/*     */     public void checkListen(int port) {}
/*     */ 
/*     */     
/*     */     public void checkAccept(String host, int port) {}
/*     */ 
/*     */     
/*     */     public void checkMulticast(InetAddress inetAddress) {}
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     public void checkMulticast(InetAddress inetAddress, byte ttl) {}
/*     */ 
/*     */     
/*     */     public void checkPropertiesAccess() {}
/*     */ 
/*     */     
/*     */     public void checkPropertyAccess(String key) {}
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     public boolean checkTopLevelWindow(Object window) {
/* 286 */       return true;
/*     */     }
/*     */ 
/*     */     
/*     */     public void checkPrintJobAccess() {}
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     public void checkSystemClipboardAccess() {}
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     public void checkAwtEventQueueAccess() {}
/*     */ 
/*     */     
/*     */     public void checkPackageAccess(String pkg) {}
/*     */ 
/*     */     
/*     */     public void checkPackageDefinition(String pkg) {}
/*     */ 
/*     */     
/*     */     public void checkSetFactory() {}
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     public void checkMemberAccess(Class clazz, int which) {}
/*     */ 
/*     */     
/*     */     public void checkSecurityAccess(String target) {}
/*     */   }
/*     */ 
/*     */   
/*     */   private static void initFontManager() {
/* 319 */     writeFontConfig();
/* 320 */     createEditorPane();
/*     */   }
/*     */ 
/*     */   
/*     */   private static void writeFontConfig() {
/* 325 */     File fontFile = InstallerUtil.getInstallerFile("i4jempty.ttf");
/* 326 */     if (fontFile.isFile()) {
/*     */       try {
/* 328 */         File tempFile = File.createTempFile("i4jfont", ".properties");
/* 329 */         tempFile.deleteOnExit();
/* 330 */         FileOutputStream out = new FileOutputStream(tempFile); 
/* 331 */         try { String fontConfigContent = "Version=1\nsequence.allfonts=i4jempty\nsequence.fallback=i4jempty\nallfonts.i4jempty=i4jempty\nfilename.i4jempty=" + fontFile + "\n";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 337 */           out.write(fontConfigContent.getBytes());
/* 338 */           out.close(); } catch (Throwable throwable) { try { out.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/* 339 */          System.setProperty("sun.awt.fontconfig", tempFile.getAbsolutePath());
/* 340 */       } catch (IOException e) {
/* 341 */         e.printStackTrace();
/*     */       } 
/*     */       
/* 344 */       if (!LauncherUtil.isJava9Plus()) {
/*     */         
/*     */         try {
/*     */ 
/*     */           
/* 349 */           Field instanceField = FontUtilities.class.getDeclaredField("isOpenJDK");
/* 350 */           instanceField.set(null, Boolean.FALSE);
/* 351 */         } catch (Throwable throwable) {}
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void createEditorPane() {
/* 360 */     new JEditorPane("text/plain", "init text");
/*     */   }
/*     */   
/*     */   protected abstract ContextImpl createContext();
/*     */   
/*     */   protected abstract ControllerCommand handleScreen(ScreenBeanConfig paramScreenBeanConfig) throws UserCanceledException;
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\headless\AbstractHeadlessScreenExecutor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */