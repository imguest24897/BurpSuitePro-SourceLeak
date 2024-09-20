/*     */ package com.install4j.runtime.beans.actions.desktop;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UninstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.platform.macos.MacFileSystem;
/*     */ import com.install4j.runtime.installer.platform.win32.Win32UrlHandler;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Objects;
/*     */ import java.util.Properties;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class UrlHandlerAction
/*     */   extends AbstractAssociationAction {
/*     */   private static final String PROP_SCHEME = "extension";
/*  26 */   private String scheme = "";
/*     */   
/*     */   public String getScheme() {
/*  29 */     return replaceVariables(replaceVariables(this.scheme));
/*     */   }
/*     */   
/*     */   public void setScheme(String scheme) {
/*  33 */     this.scheme = scheme;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*  38 */     String scheme = getUsedScheme();
/*  39 */     if (scheme.trim().isEmpty() || scheme.contains(" ")) {
/*  40 */       Util.logError(this, "invalid scheme: '" + scheme + "'");
/*  41 */       return false;
/*     */     } 
/*     */     try {
/*  44 */       if (InstallerUtil.isWindows())
/*  45 */         return installWindows(context); 
/*  46 */       if (!Util.isWindows() && !Util.isMacOS()) {
/*  47 */         return installUnix(context);
/*     */       }
/*  49 */       Util.logInfo(this, "Nothing to do");
/*  50 */     } catch (Exception e) {
/*  51 */       Util.log(e);
/*  52 */       return false;
/*     */     } 
/*  54 */     return true;
/*     */   }
/*     */   
/*     */   private static void setDefaultHandler(final String scheme, final String bundleIdentifier) {
/*  58 */     if (scheme != null && bundleIdentifier != null) {
/*  59 */       HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) throws Exception {
/*  62 */               MacFileSystem.setDefaultHandlerForURLScheme(scheme, bundleIdentifier);
/*     */             }
/*     */           });
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean installWindows(InstallerContext context) throws UserCanceledException {
/*  69 */     File executable = getExecutableFile((Context)context);
/*  70 */     if (executable == null || !executable.exists()) {
/*  71 */       Util.logError(this, "executable does not exist: " + executable);
/*  72 */       return false;
/*     */     } 
/*     */     
/*  75 */     addRollbackActions(Win32UrlHandler.create(getUsedScheme(), executable));
/*     */     
/*  77 */     Properties persistentProperties = getPersistentProperties();
/*  78 */     persistentProperties.setProperty("extension", getUsedScheme());
/*  79 */     persistentProperties.setProperty("executable", executable.getAbsolutePath());
/*  80 */     return true;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getUsedScheme() {
/*  85 */     String usedScheme = getScheme();
/*  86 */     if (usedScheme.endsWith(":")) {
/*  87 */       usedScheme = usedScheme.substring(0, usedScheme.length() - 1);
/*     */     }
/*  89 */     return usedScheme;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean uninstall(UninstallerContext context) throws UserCanceledException {
/*     */     try {
/*  95 */       if (InstallerUtil.isWindows()) {
/*  96 */         Properties persistentProperties = getPersistentProperties();
/*  97 */         String scheme = persistentProperties.getProperty("extension");
/*  98 */         String executablePath = persistentProperties.getProperty("executable");
/*     */         
/* 100 */         if (scheme == null || executablePath == null) {
/* 101 */           return true;
/*     */         }
/* 103 */         File executable = (new File(executablePath)).getCanonicalFile();
/*     */         
/* 105 */         remove(scheme, RegistryRoot.HKEY_CURRENT_USER, executable);
/* 106 */         remove(scheme, RegistryRoot.HKEY_CLASSES_ROOT, executable);
/*     */       } 
/* 108 */     } catch (Throwable e) {
/* 109 */       Util.log(e);
/*     */     } 
/*     */     
/* 112 */     return true;
/*     */   }
/*     */   
/*     */   private void remove(String scheme, RegistryRoot root, File executable) throws IOException {
/* 116 */     String registeredExecutableName = Win32UrlHandler.getExecutable(scheme, root);
/* 117 */     if (registeredExecutableName != null && Objects.equals((new File(registeredExecutableName)).getCanonicalFile(), executable)) {
/* 118 */       Win32UrlHandler.remove(scheme, root);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean executeForDesktopFile(File desktopFile) throws IOException, UserCanceledException {
/* 123 */     return addMimeTypeToDesktopFile(desktopFile, "x-scheme-handler/" + getUsedScheme());
/*     */   }
/*     */   
/*     */   private boolean installUnix(InstallerContext context) throws IOException, UserCanceledException {
/* 127 */     File executable = getExecutableFile((Context)context);
/* 128 */     if (executable == null || !executable.isFile()) {
/* 129 */       Util.logError(this, "executable does not exist: " + executable);
/* 130 */       return false;
/*     */     } 
/* 132 */     AbstractAssociationAction.UnixAssociationInfo associationInfo = getUnixAssociationInfo(executable);
/*     */     
/* 134 */     boolean success = true;
/* 135 */     boolean executedAtLeastOnce = false;
/* 136 */     Logger.getInstance().info(this, "existing desktop files: " + associationInfo.getDesktopFiles());
/* 137 */     for (File desktopFile : associationInfo.getDesktopFiles()) {
/* 138 */       if (desktopFile.isFile()) {
/* 139 */         executedAtLeastOnce = true;
/* 140 */         if (!executeForDesktopFile(desktopFile)) {
/* 141 */           success = false;
/*     */         }
/*     */       } 
/*     */     } 
/* 145 */     associationInfo.addAction(this, executedAtLeastOnce, this::executeForDesktopFile);
/* 146 */     return success;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\UrlHandlerAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */