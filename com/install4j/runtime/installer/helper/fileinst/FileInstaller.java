/*     */ package com.install4j.runtime.installer.helper.fileinst;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.exe4j.runtime.util.ReadIOException;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.FileOptions;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UninstallMode;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.events.EventType;
/*     */ import com.install4j.api.events.InstallerDirectoryEvent;
/*     */ import com.install4j.api.events.InstallerEvent;
/*     */ import com.install4j.api.events.InstallerFileEvent;
/*     */ import com.install4j.api.windows.WinFileSystem;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.config.ActionBeanConfig;
/*     */ import com.install4j.runtime.installer.config.RemoveSignatureType;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.frontend.ProgressAdapter;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.Unpacker;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import com.install4j.runtime.installer.platform.macos.macho.SignatureRemover;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.Path;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ public class FileInstaller implements Serializable {
/*  43 */   private static final String SIMULATE_FILE_FAILURE_FILE_NAME = System.getProperty("install4j.simulateFileFailure");
/*     */   public static final String PROPERTY_SIMULATE_FILE_FAILURE = "install4j.simulateFileFailure";
/*     */   public static final String PROPERTY_DEBUG_FILE_REMOVER = "install4j.debugFileRemover";
/*     */   static final String LOG_FILENAME = "files.log";
/*     */   public static final String INFO_PLIST_TEMP_FILENAME = "info_plist_temp";
/*  48 */   private static FileInstaller fileInstaller = new FileInstaller();
/*     */   
/*     */   public static FileInstaller getInstance() {
/*  51 */     fileInstaller.lastOptionsVerbose = null;
/*  52 */     return fileInstaller;
/*     */   }
/*     */   
/*     */   public static void clearFileInstaller() {
/*  56 */     fileInstaller = new FileInstaller();
/*     */   }
/*     */   
/*  59 */   private transient ProgressInterface defaultProgressInterface = (ProgressInterface)new ProgressAdapter(null, false);
/*     */   
/*     */   private transient String lastOptionsVerbose;
/*  62 */   private transient FileInstallerState installerState = FileInstallerState.getInstance();
/*  63 */   private transient FileRemover fileRemover = new FileRemover();
/*     */   
/*  65 */   private int maxRollbackId = 0;
/*     */   
/*     */   FileRemover getFileRemover() {
/*  68 */     return this.fileRemover;
/*     */   }
/*     */   
/*     */   private BackupPair backupFile(InstallFile file) throws IOException {
/*  72 */     long modTime = InstallHelper.getLastModified(file);
/*  73 */     boolean elevated = HelperCommunication.getInstance().isElevatedHelper();
/*     */     
/*  75 */     BackupPair backupPair = null;
/*  76 */     if (Files.isSymbolicLink(file.toPath())) {
/*     */       try {
/*  78 */         String linkTarget = Files.readSymbolicLink(file.toPath()).toString();
/*  79 */         backupPair = BackupPair.createSymlink(file, modTime, elevated, linkTarget);
/*  80 */       } catch (IOException iOException) {}
/*     */     }
/*     */ 
/*     */     
/*  84 */     if (backupPair == null) {
/*  85 */       File backupFile = File.createTempFile("i4b", null);
/*  86 */       backupFile.delete();
/*  87 */       if (!file.renameTo(backupFile)) {
/*     */         File newBackupFile;
/*     */         try {
/*  90 */           newBackupFile = File.createTempFile("i4b", null, file.getParentFile());
/*  91 */           newBackupFile.delete();
/*  92 */         } catch (IOException e) {
/*     */           
/*  94 */           newBackupFile = backupFile;
/*     */         } 
/*  96 */         if (file.renameTo(newBackupFile)) {
/*  97 */           backupFile = newBackupFile;
/*     */         } else {
/*  99 */           FileUtil.copyFile(file, backupFile);
/*     */         } 
/*     */       } 
/* 102 */       backupPair = BackupPair.createRegular(file, modTime, elevated, backupFile);
/*     */     } 
/*     */     
/* 105 */     this.installerState.addReplacedFile(backupPair);
/* 106 */     return backupPair;
/*     */   }
/*     */   
/*     */   private boolean checkFile(@Nullable File tempFile, @Nullable String linkTarget, long fileTime, InstallFile destFile, int overwrite, UninstallMode uninstallMode, boolean previouslyCreated, ProgressInterface progressInterface) throws IOException, UserCanceledException {
/* 110 */     createDirectory(destFile.getParentFile(), InstallHelper.getParentUninstallMode(uninstallMode));
/* 111 */     if (destFile.exists()) {
/* 112 */       if (linkTarget == null || !isSymlinkTo(destFile, linkTarget)) {
/* 113 */         if (overwrite == 0 || ((overwrite == 4 || overwrite == 5) && this.installerState
/* 114 */           .isRespondedOverwriteNever())) {
/* 115 */           Logger.getInstance().info(null, "Don't overwrite because file exists (ron: " + this.installerState.isRespondedOverwriteNever() + ")");
/* 116 */           return false;
/*     */         } 
/*     */         
/* 119 */         boolean overwriteWithoutAsking = (overwrite != 4 && overwrite != 5);
/*     */         
/* 121 */         if (overwrite == 2 || overwrite == 3) {
/* 122 */           boolean isNewer = InstallHelper.isFirstFileNewer(tempFile, fileTime, destFile);
/*     */ 
/*     */           
/* 125 */           if (!isNewer && (overwrite == 2 || this.installerState.isRespondedOverwriteNever())) {
/* 126 */             Logger.getInstance().info(null, "Don't overwrite because existing file is newer (ron: " + this.installerState.isRespondedOverwriteNever() + ")");
/* 127 */             return false;
/*     */           } 
/* 129 */           overwriteWithoutAsking = isNewer;
/*     */         } 
/*     */ 
/*     */         
/* 133 */         if (overwrite == 1 || this.installerState.isRespondedOverwriteAlways() || (previouslyCreated && overwrite != 5))
/*     */         {
/* 135 */           overwriteWithoutAsking = true;
/*     */         }
/*     */         
/* 138 */         if (!overwriteWithoutAsking)
/* 139 */           switch (progressInterface.askOverwrite(destFile)) {
/*     */             case 4:
/* 141 */               this.installerState.setRespondedOverwriteNever(true);
/* 142 */               Logger.getInstance().info(null, "Don't overwrite because of user action (never)");
/* 143 */               return false;
/*     */             case 1:
/* 145 */               Logger.getInstance().info(null, "Don't overwrite because of user action (no)");
/* 146 */               return false;
/*     */             case 3:
/* 148 */               this.installerState.setRespondedOverwriteAlways(true);
/*     */               break;
/*     */           }  
/*     */       } 
/* 152 */       BackupPair currentBackupPair = backupFile(destFile);
/* 153 */       currentBackupPair.setPreviouslyCreated(previouslyCreated);
/*     */     } else {
/* 155 */       this.installerState.addCreatedFile(destFile, true);
/*     */     } 
/* 157 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean isSymlinkTo(@NotNull File file, @NotNull String linkTarget) {
/* 161 */     Path path = file.toPath();
/* 162 */     if (Files.isSymbolicLink(path)) {
/*     */       try {
/* 164 */         return linkTarget.equals(Files.readSymbolicLink(path).toString());
/* 165 */       } catch (IOException iOException) {}
/*     */     }
/*     */     
/* 168 */     return false;
/*     */   }
/*     */   
/*     */   public void registerPreUninstallCommand(File file, String command, String... arguments) {
/* 172 */     this.installerState.registerPreUninstallCommand(file, Util.hasFullAdminRights(), command, arguments);
/*     */   }
/*     */   
/*     */   public void registerUninstallFile(File file) {
/* 176 */     InstallFile installFile = new InstallFile(file, false);
/* 177 */     if (file.isDirectory() && !Files.isSymbolicLink(file.toPath())) {
/* 178 */       this.installerState.addCreatedDir(installFile);
/*     */     } else {
/* 180 */       this.installerState.addCreatedFile(installFile, true);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void createDirectory(File dir, UninstallMode uninstallMode) {
/*     */     try {
/* 186 */       dir = dir.getCanonicalFile();
/* 187 */     } catch (IOException e) {
/* 188 */       Logger.getInstance().log(e);
/*     */     } 
/* 190 */     List<File> dirList = new ArrayList<>();
/* 191 */     for (File curDir = dir.getParentFile(); curDir != null; ) {
/* 192 */       dirList.add(curDir);
/* 193 */       curDir = curDir.getParentFile();
/*     */     } 
/*     */     
/* 196 */     UninstallMode parentMode = InstallHelper.getParentUninstallMode(uninstallMode);
/* 197 */     for (int i = dirList.size() - 1; i >= 0; i--) {
/* 198 */       File file = dirList.get(i);
/* 199 */       boolean bool = file.mkdir();
/* 200 */       if (bool || parentMode == UninstallMode.ALWAYS || parentMode == UninstallMode.ALWAYS_BUT_NOT_FOR_UPDATE) {
/* 201 */         InstallFile createdDir = new InstallFile(file, false, parentMode);
/* 202 */         this.installerState.addCreatedDir(createdDir);
/*     */       } 
/*     */     } 
/*     */     
/* 206 */     boolean fire = !dir.exists();
/* 207 */     boolean created = dir.mkdir();
/* 208 */     if (created || uninstallMode == UninstallMode.ALWAYS || uninstallMode == UninstallMode.ALWAYS_BUT_NOT_FOR_UPDATE) {
/* 209 */       InstallFile createdDir = new InstallFile(dir, false, uninstallMode);
/* 210 */       this.installerState.addCreatedDir(createdDir);
/*     */     } 
/* 212 */     if (fire) {
/* 213 */       ContextInt context = ContextImpl.getSingleContextInt();
/*     */       
/* 215 */       if (context != null) {
/* 216 */         context.fireInstallerEvent((InstallerEvent)new InstallerDirectoryEvent(context.getEventSource(), (Context)context, EventType.DIRECTORY_CREATED, created, dir));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void createDirectory(File dir) {
/* 222 */     createDirectory(dir, UninstallMode.IF_CREATED);
/*     */   }
/*     */   
/*     */   public boolean install(File sourceFile, File destFile) throws UserCanceledException {
/* 226 */     return install(sourceFile, destFile, new FileOptions(InstallHelper.getLastModified(sourceFile)));
/*     */   }
/*     */   
/*     */   public boolean install(File sourceFile, File destFile, FileOptions options) throws UserCanceledException {
/* 230 */     return install(sourceFile, destFile, options, null);
/*     */   }
/*     */   
/*     */   public boolean install(File sourceFile, File destFile, FileOptions options, ProgressInterface progressInterface) throws UserCanceledException {
/* 234 */     if (progressInterface == null) {
/* 235 */       progressInterface = this.defaultProgressInterface;
/*     */     }
/*     */     
/* 238 */     boolean ret = false;
/*     */     try {
/* 240 */       InputStream in = new BufferedInputStream(new FileInputStream(sourceFile));
/* 241 */       ret = install(in, destFile, options, progressInterface, sourceFile.length(), false);
/* 242 */       in.close();
/* 243 */     } catch (IOException e) {
/* 244 */       e.printStackTrace();
/* 245 */       String message = Messages.format(Messages.getString(".ErrorInternal2"), new Object[] { "Could not read " + sourceFile });
/* 246 */       progressInterface.showFailure(message);
/*     */     } 
/* 248 */     return ret;
/*     */   }
/*     */   
/*     */   public boolean install(InputStream in, File destFile, FileOptions options) throws UserCanceledException, ReadIOException {
/* 252 */     return install(in, destFile, options, null, 0L, false);
/*     */   }
/*     */   
/*     */   public boolean installSymlink(String target, File destFile, FileOptions options, ProgressInterface progressInterface) throws UserCanceledException, ReadIOException {
/* 256 */     if (progressInterface == null) {
/* 257 */       progressInterface = this.defaultProgressInterface;
/*     */     }
/*     */     
/* 260 */     ContextInt context = initInstall(destFile, options, 0L);
/* 261 */     boolean success = false;
/* 262 */     boolean checkSucceeded = false;
/* 263 */     boolean tryCheck = true;
/*     */     try {
/* 265 */       while (tryCheck && !checkSucceeded && !success) {
/*     */         try {
/* 267 */           createDirectory(destFile.getParentFile(), InstallHelper.getParentUninstallMode(options.getUninstallMode()));
/*     */           
/* 269 */           InstallFile shareableDestFile = new InstallFile(destFile, options.isShared(), options.getUninstallMode());
/* 270 */           boolean previouslyCreated = this.installerState.wasPreviouslyCreated(destFile);
/*     */           
/* 272 */           if (checkFile(null, target, options.getFileTime(), shareableDestFile, options.getOverwriteMode().getIntValue(), options.getUninstallMode(), previouslyCreated, progressInterface)) {
/* 273 */             checkSucceeded = true;
/* 274 */             boolean tryInstall = true;
/* 275 */             while (tryInstall && !success) {
/*     */               try {
/* 277 */                 InstallHelper.createSymlink(target, shareableDestFile, options);
/* 278 */                 success = true;
/* 279 */               } catch (IOException e) {
/* 280 */                 tryInstall = isRetry(progressInterface, shareableDestFile, e);
/*     */               } 
/*     */             }  continue;
/*     */           } 
/* 284 */           Logger.getInstance().info(null, "Did not replace " + destFile.getPath());
/* 285 */           success = true;
/* 286 */           if (options.isShared() && !previouslyCreated && (options.getUninstallMode() == UninstallMode.ALWAYS || options.getUninstallMode() == UninstallMode.ALWAYS_BUT_NOT_FOR_UPDATE)) {
/* 287 */             this.installerState.addCreatedFile(shareableDestFile, false);
/*     */           }
/*     */         }
/* 290 */         catch (IOException e) {
/* 291 */           tryCheck = isRetry(progressInterface, destFile, e);
/*     */         } 
/*     */       } 
/*     */       
/* 295 */       if (!success) {
/* 296 */         Logger.getInstance().error(null, "Could not write " + destFile.getPath());
/*     */       }
/* 298 */       return success;
/*     */     } finally {
/* 300 */       if (context != null) {
/* 301 */         context.fireInstallerEvent((InstallerEvent)new InstallerFileEvent(context.getEventSource(), (Context)context, EventType.AFTER_INSTALL_FILE, success, destFile, 0L));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean install(InputStream in, File destFile, FileOptions options, ProgressInterface progressInterface, long length, boolean unpackJars) throws UserCanceledException, ReadIOException {
/* 307 */     return install(in, destFile, options, progressInterface, length, unpackJars, false);
/*     */   }
/*     */   
/*     */   public boolean install(InputStream in, File destFile, FileOptions options, ProgressInterface progressInterface, long length, boolean unpackJars, boolean singleBundleInstallerInfoPlist) throws UserCanceledException, ReadIOException {
/* 311 */     if (progressInterface == null) {
/* 312 */       progressInterface = this.defaultProgressInterface;
/*     */     }
/* 314 */     RemoveSignatureType removeSignatureType = getRemoveSignatureType(options);
/* 315 */     if (removeSignatureType == RemoveSignatureType.REMOVE_FILE) {
/* 316 */       return true;
/*     */     }
/*     */     
/* 319 */     ContextInt context = initInstall(destFile, options, length);
/* 320 */     boolean success = false;
/*     */     
/*     */     try {
/* 323 */       boolean delayedInstallation = false;
/* 324 */       boolean successTemp = false;
/* 325 */       boolean tryTemp = true;
/* 326 */       while (tryTemp && !successTemp && !success) {
/*     */         try {
/* 328 */           createDirectory(destFile.getParentFile(), InstallHelper.getParentUninstallMode(options.getUninstallMode()));
/* 329 */           File tempFile = File.createTempFile("i4j", null, destFile.getParentFile());
/*     */           
/*     */           try {
/* 332 */             ProgressAdapter progressAdapter = new ProgressAdapter(progressInterface, false);
/* 333 */             boolean isJarFile = destFile.getName().endsWith(".jar");
/* 334 */             if (unpackJars && isJarFile) {
/* 335 */               progressAdapter.setMaxCopyProgress(length * 3L);
/*     */             } else {
/* 337 */               progressAdapter.setMaxCopyProgress(length);
/*     */             } 
/* 339 */             String lowerCaseDestFileName = destFile.getName().toLowerCase(Locale.ENGLISH);
/* 340 */             if (lowerCaseDestFileName.endsWith(".exe") || lowerCaseDestFileName.endsWith(".dll")) {
/* 341 */               if (!FileUtil.extractFile(in, tempFile, length, (FileUtil.CopyProgressListener)progressAdapter, true)) {
/* 342 */                 tempFile.delete();
/* 343 */                 return false;
/*     */               } 
/* 345 */               successTemp = true;
/*     */             } 
/* 347 */             tempFile.setLastModified(options.getFileTime());
/*     */             
/* 349 */             InstallFile shareableDestFile = new InstallFile(destFile, options.isShared(), options.getUninstallMode());
/* 350 */             boolean previouslyCreated = this.installerState.wasPreviouslyCreated(destFile);
/*     */             
/* 352 */             if (checkFile(tempFile, null, options.getFileTime(), shareableDestFile, options.getOverwriteMode().getIntValue(), options.getUninstallMode(), previouslyCreated, progressInterface)) {
/* 353 */               if (!successTemp) {
/* 354 */                 if (!FileUtil.extractFile(in, tempFile, length, (FileUtil.CopyProgressListener)progressAdapter, true)) {
/* 355 */                   tempFile.delete();
/* 356 */                   return false;
/*     */                 } 
/* 358 */                 tempFile.setLastModified(options.getFileTime());
/* 359 */                 successTemp = true;
/*     */               } 
/*     */               
/* 362 */               if (unpackJars && isJarFile) {
/* 363 */                 File unpackedTempFile = File.createTempFile("i4j", null, destFile.getParentFile());
/*     */                 try {
/* 365 */                   if (!Unpacker.unpack(tempFile, unpackedTempFile, progressAdapter)) {
/* 366 */                     FileUtil.rename(tempFile, unpackedTempFile);
/*     */                   }
/* 368 */                 } catch (IOException e) {
/* 369 */                   Logger.getInstance().log(e);
/* 370 */                   progressInterface.showFailure("Corrupted .pack file for " + destFile.getPath() + ".\nPossibly the minimum Java version requirement for this installer has not been configured correctly.");
/* 371 */                   throw e;
/*     */                 } 
/* 373 */                 tempFile.delete();
/* 374 */                 tempFile = unpackedTempFile;
/*     */               } 
/*     */               
/* 377 */               boolean tryInstall = true;
/* 378 */               boolean simulatedFileFailure = false;
/* 379 */               while (tryInstall && !success) {
/*     */                 try {
/* 381 */                   if ((destFile.getName().equals(SIMULATE_FILE_FAILURE_FILE_NAME) & (!simulatedFileFailure ? 1 : 0)) != 0) {
/* 382 */                     simulatedFileFailure = true;
/* 383 */                     throw new IOException("Simulated file failure");
/*     */                   } 
/* 385 */                   if (singleBundleInstallerInfoPlist) {
/* 386 */                     InstallHelper.copyTemp(tempFile, new File(shareableDestFile.getParentFile(), "info_plist_temp"), options);
/*     */                   } else {
/* 388 */                     InstallHelper.copyTemp(tempFile, shareableDestFile, options);
/*     */                   } 
/* 390 */                   success = true;
/* 391 */                 } catch (IOException e) {
/* 392 */                   if (InstallerUtil.isWindows() && Util.hasFullAdminRights() && options.isDelayIfNecessary()) {
/* 393 */                     delayedInstallation = true;
/* 394 */                     success = true;
/* 395 */                     this.installerState.addCreatedFile(new InstallFile(tempFile, false, UninstallMode.ALWAYS), false);
/* 396 */                     WinFileSystem.moveWithDelayUntilReboot(shareableDestFile, null);
/* 397 */                     WinFileSystem.moveWithDelayUntilReboot(tempFile, shareableDestFile);
/* 398 */                     this.installerState.setCurrentRebootRequired(true);
/* 399 */                     if (context != null) {
/* 400 */                       context.setVariable("sys.rebootRequired", Boolean.TRUE);
/*     */                     }
/* 402 */                     Logger.getInstance().info(null, "Delayed installation of " + destFile.getPath() + " from " + tempFile.getPath() + " until reboot."); continue;
/*     */                   } 
/* 404 */                   tryInstall = isRetry(progressInterface, shareableDestFile, e);
/*     */                 } 
/*     */               } 
/*     */             } else {
/*     */               
/* 409 */               Logger.getInstance().info(null, "Did not replace " + destFile.getPath());
/* 410 */               success = true;
/* 411 */               if (options.isShared() && !previouslyCreated && (options.getUninstallMode() == UninstallMode.ALWAYS || options.getUninstallMode() == UninstallMode.ALWAYS_BUT_NOT_FOR_UPDATE)) {
/* 412 */                 this.installerState.addCreatedFile(shareableDestFile, false);
/*     */               }
/*     */             } 
/*     */             
/* 416 */             if (options.isShared() && !previouslyCreated) {
/* 417 */               InstallHelper.registerShared(destFile);
/*     */             }
/*     */           } finally {
/*     */             
/* 421 */             if (!delayedInstallation) {
/* 422 */               tempFile.delete();
/*     */             }
/*     */           } 
/* 425 */         } catch (IOException e) {
/* 426 */           if (e instanceof ReadIOException) {
/* 427 */             throw (ReadIOException)e;
/*     */           }
/* 429 */           tryTemp = isRetry(progressInterface, destFile, e);
/*     */         } 
/*     */       } 
/*     */       
/* 433 */       if (!success) {
/* 434 */         Logger.getInstance().error(null, "Could not write " + destFile.getPath());
/*     */       }
/*     */       
/* 437 */       if (success && removeSignatureType == RemoveSignatureType.REMOVE_SIGNATURE) {
/* 438 */         Logger.getInstance().info(null, "Removing notarization-only signature from " + destFile.getPath());
/*     */         try {
/* 440 */           SignatureRemover.removeFat(destFile);
/* 441 */         } catch (IOException e) {
/* 442 */           Logger.getInstance().log(e);
/*     */         } 
/*     */       } 
/* 445 */       return success;
/*     */     } finally {
/* 447 */       if (context != null) {
/* 448 */         context.fireInstallerEvent((InstallerEvent)new InstallerFileEvent(context.getEventSource(), (Context)context, EventType.AFTER_INSTALL_FILE, success, destFile, length));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private ContextInt initInstall(File destFile, FileOptions options, long length) {
/* 455 */     ContextInt context = ContextImpl.getSingleContextInt();
/*     */     
/* 457 */     if (context != null) {
/* 458 */       context.fireInstallerEvent((InstallerEvent)new InstallerFileEvent(context.getEventSource(), (Context)context, EventType.BEFORE_INSTALL_FILE, destFile, length));
/*     */     }
/* 460 */     String optionsVerbose = options.toString();
/* 461 */     if (!Objects.equals(this.lastOptionsVerbose, optionsVerbose)) {
/* 462 */       Logger.getInstance().info(null, "File options set to: [" + optionsVerbose + "]");
/* 463 */       this.lastOptionsVerbose = optionsVerbose;
/*     */     } 
/* 465 */     return context;
/*     */   }
/*     */   
/*     */   private boolean isRetry(ProgressInterface progressInterface, File file, IOException e) throws UserCanceledException {
/* 469 */     Logger.getInstance().info(null, e.getMessage());
/* 470 */     switch (progressInterface.askRetry(file)) {
/*     */       case 1:
/* 472 */         return false;
/*     */       case 3:
/* 474 */         throw new UserCanceledException();
/*     */     } 
/* 476 */     return true;
/*     */   }
/*     */   
/*     */   public static RemoveSignatureType getRemoveSignatureType(FileOptions options) {
/* 480 */     if (InstallerUtil.isMacOS() && options instanceof ExtendedFileOptions) {
/* 481 */       return ((ExtendedFileOptions)options).getRemoveSignatureType();
/*     */     }
/* 483 */     return RemoveSignatureType.KEEP;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDefaultProgressInterface(ProgressInterface progressInterface) {
/* 488 */     this.defaultProgressInterface = (ProgressInterface)new ProgressAdapter(progressInterface, true);
/*     */   }
/*     */   
/*     */   public void setRollbackBarrier() {
/* 492 */     this.installerState.setRollbackBarrier();
/*     */   }
/*     */   public void setLogDir(File logDir) {
/* 495 */     this.installerState.setLogDir(logDir);
/*     */   }
/*     */   
/*     */   public void writeLog() throws IOException, UserCanceledException {
/* 499 */     this.installerState.writeLog();
/*     */   }
/*     */   
/*     */   public boolean hasRollbackFiles() {
/* 503 */     return this.installerState.hasRollbackFiles();
/*     */   }
/*     */   
/*     */   public boolean hasUnrollbackedFiles() {
/* 507 */     return this.installerState.hasUnrollbackedFiles();
/*     */   }
/*     */   
/*     */   public void registerCleanupFile(File file) {
/* 511 */     this.installerState.registerCleanupFile(file);
/*     */   }
/*     */   
/*     */   public void cleanup() {
/* 515 */     HelperCommunication.getInstance().executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 518 */             FileInstaller.getInstance().getFileRemover().cleanup(context.getProgressInterface());
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void finishUninstall() {
/* 524 */     HelperCommunication.getInstance().executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*     */             try {
/* 528 */               FileInstaller.getInstance().getFileRemover().finishUninstall();
/* 529 */             } catch (IOException e) {
/* 530 */               e.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void deleteRecursive(final File directory) {
/* 537 */     HelperCommunication.getInstance().executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 540 */             FileInstaller.getInstance().getFileRemover().deleteRecursive(directory);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void deleteFile(final File file) {
/* 546 */     HelperCommunication.getInstance().executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 549 */             FileInstaller.getInstance().getFileRemover().deleteFile(file);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void deleteDir(final File file) {
/* 555 */     HelperCommunication.getInstance().executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 558 */             FileInstaller.getInstance().getFileRemover().deleteDir(file);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void uninstall(final boolean uninstallForUpgrade, final File installationDirectory) throws IOException, UserCanceledException {
/* 564 */     HelperCommunication.getInstance().executeActionChecked(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/*     */             try {
/* 568 */               FileInstaller.getInstance().getFileRemover().uninstall(context.getProgressInterface(), uninstallForUpgrade, installationDirectory);
/* 569 */             } catch (IOException e) {
/* 570 */               throw new RuntimeException(e);
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void rollback(final int id) {
/* 577 */     HelperCommunication.getInstance().executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 580 */             FileInstaller.getInstance().getFileRemover().rollback(context.getProgressInterface(), id);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void rollbackAll() {
/* 586 */     rollback(-1);
/*     */   }
/*     */   
/*     */   public List<File> deleteUndeleted() {
/* 590 */     return (List<File>)HelperCommunication.getInstance().fetchObject(ExecutionContext.MAXIMUM, new FetchObjectAction<List<File>>()
/*     */         {
/*     */           protected List<File> fetchValue(Context context) throws UserCanceledException {
/* 593 */             return FileInstaller.getInstance().getFileRemover().deleteUndeleted();
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void resetCurrentRebootRequired() {
/* 599 */     this.installerState.setCurrentRebootRequired(false);
/*     */   }
/*     */   
/*     */   public boolean isCurrentRebootRequired() {
/* 603 */     return this.installerState.isCurrentRebootRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCurrentAction(ActionBeanConfig actionBeanConfig) {
/* 608 */     if (actionBeanConfig.getRollbackId() == -1) {
/* 609 */       actionBeanConfig.setRollbackId(++this.maxRollbackId);
/*     */     }
/* 611 */     this.installerState.setRollbackIds(actionBeanConfig.getRollbackId(), this.maxRollbackId);
/*     */   }
/*     */   
/*     */   public void addRetainedFile(final File file) {
/* 615 */     HelperCommunication.getInstance().executeAction(ExecutionContext.MAXIMUM, (CommunicationAction)new RunAction()
/*     */         {
/*     */           protected void run(Context context) {
/* 618 */             FileInstaller.getInstance().getFileRemover().addRetainedFile(file);
/*     */           }
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\fileinst\FileInstaller.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */