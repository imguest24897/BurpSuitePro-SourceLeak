/*     */ package com.install4j.runtime.installer.platform.win32;
/*     */ 
/*     */ import com.install4j.runtime.launcher.util.LauncherUtil;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Win32Services
/*     */ {
/*     */   public static final int DEFAULT_MINIMUM_STOP_TIMEOUT = 30000;
/*     */   public static final int DEFAULT_RESTART_MILLIS = 1000;
/*     */   public static final int DEFAULT_MAX_RESTARTS = 0;
/*     */   public static final int DEFAULT_RESET_SECONDS = 0;
/*     */   public static final int SERVICE_NO_CHANGE = -1;
/*     */   public static final int SERVICE_AUTO_START = 2;
/*     */   public static final int SERVICE_DEMAND_START = 3;
/*     */   public static final int SERVICE_DISABLED = 4;
/*     */   public static final int SERVICE_NON_INTERACTIVE_PROCESS = 16;
/*     */   public static final int SERVICE_INTERACTIVE_PROCESS = 272;
/*     */   public static final int ERROR_ACCESS_DENIED = 5;
/*     */   public static final int ERROR_SERVICE_ALREADY_RUNNING = 1056;
/*     */   public static final int ERROR_INVALID_SERVICE_ACCOUNT = 1057;
/*     */   public static final int ERROR_SERVICE_DOES_NOT_EXIST = 1060;
/*     */   public static final int ERROR_SERVICE_NOT_ACTIVE = 1062;
/*     */   public static final int ERROR_SERVICE_LOGON_FAILED = 1069;
/*     */   public static final int ERROR_SERVICE_MARKED_FOR_DELETE = 1072;
/*     */   public static final int ERROR_SERVICE_EXISTS = 1073;
/*     */   private static final int SERVICE_RUNNING = 4;
/*     */   
/*     */   static {
/*  32 */     Common.init();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setDelayedAutoStart(String serviceName, boolean value) throws ServiceException {
/*  48 */     if (!LauncherUtil.isWindows())
/*  49 */       return;  if (serviceName == null) throw new IllegalArgumentException("serviceName required"); 
/*  50 */     int ret = setDelayedAutoStart0(serviceName, value);
/*  51 */     if (ret != 0) {
/*  52 */       throw new ServiceException(ret);
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean isRunning(String serviceName) throws ServiceException {
/*  57 */     if (!LauncherUtil.isWindows()) return false; 
/*  58 */     if (serviceName == null) throw new IllegalArgumentException("serviceName required"); 
/*  59 */     int ret = queryStatus0(serviceName);
/*  60 */     if (ret <= 0) {
/*  61 */       return (-ret == 4);
/*     */     }
/*  63 */     throw new ServiceException(ret);
/*     */   }
/*     */   
/*     */   public static int getStartType(String serviceName) throws ServiceException {
/*  67 */     if (!LauncherUtil.isWindows()) return 4; 
/*  68 */     if (serviceName == null) throw new IllegalArgumentException("serviceName required"); 
/*  69 */     int ret = getStartType0(serviceName);
/*  70 */     if (ret <= 0) {
/*  71 */       return -ret;
/*     */     }
/*  73 */     throw new ServiceException(ret);
/*     */   }
/*     */   
/*     */   public static String getServiceBinary(String serviceName) throws ServiceException {
/*  77 */     if (!LauncherUtil.isWindows()) return null; 
/*  78 */     if (serviceName == null) throw new IllegalArgumentException("serviceName required"); 
/*  79 */     String ret = getServiceBinary0(serviceName);
/*  80 */     if (ret.startsWith(" ")) {
/*  81 */       throw new ServiceException(Integer.parseInt(ret.substring(1)));
/*     */     }
/*  83 */     return ret;
/*     */   }
/*     */   
/*     */   public static void installService(String serviceName, String displayName, String pathName) throws ServiceException {
/*  87 */     if (!LauncherUtil.isWindows())
/*  88 */       return;  if (serviceName == null) throw new IllegalArgumentException("serviceName required"); 
/*  89 */     if (pathName == null) throw new IllegalArgumentException("pathName required"); 
/*  90 */     int ret = installService0(serviceName, displayName, pathName);
/*  91 */     if (ret != 0) throw new ServiceException(ret); 
/*     */   }
/*     */   
/*     */   public static void changeServiceConfig(String serviceName, String displayName, String pathName, boolean interactive, int startType, String dependencies, String accountName, String password, String description) throws ServiceException {
/*  95 */     if (!LauncherUtil.isWindows())
/*  96 */       return;  if (serviceName == null) throw new IllegalArgumentException("serviceName required"); 
/*  97 */     if (dependencies != null) {
/*  98 */       dependencies = dependencies.replaceAll(",\\s+", ",").trim();
/*     */     }
/* 100 */     int ret = changeServiceConfig0(serviceName, displayName, pathName, interactive ? 272 : 16, startType, dependencies, accountName, password, description);
/* 101 */     if (ret != 0) {
/* 102 */       throw new ServiceException(ret);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setRestartServiceConfig(String serviceName, boolean on, int restartMillis, int maxRestarts, int resetSeconds) throws ServiceException {
/* 107 */     if (!LauncherUtil.isWindows())
/* 108 */       return;  if (serviceName == null) throw new IllegalArgumentException("serviceName required"); 
/* 109 */     int ret = setRestartServiceConfig0(serviceName, on, restartMillis, maxRestarts, resetSeconds);
/* 110 */     if (ret != 0) {
/* 111 */       throw new ServiceException(ret);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static void stopService(String serviceName) throws ServiceException {
/* 117 */     stopService(serviceName, 30000);
/*     */   }
/*     */   
/*     */   public static void stopService(String serviceName, int minimumWaitTime) throws ServiceException {
/* 121 */     if (!LauncherUtil.isWindows())
/* 122 */       return;  if (serviceName == null) throw new IllegalArgumentException("serviceName required"); 
/* 123 */     int ret = stopService0(serviceName, minimumWaitTime);
/* 124 */     if (ret != 0) {
/* 125 */       throw new ServiceException(ret);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void startService(String serviceName) throws ServiceException {
/* 130 */     startService(serviceName, (String[])null);
/*     */   }
/*     */   
/*     */   public static void startService(String serviceName, String... parameters) throws ServiceException {
/* 134 */     if (!LauncherUtil.isWindows())
/* 135 */       return;  if (serviceName == null) throw new IllegalArgumentException("serviceName required"); 
/* 136 */     int ret = startService0(serviceName, parameters);
/* 137 */     if (ret != 0) {
/* 138 */       throw new ServiceException(ret);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void uninstallService(String serviceName) throws ServiceException {
/* 143 */     if (!LauncherUtil.isWindows())
/* 144 */       return;  if (serviceName == null) throw new IllegalArgumentException("serviceName required"); 
/* 145 */     int ret = uninstallService0(serviceName);
/* 146 */     if (ret != 0 && ret != 1072)
/* 147 */       throw new ServiceException(ret); 
/*     */   } private static native int installService0(String paramString1, String paramString2, String paramString3); private static native int changeServiceConfig0(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, String paramString5, String paramString6, String paramString7); private static native int setRestartServiceConfig0(String paramString, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3); private static native int setDelayedAutoStart0(String paramString, boolean paramBoolean); private static native int stopService0(String paramString, int paramInt);
/*     */   private static native int startService0(String paramString, String[] paramArrayOfString);
/*     */   private static native int uninstallService0(String paramString);
/*     */   private static native int queryStatus0(String paramString);
/*     */   private static native int getStartType0(String paramString);
/*     */   private static native String getServiceBinary0(String paramString);
/*     */   public static class ServiceException extends Exception { public ServiceException(int errorCode) {
/* 155 */       this.errorCode = errorCode;
/*     */     }
/*     */     private int errorCode;
/*     */     public int getErrorCode() {
/* 159 */       return this.errorCode;
/*     */     }
/*     */ 
/*     */     
/*     */     public String toString() {
/* 164 */       return "ServiceException{errorCode=" + this.errorCode + '}';
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\Win32Services.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */