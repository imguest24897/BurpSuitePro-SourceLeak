/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.exe4j.runtime.util.ReadIOException;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.FileOptions;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UninstallMode;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.api.windows.RegistryRoot;
/*     */ import com.install4j.api.windows.WinRegistry;
/*     */ import com.install4j.runtime.beans.actions.InstallFilesAction;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*     */ import com.install4j.runtime.installer.helper.FileAttributesHelper;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import com.install4j.runtime.installer.helper.content.apache.archivers.tar.TarArchiveEntry;
/*     */ import com.install4j.runtime.installer.helper.content.apache.archivers.tar.TarArchiveInputStream;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import com.install4j.runtime.installer.platform.macos.PlistHelper;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.PrintWriter;
/*     */ import java.nio.file.Files;
/*     */ import java.util.Objects;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Element;
/*     */ 
/*     */ public class JreInstaller {
/*  38 */   private String preferredJre = null;
/*     */   
/*     */   private File preferredJreFile;
/*  41 */   private long jreSize = -1L;
/*  42 */   private int jreCount = -1;
/*     */   
/*     */   private static final String JRE_DIR = "jre";
/*     */   
/*     */   private static final String JRE_TAR = "jre.tar";
/*     */   
/*     */   private static final String JRE_BUNDLE = "jre.bundle";
/*     */   private static final String SYSTEM_PREFS = ".systemPrefs";
/*  50 */   private static final boolean MANUAL_JRE = Boolean.getBoolean("exe4j.manualJre");
/*  51 */   private static final String USED_MAC_JRE_BUNDLE = System.getProperty("i4j.jreBundle");
/*  52 */   private static final String BUNDLED_MAC_TAR_FILE = System.getProperty("i4j.tarFile");
/*     */ 
/*     */   
/*  55 */   private static final String REGKEY_SHARED_JVMS = "SOFTWARE\\ej-technologies\\install4j\\" + ((Util.isWindows() && InstallerUtil.isAaarch64()) ? "sharedjvms_arm64\\" : "sharedjvms\\");
/*     */   
/*  57 */   private FileInstaller fileInstaller = FileInstaller.getInstance();
/*     */   
/*  59 */   private File destinationDirectory = null;
/*     */   
/*     */   private boolean sharedInstallation;
/*     */   
/*     */   private static final String JRE_BACKUP_DIR = "__i4j_jre_backup";
/*     */   private static JreInstaller instance;
/*     */   
/*     */   public static synchronized JreInstaller getInstance() {
/*  67 */     if (instance == null) {
/*  68 */       instance = new JreInstaller();
/*     */     }
/*  70 */     return instance;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void prepareUninstall(Context context, boolean uninstallForUpgrade) {
/*  77 */     if (!uninstallForUpgrade && !Util.isMacOS() && !Util.isWindows()) {
/*  78 */       this.fileInstaller.deleteRecursive(new File(new File(context.getInstallationDirectory(), "jre"), ".systemPrefs"));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long installJre(InstallerContext context, ProgressInterface progressInterface, InstallFilesAction installFilesAction, long maxProgress, long currentProgress) throws IOException, UserCanceledException {
/*  85 */     updateDestinationDirectory(context.getInstallationDirectory());
/*     */     
/*  87 */     UninstallMode uninstallMode = UninstallMode.IF_CREATED_BUT_NOT_FOR_UPDATE;
/*  88 */     if (this.sharedInstallation) {
/*  89 */       uninstallMode = UninstallMode.NEVER;
/*     */     }
/*     */     
/*  92 */     if (InstallerUtil.isWindows()) {
/*  93 */       File jreSourceDir = InstallerUtil.getAbsoluteFile(new File("jre"));
/*  94 */       if (jreSourceDir.exists()) {
/*  95 */         prepareJreDestDir(uninstallMode);
/*  96 */         currentProgress = installDir(context, jreSourceDir, this.destinationDirectory, progressInterface, installFilesAction, maxProgress, currentProgress, uninstallMode);
/*     */       } 
/*  98 */     } else if (Util.isMacosInstaller()) {
/*  99 */       prepareJreDestDir(uninstallMode);
/* 100 */       currentProgress = installDir(context, InstallerUtil.getAbsoluteFile(new File(USED_MAC_JRE_BUNDLE)), this.destinationDirectory, progressInterface, installFilesAction, maxProgress, currentProgress, uninstallMode);
/*     */     } else {
/* 102 */       File jreTarFile = InstallerUtil.getAbsoluteFile(new File("jre.tar"));
/* 103 */       if (jreTarFile.exists()) {
/* 104 */         prepareJreDestDir(uninstallMode);
/* 105 */         currentProgress = installTar(context, jreTarFile, this.destinationDirectory, InstallerUtil.getAbsoluteFile(new File("jre")), progressInterface, installFilesAction, maxProgress, currentProgress, uninstallMode);
/*     */       } 
/*     */     } 
/*     */     
/* 109 */     if (!Util.isMacosInstaller() && this.destinationDirectory != null) {
/* 110 */       File javaExe = new File(this.destinationDirectory, "bin/java" + (InstallerUtil.isWindows() ? "w.exe" : ""));
/* 111 */       if (javaExe.exists() && !(new File(this.destinationDirectory, "bin/jrockit")).exists()) {
/* 112 */         FileInstaller.getInstance().registerUninstallFile(context.getDestinationFile("jre/bin/client/classes.jsa"));
/* 113 */         FileInstaller.getInstance().registerUninstallFile(context.getDestinationFile("jre/bin/server/classes.jsa"));
/* 114 */         FileInstaller.getInstance().registerUninstallFile(context.getDestinationFile("jre/lib/i386/client/classes.jsa"));
/* 115 */         FileInstaller.getInstance().registerUninstallFile(context.getDestinationFile("jre/lib/sparc/client/classes.jsa"));
/* 116 */         FileInstaller.getInstance().registerUninstallFile(context.getDestinationFile("jre/lib/amd64/client/classes.jsa"));
/* 117 */         FileInstaller.getInstance().registerUninstallFile(context.getDestinationFile("jre/lib/i386/server/classes.jsa"));
/* 118 */         FileInstaller.getInstance().registerUninstallFile(context.getDestinationFile("jre/lib/sparc/server/classes.jsa"));
/* 119 */         FileInstaller.getInstance().registerUninstallFile(context.getDestinationFile("jre/lib/amd64/server/classes.jsa"));
/*     */         try {
/* 121 */           if (System.getProperty("java.vm.name", "").toLowerCase(Locale.ENGLISH).contains("hotspot")) {
/* 122 */             (new ProcessBuilder(new String[] { javaExe.getAbsolutePath(), "-Xshare:dump" })).start();
/*     */           }
/* 124 */         } catch (Throwable throwable) {}
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 130 */     return currentProgress;
/*     */   }
/*     */   
/*     */   private void prepareJreDestDir(UninstallMode uninstallMode) throws IOException {
/* 134 */     if (this.destinationDirectory.exists() && 
/* 135 */       !this.destinationDirectory.renameTo(new File(this.destinationDirectory.getParent(), "__i4j_jre_backup"))) {
/* 136 */       FileUtil.emptyDirectory(this.destinationDirectory);
/*     */     }
/*     */ 
/*     */     
/* 140 */     FileInstaller.getInstance().createDirectory(this.destinationDirectory, uninstallMode);
/* 141 */     addPreferredJreToRegistry(this.destinationDirectory);
/*     */   }
/*     */   
/*     */   private void addPreferredJreToRegistry(File jreDir) {
/* 145 */     if (this.sharedInstallation && InstallerUtil.isWindows()) {
/* 146 */       String sharingKey = InstallerConfig.getCurrentInstance().getJreSharingKey();
/* 147 */       if (!sharingKey.isEmpty()) {
/* 148 */         String keyName = REGKEY_SHARED_JVMS + sharingKey + "\\" + jreDir.getAbsolutePath().replace('\\', '/') + "/bin/java.exe";
/* 149 */         if (!WinRegistry.createKey(RegistryRoot.HKEY_LOCAL_MACHINE, keyName)) {
/* 150 */           WinRegistry.createKey(RegistryRoot.HKEY_CURRENT_USER, keyName);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void updateDestinationDirectory(File installationDirectory) {
/* 157 */     this.destinationDirectory = null;
/*     */     
/* 159 */     String sharingKey = InstallerConfig.getCurrentInstance().getJreSharingKey();
/* 160 */     if (!sharingKey.isEmpty()) {
/* 161 */       File sharedDir = null;
/* 162 */       if (Util.hasFullAdminRights() || InstallerUtil.isWindows()) {
/*     */         
/* 164 */         if (InstallerUtil.isWindows()) {
/* 165 */           parent = FolderInfo.getCommonFilesDirectory();
/*     */         } else {
/* 167 */           parent = new File(InstallerUtil.getStandardApplicationsDirectory(false));
/*     */         } 
/* 169 */         File parent = new File(parent, "i4j_jres");
/* 170 */         sharedDir = getSharedJreSubdir(new File(parent, sharingKey), Boolean.getBoolean("install4j.shareJreAppendBitness"));
/*     */       } 
/*     */       
/* 173 */       if (sharedDir != null && InstallerUtil.checkWritableInstallationDirectory(sharedDir, false)) {
/* 174 */         this.sharedInstallation = true;
/* 175 */         this.destinationDirectory = sharedDir;
/*     */       } else {
/* 177 */         if (InstallerUtil.isWindows()) {
/* 178 */           File programFilesCommon = WinFileSystem.getSpecialFolder(SpecialFolder.PROGRAM_FILES_COMMON, false);
/* 179 */           if (programFilesCommon != null) {
/* 180 */             sharedDir = getSharedJreSubdir(new File(new File(programFilesCommon, "i4j_jres"), sharingKey), true);
/* 181 */             if (InstallerUtil.checkWritableInstallationDirectory(sharedDir, false)) {
/* 182 */               this.sharedInstallation = true;
/* 183 */               this.destinationDirectory = sharedDir;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 188 */         if (this.destinationDirectory == null) {
/* 189 */           sharedDir = getSharedJreSubdir(new File(new File(getUserAppDataDir(), "i4j_jres"), sharingKey), true);
/* 190 */           if (InstallerUtil.checkWritableInstallationDirectory(sharedDir, false)) {
/* 191 */             this.sharedInstallation = true;
/* 192 */             this.destinationDirectory = sharedDir;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 198 */     if (this.destinationDirectory == null) {
/* 199 */       this.sharedInstallation = false;
/* 200 */       if (Util.isMacosInstaller()) {
/* 201 */         if (InstallerConfig.getCurrentInstance().getMacSpecificConfig().isSingleBundle()) {
/* 202 */           this.destinationDirectory = new File(new File(installationDirectory, InstallerConfig.getCurrentInstance().getMacSpecificConfig().getSingleBundleName()), "Contents/PlugIns/jre.bundle");
/*     */         } else {
/* 204 */           this.destinationDirectory = new File(installationDirectory, ".install4j/jre.bundle");
/*     */         } 
/*     */       } else {
/* 207 */         this.destinationDirectory = new File(installationDirectory, "jre");
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static String getUserAppDataDir() {
/* 214 */     String appData = InstallerVariables.getStringVariable("sys.appdataDir");
/* 215 */     if (appData != null) {
/* 216 */       return appData;
/*     */     }
/* 218 */     return InstallerVariables.getAppDataDir();
/*     */   }
/*     */ 
/*     */   
/*     */   private static File getSharedJreSubdir(File parent, boolean appendBitness) {
/* 223 */     String version = InstallerConfig.getCurrentInstance().getJreVersion().trim();
/* 224 */     String suffix = (InstallerUtil.isWindows() && InstallerUtil.isArm()) ? "_arm" : "";
/* 225 */     if (appendBitness) {
/* 226 */       suffix = suffix + (InstallerUtil.is32BitJVM() ? "_32" : "_64");
/*     */     }
/* 228 */     if (!Objects.equals(version, "")) {
/* 229 */       return new File(parent, version + suffix);
/*     */     }
/* 231 */     int jreNumber = 1;
/* 232 */     File sharedJreDir = new File(parent, "jre" + jreNumber + suffix);
/* 233 */     while (sharedJreDir.exists()) {
/* 234 */       jreNumber++;
/* 235 */       sharedJreDir = new File(parent, "jre" + jreNumber + suffix);
/*     */     } 
/* 237 */     return sharedJreDir;
/*     */   }
/*     */ 
/*     */   
/*     */   private long installTar(InstallerContext context, File jreTarFile, File destDir, File unpackedDir, ProgressInterface progressInterface, InstallFilesAction installFilesAction, long maxProgress, long currentProgress, UninstallMode uninstallMode) throws IOException, UserCanceledException {
/*     */     TarArchiveInputStream in;
/*     */     try {
/* 244 */       InputStream baseIn = new BufferedInputStream(new FileInputStream(jreTarFile));
/* 245 */       if (jreTarFile.getName().endsWith(".gz")) {
/*     */         try {
/* 247 */           baseIn = new GZIPInputStream(baseIn);
/* 248 */         } catch (Throwable throwable) {}
/*     */       }
/*     */ 
/*     */       
/* 252 */       in = new TarArchiveInputStream(baseIn);
/* 253 */     } catch (Exception e) {
/* 254 */       throw new ReadIOException(e);
/*     */     } 
/*     */     
/*     */     try {
/*     */       TarArchiveEntry tarEntry;
/*     */       try {
/* 260 */         tarEntry = in.getNextTarEntry();
/* 261 */       } catch (Exception e) {
/* 262 */         throw new ReadIOException(e);
/*     */       } 
/* 264 */       while (tarEntry != null) {
/* 265 */         if (context.isCancelling()) throw new UserCanceledException();
/*     */         
/* 267 */         boolean isPackedFile = false;
/* 268 */         String name = tarEntry.getName();
/* 269 */         if (name.endsWith("jar.pack")) {
/* 270 */           name = name.substring(0, name.length() - 5);
/* 271 */           isPackedFile = true;
/*     */         } 
/* 273 */         progressInterface.setDetailMessage(InstallerUtil.cleanupName(name));
/* 274 */         File destFile = new File(destDir, name);
/*     */         
/* 276 */         if (tarEntry.isSymbolicLink()) {
/* 277 */           currentProgress += 153600L;
/* 278 */           UnixFileSystem.createLink(tarEntry.getLinkName(), destFile);
/* 279 */           this.fileInstaller.registerUninstallFile(destFile);
/* 280 */         } else if (tarEntry.isDirectory()) {
/* 281 */           currentProgress += 153600L;
/* 282 */           this.fileInstaller.createDirectory(destFile, uninstallMode);
/*     */         } else {
/* 284 */           long nextProgress = currentProgress + 153600L + tarEntry.getSize();
/* 285 */           FileOptions fileOptions = new FileOptions();
/* 286 */           fileOptions.setMode(tarEntry.getMode());
/* 287 */           fileOptions.setUninstallMode(uninstallMode);
/* 288 */           fileOptions.setFileTime(tarEntry.getModTime().getTime());
/* 289 */           fileOptions.setDelayIfNecessary(installFilesAction.isDelay());
/* 290 */           if (isPackedFile) {
/* 291 */             this.fileInstaller.install(new File(unpackedDir, name), destFile, fileOptions, (ProgressInterface)new ProgressAdapter(progressInterface, (int)(currentProgress * 100L / maxProgress), (int)(nextProgress * 100L / maxProgress)));
/*     */           } else {
/*     */             
/* 294 */             this.fileInstaller.install((InputStream)in, destFile, fileOptions, (ProgressInterface)new ProgressAdapter(progressInterface, (int)(currentProgress * 100L / maxProgress), (int)(nextProgress * 100L / maxProgress)), tarEntry
/*     */                 
/* 296 */                 .getSize(), false);
/*     */           } 
/* 298 */           currentProgress = nextProgress;
/*     */         } 
/* 300 */         progressInterface.setPercentCompleted((int)(currentProgress * 100L / maxProgress));
/*     */         
/*     */         try {
/* 303 */           tarEntry = in.getNextTarEntry();
/* 304 */         } catch (Exception e) {
/* 305 */           throw new ReadIOException(e);
/*     */         } 
/*     */       } 
/*     */     } finally {
/*     */       try {
/* 310 */         in.close();
/* 311 */       } catch (Exception e) {
/*     */         
/* 313 */         throw new ReadIOException(e);
/*     */       } 
/*     */     } 
/* 316 */     return currentProgress;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private long installDir(InstallerContext context, File sourceDir, File destDir, ProgressInterface progressInterface, InstallFilesAction installFilesAction, long maxProgress, long currentProgress, UninstallMode uninstallMode) throws IOException, UserCanceledException {
/* 323 */     File[] children = sourceDir.listFiles();
/* 324 */     if (children != null) {
/* 325 */       for (File child : children) {
/* 326 */         if (context.isCancelling()) {
/* 327 */           throw new UserCanceledException();
/*     */         }
/*     */         
/* 330 */         progressInterface.setDetailMessage(InstallerUtil.cleanupName(child.getName()));
/* 331 */         File destFile = new File(destDir, child.getName());
/*     */         
/* 333 */         if (!handledSymlink(child, destFile)) {
/* 334 */           if (child.isDirectory()) {
/* 335 */             this.fileInstaller.createDirectory(destFile, uninstallMode);
/* 336 */             currentProgress = installDir(context, child, destFile, progressInterface, installFilesAction, maxProgress, currentProgress, uninstallMode);
/* 337 */             currentProgress += 153600L;
/*     */           } else {
/* 339 */             long nextProgress = currentProgress + 153600L + child.length();
/* 340 */             FileOptions fileOptions = new FileOptions();
/* 341 */             fileOptions.setUninstallMode(uninstallMode);
/* 342 */             fileOptions.setFileTime(child.lastModified());
/* 343 */             fileOptions.setDelayIfNecessary(installFilesAction.isDelay());
/* 344 */             this.fileInstaller.install(child, destFile, fileOptions, (ProgressInterface)new ProgressAdapter(progressInterface, (int)(currentProgress * 100L / maxProgress), (int)(nextProgress * 100L / maxProgress)));
/*     */             
/* 346 */             updatePosixMode(child, destFile);
/* 347 */             currentProgress = nextProgress;
/*     */           } 
/* 349 */           progressInterface.setPercentCompleted((int)(currentProgress * 100L / maxProgress));
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 354 */     return currentProgress;
/*     */   }
/*     */   
/*     */   private void updatePosixMode(File sourceFile, File destFile) throws IOException {
/* 358 */     if (Util.isMacosInstaller() && sourceFile.exists() && destFile.exists()) {
/* 359 */       String mode = FileAttributesHelper.getPosixFilePermissions(sourceFile);
/* 360 */       UnixFileSystem.setMode(mode, destFile);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean handledSymlink(File sourceFile, File destFile) throws IOException {
/* 365 */     if (Util.isMacosInstaller() && 
/* 366 */       Files.isSymbolicLink(sourceFile.toPath())) {
/* 367 */       destFile.delete();
/* 368 */       String target = Files.readSymbolicLink(sourceFile.toPath()).toString();
/* 369 */       UnixFileSystem.createLink(target, destFile);
/* 370 */       this.fileInstaller.registerUninstallFile(destFile);
/* 371 */       return true;
/*     */     } 
/*     */     
/* 374 */     return false;
/*     */   }
/*     */   
/*     */   public boolean checkJreInstallation(File installationDirectory) throws IOException {
/* 378 */     updateDestinationDirectory(installationDirectory);
/*     */     
/* 380 */     if (MANUAL_JRE && this.preferredJre == null) {
/*     */       
/*     */       try {
/* 383 */         String javaHome = (new File(System.getProperty("java.home"))).getCanonicalPath();
/* 384 */         if (!javaHome.startsWith((new File(System.getProperty("user.dir"))).getCanonicalPath())) {
/* 385 */           this.preferredJre = javaHome;
/*     */         }
/* 387 */       } catch (IOException e) {
/* 388 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */     
/* 392 */     boolean hasJreBundle = false;
/* 393 */     if (Util.isMacosInstaller()) {
/* 394 */       if (BUNDLED_MAC_TAR_FILE != null) {
/* 395 */         hasJreBundle = true;
/* 396 */       } else if (USED_MAC_JRE_BUNDLE != null && !USED_MAC_JRE_BUNDLE.startsWith("/System") && !USED_MAC_JRE_BUNDLE.startsWith("/Library") && !Objects.equals(this.destinationDirectory.getCanonicalPath(), (new File(USED_MAC_JRE_BUNDLE)).getCanonicalPath())) {
/* 397 */         String version = getCurrentMacJreVersion();
/* 398 */         if (version == null) {
/* 399 */           Logger.getInstance().log(this, "JRE will be copied from " + USED_MAC_JRE_BUNDLE, true);
/* 400 */           hasJreBundle = true;
/*     */         } else {
/* 402 */           Logger.getInstance().log(this, "Current installed JRE version at " + this.destinationDirectory + " is " + version, true);
/*     */           
/* 404 */           if (!VersionCheck.checkJavaVersionCompatible(InstallerConfig.getCurrentInstance().getMinJavaVersion(), version)) {
/* 405 */             Logger.getInstance().log(this, "JRE will be replaced", true);
/* 406 */             hasJreBundle = true;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } else {
/* 411 */       hasJreBundle = (InstallerUtil.getAbsoluteFile(new File("jre")).exists() && (InstallerUtil.isWindows() || InstallerUtil.getAbsoluteFile(new File("jre.tar")).exists()));
/*     */     } 
/* 413 */     if (hasJreBundle) {
/*     */       
/* 415 */       if (this.preferredJre == null) {
/* 416 */         this.preferredJre = this.destinationDirectory.getAbsolutePath();
/*     */       }
/*     */       
/* 419 */       if (this.sharedInstallation || Boolean.getBoolean("install4j.preventJreBundleUpdate")) {
/* 420 */         if (!this.destinationDirectory.isDirectory() || !anyIsFile(this.destinationDirectory, new String[] { "lib/rt.jar", "jre/lib/rt.jar", "lib/modules" })) {
/* 421 */           return true;
/*     */         }
/* 423 */         return false;
/*     */       } 
/*     */       
/* 426 */       return true;
/*     */     } 
/*     */     
/* 429 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean anyIsFile(File baseDir, String... names) {
/* 434 */     for (String name : names) {
/* 435 */       if ((new File(baseDir, name)).isFile()) {
/* 436 */         return true;
/*     */       }
/*     */     } 
/* 439 */     return false;
/*     */   }
/*     */   
/*     */   private String getCurrentMacJreVersion() {
/* 443 */     File infoPlist = new File(this.destinationDirectory, "Contents/Info.plist");
/* 444 */     if (infoPlist.exists()) {
/*     */       try {
/* 446 */         Document document = XmlHelper.parseFile(infoPlist);
/*     */         
/* 448 */         Element element = document.getDocumentElement();
/* 449 */         return XmlHelper.getTextValue(PlistHelper.findValue(PlistHelper.getFirstChild(element, "dict"), "CFBundleVersion"));
/* 450 */       } catch (IOException e) {
/* 451 */         Logger.getInstance().log(e);
/*     */       } 
/*     */     }
/* 454 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public long getJreSize() throws IOException {
/* 459 */     if (this.jreSize == -1L) {
/* 460 */       initJreSizeAndCount();
/*     */     }
/* 462 */     return this.jreSize;
/*     */   }
/*     */   
/*     */   private void initJreSizeAndCount() throws IOException {
/* 466 */     if (InstallerUtil.isWindows()) {
/* 467 */       File jreDir = InstallerUtil.getAbsoluteFile(new File("jre"));
/* 468 */       this.jreSize = countSize(jreDir);
/* 469 */       this.jreCount = countFilesAndDirs(jreDir);
/* 470 */     } else if (Util.isMacosInstaller()) {
/* 471 */       this.jreSize = 0L;
/* 472 */       this.jreCount = 0;
/*     */       
/* 474 */       if (BUNDLED_MAC_TAR_FILE != null || (USED_MAC_JRE_BUNDLE != null && !USED_MAC_JRE_BUNDLE.startsWith("/System") && !USED_MAC_JRE_BUNDLE.startsWith("/Library"))) {
/* 475 */         File jreDir = InstallerUtil.getAbsoluteFile(new File(USED_MAC_JRE_BUNDLE));
/* 476 */         this.jreSize = countSize(jreDir);
/* 477 */         this.jreCount = countFilesAndDirs(jreDir);
/*     */       } 
/*     */     } else {
/* 480 */       this.jreSize = 0L;
/* 481 */       this.jreCount = 0;
/*     */       
/* 483 */       File jreTarFile = InstallerUtil.getAbsoluteFile(new File("jre.tar"));
/* 484 */       if (jreTarFile.exists()) {
/* 485 */         TarArchiveInputStream in = new TarArchiveInputStream(new BufferedInputStream(new FileInputStream(jreTarFile)));
/* 486 */         TarArchiveEntry entry = in.getNextTarEntry();
/* 487 */         while (entry != null) {
/* 488 */           this.jreCount++;
/* 489 */           this.jreSize += entry.getSize();
/* 490 */           entry = in.getNextTarEntry();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public int getJreCount() throws IOException {
/* 498 */     if (this.jreCount == -1) {
/* 499 */       initJreSizeAndCount();
/*     */     }
/* 501 */     return this.jreCount;
/*     */   }
/*     */   
/*     */   private static int countFilesAndDirs(File dir) {
/* 505 */     int ret = 0;
/* 506 */     File[] children = dir.listFiles();
/* 507 */     if (children != null) {
/* 508 */       for (File child : children) {
/* 509 */         ret++;
/* 510 */         if (child.isDirectory()) {
/* 511 */           ret += countFilesAndDirs(child);
/*     */         }
/*     */       } 
/*     */     }
/* 515 */     return ret;
/*     */   }
/*     */   
/*     */   private static long countSize(File dir) {
/* 519 */     long ret = 0L;
/* 520 */     File[] children = dir.listFiles();
/* 521 */     if (children != null) {
/* 522 */       for (File child : children) {
/* 523 */         if (child.isDirectory()) {
/* 524 */           ret += countSize(child);
/*     */         } else {
/* 526 */           ret += child.length();
/*     */         } 
/*     */       } 
/*     */     }
/* 530 */     return ret;
/*     */   }
/*     */   public void writePreferredJre(File runtimeDir) throws UserCanceledException, IOException {
/*     */     String variableValue;
/* 534 */     writeOneLineFile(new File(runtimeDir, "inst_jre.cfg"), System.getProperty("java.home"));
/* 535 */     this.preferredJreFile = new File(runtimeDir, "pref_jre.cfg");
/* 536 */     if (this.preferredJre != null) {
/* 537 */       writeOneLineFile(this.preferredJreFile, this.preferredJre);
/*     */     }
/*     */ 
/*     */     
/* 541 */     if (this.preferredJre == null) {
/* 542 */       variableValue = System.getProperty("java.home");
/* 543 */     } else if (Util.isMacOS() && this.preferredJre.endsWith(".bundle")) {
/* 544 */       variableValue = this.preferredJre + "/Contents/Home/jre";
/* 545 */       if (!(new File(variableValue)).isDirectory()) {
/* 546 */         variableValue = this.preferredJre + "/Contents/Home";
/*     */       }
/*     */     } else {
/* 549 */       variableValue = this.preferredJre;
/*     */     } 
/* 551 */     setPreferredJreVariable(variableValue);
/*     */   }
/*     */   
/*     */   private void setPreferredJreVariable(String variableValue) {
/* 555 */     InstallerVariables.setVariable("sys.preferredJre", variableValue);
/*     */   }
/*     */   
/*     */   public void setPreferredJre(String preferredJre) {
/* 559 */     this.preferredJre = preferredJre;
/* 560 */     setPreferredJreVariable(preferredJre);
/* 561 */     if (preferredJre != null && this.preferredJreFile != null) {
/*     */       try {
/* 563 */         writeOneLineFile(this.preferredJreFile, preferredJre);
/* 564 */       } catch (IOException|UserCanceledException e) {
/* 565 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private void writeOneLineFile(File file, String line) throws IOException, UserCanceledException {
/* 571 */     this.fileInstaller.createDirectory(file.getParentFile());
/* 572 */     File tempFile = File.createTempFile("i4j", null);
/* 573 */     PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
/* 574 */     pw.println(line);
/* 575 */     pw.close();
/* 576 */     FileInstaller.getInstance().install(tempFile, file, new FileOptions("644", OverwriteMode.ALWAYS, false));
/* 577 */     tempFile.delete();
/*     */   }
/*     */ 
/*     */   
/*     */   public void cleanup() {
/* 582 */     if (this.destinationDirectory != null) {
/* 583 */       File backupDir = new File(this.destinationDirectory.getParent(), "__i4j_jre_backup");
/* 584 */       if (backupDir.exists()) {
/* 585 */         FileUtil.deleteDirectory(backupDir);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void rollback() {
/* 591 */     if (this.destinationDirectory != null) {
/* 592 */       File backupDir = new File(this.destinationDirectory.getParent(), "__i4j_jre_backup");
/* 593 */       if (backupDir.exists()) {
/* 594 */         FileUtil.deleteDirectory(this.destinationDirectory);
/* 595 */         if (!backupDir.renameTo(this.destinationDirectory)) {
/* 596 */           this.destinationDirectory.mkdirs();
/*     */           try {
/* 598 */             FileUtil.copyDirectory(backupDir, this.destinationDirectory, true);
/* 599 */           } catch (IOException e) {
/* 600 */             e.printStackTrace();
/*     */           } 
/* 602 */           FileUtil.deleteDirectory(backupDir);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\JreInstaller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */