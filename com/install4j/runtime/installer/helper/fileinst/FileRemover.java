/*     */ package com.install4j.runtime.installer.helper.fileinst;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.exe4j.runtime.util.WinDel;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UninstallMode;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.Install4jClassLoader;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.MenuHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.net.URL;
/*     */ import java.net.URLDecoder;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import java.util.StringTokenizer;
/*     */ 
/*     */ class FileRemover {
/*  37 */   private List<File> undeletedFiles = new ArrayList<>(); public static final String DS_STORE_NAME = ".DS_Store";
/*  38 */   private List<File> undeletedDirs = new ArrayList<>();
/*  39 */   private Set<File> retainedFiles = new HashSet<>();
/*     */   
/*     */   private boolean isUninstalling = false;
/*     */   
/*     */   private boolean uninstallForUpgrade = false;
/*  44 */   private Set<File> parentFoldersOfDeletedFiles = new HashSet<>();
/*     */   private Set<File> classPathFiles;
/*     */   private File installationDirectory;
/*     */   private boolean debug;
/*     */   
/*     */   public void rollback(ProgressInterface progressInterface, int id) {
/*  50 */     rollback(progressInterface, FileInstallerState.getInstance().getRollbackFileLogger(), id);
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollback(ProgressInterface progressInterface, FileLogger fileLogger, int id) {
/*  55 */     this.debug = getDebug();
/*     */     
/*  57 */     boolean fileRollbackPerformed = false;
/*  58 */     Collection<InstallFile> createdFiles = fileLogger.getCreatedFiles(id);
/*  59 */     Collection<InstallFile> createdDirs = fileLogger.getCreatedDirs(id);
/*  60 */     List<BackupPair> replacedFiles = fileLogger.getReplacedFiles(id);
/*  61 */     if (this.debug) {
/*  62 */       Logger.getInstance().info(null, "created files: " + createdFiles);
/*  63 */       Logger.getInstance().info(null, "created directories: " + createdDirs);
/*  64 */       Logger.getInstance().info(null, "replaced files: " + replacedFiles);
/*  65 */       Logger.getInstance().info(null, "retained files: " + this.retainedFiles);
/*     */     } 
/*     */     
/*  68 */     int fileCount = createdFiles.size() + createdDirs.size() + replacedFiles.size();
/*  69 */     int currentProgress = 0;
/*     */     
/*  71 */     for (int i = replacedFiles.size() - 1; i >= 0; i--) {
/*  72 */       BackupPair backupPair = replacedFiles.get(i);
/*  73 */       currentProgress = restoreBackupFile(progressInterface, fileCount, currentProgress, backupPair);
/*     */     } 
/*  75 */     for (InstallFile file : createdFiles) {
/*  76 */       if (this.debug) {
/*  77 */         Logger.getInstance().info(null, "checking file " + file);
/*     */       }
/*  79 */       if (!isRetainedFile(file) && (
/*  80 */         !this.isUninstalling || file.checkUninstall(this.uninstallForUpgrade))) {
/*  81 */         if (file.isShared()) {
/*  82 */           if (InstallHelper.unregisterShared(file)) {
/*  83 */             fileRollbackPerformed = true;
/*  84 */             deleteCreatedFile(file);
/*     */           } 
/*     */         } else {
/*  87 */           fileRollbackPerformed = true;
/*  88 */           deleteCreatedFile(file);
/*     */         } 
/*     */       }
/*     */       
/*  92 */       progressInterface.setPercentCompleted(++currentProgress * 100 / fileCount);
/*     */     } 
/*  94 */     for (InstallFile dir : createdDirs) {
/*  95 */       if (this.debug) {
/*  96 */         Logger.getInstance().info(null, "checking directory " + dir);
/*     */       }
/*  98 */       if (!isRetainedFile(dir) && (
/*  99 */         !this.isUninstalling || dir.checkUninstall(this.uninstallForUpgrade))) {
/* 100 */         fileRollbackPerformed = true;
/* 101 */         deleteDir(dir);
/*     */       } 
/*     */       
/* 104 */       progressInterface.setPercentCompleted(++currentProgress * 100 / fileCount);
/*     */     } 
/* 106 */     deleteParentFolders();
/* 107 */     if (fileRollbackPerformed) {
/* 108 */       FileInstallerState.getInstance().setFileRollbackPerformed(true);
/*     */     }
/* 110 */     FileInstallerState.getInstance().addRolledBackId(id);
/*     */   }
/*     */   
/*     */   private void deleteCreatedFile(InstallFile file) {
/* 114 */     List<InstallFile.Command> preUninstallCommands = file.getPreUninstallCommands();
/* 115 */     if (!preUninstallCommands.isEmpty()) {
/* 116 */       for (InstallFile.Command command : preUninstallCommands) {
/* 117 */         ExecutionContext executionContext = command.isAdminRights() ? ExecutionContext.MAXIMUM : ExecutionContext.UNELEVATED;
/*     */         try {
/* 119 */           HelperCommunication.getInstance().executeActionChecked(executionContext, (CommunicationAction)new RunAction()
/*     */               {
/*     */                 protected void run(Context context) {
/* 122 */                   MenuHelper.execute(command.getExecutable(), command.getArguments());
/*     */                 }
/*     */               });
/* 125 */         } catch (Exception e) {
/* 126 */           Logger.getInstance().log(e);
/*     */         } 
/*     */       } 
/*     */     }
/* 130 */     deleteFile(file);
/*     */   }
/*     */   
/*     */   private static boolean getDebug() {
/* 134 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.UNELEVATED, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws Exception {
/* 137 */             return Boolean.getBoolean("install4j.debugFileRemover");
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private boolean isRetainedFile(File file) {
/* 143 */     return this.retainedFiles.contains(file);
/*     */   }
/*     */   
/*     */   private static int restoreBackupFile(ProgressInterface progressInterface, int fileCount, int currentProgress, final BackupPair backupPair) {
/* 147 */     ExecutionContext executionContext = backupPair.isElevated() ? ExecutionContext.MAXIMUM : ExecutionContext.UNELEVATED;
/*     */     try {
/* 149 */       HelperCommunication.getInstance().executeActionChecked(executionContext, (CommunicationAction)new RunAction()
/*     */           {
/*     */             protected void run(Context context) {
/* 152 */               backupPair.restore();
/*     */             }
/*     */           });
/* 155 */     } catch (Exception e) {
/* 156 */       String message = Messages.format(Messages.getString(".ErrorInternal2"), new Object[] { "Could not restore " + backupPair.getOriginalFile() });
/* 157 */       progressInterface.showFailure(message);
/*     */     } 
/* 159 */     progressInterface.setPercentCompleted(++currentProgress * 100 / fileCount);
/* 160 */     return currentProgress;
/*     */   }
/*     */   
/*     */   public void finishUninstall() throws IOException {
/* 164 */     if (InstallerUtil.isWindows() && (this.undeletedFiles.size() > 0 || this.undeletedDirs.size() > 0)) {
/* 165 */       if (WinDel.isUsed()) {
/* 166 */         WinDel.scheduleDeletion(this.undeletedFiles, this.undeletedDirs, true);
/*     */       } else {
/* 168 */         WinDel.setUsed(true);
/* 169 */         Runtime.getRuntime().addShutdownHook(new Thread("temp_deletion_starter")
/*     */             {
/*     */               public void run() {
/*     */                 try {
/* 173 */                   WinDel.scheduleDeletion(FileRemover.this.undeletedFiles, FileRemover.this.undeletedDirs, false);
/* 174 */                 } catch (IOException iOException) {}
/*     */               }
/*     */             });
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void deleteParentFolders() {
/* 185 */     ContextInt context = ContextImpl.getSingleContextInt();
/* 186 */     List<File> parentList = new ArrayList<>(this.parentFoldersOfDeletedFiles);
/* 187 */     Collections.sort(parentList);
/* 188 */     for (int i = parentList.size() - 1; i >= 0; i--) {
/* 189 */       File dir = parentList.get(i);
/* 190 */       if (FileUtil.isContainedInOrEquals(dir, context.getInstallationDirectory())) {
/* 191 */         preDeleteDir(dir);
/* 192 */         if (!dir.delete() && dir.exists() && Util.isWindows() && !this.undeletedDirs.contains(dir)) {
/* 193 */           this.undeletedDirs.add(dir);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void deleteRecursive(File file) {
/* 200 */     if (file.isDirectory()) {
/* 201 */       File[] children = file.listFiles();
/* 202 */       if (children != null) {
/* 203 */         for (File child : children) {
/* 204 */           deleteRecursive(child);
/*     */         }
/*     */       }
/* 207 */       deleteDir(file);
/* 208 */     } else if (file.exists()) {
/* 209 */       deleteFile(file);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void deleteFile(File file) {
/* 214 */     if (!handleClassPathFile(file) && 
/* 215 */       !doDeleteFile(file)) {
/* 216 */       this.undeletedFiles.add(file);
/*     */     }
/*     */     
/* 219 */     this.parentFoldersOfDeletedFiles.add(file.getParentFile());
/*     */   }
/*     */   
/*     */   private boolean doDeleteFile(File file) {
/* 223 */     if (this.debug) {
/* 224 */       Logger.getInstance().info(null, "deleting " + file);
/*     */     }
/* 226 */     if (!file.delete()) {
/* 227 */       if (this.debug) {
/* 228 */         Logger.getInstance().info(null, "deletion failed");
/*     */       }
/* 230 */       if (!Util.isWindows() && file.exists() && (!file.isDirectory() || isEmpty(file))) {
/* 231 */         System.setProperty("install4j.noDefaultChmod", "false");
/*     */         
/* 233 */         LegacyUnixFileSystem.setMode(file.isDirectory() ? "755" : "644", file);
/* 234 */         if (file.delete()) {
/* 235 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 239 */     if (this.debug && file.exists()) {
/* 240 */       Logger.getInstance().info(null, "file exists");
/*     */     }
/* 242 */     return !file.exists();
/*     */   }
/*     */   
/*     */   private boolean isEmpty(File file) {
/* 246 */     String[] children = file.list();
/* 247 */     return (children == null || children.length == 0);
/*     */   }
/*     */   
/*     */   public void deleteDir(File dir) {
/* 251 */     preDeleteDir(dir);
/* 252 */     if (!dir.delete() && dir.exists()) {
/* 253 */       this.undeletedDirs.add(dir);
/*     */     }
/* 255 */     this.parentFoldersOfDeletedFiles.add(dir.getParentFile());
/*     */   }
/*     */   
/*     */   private void preDeleteDir(File dir) {
/* 259 */     if (InstallerUtil.isMacOS() && dir.exists()) {
/* 260 */       File[] files = dir.listFiles();
/* 261 */       if (files != null && files.length == 1 && Objects.equals(files[0].getName(), ".DS_Store")) {
/* 262 */         files[0].delete();
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public void cleanup(ProgressInterface progressInterface) {
/* 268 */     List<BackupPair> replacedFiles = FileInstallerState.getInstance().getReplacedFiles();
/* 269 */     for (int j = 0; j < replacedFiles.size(); j++) {
/* 270 */       BackupPair backupPair = replacedFiles.get(j);
/* 271 */       backupPair.cleanup();
/* 272 */       progressInterface.setPercentCompleted((j + 1) * 100 / replacedFiles.size());
/*     */     } 
/*     */     
/* 275 */     List<File> cleanupFiles = FileInstallerState.getInstance().getCleanupFiles();
/* 276 */     for (File cleanupFile : cleanupFiles) {
/* 277 */       cleanupFile.delete();
/*     */     }
/* 279 */     deleteUndeleted();
/*     */   }
/*     */ 
/*     */   
/*     */   public List<File> deleteUndeleted() {
/* 284 */     doDeleteUndeleted();
/* 285 */     if (this.undeletedDirs.size() > 0 || this.undeletedFiles.size() > 0) {
/*     */       try {
/* 287 */         Thread.sleep(1000L);
/* 288 */       } catch (InterruptedException e) {
/* 289 */         e.printStackTrace();
/*     */       } 
/* 291 */       doDeleteUndeleted();
/*     */     } 
/*     */     
/* 294 */     List<File> ret = new ArrayList<>(this.undeletedDirs);
/* 295 */     ret.addAll(this.undeletedFiles);
/* 296 */     return ret;
/*     */   }
/*     */   
/*     */   private void doDeleteUndeleted() {
/* 300 */     this.undeletedFiles.removeIf(this::doDeleteFile);
/* 301 */     doDeleteDirs();
/* 302 */     if (uninstallSingleBundle()) {
/* 303 */       doDeleteDirs();
/*     */     }
/* 305 */     deleteParentFolders();
/*     */   }
/*     */   
/*     */   private void doDeleteDirs() {
/* 309 */     this.undeletedDirs.removeIf(this::doDeleteFile);
/*     */   }
/*     */   
/*     */   public void uninstall(ProgressInterface progressInterface, boolean uninstallForUpgrade, File installationDirectory) throws IOException {
/* 313 */     this.installationDirectory = installationDirectory;
/* 314 */     File logFile = InstallerUtil.getInstallerFile("files.log");
/* 315 */     FileLogger fileLogger = new FileLogger();
/* 316 */     fileLogger.read(logFile);
/* 317 */     if (!uninstallForUpgrade) {
/* 318 */       deleteFile(logFile);
/*     */     }
/*     */     
/* 321 */     this.isUninstalling = true;
/* 322 */     this.uninstallForUpgrade = uninstallForUpgrade;
/* 323 */     if (InstallerUtil.isWindows()) {
/* 324 */       WinDel.prepareDeletion(InstallerUtil.getInstallerFile("i4jdel.exe"));
/*     */     }
/* 326 */     rollback(progressInterface, fileLogger, -1);
/*     */     
/* 328 */     uninstallSingleBundle();
/* 329 */     if (uninstallForUpgrade) {
/* 330 */       writeUninstallLog(fileLogger, logFile);
/*     */     }
/*     */   }
/*     */   
/*     */   private boolean uninstallSingleBundle() {
/* 335 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/* 336 */     if (this.isUninstalling && this.installationDirectory != null && !this.uninstallForUpgrade && Util.isMacosInstaller() && config.getMacSpecificConfig().isSingleBundle()) {
/* 337 */       FileInstaller fileInstaller = FileInstaller.getInstance();
/*     */       
/* 339 */       File bundleDir = new File(this.installationDirectory, config.getMacSpecificConfig().getSingleBundleName());
/* 340 */       File contentsDir = new File(bundleDir, "Contents");
/* 341 */       File javaDir = new File(contentsDir, "java");
/* 342 */       if (javaDir.isDirectory()) {
/* 343 */         fileInstaller.deleteDir(javaDir);
/*     */       }
/* 345 */       File resourcesDir = new File(bundleDir, "Contents/Resources");
/* 346 */       File appDir = new File(bundleDir, "Contents/Resources/app");
/* 347 */       if (appDir.exists()) {
/* 348 */         UnixFileSystem.FileInformation fileInformation = UnixFileSystem.getFileInformation(appDir);
/* 349 */         if (fileInformation != null && fileInformation.isLink() && !javaDir.isDirectory()) {
/* 350 */           fileInstaller.deleteFile(appDir);
/* 351 */         } else if (appDir.isDirectory()) {
/* 352 */           fileInstaller.deleteDir(appDir);
/*     */         } 
/*     */       } 
/* 355 */       fileInstaller.deleteDir(resourcesDir);
/* 356 */       fileInstaller.deleteFile(contentsDir);
/* 357 */       fileInstaller.deleteDir(bundleDir);
/* 358 */       return true;
/*     */     } 
/* 360 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void writeUninstallLog(FileLogger fileLogger, File logFile) throws IOException {
/* 365 */     Set<File> allDirs = new HashSet<>(); Iterator<InstallFile> it;
/* 366 */     for (it = fileLogger.getCreatedFiles(-1).iterator(); it.hasNext(); ) {
/*     */       
/* 368 */       InstallFile file = it.next();
/*     */       
/* 370 */       if (file.getUninstallMode() == UninstallMode.IF_CREATED_BUT_NOT_FOR_UPDATE || file
/* 371 */         .getUninstallMode() == UninstallMode.ALWAYS_BUT_NOT_FOR_UPDATE) {
/*     */         
/* 373 */         InstallHelper.addDirs(file.getParentFile(), allDirs); continue;
/*     */       } 
/* 375 */       it.remove();
/*     */     } 
/*     */     
/* 378 */     for (it = fileLogger.getCreatedDirs(-1).iterator(); it.hasNext(); ) { InstallFile file = it.next();
/* 379 */       if (file.getUninstallMode() == UninstallMode.IF_CREATED_BUT_NOT_FOR_UPDATE || file
/* 380 */         .getUninstallMode() == UninstallMode.ALWAYS_BUT_NOT_FOR_UPDATE) {
/* 381 */         InstallHelper.addDirs(file, allDirs);
/*     */       } }
/*     */ 
/*     */     
/* 385 */     for (it = fileLogger.getCreatedDirs(-1).iterator(); it.hasNext(); ) {
/* 386 */       File file = it.next();
/*     */       try {
/* 388 */         file = file.getCanonicalFile();
/* 389 */       } catch (IOException e) {
/* 390 */         Logger.getInstance().log(e);
/*     */       } 
/* 392 */       if (!allDirs.contains(file)) {
/* 393 */         it.remove();
/*     */       }
/*     */     } 
/*     */     
/* 397 */     fileLogger.write(logFile, null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean handleClassPathFile(File file) {
/* 403 */     initClassPathFiles();
/*     */     try {
/* 405 */       file = file.getCanonicalFile();
/* 406 */     } catch (IOException e) {
/* 407 */       Logger.getInstance().log(e);
/*     */     } 
/* 409 */     if (this.classPathFiles.contains(file)) {
/* 410 */       Logger.getInstance().info(this, "postponing deletion of " + file);
/* 411 */       this.undeletedFiles.add(file);
/* 412 */       return true;
/*     */     } 
/* 414 */     return false;
/*     */   }
/*     */   
/*     */   private void initClassPathFiles() {
/* 418 */     if (this.classPathFiles == null) {
/* 419 */       this.classPathFiles = new HashSet<>();
/* 420 */       String classpath = System.getProperty("java.class.path");
/* 421 */       if (classpath != null) {
/* 422 */         addFiles(this.classPathFiles, classpath);
/*     */       }
/* 424 */       String bootClassPath = System.getProperty("sun.boot.class.path");
/* 425 */       if (bootClassPath != null) {
/* 426 */         addFiles(this.classPathFiles, bootClassPath);
/*     */       }
/* 428 */       for (URL url : Install4jClassLoader.getInstance().getAddedURLs()) {
/* 429 */         File customCodeFile = getFile(url);
/* 430 */         if (customCodeFile != null) {
/*     */           try {
/* 432 */             customCodeFile = customCodeFile.getCanonicalFile();
/* 433 */           } catch (IOException e) {
/* 434 */             Logger.getInstance().log(e);
/*     */           } 
/* 436 */           this.classPathFiles.add(customCodeFile);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static File getFile(URL url) {
/* 443 */     if (url != null && Objects.equals("file", url.getProtocol())) {
/*     */       try {
/* 445 */         return new File(URLDecoder.decode(url.getFile(), "UTF-8"));
/* 446 */       } catch (UnsupportedEncodingException e) {
/* 447 */         e.printStackTrace();
/*     */       } 
/*     */     }
/* 450 */     return null;
/*     */   }
/*     */   
/*     */   private static void addFiles(Set<File> files, String stringList) {
/* 454 */     if (stringList == null) {
/*     */       return;
/*     */     }
/* 457 */     StringTokenizer tok = new StringTokenizer(stringList, File.pathSeparator);
/* 458 */     while (tok.hasMoreTokens()) {
/* 459 */       File file = new File(tok.nextToken());
/*     */       try {
/* 461 */         file = file.getCanonicalFile();
/* 462 */       } catch (IOException e) {
/* 463 */         Logger.getInstance().log(e);
/*     */       } 
/* 465 */       files.add(file);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void addRetainedFile(File file) {
/* 470 */     this.retainedFiles.add(FileUtil.getCanonicalFile(file));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\fileinst\FileRemover.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */