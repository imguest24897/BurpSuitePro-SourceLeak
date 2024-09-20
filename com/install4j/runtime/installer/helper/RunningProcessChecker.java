/*     */ package com.install4j.runtime.installer.helper;
/*     */ 
/*     */ import com.install4j.api.ProcessInfo;
/*     */ import com.install4j.api.UiUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchStringAction;
/*     */ import com.install4j.runtime.installer.helper.console.ConsoleImpl;
/*     */ import com.install4j.runtime.installer.platform.macos.MacProcessHelper;
/*     */ import com.install4j.runtime.installer.platform.win32.Misc;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import java.util.Objects;
/*     */ import java.util.Set;
/*     */ import java.util.TreeSet;
/*     */ 
/*     */ 
/*     */ public class RunningProcessChecker
/*     */ {
/*     */   public static final int CLOSE_STRATEGY_NONE = 0;
/*     */   public static final int CLOSE_STRATEGY_ASK_ONLY = 1;
/*     */   public static final int CLOSE_STRATEGY_ASK_FOR_CLOSE = 2;
/*     */   public static final int CLOSE_STRATEGY_ASK_FOR_CLOSE_AND_TERMINATE = 3;
/*     */   
/*     */   public static boolean areInstalledLaunchersRunning() {
/*     */     try {
/*  41 */       return !checkRunningProcessesInt(getLauncherFileNames(), null, 0, 0, false);
/*  42 */     } catch (UserCanceledException userCanceledException) {
/*     */     
/*  44 */     } catch (IOException e) {
/*  45 */       Logger.getInstance().log(e);
/*     */     } 
/*  47 */     return false;
/*     */   }
/*     */   public static final int CLOSE_STRATEGY_ASK_FOR_TERMINATE = 4; public static final int CLOSE_STRATEGY_CLOSE = 5; public static final int CLOSE_STRATEGY_TERMINATE = 6; private static boolean defaultChecked = false;
/*     */   public static boolean checkDefaultRunningLauncher() throws UserCanceledException {
/*     */     String message;
/*  52 */     if (InstallerConfig.getCurrentInstance().isAddOnInstaller()) {
/*  53 */       message = Messages.format(Messages.getString(".AppRunningErrorAddOn"), new Object[] { "install4j" });
/*     */     } else {
/*  55 */       message = Messages.format(Messages.getString(".AppRunningError"), new Object[] { "install4j", InstallerConfig.getCurrentInstance().getApplicationName() });
/*     */     } 
/*  57 */     return checkDefaultRunningLauncher(message);
/*     */   }
/*     */   
/*     */   public static boolean checkDefaultRunningLauncher(String message) throws UserCanceledException {
/*  61 */     if (Boolean.getBoolean("install4j.dontCheckProcesses")) {
/*  62 */       return true;
/*     */     }
/*     */     
/*  65 */     if (isPlatformSupported() || defaultChecked) {
/*  66 */       return true;
/*     */     }
/*     */     
/*     */     try {
/*  70 */       return defaultChecked = checkRunningProcessesInt(getLauncherFileNames(), message, 1, 0, false);
/*  71 */     } catch (IOException e) {
/*  72 */       Logger.getInstance().log(e);
/*  73 */       return true;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean checkRunningProcesses(String message, int closeStrategy, int timeOut, boolean allowIgnore, boolean includeLaunchers, File[] additionalFiles) throws UserCanceledException {
/*  78 */     if (isPlatformSupported()) {
/*  79 */       return true;
/*     */     }
/*     */     
/*  82 */     Set<String> fileNames = new HashSet<>();
/*     */     try {
/*  84 */       if (includeLaunchers) {
/*  85 */         fileNames.addAll(getLauncherFileNames());
/*     */       }
/*  87 */       if (additionalFiles != null) {
/*  88 */         for (File additionalFile : additionalFiles) {
/*  89 */           if (additionalFile.isAbsolute()) {
/*  90 */             fileNames.add(additionalFile.getCanonicalPath());
/*     */           } else {
/*  92 */             fileNames.add(additionalFile.getName());
/*     */           } 
/*     */         } 
/*     */       }
/*  96 */     } catch (IOException e) {
/*  97 */       Logger.getInstance().log(e);
/*     */     } 
/*     */     
/* 100 */     boolean notRunning = checkRunningProcessesInt(fileNames, message, closeStrategy, timeOut, allowIgnore);
/* 101 */     if (includeLaunchers && notRunning) {
/* 102 */       defaultChecked = true;
/*     */     }
/* 104 */     return notRunning;
/*     */   }
/*     */   
/*     */   private static boolean checkRunningProcessesInt(Set<String> fileNames, String message, int closeStrategy, int wmCloseTimeout, boolean allowIgnore) throws UserCanceledException {
/* 108 */     boolean firstTime = true;
/*     */     while (true) {
/* 110 */       Collection<ProcessInfo> running = getRunningProcesses(fileNames);
/* 111 */       if (running.size() == 0) {
/* 112 */         return true;
/*     */       }
/* 114 */       if (closeStrategy == 0)
/* 115 */         return false; 
/* 116 */       if (closeStrategy == 5)
/* 117 */         return closeProcesses(false, wmCloseTimeout, running); 
/* 118 */       if (closeStrategy == 6) {
/* 119 */         return closeProcesses(true, wmCloseTimeout, running);
/*     */       }
/*     */       
/* 122 */       if (InstallerUtil.isUnattendedWithoutAlerts() && !Boolean.getBoolean("install4j.unattendedShowRunningProcessDialog")) {
/* 123 */         if (message != null) {
/* 124 */           ConsoleImpl.getInstance().println(Messages.getString(".UnattendedRunningFailure"));
/*     */         }
/* 126 */         return false;
/*     */       } 
/* 128 */       if (message == null) {
/* 129 */         return false;
/*     */       }
/*     */       
/* 132 */       Set<String> processNames = new TreeSet<>();
/* 133 */       for (ProcessInfo processInfo : running) {
/* 134 */         String windowTitle = processInfo.getWindowTitle();
/* 135 */         if (windowTitle != null && windowTitle.trim().length() > 0 && !windowTitle.equals("Default IME") && !windowTitle.equals("theAwtToolkitWindow")) {
/* 136 */           processNames.add(windowTitle); continue;
/*     */         } 
/* 138 */         processNames.add((new File(processInfo.getModuleName())).getAbsolutePath());
/*     */       } 
/*     */ 
/*     */       
/* 142 */       List<String> buttonTexts = new ArrayList<>();
/* 143 */       switch (closeStrategy) {
/*     */         case 2:
/* 145 */           buttonTexts.add(Messages.getString(".ButtonCloseProcesses"));
/*     */           break;
/*     */         case 3:
/* 148 */           buttonTexts.add(Messages.getString(firstTime ? ".ButtonCloseProcesses" : ".ButtonTerminateProcesses"));
/*     */           break;
/*     */         case 4:
/* 151 */           buttonTexts.add(Messages.getString(".ButtonTerminateProcesses")); break;
/*     */       } 
/* 153 */       buttonTexts.add(Messages.getString(".ButtonRetry"));
/* 154 */       if (allowIgnore) {
/* 155 */         buttonTexts.add(Messages.getString(".ButtonIgnore"));
/*     */       }
/*     */       
/* 158 */       String result = showDialog(message, processNames, buttonTexts);
/*     */       
/* 160 */       if (result == null)
/* 161 */         return false; 
/* 162 */       if (Objects.equals(result, Messages.getString(".ButtonIgnore")))
/* 163 */         return true; 
/* 164 */       if (Objects.equals(result, Messages.getString(".ButtonTerminateProcesses"))) {
/* 165 */         if (closeProcesses(true, wmCloseTimeout, running)) {
/* 166 */           return true;
/*     */         }
/* 168 */       } else if (Objects.equals(result, Messages.getString(".ButtonCloseProcesses")) && 
/* 169 */         closeProcesses(false, wmCloseTimeout, running)) {
/* 170 */         return true;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 175 */       firstTime = false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static String showDialog(final String message, final Collection<String> processNames, final List<String> buttonTexts) throws UserCanceledException {
/* 180 */     if (InstallerUtil.isConsole()) {
/* 181 */       ConsoleImpl console = ConsoleImpl.getInstance();
/* 182 */       console.println(message);
/* 183 */       console.println();
/* 184 */       for (String processName : processNames) {
/* 185 */         console.println("* " + processName);
/*     */       }
/* 187 */       console.println();
/* 188 */       String[] options = buttonTexts.<String>toArray(new String[0]);
/* 189 */       return options[console.askOption(null, options, null)];
/*     */     } 
/* 191 */     return HelperCommunication.getInstance().fetchString(ExecutionContext.UNELEVATED, new FetchStringAction()
/*     */         {
/*     */           protected String fetchValue(Context context) throws Exception {
/* 194 */             RunningProcessesDialog runningProcessesDialog = new RunningProcessesDialog(UiUtil.getParentWindow(), message, processNames, buttonTexts);
/* 195 */             runningProcessesDialog.setVisible(true);
/* 196 */             if (runningProcessesDialog.isCanceled()) {
/* 197 */               return null;
/*     */             }
/* 199 */             return buttonTexts.get(runningProcessesDialog.getSelectedButtonIndex());
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean closeProcesses(final boolean force, final int wmCloseTimeout, Collection<ProcessInfo> running) {
/* 207 */     final int[] ids = new int[running.size()];
/* 208 */     int i = 0;
/* 209 */     for (ProcessInfo processInfo : running) {
/* 210 */       ids[i++] = processInfo.getProcessId();
/*     */     }
/* 212 */     return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.MAXIMUM, new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws Exception {
/* 215 */             if (Util.isWindows())
/* 216 */               return (Misc.terminateProcesses(ids, force, wmCloseTimeout) == 1); 
/* 217 */             if (Util.isMacOS()) {
/* 218 */               return MacProcessHelper.terminateProcesses(ids, force, (wmCloseTimeout == 0) ? 5000 : wmCloseTimeout);
/*     */             }
/* 220 */             return false;
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   private static Set<String> getLauncherFileNames() throws IOException {
/* 227 */     ContextInt context = ContextImpl.getContextInt((Context)ContextImpl.getSingleContextInt());
/* 228 */     InstallationProperties installationProperties = context.getInstallationProperties();
/* 229 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/*     */     
/* 231 */     Set<String> launcherFiles = installationProperties.getCanonicalPathPropertySet("launcher");
/* 232 */     if (Util.isMacosInstaller() && config.getMacSpecificConfig().isSingleBundle()) {
/* 233 */       String singleBundleName = config.getMacSpecificConfig().getSingleBundleName();
/* 234 */       singleBundleName = singleBundleName.substring(0, singleBundleName.length() - ".app".length());
/* 235 */       launcherFiles.add((new File(context.getInstallationDirectory(), getLauncherExecutable(singleBundleName))).getCanonicalPath());
/*     */     }
/* 237 */     else if (!(context instanceof com.install4j.api.context.UninstallerContext)) {
/* 238 */       String path = (new File(context.getInstallationDirectory(), getLauncherExecutable(config.getUninstallerPath()))).getCanonicalPath();
/* 239 */       launcherFiles.add(path);
/*     */     } 
/*     */     
/* 242 */     return launcherFiles;
/*     */   }
/*     */   
/*     */   private static String getLauncherExecutable(String launcherPath) {
/* 246 */     if (Util.isWindows())
/* 247 */       return launcherPath + ".exe"; 
/* 248 */     if (Util.isMacOS()) {
/* 249 */       return launcherPath + ".app/Contents/MacOS/" + "JavaApplicationStub";
/*     */     }
/* 251 */     return launcherPath;
/*     */   }
/*     */ 
/*     */   
/*     */   private static Collection<ProcessInfo> getRunningProcesses(Set<String> fileNames) {
/* 256 */     Set<ProcessInfo> ret = new HashSet<>();
/*     */     
/* 258 */     checkModules(ret, fileNames, (ProcessInfo[])HelperCommunication.getInstance().fetchObject(ExecutionContext.SAME, new GetModulesRemoteCallable()));
/* 259 */     if (HelperCommunication.getInstance().isConnected() && Util.isWindows()) {
/* 260 */       checkModules(ret, fileNames, (ProcessInfo[])HelperCommunication.getInstance().fetchObject(ExecutionContext.OTHER, new GetModulesRemoteCallable()));
/*     */     }
/* 262 */     return ret;
/*     */   }
/*     */   
/*     */   public static Collection<ProcessInfo> getAllRunningProcesses() {
/* 266 */     return getRunningProcesses(null);
/*     */   }
/*     */   
/*     */   private static void checkModules(Collection<ProcessInfo> ret, Set<String> fileNames, ProcessInfo[] processInfos) {
/* 270 */     if (processInfos == null) {
/*     */       return;
/*     */     }
/* 273 */     if (fileNames == null) {
/* 274 */       ret.addAll(Arrays.asList(processInfos));
/*     */     } else {
/* 276 */       for (ProcessInfo module : processInfos) {
/*     */         File file;
/*     */         try {
/* 279 */           file = (new File(module.getModuleName())).getCanonicalFile();
/* 280 */         } catch (IOException e) {}
/*     */ 
/*     */         
/* 283 */         if (fileNames.contains(file.getAbsolutePath()) || fileNames.contains(file.getName())) {
/* 284 */           ret.add(module);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean isPlatformSupported() {
/* 291 */     if (InstallerUtil.isMacOS() && Boolean.getBoolean("install4j.disableMacosProcessCheck")) {
/* 292 */       return false;
/*     */     }
/* 294 */     return (!InstallerUtil.isWindows() && !InstallerUtil.isMacOS());
/*     */   }
/*     */   
/*     */   private static class GetModulesRemoteCallable
/*     */     extends FetchObjectAction<ProcessInfo[]> {
/*     */     private GetModulesRemoteCallable() {}
/*     */     
/*     */     protected ProcessInfo[] fetchValue(Context context) throws Exception {
/* 302 */       RunningProcessChecker.RunningProcessThread runningProcessThread = new RunningProcessChecker.RunningProcessThread();
/* 303 */       runningProcessThread.start();
/*     */       
/*     */       try {
/* 306 */         runningProcessThread.join(30000L);
/* 307 */       } catch (InterruptedException interruptedException) {}
/*     */       
/* 309 */       if (runningProcessThread.isAlive()) {
/* 310 */         runningProcessThread.stop();
/*     */       }
/* 312 */       return runningProcessThread.getProcessInfos();
/*     */     }
/*     */   }
/*     */   
/*     */   private static class RunningProcessThread
/*     */     extends Thread {
/* 318 */     private ProcessInfo[] processInfos = null;
/*     */     
/*     */     public RunningProcessThread() {
/* 321 */       super("running-process-thread");
/* 322 */       setDaemon(true);
/* 323 */       setPriority(3);
/*     */     }
/*     */     
/*     */     public ProcessInfo[] getProcessInfos() {
/* 327 */       return this.processInfos;
/*     */     }
/*     */ 
/*     */     
/*     */     public void run() {
/* 332 */       if (Util.isWindows()) {
/* 333 */         this.processInfos = (ProcessInfo[])Misc.getRunningProcesses();
/* 334 */       } else if (Util.isMacOS()) {
/* 335 */         this.processInfos = (ProcessInfo[])MacProcessHelper.getRunningProcesses();
/*     */       } else {
/* 337 */         this.processInfos = new ProcessInfo[0];
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\RunningProcessChecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */