/*      */ package com.install4j.runtime.installer.helper;
/*      */ import com.ejt.internal.util.JavaVersionUtil;
/*      */ import com.exe4j.runtime.util.NullOutputStream;
/*      */ import com.install4j.api.Util;
/*      */ import com.install4j.api.beans.ScriptProperty;
/*      */ import com.install4j.api.context.Context;
/*      */ import com.install4j.api.context.InstallerContext;
/*      */ import com.install4j.api.context.UserCanceledException;
/*      */ import com.install4j.api.launcher.ApplicationLauncher;
/*      */ import com.install4j.api.windows.RegistryRoot;
/*      */ import com.install4j.api.windows.WinRegistry;
/*      */ import com.install4j.runtime.beans.applications.Application;
/*      */ import com.install4j.runtime.beans.applications.ExecutionMode;
/*      */ import com.install4j.runtime.installer.InstallerVariables;
/*      */ import com.install4j.runtime.installer.config.InstallerConfig;
/*      */ import com.install4j.runtime.installer.config.ScriptClassOrigin;
/*      */ import com.install4j.runtime.installer.frontend.GUIHelper;
/*      */ import com.install4j.runtime.installer.frontend.Messages;
/*      */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*      */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*      */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*      */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*      */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*      */ import com.install4j.runtime.installer.helper.comm.responses.Response;
/*      */ import com.install4j.runtime.installer.helper.console.ConsoleImpl;
/*      */ import com.install4j.runtime.installer.platform.win32.FolderInfo;
/*      */ import com.install4j.runtime.installer.platform.win32.Misc;
/*      */ import com.install4j.runtime.launcher.integration.AutomaticUpdate;
/*      */ import com.install4j.runtime.launcher.integration.UpdateLog;
/*      */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*      */ import com.install4j.runtime.util.StringUtil;
/*      */ import java.io.BufferedReader;
/*      */ import java.io.BufferedWriter;
/*      */ import java.io.ByteArrayOutputStream;
/*      */ import java.io.File;
/*      */ import java.io.FileInputStream;
/*      */ import java.io.FileOutputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.io.OutputStreamWriter;
/*      */ import java.io.PrintStream;
/*      */ import java.io.PrintWriter;
/*      */ import java.io.Reader;
/*      */ import java.io.StringWriter;
/*      */ import java.io.UnsupportedEncodingException;
/*      */ import java.io.Writer;
/*      */ import java.lang.management.PlatformLoggingMXBean;
/*      */ import java.lang.reflect.Field;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Enumeration;
/*      */ import java.util.HashSet;
/*      */ import java.util.List;
/*      */ import java.util.Locale;
/*      */ import java.util.Map;
/*      */ import java.util.Objects;
/*      */ import java.util.Set;
/*      */ import java.util.logging.Handler;
/*      */ import java.util.logging.Logger;
/*      */ import java.util.regex.Matcher;
/*      */ import java.util.regex.Pattern;
/*      */ import java.util.zip.ZipEntry;
/*      */ import java.util.zip.ZipFile;
/*      */ import javax.swing.JOptionPane;
/*      */ 
/*      */ public class InstallerUtil {
/*   67 */   public static final String OS_NAME = System.getProperty("os.name");
/*   68 */   public static final String LOWER_CASE_OS_NAME = OS_NAME.toLowerCase(Locale.ENGLISH);
/*   69 */   public static final String OS_VERSION = System.getProperty("os.version");
/*   70 */   public static final String OS_ARCH = System.getProperty("os.arch", "");
/*      */   public static final String COMPLETION_CLASS_NAME = "Completion";
/*      */   public static final String COMPLETION_STATIC_CLASS_NAME = "CompletionStatic";
/*      */   private static final String SIMPLE_CLASS_NAME_PREFIX = "I4jScript_Internal_";
/*      */   public static final String SCRIPT_PACKAGE = "com.install4j.script";
/*      */   private static final String SCRIPT_PACKAGE_PREFIX = "com.install4j.script.";
/*      */   public static final String CLASS_NAME_PREFIX = "com.install4j.script.I4jScript_Internal_";
/*      */   public static final String STATIC_MEMBERS_CLASS_NAME = "com.install4j.script.I4jScript_Internal_0";
/*   78 */   private static final Pattern CLASS_NAME_PATTERN = Pattern.compile("(I4jScript_Internal_\\d+|CompletionStatic)\\.java");
/*   79 */   private static final Pattern LINE_NUMBER_PATTERN = Pattern.compile("(I4jScript_Internal_\\d+|Completion|CompletionStatic)\\.java(?::(\\d+)|\\s+\\(at line (\\d+)\\))");
/*      */   
/*      */   public static final String TITLE_INSTALL4J = "install4j";
/*   82 */   public static final boolean DEBUG = Boolean.getBoolean("install4j.debug");
/*   83 */   public static final boolean INTEGRATION_TEST = Boolean.getBoolean("install4j.installerIntegrationTest");
/*      */   
/*      */   public static final String REGKEY_EXE4J = "SOFTWARE\\ej-technologies\\exe4j\\";
/*      */   
/*      */   public static final String REGKEY_INSTALL4J = "SOFTWARE\\ej-technologies\\install4j\\";
/*      */   
/*      */   public static final String INSTALL4J_ARGUMENTS = "INSTALL4J_ARGUMENTS";
/*      */   
/*      */   private static final String REGVAL_INSTALL_STARTED = "InstallStarted";
/*      */   private static final String PROPNAME_ALLOW_AMBIGUOUS_COMMANDS = "jdk.lang.Process.allowAmbiguousCommands";
/*      */   private static ApplicationLauncher.Callback inProcessCallback;
/*   94 */   private static State state = new State();
/*      */   
/*   96 */   private static final Pattern HTML_CONTENT_TYPE_PATTERN = Pattern.compile("<html\\s*>.*<meta\\s+http-equiv\\s*=\\s*([\"'])Content-Type\\1\\s+content\\s*=\\s*([\"'])text/html;\\s+charset=(.*?)\\2", 34);
/*      */ 
/*      */   
/*      */   private static volatile boolean exiting;
/*      */ 
/*      */   
/*      */   private static Boolean headless;
/*      */   
/*      */   private static Object prefsLogger;
/*      */   
/*  106 */   private static Set<File> deleteOnExitFiles = new HashSet<>();
/*      */   
/*      */   static {
/*  109 */     disablePreferencesLoggingImpl();
/*      */     
/*  111 */     if (!isWindows() && !isMacOS() && !Util.hasFullAdminRights()) {
/*  112 */       PreferencesUtil.setDisableSystemRoot(true);
/*      */     }
/*      */   }
/*      */   
/*      */   public static boolean isExiting() {
/*  117 */     return exiting;
/*      */   }
/*      */   
/*      */   public static void setStartupVmParameters() {
/*  121 */     System.setProperty("jdk.http.auth.tunneling.disabledSchemes", "");
/*  122 */     if (!Util.isWindows() && !Util.isMacOS() && System.getProperty("java.net.useSystemProxies") == null) {
/*  123 */       System.setProperty("java.net.useSystemProxies", "true");
/*      */     }
/*      */   }
/*      */   
/*      */   public static boolean isInProcess() {
/*  128 */     return state.inProcess;
/*      */   }
/*      */   
/*      */   public static void setInProcess(boolean inProcess) {
/*  132 */     state.inProcess = inProcess;
/*  133 */     if (!inProcess) {
/*  134 */       setStartupVmParameters();
/*  135 */       disableNonSevereLogging();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  143 */       if (System.getProperty("jdk.lang.Process.allowAmbiguousCommands") == null) {
/*  144 */         System.setProperty("jdk.lang.Process.allowAmbiguousCommands", "false");
/*      */       }
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void setShutdownOnInProcessExit(boolean shutdownOnInProcessExit) {
/*  150 */     HelperCommunication.helperUnsupported();
/*  151 */     state.shutdownOnInProcessExit = shutdownOnInProcessExit;
/*      */   }
/*      */   
/*      */   public static void setInProcessCallback(ApplicationLauncher.Callback inProcessCallback) {
/*  155 */     HelperCommunication.helperUnsupported();
/*  156 */     InstallerUtil.inProcessCallback = inProcessCallback;
/*      */   }
/*      */ 
/*      */   
/*      */   public static String getInstallerType() {
/*  161 */     if (state.installerType == null) {
/*  162 */       InstallerConfig config = InstallerConfig.getCurrentInstance();
/*  163 */       if (config == null) {
/*      */         try {
/*  165 */           config = InstallerConfig.getGeneralConfigFromFile(getInstallerFile("i4jparams.conf"));
/*  166 */         } catch (IOException e) {
/*  167 */           throw new RuntimeException(e);
/*      */         } 
/*      */       }
/*  170 */       state.installerType = config.getType();
/*      */     } 
/*  172 */     return state.installerType;
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean isArchive() {
/*  177 */     if (state.archive == null) {
/*  178 */       InstallerConfig config = InstallerConfig.getCurrentInstance();
/*  179 */       if (config == null) {
/*      */         try {
/*  181 */           config = InstallerConfig.getGeneralConfigFromFile(getInstallerFile("i4jparams.conf"));
/*  182 */         } catch (IOException e) {
/*  183 */           throw new RuntimeException(e);
/*      */         } 
/*      */       }
/*  186 */       state.archive = Boolean.valueOf(config.isArchive());
/*      */     } 
/*  188 */     return Objects.equals(state.archive, Boolean.TRUE);
/*      */   }
/*      */   
/*      */   public static void storeJreInfoForInstaller() {
/*  192 */     if (InstallerConfig.isInstaller()) {
/*      */       try {
/*  194 */         PrintWriter pw = new PrintWriter(new FileWriter(new File(System.getProperty("user.dir"), "inst_jre.cfg")));
/*  195 */         pw.println(System.getProperty("java.home"));
/*  196 */         pw.close();
/*  197 */       } catch (IOException e) {
/*  198 */         Logger.getInstance().log(e);
/*      */       } 
/*      */     }
/*      */   }
/*      */   
/*      */   public static String replaceHomeDir(String fileName) {
/*  204 */     if (fileName.startsWith("~")) {
/*  205 */       return Util.getUserHome() + fileName.substring(1);
/*      */     }
/*  207 */     return fileName;
/*      */   }
/*      */ 
/*      */   
/*      */   public static File getAbsoluteFile(File file) {
/*  212 */     if (INTEGRATION_TEST && !file.isAbsolute())
/*      */     {
/*      */       
/*  215 */       return new File(System.getProperty("user.dir"), file.getPath());
/*      */     }
/*  217 */     file.getAbsolutePath();
/*  218 */     return file.getAbsoluteFile();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static long getPid(Process process) {
/*      */     try {
/*  226 */       if (!System.getProperty("java.version", "").startsWith("1."))
/*  227 */         return ((Long)Process.class.getMethod("pid", new Class[0]).invoke(process, new Object[0])).longValue(); 
/*  228 */       if (isWindows()) {
/*  229 */         Field handleField = process.getClass().getDeclaredField("handle");
/*  230 */         handleField.setAccessible(true);
/*  231 */         return Misc.getPidFromHandle(((Number)handleField.get(process)).longValue());
/*      */       } 
/*  233 */       Field pidField = process.getClass().getDeclaredField("pid");
/*  234 */       pidField.setAccessible(true);
/*  235 */       return ((Number)pidField.get(process)).longValue();
/*      */     }
/*  237 */     catch (Throwable e) {
/*  238 */       Logger.getInstance().log(e);
/*      */       
/*  240 */       return 0L;
/*      */     } 
/*      */   }
/*      */   public static boolean isBlockingLauncherIntegration() {
/*  244 */     return state.blockingLauncherIntegration;
/*      */   }
/*      */   
/*      */   public static void setBlockingLauncherIntegration(boolean launcherIntegration) {
/*  248 */     state.blockingLauncherIntegration = launcherIntegration;
/*      */   }
/*      */   
/*      */   private static class StateResponse extends Response {
/*      */     private InstallerUtil.State remoteState;
/*      */     
/*      */     private StateResponse(InstallerUtil.State remoteState) {
/*  255 */       this.remoteState = remoteState;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void initHelperState() {
/*  267 */     state = ((StateResponse)HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, new CommunicationAction() { public Response execute(Context context) throws UserCanceledException { InstallerUtil.getInstallerType(); return new InstallerUtil.StateResponse(InstallerUtil.state); } })).remoteState;
/*      */   }
/*      */   
/*      */   public static void exit(int status) {
/*  271 */     UpdateLog.logIfUpdater(1, "installer application finished with status " + status);
/*  272 */     HelperCommunication.helperUnsupported();
/*  273 */     AutomaticUpdate.checkAutoUpdateLauncher();
/*      */     
/*  275 */     if (!state.inProcess) {
/*  276 */       exiting = true;
/*  277 */       System.exit(status);
/*      */     } else {
/*  279 */       resetApplicationEnvironment();
/*  280 */       state.blockingLauncherIntegration = false;
/*  281 */       if (state.shutdownOnInProcessExit && status == 0) {
/*  282 */         if (inProcessCallback != null) {
/*  283 */           inProcessCallback.prepareShutdown();
/*      */         }
/*  285 */         exiting = true;
/*  286 */         System.exit(0);
/*      */       }
/*  288 */       else if (inProcessCallback != null) {
/*  289 */         inProcessCallback.exited(status);
/*  290 */         inProcessCallback = null;
/*      */       } 
/*      */       
/*  293 */       for (File file : deleteOnExitFiles) {
/*  294 */         if (file.exists() && !file.delete()) {
/*  295 */           file.deleteOnExit();
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void resetApplicationEnvironment() {
/*  302 */     ContextImpl.clearContext();
/*  303 */     InstallerConfig.clearCurrentApplication();
/*  304 */     FileInstaller.clearFileInstaller();
/*  305 */     AbstractBeanConfig.clearBeans();
/*  306 */     InstallerVariables.setReplaceI18nVariables(false);
/*  307 */     InstallerVariables.setReplaceInstallerAndCompilerVariables(false);
/*  308 */     InstallerVariables.clearVariables();
/*      */   }
/*      */   
/*      */   public static boolean isUnattended() {
/*  312 */     return state.unattended;
/*      */   }
/*      */   
/*      */   public static void setUnattended(boolean unattended) {
/*  316 */     state.unattended = unattended;
/*      */   }
/*      */   
/*      */   public static boolean isUnattendedAlerts() {
/*  320 */     return state.unattendedAlerts;
/*      */   }
/*      */   
/*      */   public static void setUnattendedAlerts(boolean unattendedAlerts) {
/*  324 */     state.unattendedAlerts = unattendedAlerts;
/*      */   }
/*      */   
/*      */   public static boolean isUnattendedWithProgress() {
/*  328 */     return state.unattendedWithProgress;
/*      */   }
/*      */   
/*      */   public static void setUnattendedWithProgress(boolean unattendedWithProgress) {
/*  332 */     state.unattendedWithProgress = unattendedWithProgress;
/*      */   }
/*      */   
/*      */   public static boolean isUnattendedWithoutAlerts() {
/*  336 */     return (isUnattended() && !isUnattendedAlerts());
/*      */   }
/*      */   
/*      */   public static boolean isConsole() {
/*  340 */     return state.console;
/*      */   }
/*      */   
/*      */   public static void setConsole(boolean console) {
/*  344 */     state.console = console;
/*      */   }
/*      */   
/*      */   public static boolean isSolaris() {
/*  348 */     return Objects.equals(OS_NAME, "SunOS");
/*      */   }
/*      */   
/*      */   public static boolean isLinux() {
/*  352 */     return LauncherUtil.isLinux();
/*      */   }
/*      */   
/*      */   public static boolean isWindows() {
/*  356 */     return LauncherUtil.isWindows();
/*      */   }
/*      */   
/*      */   public static boolean isWindowsXP() {
/*  360 */     return LOWER_CASE_OS_NAME.startsWith("windows xp");
/*      */   }
/*      */   
/*      */   public static boolean isWindows2000() {
/*  364 */     return LOWER_CASE_OS_NAME.startsWith("windows 2000");
/*      */   }
/*      */   
/*      */   public static boolean isMacOS() {
/*  368 */     return LauncherUtil.isMacOS();
/*      */   }
/*      */   
/*      */   public static boolean isWindowsNT() {
/*  372 */     return ((LOWER_CASE_OS_NAME.startsWith("windows nt") || LOWER_CASE_OS_NAME
/*  373 */       .startsWith("windowsnt")) && 
/*  374 */       !OS_VERSION.startsWith("6"));
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean isAtLeastWindows2000() {
/*      */     try {
/*  380 */       return (isWindows() && Double.parseDouble(OS_VERSION.substring(0, 3)) >= 5.0D);
/*  381 */     } catch (Exception e) {
/*  382 */       return false;
/*      */     } 
/*      */   }
/*      */   
/*      */   public static boolean isAtLeastWindowsVista() {
/*  387 */     return (isWindows() && Double.parseDouble(OS_VERSION.substring(0, 3)) >= 6.0D);
/*      */   }
/*      */   
/*      */   public static boolean isAtLeastWindows10() {
/*  391 */     return (isWindows() && Double.parseDouble(OS_VERSION.substring(0, 3)) >= 10.0D);
/*      */   }
/*      */   
/*      */   public static boolean isAtLeastWindows7() {
/*      */     try {
/*  396 */       return (isWindows() && Double.parseDouble(OS_VERSION.substring(0, 3)) >= 6.1D);
/*  397 */     } catch (Exception e) {
/*  398 */       return false;
/*      */     } 
/*      */   }
/*      */   
/*      */   public static boolean isWindowsVista() {
/*  403 */     return (LOWER_CASE_OS_NAME.startsWith("windows vista") || (LOWER_CASE_OS_NAME
/*  404 */       .startsWith("windows nt") && OS_VERSION.startsWith("6.0")));
/*      */   }
/*      */   
/*      */   public static boolean isWindows7() {
/*  408 */     return (LOWER_CASE_OS_NAME.startsWith("windows 7") || (LOWER_CASE_OS_NAME
/*  409 */       .startsWith("windows vista") && OS_VERSION.startsWith("6.1")));
/*      */   }
/*      */   
/*      */   public static boolean isWindows8() {
/*  413 */     return (LOWER_CASE_OS_NAME.startsWith("windows") && (OS_VERSION.startsWith("6.2") || OS_VERSION.startsWith("6.3")));
/*      */   }
/*      */   
/*      */   public static boolean isWindows10() {
/*  417 */     return (LOWER_CASE_OS_NAME.startsWith("windows") && OS_VERSION.startsWith("10.0"));
/*      */   }
/*      */   
/*      */   public static boolean isWindows11() {
/*  421 */     return (LOWER_CASE_OS_NAME.startsWith("windows") && OS_VERSION.startsWith("10.0") && Misc.getOsBuildNumber() >= 22000);
/*      */   }
/*      */   
/*      */   public static boolean isWindows2003() {
/*  425 */     return (LOWER_CASE_OS_NAME.startsWith("windows") && OS_NAME.contains("2003"));
/*      */   }
/*      */   
/*      */   public static boolean isWindows2008() {
/*  429 */     return (LOWER_CASE_OS_NAME.startsWith("windows") && OS_NAME.contains("2008"));
/*      */   }
/*      */   
/*      */   public static boolean isWindows2012() {
/*  433 */     return (LOWER_CASE_OS_NAME.startsWith("windows") && OS_NAME.contains("2012"));
/*      */   }
/*      */   
/*      */   public static boolean isWindows2016() {
/*  437 */     return (LOWER_CASE_OS_NAME.startsWith("windows") && OS_NAME.contains("2016"));
/*      */   }
/*      */   
/*      */   public static boolean isHpux() {
/*  441 */     return Objects.equals(OS_NAME, "HP-UX");
/*      */   }
/*      */   
/*      */   public static boolean isAix() {
/*  445 */     return Objects.equals(OS_NAME, "AIX");
/*      */   }
/*      */   
/*      */   public static boolean is32BitJVM() {
/*  449 */     return Objects.equals(System.getProperty("sun.arch.data.model", "32"), "32");
/*      */   }
/*      */   
/*      */   public static boolean isJava9Plus() {
/*  453 */     return JavaVersionUtil.isJava9Plus();
/*      */   }
/*      */   
/*      */   public static boolean isArm() {
/*  457 */     return (OS_ARCH.startsWith("arm") || isAaarch64());
/*      */   }
/*      */   
/*      */   public static boolean isAaarch64() {
/*  461 */     return OS_ARCH.startsWith("aarch64");
/*      */   }
/*      */   public static String getStandardApplicationsDirectory(boolean userSpecific) {
/*      */     String rootDirName;
/*  465 */     if (isWindows()) {
/*  466 */       if (userSpecific) {
/*  467 */         File dir = FolderInfo.getSpecialFolder(1002, false);
/*  468 */         if (dir == null) {
/*  469 */           dir = FolderInfo.getSpecialFolder(11, false);
/*      */         }
/*  471 */         if (dir == null) {
/*  472 */           dir = new File(System.getProperty("user.home"));
/*      */         }
/*  474 */         return dir.getAbsolutePath();
/*      */       } 
/*      */       
/*  477 */       return FolderInfo.getProgramFilesDirectory().getAbsolutePath();
/*      */     } 
/*  479 */     if (isMacOS()) {
/*  480 */       if (userSpecific) {
/*  481 */         return (new File(Util.getUserHome(), "Applications")).getAbsolutePath();
/*      */       }
/*  483 */       return "/Applications";
/*      */     } 
/*      */     
/*  486 */     if (userSpecific) {
/*  487 */       return Util.getUserHome();
/*      */     }
/*  489 */     File optDir = new File("/opt");
/*  490 */     String[] content = optDir.list();
/*      */     
/*  492 */     if (optDir.exists() && content != null && content.length > 0) {
/*  493 */       rootDirName = "/opt";
/*      */     } else {
/*  495 */       rootDirName = "/usr/local";
/*      */     } 
/*  497 */     File rootDir = new File(rootDirName);
/*  498 */     if (rootDir.exists()) {
/*  499 */       return rootDirName;
/*      */     }
/*  501 */     return Util.getUserHome();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static File getInstallerFile(String fileName) {
/*  508 */     String id = InstallerConfig.getCurrentApplicationId();
/*  509 */     if (id == null || id.equals("installer")) {
/*  510 */       File file1 = getAbsoluteFile(new File(fileName));
/*  511 */       if (file1.exists()) {
/*  512 */         return file1;
/*      */       }
/*      */     } 
/*  515 */     File file = new File(ResourceHelper.getRuntimeDir(), fileName);
/*  516 */     if (file.exists() || !Util.isMacOS()) {
/*  517 */       return file;
/*      */     }
/*  519 */     return getAbsoluteFile(new File(fileName));
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean isUnattendedAlerts(CommandLineOptions commandLineOptions, ExecutionMode executionMode) {
/*  524 */     if (executionMode == ExecutionMode.UNATTENDED_WITH_PROGRESS || (executionMode == ExecutionMode.UNATTENDED && commandLineOptions.splash != null)) {
/*  525 */       return (commandLineOptions.unattendedAlerts || InstallerConfig.getCurrentApplication().isUnattendedAlerts());
/*      */     }
/*  527 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public static ExecutionMode getExecutionMode(CommandLineOptions commandLineOptions, boolean alwaysAllowUnattended) {
/*  532 */     checkHeadlessJre();
/*      */     
/*  534 */     Application application = InstallerConfig.getCurrentApplication();
/*  535 */     ExecutionMode executionMode = application.getExecutionMode();
/*  536 */     String vmExecutionMode = System.getProperty("install4j.executionMode");
/*  537 */     if (Objects.equals("gui", vmExecutionMode)) {
/*  538 */       executionMode = ExecutionMode.GUI;
/*  539 */     } else if (Objects.equals("console", vmExecutionMode)) {
/*  540 */       executionMode = ExecutionMode.CONSOLE;
/*  541 */     } else if (Objects.equals("unattended", vmExecutionMode)) {
/*  542 */       executionMode = ExecutionMode.UNATTENDED;
/*      */     } 
/*      */     
/*  545 */     if (commandLineOptions.quiet && (application.isAllowUnattended() || alwaysAllowUnattended)) {
/*  546 */       executionMode = ExecutionMode.UNATTENDED;
/*  547 */     } else if (commandLineOptions.console && isAllowConsole(application)) {
/*  548 */       executionMode = ExecutionMode.CONSOLE;
/*  549 */     } else if (commandLineOptions.gui) {
/*  550 */       executionMode = ExecutionMode.GUI;
/*      */     } 
/*      */     
/*  553 */     if (executionMode == ExecutionMode.GUI && Util.isUnixInstaller() && isAllowConsole(application) && application.isUnixFallbackToConsole() && isHeadless()) {
/*  554 */       executionMode = ExecutionMode.CONSOLE;
/*      */     }
/*      */     
/*  557 */     return executionMode;
/*      */   }
/*      */   
/*      */   private static void checkHeadlessJre() {
/*  561 */     if (!isInProcess() && Util.isLinux()) {
/*      */       boolean forceHeadless;
/*  563 */       if (JavaVersionUtil.isJava9Plus()) {
/*  564 */         forceHeadless = !(new File(System.getProperty("java.home"), "lib/libsplashscreen.so")).isFile();
/*      */       } else {
/*  566 */         boolean archDirFound = false;
/*  567 */         boolean splashScreenFound = false;
/*  568 */         for (String arch : Arrays.<String>asList(new String[] { "amd64", "i386", "aarch64", "aarch32", "ppc64le", "ppc64", "ppc", "sparc", "sparcv9" })) {
/*  569 */           File archDir = new File(System.getProperty("java.home"), "lib/" + arch);
/*  570 */           if (archDir.isDirectory()) {
/*  571 */             archDirFound = true;
/*  572 */             if (!splashScreenFound) {
/*  573 */               splashScreenFound = (new File(archDir, "libsplashscreen.so")).isFile();
/*      */             }
/*      */           } 
/*      */         } 
/*  577 */         forceHeadless = (archDirFound && !splashScreenFound);
/*      */       } 
/*  579 */       if (forceHeadless) {
/*  580 */         System.setProperty("java.awt.headless", "true");
/*  581 */         System.setProperty("javax.accessibility.assistive_technologies", VersionSpecificHelper.getAccessibilityProviderName());
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public static boolean isHeadless() {
/*  587 */     if (headless == null) {
/*  588 */       headless = Boolean.valueOf(initHeadless());
/*      */     }
/*  590 */     return headless.booleanValue();
/*      */   }
/*      */   
/*      */   private static boolean initHeadless() {
/*  594 */     if (GraphicsEnvironment.isHeadless()) {
/*  595 */       return true;
/*      */     }
/*      */     try {
/*  598 */       new Frame();
/*  599 */     } catch (Throwable e) {
/*  600 */       return true;
/*      */     } 
/*  602 */     return false;
/*      */   }
/*      */   
/*      */   public static void setHeadlessProperty() {
/*  606 */     System.setProperty("java.awt.headless", "true");
/*      */   }
/*      */   
/*      */   public static String getSupportedSystemLanguageId() {
/*  610 */     Logger logger = Logger.getInstance();
/*      */     
/*  612 */     Locale locale = Locale.getDefault();
/*  613 */     String systemLanguageId = locale.getLanguage();
/*  614 */     logger.info(null, "System language '" + systemLanguageId + "'");
/*      */     
/*  616 */     if (InstallerConfig.getCurrentInstance().getLanguageById(systemLanguageId) != null) {
/*  617 */       return systemLanguageId;
/*      */     }
/*  619 */     systemLanguageId = systemLanguageId + "_" + locale.getCountry();
/*  620 */     logger.info(null, "System locale '" + systemLanguageId + "'");
/*  621 */     if (InstallerConfig.getCurrentInstance().getLanguageById(systemLanguageId) != null) {
/*  622 */       return systemLanguageId;
/*      */     }
/*  624 */     logger.info(null, "System locale not found in available languages");
/*  625 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static String insertBeanNames(String errorMessage, Map<String, ScriptClassOrigin> classNameToScriptClassOrigin) {
/*  631 */     String[] lines = errorMessage.split("\n");
/*  632 */     StringBuffer buffer = new StringBuffer();
/*  633 */     for (String line : lines) {
/*  634 */       addBeanNameToBuffer(line, classNameToScriptClassOrigin, buffer, null);
/*  635 */       buffer.append(replaceLineNumber(line, classNameToScriptClassOrigin));
/*  636 */       buffer.append('\n');
/*      */     } 
/*  638 */     return buffer.toString();
/*      */   }
/*      */   
/*      */   private static void addBeanNameToBuffer(String line, Map<String, ScriptClassOrigin> classNameToScriptClassOrigin, StringBuffer buffer, Set<String> handledScriptClassNames) {
/*  642 */     Matcher matcher = CLASS_NAME_PATTERN.matcher(line);
/*  643 */     matcher.reset(line);
/*  644 */     if (matcher.find()) {
/*  645 */       String className = matcher.group(1);
/*  646 */       ScriptClassOrigin scriptClassOrigin = getScriptClassOrigin(className, classNameToScriptClassOrigin);
/*  647 */       if (scriptClassOrigin != null && (handledScriptClassNames == null || !handledScriptClassNames.contains(className))) {
/*  648 */         buffer.append("In ");
/*  649 */         buffer.append(scriptClassOrigin.getBeanType());
/*  650 */         String beanName = scriptClassOrigin.getBeanName();
/*  651 */         if (beanName.length() > 0) {
/*  652 */           buffer.append(" \"");
/*  653 */           buffer.append(beanName);
/*  654 */           buffer.append('"');
/*      */         } 
/*  656 */         String parentScreen = scriptClassOrigin.getParentScreen();
/*  657 */         if (parentScreen.length() > 0) {
/*  658 */           buffer.append(" (screen \"");
/*  659 */           buffer.append(parentScreen);
/*  660 */           buffer.append("\")");
/*      */         } 
/*  662 */         String propertyName = scriptClassOrigin.getPropertyName();
/*  663 */         if (propertyName.length() > 0) {
/*  664 */           buffer.append(", property \"");
/*  665 */           buffer.append(propertyName);
/*  666 */           buffer.append('"');
/*      */         } 
/*  668 */         buffer.append(":\n");
/*      */         
/*  670 */         if (handledScriptClassNames != null) {
/*  671 */           handledScriptClassNames.add(className);
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private static ScriptClassOrigin getScriptClassOrigin(String simpleClassName, Map<String, ScriptClassOrigin> classNameToScriptClassOrigin) {
/*  678 */     String className = ((simpleClassName.equals("Completion") || simpleClassName.equals("CompletionStatic")) ? "code." : "com.install4j.script.") + simpleClassName;
/*  679 */     return classNameToScriptClassOrigin.get(className);
/*      */   }
/*      */   
/*      */   public static String prependBeanOrigin(String errorMessage, Map<String, ScriptClassOrigin> classNameToScriptClassOrigin) {
/*  683 */     String[] lines = errorMessage.split("\n");
/*  684 */     StringBuffer buffer = new StringBuffer();
/*  685 */     Set<String> handledScriptClassNames = new HashSet<>();
/*  686 */     for (String line : lines) {
/*  687 */       addBeanNameToBuffer(line, classNameToScriptClassOrigin, buffer, handledScriptClassNames);
/*      */     }
/*  689 */     for (String line : lines) {
/*  690 */       buffer.append(replaceLineNumber(line, classNameToScriptClassOrigin)).append('\n');
/*      */     }
/*      */     
/*  693 */     return buffer.toString();
/*      */   }
/*      */   
/*      */   private static String replaceLineNumber(String line, Map<String, ScriptClassOrigin> classNameToScriptClassOrigin) {
/*  697 */     Matcher matcher = LINE_NUMBER_PATTERN.matcher(line);
/*  698 */     if (matcher.find()) {
/*  699 */       ScriptClassOrigin scriptClassOrigin = getScriptClassOrigin(matcher.group(1), classNameToScriptClassOrigin);
/*  700 */       int lineNumberGroupIndex = (matcher.group(2) != null) ? 2 : 3;
/*  701 */       String lineNumberString = matcher.group(lineNumberGroupIndex);
/*  702 */       int lineNumber = Integer.parseInt(lineNumberString);
/*  703 */       if (scriptClassOrigin != null) {
/*  704 */         int scriptStartLine = scriptClassOrigin.getPackageLineCount() + scriptClassOrigin.getImportLineCount() + scriptClassOrigin.getHeaderLineCount();
/*  705 */         if (lineNumber >= scriptStartLine && lineNumber <= scriptStartLine + scriptClassOrigin.getScriptLineCount()) {
/*  706 */           int scriptLineNumber = lineNumber - scriptClassOrigin.getHeaderLineCount();
/*  707 */           return replaceLineNumber(line, matcher, lineNumberGroupIndex, scriptLineNumber, "");
/*  708 */         }  if (lineNumber > scriptClassOrigin.getPackageLineCount() && lineNumber <= scriptClassOrigin.getPackageLineCount() + scriptClassOrigin.getImportLineCount()) {
/*  709 */           int scriptLineNumber = lineNumber - scriptClassOrigin.getPackageLineCount();
/*  710 */           return replaceLineNumber(line, matcher, lineNumberGroupIndex, scriptLineNumber, "");
/*      */         } 
/*  712 */         return replaceLineNumber(line, matcher, lineNumberGroupIndex, lineNumber, "*");
/*      */       } 
/*      */     } 
/*      */     
/*  716 */     return line;
/*      */   }
/*      */   
/*      */   private static String replaceLineNumber(String line, Matcher matcher, int lineNumberGroupIndex, int scriptLineNumber, String prefix) {
/*  720 */     return line.substring(0, matcher.start(lineNumberGroupIndex)) + prefix + scriptLineNumber + line.substring(matcher.end(lineNumberGroupIndex));
/*      */   }
/*      */ 
/*      */   
/*      */   public static void disablePreferencesLogging() {}
/*      */ 
/*      */   
/*      */   private static synchronized void disablePreferencesLoggingImpl() {
/*  728 */     if (!Boolean.getBoolean("install4j.noLoggingFix")) {
/*      */       try {
/*  730 */         if (prefsLogger == null) {
/*      */           try {
/*  732 */             Logger logger = Logger.getLogger("java.util.prefs");
/*  733 */             logger.setUseParentHandlers(false);
/*  734 */             prefsLogger = logger;
/*  735 */           } catch (Throwable throwable) {}
/*      */         }
/*      */       }
/*  738 */       catch (Throwable throwable) {}
/*      */ 
/*      */       
/*      */       try {
/*  742 */         PlatformLoggingMXBean logging = ManagementFactory.<PlatformLoggingMXBean>getPlatformMXBean(PlatformLoggingMXBean.class);
/*  743 */         logging.setLoggerLevel("java.util.prefs", "OFF");
/*  744 */       } catch (Throwable throwable) {}
/*      */ 
/*      */       
/*  747 */       PrintStream out = System.out;
/*  748 */       PrintStream err = System.err;
/*  749 */       System.setOut(new PrintStream((OutputStream)new NullOutputStream()));
/*  750 */       System.setErr(new PrintStream((OutputStream)new NullOutputStream()));
/*      */ 
/*      */       
/*      */       try {
/*      */         try {
/*  755 */           Preferences.userRoot().flush();
/*  756 */         } catch (Throwable throwable) {}
/*      */       }
/*      */       finally {
/*      */         
/*  760 */         System.setOut(out);
/*  761 */         System.setErr(err);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public static void disableNonSevereLogging() {
/*      */     try {
/*  768 */       Logger log = LogManager.getLogManager().getLogger("");
/*  769 */       for (Handler h : log.getHandlers()) {
/*  770 */         if (h instanceof java.util.logging.ConsoleHandler) {
/*  771 */           h.setLevel(Level.SEVERE);
/*      */         }
/*      */       } 
/*  774 */     } catch (Throwable throwable) {}
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean is64BitWindows() {
/*  779 */     return (is64BitWindowsArch(System.getenv("PROCESSOR_ARCHITECTURE")) || is64BitWindowsArch(System.getenv("PROCESSOR_ARCHITEW6432")));
/*      */   }
/*      */   
/*      */   private static boolean is64BitWindowsArch(String arch) {
/*  783 */     return (arch != null && (arch.equalsIgnoreCase("AMD64") || arch.equalsIgnoreCase("IA64") || arch.equalsIgnoreCase("ARM64")));
/*      */   }
/*      */   
/*      */   public static String[] getExtraCommandLineParameters() {
/*  787 */     return state.extraCommandLineParameters;
/*      */   }
/*      */   
/*      */   public static String getSplash(CommandLineOptions commandLineOptions, ExecutionMode executionMode) {
/*  791 */     String splash = commandLineOptions.splash;
/*  792 */     if (executionMode == ExecutionMode.UNATTENDED_WITH_PROGRESS && splash == null) {
/*  793 */       splash = InstallerConfig.getCurrentApplication().getSplashMessage();
/*      */     }
/*  795 */     return splash;
/*      */   }
/*      */   
/*      */   public static class CommandLineOptions
/*      */   {
/*      */     public static final String PROPERTY_QUIET_OVERWRITE = "install4j.quietOverwrite";
/*      */     public static final String PROPERTY_NO_FILE_FAILURES = "install4j.noFileFailures";
/*      */     public boolean help = false;
/*      */     public boolean quiet = false;
/*      */     public boolean console = false;
/*      */     public boolean gui = false;
/*  806 */     public File installDir = null;
/*  807 */     public String manualTempDir = null;
/*  808 */     public boolean quietOverwrite = Boolean.getBoolean("install4j.quietOverwrite");
/*  809 */     public boolean noFileFailures = Boolean.getBoolean("install4j.noFileFailures");
/*  810 */     public int wait = 0;
/*  811 */     public String splash = null;
/*      */     
/*      */     public boolean unattendedAlerts = false;
/*  814 */     public Map<String, String> commandLineVars = new HashMap<>();
/*      */     public String varFileName;
/*      */   }
/*      */   
/*      */   public static boolean isAllowConsole(Application application) {
/*  819 */     HelperCommunication.helperUnsupported();
/*  820 */     return (application.isAllowConsole() && (!isWindows() || !application.isDisableConsoleOnWindows()));
/*      */   }
/*      */   
/*      */   public static CommandLineOptions parseCommandLine(String[] args) {
/*  824 */     HelperCommunication.helperUnsupported();
/*  825 */     state.commandLineParameters = args;
/*      */     
/*  827 */     if (!HelperCommunication.getInstance().isElevatedHelper()) {
/*      */       try {
/*  829 */         String envCommandLine = System.getenv().get("INSTALL4J_ARGUMENTS");
/*  830 */         if (envCommandLine != null) {
/*  831 */           List<String> argList = new ArrayList<>();
/*  832 */           StringUtil.splitupQuotedList(argList, envCommandLine, " ");
/*  833 */           args = argList.<String>toArray(new String[0]);
/*      */         } 
/*  835 */       } catch (Throwable throwable) {}
/*      */     }
/*      */ 
/*      */     
/*  839 */     CommandLineOptions commandLineOptions = new CommandLineOptions();
/*  840 */     List<String> extraCommandLineOptions = new ArrayList<>();
/*      */     
/*  842 */     for (int i = 0; i < args.length; i++) {
/*  843 */       String arg = args[i];
/*  844 */       if (Objects.equals(arg, "-q") && !commandLineOptions.console && !commandLineOptions.gui) {
/*  845 */         commandLineOptions.quiet = true;
/*  846 */       } else if (Objects.equals(arg, "-c") && !commandLineOptions.quiet && !commandLineOptions.gui) {
/*  847 */         commandLineOptions.console = true;
/*  848 */       } else if (Objects.equals(arg, "-g") && !commandLineOptions.console && !commandLineOptions.quiet) {
/*  849 */         commandLineOptions.gui = true;
/*  850 */       } else if (Objects.equals(arg, "-overwrite")) {
/*  851 */         commandLineOptions.quietOverwrite = true;
/*  852 */       } else if (Objects.equals(arg, "-nofilefailures")) {
/*  853 */         commandLineOptions.noFileFailures = true;
/*  854 */       } else if (Objects.equals(arg, "-h") || Objects.equals(arg, "-help") || Objects.equals(arg, "/?")) {
/*  855 */         commandLineOptions.help = true;
/*  856 */       } else if (Objects.equals(arg, "-dir") && i + 1 < args.length) {
/*  857 */         commandLineOptions.installDir = new File(args[++i].trim());
/*  858 */       } else if ((arg.equals("-temp") || arg.equals("/temp")) && i + 1 < args.length) {
/*  859 */         commandLineOptions.manualTempDir = args[++i].trim();
/*  860 */       } else if (Objects.equals(arg, "-wait") && i + 1 < args.length) {
/*  861 */         commandLineOptions.wait = Integer.parseInt(args[++i]);
/*  862 */       } else if (Objects.equals(arg, "-varfile") && i + 1 < args.length) {
/*  863 */         commandLineOptions.varFileName = args[++i];
/*  864 */       } else if (Objects.equals(arg, "-splash") && i + 1 < args.length) {
/*  865 */         commandLineOptions.splash = args[++i];
/*  866 */       } else if (Objects.equals(arg, "-alerts")) {
/*  867 */         commandLineOptions.unattendedAlerts = true;
/*      */       } else {
/*  869 */         boolean systemProperty = arg.startsWith("-D");
/*  870 */         boolean var = arg.startsWith("-V");
/*  871 */         if (systemProperty || var) {
/*  872 */           int equalPos = arg.indexOf('=');
/*  873 */           if (equalPos > -1 && arg.length() > equalPos + 1) {
/*  874 */             String key = arg.substring(2, equalPos);
/*  875 */             String value = arg.substring(equalPos + 1);
/*  876 */             if (systemProperty) {
/*  877 */               System.setProperty(key, value);
/*      */             } else {
/*  879 */               commandLineOptions.commandLineVars.put(key, value);
/*      */             } 
/*      */           } 
/*      */         } else {
/*  883 */           extraCommandLineOptions.add(arg);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  889 */     state.extraCommandLineParameters = extraCommandLineOptions.<String>toArray(new String[0]);
/*      */     
/*  891 */     if (commandLineOptions.help) {
/*  892 */       if (isHeadless()) {
/*  893 */         setHeadlessProperty();
/*      */       }
/*  895 */       registerStarted(false);
/*  896 */       List<String[]> options = (List)new ArrayList<>();
/*  897 */       Application application = InstallerConfig.getCurrentApplication();
/*  898 */       Messages.setLanguageConfig(InstallerConfig.getCurrentInstance().getLanguages().get(0));
/*  899 */       options.add(new String[] { "-varfile [file]", Messages.getString(".HelpResponseFile") });
/*  900 */       if (isAllowConsole(application)) {
/*  901 */         options.add(new String[] { "-c", Messages.getString(".HelpConsoleMode") });
/*      */       }
/*  903 */       if (application.isAllowUnattended()) {
/*  904 */         options.add(new String[] { "-q", Messages.getString(".HelpUnattendedMode") });
/*  905 */         if (application instanceof com.install4j.runtime.beans.applications.InstallerApplication) {
/*  906 */           options.add(new String[] { "-dir [directory]", Messages.getString(".HelpUnattendedDir") });
/*  907 */           options.add(new String[] { "-overwrite", Messages.getString(".HelpUnattendedOverwrite") });
/*  908 */           options.add(new String[] { "-nofilefailures", Messages.getString(".HelpNoFileFailures") });
/*      */         } 
/*  910 */         options.add(new String[] { "-splash [title]", Messages.getString(".HelpUnattendedSplash") });
/*  911 */         options.add(new String[] { "-alerts", Messages.getString(".HelpUnattendedAlerts") });
/*  912 */         if (isWindows()) {
/*  913 */           options.add(new String[] { "-console", Messages.getString(".HelpUnattendedConsole") });
/*      */         }
/*      */       } 
/*  916 */       if (isWindows()) {
/*  917 */         options.add(new String[] { "-manual", Messages.getString(".HelpManual") });
/*      */       }
/*      */       
/*  920 */       if (application.getExecutionMode() != ExecutionMode.GUI) {
/*  921 */         options.add(new String[] { "-g", Messages.getString(".HelpGuiMode") });
/*      */       }
/*  923 */       options.add(new String[] { "-Dname=value", Messages.getString(".HelpSystemProperties") });
/*  924 */       options.add(new String[] { "-h", Messages.getString(".HelpHelp") });
/*      */       
/*      */       try {
/*  927 */         ScriptProperty helpCustomizer = application.getHelpCustomizer();
/*  928 */         if (helpCustomizer != null && !Objects.equals(helpCustomizer.getValue(), "")) {
/*  929 */           ((Script)Class.forName(helpCustomizer.getValue(), true, Install4jClassLoader.getInstance()).newInstance()).evaluate(null, (Bean)application, new Object[] { options });
/*      */         }
/*  931 */       } catch (Exception e) {
/*  932 */         Logger.getInstance().log(e);
/*      */       } 
/*      */       
/*  935 */       showHelp(Messages.getString(".HelpHeaderLabel"), options, commandLineOptions.console);
/*  936 */       exit(1);
/*      */     } 
/*      */     
/*  939 */     return commandLineOptions;
/*      */   }
/*      */   
/*      */   private static void showHelp(String header, List<String[]> options, boolean console) {
/*  943 */     if (console) {
/*  944 */       showConsoleHelp(header, options);
/*      */     } else {
/*      */       try {
/*  947 */         showGuiHelp(header, options);
/*  948 */       } catch (Throwable e) {
/*  949 */         showConsoleHelp(header, options);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private static void showGuiHelp(String header, List<String[]> options) {
/*  955 */     StringBuilder buffer = new StringBuilder("<html>");
/*  956 */     buffer.append(header);
/*  957 */     buffer.append("<br><br><table border=0 cellspacing=0>");
/*  958 */     for (String[] option : options) {
/*  959 */       buffer.append("<tr><td><b>");
/*  960 */       buffer.append(option[0]);
/*  961 */       buffer.append("</b></td><td>&nbsp;</td><td>");
/*  962 */       buffer.append(option[1]);
/*  963 */       buffer.append("</tr>");
/*      */     } 
/*  965 */     buffer.append("</table>");
/*      */     
/*  967 */     AlertOptionPane.showMessageDialog(null, buffer.toString(), Messages.getString(".HelpWindowTitle"), 1);
/*      */   }
/*      */   
/*      */   private static void showConsoleHelp(String header, List<String[]> options) {
/*  971 */     ConsoleImpl console = ConsoleImpl.getInstance();
/*  972 */     console.println(header);
/*  973 */     console.println();
/*  974 */     int maxLength = 0;
/*  975 */     for (String[] option : options) {
/*  976 */       maxLength = Math.max(option[0].length(), maxLength);
/*      */     }
/*  978 */     for (String[] option : options) {
/*  979 */       console.print(option[0]);
/*  980 */       console.print(StringUtil.repeat(" ", maxLength + 1 - option[0].length()));
/*  981 */       console.println(option[1]);
/*      */     } 
/*      */   }
/*      */   
/*      */   private static List<InstallerConfig> getAddOnApplicationConfigsFromRuntimeDir(File runtimeDir) {
/*  986 */     List<InstallerConfig> ret = new ArrayList<>();
/*      */     
/*  988 */     File[] files = runtimeDir.listFiles();
/*  989 */     if (files != null) {
/*  990 */       for (File file : files) {
/*  991 */         if (file.getName().startsWith("i4jparams.conf.")) {
/*      */           try {
/*  993 */             ret.add(InstallerConfig.getGeneralConfigFromFile(file));
/*  994 */           } catch (IOException e) {
/*  995 */             e.printStackTrace();
/*      */           } 
/*      */         }
/*      */       } 
/*      */     }
/*      */     
/* 1001 */     return ret;
/*      */   }
/*      */   
/*      */   public static List<InstallerConfig> getAddOnApplicationConfigs(File installationDirectory) {
/* 1005 */     if (installationDirectory.exists()) {
/* 1006 */       File oldConfigFile = new File(installationDirectory, ".install4j/i4jparams.conf");
/* 1007 */       if (oldConfigFile.exists()) {
/*      */         try {
/* 1009 */           return getAddOnApplicationConfigsFromRuntimeDir(oldConfigFile.getParentFile());
/* 1010 */         } catch (Exception exception) {}
/*      */       
/*      */       }
/* 1013 */       else if (Util.isMacOS()) {
/* 1014 */         oldConfigFile = new File(installationDirectory, "Contents/Resources/app/.install4j/i4jparams.conf");
/* 1015 */         if (oldConfigFile.exists()) {
/*      */           try {
/* 1017 */             return getAddOnApplicationConfigsFromRuntimeDir(oldConfigFile.getParentFile());
/* 1018 */           } catch (Exception exception) {}
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1024 */     return null;
/*      */   }
/*      */   
/*      */   public static InstallerConfig getOldApplicationConfig(File installationDirectory) {
/* 1028 */     if (installationDirectory.exists()) {
/* 1029 */       File oldConfigFile = new File(installationDirectory, ".install4j/i4jparams.conf");
/* 1030 */       if (oldConfigFile.exists()) {
/*      */         try {
/* 1032 */           return InstallerConfig.getGeneralConfigFromFile(oldConfigFile);
/* 1033 */         } catch (Throwable throwable) {}
/*      */       
/*      */       }
/* 1036 */       else if (Util.isMacosInstaller()) {
/* 1037 */         oldConfigFile = new File(installationDirectory, "Contents/Resources/app/.install4j/i4jparams.conf");
/* 1038 */         if (oldConfigFile.exists()) {
/*      */           try {
/* 1040 */             return InstallerConfig.getGeneralConfigFromFile(oldConfigFile);
/* 1041 */           } catch (Throwable throwable) {}
/*      */         
/*      */         }
/* 1044 */         else if (InstallerConfig.getCurrentInstance() != null) {
/* 1045 */           String singleBundleName = InstallerConfig.getCurrentInstance().getMacSpecificConfig().getSingleBundleName();
/* 1046 */           if (singleBundleName != null && singleBundleName.trim().length() > 0) {
/* 1047 */             oldConfigFile = new File(new File(installationDirectory, singleBundleName), "Contents/Resources/app/.install4j/i4jparams.conf");
/* 1048 */             if (oldConfigFile.exists()) {
/*      */               try {
/* 1050 */                 return InstallerConfig.getGeneralConfigFromFile(oldConfigFile);
/* 1051 */               } catch (Throwable throwable) {}
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1059 */     return null;
/*      */   }
/*      */   
/*      */   public static String getOldApplicationId(File installationDirectory) {
/* 1063 */     InstallerConfig oldInstallerConfig = getOldApplicationConfig(installationDirectory);
/* 1064 */     if (oldInstallerConfig != null) {
/* 1065 */       if (oldInstallerConfig.getApplicationId().contains("${")) {
/* 1066 */         return null;
/*      */       }
/* 1068 */       return oldInstallerConfig.getApplicationId();
/*      */     } 
/* 1070 */     return null;
/*      */   }
/*      */   
/*      */   public static boolean checkWritableInstallationDirectory(final File destDir, boolean showMessage) {
/* 1074 */     ExecutionContext executionContext = ContentInstaller.getExecutionContext();
/* 1075 */     Logger.getInstance().log(null, "checking writable with " + executionContext, true);
/* 1076 */     boolean writable = HelperCommunication.getInstance().fetchBoolean(executionContext, new FetchBooleanAction()
/*      */         {
/*      */           protected boolean fetchValue(Context context) throws UserCanceledException {
/* 1079 */             File usedDir = destDir;
/* 1080 */             if (InstallerUtil.isOnNonExistingDrive(usedDir) && context.hasBeenElevated()) {
/* 1081 */               File uncFile = (File)HelperCommunication.getInstance().fetchObject(ExecutionContext.UNELEVATED, new FetchObjectAction<File>()
/*      */                   {
/*      */                     protected File fetchValue(Context context) throws Exception {
/* 1084 */                       String universalPathName = FolderInfo.getUniversalPathName(destDir.getAbsolutePath());
/* 1085 */                       if (!Objects.equals(universalPathName, destDir.getAbsolutePath())) {
/* 1086 */                         File uncFile = new File(universalPathName);
/* 1087 */                         InstallerConfig.getCurrentInstance().addUncMapping(destDir, uncFile);
/* 1088 */                         Logger.getInstance().log(null, "using unc path " + universalPathName, true);
/* 1089 */                         if (context instanceof InstallerContext) {
/* 1090 */                           ((InstallerContext)context).setInstallationDirectory(context.getInstallationDirectory());
/*      */                         }
/* 1092 */                         return uncFile;
/*      */                       } 
/*      */ 
/*      */                       
/* 1096 */                       return null;
/*      */                     }
/*      */                   });
/* 1099 */               if (uncFile != null) {
/* 1100 */                 usedDir = uncFile;
/*      */               }
/*      */             } 
/* 1103 */             return InstallerUtil.checkWritable(usedDir);
/*      */           }
/*      */         });
/*      */     
/* 1107 */     if (!writable && showMessage) {
/* 1108 */       Util.showMessage(
/* 1109 */           Messages.format(Messages.getString(".NoWritePermissions2"), new Object[] { destDir }), 2);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1114 */     return writable;
/*      */   }
/*      */   
/*      */   public static boolean isOnNonExistingDrive(File destDir) {
/* 1118 */     if (destDir != null && Util.isWindows()) {
/* 1119 */       while (destDir.getParent() != null) {
/* 1120 */         destDir = destDir.getParentFile();
/*      */       }
/* 1122 */       if (destDir.getAbsolutePath().length() >= 2 && destDir.getAbsolutePath().charAt(1) == ':') {
/* 1123 */         return !destDir.isDirectory();
/*      */       }
/*      */     } 
/* 1126 */     return false;
/*      */   }
/*      */   
/*      */   public static boolean checkWritable(File destDir) {
/* 1130 */     List<File> dirList = new ArrayList<>();
/* 1131 */     for (File curDir = destDir; curDir != null; ) {
/* 1132 */       dirList.add(curDir);
/* 1133 */       curDir = curDir.getParentFile();
/*      */     } 
/*      */     
/* 1136 */     List<File> createdDirs = new ArrayList<>();
/* 1137 */     for (int i = dirList.size() - 1; i >= 0; i--) {
/* 1138 */       File file = dirList.get(i);
/* 1139 */       if (file.mkdir()) {
/* 1140 */         createdDirs.add(file);
/*      */       }
/*      */     } 
/*      */     
/* 1144 */     File testDir = new File(destDir, "i4j_writeperm_test");
/* 1145 */     testDir.delete();
/* 1146 */     boolean writable = testDir.mkdir();
/* 1147 */     testDir.delete();
/*      */     
/* 1149 */     for (int j = createdDirs.size() - 1; j >= 0; j--) {
/* 1150 */       File file = createdDirs.get(j);
/* 1151 */       file.delete();
/*      */     } 
/*      */     
/* 1154 */     return writable;
/*      */   }
/*      */ 
/*      */   
/*      */   public static String loadFile(File file, String languageId) {
/* 1159 */     if (file == null || !file.exists()) {
/* 1160 */       return null;
/*      */     }
/*      */     try {
/* 1163 */       if (file.getName().toLowerCase(Locale.ENGLISH).endsWith(".zip"))
/* 1164 */       { ZipFile zipFile = new ZipFile(file); 
/* 1165 */         try { Enumeration<? extends ZipEntry> entries = zipFile.entries();
/* 1166 */           while (entries.hasMoreElements())
/* 1167 */           { ZipEntry zipEntry = entries.nextElement();
/* 1168 */             if (zipEntry.getName().startsWith(languageId + "."))
/* 1169 */             { String str = readString(zipFile.getInputStream(zipEntry), getDefaultEncoding(zipEntry.getName()));
/*      */ 
/*      */               
/* 1172 */               zipFile.close(); return str; }  }  zipFile.close(); } catch (Throwable throwable) { try { zipFile.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }
/*      */          }
/* 1174 */       else { return readString(new FileInputStream(file), getDefaultEncoding(file.getName())); }
/*      */     
/* 1176 */     } catch (IOException iOException) {}
/*      */ 
/*      */     
/* 1179 */     return null;
/*      */   }
/*      */   
/*      */   public static String readTextFile(File file, String encoding) throws IOException {
/* 1183 */     Reader reader = null;
/* 1184 */     StringWriter writer = new StringWriter();
/*      */     try {
/* 1186 */       if (encoding.trim().length() > 0) {
/* 1187 */         reader = new InputStreamReader(new FileInputStream(file), encoding);
/*      */       } else {
/* 1189 */         reader = new FileReader(file);
/*      */       } 
/* 1191 */       char[] buffer = new char[8192]; int i;
/* 1192 */       while ((i = reader.read(buffer)) != -1) {
/* 1193 */         writer.write(buffer, 0, i);
/*      */       }
/*      */     } finally {
/* 1196 */       if (reader != null) {
/*      */         try {
/* 1198 */           reader.close();
/* 1199 */         } catch (IOException e) {
/* 1200 */           Logger.getInstance().log(e);
/*      */         } 
/*      */       }
/*      */     } 
/* 1204 */     return writer.toString();
/*      */   }
/*      */   public static void writeTextFile(String text, File file, String encoding, boolean append) throws IOException {
/*      */     Writer writer;
/* 1208 */     OutputStream fileOut = new FileOutputStream(file.getAbsolutePath(), append);
/*      */     
/* 1210 */     if (encoding != null && encoding.trim().length() > 0) {
/*      */       try {
/* 1212 */         writer = new BufferedWriter(new OutputStreamWriter(fileOut, encoding));
/* 1213 */       } catch (UnsupportedEncodingException e) {
/* 1214 */         Logger.getInstance().log(e);
/* 1215 */         writer = new BufferedWriter(new OutputStreamWriter(fileOut));
/*      */       } 
/*      */     } else {
/* 1218 */       writer = new BufferedWriter(new OutputStreamWriter(fileOut));
/*      */     } 
/* 1220 */     BufferedWriter out = new BufferedWriter(writer);
/*      */     
/* 1222 */     BufferedReader in = new BufferedReader(new StringReader(text));
/* 1223 */     boolean first = true; String line;
/* 1224 */     while ((line = in.readLine()) != null) {
/* 1225 */       if (!first) {
/* 1226 */         out.newLine();
/*      */       } else {
/* 1228 */         first = false;
/*      */       } 
/* 1230 */       out.write(line);
/*      */     } 
/* 1232 */     if (text.endsWith("\n")) {
/* 1233 */       out.newLine();
/*      */     }
/* 1235 */     out.close();
/*      */   }
/*      */   
/*      */   private static String getDefaultEncoding(String fileName) {
/* 1239 */     return fileName.toLowerCase(Locale.ENGLISH).endsWith(".properties") ? "ISO-8859-1" : "UTF-8";
/*      */   }
/*      */   
/*      */   private static String readString(InputStream in, String defaultEncoding) throws IOException {
/*      */     try {
/* 1244 */       byte[] buffer = new byte[8192];
/*      */       
/* 1246 */       ByteArrayOutputStream out = new ByteArrayOutputStream(); int size;
/* 1247 */       while ((size = in.read(buffer)) != -1) {
/* 1248 */         out.write(buffer, 0, size);
/*      */       }
/* 1250 */       byte[] stringBytes = out.toByteArray();
/* 1251 */       String string = new String(stringBytes, defaultEncoding);
/* 1252 */       if (string.indexOf('<') >= 0) {
/*      */ 
/*      */         
/* 1255 */         Matcher matcher = HTML_CONTENT_TYPE_PATTERN.matcher(string);
/* 1256 */         if (matcher.find()) {
/* 1257 */           String charset = matcher.group(3);
/*      */           
/*      */           try {
/* 1260 */             if (!charset.equalsIgnoreCase("UTF-8") && Charset.isSupported(charset)) {
/* 1261 */               string = new String(stringBytes, charset);
/*      */             }
/* 1263 */           } catch (IllegalCharsetNameException e) {
/* 1264 */             System.err.println("Encoding " + charset + " in HTML text is invalid.");
/* 1265 */           } catch (UnsupportedEncodingException e) {
/* 1266 */             System.err.println("Encoding " + charset + " in HTML text is not supported by the JRE.");
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1271 */       string = string.replaceAll("﻿", "");
/* 1272 */       return string;
/*      */     } finally {
/* 1274 */       in.close();
/*      */     } 
/*      */   }
/*      */   
/*      */   public static String sanitizeHTML(String text) {
/* 1279 */     String lowerCaseText = text.toLowerCase(Locale.ENGLISH);
/* 1280 */     boolean html = lowerCaseText.contains("<html");
/* 1281 */     if (html) {
/* 1282 */       int headStartPos = lowerCaseText.indexOf("<head>");
/* 1283 */       int headEndPos = lowerCaseText.indexOf("</head>");
/* 1284 */       if (headStartPos > -1 && headEndPos > headStartPos) {
/* 1285 */         StringBuilder buffer = new StringBuilder();
/* 1286 */         buffer.append(text, 0, headStartPos);
/* 1287 */         buffer.append(text, headStartPos + 6, headEndPos);
/* 1288 */         buffer.append(text.substring(headEndPos + 7));
/* 1289 */         text = buffer.toString();
/*      */       } 
/*      */     } 
/* 1292 */     return text;
/*      */   }
/*      */   
/*      */   public static String cleanupName(String name) {
/* 1296 */     if (name.endsWith("//") || name.endsWith("\\\\")) {
/* 1297 */       return name.substring(0, name.length() - 1);
/*      */     }
/* 1299 */     return name;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static void reportException(Throwable t) {
/* 1305 */     UpdateLog.logIfUpdater(1, t);
/* 1306 */     Logger.getInstance().log(t);
/*      */     
/* 1308 */     if (DEBUG) {
/* 1309 */       System.err.println(Util.getAnnotatedStackTrace(t));
/*      */     } else {
/* 1311 */       if (!Boolean.getBoolean("install4j.suppressFontErrorMessage") && handleFontRelatedException(t)) {
/*      */         return;
/*      */       }
/*      */       
/* 1315 */       File tempFile = null;
/*      */       try {
/* 1317 */         tempFile = File.createTempFile("install4jError", ".log");
/* 1318 */         PrintWriter pw = new PrintWriter(new FileOutputStream(tempFile));
/*      */         
/* 1320 */         pw.println("Exception:");
/* 1321 */         pw.println();
/*      */         
/* 1323 */         pw.print(Util.getAnnotatedStackTrace(t));
/*      */         
/* 1325 */         pw.println();
/* 1326 */         pw.println("System properties:");
/* 1327 */         pw.println();
/* 1328 */         for (Map.Entry<Object, Object> entry : System.getProperties().entrySet()) {
/* 1329 */           pw.print(entry.getKey());
/* 1330 */           pw.print("=");
/* 1331 */           pw.println(entry.getValue());
/*      */         } 
/*      */         
/* 1334 */         pw.flush();
/* 1335 */         pw.close();
/*      */         
/* 1337 */         tempFile = copyTempFile(tempFile);
/* 1338 */       } catch (IOException iOException) {}
/*      */ 
/*      */ 
/*      */       
/* 1342 */       if (tempFile != null) {
/*      */         try {
/* 1344 */           tempFile = tempFile.getCanonicalFile();
/* 1345 */         } catch (IOException iOException) {}
/*      */       }
/*      */ 
/*      */       
/* 1349 */       String message = "An error occurred:\n" + t + "\nError log: " + ((tempFile == null) ? "" : tempFile.getPath());
/* 1350 */       StringWriter sw = new StringWriter();
/* 1351 */       t.printStackTrace(new PrintWriter(sw, true));
/* 1352 */       String stackTrace = sw.toString();
/* 1353 */       if (state.unattended || state.console) {
/* 1354 */         ConsoleImpl.getInstance().println(message);
/* 1355 */         ConsoleImpl.getInstance().printStackTrace(t);
/* 1356 */       } else if (stackTrace.indexOf("X11") > 0 || (t instanceof NoClassDefFoundError && stackTrace.indexOf("java.awt.Container") > 0)) {
/* 1357 */         if (Boolean.getBoolean("install4j.printX11Exception")) {
/* 1358 */           t.printStackTrace();
/*      */         }
/* 1360 */         displayXMessage();
/*      */       } else {
/* 1362 */         File usedFile = tempFile;
/* 1363 */         GUIHelper.invokeOnEDT(() -> {
/*      */               try {
/*      */                 if (usedFile == null) {
/*      */                   JOptionPane.showMessageDialog(null, message, "install4j", 0);
/*      */                 } else {
/*      */                   int result = JOptionPane.showOptionDialog(null, message, "install4j", -1, 0, null, (Object[])new String[] { "OK", "Show Log File" }, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/*      */                   if (result == 1) {
/*      */                     GUIHelper.showURL(usedFile.toURI().toString());
/*      */                   }
/*      */                 } 
/* 1380 */               } catch (Throwable t2) {
/*      */                 if (Util.isWindowsInstaller() || Boolean.getBoolean("install4j.suppressX11Message")) {
/*      */                   System.err.println(message);
/*      */                   t.printStackTrace();
/*      */                 } else {
/*      */                   displayXMessage();
/*      */                 } 
/*      */               } 
/*      */             });
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private static boolean handleFontRelatedException(Throwable t) {
/* 1394 */     String message = t.getMessage();
/* 1395 */     if (message != null && message.contains("font")) {
/* 1396 */       System.err.println("Error: " + message);
/* 1397 */       System.err.println("The JRE is not fully functional on this system.");
/* 1398 */       return true;
/*      */     } 
/* 1400 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private static File copyTempFile(File tempFile) throws IOException {
/*      */     try {
/* 1406 */       String mediaDir = (String)InstallerVariables.getVariable("sys.mediaDir");
/* 1407 */       if (mediaDir != null) {
/* 1408 */         File mediaDirTempFile = new File(mediaDir, tempFile.getName());
/* 1409 */         FileUtil.copyFile(tempFile, mediaDirTempFile);
/* 1410 */         tempFile = mediaDirTempFile;
/*      */       } 
/* 1412 */     } catch (Exception exception) {}
/*      */     
/* 1414 */     return tempFile;
/*      */   }
/*      */   
/*      */   private static void displayXMessage() {
/* 1418 */     if (isConsole() || isUnattended()) {
/* 1419 */       if (isPossibleDisplayProblem()) {
/* 1420 */         System.err.println("The DISPLAY environment variable is set to an inaccessible X-server.");
/* 1421 */         System.err.println("Please execute \"export DISPLAY=\" and try again.");
/*      */       } else {
/* 1423 */         System.err.println("Headless mode does not work on your system with the used Java runtime");
/* 1424 */         System.err.println("environment.");
/*      */       } 
/*      */     } else {
/* 1427 */       System.err.println("Could not display the GUI. This application needs access to an X Server.");
/* 1428 */       if (isAllowConsole(InstallerConfig.getCurrentApplication())) {
/* 1429 */         System.err.println("*******************************************************************");
/* 1430 */         System.err.println("You can also run this application in console mode without");
/* 1431 */         System.err.println("access to an X server by passing the argument -c");
/* 1432 */         System.err.println("*******************************************************************");
/* 1433 */       } else if (InstallerConfig.getCurrentApplication().isAllowUnattended()) {
/* 1434 */         System.err.println("*******************************************************************");
/* 1435 */         System.err.println("You can also run this application in unattended mode without");
/* 1436 */         System.err.println("access to an X server by passing the argument -q");
/* 1437 */         System.err.println("*******************************************************************");
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private static boolean isPossibleDisplayProblem() {
/* 1443 */     if (Util.isWindows() || Util.isMacOS()) {
/* 1444 */       return false;
/*      */     }
/* 1446 */     String display = System.getenv("DISPLAY");
/* 1447 */     return (display != null && display.length() > 0);
/*      */   }
/*      */ 
/*      */   
/*      */   public static void registerStarted(boolean hideWindow) {
/* 1452 */     HelperCommunication.helperUnsupported();
/* 1453 */     if (isWindows()) {
/* 1454 */       String valueName = "InstallStarted_" + Win32CommunicationBackend.getCurrentProcessId();
/* 1455 */       if (WinRegistry.getValue(RegistryRoot.HKEY_CURRENT_USER, "SOFTWARE\\ej-technologies\\exe4j\\", valueName) != null) {
/* 1456 */         WinRegistry.setValue(RegistryRoot.HKEY_CURRENT_USER, "SOFTWARE\\ej-technologies\\exe4j\\", valueName, Integer.valueOf(hideWindow ? 2 : 0));
/*      */       }
/* 1458 */       WinRegistry.setValue(RegistryRoot.HKEY_CURRENT_USER, "SOFTWARE\\ej-technologies\\exe4j\\", "InstallStarted", Integer.valueOf(hideWindow ? 2 : 0));
/*      */     } 
/*      */   }
/*      */   
/*      */   public static String getVerboseVariableDefinition(String variableName, Object value) {
/* 1463 */     StringBuilder buffer = new StringBuilder();
/* 1464 */     buffer.append(variableName);
/* 1465 */     buffer.append("=");
/* 1466 */     buffer.append(StringUtil.toStringWithArrays(value));
/* 1467 */     if (value != null) {
/* 1468 */       buffer.append("[");
/* 1469 */       buffer.append(value.getClass());
/* 1470 */       buffer.append("]");
/*      */     } 
/* 1472 */     return buffer.toString();
/*      */   }
/*      */   
/*      */   public static String getAnnotatedStackTrace(Throwable t) {
/* 1476 */     StringWriter sw = new StringWriter();
/* 1477 */     t.printStackTrace(new PrintWriter(sw, true));
/* 1478 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/* 1479 */     if (config == null) {
/* 1480 */       return sw.toString();
/*      */     }
/* 1482 */     return prependBeanOrigin(sw.toString(), config.getClassNameToScriptClassOrigin());
/*      */   }
/*      */ 
/*      */   
/*      */   public static void deleteOnExit(File file) {
/* 1487 */     if (isInProcess()) {
/* 1488 */       deleteOnExitFiles.add(file);
/*      */     } else {
/* 1490 */       file.deleteOnExit();
/*      */     } 
/*      */   }
/*      */   
/*      */   public static class State implements Serializable {
/*      */     boolean unattended = false;
/*      */     boolean unattendedAlerts = false;
/*      */     boolean unattendedWithProgress = false;
/*      */     boolean console = false;
/* 1499 */     String installerType = null;
/* 1500 */     Boolean archive = null;
/* 1501 */     String[] commandLineParameters = new String[0];
/* 1502 */     String[] extraCommandLineParameters = new String[0];
/*      */     boolean inProcess = true;
/*      */     boolean shutdownOnInProcessExit = false;
/*      */     boolean blockingLauncherIntegration = false;
/*      */   }
/*      */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\InstallerUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */