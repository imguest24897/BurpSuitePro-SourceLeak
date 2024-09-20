/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.windows.WinProcesses;
/*     */ import com.install4j.api.windows.WinRegistry;
/*     */ import com.install4j.api.windows.WindowInfo;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Properties;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ public class Misc {
/*  17 */   private static Properties envVarCache = null;
/*  18 */   private static Properties lookupEnvVarCache = null;
/*     */   
/*     */   private static final String REBOOT_PARAMETER = "__i4j_reboot";
/*     */   
/*     */   public static final int TERMINATE_FAILURE = 0;
/*     */   public static final int TERMINATE_SUCCESS = 1;
/*     */   public static final int TERMINATE_WAIT_FAILURE = 2;
/*     */   public static final int TERMINATE_TIMEOUT = 3;
/*     */   
/*     */   static {
/*  28 */     Common.init();
/*     */   }
/*     */   
/*     */   public static void reboot() {
/*     */     try {
/*  33 */       (new ProcessBuilder(new String[] { System.getProperty("exe4j.moduleName"), "__i4j_reboot" })).start();
/*  34 */     } catch (IOException e) {
/*  35 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static WinProcesses.Info[] getRunningProcesses() {
/*  41 */     String[] modules = getRunningModules0(false);
/*  42 */     if (modules == null) return null; 
/*  43 */     WinProcesses.Info[] processInfos = new WinProcesses.Info[modules.length];
/*  44 */     for (int i = 0; i < modules.length; i++) {
/*  45 */       int processId; String value = modules[i];
/*  46 */       int pos = value.indexOf(' ');
/*     */       
/*  48 */       if (pos > 0) {
/*  49 */         processId = Integer.parseInt(value.substring(0, pos));
/*     */       } else {
/*  51 */         processId = 0;
/*     */       } 
/*  53 */       String moduleName = value.substring(pos + 1);
/*  54 */       processInfos[i] = new WinProcesses.Info(processId, moduleName);
/*     */     } 
/*  56 */     return processInfos;
/*     */   }
/*     */ 
/*     */   
/*     */   public static Properties getenv() {
/*  61 */     if (envVarCache == null) {
/*  62 */       envVarCache = new Properties();
/*  63 */       lookupEnvVarCache = new Properties();
/*     */       
/*  65 */       String[] envVarPairs = getEnvVarPairs0();
/*  66 */       if (envVarPairs != null) {
/*  67 */         for (String pair : envVarPairs) {
/*  68 */           int equalPos = pair.indexOf('=');
/*  69 */           if (equalPos > 0) {
/*  70 */             String key = pair.substring(0, equalPos);
/*  71 */             String value = pair.substring(equalPos + 1);
/*     */             
/*  73 */             envVarCache.setProperty(key, value);
/*  74 */             lookupEnvVarCache.setProperty(key.toUpperCase(Locale.ENGLISH), value);
/*     */           } 
/*     */         } 
/*     */       }
/*     */     } 
/*  79 */     return envVarCache;
/*     */   }
/*     */   
/*     */   public static String getenv(String key) {
/*  83 */     getenv();
/*  84 */     return lookupEnvVarCache.getProperty(key.toUpperCase(Locale.ENGLISH));
/*     */   }
/*     */   
/*     */   public static void broadcastSettingChange() {
/*  88 */     broadcastSettingChange0();
/*     */   }
/*     */   
/*     */   public static long getPhysicalMemory() {
/*  92 */     return getPhysicalMemory0();
/*     */   }
/*     */   
/*     */   public static long getFreeDiskSpace(File checkFile) {
/*  96 */     if (!checkFile.isDirectory()) {
/*  97 */       checkFile = checkFile.getParentFile();
/*  98 */       if (checkFile == null) {
/*  99 */         return -1L;
/*     */       }
/*     */     } 
/* 102 */     return getFreeDiskSpace0(checkFile.getAbsolutePath());
/*     */   }
/*     */   
/*     */   public static boolean moveWithDelayUntilReboot(File source, File destination) {
/* 106 */     return moveWithDelayUntilReboot0(source.getAbsolutePath(), (destination == null) ? null : destination.getAbsolutePath());
/*     */   }
/*     */   
/*     */   public static void toFront() {
/* 110 */     toFront0();
/*     */   }
/*     */   
/*     */   public static int terminateProcesses(int[] processIds, boolean force, int wmCloseTimeout) {
/* 114 */     return terminateProcesses0(processIds, force, wmCloseTimeout);
/*     */   }
/*     */   
/*     */   public static String getWindowTitle(int processId) {
/* 118 */     return getWindowTitle0(processId);
/*     */   }
/*     */   
/*     */   public static Collection<WindowInfo> getTopLevelWindows(int processId) {
/* 122 */     if (Util.isWindows()) {
/* 123 */       WindowInfo[] windowsInfos = getTopLevelWindows0(WindowInfo.class, processId);
/* 124 */       if (windowsInfos != null) {
/* 125 */         List<WindowInfo> ret = new ArrayList<>();
/* 126 */         for (WindowInfo windowsInfo : windowsInfos) {
/* 127 */           if (windowsInfo != null) {
/* 128 */             ret.add(windowsInfo);
/*     */           }
/*     */         } 
/* 131 */         return ret;
/*     */       } 
/*     */     } 
/* 134 */     return Collections.emptyList();
/*     */   }
/*     */   
/*     */   public static void setForegroundWindow(long hwnd) {
/* 138 */     if (hwnd != 0L) {
/* 139 */       setForegroundWindow0(hwnd);
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean isTabletMode() {
/* 144 */     return (Util.isWindows() && Objects.equals(Integer.valueOf(1), WinRegistry.getValue(RegistryRoot.HKEY_CURRENT_USER, "Software\\Microsoft\\Windows\\CurrentVersion\\ImmersiveShell", "TabletMode")));
/*     */   }
/*     */   
/*     */   public static int getPidFromHandle(long handle) {
/* 148 */     if (!Util.isWindows() || handle == 0L) {
/* 149 */       return 0;
/*     */     }
/* 151 */     return getPidFromHandle0(handle);
/*     */   }
/*     */   
/*     */   public static boolean registerExtensionFunctions(ClassLoader classLoader, String methodName, String alternativePrefix) {
/* 155 */     if (!Util.isWindows()) {
/* 156 */       return false;
/*     */     }
/* 158 */     return registerExtensionFunctions0(classLoader, methodName, alternativePrefix);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static PE32Handler.Machine getMachine() {
/* 163 */     if (!Util.isWindows()) {
/* 164 */       return PE32Handler.Machine.UNKNOWN;
/*     */     }
/* 166 */     return PE32Handler.getMachine(getMachine0());
/*     */   }
/*     */   
/*     */   public static int getOsBuildNumber() {
/* 170 */     if (!Util.isWindows()) {
/* 171 */       return 0;
/*     */     }
/* 173 */     return getOsBuildNumber0();
/*     */   }
/*     */   
/*     */   private static native void reboot0();
/*     */   
/*     */   private static native String[] getRunningModules0(boolean paramBoolean);
/*     */   
/*     */   private static native String[] getEnvVarPairs0();
/*     */   
/*     */   private static native void broadcastSettingChange0();
/*     */   
/*     */   private static native long getPhysicalMemory0();
/*     */   
/*     */   private static native long getFreeDiskSpace0(String paramString);
/*     */   
/*     */   private static native boolean moveWithDelayUntilReboot0(String paramString1, String paramString2);
/*     */   
/*     */   private static native void toFront0();
/*     */   
/*     */   private static native int terminateProcesses0(int[] paramArrayOfint, boolean paramBoolean, int paramInt);
/*     */   
/*     */   private static native String getWindowTitle0(int paramInt);
/*     */   
/*     */   private static native void setForegroundWindow0(long paramLong);
/*     */   
/*     */   private static native WindowInfo[] getTopLevelWindows0(Class<WindowInfo> paramClass, int paramInt);
/*     */   
/*     */   private static native int getPidFromHandle0(long paramLong);
/*     */   
/*     */   public static native boolean registerExtensionFunctions0(ClassLoader paramClassLoader, String paramString1, String paramString2);
/*     */   
/*     */   private static native int getMachine0();
/*     */   
/*     */   private static native int getOsBuildNumber0();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\Misc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */