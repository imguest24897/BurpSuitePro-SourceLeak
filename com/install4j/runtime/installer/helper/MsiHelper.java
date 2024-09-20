/*     */ package com.install4j.runtime.installer.helper;
/*     */ 
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.api.windows.RegistryView;
/*     */ import com.install4j.api.windows.WinRegistry;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.config.MsiScope;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import java.io.File;
/*     */ import java.util.Objects;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MsiHelper
/*     */ {
/*     */   public static final String MSI_KEY = "SOFTWARE\\ej-technologies\\install4j\\msiwrapper";
/*     */   private static final String PROP_NAME_MSI_FILE = "install4j.msiFile";
/*  27 */   private static final String MSI_FILE = System.getProperty("install4j.msiFile");
/*     */   
/*  29 */   private static volatile boolean msiAllUsers = (Boolean.getBoolean("install4j.msiAllUsers") || HelperCommunication.getInstance().isElevatedHelper());
/*     */   
/*     */   public static void writeMsiUninstaller(Context context) {
/*  32 */     if (Util.isWindowsInstaller() && !InstallerConfig.getCurrentInstance().isAddOnInstaller() && isStartedFromMsi()) {
/*  33 */       final String uninstallerPath = getUninstallerPath(context);
/*  34 */       final String productId = getMsiProductId();
/*  35 */       if (productId != null && (new File(uninstallerPath)).isFile()) {
/*  36 */         HelperCommunication helperCommunication = HelperCommunication.getInstance();
/*  37 */         if (isMsiAllUsers(context) && (Util.hasFullAdminRights() || helperCommunication.hasElevatedHelper())) {
/*  38 */           helperCommunication.executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */               {
/*     */                 protected void run(Context context) {
/*  41 */                   if (!WinRegistry.setValue(RegistryRoot.HKEY_LOCAL_MACHINE, "SOFTWARE\\ej-technologies\\install4j\\msiwrapper", productId, uninstallerPath, RegistryView.BIT64)) {
/*  42 */                     WinRegistry.setValue(RegistryRoot.HKEY_CURRENT_USER, "SOFTWARE\\ej-technologies\\install4j\\msiwrapper", productId, uninstallerPath, RegistryView.BIT64);
/*     */                   }
/*     */                 }
/*     */               });
/*     */         } else {
/*  47 */           WinRegistry.setValue(RegistryRoot.HKEY_CURRENT_USER, "SOFTWARE\\ej-technologies\\install4j\\msiwrapper", productId, uninstallerPath, RegistryView.BIT64);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static String getUninstallerPath(Context context) {
/*  55 */     return FileUtil.getCanonicalPath(new File(context.getInstallationDirectory(), InstallerConfig.getCurrentInstance().getUninstallerPath() + ".exe"));
/*     */   }
/*     */   
/*     */   public static void removeMsiUninstaller(Context context) {
/*  59 */     final String uninstallerPath = getUninstallerPath(context);
/*  60 */     HelperCommunication.getInstance().executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*  63 */             MsiHelper.removeMsiUninstaller(uninstallerPath, RegistryRoot.HKEY_LOCAL_MACHINE);
/*  64 */             MsiHelper.removeMsiUninstaller(uninstallerPath, RegistryRoot.HKEY_CURRENT_USER);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static void removeMsiUninstaller(String uninstallerPath, RegistryRoot registryRoot) {
/*  70 */     String[] valueNames = WinRegistry.getValueNames(registryRoot, "SOFTWARE\\ej-technologies\\install4j\\msiwrapper", RegistryView.BIT64);
/*  71 */     if (valueNames != null) {
/*  72 */       for (String valueName : valueNames) {
/*  73 */         Object otherUninstaller = WinRegistry.getValue(registryRoot, "SOFTWARE\\ej-technologies\\install4j\\msiwrapper", valueName, RegistryView.BIT64);
/*  74 */         if (Objects.equals(otherUninstaller, uninstallerPath)) {
/*  75 */           WinRegistry.deleteValue(registryRoot, "SOFTWARE\\ej-technologies\\install4j\\msiwrapper", valueName, RegistryView.BIT64);
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean isMsiStartMsiMatch() {
/*  82 */     return (isBuildForMsi() && !isStartedFromMsi());
/*     */   }
/*     */   
/*     */   public static boolean isStartedFromMsi() {
/*  86 */     return (MSI_FILE != null);
/*     */   }
/*     */   
/*     */   private static boolean isBuildForMsi() {
/*  90 */     return (getMsiProductId() != null);
/*     */   }
/*     */   
/*     */   public static String getMsiFile() {
/*  94 */     return MSI_FILE;
/*     */   }
/*     */   
/*     */   public static String getMsiProductId() {
/*  98 */     String productId = (String)InstallerConfig.getCurrentInstance().getCompilerVariables().get("sys.msiProductId");
/*  99 */     if (productId == null || productId.isEmpty()) {
/* 100 */       return null;
/*     */     }
/* 102 */     return productId;
/*     */   }
/*     */ 
/*     */   
/*     */   public static boolean isMsiAllUsers(Context context) {
/* 107 */     if (InstallerConfig.isInstaller()) {
/* 108 */       return msiAllUsers;
/*     */     }
/* 110 */     return ContextImpl.getContextInt(context).getInstallationProperties().isMsiAllUsers();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void setMsiAllUsers(boolean msiAllUsers) {
/* 115 */     if (getMsiScope() != MsiScope.PER_USER) {
/* 116 */       MsiHelper.msiAllUsers = msiAllUsers;
/*     */     }
/*     */   }
/*     */   
/*     */   public static void addMsiVariables(final Context context) {
/* 121 */     InstallerVariables.registerVariableProvider("sys.msiAllUsers", (InstallerVariables.VariableProvider)new InstallerVariables.ReadOnlyVariableProvider()
/*     */         {
/*     */           public Object getVariable() {
/* 124 */             return Boolean.valueOf(MsiHelper.isMsiAllUsers(context));
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static MsiScope getMsiScope() {
/* 130 */     return InstallerConfig.getCurrentInstance().getWindowsSpecificConfig().getMsiScope();
/*     */   }
/*     */   
/*     */   public static String addMsiArguments(String arguments) {
/* 134 */     return arguments + " \"-D" + "install4j.msiFile" + "=" + getMsiFile() + "\"";
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\MsiHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */