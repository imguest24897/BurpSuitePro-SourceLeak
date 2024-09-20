/*     */ package com.install4j.runtime.beans.actions.misc;
/*     */ 
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.beans.PropertyLoggingInterceptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.InstallerContext;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.runtime.beans.actions.SystemInstallOrUninstallAction;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.launching.InputRedirection;
/*     */ import com.install4j.runtime.installer.helper.launching.InputRedirectionMode;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchDescriptor;
/*     */ import com.install4j.runtime.installer.helper.launching.LaunchHelper;
/*     */ import com.install4j.runtime.installer.helper.launching.OutputRedirection;
/*     */ import com.install4j.runtime.installer.helper.launching.OutputRedirectionMode;
/*     */ import java.io.File;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Objects;
/*     */ 
/*     */ public class RunExecutableAction extends SystemInstallOrUninstallAction implements PropertyLoggingInterceptor {
/*     */   public static final String PROPERTY_ARGUMENTS = "arguments";
/*     */   private File executable;
/*     */   private File workingDirectory;
/*     */   private String[] arguments;
/*     */   private boolean useRollbackExecutable = false;
/*     */   private File rollbackExecutable;
/*     */   private File rollbackWorkingDirectory;
/*     */   private String[] rollbackArguments;
/*     */   private boolean wait = false;
/*     */   private boolean waitForStreams = true;
/*  34 */   private String returnCodeVariable = "";
/*  35 */   private int timeout = 0;
/*     */   
/*     */   private boolean logArguments = false;
/*  38 */   private OutputRedirectionMode stdoutRedirectionMode = OutputRedirectionMode.NONE;
/*  39 */   private String stdoutVariableName = "";
/*     */   
/*     */   private boolean updateStdoutVariableLines = false;
/*     */   private File stdoutFile;
/*     */   private boolean failOnStdoutFileError = false;
/*  44 */   private OutputRedirectionMode stderrRedirectionMode = OutputRedirectionMode.NONE;
/*     */   private File stderrFile;
/*  46 */   private String stderrVariableName = "";
/*     */   
/*     */   private boolean updateStderrVariableLines = false;
/*     */   private boolean failOnStderrFileError = false;
/*  50 */   private InputRedirectionMode stdinRedirectionMode = InputRedirectionMode.NONE;
/*     */   private File stdinFile;
/*  52 */   private String stdinString = "";
/*     */   
/*     */   private boolean failOnStdinFileError = false;
/*     */   private boolean includeParentEnvironmentVariables = true;
/*  56 */   private Map<String, String> environmentVariables = new LinkedHashMap<>();
/*     */   
/*     */   private boolean showWindowsConsole = false;
/*     */   private boolean keepConsoleWindow = false;
/*     */   
/*     */   public File getExecutable() {
/*  62 */     return (File)replaceWithTextOverride("executable", replaceVariables(this.executable), File.class);
/*     */   }
/*     */   
/*     */   public void setExecutable(File executable) {
/*  66 */     this.executable = executable;
/*     */   }
/*     */   
/*     */   public File getWorkingDirectory() {
/*  70 */     return (File)replaceWithTextOverride("workingDirectory", replaceVariables(this.workingDirectory), File.class);
/*     */   }
/*     */   
/*     */   public void setWorkingDirectory(File workingDirectory) {
/*  74 */     this.workingDirectory = workingDirectory;
/*     */   }
/*     */   
/*     */   public String[] getArguments() {
/*  78 */     return (String[])replaceWithTextOverride("arguments", replaceVariables(this.arguments), String[].class);
/*     */   }
/*     */   
/*     */   public void setArguments(String[] arguments) {
/*  82 */     this.arguments = arguments;
/*     */   }
/*     */   
/*     */   public boolean isUseRollbackExecutable() {
/*  86 */     return replaceWithTextOverride("useRollbackExecutable", this.useRollbackExecutable);
/*     */   }
/*     */   
/*     */   public void setUseRollbackExecutable(boolean useRollbackExecutable) {
/*  90 */     this.useRollbackExecutable = useRollbackExecutable;
/*     */   }
/*     */   
/*     */   public File getRollbackExecutable() {
/*  94 */     return (File)replaceWithTextOverride("rollbackExecutable", replaceVariables(this.rollbackExecutable), File.class);
/*     */   }
/*     */   
/*     */   public void setRollbackExecutable(File rollbackExecutable) {
/*  98 */     this.rollbackExecutable = rollbackExecutable;
/*     */   }
/*     */   
/*     */   public File getRollbackWorkingDirectory() {
/* 102 */     return (File)replaceWithTextOverride("rollbackWorkingDirectory", replaceVariables(this.rollbackWorkingDirectory), File.class);
/*     */   }
/*     */   
/*     */   public void setRollbackWorkingDirectory(File rollbackWorkingDirectory) {
/* 106 */     this.rollbackWorkingDirectory = rollbackWorkingDirectory;
/*     */   }
/*     */   
/*     */   public String[] getRollbackArguments() {
/* 110 */     return (String[])replaceWithTextOverride("rollbackArguments", replaceVariables(this.rollbackArguments), String[].class);
/*     */   }
/*     */   
/*     */   public void setRollbackArguments(String[] rollbackArguments) {
/* 114 */     this.rollbackArguments = rollbackArguments;
/*     */   }
/*     */   
/*     */   public boolean isWait() {
/* 118 */     return replaceWithTextOverride("wait", this.wait);
/*     */   }
/*     */   
/*     */   public void setWait(boolean wait) {
/* 122 */     this.wait = wait;
/*     */   }
/*     */   
/*     */   public boolean isWaitForStreams() {
/* 126 */     return replaceWithTextOverride("waitForStreams", this.waitForStreams);
/*     */   }
/*     */   
/*     */   public void setWaitForStreams(boolean waitForStreams) {
/* 130 */     this.waitForStreams = waitForStreams;
/*     */   }
/*     */   
/*     */   public String getReturnCodeVariable() {
/* 134 */     return replaceVariables(this.returnCodeVariable);
/*     */   }
/*     */   
/*     */   public void setReturnCodeVariable(String returnCodeVariable) {
/* 138 */     this.returnCodeVariable = returnCodeVariable;
/*     */   }
/*     */   
/*     */   public int getTimeout() {
/* 142 */     return replaceWithTextOverride("timeout", this.timeout);
/*     */   }
/*     */   
/*     */   public void setTimeout(int timeout) {
/* 146 */     this.timeout = timeout;
/*     */   }
/*     */   
/*     */   public boolean isLogArguments() {
/* 150 */     return replaceWithTextOverride("logArguments", this.logArguments);
/*     */   }
/*     */   
/*     */   public void setLogArguments(boolean logArguments) {
/* 154 */     this.logArguments = logArguments;
/*     */   }
/*     */   
/*     */   public OutputRedirectionMode getStdoutRedirectionMode() {
/* 158 */     return (OutputRedirectionMode)replaceWithTextOverride("stdoutRedirectionMode", this.stdoutRedirectionMode, OutputRedirectionMode.class);
/*     */   }
/*     */   
/*     */   public void setStdoutRedirectionMode(OutputRedirectionMode stdoutRedirectionMode) {
/* 162 */     this.stdoutRedirectionMode = stdoutRedirectionMode;
/*     */   }
/*     */   
/*     */   public String getStdoutVariableName() {
/* 166 */     return replaceVariables(replaceVariables(this.stdoutVariableName));
/*     */   }
/*     */   
/*     */   public void setStdoutVariableName(String stdoutVariableName) {
/* 170 */     this.stdoutVariableName = stdoutVariableName;
/*     */   }
/*     */   
/*     */   public boolean isUpdateStdoutVariableLines() {
/* 174 */     return replaceWithTextOverride("updateStdoutVariableLines", this.updateStdoutVariableLines);
/*     */   }
/*     */   
/*     */   public void setUpdateStdoutVariableLines(boolean updateStdoutVariableLines) {
/* 178 */     this.updateStdoutVariableLines = updateStdoutVariableLines;
/*     */   }
/*     */   
/*     */   public File getStdoutFile() {
/* 182 */     return (File)replaceWithTextOverride("stdoutFile", replaceVariables(this.stdoutFile), File.class);
/*     */   }
/*     */   
/*     */   public void setStdoutFile(File stdoutFile) {
/* 186 */     this.stdoutFile = stdoutFile;
/*     */   }
/*     */   
/*     */   public boolean isFailOnStdoutFileError() {
/* 190 */     return replaceWithTextOverride("failOnStdoutFileError", this.failOnStdoutFileError);
/*     */   }
/*     */   
/*     */   public void setFailOnStdoutFileError(boolean failOnStdoutFileError) {
/* 194 */     this.failOnStdoutFileError = failOnStdoutFileError;
/*     */   }
/*     */   
/*     */   public OutputRedirectionMode getStderrRedirectionMode() {
/* 198 */     return (OutputRedirectionMode)replaceWithTextOverride("stderrRedirectionMode", this.stderrRedirectionMode, OutputRedirectionMode.class);
/*     */   }
/*     */   
/*     */   public void setStderrRedirectionMode(OutputRedirectionMode stderrRedirectionMode) {
/* 202 */     this.stderrRedirectionMode = stderrRedirectionMode;
/*     */   }
/*     */   
/*     */   public String getStderrVariableName() {
/* 206 */     return replaceVariables(replaceVariables(this.stderrVariableName));
/*     */   }
/*     */   
/*     */   public void setStderrVariableName(String stderrVariableName) {
/* 210 */     this.stderrVariableName = stderrVariableName;
/*     */   }
/*     */   
/*     */   public boolean isUpdateStderrVariableLines() {
/* 214 */     return replaceWithTextOverride("updateStderrVariableLines", this.updateStderrVariableLines);
/*     */   }
/*     */   
/*     */   public void setUpdateStderrVariableLines(boolean updateStderrVariableLines) {
/* 218 */     this.updateStderrVariableLines = updateStderrVariableLines;
/*     */   }
/*     */   
/*     */   public File getStderrFile() {
/* 222 */     return (File)replaceWithTextOverride("stderrFile", replaceVariables(this.stderrFile), File.class);
/*     */   }
/*     */   
/*     */   public void setStderrFile(File stderrFile) {
/* 226 */     this.stderrFile = stderrFile;
/*     */   }
/*     */   
/*     */   public boolean isFailOnStderrFileError() {
/* 230 */     return replaceWithTextOverride("failOnStderrFileError", this.failOnStderrFileError);
/*     */   }
/*     */   
/*     */   public void setFailOnStderrFileError(boolean failOnStderrFileError) {
/* 234 */     this.failOnStderrFileError = failOnStderrFileError;
/*     */   }
/*     */   
/*     */   public InputRedirectionMode getStdinRedirectionMode() {
/* 238 */     return (InputRedirectionMode)replaceWithTextOverride("stdinRedirectionMode", this.stdinRedirectionMode, InputRedirectionMode.class);
/*     */   }
/*     */   
/*     */   public void setStdinRedirectionMode(InputRedirectionMode stdinRedirectionMode) {
/* 242 */     this.stdinRedirectionMode = stdinRedirectionMode;
/*     */   }
/*     */   
/*     */   public String getStdinString() {
/* 246 */     return replaceVariables(replaceVariables(this.stdinString));
/*     */   }
/*     */   
/*     */   public void setStdinString(String stdinString) {
/* 250 */     this.stdinString = stdinString;
/*     */   }
/*     */   
/*     */   public File getStdinFile() {
/* 254 */     return (File)replaceWithTextOverride("stdinFile", replaceVariables(this.stdinFile), File.class);
/*     */   }
/*     */   
/*     */   public void setStdinFile(File stdinFile) {
/* 258 */     this.stdinFile = stdinFile;
/*     */   }
/*     */   
/*     */   public boolean isFailOnStdinFileError() {
/* 262 */     return replaceWithTextOverride("failOnStdinFileError", this.failOnStdinFileError);
/*     */   }
/*     */   
/*     */   public void setFailOnStdinFileError(boolean failOnStdinFileError) {
/* 266 */     this.failOnStdinFileError = failOnStdinFileError;
/*     */   }
/*     */   
/*     */   public boolean isIncludeParentEnvironmentVariables() {
/* 270 */     return replaceWithTextOverride("includeParentEnvironmentVariables", this.includeParentEnvironmentVariables);
/*     */   }
/*     */   
/*     */   public void setIncludeParentEnvironmentVariables(boolean includeParentEnvironmentVariables) {
/* 274 */     this.includeParentEnvironmentVariables = includeParentEnvironmentVariables;
/*     */   }
/*     */   
/*     */   public Map<String, String> getEnvironmentVariables() {
/* 278 */     return (Map<String, String>)replaceWithTextOverride("environmentVariables", this.environmentVariables, Map.class);
/*     */   }
/*     */   
/*     */   public void setEnvironmentVariables(Map<String, String> environmentVariables) {
/* 282 */     this.environmentVariables = environmentVariables;
/*     */   }
/*     */   
/*     */   public boolean isShowWindowsConsole() {
/* 286 */     return replaceWithTextOverride("showWindowsConsole", this.showWindowsConsole);
/*     */   }
/*     */   
/*     */   public void setShowWindowsConsole(boolean showWindowsConsole) {
/* 290 */     this.showWindowsConsole = showWindowsConsole;
/*     */   }
/*     */   
/*     */   public boolean isKeepConsoleWindow() {
/* 294 */     return replaceWithTextOverride("keepConsoleWindow", this.keepConsoleWindow);
/*     */   }
/*     */   
/*     */   public void setKeepConsoleWindow(boolean keepConsoleWindow) {
/* 298 */     this.keepConsoleWindow = keepConsoleWindow;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object getLogValueForProperty(String propertyName, Object propertyValue) {
/* 303 */     if (Objects.equals(propertyName, "arguments") && !isLogArguments()) {
/* 304 */       return "[logging of arguments is disabled]";
/*     */     }
/* 306 */     return propertyValue;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean execute(Context context) throws UserCanceledException {
/* 312 */     return runExecutable(getExecutable(), getWorkingDirectory(), getArguments(), context);
/*     */   }
/*     */   
/*     */   private boolean runExecutable(File executable, File workingDirectory, String[] arguments, Context context) {
/* 316 */     File workingDir = context.getDestinationFile(workingDirectory);
/* 317 */     while (workingDir != null && !workingDir.exists()) {
/* 318 */       workingDir = workingDir.getParentFile();
/*     */     }
/*     */     
/* 321 */     Logger.getInstance().info(this, "used working dir: " + workingDir);
/* 322 */     File usedExecutable = getUsedExecutable(workingDir, context, executable);
/* 323 */     if (!usedExecutable.exists()) {
/* 324 */       Logger.getInstance().error(this, "executable does not exist: " + usedExecutable.getAbsolutePath());
/* 325 */       return false;
/*     */     } 
/*     */     
/* 328 */     OutputRedirection stdoutRedirection = new OutputRedirection(getStdoutRedirectionMode(), getStdoutVariableName(), isUpdateStdoutVariableLines(), getStdoutFile(), isFailOnStdoutFileError());
/* 329 */     OutputRedirection stderrRedirection = new OutputRedirection(getStderrRedirectionMode(), getStderrVariableName(), isUpdateStderrVariableLines(), getStderrFile(), isFailOnStderrFileError());
/* 330 */     InputRedirection stdinRedirection = new InputRedirection(getStdinRedirectionMode(), getStdinString(), getStdinFile(), isFailOnStdinFileError());
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
/*     */     
/* 345 */     LaunchDescriptor launchDescriptor = (new LaunchDescriptor(usedExecutable)).workingDirectory(workingDir).arguments(arguments).specificEnvironmentVariables(getEnvironmentVariables()).includeParentEnvironmentVariables(isIncludeParentEnvironmentVariables()).showWindowsConsole(isShowWindowsConsole()).keepConsoleWindow(isKeepConsoleWindow()).useNohup((!isWait() && !Util.isWindows() && !Util.isMacOS())).stdoutRedirection(stdoutRedirection).stderrRedirection(stderrRedirection).stdinRedirection(stdinRedirection).wait(isWait()).waitForStreams(isWaitForStreams()).timeout(getTimeout());
/*     */     
/* 347 */     if (Util.isMacOS() && HelperCommunication.getInstance().isElevatedHelper()) {
/* 348 */       launchDescriptor.suidRoot(true);
/*     */     }
/*     */ 
/*     */     
/* 352 */     Integer returnValue = LaunchHelper.launchApplication(launchDescriptor);
/* 353 */     if (returnValue == null) {
/* 354 */       return false;
/*     */     }
/*     */     
/* 357 */     if (isWait()) {
/* 358 */       int code = returnValue.intValue();
/* 359 */       if (getReturnCodeVariable().length() > 0) {
/* 360 */         context.setVariable(getReturnCodeVariable(), returnValue);
/*     */       }
/* 362 */       if (code != 0) {
/* 363 */         if (Boolean.getBoolean("install4j.returnCodeInfoLogging")) {
/* 364 */           Logger.getInstance().info(this, "return value is " + code);
/*     */         } else {
/* 366 */           Logger.getInstance().error(this, "return value is " + code);
/*     */         } 
/* 368 */         return false;
/*     */       } 
/*     */     } 
/* 371 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isRollbackSupported() {
/* 376 */     return isUseRollbackExecutable();
/*     */   }
/*     */ 
/*     */   
/*     */   public void rollback(InstallerContext context) {
/* 381 */     super.rollback(context);
/* 382 */     runExecutable(getRollbackExecutable(), getRollbackWorkingDirectory(), getRollbackArguments(), (Context)context);
/*     */   }
/*     */   
/*     */   private File getUsedExecutable(File workingDir, Context context, File executable) {
/* 386 */     File usedExecutable = maybeWithExtension(context.getDestinationFile(executable));
/* 387 */     if (!usedExecutable.exists() && 
/* 388 */       !executable.isAbsolute()) {
/* 389 */       File workingDirExecutable = maybeWithExtension(new File(workingDir, executable.getPath()));
/* 390 */       if (workingDirExecutable.exists()) {
/* 391 */         usedExecutable = workingDirExecutable;
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 396 */     return usedExecutable;
/*     */   }
/*     */   
/*     */   private File maybeWithExtension(File file) {
/* 400 */     if (Util.isWindows() && !file.exists() && !file.getPath().toLowerCase(Locale.ENGLISH).endsWith(".exe")) {
/* 401 */       File fileWithExtension = new File(file.getPath() + ".exe");
/* 402 */       if (fileWithExtension.exists()) {
/* 403 */         return fileWithExtension;
/*     */       }
/* 405 */       return file;
/*     */     } 
/*     */     
/* 408 */     return file;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\misc\RunExecutableAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */