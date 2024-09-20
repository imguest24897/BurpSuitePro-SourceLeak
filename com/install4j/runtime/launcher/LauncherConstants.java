/*    */ package com.install4j.runtime.launcher;
/*    */ 
/*    */ import com.exe4j.runtime.splash.Exe4JLauncherConstants;
/*    */ 
/*    */ public interface LauncherConstants
/*    */   extends Exe4JLauncherConstants
/*    */ {
/*    */   public static final String METHOD_START = "start";
/*    */   public static final String METHOD_START_LAUNCHD = "start-launchd";
/*    */   public static final String METHOD_STOP = "stop";
/*    */   public static final String METHOD_LAUNCH = "launch";
/*    */   public static final String METHOD_RUN = "run";
/*    */   public static final String METHOD_RUN_REDIRECT = "run-redirect";
/*    */   public static final String METHOD_STATUS = "status";
/*    */   public static final int MESSAGE_BASE_ID = 1000;
/* 16 */   public static final String[] MESSAGE_IDS = new String[] { "MessageBoxTitle", "NoJvmFound", "JvmInPath", "JvmEnvVar", "JvmDefinedPath", "JvmStart2", "FileNotFound", "WrongParameters", "EnvVarNotDefined", "InternalError", "MainClassNotFound", "MainMethodNotFound", "ErrorDialogCaption", "ErrorDialogOk", "ErrorDialogText", "PowerUserRequired", "NoJvmFound3264", "JvmEnvVar32", "JvmEnvVar64", "JvmDefinedPath32", "JvmDefinedPath64", "UnpackAntiVirus" };
/*    */   public static final char TOKEN_CPE_SCAN_DIRECTORY = 'S';
/*    */   public static final char TOKEN_CPE_DIRECTORY = 'D';
/*    */   public static final char TOKEN_CPE_ARCHIVE = 'A';
/*    */   public static final char TOKEN_CPE_ENVVAR = 'E';
/*    */   public static final char TOKEN_SSE_REGISTRY = 'Y';
/*    */   public static final char TOKEN_SSE_DIRECTORY = 'R';
/*    */   public static final char TOKEN_SSE_ENVVAR = 'E';
/*    */   public static final char TOKEN_SSE_BUNDLED = 'B';
/*    */   public static final String TAG_APPLICATION_NAME = "APPLICATION_NAME";
/*    */   public static final int IDS_W_SERVICE_DESCRIPTION = 20017;
/*    */   public static final String SHUTDOWN_COMM_FILE_PROPNAME = "install4j.shutdownFile";
/*    */   public static final String PROGRESS_ID_PROPNAME = "install4j.progressId";
/*    */   public static final String PROGRESS_HASH_PROPNAME = "install4j.progressHash";
/*    */   public static final String FROM_SERVICE_PROPNAME = "install4j.fromService";
/*    */   public static final String FROM_LAUNCHER = "install4j.fromLauncher";
/*    */   public static final String FROM_LAUNCHER_ID = "install4j.fromLauncherId";
/*    */   public static final String LAUNCH_INFO_FILE = "install4j.launchInfoFile";
/*    */   public static final String INSTALLER_LAUNCHER_CONFIG_ID = "0";
/*    */   public static final String DEFAULT_JVM_VARIABLE = "INSTALL4J_JAVA_HOME";
/*    */   public static final String VARIABLE_LAUNCHER_RUNTIME_LAUNCHER_DIRECTORY = "sys.launcherDirectory";
/*    */   public static final String VARIABLE_LAUNCHER_RUNTIME_JVM_HOME = "sys.jvmHome";
/*    */   public static final String VARIABLE_LAUNCHER_RUNTIME_PATHLIST_SEPARATOR = "sys.pathlistSeparator";
/*    */   public static final String VARIABLE_LAUNCHER_RUNTIME_TEMP_DIR = "sys.tempDir";
/*    */   public static final String VARIABLE_LAUNCHER_RUNTIME_LAUNCHER_TEMP_DIR = "sys.launcherTempDirectory";
/*    */   public static final String LAUNCHER_VARIABLE_PREFIX = "launcher:";
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\launcher\LauncherConstants.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */