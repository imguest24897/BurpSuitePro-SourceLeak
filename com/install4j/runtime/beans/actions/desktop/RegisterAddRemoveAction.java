/*     */ package com.install4j.runtime.beans.actions.desktop;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.actions.InstallAction;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UninstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.api.windows.RegistryView;
/*     */ import com.install4j.api.windows.WinRegistry;
/*     */ import com.install4j.runtime.beans.actions.SystemAutoUninstallInstallAction;
/*     */ import com.install4j.runtime.beans.actions.registry.DeleteRegistryItemAction;
/*     */ import com.install4j.runtime.beans.actions.registry.SetRegistryValueAction;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.CompilerVariableHelper;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.MsiHelper;
/*     */ import com.install4j.runtime.installer.helper.content.ContentInstaller;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Locale;
/*     */ import java.util.Objects;
/*     */ import java.util.StringTokenizer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RegisterAddRemoveAction
/*     */   extends SystemAutoUninstallInstallAction
/*     */ {
/*     */   private static final String UNINSTALL_KEY = "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Uninstall\\";
/*     */   private static final String DISPLAY_NAME_VALUE_NAME = "DisplayName";
/*     */   private static final String DISPLAY_ICON_VALUE_NAME = "DisplayIcon";
/*     */   private static final String DISPLAY_VERSION_VALUE_NAME = "DisplayVersion";
/*     */   private static final String UNINSTALL_STRING_VALUE_NAME = "UninstallString";
/*     */   private static final String PUBLISHER_VALUE_NAME = "Publisher";
/*     */   private static final String URL_INFO_ABOUT_VALUE_NAME = "URLInfoAbout";
/*     */   private static final String VERSION_MAJOR_VALUE_NAME = "VersionMajor";
/*     */   private static final String VERSION_MINOR_VALUE_NAME = "VersionMinor";
/*     */   private static final String INSTALL_LOCATION_VALUE_NAME = "InstallLocation";
/*     */   private static final String ESTIMATED_SIZE_VALUE_NAME = "EstimatedSize";
/*     */   private static final String MSI_PREFIX = "MsiExec.exe /X";
/*     */   private static final String MSI_UNINSTALLER_VARIABLE = " I4JUNINSTALLER=";
/*  51 */   private String itemName = "";
/*  52 */   private IconSource iconSource = IconSource.INSTALLER;
/*     */   private ExternalFile icon;
/*     */   
/*     */   public String getItemName() {
/*  56 */     return replaceVariables(replaceVariables(this.itemName, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setItemName(String itemName) {
/*  60 */     this.itemName = itemName;
/*     */   }
/*     */   
/*     */   public IconSource getIconSource() {
/*  64 */     return (IconSource)replaceWithTextOverride("iconSource", this.iconSource, IconSource.class);
/*     */   }
/*     */   
/*     */   public void setIconSource(IconSource iconSource) {
/*  68 */     this.iconSource = iconSource;
/*     */   }
/*     */   
/*     */   public ExternalFile getIcon() {
/*  72 */     return (ExternalFile)replaceWithTextOverride("icon", this.icon, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setIcon(ExternalFile icon) {
/*  76 */     this.icon = icon;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean uninstall(UninstallerContext context) throws UserCanceledException {
/*  81 */     if (!InstallerUtil.isWindows()) {
/*  82 */       return true;
/*     */     }
/*     */     
/*  85 */     File uninstaller = context.getDestinationFile(getUninstallerFilename());
/*     */     
/*  87 */     if (uninstaller.exists()) {
/*  88 */       removeUninstallLinks(uninstaller, (Context)context);
/*     */     }
/*     */     
/*  91 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*  96 */     if (!InstallerUtil.isWindows()) {
/*  97 */       return true;
/*     */     }
/*     */     
/* 100 */     File uninstaller = context.getDestinationFile(getUninstallerFilename());
/*     */     
/* 102 */     if (!uninstaller.exists()) {
/* 103 */       Logger.getInstance().log(this, "No uninstaller was found.", false);
/* 104 */       return false;
/*     */     } 
/*     */     
/* 107 */     removeUninstallLinks(uninstaller, (Context)context);
/*     */     
/* 109 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/*     */     
/* 111 */     RegistryRoot root = RegistryRoot.HKEY_LOCAL_MACHINE;
/* 112 */     String uninstallKey = getUnusedKey("SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Uninstall\\" + context.getApplicationId(), root);
/* 113 */     if (WinRegistry.createKey(root, uninstallKey)) {
/* 114 */       WinRegistry.deleteKey(root, uninstallKey, true);
/*     */     } else {
/* 116 */       root = RegistryRoot.HKEY_CURRENT_USER;
/* 117 */       uninstallKey = getUnusedKey("SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Uninstall\\" + context.getApplicationId(), root);
/*     */     } 
/*     */ 
/*     */     
/* 121 */     SetRegistryValueAction action = new SetRegistryValueAction(root, uninstallKey, "DisplayName", getItemName(), false);
/* 122 */     addRollbackAction((InstallAction)action);
/* 123 */     action.execute((Context)context);
/*     */     
/* 125 */     File iconFile = getUsedIconFile(context);
/* 126 */     if (iconFile != null) {
/*     */       
/* 128 */       action = new SetRegistryValueAction(root, uninstallKey, "DisplayIcon", iconFile.getAbsolutePath(), false);
/* 129 */       addRollbackAction((InstallAction)action);
/* 130 */       action.execute((Context)context);
/*     */     } 
/*     */     
/* 133 */     String uninstallerString = "\"" + uninstaller.getAbsolutePath() + "\"";
/* 134 */     String msiProduct = MsiHelper.getMsiProductId();
/* 135 */     if (msiProduct != null) {
/* 136 */       uninstallerString = "MsiExec.exe /X" + msiProduct + " I4JUNINSTALLER=" + uninstallerString;
/*     */     }
/* 138 */     action = new SetRegistryValueAction(root, uninstallKey, "UninstallString", uninstallerString, false);
/* 139 */     addRollbackAction((InstallAction)action);
/* 140 */     action.execute((Context)context);
/*     */     
/* 142 */     String publisherName = config.getPublisherName();
/* 143 */     if (publisherName != null && !Objects.equals(publisherName.trim(), "")) {
/* 144 */       action = new SetRegistryValueAction(root, uninstallKey, "Publisher", publisherName, false);
/*     */       
/* 146 */       addRollbackAction((InstallAction)action);
/* 147 */       action.execute((Context)context);
/*     */     } 
/*     */     
/* 150 */     String publisherURL = config.getPublisherURL();
/* 151 */     if (publisherURL != null && !Objects.equals(publisherURL.trim(), "")) {
/* 152 */       action = new SetRegistryValueAction(root, uninstallKey, "URLInfoAbout", publisherURL, false);
/*     */       
/* 154 */       addRollbackAction((InstallAction)action);
/* 155 */       action.execute((Context)context);
/*     */     } 
/*     */ 
/*     */     
/* 159 */     action = new SetRegistryValueAction(root, uninstallKey, "InstallLocation", context.getInstallationDirectory().getAbsolutePath(), false);
/* 160 */     addRollbackAction((InstallAction)action);
/* 161 */     action.execute((Context)context);
/*     */     
/* 163 */     setEstimatedSize(context, root, uninstallKey);
/*     */ 
/*     */     
/*     */     try {
/* 167 */       action = new SetRegistryValueAction(root, uninstallKey, "DisplayVersion", InstallerConfig.getCurrentInstance().getApplicationVersion(), false);
/* 168 */       addRollbackAction((InstallAction)action);
/* 169 */       action.execute((Context)context);
/*     */       
/* 171 */       StringTokenizer tok = new StringTokenizer(InstallerConfig.getCurrentInstance().getApplicationVersion(), ",.", false);
/* 172 */       if (tok.hasMoreTokens()) {
/*     */         
/* 174 */         action = new SetRegistryValueAction(root, uninstallKey, "VersionMajor", Integer.valueOf(tok.nextToken().trim()), false);
/* 175 */         addRollbackAction((InstallAction)action);
/* 176 */         action.execute((Context)context);
/*     */       } 
/* 178 */       if (tok.hasMoreTokens()) {
/*     */         
/* 180 */         action = new SetRegistryValueAction(root, uninstallKey, "VersionMinor", Integer.valueOf(tok.nextToken().trim()), false);
/* 181 */         addRollbackAction((InstallAction)action);
/* 182 */         action.execute((Context)context);
/*     */       } 
/* 184 */     } catch (Exception e) {
/* 185 */       Logger.getInstance().info(this, "Could not set app version: " + e.getMessage());
/*     */     } 
/*     */     
/* 188 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private void setEstimatedSize(InstallerContext context, RegistryRoot root, String uninstallKey) {
/*     */     long estimatedSize;
/* 194 */     Object estimatedSizeVar = context.getVariable("sys.ext.addRemove.estimatedSize");
/* 195 */     if (estimatedSizeVar instanceof Number) {
/* 196 */       estimatedSize = ((Number)estimatedSizeVar).longValue();
/*     */     } else {
/* 198 */       estimatedSize = CompilerVariableHelper.getCompilerExtensionVariable((Context)context, "addRemove.estimatedSize", -1L);
/* 199 */       if (estimatedSize == -1L) {
/* 200 */         estimatedSize = ContentInstaller.getInstance().getMinSize() + 500000L;
/*     */       }
/*     */     } 
/* 203 */     if (estimatedSize > 0L) {
/* 204 */       estimatedSize /= 1024L;
/* 205 */       if (estimatedSize <= 4294967295L) {
/* 206 */         SetRegistryValueAction action = new SetRegistryValueAction(root, uninstallKey, "EstimatedSize", Integer.valueOf((int)estimatedSize), false);
/* 207 */         addRollbackAction((InstallAction)action);
/* 208 */         action.execute((Context)context);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   private File getUsedIconFile(InstallerContext context) {
/*     */     File icoFileName;
/* 214 */     switch (getIconSource()) {
/*     */       case INSTALLER:
/* 216 */         icoFileName = new File(ContextImpl.getContextInt((Context)context).getRuntimeDirectory(), "installer.ico");
/* 217 */         if (icoFileName.exists()) {
/* 218 */           return icoFileName;
/*     */         }
/* 220 */         return null;
/*     */       
/*     */       case CUSTOM:
/* 223 */         return context.getExternalFile(getIcon(), true);
/*     */     } 
/* 225 */     throw new RuntimeException(getIconSource().name());
/*     */   }
/*     */ 
/*     */   
/*     */   private String getUnusedKey(String baseUninstallKey, RegistryRoot root) {
/* 230 */     String uninstallKey = baseUninstallKey;
/* 231 */     int count = 0;
/* 232 */     boolean win64 = Util.is64BitWindows();
/* 233 */     while (keyExistsForEveryBitness(win64, root, uninstallKey)) {
/* 234 */       uninstallKey = baseUninstallKey + "-" + ++count;
/*     */     }
/* 236 */     return uninstallKey;
/*     */   }
/*     */   
/*     */   private boolean keyExistsForEveryBitness(boolean win64, RegistryRoot root, String uninstallKey) {
/* 240 */     if (win64) {
/* 241 */       return (WinRegistry.keyExists(root, uninstallKey, RegistryView.BIT32) || WinRegistry.keyExists(root, uninstallKey, RegistryView.BIT64));
/*     */     }
/* 243 */     return WinRegistry.keyExists(root, uninstallKey);
/*     */   }
/*     */ 
/*     */   
/*     */   private String getUninstallerFilename() {
/* 248 */     return InstallerConfig.getCurrentInstance().getUninstallerPath() + ".exe";
/*     */   }
/*     */   
/*     */   private void removeUninstallLinks(File uninstaller, Context context) throws UserCanceledException {
/* 252 */     removeUninstallLinks(uninstaller, context, RegistryRoot.HKEY_LOCAL_MACHINE);
/* 253 */     removeUninstallLinks(uninstaller, context, RegistryRoot.HKEY_CURRENT_USER);
/*     */   }
/*     */   
/*     */   private void removeUninstallLinks(File uninstaller, Context context, RegistryRoot registryRoot) throws UserCanceledException {
/* 257 */     String[] subKeys = WinRegistry.getSubKeyNames(registryRoot, "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Uninstall\\");
/* 258 */     if (subKeys != null) {
/* 259 */       for (String subKey : subKeys) {
/* 260 */         String softwareKey = "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Uninstall\\" + subKey;
/* 261 */         Object regUninstallerObject = WinRegistry.getValue(registryRoot, softwareKey, "UninstallString");
/* 262 */         if (regUninstallerObject instanceof String) {
/* 263 */           String regUninstallerString = ((String)regUninstallerObject).trim();
/* 264 */           regUninstallerString = getFromMsiValue(regUninstallerString);
/*     */           
/* 266 */           if (regUninstallerString.startsWith("\"")) {
/* 267 */             regUninstallerString = regUninstallerString.substring(1);
/*     */           }
/* 269 */           if (regUninstallerString.endsWith("\"")) {
/* 270 */             regUninstallerString = regUninstallerString.substring(0, regUninstallerString.length() - 1);
/*     */           }
/* 272 */           String regUninstallerStringLowerCase = regUninstallerString.toLowerCase(Locale.ENGLISH);
/* 273 */           if (regUninstallerStringLowerCase.endsWith(".exe") && regUninstallerStringLowerCase.startsWith(uninstaller.getAbsolutePath().substring(0, 2).toLowerCase(Locale.ENGLISH))) {
/* 274 */             File regUninstallerFile = new File(regUninstallerString);
/* 275 */             if (regUninstallerFile.exists()) {
/*     */               try {
/* 277 */                 if (Objects.equals(regUninstallerFile.getCanonicalFile(), uninstaller.getCanonicalFile())) {
/* 278 */                   DeleteRegistryItemAction action = new DeleteRegistryItemAction(registryRoot, softwareKey, "", false);
/*     */                   
/* 280 */                   addRollbackAction((InstallAction)action);
/* 281 */                   action.execute(context);
/*     */                 } 
/* 283 */               } catch (IOException e) {
/* 284 */                 e.printStackTrace();
/*     */               } 
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static String getFromMsiValue(String regUninstallerString) {
/* 295 */     if (regUninstallerString.startsWith("MsiExec.exe /X")) {
/* 296 */       int uninstallerStart = regUninstallerString.indexOf(" I4JUNINSTALLER=");
/* 297 */       if (uninstallerStart > -1) {
/* 298 */         regUninstallerString = regUninstallerString.substring(uninstallerStart + " I4JUNINSTALLER=".length());
/*     */       }
/*     */     } 
/* 301 */     return regUninstallerString;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\RegisterAddRemoveAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */