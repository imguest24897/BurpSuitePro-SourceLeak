/*     */ package com.install4j.runtime.installer.helper;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.ProgressInterface;
/*     */ import com.install4j.api.context.RemoteCallable;
/*     */ import com.install4j.runtime.beans.actions.services.AbstractControlServiceAction;
/*     */ import com.install4j.runtime.installer.AbstractRemoteCallable;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.frontend.Messages;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.launching.DirectOutputRedirection;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*     */ import com.install4j.runtime.installer.helper.launching.OutputRedirection;
/*     */ import com.install4j.runtime.installer.platform.win32.Win32Services;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.io.Serializable;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ServiceHandler
/*     */ {
/*     */   private static boolean servicesStopped = false;
/*  29 */   private static int systemdVersion = -1;
/*     */   
/*     */   public static final int SYSTEMD_VERSION_EXEC_AVAILABLE = 240;
/*     */   
/*     */   public static synchronized int getSystemdVersion() {
/*  34 */     if (systemdVersion == -1) {
/*  35 */       systemdVersion = 0;
/*  36 */       File systemctlFile = new File("/bin/systemctl");
/*  37 */       if (systemctlFile.isFile()) {
/*  38 */         LaunchHelper.LaunchResult launchResult = LaunchHelper.launchApplicationWithResult((new LaunchDescriptor(new File("/bin/systemctl"))).arguments(new String[] { "--version" }).wait(true).waitForStreams(true).stdoutRedirection((OutputRedirection)new DirectOutputRedirection()));
/*  39 */         if (launchResult == null) {
/*  40 */           Logger.getInstance().error(null, "could not execute systemctl --version");
/*  41 */         } else if (launchResult.getReturnCode() != 0) {
/*  42 */           Logger.getInstance().error(null, "systemctl --version returned " + launchResult.getReturnCode());
/*  43 */         } else if (launchResult.getOutput() == null) {
/*  44 */           Logger.getInstance().error(null, "systemctl --version returned no output");
/*     */         } else {
/*  46 */           for (String line : StringUtil.getLines(launchResult.getOutput())) {
/*  47 */             String trimmed = line.trim();
/*  48 */             if (trimmed.startsWith("systemd ")) {
/*     */               try {
/*  50 */                 String versionPart = trimmed.substring(8);
/*  51 */                 int spaceIndex = versionPart.indexOf(' ');
/*  52 */                 if (spaceIndex > -1) {
/*  53 */                   versionPart = versionPart.substring(0, spaceIndex);
/*     */                 }
/*  55 */                 systemdVersion = Integer.parseInt(versionPart);
/*     */                 break;
/*  57 */               } catch (NumberFormatException e) {
/*  58 */                 Logger.getInstance().error(null, "version line '" + trimmed + "' unexpected");
/*     */               } 
/*     */             }
/*     */           } 
/*  62 */           Logger.getInstance().info(null, "systemd version " + systemdVersion);
/*     */         } 
/*     */       } 
/*     */     } 
/*  66 */     return systemdVersion;
/*     */   }
/*     */   
/*     */   public static void resetStopState() {
/*  70 */     servicesStopped = false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void stopServices(Context context, boolean force) {
/*  75 */     if (!force && servicesStopped) {
/*     */       return;
/*     */     }
/*  78 */     if (!InstallerUtil.isWindows()) {
/*     */       return;
/*     */     }
/*  81 */     ContextInt contextInt = ContextImpl.getContextInt(context);
/*  82 */     List<String> services = contextInt.getInstallationProperties().getPropertyList("service");
/*  83 */     List<String> serviceNames = contextInt.getInstallationProperties().getPropertyList("serviceName");
/*  84 */     if (services.size() > 0 || serviceNames.size() > 0) {
/*  85 */       ProgressInterface progressInterface = context.getProgressInterface();
/*  86 */       progressInterface.setStatusMessage(Messages.getString(".StatusStoppingServices"));
/*  87 */       progressInterface.setDetailMessage(" ");
/*  88 */       progressInterface.setIndeterminateProgress(true);
/*     */       
/*  90 */       context.runElevated((RemoteCallable)new StopRemoteCallable(services, serviceNames, AbstractControlServiceAction.getMinimumWaitTime((Context)contextInt, 30000)), true);
/*     */ 
/*     */       
/*     */       try {
/*  94 */         Thread.sleep(1000L);
/*  95 */       } catch (InterruptedException e) {
/*  96 */         e.printStackTrace();
/*     */       } 
/*     */       
/*  99 */       progressInterface.setIndeterminateProgress(false);
/*     */     } 
/* 101 */     servicesStopped = true;
/*     */   }
/*     */   
/*     */   private static class StopRemoteCallable extends AbstractRemoteCallable {
/*     */     List<String> services;
/*     */     List<String> serviceNames;
/*     */     final int minimumWaitTime;
/*     */     
/*     */     private StopRemoteCallable(List<String> services, List<String> serviceNames, int minimumWaitTime) {
/* 110 */       this.services = services;
/* 111 */       this.serviceNames = serviceNames;
/* 112 */       this.minimumWaitTime = minimumWaitTime;
/*     */     }
/*     */ 
/*     */     
/*     */     public Serializable execute() {
/* 117 */       for (String service : this.services) {
/* 118 */         Logger.getInstance().info(ServiceHandler.class, "Stopping service " + service);
/* 119 */         if ((new File(service)).exists()) {
/*     */           try {
/* 121 */             Process process = (new ProcessBuilder(new String[] { service, "/stop" })).start();
/* 122 */             process.waitFor();
/* 123 */             if (!Util.isWindows() && !Util.isMacOS()) {
/* 124 */               File systemctlFile = new File("/bin/systemctl");
/* 125 */               if (systemctlFile.isFile()) {
/* 126 */                 LaunchHelper.launchApplication((new LaunchDescriptor(systemctlFile)).arguments(new String[] { "--no-ask-password", "stop", (new File(service)).getName() }).wait(true).executionContext(ExecutionContext.MAXIMUM));
/*     */               }
/*     */             } 
/* 129 */           } catch (IOException|InterruptedException e) {
/* 130 */             Logger.getInstance().log(e);
/*     */           } 
/*     */         }
/*     */       } 
/*     */       
/* 135 */       for (String serviceName : this.serviceNames) {
/* 136 */         Logger.getInstance().info(ServiceHandler.class, "Stopping service " + serviceName);
/*     */         try {
/* 138 */           Win32Services.stopService(serviceName, this.minimumWaitTime);
/* 139 */         } catch (com.install4j.runtime.installer.platform.win32.Win32Services.ServiceException e) {
/* 140 */           if (e.getErrorCode() != 1062 && e.getErrorCode() != 1060) {
/* 141 */             Logger.getInstance().log((Throwable)e);
/*     */           }
/*     */         } 
/*     */       } 
/* 145 */       return null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\ServiceHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */