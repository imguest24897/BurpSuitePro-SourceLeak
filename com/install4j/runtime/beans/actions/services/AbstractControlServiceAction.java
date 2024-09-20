/*     */ package com.install4j.runtime.beans.actions.services;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.LauncherSetup;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import com.install4j.runtime.installer.helper.CompilerVariableHelper;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.XmlHelper;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.launching.DirectOutputRedirection;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*     */ import com.install4j.runtime.installer.helper.launching.OutputRedirection;
/*     */ import com.install4j.runtime.installer.platform.macos.PlistHelper;
/*     */ import com.install4j.runtime.installer.platform.win32.Win32Services;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.util.Objects;
/*     */ import org.w3c.dom.Document;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractControlServiceAction
/*     */   extends SystemInstallOrUninstallAction
/*     */ {
/*     */   protected static final String METHOD_START = "start";
/*     */   protected static final String METHOD_STOP = "stop";
/*     */   private File executable;
/*     */   private String serviceName;
/*  32 */   private String launcherId = "";
/*     */   
/*     */   private Boolean previouslyRunning;
/*     */   private boolean success;
/*     */   private boolean directControlOnly;
/*     */   
/*     */   public String getLauncherId() {
/*  39 */     return replaceVariables(this.launcherId);
/*     */   }
/*     */   
/*     */   public void setLauncherId(String launcherId) {
/*  43 */     this.launcherId = launcherId;
/*     */   }
/*     */   
/*     */   public File getExecutable() {
/*  47 */     return (File)replaceWithTextOverride("executable", replaceVariables(this.executable), File.class);
/*     */   }
/*     */   
/*     */   public void setExecutable(File executable) {
/*  51 */     this.executable = executable;
/*     */   }
/*     */   
/*     */   public String getServiceName() {
/*  55 */     return replaceVariables(replaceVariables(this.serviceName));
/*     */   }
/*     */   
/*     */   public void setServiceName(String serviceName) {
/*  59 */     this.serviceName = serviceName;
/*     */   }
/*     */   
/*     */   protected boolean controlService(Context context, String method) {
/*  63 */     return controlService(context, method, false);
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean controlService(Context context, String method, boolean autostartOnly) {
/*  68 */     this.directControlOnly = false;
/*  69 */     this.previouslyRunning = null;
/*  70 */     this.success = false;
/*  71 */     this.success = controlServiceInt(context, method, autostartOnly);
/*  72 */     Logger.getInstance().info(this, "previous state " + getPreviouslyRunning());
/*  73 */     return this.success;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean controlServiceInt(Context context, String method, boolean autostartOnly) {
/*     */     File usedExecutable;
/*     */     String usedName;
/*  80 */     if (getLauncherId() == null) {
/*  81 */       usedName = getServiceName();
/*  82 */       usedExecutable = context.getDestinationFile(getExecutable());
/*     */     } else {
/*  84 */       LauncherSetup launcherSetup = context.getLauncherById(getLauncherId());
/*  85 */       if (launcherSetup == null) {
/*  86 */         Logger.getInstance().log(this, "The launcher with ID " + getLauncherId() + " cannot be found", false);
/*  87 */         return false;
/*     */       } 
/*     */       
/*  90 */       usedExecutable = context.getDestinationFile(launcherSetup.getRelativeFileName());
/*  91 */       usedName = launcherSetup.getName();
/*     */     } 
/*     */     
/*  94 */     if (InstallerUtil.isWindows() && autostartOnly) {
/*     */       try {
/*  96 */         if (Win32Services.getStartType(usedName) != 2) {
/*  97 */           return true;
/*     */         }
/*  99 */       } catch (com.install4j.runtime.installer.platform.win32.Win32Services.ServiceException e) {
/* 100 */         Logger.getInstance().log((Throwable)e);
/*     */       } 
/*     */     }
/*     */     
/* 104 */     Logger.getInstance().info(this, "usedExecutable: " + usedExecutable);
/* 105 */     if (Util.isWindows()) {
/*     */       try {
/* 107 */         return executeWindows(context, method, usedName);
/* 108 */       } catch (Exception e) {
/* 109 */         e.printStackTrace();
/* 110 */         return false;
/*     */       } 
/*     */     }
/* 113 */     if (!usedExecutable.exists()) {
/* 114 */       Logger.getInstance().log(this, "The executable " + usedExecutable + " does not exist", false);
/* 115 */       return false;
/*     */     } 
/*     */     
/* 118 */     if (Util.isMacOS()) {
/* 119 */       String identifier = findIdentifier(usedExecutable, autostartOnly);
/* 120 */       Logger.getInstance().log(this, "macOS identifier: " + identifier, true);
/* 121 */       if (identifier != null) {
/* 122 */         this.previouslyRunning = Boolean.valueOf(isRunningOnMac(identifier));
/*     */       }
/* 124 */       String usedIdentifier = Objects.equals(method, "stop") ? null : identifier;
/* 125 */       if (usedIdentifier != null) {
/* 126 */         if (usedIdentifier.length() > 0) {
/* 127 */           LaunchDescriptor launchDescriptor = (new LaunchDescriptor(new File("/bin/launchctl"))).wait(true).executionContext(ExecutionContext.MAXIMUM).suidRoot(true);
/* 128 */           Integer integer1 = LaunchHelper.launchApplication(launchDescriptor.arguments(new String[] { "load", (new File("/Library/LaunchDaemons", usedIdentifier + ".plist")).getAbsolutePath() }));
/* 129 */           if (integer1 != null && integer1.intValue() == 0) {
/* 130 */             integer1 = LaunchHelper.launchApplication(launchDescriptor.arguments(new String[] { method, usedIdentifier }));
/* 131 */             return (integer1 != null && integer1.intValue() == 0);
/*     */           } 
/* 133 */           return false;
/*     */         } 
/*     */         
/* 136 */         return true;
/*     */       } 
/*     */       
/* 139 */       Integer integer = LaunchHelper.launchApplication((new LaunchDescriptor(usedExecutable)).arguments(new String[] { method }).wait(true).executionContext(ExecutionContext.MAXIMUM).suidRoot(true));
/* 140 */       return (integer != null && integer.intValue() == 0);
/*     */     } 
/*     */     
/* 143 */     File systemctlFile = new File("/bin/systemctl");
/* 144 */     if (systemctlFile.isFile()) {
/* 145 */       Integer integer = LaunchHelper.launchApplication((new LaunchDescriptor(systemctlFile)).arguments(new String[] { "--no-ask-password", "status", usedExecutable.getName() }).wait(true).executionContext(ExecutionContext.MAXIMUM).logReturnValue(false));
/* 146 */       if (integer != null) {
/* 147 */         this.previouslyRunning = Boolean.valueOf((integer.intValue() == 0));
/*     */       }
/* 149 */       integer = LaunchHelper.launchApplication((new LaunchDescriptor(systemctlFile)).arguments(new String[] { "--no-ask-password", method, usedExecutable.getName() }).wait(true).executionContext(ExecutionContext.MAXIMUM));
/* 150 */       if (integer != null && integer.intValue() == 0) {
/* 151 */         return true;
/*     */       }
/* 153 */       Logger.getInstance().error(this, usedExecutable + " " + method + " with systemctl returned " + integer);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 158 */     this.directControlOnly = true;
/* 159 */     Integer returnValue = LaunchHelper.launchApplication((new LaunchDescriptor(usedExecutable)).arguments(new String[] { method }).wait(true).executionContext(ExecutionContext.MAXIMUM));
/* 160 */     if (returnValue != null && returnValue.intValue() == 0) {
/* 161 */       return true;
/*     */     }
/* 163 */     Logger.getInstance().info(this, usedExecutable + " " + method + " returned " + returnValue);
/* 164 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String findIdentifier(File usedExecutable, boolean autostartOnly) {
/* 171 */     File[] plistFiles = (new File("/Library/LaunchDaemons")).listFiles();
/* 172 */     if (plistFiles != null) {
/* 173 */       for (File plistFile : plistFiles) {
/*     */         try {
/* 175 */           Document document = XmlHelper.parseFile(plistFile);
/* 176 */           String fileName = XmlHelper.getTextValue(PlistHelper.getFirstChild(PlistHelper.findValue(PlistHelper.getFirstChild(document.getDocumentElement(), "dict"), "ProgramArguments"), "string"));
/* 177 */           if (Objects.equals(usedExecutable.getCanonicalPath(), fileName)) {
/* 178 */             if (autostartOnly && !Boolean.parseBoolean(PlistHelper.findValue(PlistHelper.getFirstChild(document.getDocumentElement(), "dict"), "RunAtLoad").getNodeName())) {
/* 179 */               return "";
/*     */             }
/* 181 */             return XmlHelper.getTextValue(PlistHelper.findValue(PlistHelper.getFirstChild(document.getDocumentElement(), "dict"), "Label"));
/*     */           } 
/* 183 */         } catch (com.install4j.runtime.installer.platform.macos.PlistHelper.NotFoundException notFoundException) {
/*     */         
/* 185 */         } catch (IOException e) {
/* 186 */           Logger.getInstance().log(e);
/*     */         } 
/*     */       } 
/*     */     }
/* 190 */     return null;
/*     */   }
/*     */   
/*     */   private boolean executeWindows(Context context, String method, String usedName) {
/*     */     try {
/*     */       try {
/* 196 */         this.previouslyRunning = Boolean.valueOf(Win32Services.isRunning(usedName));
/* 197 */       } catch (Throwable throwable) {}
/*     */       
/* 199 */       if (Objects.equals(method, "start")) {
/* 200 */         Win32Services.startService(usedName);
/*     */       } else {
/* 202 */         int minimumStopWaitTime = getMinimumWaitTime(context, getWindowsStopMinimumWaitTime());
/* 203 */         Logger.getInstance().info(this, "Stop minimum wait time: " + minimumStopWaitTime);
/* 204 */         Win32Services.stopService(usedName, minimumStopWaitTime);
/*     */       } 
/* 206 */       return true;
/* 207 */     } catch (com.install4j.runtime.installer.platform.win32.Win32Services.ServiceException e) {
/* 208 */       if (e.getErrorCode() == 1056) {
/* 209 */         Logger.getInstance().info(this, "Service '" + usedName + "' already running.");
/* 210 */         return true;
/* 211 */       }  if (e.getErrorCode() == 1062) {
/* 212 */         Logger.getInstance().info(this, "Service '" + usedName + "' is not running.");
/* 213 */         return true;
/* 214 */       }  if (e.getErrorCode() == 1057) {
/* 215 */         Logger.getInstance().error(this, "Invalid service account.");
/* 216 */       } else if (e.getErrorCode() == 5) {
/* 217 */         Logger.getInstance().error(this, "Access denied. Need to be elevated administrator.");
/* 218 */       } else if (e.getErrorCode() == 1060) {
/* 219 */         Logger.getInstance().error(this, "Service '" + usedName + "' does not exist. You need to install it first.");
/* 220 */       } else if (e.getErrorCode() == 1069) {
/* 221 */         Logger.getInstance().error(this, "Logon to service account failed. Password is wrong.");
/*     */       } else {
/* 223 */         Logger.getInstance().error(this, "Service control error: " + e.getErrorCode());
/*     */       } 
/* 225 */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected int getWindowsStopMinimumWaitTime() {
/* 230 */     return 30000;
/*     */   }
/*     */   
/*     */   protected Boolean getPreviouslyRunning() {
/* 234 */     return this.previouslyRunning;
/*     */   }
/*     */   
/*     */   protected boolean isSuccess() {
/* 238 */     return this.success;
/*     */   }
/*     */   
/*     */   protected boolean isDirectControlOnly() {
/* 242 */     return this.directControlOnly;
/*     */   }
/*     */   
/*     */   private static boolean isRunningOnMac(String identifier) {
/* 246 */     LaunchDescriptor launchDescriptor = (new LaunchDescriptor(new File("/bin/launchctl"))).arguments(new String[] { "list", identifier }).wait(true).executionContext(ExecutionContext.MAXIMUM).suidRoot(true);
/* 247 */     LaunchHelper.LaunchResult launchResult = LaunchHelper.launchApplicationWithResult(launchDescriptor.stdoutRedirection((OutputRedirection)new DirectOutputRedirection()));
/* 248 */     return (launchResult != null && launchResult.getReturnCode() == 0 && launchResult.getOutput() != null && launchResult.getOutput().contains("\"PID\" = "));
/*     */   }
/*     */   
/*     */   public static int getMinimumWaitTime(Context context, int timeout) {
/* 252 */     return CompilerVariableHelper.getCompilerExtensionVariable(context, "serviceMinimumStopTimeout", timeout);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\services\AbstractControlServiceAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */