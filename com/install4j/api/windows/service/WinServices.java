/*     */ package com.install4j.api.windows.service;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.windows.WinUser;
/*     */ import com.install4j.runtime.beans.actions.services.AbstractControlServiceAction;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchStringAction;
/*     */ import com.install4j.runtime.installer.platform.win32.Win32Services;
/*     */ import com.install4j.runtime.installer.platform.win32.Win32UserInfo;
/*     */ import com.install4j.runtime.launcher.util.LauncherUtil;
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
/*     */ public class WinServices
/*     */ {
/*     */   public static void start(final String serviceName, String... parameters) throws ServiceException {
/*  31 */     checkPrerequisites(serviceName);
/*     */     try {
/*  33 */       HelperCommunication.getInstance().fetchObject(ExecutionContext.MAXIMUM, new FetchObjectAction<Void>()
/*     */           {
/*     */             protected Void fetchValue(Context context) throws Exception {
/*  36 */               Win32Services.startService(serviceName, parameters);
/*  37 */               return null;
/*     */             }
/*     */           });
/*  40 */     } catch (RuntimeException e) {
/*  41 */       throw checkServiceException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void stop(String serviceName) throws ServiceException {
/*  50 */     Context context = ContextImpl.getCurrentContext();
/*  51 */     int minimumTimeout = AbstractControlServiceAction.getMinimumWaitTime(context, 30000);
/*  52 */     stop(serviceName, minimumTimeout);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void stop(final String serviceName, final int minimumWaitTime) throws ServiceException {
/*  63 */     checkPrerequisites(serviceName);
/*     */     try {
/*  65 */       HelperCommunication.getInstance().fetchObject(ExecutionContext.MAXIMUM, new FetchObjectAction<Void>()
/*     */           {
/*     */             protected Void fetchValue(Context context) throws Exception {
/*  68 */               Win32Services.stopService(serviceName, minimumWaitTime);
/*  69 */               return null;
/*     */             }
/*     */           });
/*  72 */     } catch (RuntimeException e) {
/*  73 */       throw checkServiceException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void install(final String serviceName, final ServiceConfiguration configuration) throws ServiceException {
/*  84 */     checkPrerequisites(serviceName);
/*  85 */     if (configuration == null) throw new IllegalArgumentException("configuration required"); 
/*  86 */     if (configuration.getBinaryName() == null) throw new IllegalArgumentException("configuration.binaryName required");
/*     */     
/*     */     try {
/*  89 */       HelperCommunication.getInstance().fetchObject(ExecutionContext.MAXIMUM, new FetchObjectAction<Void>()
/*     */           {
/*     */             protected Void fetchValue(Context context) throws Exception {
/*  92 */               Win32Services.installService(serviceName, null, configuration.getBinaryName());
/*  93 */               WinServices.changeServiceInt(serviceName, configuration);
/*  94 */               return null;
/*     */             }
/*     */           });
/*  97 */     } catch (RuntimeException e) {
/*  98 */       throw checkServiceException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void change(final String serviceName, final ServiceConfiguration configuration) throws ServiceException {
/* 110 */     checkPrerequisites(serviceName);
/*     */     try {
/* 112 */       HelperCommunication.getInstance().fetchObject(ExecutionContext.MAXIMUM, new FetchObjectAction<Void>()
/*     */           {
/*     */             protected Void fetchValue(Context context) throws Exception {
/* 115 */               WinServices.changeServiceInt(serviceName, configuration);
/* 116 */               return null;
/*     */             }
/*     */           });
/* 119 */     } catch (RuntimeException e) {
/* 120 */       throw checkServiceException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void uninstall(final String serviceName) throws ServiceException {
/* 131 */     checkPrerequisites(serviceName);
/*     */     try {
/* 133 */       HelperCommunication.getInstance().fetchObject(ExecutionContext.MAXIMUM, new FetchObjectAction<Void>()
/*     */           {
/*     */             protected Void fetchValue(Context context) throws Exception {
/* 136 */               Win32Services.uninstallService(serviceName);
/* 137 */               return null;
/*     */             }
/*     */           });
/* 140 */     } catch (RuntimeException e) {
/* 141 */       throw checkServiceException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isRunning(final String serviceName) throws ServiceException {
/* 153 */     checkPrerequisites(serviceName);
/*     */     try {
/* 155 */       return HelperCommunication.getInstance().fetchBoolean(ExecutionContext.MAXIMUM, new FetchBooleanAction()
/*     */           {
/*     */             protected boolean fetchValue(Context context) throws Exception {
/* 158 */               return Win32Services.isRunning(serviceName);
/*     */             }
/*     */           });
/* 161 */     } catch (RuntimeException e) {
/* 162 */       throw checkServiceException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static ServiceStartType getStartType(final String serviceName) throws ServiceException {
/* 174 */     checkPrerequisites(serviceName);
/*     */     try {
/* 176 */       return (ServiceStartType)HelperCommunication.getInstance().fetchObject(ExecutionContext.MAXIMUM, new FetchObjectAction<ServiceStartType>()
/*     */           {
/*     */             protected ServiceStartType fetchValue(Context context) throws Exception {
/* 179 */               int startType = Win32Services.getStartType(serviceName);
/* 180 */               switch (startType) {
/*     */                 case 2:
/* 182 */                   return ServiceStartType.AUTO;
/*     */                 case 3:
/* 184 */                   return ServiceStartType.DEMAND;
/*     */                 case 4:
/* 186 */                   return ServiceStartType.DISABLED;
/*     */               } 
/* 188 */               throw new RuntimeException("unknown start type " + startType);
/*     */             }
/*     */           });
/*     */     }
/* 192 */     catch (RuntimeException e) {
/* 193 */       throw checkServiceException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getBinary(final String serviceName) throws ServiceException {
/* 205 */     checkPrerequisites(serviceName);
/*     */     try {
/* 207 */       return HelperCommunication.getInstance().fetchString(ExecutionContext.MAXIMUM, new FetchStringAction()
/*     */           {
/*     */             protected String fetchValue(Context context) throws Exception {
/* 210 */               return Win32Services.getServiceBinary(serviceName);
/*     */             }
/*     */           });
/* 213 */     } catch (RuntimeException e) {
/* 214 */       throw checkServiceException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void changeServiceInt(String serviceName, ServiceConfiguration configuration) throws Win32Services.ServiceException {
/* 219 */     int startType = (configuration.getStartType() == null) ? -1 : (configuration.getStartType()).intValue;
/* 220 */     String accountName = null;
/* 221 */     String password = null;
/* 222 */     if (configuration.getServiceAccount() != null) {
/* 223 */       if (configuration.getServiceAccount() == ServiceAccount.OTHER) {
/* 224 */         accountName = WinUser.getAccountName(configuration.getOtherAccountName());
/* 225 */         if (accountName == null) {
/* 226 */           accountName = configuration.getOtherAccountName();
/*     */         }
/* 228 */         password = configuration.getOtherAccountPassword();
/*     */       } else {
/* 230 */         accountName = configuration.getServiceAccount().getAccountName();
/* 231 */         password = "";
/*     */       } 
/*     */     }
/* 234 */     Win32Services.changeServiceConfig(serviceName, configuration.getDisplayName(), configuration.getBinaryName(), false, startType, configuration.getDependencies(), accountName, password, configuration.getDescription());
/* 235 */     if (Util.isAtLeastWindowsVista() && configuration.getDelayedAutoStart() != null) {
/* 236 */       Win32Services.setDelayedAutoStart(serviceName, configuration.getDelayedAutoStart().booleanValue());
/*     */     }
/* 238 */     if (configuration.getRestartOnFailure() != null) {
/* 239 */       Win32Services.setRestartServiceConfig(serviceName, configuration.getRestartOnFailure().booleanValue(), configuration.getRestartMillis().intValue(), configuration.getMaxRestarts().intValue(), configuration.getResetSeconds().intValue());
/*     */     }
/* 241 */     if (configuration.getServiceAccount() == ServiceAccount.OTHER) {
/* 242 */       Win32UserInfo.setLsaAccountRight(configuration.getOtherAccountName(), "SeServiceLogonRight", true);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static RuntimeException checkServiceException(RuntimeException e) {
/* 248 */     if (e.getCause() instanceof Win32Services.ServiceException) {
/* 249 */       Win32Services.ServiceException serviceException = (Win32Services.ServiceException)e.getCause();
/* 250 */       switch (serviceException.getErrorCode()) {
/*     */         case 1060:
/* 252 */           throw new ServiceNotFoundException();
/*     */         case 5:
/* 254 */           throw new ServiceAccessException();
/*     */       } 
/* 256 */       throw new ServiceException("Win32 error code: " + serviceException.getErrorCode());
/*     */     } 
/*     */     
/* 259 */     throw e;
/*     */   }
/*     */ 
/*     */   
/*     */   private static void checkPrerequisites(String serviceName) {
/* 264 */     if (!LauncherUtil.isWindows()) throw new ServiceException("only available on Windows"); 
/* 265 */     if (serviceName == null) throw new IllegalArgumentException("serviceName required"); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\service\WinServices.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */