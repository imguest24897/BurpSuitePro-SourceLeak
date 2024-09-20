/*     */ package com.install4j.runtime.installer;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UninstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.api.screens.UninstallerScreen;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.runtime.installer.config.AbstractBeanConfig;
/*     */ import com.install4j.runtime.installer.config.ActionBeanConfig;
/*     */ import com.install4j.runtime.installer.config.ScreenBeanConfig;
/*     */ import com.install4j.runtime.installer.controller.ScreenExecutor;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.MsiHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import java.io.File;
/*     */ import java.io.ObjectStreamException;
/*     */ import java.io.Serializable;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ 
/*     */ public class UninstallerContextImpl
/*     */   extends ContextImpl
/*     */   implements UninstallerContext, Serializable {
/*  30 */   private Map<String, UninstallerContext> idNamespaceToContext = new HashMap<>();
/*     */   
/*     */   public UninstallerContextImpl(ScreenExecutor screenExecutor) {
/*  33 */     super(screenExecutor);
/*  34 */     preLoadLibraries();
/*     */     
/*  36 */     InstallerVariables.registerVariableProvider("sys.installationDir", new InstallerVariables.VariableProvider()
/*     */         {
/*     */           public Object getVariable()
/*     */           {
/*  40 */             return UninstallerContextImpl.this.getInstallationDirectory().getPath();
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public void setVariable(Object value) {}
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static void preLoadLibraries() {
/*  51 */     if (!Util.isWindows()) {
/*     */       try {
/*  53 */         UnixFileSystem.getFileInformation(new File(System.getProperty("java.home")));
/*  54 */       } catch (Throwable throwable) {}
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void applyToScreen(Screen screen, ScreenBeanConfig config) {
/*  61 */     if (screen instanceof UninstallerScreen) {
/*  62 */       ((UninstallerScreen)screen).setUninstallerContext(getIdWrapperUninstallerContext((AbstractBeanConfig)config));
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public Context getIdWrapperContext(AbstractBeanConfig config) {
/*  68 */     return (Context)getIdWrapperUninstallerContext(config);
/*     */   }
/*     */ 
/*     */   
/*     */   public File getAdditionalUserJarsDir() {
/*  73 */     return null;
/*     */   }
/*     */   
/*     */   private UninstallerContext getIdWrapperUninstallerContext(AbstractBeanConfig config) {
/*  77 */     String idNamespace = config.getIdNamespace();
/*  78 */     if (idNamespace.length() == 0) {
/*  79 */       return this;
/*     */     }
/*  81 */     UninstallerContext wrapperContext = this.idNamespaceToContext.get(idNamespace);
/*  82 */     if (wrapperContext == null) {
/*  83 */       wrapperContext = new IdWrapperUninstallerContext(this, idNamespace);
/*  84 */       this.idNamespaceToContext.put(idNamespace, wrapperContext);
/*     */     } 
/*  86 */     return wrapperContext;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean performActionInt(ActionBeanConfig config) throws UserCanceledException {
/*  92 */     UninstallerContext currentContext = getIdWrapperUninstallerContext((AbstractBeanConfig)config);
/*  93 */     return performActionIntStatic(config, (Context)currentContext);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void rollbackActionInt(ActionBeanConfig config) {}
/*     */ 
/*     */   
/*     */   public boolean isUninstallForUpgrade() {
/* 102 */     return Boolean.getBoolean("install4j.upgradeUninstall");
/*     */   }
/*     */ 
/*     */   
/*     */   public void finish(int exitCode) {
/* 107 */     if (isUninstallForUpgrade()) {
/* 108 */       setPropertyAll("install4j.noRebootDeletion", "true");
/*     */     }
/* 110 */     else if (Util.isWindows()) {
/* 111 */       MsiHelper.removeMsiUninstaller(this);
/*     */     } 
/*     */ 
/*     */     
/* 115 */     FileInstaller.getInstance().finishUninstall();
/* 116 */     super.finish(exitCode);
/*     */   }
/*     */   
/*     */   private static void setPropertyAll(final String name, final String value) {
/* 120 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 123 */             System.setProperty(name, value);
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   protected String getRebootMessage() {
/* 130 */     return Messages.getString(".UninstalledAndNeedsRestart");
/*     */   }
/*     */ 
/*     */   
/*     */   protected ExecutionContext getWinDelExecutionContext() {
/* 135 */     return ExecutionContext.MAXIMUM;
/*     */   }
/*     */   
/*     */   private Object writeReplace() throws ObjectStreamException {
/* 139 */     return new ContextStandin();
/*     */   }
/*     */   
/*     */   private static class ContextStandin implements Serializable {
/*     */     private Object readResolve() throws ObjectStreamException {
/* 144 */       return ContextImpl.getCurrentContext();
/*     */     }
/*     */     
/*     */     private ContextStandin() {}
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\UninstallerContextImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */