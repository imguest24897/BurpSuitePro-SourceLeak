/*     */ package com.install4j.runtime.beans.actions.desktop;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.ExternalFile;
/*     */ import com.install4j.api.beans.VariableErrorHandlingDescriptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.FileOptions;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.OverwriteMode;
/*     */ import com.install4j.api.context.UninstallMode;
/*     */ import com.install4j.api.context.UninstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.MenuHelper;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchIntAction;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import com.install4j.runtime.installer.platform.win32.FileAssociations;
/*     */ import com.install4j.runtime.util.IconHelper;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.util.Date;
/*     */ import java.util.Objects;
/*     */ import java.util.Properties;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import javax.xml.parsers.ParserConfigurationException;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ public class CreateFileAssociationAction extends AbstractAssociationAction {
/*  37 */   private String extension = "";
/*  38 */   private String description = "";
/*     */   
/*     */   private boolean selected = true;
/*     */   private boolean windows = true;
/*  42 */   private ExternalFile windowsIconFile = null;
/*  43 */   private String winAdditionalParameters = null;
/*     */   
/*     */   private boolean unix = false;
/*  46 */   private String unixMimeType = "";
/*  47 */   private ExternalFile unixIconFile = null;
/*     */   
/*     */   private boolean restartFinder = false;
/*     */   
/*     */   private static final String PROP_EXTENSION = "extension";
/*     */   
/*     */   private static final String ELEMENT_MIME_TYPE = "mime-type";
/*     */   private static final String ELEMENT_INSTALLATION = "i4j-installation";
/*  55 */   private static String gtkIconTheme = null;
/*     */   
/*     */   private transient boolean mimeTypeCreated = false;
/*     */   
/*     */   public String getExtension() {
/*  60 */     return replaceVariables(replaceVariables(this.extension));
/*     */   }
/*     */   
/*     */   public void setExtension(String extension) {
/*  64 */     this.extension = extension;
/*     */   }
/*     */   
/*     */   public String getDescription() {
/*  68 */     return replaceVariables(replaceVariables(this.description, VariableErrorHandlingDescriptor.ALWAYS_ERROR_MESSAGE));
/*     */   }
/*     */   
/*     */   public void setDescription(String description) {
/*  72 */     this.description = description;
/*     */   }
/*     */   
/*     */   public boolean isSelected() {
/*  76 */     return replaceWithTextOverride("selected", this.selected);
/*     */   }
/*     */   
/*     */   public void setSelected(boolean selected) {
/*  80 */     this.selected = selected;
/*     */   }
/*     */   
/*     */   public boolean isWindows() {
/*  84 */     return replaceWithTextOverride("windows", this.windows);
/*     */   }
/*     */   
/*     */   public void setWindows(boolean windows) {
/*  88 */     this.windows = windows;
/*     */   }
/*     */   
/*     */   public ExternalFile getWindowsIconFile() {
/*  92 */     return (ExternalFile)replaceWithTextOverride("windowsIconFile", this.windowsIconFile, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setWindowsIconFile(ExternalFile windowsIconFile) {
/*  96 */     this.windowsIconFile = windowsIconFile;
/*     */   }
/*     */   
/*     */   public String getWinAdditionalParameters() {
/* 100 */     return replaceVariables(replaceVariables(this.winAdditionalParameters));
/*     */   }
/*     */   
/*     */   public void setWinAdditionalParameters(String winAdditionalParameters) {
/* 104 */     this.winAdditionalParameters = winAdditionalParameters;
/*     */   }
/*     */   
/*     */   public boolean isUnix() {
/* 108 */     return replaceWithTextOverride("unix", this.unix);
/*     */   }
/*     */   
/*     */   public void setUnix(boolean unix) {
/* 112 */     this.unix = unix;
/*     */   }
/*     */   
/*     */   public String getUnixMimeType() {
/* 116 */     return replaceVariables(replaceVariables(this.unixMimeType));
/*     */   }
/*     */   
/*     */   public void setUnixMimeType(String unixMimeType) {
/* 120 */     this.unixMimeType = unixMimeType;
/*     */   }
/*     */   
/*     */   public boolean isRestartFinder() {
/* 124 */     return replaceWithTextOverride("restartFinder", this.restartFinder);
/*     */   }
/*     */   
/*     */   public void setRestartFinder(boolean restartFinder) {
/* 128 */     this.restartFinder = restartFinder;
/*     */   }
/*     */   
/*     */   public ExternalFile getUnixIconFile() {
/* 132 */     return (ExternalFile)replaceWithTextOverride("unixIconFile", this.unixIconFile, ExternalFile.class);
/*     */   }
/*     */   
/*     */   public void setUnixIconFile(ExternalFile unixIconFile) {
/* 136 */     this.unixIconFile = unixIconFile;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/* 141 */     if (!isSelected()) {
/* 142 */       return true;
/*     */     }
/*     */     
/*     */     try {
/* 146 */       if (InstallerUtil.isWindows()) {
/* 147 */         if (isWindows()) {
/* 148 */           return installWindows(context);
/*     */         }
/* 150 */       } else if (!Util.isWindows() && !Util.isMacOS() && 
/* 151 */         isUnix()) {
/* 152 */         return installUnix(context);
/*     */       } 
/*     */       
/* 155 */       Util.logInfo(this, "Nothing to do");
/* 156 */     } catch (IOException e) {
/* 157 */       Util.log(e);
/* 158 */       return false;
/*     */     } 
/* 160 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean uninstall(UninstallerContext context) {
/*     */     try {
/* 166 */       if (InstallerUtil.isWindows()) {
/* 167 */         uninstallWindows();
/*     */       }
/* 169 */     } catch (Throwable e) {
/* 170 */       Util.log(e);
/*     */     } 
/*     */ 
/*     */     
/* 174 */     return true;
/*     */   }
/*     */   
/*     */   private void uninstallWindows() throws IOException, UserCanceledException {
/* 178 */     Properties persistentProperties = getPersistentProperties();
/* 179 */     String extension = persistentProperties.getProperty("extension");
/* 180 */     String executablePath = persistentProperties.getProperty("executable");
/*     */     
/* 182 */     if (executablePath == null || extension == null) {
/*     */       return;
/*     */     }
/* 185 */     File executable = (new File(executablePath)).getCanonicalFile();
/*     */     
/* 187 */     remove(extension, RegistryRoot.HKEY_CURRENT_USER, executable);
/* 188 */     remove(extension, RegistryRoot.HKEY_CLASSES_ROOT, executable);
/*     */   }
/*     */   
/*     */   private void remove(String extension, RegistryRoot registryRoot, File executable) throws IOException, UserCanceledException {
/* 192 */     String[] extensions = getExtensions(extension);
/* 193 */     String[] registeredExecutableNames = new String[extensions.length];
/*     */     int i;
/* 195 */     for (i = 0; i < extensions.length; i++) {
/* 196 */       registeredExecutableNames[i] = FileAssociations.getExecutable(prependDot(extensions[i]), registryRoot);
/*     */     }
/* 198 */     for (i = 0; i < extensions.length; i++) {
/* 199 */       String registeredExecutableName = registeredExecutableNames[i];
/* 200 */       if (registeredExecutableName != null && Objects.equals((new File(registeredExecutableName)).getCanonicalFile(), executable)) {
/* 201 */         FileAssociations.remove(prependDot(extensions[i]), registryRoot, true);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean installWindows(InstallerContext context) throws UserCanceledException {
/* 207 */     File executable = getExecutableFile((Context)context);
/* 208 */     if (executable == null || !executable.exists()) {
/* 209 */       Util.logError(this, "executable does not exist: " + executable);
/* 210 */       return false;
/*     */     } 
/*     */     
/* 213 */     File icon = context.getExternalFile(getWindowsIconFile(), true);
/*     */     
/* 215 */     String usedExtension = getExtension();
/* 216 */     String[] multipleExtensions = getExtensions(usedExtension);
/* 217 */     if (multipleExtensions.length < 2) {
/* 218 */       usedExtension = prependDot(usedExtension);
/* 219 */       addRollbackActions(FileAssociations.create(usedExtension, getDescription(), icon, executable, getWinAdditionalParameters()));
/*     */     } else {
/* 221 */       for (String singleExtension : multipleExtensions) {
/* 222 */         addRollbackActions(FileAssociations.create(prependDot(singleExtension), getDescription(), icon, executable, getWinAdditionalParameters()));
/*     */       }
/*     */     } 
/*     */     
/* 226 */     Properties persistentProperties = getPersistentProperties();
/* 227 */     persistentProperties.setProperty("extension", usedExtension);
/* 228 */     persistentProperties.setProperty("executable", executable.getAbsolutePath());
/* 229 */     return true;
/*     */   }
/*     */   
/*     */   private boolean installUnix(InstallerContext context) throws IOException, UserCanceledException {
/* 233 */     File executable = getExecutableFile((Context)context);
/* 234 */     if (executable == null || !executable.isFile()) {
/* 235 */       Util.logError(this, "executable does not exist: " + executable);
/* 236 */       return false;
/*     */     } 
/*     */     
/* 239 */     if (getUnixMimeType().isEmpty()) {
/* 240 */       Util.logError(this, "no mime type specified");
/* 241 */       return false;
/*     */     } 
/*     */     
/* 244 */     String usedExtension = getExtension();
/* 245 */     usedExtension = removeLeadingDot(usedExtension);
/*     */     
/* 247 */     AbstractAssociationAction.UnixAssociationInfo associationInfo = getUnixAssociationInfo(executable);
/*     */     
/* 249 */     String iconName = null;
/* 250 */     if (getUnixIconFile() != null) {
/* 251 */       iconName = getFileBaseName(FileUtil.getCanonicalPath(context.getInstallationDirectory()));
/* 252 */       if (!installUnixIcon(context, iconName, getUnixIconFile())) {
/* 253 */         iconName = null;
/*     */       }
/*     */     } 
/*     */     
/* 257 */     boolean success = true;
/* 258 */     boolean executedAtLeastOnce = false;
/* 259 */     Logger.getInstance().info(this, "existing desktop files: " + associationInfo.getDesktopFiles());
/* 260 */     for (File desktopFile : associationInfo.getDesktopFiles()) {
/* 261 */       if (desktopFile.isFile()) {
/* 262 */         executedAtLeastOnce = true;
/* 263 */         if (!executeForDesktopFile(context.getInstallationDirectory(), usedExtension, getDescription(), iconName, desktopFile)) {
/* 264 */           success = false;
/*     */         }
/*     */       } 
/*     */     } 
/* 268 */     String finalUsedExtension = usedExtension;
/* 269 */     String finalIconName = iconName;
/* 270 */     associationInfo.addAction(this, executedAtLeastOnce, desktopFile -> executeForDesktopFile(context.getInstallationDirectory(), finalUsedExtension, getDescription(), finalIconName, desktopFile));
/* 271 */     return success;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static synchronized String getGtkIconTheme() {
/* 276 */     if (gtkIconTheme == null) {
/*     */       try {
/* 278 */         gtkIconTheme = GSettingsHelper.getString("org.gnome.desktop.interface", "icon-theme");
/* 279 */       } catch (Throwable t) {
/* 280 */         Logger.getInstance().log(t);
/*     */       } 
/* 282 */       if (gtkIconTheme == null) {
/* 283 */         gtkIconTheme = "";
/*     */       }
/*     */     } 
/* 286 */     return gtkIconTheme;
/*     */   }
/*     */   
/*     */   private static int getIconSize(final File file) throws IOException {
/*     */     try {
/* 291 */       return HelperCommunication.getInstance().fetchIntChecked(ExecutionContext.UNELEVATED, new FetchIntAction()
/*     */           {
/*     */             protected int fetchValue(Context context) throws Exception {
/* 294 */               return IconHelper.getIconSize(file);
/*     */             }
/*     */           });
/* 297 */     } catch (IOException e) {
/* 298 */       throw e;
/* 299 */     } catch (Exception e) {
/* 300 */       throw new IOException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean installUnixIcon(InstallerContext context, String iconName, ExternalFile externalFile) {
/* 305 */     File file = context.getExternalFile(externalFile, true);
/* 306 */     if (file != null) {
/* 307 */       if (!file.isFile()) {
/* 308 */         Util.logError(this, "icon file " + file + " not found.");
/*     */       } else {
/*     */         try {
/* 311 */           int size = getIconSize(file);
/* 312 */           if (MenuHelper.execute("xdg-icon-resource", new String[] { "install", "--mode", MenuHelper.getMode(), "--context", "mimetypes", "--size", String.valueOf(size), file.getAbsolutePath(), iconName })) {
/* 313 */             FileInstaller.getInstance().registerPreUninstallCommand(file, "xdg-icon-resource", new String[] { "uninstall", "--mode", MenuHelper.getMode(), "--context", "mimetypes", "--size", String.valueOf(size), iconName });
/*     */             
/* 315 */             String theme = getGtkIconTheme();
/* 316 */             if (!Objects.equals(theme, "") && 
/* 317 */               MenuHelper.execute("xdg-icon-resource", new String[] { "install", "--mode", MenuHelper.getMode(), "--theme", theme, "--context", "mimetypes", "--size", String.valueOf(size), file.getAbsolutePath(), iconName })) {
/* 318 */               FileInstaller.getInstance().registerPreUninstallCommand(file, "xdg-icon-resource", new String[] { "uninstall", "--mode", MenuHelper.getMode(), "--theme", theme, "--context", "mimetypes", "--size", String.valueOf(size), iconName });
/*     */             }
/*     */             
/* 321 */             return true;
/*     */           } 
/* 323 */         } catch (IOException e) {
/* 324 */           Util.log(e);
/*     */         } 
/*     */       } 
/*     */     }
/* 328 */     return false;
/*     */   }
/*     */   
/*     */   private boolean executeForDesktopFile(File installationDir, String extension, String description, String icon, File desktopFile) throws IOException, UserCanceledException {
/* 332 */     if (!installMimeType(installationDir, extension, description, icon)) {
/* 333 */       return false;
/*     */     }
/* 335 */     return addMimeTypeToDesktopFile(desktopFile, getUnixMimeType());
/*     */   }
/*     */   
/*     */   private boolean installMimeType(File installationDir, String extension, String description, String icon) throws IOException, UserCanceledException {
/* 339 */     if (!this.mimeTypeCreated) {
/* 340 */       String mimeType = getUnixMimeType();
/*     */       
/* 342 */       String installation = FileUtil.getCanonicalPath(installationDir);
/* 343 */       File tempFile = File.createTempFile("i4j", null);
/*     */       try {
/* 345 */         DocumentBuilderFactory factory = XmlHelper.createDocumentBuilderFactory();
/* 346 */         factory.setNamespaceAware(true);
/* 347 */         Document document = factory.newDocumentBuilder().newDocument();
/* 348 */         document.setXmlStandalone(true);
/* 349 */         Element root = document.createElementNS("http://www.freedesktop.org/standards/shared-mime-info", "mime-info");
/* 350 */         document.appendChild(root);
/* 351 */         Element mimeTypeEl = document.createElement("mime-type");
/* 352 */         mimeTypeEl.setAttribute("type", mimeType);
/* 353 */         root.appendChild(mimeTypeEl);
/*     */         
/* 355 */         if (description != null && !description.isEmpty()) {
/* 356 */           Element commentElement = document.createElement("comment");
/* 357 */           commentElement.setTextContent(description);
/* 358 */           mimeTypeEl.appendChild(commentElement);
/*     */         } 
/* 360 */         if (icon != null && !icon.isEmpty()) {
/* 361 */           Element iconElement = document.createElement("icon");
/* 362 */           iconElement.setAttribute("name", icon);
/* 363 */           mimeTypeEl.appendChild(iconElement);
/*     */         } 
/*     */         
/* 366 */         for (String singleExtension : getExtensions(extension)) {
/* 367 */           Element globElement = document.createElement("glob");
/* 368 */           globElement.setAttribute("pattern", "*." + removeLeadingDot(singleExtension));
/* 369 */           globElement.setAttribute("weight", "60");
/* 370 */           mimeTypeEl.appendChild(globElement);
/*     */         } 
/*     */         
/* 373 */         Element installerElement = document.createElementNS("http://www.ej-technologies.com/shared-mime-info-ext", "i4j-installation");
/* 374 */         installerElement.setTextContent(installation);
/* 375 */         mimeTypeEl.appendChild(installerElement);
/*     */         
/* 377 */         byte[] bytes = XmlHelper.getBytes(document);
/* 378 */         FileOutputStream out = new FileOutputStream(tempFile); 
/* 379 */         try { out.write(bytes);
/* 380 */           out.close(); } catch (Throwable throwable) { try { out.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; } 
/* 381 */       } catch (ParserConfigurationException e) {
/* 382 */         throw new IOException(e);
/*     */       } 
/* 384 */       File runtimeDir = new File(installationDir, ".install4j");
/* 385 */       runtimeDir.mkdirs();
/* 386 */       File mimeFile = FileUtil.getCanonicalFile(new File(runtimeDir, getFileBaseName(installation) + ".xml"));
/* 387 */       FileInstaller.getInstance().install(tempFile, mimeFile, new FileOptions((new Date()).getTime(), "644", OverwriteMode.ALWAYS, false, UninstallMode.ALWAYS));
/* 388 */       tempFile.delete();
/* 389 */       if (MenuHelper.execute(mimeFile.getParentFile(), "xdg-mime", new String[] { "install", "--mode", MenuHelper.getMode(), mimeFile.getName() })) {
/* 390 */         FileInstaller.getInstance().registerPreUninstallCommand(mimeFile, "xdg-mime", new String[] { "uninstall", "--mode", MenuHelper.getMode(), mimeFile.getAbsolutePath() });
/*     */       }
/* 392 */       this.mimeTypeCreated = true;
/*     */     } 
/* 394 */     return true;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private String getFileBaseName(String installationDir) {
/* 399 */     return MenuHelper.getVendorPrefix(installationDir) + getUnixMimeType().replace('/', '.');
/*     */   }
/*     */   
/*     */   public boolean fileExists(Context context) {
/* 403 */     File testFile = null;
/* 404 */     if (Util.isWindowsInstaller()) {
/* 405 */       testFile = getExecutableFile(context);
/* 406 */     } else if (Util.isMacosInstaller()) {
/* 407 */       testFile = getBundleDir(context, getLauncherId());
/*     */     } 
/* 409 */     return (testFile != null && testFile.exists());
/*     */   }
/*     */   
/*     */   private static String getInstallation(File mimeFile) {
/*     */     try {
/* 414 */       Document readDoc = XmlHelper.parseFile(mimeFile);
/* 415 */       Element mimeType = XmlHelper.findChild(readDoc.getDocumentElement(), "mime-type");
/* 416 */       if (mimeType != null) {
/* 417 */         Element installation = XmlHelper.findChild(mimeType, "i4j-installation");
/* 418 */         if (installation != null) {
/* 419 */           System.out.println(installation.getTextContent());
/*     */         }
/*     */       } 
/* 422 */     } catch (Exception e) {
/* 423 */       Logger.getInstance().info(null, "could not parse " + mimeFile + ": " + e);
/*     */     } 
/* 425 */     return null;
/*     */   }
/*     */   
/*     */   public static String[] getExtensions(String extensionString) {
/* 429 */     if (extensionString == null) {
/* 430 */       return null;
/*     */     }
/* 432 */     String[] ret = extensionString.split(",");
/* 433 */     for (int i = 0; i < ret.length; i++) {
/* 434 */       ret[i] = ret[i].trim();
/*     */     }
/* 436 */     return ret;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static String removeLeadingDot(String singleExtension) {
/* 441 */     if (singleExtension.startsWith(".")) {
/* 442 */       singleExtension = singleExtension.substring(1);
/*     */     }
/* 444 */     return singleExtension;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static String prependDot(String singleExtension) {
/* 449 */     if (!singleExtension.startsWith(".")) {
/* 450 */       singleExtension = "." + singleExtension;
/*     */     }
/* 452 */     return singleExtension;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\desktop\CreateFileAssociationAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */