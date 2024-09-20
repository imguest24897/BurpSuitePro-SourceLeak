/*     */ package com.install4j.runtime.installer.helper.applaunch;
/*     */ 
/*     */ import com.exe4j.runtime.util.ResourceHelper;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.launcher.ApplicationLauncher;
/*     */ import com.install4j.api.launcher.Variables;
/*     */ import com.install4j.runtime.beans.applications.Application;
/*     */ import com.install4j.runtime.beans.applications.ApplicationWithPath;
/*     */ import com.install4j.runtime.beans.applications.CustomApplication;
/*     */ import com.install4j.runtime.beans.styles.StyleManagerImpl;
/*     */ import com.install4j.runtime.installer.Application;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.comm.InterProcessCommunication;
/*     */ import com.install4j.runtime.installer.helper.content.ContentInstaller;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*     */ import com.install4j.runtime.launcher.Launcher;
/*     */ import com.install4j.runtime.launcher.integration.UpdateLog;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import java.awt.Window;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import javax.swing.SwingUtilities;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ApplicationLauncherImpl
/*     */ {
/*     */   public static boolean waitForInProcessApplication(long timeout, TimeUnit unit) throws InterruptedException {
/*  41 */     if (InstallerConfig.getCurrentApplication() == null) {
/*  42 */       return true;
/*     */     }
/*     */     
/*  45 */     long startTime = System.nanoTime();
/*  46 */     while (InstallerConfig.getCurrentInstance() != null && (timeout == 0L || unit.toNanos(timeout) > System.nanoTime() - startTime)) {
/*  47 */       Thread.sleep(30L);
/*     */     }
/*  49 */     return (InstallerConfig.getCurrentInstance() == null);
/*     */   }
/*     */   
/*     */   public static void launchApplicationInProcess(String applicationId, String[] arguments, ApplicationLauncher.Callback callback, ApplicationLauncher.WindowMode windowMode, Object parentWindow) {
/*  53 */     if (InstallerConfig.getCurrentApplication() != null) {
/*  54 */       throw new IllegalStateException("Only one installer application can be run at the same time.");
/*     */     }
/*  56 */     Runnable runnable = () -> {
/*     */         InstallerUtil.setInProcessCallback(callback);
/*     */         if (callback != null) {
/*     */           ApplicationLauncher.ProgressListener progressListener = callback.createProgressListener();
/*     */           if (progressListener != null) {
/*     */             ProgressCommunication.registerInProcess(progressListener);
/*     */           }
/*     */         } 
/*     */         try {
/*     */           Application.runApplicationInProcess(applicationId, arguments, (windowMode == ApplicationLauncher.WindowMode.DIALOG), (Window)parentWindow);
/*     */         } finally {
/*     */           Variables.clearInstallerVariablesCache();
/*     */           StyleManagerImpl.getInstance().clear();
/*     */           ProgressCommunication.registerInProcess(null);
/*     */         } 
/*     */       };
/*  72 */     if (SwingUtilities.isEventDispatchThread()) {
/*  73 */       (new Thread(runnable)).start();
/*     */     } else {
/*  75 */       runnable.run();
/*     */     } 
/*     */   }
/*     */   public static void launchApplication(String applicationId, String[] arguments, boolean blocking, ApplicationLauncher.Callback callback) throws IOException {
/*     */     InterProcessCommunication communication;
/*  80 */     InstallerConfig config = InstallerConfig.getConfigFromFile(InstallerUtil.getInstallerFile("i4jparams.conf"));
/*  81 */     Application app = config.getApplicationById(applicationId);
/*  82 */     if (app == null) {
/*  83 */       throw new IOException("Application with ID " + applicationId + " could not be found");
/*     */     }
/*  85 */     if (!(app instanceof CustomApplication)) {
/*  86 */       throw new IOException("Application is no custom application");
/*     */     }
/*     */     
/*  89 */     CustomApplication customApplication = (CustomApplication)app;
/*     */ 
/*     */ 
/*     */     
/*  93 */     File commFile = File.createTempFile("i4jshd", ".tmp");
/*     */     
/*  95 */     List<String> realArgs = new ArrayList<>();
/*  96 */     File executable = getExecutable(applicationId, config, customApplication, realArgs);
/*  97 */     if (arguments != null) {
/*  98 */       realArgs.addAll(Arrays.asList(arguments));
/*     */     }
/* 100 */     realArgs.add("-Dinstall4j.shutdownFile=" + commFile.getAbsolutePath());
/* 101 */     realArgs.add("-Dinstall4j.fromService=" + Launcher.isService());
/* 102 */     String launcherPath = System.getProperty("exe4j.moduleName");
/* 103 */     if (launcherPath != null) {
/* 104 */       realArgs.add("-Dinstall4j.fromLauncher=" + launcherPath);
/*     */     }
/* 106 */     String launcherId = System.getProperty("install4j.launcherId");
/* 107 */     if (launcherId != null) {
/* 108 */       realArgs.add("-Dinstall4j.fromLauncherId=" + launcherId);
/*     */     }
/* 110 */     UpdateLog.addUpdateLogProperty(realArgs);
/*     */     
/* 112 */     ApplicationLauncher.ProgressListener progressListener = createProgressListener(callback);
/*     */ 
/*     */     
/* 115 */     if (progressListener != null) {
/* 116 */       communication = createCommunication(realArgs);
/*     */     } else {
/* 118 */       communication = null;
/*     */     } 
/*     */     
/* 121 */     LaunchDescriptor launchDescriptor = (new LaunchDescriptor(executable)).arguments(realArgs.<String>toArray(new String[0])).receiveProcess(true);
/* 122 */     if (LaunchHelper.launchApplication(launchDescriptor) == null) {
/* 123 */       throw new IOException("Could not start process");
/*     */     }
/* 125 */     ShutdownWaiter shutdownWaiter = new ShutdownWaiter(commFile, callback, launchDescriptor.getProcess());
/* 126 */     shutdownWaiter.start();
/* 127 */     if (communication != null) {
/* 128 */       (new ParentIPCThread(communication, shutdownWaiter, progressListener)).start();
/*     */     }
/*     */     
/* 131 */     if (blocking) {
/*     */       try {
/* 133 */         launchDescriptor.getProcess().waitFor();
/* 134 */         shutdownWaiter.join();
/* 135 */       } catch (InterruptedException e) {
/* 136 */         e.printStackTrace();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static File getExecutable(String applicationId, InstallerConfig config, CustomApplication customApplication, List<String> realArgs) {
/* 143 */     File executable = Application.getExeFile((ApplicationWithPath)customApplication);
/* 144 */     if (executable == null || !executable.exists()) {
/* 145 */       StringUtil.splitupCommandLine(realArgs, customApplication.getVmParameters());
/*     */       
/* 147 */       if (Util.isMacOS()) {
/* 148 */         StringUtil.splitupCommandLine(realArgs, getDockOptions(config, (ApplicationWithPath)customApplication, applicationId, executable));
/*     */       }
/*     */       
/* 151 */       realArgs.add("-classpath");
/*     */       
/* 153 */       String classpath = (new File(ResourceHelper.getRuntimeDir(), "i4jruntime.jar")).getAbsolutePath();
/* 154 */       realArgs.add(classpath);
/* 155 */       realArgs.add(Application.class.getName());
/* 156 */       realArgs.add(String.valueOf(applicationId));
/*     */       
/* 158 */       StringUtil.splitupCommandLine(realArgs, customApplication.getArguments());
/*     */       
/* 160 */       return new File(System.getProperty("java.home"), "bin/java" + (Util.isWindows() ? ".exe" : ""));
/*     */     } 
/* 162 */     return executable;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private static ApplicationLauncher.ProgressListener createProgressListener(ApplicationLauncher.Callback callback) {
/* 168 */     if (callback != null && (Util.isWindows() || Util.isMacOS() || Util.isLinux() || Boolean.getBoolean("install4j.forceProgressListener"))) {
/* 169 */       return callback.createProgressListener();
/*     */     }
/* 171 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private static InterProcessCommunication createCommunication(List<String> realArgs) {
/* 177 */     InterProcessCommunication communication = new InterProcessCommunication(null, null, true, new InterProcessCommunication.ErrorLogger()
/*     */         {
/*     */           public void log(String str) {
/* 180 */             System.err.println(str);
/*     */           }
/*     */ 
/*     */           
/*     */           public void log(Throwable t) {
/* 185 */             t.printStackTrace();
/*     */           }
/*     */         });
/* 188 */     String id = communication.createListener();
/* 189 */     if (id == null) {
/* 190 */       return null;
/*     */     }
/* 192 */     realArgs.add("-Dinstall4j.progressId=" + id);
/* 193 */     realArgs.add("-Dinstall4j.progressHash=" + communication.getHash());
/*     */     
/* 195 */     return communication;
/*     */   }
/*     */   
/*     */   public static String getDockOptions(InstallerConfig config, ApplicationWithPath application, String applicationId, @Nullable File executable) {
/* 199 */     StringBuilder buffer = new StringBuilder();
/* 200 */     File iconFile = getMacosIconFile(config, application, applicationId, executable);
/* 201 */     if (iconFile != null && iconFile.exists()) {
/* 202 */       buffer.append("\"-Xdock:icon=").append(iconFile.getAbsolutePath()).append("\" ");
/*     */     }
/* 204 */     buffer.append("\"-Xdock:name=").append(application.getExecutableName()).append("\"");
/* 205 */     return buffer.toString();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   private static File getMacosIconFile(InstallerConfig config, ApplicationWithPath application, String applicationId, @Nullable File executable) {
/* 210 */     if (executable == null) {
/* 211 */       return null;
/*     */     }
/* 213 */     File iconFile = new File(executable.getAbsolutePath() + ".app", "Contents/Resources/app.icns");
/* 214 */     if (!iconFile.exists()) {
/* 215 */       if (Objects.equals(applicationId, "uninstaller"))
/* 216 */         return getMacosUninstallerIcon(config, executable); 
/* 217 */       if (config.getMacSpecificConfig().isSingleBundle()) {
/* 218 */         return getMacosSingleBundleAppIcon(config, application);
/*     */       }
/* 220 */       return null;
/*     */     } 
/*     */     
/* 223 */     return iconFile;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static File getMacosUninstallerIcon(InstallerConfig config, @NotNull File executable) {
/* 229 */     String applicationName = ContentInstaller.replaceSlashes(config.getApplicationName());
/* 230 */     String uninstallerName = Messages.format(Messages.getString(".UninstallerMenuEntry"), new Object[] { applicationName });
/* 231 */     return new File(executable.getParentFile() + "/" + uninstallerName + ".app", "Contents/Resources/app.icns");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static File getMacosSingleBundleAppIcon(InstallerConfig config, ApplicationWithPath application) {
/* 236 */     String executableDir = getMacosExecutableDir(config, application);
/*     */     
/* 238 */     File iconFile = new File(ResourceHelper.getRuntimeDir(), "icons/" + executableDir + "/" + application.getExecutableName() + ".icns");
/* 239 */     if (!iconFile.exists()) {
/* 240 */       return new File(ResourceHelper.getRuntimeDir(), "icons/app.icns");
/*     */     }
/*     */     
/* 243 */     return iconFile;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static String getMacosExecutableDir(InstallerConfig config, ApplicationWithPath application) {
/* 249 */     String executableDir = application.getUsedExecutableDirectory();
/* 250 */     if (executableDir.startsWith(config.getMacSpecificConfig().getRuntimeDirParent())) {
/* 251 */       return executableDir.substring(config.getMacSpecificConfig().getRuntimeDirParent().length());
/*     */     }
/* 253 */     return executableDir;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\applaunch\ApplicationLauncherImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */