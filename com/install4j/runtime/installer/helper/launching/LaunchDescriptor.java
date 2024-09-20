/*     */ package com.install4j.runtime.installer.helper.launching;
/*     */ 
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import java.io.File;
/*     */ import java.io.Serializable;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LaunchDescriptor
/*     */   implements Serializable
/*     */ {
/*     */   private File executable;
/*     */   private File workingDirectory;
/*     */   private String[] arguments;
/*     */   private boolean includeParentEnvironmentVariables = true;
/*     */   private Map<String, String> specificEnvironmentVariables;
/*     */   private boolean showWindowsConsole = false;
/*     */   private boolean keepConsoleWindow = false;
/*     */   private boolean useNohup = false;
/*     */   private OutputRedirection stdoutRedirection;
/*     */   private OutputRedirection stderrRedirection;
/*     */   private InputRedirection stdinRedirection;
/*     */   private boolean redirectErrorStream;
/*     */   private boolean wait = false;
/*     */   private boolean waitForStreams = false;
/*  30 */   private int timeout = 0;
/*     */   
/*     */   private boolean terminate = true;
/*     */   private Process process;
/*     */   private boolean receiveProcess = false;
/*     */   private boolean suidRoot;
/*  36 */   private ExecutionContext executionContext = ExecutionContext.SAME;
/*     */   private boolean attachWithNoBrowse;
/*     */   private boolean logReturnValue = true;
/*     */   
/*     */   public LaunchDescriptor(File executable) {
/*  41 */     this.executable = executable;
/*     */   }
/*     */   
/*     */   public File getExecutable() {
/*  45 */     return this.executable;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor executable(File executable) {
/*  49 */     this.executable = executable;
/*  50 */     return this;
/*     */   }
/*     */   
/*     */   public File getWorkingDirectory() {
/*  54 */     return this.workingDirectory;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor workingDirectory(File workingDirectory) {
/*  58 */     this.workingDirectory = replaceEmpty(workingDirectory);
/*  59 */     return this;
/*     */   }
/*     */   
/*     */   public String[] getArguments() {
/*  63 */     return this.arguments;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor arguments(List<String> arguments) {
/*  67 */     if (arguments == null) {
/*  68 */       this.arguments = null;
/*     */     } else {
/*  70 */       arguments(arguments.<String>toArray(new String[0]));
/*     */     } 
/*  72 */     return this;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor arguments(String... arguments) {
/*  76 */     if (arguments != null && (arguments.length == 0 || (arguments.length == 1 && (arguments[0] == null || arguments[0].length() == 0)))) {
/*  77 */       arguments = null;
/*     */     }
/*  79 */     this.arguments = arguments;
/*  80 */     return this;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor suidRoot(boolean suidRoot) {
/*  84 */     this.suidRoot = suidRoot;
/*  85 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isSuidRoot() {
/*  89 */     return this.suidRoot;
/*     */   }
/*     */   
/*     */   public boolean isUseNohup() {
/*  93 */     return this.useNohup;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor useNohup(boolean useNohup) {
/*  97 */     this.useNohup = useNohup;
/*  98 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isIncludeParentEnvironmentVariables() {
/* 102 */     return this.includeParentEnvironmentVariables;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor includeParentEnvironmentVariables(boolean includeParentEnvironmentVariables) {
/* 106 */     this.includeParentEnvironmentVariables = includeParentEnvironmentVariables;
/* 107 */     return this;
/*     */   }
/*     */   
/*     */   public Map<String, String> getSpecificEnvironmentVariables() {
/* 111 */     return this.specificEnvironmentVariables;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor specificEnvironmentVariables(Map<String, String> specificEnvironmentVariables) {
/* 115 */     this.specificEnvironmentVariables = specificEnvironmentVariables;
/* 116 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isShowWindowsConsole() {
/* 120 */     return this.showWindowsConsole;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor showWindowsConsole(boolean showWindowsConsole) {
/* 124 */     this.showWindowsConsole = showWindowsConsole;
/* 125 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isKeepConsoleWindow() {
/* 129 */     return this.keepConsoleWindow;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor keepConsoleWindow(boolean waitForWindowsConsole) {
/* 133 */     this.keepConsoleWindow = waitForWindowsConsole;
/* 134 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public OutputRedirection getUsedStdoutRedirection() {
/* 139 */     if (this.stdoutRedirection != null && this.stdoutRedirection.isStdOutFile()) {
/* 140 */       return OutputRedirection.INHERIT_REDIRECTION;
/*     */     }
/* 142 */     return this.stdoutRedirection;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor stdoutRedirection(OutputRedirection stdoutRedirection) {
/* 146 */     this.stdoutRedirection = stdoutRedirection;
/* 147 */     return this;
/*     */   }
/*     */   
/*     */   public OutputRedirection getUsedStderrRedirection() {
/* 151 */     if (this.stderrRedirection != null && this.stderrRedirection.isStdErrFile()) {
/* 152 */       return OutputRedirection.INHERIT_REDIRECTION;
/*     */     }
/* 154 */     return this.stderrRedirection;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor stderrRedirection(OutputRedirection stderrRedirection) {
/* 158 */     this.stderrRedirection = stderrRedirection;
/* 159 */     return this;
/*     */   }
/*     */   
/*     */   public InputRedirection getUsedStdinRedirection() {
/* 163 */     if (this.stdinRedirection != null && this.stdinRedirection.isStdInFile()) {
/* 164 */       return InputRedirection.INHERIT_REDIRECTION;
/*     */     }
/* 166 */     return this.stdinRedirection;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor stdinRedirection(InputRedirection stdinRedirection) {
/* 170 */     this.stdinRedirection = stdinRedirection;
/* 171 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isRedirectErrorStream() {
/* 175 */     return this.redirectErrorStream;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor redirectErrorStream(boolean redirectErrorStream) {
/* 179 */     this.redirectErrorStream = redirectErrorStream;
/* 180 */     return this;
/*     */   }
/*     */   
/*     */   private File replaceEmpty(File file) {
/* 184 */     if (file != null && file.getPath().length() == 0) {
/* 185 */       return null;
/*     */     }
/* 187 */     return file;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isWait() {
/* 192 */     return this.wait;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor wait(boolean wait) {
/* 196 */     this.wait = wait;
/* 197 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isWaitForStreams() {
/* 201 */     return this.waitForStreams;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor waitForStreams(boolean waitForStreams) {
/* 205 */     this.waitForStreams = waitForStreams;
/* 206 */     return this;
/*     */   }
/*     */   
/*     */   public int getTimeout() {
/* 210 */     return this.timeout;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor timeout(int timeout) {
/* 214 */     this.timeout = timeout;
/* 215 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isTerminate() {
/* 219 */     return this.terminate;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor terminate(boolean terminate) {
/* 223 */     this.terminate = terminate;
/* 224 */     return this;
/*     */   }
/*     */   
/*     */   public Process getProcess() {
/* 228 */     return this.process;
/*     */   }
/*     */   
/*     */   public void setProcess(Process process) {
/* 232 */     this.process = process;
/*     */   }
/*     */   
/*     */   public boolean isReceiveProcess() {
/* 236 */     return this.receiveProcess;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor receiveProcess(boolean receiveProcess) {
/* 240 */     this.receiveProcess = receiveProcess;
/* 241 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isLogReturnValue() {
/* 245 */     return this.logReturnValue;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor logReturnValue(boolean logReturnValue) {
/* 249 */     this.logReturnValue = logReturnValue;
/* 250 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 255 */     return "LaunchDescriptor{executable=" + this.executable + ", workingDirectory=" + this.workingDirectory + ", arguments=" + (
/*     */ 
/*     */       
/* 258 */       (this.arguments == null) ? null : (String)Arrays.<String>asList(this.arguments)) + ", suidRoot=" + this.suidRoot + ", includeParentEnvironmentVariables=" + this.includeParentEnvironmentVariables + ", specificEnvironmentVariables=" + this.specificEnvironmentVariables + ", showWindowsConsole=" + this.showWindowsConsole + ", keepConsoleWindow=" + this.keepConsoleWindow + ", useNohup=" + this.useNohup + ", stdoutRedirection=" + this.stdoutRedirection + ", stderrRedirection=" + this.stderrRedirection + ", stdinRedirection=" + this.stdinRedirection + ", redirectErrorStream=" + this.redirectErrorStream + ", wait=" + this.wait + ", process=" + this.process + ", receiveProcess=" + this.receiveProcess + ", executionContext=" + this.executionContext + '}';
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
/*     */ 
/*     */ 
/*     */   
/*     */   public LaunchDescriptor executionContext(ExecutionContext executionContext) {
/* 277 */     this.executionContext = executionContext;
/* 278 */     return this;
/*     */   }
/*     */   
/*     */   public ExecutionContext getExecutionContext() {
/* 282 */     return this.executionContext;
/*     */   }
/*     */   
/*     */   public LaunchDescriptor attachWithNoBrowse(boolean attachWithNoBrowse) {
/* 286 */     this.attachWithNoBrowse = attachWithNoBrowse;
/* 287 */     return this;
/*     */   }
/*     */   
/*     */   public boolean isAttachWithNoBrowse() {
/* 291 */     return this.attachWithNoBrowse;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\launching\LaunchDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */