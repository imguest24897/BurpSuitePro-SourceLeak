/*     */ package com.install4j.runtime.installer.helper.content;
/*     */ import com.exe4j.runtime.util.ReadIOException;
/*     */ import com.install4j.api.ApplicationRegistry;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.ScriptProperty;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.FileInfo;
/*     */ import com.install4j.api.context.FileOptions;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.LauncherSetup;
/*     */ import com.install4j.api.context.LauncherType;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UninstallMode;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.runtime.beans.actions.AbstractInstallFilesAction;
/*     */ import com.install4j.runtime.beans.actions.InstallFilesAction;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchLongAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.helper.content.xz.LZMAInputStream;
/*     */ import com.install4j.runtime.installer.helper.fileinst.FileInstaller;
/*     */ import com.install4j.runtime.installer.platform.macos.MacFileSystem;
/*     */ import java.io.BufferedInputStream;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import java.util.zip.ZipEntry;
/*     */ import java.util.zip.ZipInputStream;
/*     */ 
/*     */ public class ContentInstaller {
/*  48 */   private static ExecutionContext executionContext = ExecutionContext.UNELEVATED;
/*     */   public static final double DISK_SPACE_SAFETY_MARGIN_FACTOR = 1.1D;
/*  50 */   private FileInstaller fileInstaller = FileInstaller.getInstance();
/*  51 */   private JreInstaller jreInstaller = JreInstaller.getInstance();
/*     */   
/*  53 */   private Set<String> installedUserJars = new HashSet<>();
/*     */   
/*  55 */   private static ContentInstaller instance = new ContentInstaller();
/*     */   
/*     */   public static final long FILE_WEIGHT = 153600L;
/*     */ 
/*     */   
/*     */   public static ContentInstaller getInstance() {
/*  61 */     return instance;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ExecutionContext getExecutionContext() {
/*  68 */     return executionContext;
/*     */   }
/*     */   
/*     */   public static void setExecutionContext(final ExecutionContext executionContext) {
/*  72 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*  75 */             ContentInstaller.executionContext = executionContext;
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void doStandardInstallation(InstallerContext context, ProgressInterface progressInterface, InstallFilesAction installFilesAction) throws IOException, UserCanceledException {
/*  83 */     if (context.isCancelling()) {
/*     */       return;
/*     */     }
/*     */     
/*  87 */     if (HelperCommunication.getInstance().isElevatedHelper()) {
/*  88 */       setExecutionContext(ExecutionContext.MAXIMUM);
/*     */     }
/*     */     
/*  91 */     boolean installRuntime = installFilesAction.isInstallRuntime();
/*     */     
/*  93 */     if (installRuntime) {
/*  94 */       this.fileInstaller.createDirectory(context.getInstallationDirectory());
/*     */     }
/*     */     
/*  97 */     progressInterface.setStatusMessage(Messages.getString(".StatusExtractFiles"));
/*  98 */     progressInterface.setDetailMessage("");
/*     */     
/* 100 */     ContentStats contentStats = ContentStats.getInstance();
/*     */     
/* 102 */     long maxProgress = contentStats.getSelectedContentSize();
/* 103 */     long fileCount = contentStats.getSelectedContentCount();
/*     */     
/* 105 */     boolean installJre = (!isNoJreInstallation() && this.jreInstaller.checkJreInstallation(context.getInstallationDirectory()));
/* 106 */     if (installJre && installRuntime) {
/* 107 */       maxProgress += this.jreInstaller.getJreSize();
/* 108 */       fileCount += this.jreInstaller.getJreCount();
/*     */     } 
/*     */     
/* 111 */     progressInterface.setStatusMessage(Messages.getString(".StatusExtractFiles"));
/* 112 */     progressInterface.setDetailMessage("");
/* 113 */     ContextInt contextInt = ContextImpl.getContextInt((Context)context);
/* 114 */     contextInt.fireInstallerEvent((InstallerEvent)new InstallerFileInstallationEvent(contextInt.getEventSource(), (Context)context, EventType.FILE_INSTALLATION_STARTED, maxProgress, fileCount));
/*     */     
/* 116 */     maxProgress += 153600L * fileCount;
/* 117 */     long currentProgress = 0L;
/*     */     
/* 119 */     Map<Comparable<String>, InputStream> contentNumbersToStreams = (new ContentCollector(context, installFilesAction.isSaveDownloadedFiles(), installFilesAction.isAcceptAllCertificates())).collectContentStreams(null);
/*     */     
/* 121 */     progressInterface.setStatusMessage(Messages.getString(".StatusExtractFiles"));
/* 122 */     progressInterface.setDetailMessage("");
/*     */     
/* 124 */     boolean singleBundleInstaller = (Util.isMacosInstaller() && InstallerConfig.getCurrentInstance().getMacSpecificConfig().isSingleBundle());
/* 125 */     if (singleBundleInstaller) {
/* 126 */       InstallerConfig config = InstallerConfig.getCurrentInstance();
/* 127 */       File resourceAppDir = new File(context.getInstallationDirectory(), config.getMacSpecificConfig().getRuntimeDirParent());
/* 128 */       File realAppDir = new File(resourceAppDir.getParentFile().getParentFile(), "java/app");
/* 129 */       realAppDir.getParentFile().mkdirs();
/* 130 */       if (resourceAppDir.exists() && !realAppDir.exists()) {
/* 131 */         UnixFileSystem.FileInformation resourceAppDirInfo = UnixFileSystem.getFileInformation(resourceAppDir);
/* 132 */         if (resourceAppDirInfo == null || !resourceAppDirInfo.isLink()) {
/* 133 */           resourceAppDir.renameTo(realAppDir);
/*     */         }
/*     */       } 
/* 136 */       realAppDir.mkdirs();
/* 137 */       resourceAppDir.getParentFile().mkdirs();
/* 138 */       UnixFileSystem.createLink("../java/app", resourceAppDir);
/*     */     } 
/*     */     
/* 141 */     if (installJre && installRuntime) {
/* 142 */       currentProgress = this.jreInstaller.installJre(context, progressInterface, installFilesAction, maxProgress, currentProgress);
/*     */     }
/*     */     
/* 145 */     for (InputStream contentStream : contentNumbersToStreams.values()) {
/* 146 */       currentProgress = installContent(context, contentStream, progressInterface, true, (AbstractInstallFilesAction)installFilesAction, maxProgress, currentProgress);
/*     */     }
/*     */     
/* 149 */     progressInterface.setDetailMessage("");
/* 150 */     if (installRuntime) {
/* 151 */       this.jreInstaller.writePreferredJre(context.getDestinationFile(".install4j"));
/* 152 */       createRuntimeDirectory((Context)context, installFilesAction);
/*     */     } 
/*     */     
/* 155 */     if (context.getInstallationDirectory().isDirectory() && (Util.isUnixInstaller() || (Util.isMacosInstaller() && !singleBundleInstaller))) {
/* 156 */       FileOptions fileOptions = InstallerConfig.getCurrentInstance().getOptions("");
/* 157 */       if (fileOptions != null) {
/* 158 */         UnixFileSystem.setMode(fileOptions.getMode(), context.getInstallationDirectory());
/*     */       }
/*     */     } 
/*     */     
/* 162 */     if (!context.isCancelling()) {
/* 163 */       progressInterface.setPercentCompleted(100);
/*     */     }
/*     */     
/* 166 */     refreshBundle();
/*     */   }
/*     */   
/*     */   private static boolean isNoJreInstallation() {
/* 170 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws Exception {
/* 173 */             return Boolean.getBoolean("install4j.noJreInstallation");
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static void refreshBundle() {
/* 179 */     if (Util.isMacosInstaller())
/* 180 */       HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) throws Exception {
/* 183 */               InstallerConfig config = InstallerConfig.getCurrentInstance();
/* 184 */               if (config.getMacSpecificConfig().isSingleBundle()) {
/* 185 */                 File bundleDir = context.getDestinationFile(config.getMacSpecificConfig().getSingleBundleName());
/* 186 */                 if (bundleDir.isDirectory()) {
/* 187 */                   if (!HelperCommunication.getInstance().isElevatedHelper()) {
/* 188 */                     Logger.getInstance().info(null, "refreshing " + bundleDir);
/*     */                   }
/* 190 */                   MacFileSystem.notifyBundleChange(bundleDir);
/*     */                 } 
/*     */               } else {
/* 193 */                 for (LauncherSetup launcher : context.getLaunchers()) {
/* 194 */                   if (launcher.getType() == LauncherType.GUI || launcher.getType() == LauncherType.INSTALLER_APPLICATION) {
/* 195 */                     File bundleDir = context.getDestinationFile(launcher.getRelativeFileName());
/* 196 */                     if (bundleDir.isDirectory()) {
/* 197 */                       if (!HelperCommunication.getInstance().isElevatedHelper()) {
/* 198 */                         Logger.getInstance().info(null, "refreshing " + bundleDir);
/*     */                       }
/* 200 */                       MacFileSystem.notifyBundleChange(bundleDir);
/*     */                     } 
/*     */                   } 
/*     */                 } 
/*     */               } 
/*     */             }
/*     */           }); 
/*     */   }
/*     */   
/*     */   private long installContent(InstallerContext context, InputStream in, ProgressInterface progressInterface, boolean installInSingleBundle, AbstractInstallFilesAction installFilesAction, long maxProgress, long currentProgress) throws IOException, UserCanceledException {
/*     */     ZipEntry zipEntry;
/*     */     ZipInputStream zipIn;
/*     */     try {
/*     */       LZMAInputStream lZMAInputStream;
/* 214 */       in = new BufferedInputStream(in);
/* 215 */       if (InstallerConfig.getCurrentInstance().isLzmaCompression()) {
/*     */         try {
/* 217 */           lZMAInputStream = new LZMAInputStream(in);
/* 218 */         } catch (OutOfMemoryError e) {
/* 219 */           throw new ReadIOException(e);
/*     */         } 
/*     */       }
/* 222 */       zipIn = new ZipInputStream((InputStream)lZMAInputStream);
/*     */       
/* 224 */       zipEntry = zipIn.getNextEntry();
/* 225 */     } catch (Exception e) {
/* 226 */       throw new ReadIOException(e);
/*     */     } 
/* 228 */     while (zipEntry != null) {
/* 229 */       if (context.isCancelling()) {
/* 230 */         throw new UserCanceledException();
/*     */       }
/*     */       
/* 233 */       String entryName = zipEntry.getName();
/* 234 */       if (InstallerUtil.isWindows()) {
/* 235 */         entryName = entryName.replace('/', '\\');
/*     */       } else {
/* 237 */         entryName = entryName.replace('\\', '/');
/*     */       } 
/*     */       
/* 240 */       InputStream usedIn = zipIn;
/* 241 */       boolean isUserJarLink = false;
/* 242 */       String linkTarget = null;
/* 243 */       if (entryName.endsWith(".i4jlnk") && !zipEntry.isDirectory() && zipEntry.getSize() >= 5L && zipEntry.getSize() < 5000L) {
/* 244 */         ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
/* 245 */         FileUtil.pumpStream(usedIn, outputStream);
/* 246 */         byte[] data = outputStream.toByteArray();
/* 247 */         if (data.length >= 5) {
/* 248 */           DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(data));
/* 249 */           if (dataInputStream.readInt() == -387705896) {
/* 250 */             int type = dataInputStream.readByte();
/* 251 */             if (type == 1) {
/* 252 */               isUserJarLink = true;
/* 253 */             } else if (type == 2) {
/* 254 */               linkTarget = dataInputStream.readUTF();
/*     */             } 
/*     */           } 
/*     */         } 
/*     */         
/* 259 */         if (isUserJarLink || linkTarget != null) {
/* 260 */           entryName = entryName.substring(0, entryName.length() - ".i4jlnk".length());
/*     */         } else {
/* 262 */           usedIn = new ByteArrayInputStream(data);
/*     */         } 
/*     */       } 
/*     */       
/* 266 */       FileInfo fileInfo = ContextImpl.getContextInt((Context)context).getDestinationFileInfo(entryName, installInSingleBundle);
/*     */       
/* 268 */       progressInterface.setDetailMessage(InstallerUtil.cleanupName(fileInfo.getRelativeFilePath()));
/*     */       
/* 270 */       File installationDirectoryForFile = fileInfo.getRootResolved();
/*     */       
/* 272 */       boolean shouldInstall = true;
/* 273 */       String filesetId = fileInfo.getFilesetId();
/* 274 */       if (filesetId.length() > 0 && !context.getFileSetById(filesetId).isSelected()) {
/* 275 */         shouldInstall = false;
/*     */       }
/* 277 */       else if (installationDirectoryForFile != null) {
/* 278 */         if ((fileInfo.getRootUnresolved() != null && Objects.equals(fileInfo.getRelativeFilePath(), "\\")) || 
/* 279 */           Objects.equals(fileInfo.getRelativeFilePath(), "/") || Objects.equals(fileInfo.getRelativeFilePath(), "")) {
/* 280 */           shouldInstall = false;
/*     */         } else {
/* 282 */           ScriptProperty fileFilterScript = installFilesAction.getFileFilterScript();
/* 283 */           if (fileFilterScript != null) {
/*     */             try {
/* 285 */               Boolean shouldInstallBoolean = (Boolean)context.runScript(fileFilterScript, (Bean)installFilesAction, new Object[] { fileInfo });
/* 286 */               shouldInstall = (shouldInstallBoolean == null || shouldInstallBoolean.booleanValue());
/* 287 */             } catch (Exception e) {
/* 288 */               Util.printAnnotatedStackTrace(e);
/* 289 */               Logger.getInstance().log(e);
/* 290 */               shouldInstall = false;
/*     */             } 
/*     */           }
/*     */           
/* 294 */           ScriptProperty directoryResolverScript = installFilesAction.getDirectoryResolverScript();
/* 295 */           if (shouldInstall && directoryResolverScript != null) {
/*     */             try {
/* 297 */               File directory = (File)context.runScript(directoryResolverScript, (Bean)installFilesAction, new Object[] { fileInfo });
/* 298 */               if (directory != null) {
/* 299 */                 installationDirectoryForFile = directory;
/*     */               }
/* 301 */             } catch (Exception e) {
/* 302 */               Util.printAnnotatedStackTrace(e);
/* 303 */               Logger.getInstance().log(e);
/* 304 */               shouldInstall = false;
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */       
/* 310 */       if (installationDirectoryForFile == null) {
/* 311 */         shouldInstall = false;
/*     */       }
/*     */ 
/*     */       
/* 315 */       InstallerConfig config = InstallerConfig.getCurrentInstance();
/*     */       
/* 317 */       long nextProgress = currentProgress + 153600L;
/* 318 */       File destFile = new File(installationDirectoryForFile, fileInfo.getRelativeFilePath());
/* 319 */       long lastModified = zipEntry.getTime();
/*     */       
/* 321 */       lastModified += TimeZone.getDefault().getOffset(lastModified);
/* 322 */       if (linkTarget != null) {
/* 323 */         if (shouldInstall) {
/* 324 */           FileOptions fileOptions = initOptions(installFilesAction, entryName, config, lastModified);
/* 325 */           this.fileInstaller.installSymlink(linkTarget, destFile, fileOptions, progressInterface);
/*     */         } 
/* 327 */       } else if (zipEntry.isDirectory()) {
/* 328 */         if (shouldInstall) {
/* 329 */           FileOptions fileOptions = config.getOptions(entryName);
/* 330 */           if (FileInstaller.getRemoveSignatureType(fileOptions) != RemoveSignatureType.REMOVE_FILE) {
/* 331 */             UninstallMode uninstallMode = UninstallMode.IF_CREATED;
/* 332 */             if (fileOptions != null) {
/* 333 */               uninstallMode = fileOptions.getUninstallMode();
/*     */             }
/* 335 */             this.fileInstaller.createDirectory(destFile, uninstallMode);
/* 336 */             destFile.setLastModified(lastModified);
/* 337 */             if (fileOptions != null && !InstallerUtil.isWindows()) {
/* 338 */               UnixFileSystem.setMode(fileOptions.getMode(), destFile);
/*     */             }
/*     */           } 
/*     */         } 
/*     */       } else {
/*     */         
/* 344 */         long fileSize = zipEntry.getSize();
/*     */         
/* 346 */         nextProgress += fileSize;
/*     */         
/* 348 */         if (shouldInstall) {
/* 349 */           if (isUserJarLink) {
/* 350 */             String jarName = (new File(entryName)).getName();
/* 351 */             this.installedUserJars.add(jarName);
/*     */             
/* 353 */             File additionalUserJarDir = ContextImpl.getContextInt((Context)context).getAdditionalUserJarsDir();
/* 354 */             File usedFile = (additionalUserJarDir != null) ? new File(additionalUserJarDir, jarName) : InstallerUtil.getInstallerFile("user/" + jarName);
/* 355 */             fileSize = usedFile.length();
/* 356 */             usedIn = new BufferedInputStream(new FileInputStream(usedFile));
/*     */           } 
/*     */           
/* 359 */           FileOptions fileOptions = initOptions(installFilesAction, entryName, config, lastModified);
/* 360 */           boolean singleBundleInstallerInfoPlist = (destFile.getName().equals("Info.plist") && Util.isMacosInstaller() && InstallerConfig.getCurrentInstance().getMacSpecificConfig().isSingleBundle());
/* 361 */           this.fileInstaller.install(usedIn, destFile, fileOptions, (ProgressInterface)new ProgressAdapter(progressInterface, (int)(currentProgress * 100L / maxProgress), (int)(nextProgress * 100L / maxProgress)), fileSize, config
/*     */               
/* 363 */               .isPack200Compression(), singleBundleInstallerInfoPlist);
/*     */ 
/*     */ 
/*     */           
/* 367 */           if (isUserJarLink) {
/* 368 */             usedIn.close();
/*     */           }
/*     */         } 
/*     */       } 
/* 372 */       if (context.isCancelling()) {
/* 373 */         throw new UserCanceledException();
/*     */       }
/*     */       
/* 376 */       currentProgress = nextProgress;
/* 377 */       progressInterface.setPercentCompleted((int)(currentProgress * 100L / maxProgress));
/*     */       
/*     */       try {
/* 380 */         zipEntry = zipIn.getNextEntry();
/* 381 */       } catch (Exception e) {
/* 382 */         throw new ReadIOException(e);
/*     */       } 
/*     */     } 
/*     */     try {
/* 386 */       zipIn.close();
/* 387 */     } catch (Exception e) {
/* 388 */       throw new ReadIOException(e);
/*     */     } 
/*     */     
/* 391 */     return currentProgress;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private FileOptions initOptions(AbstractInstallFilesAction installFilesAction, String entryName, InstallerConfig config, long lastModified) {
/* 396 */     FileOptions fileOptions = config.getOptions(entryName);
/* 397 */     if (fileOptions == null) {
/* 398 */       fileOptions = new FileOptions();
/*     */     }
/* 400 */     fileOptions.setFileTime(lastModified);
/* 401 */     fileOptions.setDelayIfNecessary(installFilesAction.isDelay());
/* 402 */     return fileOptions;
/*     */   }
/*     */   
/*     */   public static String replaceSlashes(String name) {
/* 406 */     return name.replace('/', ' ').replace('\\', ' ').replace(':', ' ').replace(';', ' ');
/*     */   }
/*     */   
/*     */   private void createRuntimeDirectory(Context context, InstallFilesAction installFilesAction) throws IOException, UserCanceledException {
/* 410 */     boolean addOnInstaller = InstallerConfig.getCurrentInstance().isAddOnInstaller();
/*     */     
/* 412 */     FileOptions runtimeFileOptions = new FileOptions(OverwriteMode.ALWAYS, UninstallMode.ALWAYS);
/* 413 */     runtimeFileOptions.setDelayIfNecessary(installFilesAction.isDelay());
/*     */     
/* 415 */     File currentDir = new File(System.getProperty("user.dir"));
/*     */     
/* 417 */     File runtimeLibrarySource = new File(currentDir, "i4jruntime.jar");
/*     */     
/* 419 */     File runtimeDestDirectory = context.getDestinationFile(".install4j");
/* 420 */     File runtimeLibraryDest = new File(runtimeDestDirectory, "i4jruntime.jar");
/*     */     
/* 422 */     this.fileInstaller.createDirectory(runtimeDestDirectory, UninstallMode.ALWAYS);
/* 423 */     if (!addOnInstaller) {
/* 424 */       this.fileInstaller.install(runtimeLibrarySource, runtimeLibraryDest, runtimeFileOptions);
/*     */     }
/*     */     
/* 427 */     String suffix = "";
/* 428 */     if (InstallerConfig.getCurrentInstance().isAddOnInstaller()) {
/* 429 */       suffix = "." + InstallerConfig.getCurrentInstance().getProjectCrc();
/*     */     }
/* 431 */     this.fileInstaller.install(new File(currentDir, "MessagesDefault"), new File(runtimeDestDirectory, "MessagesDefault"), runtimeFileOptions);
/*     */     
/* 433 */     this.fileInstaller.install(new File(currentDir, "i4jparams.conf"), new File(runtimeDestDirectory, "i4jparams.conf" + suffix), runtimeFileOptions);
/*     */     
/* 435 */     this.fileInstaller.install(new File(currentDir, "stats.properties"), new File(runtimeDestDirectory, "stats.properties" + suffix), runtimeFileOptions);
/*     */     
/* 437 */     File emptyFontFile = new File(currentDir, "i4jempty.ttf");
/* 438 */     if (emptyFontFile.isFile()) {
/* 439 */       this.fileInstaller.install(emptyFontFile, new File(runtimeDestDirectory, "i4jempty.ttf"), runtimeFileOptions);
/*     */     }
/*     */ 
/*     */     
/* 443 */     int logFileIndex = 0;
/* 444 */     for (File file : UninstallPreviousAction.getLogFiles()) {
/* 445 */       installIfExists(file.getName(), suffix, file.getParentFile(), runtimeDestDirectory, runtimeFileOptions, null, Logger.getUninstallPreviousLogFileName(logFileIndex++));
/*     */     }
/*     */     
/* 448 */     (new File(runtimeDestDirectory, "launchers.xml" + suffix)).delete();
/* 449 */     installIfExists("launchers.xml", suffix, currentDir, runtimeDestDirectory, runtimeFileOptions, null);
/*     */     
/* 451 */     installIfExists("user.jar", suffix, currentDir, runtimeDestDirectory, runtimeFileOptions, null);
/*     */     
/* 453 */     File[] children = currentDir.listFiles();
/* 454 */     if (children != null) {
/* 455 */       for (File child : children) {
/* 456 */         String name = child.getName();
/* 457 */         if (name.startsWith("launcher") && name.endsWith(".jar") && child.isFile()) {
/* 458 */           this.fileInstaller.install(child, new File(runtimeDestDirectory, name), runtimeFileOptions);
/*     */         }
/*     */       } 
/*     */     }
/* 462 */     installIfExists("user", suffix, currentDir, runtimeDestDirectory, runtimeFileOptions, this.installedUserJars);
/* 463 */     ContextInt contextInt = ContextImpl.getContextInt(context);
/* 464 */     File additionalUserJars = contextInt.getAdditionalUserJarsDir();
/* 465 */     if (additionalUserJars != null) {
/* 466 */       installIfExists(additionalUserJars.getName(), suffix, additionalUserJars.getParentFile(), runtimeDestDirectory, runtimeFileOptions, this.installedUserJars, "user");
/*     */     }
/* 468 */     runtimeFileOptions.setMode("755");
/* 469 */     installIfExists("install4j", suffix, currentDir, runtimeDestDirectory, runtimeFileOptions, null);
/* 470 */     runtimeFileOptions.setMode("644");
/*     */     
/* 472 */     File[] files = (new File(System.getProperty("user.dir"))).listFiles();
/* 473 */     if (files != null) {
/* 474 */       for (File file : files) {
/* 475 */         String lcFileName = file.getName().toLowerCase(Locale.ENGLISH);
/* 476 */         if (isAdditionalRuntimeFileInstalled(addOnInstaller, lcFileName)) {
/* 477 */           this.fileInstaller.install(file, new File(runtimeDestDirectory, file.getName()), runtimeFileOptions);
/*     */         }
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static boolean isAdditionalRuntimeFileInstalled(boolean addOnInstaller, String lcFileName) {
/* 484 */     if (lcFileName.startsWith("i4j_extf_"))
/* 485 */       return true; 
/* 486 */     if (Objects.equals(lcFileName, "installer.ico"))
/* 487 */       return true; 
/* 488 */     if (!addOnInstaller) {
/* 489 */       return (lcFileName.endsWith(".dll") || lcFileName.endsWith(".exe") || lcFileName.endsWith(".dylib"));
/*     */     }
/* 491 */     return false;
/*     */   }
/*     */   
/*     */   private void installIfExists(String fileName, String suffix, File currentDir, File runtimeDestDirectory, FileOptions runtimeFileOptions, Set<String> unusedFileNames) throws UserCanceledException, IOException {
/* 495 */     installIfExists(fileName, suffix, currentDir, runtimeDestDirectory, runtimeFileOptions, unusedFileNames, fileName);
/*     */   }
/*     */   
/*     */   private void installIfExists(String fileName, String suffix, File currentDir, File runtimeDestDirectory, FileOptions runtimeFileOptions, Set<String> unusedFileNames, String destName) throws UserCanceledException, IOException {
/* 499 */     File file = new File(currentDir, fileName);
/* 500 */     if (file.exists()) {
/* 501 */       File destFile = new File(runtimeDestDirectory, destName + suffix);
/* 502 */       if (file.isDirectory()) {
/* 503 */         this.fileInstaller.createDirectory(destFile);
/* 504 */         File[] files = file.listFiles();
/* 505 */         if (files != null) {
/* 506 */           for (File childFile : files) {
/* 507 */             String name = childFile.getName();
/* 508 */             if (unusedFileNames == null || (!unusedFileNames.contains(name) && !name.endsWith(".pack"))) {
/* 509 */               installIfExists(name, "", file, destFile, runtimeFileOptions, unusedFileNames);
/*     */             }
/*     */           } 
/*     */         }
/*     */       } else {
/* 514 */         this.fileInstaller.install(file, destFile, runtimeFileOptions);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPreferredJre(String jreHome) {
/* 521 */     this.jreInstaller.setPreferredJre(jreHome);
/*     */   }
/*     */   
/*     */   public long getMinSize() {
/*     */     try {
/* 526 */       return this.jreInstaller.getJreSize() + getMinContentSize();
/* 527 */     } catch (IOException e) {
/* 528 */       e.printStackTrace();
/* 529 */       return 0L;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static long getMinContentSize() {
/* 534 */     return HelperCommunication.getInstance().fetchLong(ExecutionContext.UNELEVATED, new FetchLongAction() {
/*     */           protected long fetchValue(Context context) throws UserCanceledException {
/*     */             long minSize;
/* 537 */             InstallFilesAction installFilesAction = (InstallFilesAction)context.getFirstAction(InstallFilesAction.class, null);
/*     */ 
/*     */             
/*     */             try {
/* 541 */               minSize = ContentStats.getInstance().getSelectedContentSize();
/* 542 */               File userDir = InstallerUtil.getInstallerFile("user");
/* 543 */               if (userDir.isDirectory()) {
/* 544 */                 File[] userFiles = userDir.listFiles();
/* 545 */                 if (userFiles != null) {
/* 546 */                   for (File userFile : userFiles) {
/* 547 */                     if (userFile.isFile()) {
/* 548 */                       minSize += userFile.length();
/*     */                     }
/*     */                   } 
/*     */                 }
/*     */               } 
/* 553 */               File[] runtimeFiles = userDir.getParentFile().listFiles();
/* 554 */               if (runtimeFiles != null) {
/* 555 */                 for (File runtimeFile : runtimeFiles) {
/* 556 */                   if (runtimeFile.isFile() && !Objects.equals(runtimeFile.getName(), "jre.tar.gz")) {
/* 557 */                     minSize += runtimeFile.length();
/*     */                   }
/*     */                 }
/*     */               
/*     */               }
/* 562 */             } catch (IOException e) {
/* 563 */               e.printStackTrace();
/* 564 */               return 0L;
/*     */             } 
/* 566 */             if (installFilesAction != null) {
/*     */               try {
/* 568 */                 Long customMinSize = (Long)context.runScript(installFilesAction.getSizeCalculatorScript(), (Bean)installFilesAction, new Object[] { Long.valueOf(minSize) });
/* 569 */                 if (customMinSize != null) {
/* 570 */                   minSize = customMinSize.longValue();
/*     */                 }
/* 572 */               } catch (Exception e) {
/* 573 */                 Util.printAnnotatedStackTrace(e);
/* 574 */                 Logger.getInstance().log(e);
/*     */               } 
/*     */             }
/* 577 */             return minSize;
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static File validateInstallationDir(File dir, boolean validateApplicationId, boolean checkFreeSpace, boolean existingDirWarning, boolean unattended, boolean alternateMessages) {
/* 584 */     InstallerConfig installerConfig = InstallerConfig.getCurrentInstance();
/*     */     
/* 586 */     boolean noSingleBundle = (!Util.isMacosInstaller() || !installerConfig.getMacSpecificConfig().isSingleBundle());
/*     */     
/* 588 */     if (noSingleBundle && !ApplicationRegistry.checkApplicationId(dir)) {
/* 589 */       if (validateApplicationId) {
/* 590 */         if (!installerConfig.isAddOnInstaller()) {
/* 591 */           Util.showMessage(Messages.getString(
/* 592 */                 alternateMessages ? ".DifferentApplication2" : ".DifferentApplication"), 1);
/*     */         } else {
/* 594 */           if (Util.isMacosInstaller()) {
/* 595 */             File singleBundleDir = new File(dir, "Contents/Resources/app");
/* 596 */             if (ApplicationRegistry.checkApplicationId(singleBundleDir)) {
/* 597 */               return singleBundleDir;
/*     */             }
/*     */           } 
/* 600 */           Util.showMessage(Messages.getString(
/* 601 */                 alternateMessages ? ".NoTargetApplication2" : ".NoTargetApplication"), 1);
/*     */         } 
/* 603 */         return null;
/*     */       } 
/* 605 */       if (Util.isMacosInstaller() && installerConfig.isAddOnInstaller()) {
/* 606 */         File singleBundleDir = new File(dir, "Contents/Resources/app");
/* 607 */         if (ApplicationRegistry.checkApplicationId(singleBundleDir)) {
/* 608 */           return singleBundleDir;
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 613 */     boolean update = ApplicationRegistry.isUpdateDirectory(dir);
/*     */ 
/*     */     
/* 616 */     if (!update && checkFreeSpace) {
/* 617 */       long minSize = (long)(getInstance().getMinSize() * 1.1D);
/* 618 */       long freeSize = SystemInfo.getFreeDiskSpace(dir);
/* 619 */       if (freeSize != -1L && minSize > freeSize) {
/*     */         try {
/* 621 */           if (InstallerUtil.isUnattended()) {
/* 622 */             System.err.println("Not enough disk space for target directory: " + dir.getAbsolutePath());
/* 623 */             return null;
/*     */           } 
/* 625 */           int result = Util.showOptionDialog(
/* 626 */               Messages.format(Messages.getString(".DiskSpaceWarning"), new Object[] { String.valueOf(minSize / 1024L), String.valueOf(freeSize / 1024L) }), new String[] {
/* 627 */                 Messages.getString(".ButtonYes"), Messages.getString(".ButtonNo") }, 3);
/*     */           
/* 629 */           if (result == 1) {
/* 630 */             return null;
/*     */           }
/*     */         }
/* 633 */         catch (UserCanceledException e) {
/* 634 */           return null;
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 639 */     if (!installerConfig.isAddOnInstaller() && existingDirWarning && dir.exists() && !update && !unattended && noSingleBundle) {
/*     */       
/*     */       try {
/* 642 */         int result = Util.showOptionDialog(
/* 643 */             Messages.format(Messages.getString(".DirExists"), new Object[] { dir.getAbsolutePath() }), new String[] {
/* 644 */               Messages.getString(".ButtonYes"), Messages.getString(".ButtonNo") }, 3);
/*     */ 
/*     */         
/* 647 */         if (result != 0) {
/* 648 */           return null;
/*     */         }
/* 650 */       } catch (UserCanceledException e) {
/* 651 */         return null;
/*     */       } 
/*     */     }
/* 654 */     return dir;
/*     */   }
/*     */   
/*     */   public void cleanup() {
/* 658 */     cleanupInt();
/*     */   }
/*     */   
/*     */   private static void cleanupInt() {
/* 662 */     HelperCommunication.getInstance().executeAction(executionContext, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 665 */             (ContentInstaller.getInstance()).jreInstaller.cleanup();
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void rollback() {
/* 671 */     rollbackInt();
/*     */   }
/*     */   
/*     */   private static void rollbackInt() {
/* 675 */     HelperCommunication.getInstance().executeAction(executionContext, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 678 */             (ContentInstaller.getInstance()).jreInstaller.rollback();
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void doComponentInstallation(InstallerContext context, ProgressInterface progressInterface, String componentId, boolean installInSingleBundle, AbstractInstallFilesAction abstractInstallFilesAction) throws IOException, UserCanceledException {
/* 684 */     if (context.isCancelling()) {
/*     */       return;
/*     */     }
/*     */     
/* 688 */     if (HelperCommunication.getInstance().isElevatedHelper()) {
/* 689 */       setExecutionContext(ExecutionContext.MAXIMUM);
/*     */     }
/*     */     
/* 692 */     progressInterface.setStatusMessage(Messages.getString(".StatusExtractFiles"));
/* 693 */     progressInterface.setDetailMessage("");
/*     */     
/* 695 */     ContentStats contentStats = ContentStats.getInstance();
/*     */     
/* 697 */     long maxProgress = contentStats.getSelectedContentSize(componentId);
/* 698 */     long fileCount = contentStats.getSelectedContentCount(componentId);
/*     */     
/* 700 */     progressInterface.setStatusMessage(Messages.getString(".StatusExtractFiles"));
/* 701 */     progressInterface.setDetailMessage("");
/*     */     
/* 703 */     maxProgress += 153600L * fileCount;
/* 704 */     long currentProgress = 0L;
/*     */     
/* 706 */     Map<Comparable<String>, InputStream> contentNumbersToStreams = (new ContentCollector(context, false, abstractInstallFilesAction.isAcceptAllCertificates())).collectContentStreams(componentId);
/*     */     
/* 708 */     progressInterface.setStatusMessage(Messages.getString(".StatusExtractFiles"));
/* 709 */     progressInterface.setDetailMessage("");
/*     */     
/* 711 */     for (InputStream contentStream : contentNumbersToStreams.values()) {
/* 712 */       currentProgress = installContent(context, contentStream, progressInterface, installInSingleBundle, abstractInstallFilesAction, maxProgress, currentProgress);
/*     */     }
/*     */     
/* 715 */     progressInterface.setDetailMessage("");
/*     */     
/* 717 */     if (!context.isCancelling())
/* 718 */       progressInterface.setPercentCompleted(100); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\ContentInstaller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */