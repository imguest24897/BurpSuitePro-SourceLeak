/*     */ package com.install4j.runtime.beans.actions;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.properties.TextProperties;
/*     */ import com.install4j.runtime.beans.applications.Application;
/*     */ import com.install4j.runtime.installer.config.ApplicationBeanConfig;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchLongAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.FileReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.RandomAccessFile;
/*     */ import java.io.Reader;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class UninstallPreviousAction extends SystemInstallAction {
/*     */   public static final String PROPNAME_UPGRADE_UNINSTALL = "install4j.upgradeUninstall";
/*     */   public static final String PROPNAME_DONT_UNINSTALL_SERVICES = "install4j.dontUninstallServices";
/*  43 */   private Map<String, String> installerVariables = new LinkedHashMap<>(); private File installationDirectory; private boolean onlyIfSameApplicationId = true;
/*     */   private boolean uninstallServices = true;
/*  45 */   private static List<File> logFiles = new ArrayList<>();
/*     */   
/*     */   public static List<File> getLogFiles() {
/*  48 */     return (List<File>)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<List<File>>()
/*     */         {
/*     */           protected List<File> fetchValue(Context context) throws Exception {
/*  51 */             return UninstallPreviousAction.logFiles;
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static void setLogFiles(List<File> logFiles) {
/*  57 */     UninstallPreviousAction.logFiles = logFiles;
/*     */   }
/*     */   
/*     */   public File getInstallationDirectory() {
/*  61 */     return (File)replaceWithTextOverride("installationDirectory", replaceVariables(this.installationDirectory), File.class);
/*     */   }
/*     */   
/*     */   public void setInstallationDirectory(File installationDirectory) {
/*  65 */     this.installationDirectory = installationDirectory;
/*     */   }
/*     */   
/*     */   public boolean isOnlyIfSameApplicationId() {
/*  69 */     return replaceWithTextOverride("onlyIfSameApplicationId", this.onlyIfSameApplicationId);
/*     */   }
/*     */   
/*     */   public void setOnlyIfSameApplicationId(boolean onlyIfSameApplicationId) {
/*  73 */     this.onlyIfSameApplicationId = onlyIfSameApplicationId;
/*     */   }
/*     */   
/*     */   public boolean isUninstallServices() {
/*  77 */     return replaceWithTextOverride("uninstallServices", this.uninstallServices);
/*     */   }
/*     */   
/*     */   public void setUninstallServices(boolean uninstallServices) {
/*  81 */     this.uninstallServices = uninstallServices;
/*     */   }
/*     */   
/*     */   public Map<String, String> getInstallerVariables() {
/*  85 */     return (Map<String, String>)replaceWithTextOverride("installerVariables", this.installerVariables, Map.class);
/*     */   }
/*     */   
/*     */   public void setInstallerVariables(Map<String, String> installerVariables) {
/*  89 */     this.installerVariables = installerVariables;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean install(InstallerContext context) throws UserCanceledException {
/*     */     try {
/*  95 */       boolean success = true;
/*  96 */       ProgressInterface progressInterface = context.getProgressInterface();
/*     */       
/*  98 */       Logger.getInstance().info(this, "checking running processes");
/*  99 */       if (!RunningProcessChecker.checkDefaultRunningLauncher()) {
/* 100 */         throw new UserCanceledException();
/*     */       }
/* 102 */       Logger.getInstance().info(this, "checking running processes ok");
/*     */       
/* 104 */       File externalInstallationDirectory = getInstallationDirectory();
/* 105 */       File currentInstallationDirectory = context.getInstallationDirectory();
/* 106 */       if (Util.isMacosInstaller() && InstallerConfig.getCurrentInstance().getMacSpecificConfig().isSingleBundle()) {
/* 107 */         currentInstallationDirectory = new File(currentInstallationDirectory, InstallerConfig.getCurrentInstance().getMacSpecificConfig().getSingleBundleName());
/*     */       }
/* 109 */       File installationDirectory = (externalInstallationDirectory == null || externalInstallationDirectory.getPath().trim().length() == 0) ? currentInstallationDirectory : externalInstallationDirectory;
/* 110 */       InstallerConfig config = InstallerConfig.getCurrentInstance();
/* 111 */       String oldApplicationId = InstallerUtil.getOldApplicationId(installationDirectory);
/* 112 */       Logger.getInstance().info(this, "previous installation id at " + installationDirectory + ": " + oldApplicationId);
/* 113 */       if (oldApplicationId != null && (!isOnlyIfSameApplicationId() || config.getApplicationId().equals(oldApplicationId))) {
/* 114 */         progressInterface.setStatusMessage(Messages.getString(".StatusUninstallingPrevious"));
/* 115 */         progressInterface.setIndeterminateProgress(true);
/*     */         
/* 117 */         File varFile = null;
/*     */         try {
/* 119 */           varFile = writeVarFile();
/*     */           
/* 121 */           UninstallerThread uninstallerThread = new UninstallerThread(installationDirectory, Objects.equals(currentInstallationDirectory.getCanonicalFile(), installationDirectory.getCanonicalFile()), !isUninstallServices(), varFile, (Context)context);
/* 122 */           Logger.getInstance().info(this, "starting uninstaller");
/* 123 */           uninstallerThread.start();
/*     */           
/* 125 */           while (uninstallerThread.isAlive()) {
/*     */             
/*     */             try {
/* 128 */               Thread.sleep(200L);
/* 129 */             } catch (InterruptedException interruptedException) {}
/*     */             
/* 131 */             if (context.isCancelling()) {
/* 132 */               uninstallerThread.interrupt();
/*     */             }
/*     */           } 
/*     */           
/* 136 */           success = uninstallerThread.success;
/* 137 */           Set<String> undeletedFiles = uninstallerThread.undeletedFiles;
/* 138 */           if (!success || undeletedFiles.isEmpty()) {
/* 139 */             context.setVariable("sys.undeletedUninstallFiles", null);
/*     */           } else {
/* 141 */             context.setVariable("sys.undeletedUninstallFiles", undeletedFiles);
/* 142 */             success = false;
/*     */           } 
/*     */         } finally {
/*     */           
/* 146 */           if (varFile != null && varFile.isFile() && !varFile.delete()) {
/* 147 */             varFile.deleteOnExit();
/*     */           }
/*     */         } 
/*     */         
/* 151 */         progressInterface.setIndeterminateProgress(false);
/*     */       } else {
/* 153 */         Logger.getInstance().info(this, "no previous installation detected, uninstaller was not started");
/*     */       } 
/* 155 */       Logger.getInstance().info(this, "finished");
/* 156 */       return success;
/* 157 */     } catch (UserCanceledException e) {
/* 158 */       Logger.getInstance().info(this, "user cancelled");
/* 159 */       throw e;
/* 160 */     } catch (Throwable t) {
/* 161 */       Logger.getInstance().log(t);
/* 162 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private File writeVarFile() throws IOException {
/* 167 */     File varFile = null;
/* 168 */     if (!getInstallerVariables().isEmpty()) {
/* 169 */       TextProperties encodedResponse = new TextProperties();
/* 170 */       for (Map.Entry<String, String> entry : getInstallerVariables().entrySet()) {
/* 171 */         VariableEncoding.encodeVariable((Map)encodedResponse, replaceVariables(entry.getKey()), replaceVariables(entry.getValue()));
/*     */       }
/* 173 */       varFile = File.createTempFile("i4j", ".varfile");
/* 174 */       FileOutputStream out = new FileOutputStream(varFile); 
/* 175 */       try { out.write(encodedResponse.convertToPropertiesString().getBytes());
/* 176 */         out.close(); } catch (Throwable throwable) { try { out.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/*     */     
/* 178 */     }  return varFile;
/*     */   }
/*     */   
/*     */   private static int fetchLogFiles(final File logFile) {
/* 182 */     return HelperCommunication.getInstance().fetchInt(ExecutionContext.UNELEVATED, new FetchLongAction()
/*     */         {
/*     */           protected long fetchValue(Context context) throws Exception {
/* 185 */             int index = UninstallPreviousAction.getLogFiles().size();
/* 186 */             UninstallPreviousAction.getLogFiles().add(logFile);
/* 187 */             return index;
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private class UninstallerThread
/*     */     extends Thread {
/*     */     private File installationDirectory;
/*     */     private boolean upgrade;
/*     */     private final boolean dontUninstallServices;
/*     */     private final File varFile;
/*     */     private Context context;
/* 199 */     private volatile Set<String> undeletedFiles = Collections.emptySet();
/*     */     private volatile boolean success = true;
/*     */     
/*     */     public UninstallerThread(File installationDirectory, boolean upgrade, boolean dontUninstallServices, File varFile, Context context) {
/* 203 */       super("uninstaller waiting thread");
/* 204 */       this.installationDirectory = installationDirectory;
/* 205 */       this.upgrade = upgrade;
/* 206 */       this.dontUninstallServices = dontUninstallServices;
/* 207 */       this.varFile = varFile;
/* 208 */       this.context = context;
/*     */     }
/*     */     
/*     */     private void addCommonArguments(List<String> list, File logFile) {
/* 212 */       list.add("-q");
/* 213 */       list.add("-Dinstall4j.alternativeLogfile=" + logFile.getAbsolutePath());
/* 214 */       list.add("-Dinstall4j.upgradeUninstall=" + this.upgrade);
/* 215 */       list.add("-Dinstall4j.dontUninstallServices=" + this.dontUninstallServices);
/* 216 */       if (Boolean.getBoolean("install4j.debugFileRemover")) {
/* 217 */         list.add("-Dinstall4j.debugFileRemover=true");
/*     */       }
/* 219 */       if (this.varFile != null) {
/* 220 */         list.add("-varfile");
/* 221 */         if (Util.isWindows()) {
/* 222 */           list.add(FolderInfo.getShortPathName(this.varFile.getAbsolutePath()));
/*     */         } else {
/* 224 */           list.add(this.varFile.getAbsolutePath());
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void run() {
/* 231 */       InstallerConfig oldConfig = InstallerUtil.getOldApplicationConfig(this.installationDirectory);
/* 232 */       if (oldConfig == null) {
/* 233 */         Logger.getInstance().error(UninstallPreviousAction.this, "did not find old config");
/*     */         return;
/*     */       } 
/*     */       try {
/* 237 */         File logFile = File.createTempFile("i4j_log_uninstaller", ".log");
/* 238 */         logFile.deleteOnExit();
/* 239 */         int logFileIndex = UninstallPreviousAction.fetchLogFiles(logFile);
/* 240 */         if (InstallerUtil.isWindows()) {
/* 241 */           File undeletedLogFile = new File("i4j_undel.log.tmp");
/*     */           
/* 243 */           List<String> arguments = new ArrayList<>();
/* 244 */           arguments.add("-q_i4j_internal");
/* 245 */           addCommonArguments(arguments, logFile);
/* 246 */           arguments.add("-Dwindel.logfile=" + undeletedLogFile.getAbsolutePath());
/*     */ 
/*     */           
/* 249 */           LaunchDescriptor launchDescriptor = (new LaunchDescriptor(new File(this.installationDirectory, oldConfig.getUninstallerPath() + ".exe"))).arguments(arguments).workingDirectory(new File(this.installationDirectory, "..")).wait(true);
/*     */           
/* 251 */           Integer returnValue = LaunchHelper.launchApplication(launchDescriptor);
/* 252 */           Logger.getInstance().info(UninstallPreviousAction.this, "native uninstaller process returned " + returnValue);
/* 253 */           if (returnValue == null || returnValue.intValue() == 83) {
/* 254 */             runJavaUninstaller(oldConfig, logFile);
/*     */           } else {
/* 256 */             this.success = (returnValue.intValue() == 0);
/*     */             try {
/* 258 */               Thread.sleep(2000L);
/* 259 */             } catch (InterruptedException interruptedException) {}
/*     */ 
/*     */             
/* 262 */             this.undeletedFiles = UninstallPreviousAction.deleteWindowsUndelFiles(undeletedLogFile);
/*     */           } 
/*     */         } else {
/*     */           File uninstallerScript;
/* 266 */           if (Util.isMacosInstaller()) {
/* 267 */             File script = new File(oldConfig.getConfigFile().getParentFile(), "uninstall");
/* 268 */             if (Objects.equals(oldConfig.getType(), "macos") && oldConfig.getMacSpecificConfig().isSingleBundle() && !script.isFile()) {
/* 269 */               Logger.getInstance().error(UninstallPreviousAction.this, "previous single bundle installation does not support uninstallation");
/*     */               return;
/*     */             } 
/* 272 */             uninstallerScript = this.context.getBooleanVariable("sys.ext.macDisableCliUninstaller") ? null : script;
/*     */           } else {
/* 274 */             uninstallerScript = new File(this.installationDirectory, oldConfig.getUninstallerPath());
/*     */           } 
/*     */           
/* 277 */           if (uninstallerScript != null && uninstallerScript.isFile()) {
/* 278 */             Logger.getInstance().info(UninstallPreviousAction.this, "executing " + uninstallerScript);
/* 279 */             List<String> command = new ArrayList<>();
/* 280 */             command.add("/bin/sh");
/* 281 */             command.add(uninstallerScript.getAbsolutePath());
/* 282 */             addCommonArguments(command, logFile);
/* 283 */             Process process = (new ProcessBuilder(command)).directory(new File(this.installationDirectory, "..")).start();
/*     */             try {
/* 285 */               int returnValue = process.waitFor();
/* 286 */               if (returnValue == 83) {
/* 287 */                 runJavaUninstaller(oldConfig, logFile);
/*     */               } else {
/* 289 */                 this.success = (returnValue == 0);
/*     */               } 
/* 291 */             } catch (InterruptedException e) {
/* 292 */               process.destroy();
/*     */             } 
/*     */           } else {
/* 295 */             runJavaUninstaller(oldConfig, logFile);
/*     */           } 
/*     */         } 
/* 298 */         Logger.getInstance().info(UninstallPreviousAction.this, "see " + Logger.getUninstallPreviousLogFileName(logFileIndex) + " for the log file of the uninstaller");
/*     */         
/*     */         try {
/* 301 */           Thread.sleep(1500L);
/* 302 */         } catch (InterruptedException interruptedException) {}
/*     */       
/*     */       }
/* 305 */       catch (IOException e) {
/* 306 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */     private void runJavaUninstaller(InstallerConfig config, File logFile) throws IOException {
/*     */       File runtimeDir;
/* 311 */       String vmParameters = "";
/*     */       
/* 313 */       ApplicationBeanConfig appConfig = config.getApplicationConfigById("uninstaller");
/* 314 */       if (appConfig != null) {
/* 315 */         Application application = appConfig.getOrInstantiateApplication(true);
/* 316 */         if (application != null) {
/* 317 */           vmParameters = application.getVmParameters();
/*     */         }
/*     */       } 
/*     */ 
/*     */       
/* 322 */       if (Util.isMacosInstaller() && config.getMacSpecificConfig().isSingleBundle()) {
/* 323 */         runtimeDir = config.getConfigFile().getParentFile();
/*     */       } else {
/* 325 */         runtimeDir = new File(this.installationDirectory, ".install4j");
/*     */       } 
/*     */       
/* 328 */       String classpath = (new File(runtimeDir, "i4jruntime.jar")).getAbsolutePath();
/* 329 */       List<String> arguments = new ArrayList<>();
/* 330 */       StringUtil.splitupCommandLine(arguments, vmParameters);
/* 331 */       arguments.add("-cp");
/* 332 */       arguments.add(classpath);
/* 333 */       arguments.add("com.install4j.runtime.installer.Uninstaller");
/* 334 */       addCommonArguments(arguments, logFile);
/*     */       
/* 336 */       LaunchDescriptor launchDescriptor = (new LaunchDescriptor(new File(findJre(this.installationDirectory, config), "bin/java"))).arguments(arguments).workingDirectory(new File(this.installationDirectory, "..")).wait(true);
/* 337 */       Logger.getInstance().info(UninstallPreviousAction.this, "using jre from " + launchDescriptor.getExecutable());
/* 338 */       Integer returnValue = LaunchHelper.launchApplication(launchDescriptor);
/* 339 */       Logger.getInstance().info(UninstallPreviousAction.this, "uninstaller process returned " + returnValue);
/* 340 */       this.success = (returnValue != null && returnValue.intValue() == 0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private File findJre(File installationDirectory, InstallerConfig config) {
/* 345 */       File folderRuntimeDir = new File(installationDirectory, ".install4j");
/*     */ 
/*     */       
/* 348 */       if (Util.isMacosInstaller()) {
/* 349 */         if (config.getMacSpecificConfig().isSingleBundle()) {
/* 350 */           javaHome = checkJre(new File(installationDirectory, "Contents/PlugIns/jre.bundle/Contents/Home/jre"));
/* 351 */           if (javaHome != null) return javaHome;
/*     */           
/* 353 */           javaHome = checkJre(new File(installationDirectory, "Contents/PlugIns/jre.bundle/Contents/Home"));
/*     */         } else {
/* 355 */           javaHome = checkJre(new File(folderRuntimeDir, "jre.bundle/Contents/Home/jre"));
/* 356 */           if (javaHome != null) return javaHome;
/*     */           
/* 358 */           javaHome = checkJre(new File(folderRuntimeDir, "jre.bundle/Contents/Home"));
/*     */         } 
/*     */       } else {
/* 361 */         javaHome = checkJre(new File(installationDirectory, "jre"));
/*     */       } 
/* 363 */       if (javaHome != null) return javaHome;
/*     */       
/* 365 */       File javaHome = checkJre(readFile(new File(folderRuntimeDir, "inst_jre.cfg")));
/* 366 */       if (javaHome != null) return javaHome;
/*     */       
/* 368 */       javaHome = checkJre(readFile(new File(folderRuntimeDir, "pref_jre.cfg")));
/* 369 */       if (javaHome != null) return javaHome;
/*     */       
/* 371 */       return new File(System.getProperty("java.home"));
/*     */     }
/*     */     
/*     */     private File checkJre(File javaHome) {
/* 375 */       if (javaHome != null && !(new File(javaHome, "bin/java")).isFile()) {
/* 376 */         return null;
/*     */       }
/* 378 */       return javaHome;
/*     */     }
/*     */ 
/*     */     
/*     */     private File readFile(File cfgFile) {
/* 383 */       if (cfgFile.isFile()) {
/*     */         try {
/* 385 */           BufferedReader reader = new BufferedReader(new FileReader(cfgFile)); 
/* 386 */           try { String line = reader.readLine();
/* 387 */             if (line != null)
/* 388 */             { File file = new File(line);
/*     */               
/* 390 */               reader.close(); return file; }  reader.close(); } catch (Throwable throwable) { try { reader.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; } 
/* 391 */         } catch (IOException e) {
/* 392 */           Logger.getInstance().log(e);
/*     */         } 
/*     */       }
/* 395 */       return null;
/*     */     }
/*     */   }
/*     */   
/*     */   private static Set<String> deleteWindowsUndelFiles(final File undeletedLogFile) throws IOException {
/* 400 */     Logger.getInstance().info(null, "deleting remaining files from " + undeletedLogFile + ", " + undeletedLogFile.exists());
/* 401 */     if (undeletedLogFile.isFile() && undeletedLogFile.length() > 1L) {
/* 402 */       return (Set<String>)HelperCommunication.getInstance().fetchObject(ExecutionContext.MAXIMUM, new FetchObjectAction<Set<String>>() {
/*     */             protected Set<String> fetchValue(Context context) throws Exception {
/*     */               Reader unbufferedReader;
/* 405 */               List<File> undeletedFiles = new ArrayList<>();
/*     */               
/* 407 */               if (UninstallPreviousAction.isUTF16LE(undeletedLogFile)) {
/* 408 */                 unbufferedReader = new InputStreamReader(new FileInputStream(undeletedLogFile), StandardCharsets.UTF_16LE);
/*     */               } else {
/* 410 */                 unbufferedReader = new FileReader(undeletedLogFile);
/*     */               } 
/* 412 */               BufferedReader reader = new BufferedReader(unbufferedReader);
/* 413 */               if (reader.readLine() != null) {
/* 414 */                 String name = reader.readLine();
/* 415 */                 while (name != null) {
/* 416 */                   if (!Objects.equals(name, "")) {
/* 417 */                     File file = (new File(name)).getAbsoluteFile();
/*     */                     try {
/* 419 */                       file = file.getCanonicalFile();
/* 420 */                     } catch (IOException iOException) {}
/*     */                     
/* 422 */                     Logger.getInstance().info(null, "deleting " + file);
/* 423 */                     if (!file.delete() && file.exists()) {
/* 424 */                       undeletedFiles.add(file);
/* 425 */                       Logger.getInstance().info(null, "could not delete " + file);
/*     */                     } 
/*     */                   } 
/* 428 */                   name = reader.readLine();
/*     */                 } 
/*     */               } 
/* 431 */               reader.close();
/* 432 */               undeletedLogFile.delete();
/*     */               
/* 434 */               for (int i = 0; i < 3 && !undeletedFiles.isEmpty(); i++) {
/*     */                 
/*     */                 try {
/* 437 */                   Thread.sleep(1000L);
/* 438 */                 } catch (InterruptedException e) {
/* 439 */                   e.printStackTrace();
/*     */                 } 
/* 441 */                 for (Iterator<File> iterator = undeletedFiles.iterator(); iterator.hasNext(); ) {
/* 442 */                   File file = iterator.next();
/* 443 */                   if (file.exists()) {
/* 444 */                     if (file.delete())
/* 445 */                       iterator.remove(); 
/*     */                     continue;
/*     */                   } 
/* 448 */                   iterator.remove();
/*     */                 } 
/*     */               } 
/*     */               
/* 452 */               HashSet<String> ret = new HashSet<>();
/* 453 */               for (File undeletedFile : undeletedFiles) {
/* 454 */                 if (undeletedFile.isFile()) {
/* 455 */                   ret.add(undeletedFile.getAbsolutePath());
/*     */                 }
/*     */               } 
/* 458 */               return ret;
/*     */             }
/*     */           });
/*     */     }
/* 462 */     return Collections.emptySet();
/*     */   }
/*     */   
/*     */   private static boolean isUTF16LE(File undeletedLogFile) throws FileNotFoundException {
/* 466 */     boolean ret = false; 
/* 467 */     try { RandomAccessFile raFile = new RandomAccessFile(undeletedLogFile, "r"); 
/* 468 */       try { raFile.seek(1L);
/* 469 */         ret = (raFile.read() == 0);
/* 470 */         raFile.close(); } catch (Throwable throwable) { try { raFile.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  } catch (IOException e)
/* 471 */     { Logger.getInstance().log(e); }
/*     */     
/* 473 */     return ret;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isRollbackSupported() {
/* 478 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\UninstallPreviousAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */