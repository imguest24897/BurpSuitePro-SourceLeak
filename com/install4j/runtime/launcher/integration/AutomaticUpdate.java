/*     */ package com.install4j.runtime.launcher.integration;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*     */ import com.install4j.runtime.installer.helper.launching.OutputRedirection;
/*     */ import com.install4j.runtime.installer.helper.launching.OutputRedirectionMode;
/*     */ import com.install4j.runtime.installer.platform.macos.MacAuthorization;
/*     */ import com.install4j.runtime.installer.platform.macos.VolumeInfo;
/*     */ import com.install4j.runtime.launcher.Launcher;
/*     */ import com.install4j.runtime.launcher.LauncherVariables;
/*     */ import com.install4j.runtime.launcher.util.SingleInstance;
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.Closeable;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.PrintWriter;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.LinkOption;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.attribute.PosixFileAttributes;
/*     */ import java.nio.file.attribute.PosixFilePermission;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ public class AutomaticUpdate {
/*     */   private static final String PROPNAME_UPDATE_DIR = "install4j.updateStorageDir";
/*     */   private static volatile File updateDir;
/*     */   
/*     */   public static File getUpdateDir() {
/*  49 */     if (updateDir == null) {
/*  50 */       String updateDirName = System.getProperty("install4j.updateStorageDir");
/*  51 */       if (updateDirName != null) {
/*  52 */         updateDir = new File(updateDirName);
/*     */       } else {
/*  54 */         String applicationId = getApplicationId();
/*  55 */         if (applicationId == null) {
/*  56 */           applicationId = "unknown";
/*     */         }
/*  58 */         updateDir = new File(new File(getUpdateBaseDir(), Base64.encodeForFiles(applicationId)), SingleInstance.getPathHash(ResourceHelper.getRuntimeDir(), ""));
/*     */       } 
/*     */     } 
/*  61 */     return updateDir;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static File getUpdateBaseDir() {
/*  66 */     return new File(InstallerVariables.getInstall4jCacheDir(), "update");
/*     */   }
/*     */   
/*     */   public static boolean isScheduled(String version, boolean checkTimeInhibition, boolean checkInstalledVersion) {
/*  70 */     boolean[] ret = new boolean[1];
/*  71 */     UpdateConfig.withConfig(false, updateConfig -> {
/*  72 */           ret[0] = ((version == null || version.equals(updateConfig.getVersion())) && shouldBeExecuted(updateConfig, true) && (!checkTimeInhibition || isNoTimeInhibition(updateConfig, updateConfig.getFile(), "scheduled")));
/*     */           if (checkInstalledVersion && ret[0] && isAlreadyUpdatedManually(updateConfig)) {
/*     */             ret[0] = false;
/*     */             updateConfig.setSuccess(true);
/*     */             return true;
/*     */           } 
/*     */           return false;
/*     */         });
/*  80 */     return ret[0];
/*     */   }
/*     */   
/*     */   private static boolean isAlreadyUpdatedManually(UpdateConfig updateConfig) {
/*  84 */     String installedVersion = getInstalledVersion();
/*  85 */     String updateVersion = updateConfig.getVersion();
/*  86 */     return (Objects.equals(updateVersion, installedVersion) || (updateConfig
/*  87 */       .isCheckNewerVersion() && UpdateChecker.isVersionLessThanOrEqual(updateVersion, installedVersion)));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static String getInstalledVersion() {
/*  92 */     ContextInt singleContextInt = ContextImpl.getSingleContextInt();
/*  93 */     if (singleContextInt != null) {
/*  94 */       return singleContextInt.getVersion();
/*     */     }
/*     */     try {
/*  97 */       return LauncherVariables.getApplicationVersion();
/*  98 */     } catch (IOException e) {
/*  99 */       UpdateLog.log(e);
/* 100 */       e.printStackTrace();
/*     */ 
/*     */       
/* 103 */       return null;
/*     */     } 
/*     */   }
/*     */   private static boolean shouldBeExecuted(UpdateConfig updateConfig, boolean scheduleCheck) {
/* 107 */     String verb = scheduleCheck ? "scheduled" : "started";
/* 108 */     String fileName = updateConfig.getFile();
/* 109 */     if (!updateConfig.isSuccess() && fileName != null && !fileName.isEmpty() && (new File(fileName)).exists()) {
/* 110 */       if (updateConfig.getTryCount() < updateConfig.getMaxTries()) {
/* 111 */         if (updateConfig.getCancelCount() < updateConfig.getMaxCancelCount()) {
/* 112 */           return true;
/*     */         }
/* 114 */         UpdateLog.log(2, "update not " + verb + " because of maximum cancel count");
/*     */       } else {
/*     */         
/* 117 */         UpdateLog.log(2, "update not " + verb + " because of maximum retry count");
/*     */       } 
/*     */     }
/* 120 */     return false;
/*     */   }
/*     */   
/*     */   public static void cleanupAllSuccessfulInstallations(@Nullable String currentInstallerPath) {
/* 124 */     File[] appIdDirs = getUpdateBaseDir().listFiles();
/* 125 */     if (appIdDirs != null) {
/* 126 */       for (File appIdDir : appIdDirs) {
/* 127 */         if (appIdDir.isDirectory()) {
/* 128 */           File[] pathDirs = appIdDir.listFiles();
/* 129 */           if (pathDirs != null) {
/* 130 */             for (File pathDir : pathDirs) {
/* 131 */               if (pathDir.isDirectory()) {
/* 132 */                 UpdateLog.log(10, "checking " + pathDir + " for cleanup");
/* 133 */                 UpdateConfig.withConfig(new File(pathDir, "config.xml"), false, updateConfig -> {
/*     */                       UpdateLog.log(10, "checking " + pathDir + " for cleanup");
/* 135 */                       return (updateConfig.isSuccess() && !Objects.equals(updateConfig.getFile(), currentInstallerPath)) ? deleteInstaller(updateConfig) : false;
/*     */                     });
/*     */               } 
/*     */             } 
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean deleteInstaller(UpdateConfig updateConfig) {
/* 149 */     String fileName = updateConfig.getFile();
/* 150 */     if (!fileName.isEmpty()) {
/* 151 */       boolean tryDelete = true;
/* 152 */       if (Util.isMacOS() && fileName.endsWith(".dmg")) {
/* 153 */         for (Map.Entry<String, String> entry : (Iterable<Map.Entry<String, String>>)VolumeInfo.getMountPointToDiskFile().entrySet()) {
/* 154 */           if (Objects.equals(fileName, entry.getValue()) && 
/* 155 */             !VolumeInfo.detach(new File(entry.getKey()))) {
/* 156 */             UpdateLog.log(2, "could not detach " + fileName);
/* 157 */             tryDelete = false;
/*     */           } 
/*     */         } 
/*     */       }
/*     */       
/* 162 */       if (tryDelete) {
/* 163 */         File file = new File(fileName);
/* 164 */         file.delete();
/* 165 */         if (!file.isFile()) {
/* 166 */           UpdateLog.log(2, "deleted " + fileName);
/* 167 */           updateConfig.clear();
/* 168 */           return true;
/*     */         } 
/* 170 */         UpdateLog.log(2, "could not delete " + fileName);
/*     */       } 
/*     */     } 
/*     */     
/* 174 */     return false;
/*     */   }
/*     */   
/*     */   private static boolean isConfigWithContent() {
/* 178 */     boolean[] ret = new boolean[1];
/* 179 */     UpdateConfig.withConfig(false, updateConfig -> {
/* 180 */           ret[0] = (!updateConfig.getFile().isEmpty() && !updateConfig.getVersion().isEmpty());
/*     */           return false;
/*     */         });
/* 183 */     return ret[0];
/*     */   }
/*     */   
/*     */   public static void checkUpdates(String[] launcherArguments, UpdateExecutionConfig updateExecutionConfig, boolean restartLauncher, Runnable shutdownRunnable) {
/* 187 */     boolean shutdown = false;
/* 188 */     boolean configWithContent = isConfigWithContent();
/* 189 */     UpdateLog.log(20, "checking update: " + configWithContent);
/* 190 */     if (configWithContent) {
/* 191 */       try { Closeable initLock = LockFile.tryInitLock(); 
/* 192 */         try { if (initLock != null) {
/* 193 */             UpdateConfig.withConfig(false, updateConfig -> {
/*     */                   String fileName = updateConfig.getFile();
/*     */                   
/*     */                   String version = updateConfig.getVersion();
/*     */                   
/*     */                   UpdateLog.log(5, "checking update installation. File: " + fileName + ", Version: " + version);
/*     */                   
/*     */                   if (!fileName.isEmpty() && !version.isEmpty()) {
/*     */                     if (shouldBeExecuted(updateConfig, false)) {
/*     */                       if (isNoTimeInhibition(updateConfig, fileName, "started") && !Objects.equals(version, getInstalledVersion())) {
/*     */                         updateExecutionConfig.setInstallerFile(new File(fileName));
/*     */                         
/*     */                         updateExecutionConfig.setLanguageId(updateConfig.getLanguageId());
/*     */                         
/*     */                         updateExecutionConfig.setInstallationDirectory(updateConfig.getInstallationDirectory());
/*     */                         updateExecutionConfig.getArguments().addAll(updateConfig.getArguments());
/*     */                         updateConfig.setTryCount(updateConfig.getTryCount() + 1);
/*     */                         updateConfig.setInstallTimestamp(System.currentTimeMillis());
/*     */                         return true;
/*     */                       } 
/*     */                     } else if ((updateConfig.isSuccess() || isNoTimeInhibition(updateConfig, fileName, "deleted")) && deleteInstaller(updateConfig)) {
/*     */                       return true;
/*     */                     } 
/*     */                   }
/*     */                   return false;
/*     */                 });
/* 219 */             if (updateExecutionConfig.getInstallerFile() != null && updateExecutionConfig.getInstallerFile().exists()) {
/* 220 */               if (updateExecutionConfig.getUnattendedUpdateTitle() != null && !updateExecutionConfig.getUnattendedUpdateTitle().isEmpty()) {
/* 221 */                 LauncherVariables.setLanguageId(updateExecutionConfig.getLanguageId());
/* 222 */                 updateExecutionConfig.setUnattendedUpdateTitle(LauncherVariables.replaceVariables(updateExecutionConfig.getUnattendedUpdateTitle()));
/*     */               } 
/*     */               try {
/* 225 */                 UpdateLog.log(1, "starting update " + updateExecutionConfig.getInstallerFile());
/* 226 */                 Process process = doUpdate(updateExecutionConfig, restartLauncher, launcherArguments);
/* 227 */                 if (process != null) {
/* 228 */                   LockFile.waitForInstallerLock(process);
/*     */                 }
/* 230 */                 shutdown = true;
/* 231 */               } catch (Exception e) {
/* 232 */                 UpdateLog.log(e);
/* 233 */                 e.printStackTrace();
/*     */               } 
/*     */             } 
/*     */           } else {
/* 237 */             UpdateLog.log(5, "could not acquire init lock");
/*     */           } 
/* 239 */           if (initLock != null) initLock.close();  } catch (Throwable throwable) { if (initLock != null) try { initLock.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }  } catch (IOException e)
/* 240 */       { UpdateLog.log(e);
/* 241 */         e.printStackTrace(); }
/*     */     
/*     */     }
/* 244 */     if (shutdown) {
/* 245 */       if (shutdownRunnable != null) {
/* 246 */         shutdownRunnable.run();
/*     */       } else {
/* 248 */         Context context = ContextImpl.getCurrentContext();
/* 249 */         if (context != null) {
/* 250 */           context.finish(0);
/*     */         }
/* 252 */         System.exit(0);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean isNoTimeInhibition(@NotNull UpdateConfig updateConfig, @NotNull String file, String actionVerb) {
/* 259 */     boolean archive = (Util.isMacOS() && !file.isEmpty() && (new File(file)).isDirectory());
/* 260 */     int retryInhibitionMinutes = updateConfig.getRetryInhibitionMinutes();
/* 261 */     if (archive && (updateConfig.getCancelTimestamp() == 0L || updateConfig.getCancelTimestamp() < updateConfig.getInstallTimestamp())) {
/* 262 */       retryInhibitionMinutes = 1440;
/*     */     }
/* 264 */     retryInhibitionMinutes = Integer.getInteger("install4j.updateRetryInhibition", retryInhibitionMinutes).intValue();
/* 265 */     boolean noTimeInhibition = (System.currentTimeMillis() > updateConfig.getInstallTimestamp() + TimeUnit.MINUTES.toMillis(retryInhibitionMinutes));
/* 266 */     if (!noTimeInhibition) {
/* 267 */       UpdateLog.log(2, "update not " + actionVerb + " because of retry time inhibition");
/*     */     }
/* 269 */     return noTimeInhibition;
/*     */   }
/*     */   
/*     */   private static Process doUpdate(UpdateExecutionConfig updateExecutionConfig, boolean restartLauncher, String[] launcherArguments) throws IOException, MacAuthorization.BaseAuthorizationException {
/* 273 */     Context context = ContextImpl.getCurrentContext();
/* 274 */     if (context != null) {
/* 275 */       ShutdownCallingLauncherAction.shutdownCallingLauncher(context, true, 120);
/*     */     }
/*     */     
/* 278 */     if (handleMacosArchive(updateExecutionConfig, restartLauncher, launcherArguments)) {
/* 279 */       return null;
/*     */     }
/* 281 */     return executeInstaller(updateExecutionConfig, restartLauncher, launcherArguments);
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean isAdminWritable(File file) {
/*     */     try {
/* 287 */       Path path = file.toPath();
/* 288 */       Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, new LinkOption[0]);
/* 289 */       return (posixFilePermissions.contains(PosixFilePermission.OTHERS_WRITE) || (posixFilePermissions
/* 290 */         .contains(PosixFilePermission.GROUP_WRITE) && ((PosixFileAttributes)Files.<PosixFileAttributes>readAttributes(path, PosixFileAttributes.class, new LinkOption[] { LinkOption.NOFOLLOW_LINKS })).group().getName().equals("admin")) || (
/* 291 */         Files.getOwner(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS }).getName().equals(System.getProperty("user.name")) && posixFilePermissions.contains(PosixFilePermission.OWNER_WRITE)));
/*     */     }
/* 293 */     catch (Throwable t) {
/* 294 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean handleMacosArchive(UpdateExecutionConfig updateExecutionConfig, boolean restartLauncher, String[] launcherArguments) throws IOException, MacAuthorization.BaseAuthorizationException {
/* 299 */     if (Util.isMacOS() && updateExecutionConfig.getInstallerFile().isDirectory()) {
/* 300 */       File[] files = updateExecutionConfig.getInstallerFile().listFiles(pathname -> (pathname.isDirectory() && pathname.getName().endsWith(".app")));
/* 301 */       if (files != null && files.length == 1) {
/* 302 */         File sourceAppDir = files[0];
/* 303 */         String installationDirectory = updateExecutionConfig.getInstallationDirectory();
/*     */         
/* 305 */         File currentSingleBundle = getCurrentSingleBundle();
/*     */         
/* 307 */         boolean authorize = false;
/* 308 */         if (Boolean.getBoolean("install4j.backgroundUpdateAdmin")) {
/* 309 */           authorize = true;
/* 310 */         } else if (!installationDirectory.startsWith(System.getProperty("user.home"))) {
/* 311 */           if (Util.isAdminGroup()) {
/* 312 */             File file = new File(installationDirectory, sourceAppDir.getName());
/* 313 */             authorize = (!isAdminWritable(currentSingleBundle) || (file.exists() && !isAdminWritable(file)) || !isAdminWritable(new File(installationDirectory)));
/*     */           } else {
/* 315 */             authorize = true;
/*     */           } 
/*     */         } 
/*     */         
/* 319 */         File destinationBundle = FileUtil.getCanonicalFile(new File(installationDirectory, sourceAppDir.getName()));
/* 320 */         File backupDir = destinationBundle.exists() ? FileUtil.getCanonicalFile(getNonExistingBackupDir(destinationBundle.getParentFile(), destinationBundle.getName())) : null;
/*     */         
/* 322 */         File currentJavaExecutable = FileUtil.getCanonicalFile(new File(System.getProperty("java.home"), "bin/java"));
/* 323 */         File currentRuntimeLibrary = new File(ResourceHelper.getRuntimeDir(), "i4jruntime.jar");
/*     */         
/* 325 */         List<String> phase1 = getSingleBundleUpdaterCommand(restartLauncher, launcherArguments, sourceAppDir, installationDirectory, currentSingleBundle, backupDir, currentJavaExecutable, currentRuntimeLibrary, true);
/*     */         
/* 327 */         File phase2JavaExecutable = currentJavaExecutable;
/* 328 */         File phase2RuntimeLibrary = currentRuntimeLibrary;
/* 329 */         if (backupDir != null) {
/* 330 */           if (currentJavaExecutable.getAbsolutePath().startsWith(destinationBundle.getAbsolutePath())) {
/* 331 */             phase2JavaExecutable = new File(backupDir, currentJavaExecutable.getAbsolutePath().substring(destinationBundle.getAbsolutePath().length() + 1));
/*     */           }
/* 333 */           if (currentRuntimeLibrary.getAbsolutePath().startsWith(destinationBundle.getAbsolutePath())) {
/* 334 */             phase2RuntimeLibrary = new File(backupDir, currentRuntimeLibrary.getAbsolutePath().substring(destinationBundle.getAbsolutePath().length() + 1));
/*     */           }
/*     */         } 
/*     */         
/* 338 */         List<String> phase2 = getSingleBundleUpdaterCommand(restartLauncher, launcherArguments, sourceAppDir, installationDirectory, currentSingleBundle, backupDir, phase2JavaExecutable, phase2RuntimeLibrary, false);
/*     */ 
/*     */         
/* 341 */         File scriptFile = File.createTempFile("i4jauto", ".sh");
/* 342 */         PrintWriter pw = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(Files.newOutputStream(scriptFile.toPath(), new java.nio.file.OpenOption[0])), StandardCharsets.UTF_8)); 
/* 343 */         try { pw.println("#!/bin/sh");
/* 344 */           printCommand(phase1, pw);
/* 345 */           pw.print(" && ");
/* 346 */           printCommand(phase2, pw);
/* 347 */           pw.println();
/* 348 */           pw.println("rm \"$0\"");
/* 349 */           pw.close(); } catch (Throwable throwable) { try { pw.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*     */            throw throwable; }
/* 351 */          List<String> shellArguments = Collections.singletonList(scriptFile.getAbsolutePath());
/* 352 */         if (authorize) {
/*     */           try {
/* 354 */             MacAuthorization.execute(MacAuthorization.getDefaultPrompt(getApplicationName()), "/bin/sh", shellArguments);
/* 355 */           } catch (com.install4j.runtime.installer.platform.macos.MacAuthorization.BaseAuthorizationException e) {
/* 356 */             UpdateConfig.withConfig(false, updateConfig -> {
/*     */                   int cancelCount = updateConfig.getCancelCount();
/*     */                   updateConfig.setCancelCount(cancelCount + 1);
/*     */                   if (cancelCount < updateConfig.getMaxCancelCount()) {
/*     */                     updateConfig.setTryCount(updateConfig.getTryCount() - 1);
/*     */                   }
/*     */                   return true;
/*     */                 });
/*     */           } 
/*     */         } else {
/* 366 */           LaunchHelper.launchApplication((new LaunchDescriptor(new File("/bin/sh"))).arguments(shellArguments).wait(false));
/*     */         } 
/*     */       } 
/* 369 */       return true;
/*     */     } 
/* 371 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void printCommand(List<String> phase1, PrintWriter pw) {
/* 376 */     for (int i = 0; i < phase1.size(); i++) {
/* 377 */       if (i > 0) {
/* 378 */         pw.print(" ");
/*     */       }
/* 380 */       pw.print("\"");
/* 381 */       pw.print(phase1.get(i));
/* 382 */       pw.print("\"");
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static List<String> getSingleBundleUpdaterCommand(boolean restartLauncher, String[] launcherArguments, File sourceAppDir, String installationDirectory, File currentSingleBundle, File backupDir, File currentJavaExecutable, File runtimeLibrary, boolean phase1) {
/* 388 */     List<String> command = new ArrayList<>();
/* 389 */     command.add(currentJavaExecutable.getAbsolutePath());
/* 390 */     command.add("-classpath");
/* 391 */     command.add(runtimeLibrary.getAbsolutePath());
/* 392 */     LockFile.addShutdownLockFile(command);
/* 393 */     UpdateLog.addUpdateLogProperty(command);
/* 394 */     command.add("-Dinstall4j.updateStorageDir=" + getUpdateDir());
/* 395 */     command.add(SingleBundleUpdater.class.getName());
/* 396 */     command.add(sourceAppDir.getAbsolutePath());
/* 397 */     command.add(installationDirectory);
/* 398 */     command.add(FileUtil.getCanonicalPath(currentSingleBundle));
/* 399 */     command.add(String.valueOf(backupDir));
/* 400 */     command.add(String.valueOf(phase1));
/* 401 */     command.add(String.valueOf(restartLauncher));
/* 402 */     if (launcherArguments != null) {
/* 403 */       command.addAll(Arrays.asList(launcherArguments));
/*     */     }
/* 405 */     return command;
/*     */   }
/*     */   
/*     */   private static File getNonExistingBackupDir(File directory, String baseName) {
/* 409 */     File result = null;
/* 410 */     for (int index = 1; index < 1000000 && (result == null || result.exists()); index++) {
/* 411 */       result = new File(directory, "." + index + "." + baseName);
/*     */     }
/* 413 */     return result;
/*     */   }
/*     */   
/*     */   private static Process executeInstaller(UpdateExecutionConfig updateExecutionConfig, boolean restartLauncher, String[] launcherArguments) {
/* 417 */     LaunchDescriptor launchDescriptor = new LaunchDescriptor(updateExecutionConfig.getInstallerFile());
/* 418 */     launchDescriptor.arguments(getInstallerArguments(updateExecutionConfig, restartLauncher, launcherArguments));
/* 419 */     launchDescriptor.specificEnvironmentVariables(Collections.singletonMap("INSTALL4J_JAVA_HOME", System.getProperty("java.home")));
/* 420 */     launchDescriptor.attachWithNoBrowse(true);
/* 421 */     launchDescriptor.useNohup((!Util.isWindows() && !Util.isMacOS()));
/* 422 */     String stderrRedirectionFile = System.getProperty("install4j.backgroundInstallerStderrLog");
/* 423 */     if (stderrRedirectionFile != null) {
/* 424 */       launchDescriptor.stderrRedirection(new OutputRedirection(OutputRedirectionMode.FILE, "", false, new File(stderrRedirectionFile), false));
/*     */     }
/* 426 */     String stdoutRedirectionFile = System.getProperty("install4j.backgroundInstallerStdoutLog");
/* 427 */     if (stdoutRedirectionFile != null) {
/* 428 */       launchDescriptor.stdoutRedirection(new OutputRedirection(OutputRedirectionMode.FILE, "", false, new File(stdoutRedirectionFile), false));
/*     */     }
/* 430 */     launchDescriptor.receiveProcess(true);
/* 431 */     LaunchHelper.launchApplication(launchDescriptor);
/* 432 */     return launchDescriptor.getProcess();
/*     */   }
/*     */   
/*     */   private static List<String> getInstallerArguments(UpdateExecutionConfig updateExecutionConfig, boolean restartLauncher, String[] launcherArguments) {
/* 436 */     List<String> arguments = new ArrayList<>();
/* 437 */     if (updateExecutionConfig.getExecutionMode() != null) {
/* 438 */       arguments.addAll(updateExecutionConfig.getExecutionMode().getArguments(updateExecutionConfig.getUnattendedUpdateTitle()));
/*     */     }
/* 440 */     arguments.addAll(updateExecutionConfig.getArguments());
/* 441 */     if (updateExecutionConfig.getLanguageId() != null && !updateExecutionConfig.getLanguageId().isEmpty()) {
/* 442 */       arguments.add("-Duser.language=" + updateExecutionConfig.getLanguageId());
/* 443 */       arguments.add("-Dinstall4j.language=" + updateExecutionConfig.getLanguageId());
/*     */     } 
/* 445 */     if (updateExecutionConfig.getInstallationDirectory() != null && !updateExecutionConfig.getInstallationDirectory().isEmpty()) {
/* 446 */       arguments.add("-dir");
/* 447 */       arguments.add(updateExecutionConfig.getInstallationDirectory());
/*     */     } 
/*     */     
/* 450 */     if (restartLauncher) {
/* 451 */       String launchInfoPath = getLaunchInfoPath(launcherArguments);
/* 452 */       if (launchInfoPath != null) {
/* 453 */         arguments.add("-Dinstall4j.launchInfoFile=" + launchInfoPath);
/*     */       }
/*     */     } 
/*     */     
/* 457 */     LockFile.addShutdownLockFile(arguments);
/* 458 */     UpdateLog.addUpdateLogProperty(arguments);
/* 459 */     arguments.add("-Dinstall4j.updateStorageDir=" + getUpdateDir());
/* 460 */     arguments.add("-Vsys.automaticUpdate=true");
/* 461 */     return arguments;
/*     */   }
/*     */   
/*     */   public static File getCurrentSingleBundle() {
/* 465 */     if (Util.isMacOS()) {
/* 466 */       File runtimeDir = ResourceHelper.getRuntimeDir();
/* 467 */       if (runtimeDir != null) {
/* 468 */         File installationDir = runtimeDir.getParentFile();
/* 469 */         String dirName = FileUtil.getCanonicalPath(installationDir);
/* 470 */         if (dirName.toLowerCase(Locale.ENGLISH).endsWith("Contents/Resources/app".toLowerCase(Locale.ENGLISH)))
/* 471 */           return new File(dirName.substring(0, dirName.length() - "Contents/Resources/app".length())); 
/* 472 */         if (dirName.toLowerCase(Locale.ENGLISH).endsWith("Contents/java/app".toLowerCase(Locale.ENGLISH))) {
/* 473 */           return new File(dirName.substring(0, dirName.length() - "Contents/java/app".length()));
/*     */         }
/*     */       } 
/*     */     } 
/* 477 */     return null;
/*     */   }
/*     */   
/*     */   private static String getLaunchInfoPath(String[] launcherArguments) {
/* 481 */     String launcherPath = null;
/* 482 */     if (ContextImpl.getCurrentContext() == null || InstallerUtil.isInProcess()) {
/* 483 */       if (!Launcher.isService()) {
/* 484 */         launcherPath = System.getProperty("exe4j.moduleName");
/*     */       }
/*     */     }
/* 487 */     else if (!Boolean.getBoolean("install4j.fromService")) {
/* 488 */       launcherPath = System.getProperty("install4j.fromLauncher");
/*     */     } 
/*     */     
/* 491 */     String launchInfoPath = null;
/* 492 */     if (launcherPath != null) {
/*     */       try {
/* 494 */         File launchInfoFile = File.createTempFile("launch", ".tmp", getUpdateDir());
/* 495 */         PrintWriter pw = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(Files.newOutputStream(launchInfoFile.toPath(), new java.nio.file.OpenOption[0])), StandardCharsets.UTF_8)); 
/* 496 */         try { pw.println(launcherPath);
/* 497 */           if (launcherArguments != null) {
/* 498 */             for (String launcherArgument : launcherArguments) {
/* 499 */               pw.println(launcherArgument);
/*     */             }
/*     */           }
/* 502 */           pw.close(); } catch (Throwable throwable) { try { pw.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/* 503 */          launchInfoPath = launchInfoFile.getAbsolutePath();
/* 504 */       } catch (IOException e) {
/* 505 */         UpdateLog.log(e);
/* 506 */         e.printStackTrace();
/*     */       } 
/*     */     }
/* 509 */     return launchInfoPath;
/*     */   }
/*     */   
/*     */   private static String getApplicationId() {
/* 513 */     InstallerConfig installerConfig = InstallerConfig.getCurrentInstance();
/* 514 */     if (installerConfig == null) {
/*     */       try {
/* 516 */         return LauncherVariables.getApplicationId();
/* 517 */       } catch (IOException e) {
/* 518 */         UpdateLog.log(e);
/* 519 */         e.printStackTrace();
/* 520 */         return null;
/*     */       } 
/*     */     }
/* 523 */     return installerConfig.getApplicationId();
/*     */   }
/*     */ 
/*     */   
/*     */   public static String getApplicationName() {
/* 528 */     InstallerConfig installerConfig = InstallerConfig.getCurrentInstance();
/* 529 */     if (installerConfig == null) {
/*     */       try {
/* 531 */         return LauncherVariables.getApplicationName();
/* 532 */       } catch (IOException e) {
/* 533 */         UpdateLog.log(e);
/* 534 */         e.printStackTrace();
/* 535 */         return null;
/*     */       } 
/*     */     }
/* 538 */     return installerConfig.getApplicationName();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void checkAutoUpdateLauncher() {
/* 543 */     if (InstallerVariables.getBooleanVariable("sys.automaticUpdate")) {
/* 544 */       String launchInfoName = System.getProperty("install4j.launchInfoFile");
/* 545 */       if (launchInfoName != null) {
/* 546 */         File launchInfoFile = new File(launchInfoName);
/* 547 */         if (launchInfoFile.isFile()) {
/* 548 */           BufferedReader reader = null;
/*     */           try {
/* 550 */             reader = new BufferedReader(new InputStreamReader(Files.newInputStream(launchInfoFile.toPath(), new java.nio.file.OpenOption[0]), StandardCharsets.UTF_8));
/* 551 */             List<String> arguments = new ArrayList<>();
/* 552 */             String executableName = reader.readLine();
/* 553 */             if (executableName != null) {
/* 554 */               File executableFile = new File(executableName);
/* 555 */               if (executableFile.exists()) {
/* 556 */                 String argument = reader.readLine();
/* 557 */                 while (argument != null) {
/* 558 */                   arguments.add(argument);
/* 559 */                   argument = reader.readLine();
/*     */                 } 
/*     */               } 
/* 562 */               LaunchHelper.launchFinishExecutable(executableFile, arguments.<String>toArray(new String[0]), executableFile.getParentFile(), ExecutionContext.UNELEVATED);
/*     */             } 
/* 564 */           } catch (IOException e) {
/* 565 */             UpdateLog.log(e);
/* 566 */             Logger.getInstance().log(e);
/*     */           } 
/* 568 */           if (reader != null) {
/*     */             try {
/* 570 */               reader.close();
/* 571 */             } catch (IOException iOException) {}
/*     */           }
/*     */           
/* 574 */           if (!launchInfoFile.delete()) {
/* 575 */             launchInfoFile.deleteOnExit();
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void checkRegularExit(boolean success, boolean cancelling) {
/* 583 */     if (success || cancelling)
/* 584 */       UpdateConfig.withConfig(false, updateConfig -> {
/*     */             if (success) {
/*     */               updateConfig.setSuccess(true);
/*     */             } else {
/*     */               int cancelCount = updateConfig.getCancelCount();
/*     */               updateConfig.setCancelCount(cancelCount + 1);
/*     */               if (cancelCount < updateConfig.getMaxCancelCount())
/*     */                 updateConfig.setTryCount(updateConfig.getTryCount() - 1); 
/*     */             } 
/*     */             return true;
/*     */           }); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\integration\AutomaticUpdate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */