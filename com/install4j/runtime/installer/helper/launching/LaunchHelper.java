/*     */ package com.install4j.runtime.installer.helper.launching;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.runtime.installer.ContextImpl;
/*     */ import com.install4j.runtime.installer.ContextInt;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.helper.EnvironmentUtil;
/*     */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*     */ import com.install4j.runtime.installer.helper.Logger;
/*     */ import com.install4j.runtime.installer.helper.PreferencesUtil;
/*     */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchObjectAction;
/*     */ import com.install4j.runtime.installer.helper.versionspecific.VersionSpecificHelper;
/*     */ import com.install4j.runtime.installer.platform.macos.MacFileSystem;
/*     */ import com.install4j.runtime.installer.platform.macos.VolumeInfo;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import java.io.BufferedOutputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.PrintWriter;
/*     */ import java.nio.charset.CharsetEncoder;
/*     */ import java.nio.charset.StandardCharsets;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collections;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.prefs.BackingStoreException;
/*     */ import java.util.prefs.Preferences;
/*     */ 
/*     */ public class LaunchHelper {
/*  41 */   private static final char[] SPECIAL_BATCH_FILE_CHARACTERS = new char[] { ' ', '&', '(', ')', '[', ']', '{', '}', '^', '=', ';', '!', '+', '`', '´', '~', '<', '>', '@', '|' };
/*     */   
/*     */   public static final long LAUNCH_EXIT_DELTA_TIME = 10000L;
/*     */   public static final int RETURN_VALUE_TIMEOUT = -10000;
/*  45 */   private static final char[] SPECIAL_ARGUMENTS_CHARACTERS = new char[] { ' ', '&', '^', '`', '´', '<', '>', '@', '|' };
/*     */   
/*     */   public static final String PROPNAME_DEBUG_LAUNCH = "install4j.debugLaunch";
/*     */   
/*  49 */   private static final boolean DEBUG = Boolean.getBoolean("install4j.debugLaunch");
/*     */   
/*     */   public static final String PROPNAME_NO_SUID = "install4j.noSuid";
/*     */   private static long lastLaunchTime;
/*     */   
/*     */   public static long getLastLaunchTime() {
/*  55 */     return lastLaunchTime;
/*     */   }
/*     */   
/*     */   static {
/*  59 */     Arrays.sort(SPECIAL_BATCH_FILE_CHARACTERS);
/*  60 */     Arrays.sort(SPECIAL_ARGUMENTS_CHARACTERS);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean launchFinishExecutable(File launcherFile, String[] arguments, File workingDirectory, ExecutionContext executionContext) {
/*     */     Integer ret;
/*  68 */     if (Util.isWindows() || Util.isMacOS()) {
/*  69 */       ret = launchApplication((new LaunchDescriptor(launcherFile)).workingDirectory(workingDirectory).arguments(arguments).executionContext(executionContext));
/*     */     } else {
/*  71 */       ret = launchApplication((new LaunchDescriptor(new File("/bin/sh"))).workingDirectory(workingDirectory).arguments(new String[] { "-c", "nohup \"" + (
/*  72 */               launcherFile.exists() ? launcherFile.getAbsolutePath() : launcherFile.getPath()) + "\" " + StringUtil.makeCommandLine(arguments) + " > /dev/null 2>&1" }));
/*     */     } 
/*     */     
/*  75 */     if (ret != null) {
/*  76 */       lastLaunchTime = System.currentTimeMillis();
/*     */     }
/*  78 */     return (ret != null);
/*     */   }
/*     */   
/*     */   public static Integer launchApplication(LaunchDescriptor launchDescriptor) {
/*  82 */     LaunchResult launchResult = launchApplicationWithResult(launchDescriptor);
/*  83 */     if (launchResult == null) {
/*  84 */       return null;
/*     */     }
/*  86 */     return Integer.valueOf(launchResult.getReturnCode());
/*     */   }
/*     */ 
/*     */   
/*     */   private static void syncPreferences() {
/*  91 */     HelperCommunication.getInstance().executeAction(ExecutionContext.ALL, (CommunicationAction)new HelperCommunication.DirectRunAction()
/*     */         {
/*     */           protected void run(Context context) throws Exception {
/*  94 */             if (!PreferencesUtil.isDisableSystemRoot()) {
/*     */               try {
/*  96 */                 Preferences.systemRoot().sync();
/*  97 */               } catch (BackingStoreException backingStoreException) {}
/*     */             }
/*     */             
/*     */             try {
/* 101 */               Preferences.userRoot().sync();
/* 102 */             } catch (BackingStoreException backingStoreException) {}
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static LaunchResult launchApplicationWithResult(final LaunchDescriptor launchDescriptor) {
/* 109 */     HelperCommunication helperCommunication = HelperCommunication.getInstance();
/* 110 */     return (LaunchResult)helperCommunication.fetchObject(launchDescriptor.getExecutionContext(), new FetchObjectAction<LaunchResult>()
/*     */         {
/*     */           protected LaunchHelper.LaunchResult fetchValue(Context context) throws Exception {
/* 113 */             return LaunchHelper.launchApplicationDirectly(launchDescriptor);
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   private static LaunchResult launchApplicationDirectly(LaunchDescriptor launchDescriptor) {
/* 119 */     if (DEBUG) {
/* 120 */       Util.logInfo(null, launchDescriptor.toString());
/*     */     }
/* 122 */     File executable = launchDescriptor.getExecutable();
/* 123 */     Map<String, String> environment = getEnvironmentVariables(launchDescriptor.getSpecificEnvironmentVariables(), launchDescriptor.isIncludeParentEnvironmentVariables());
/*     */     
/*     */     try {
/* 126 */       if (executable == null) {
/* 127 */         Logger.getInstance().error(null, "executable is null");
/*     */       } else {
/* 129 */         Process process = null;
/* 130 */         OutputStream outputRedirectStream = null;
/* 131 */         OutputStream errorRedirectStream = null;
/* 132 */         InputStream inputRedirectStream = null;
/* 133 */         LaunchResult launchResult = new LaunchResult();
/*     */         try {
/* 135 */           outputRedirectStream = createOutputStream(launchDescriptor.getUsedStdoutRedirection(), "stdout", launchResult, false);
/* 136 */           errorRedirectStream = createOutputStream(launchDescriptor.getUsedStderrRedirection(), "stderr", launchResult, true);
/* 137 */           inputRedirectStream = createInputStream(launchDescriptor.getUsedStdinRedirection());
/* 138 */         } catch (IOException e) {
/*     */           
/* 140 */           closeStreams(inputRedirectStream, outputRedirectStream, errorRedirectStream);
/* 141 */           return null;
/*     */         } 
/*     */         
/* 144 */         if (InstallerUtil.isMacOS()) {
/* 145 */           process = launchOnMacOS(launchDescriptor);
/*     */         }
/* 147 */         else if (!executable.exists() || executable.isFile()) {
/* 148 */           launchDescriptor.useNohup((launchDescriptor.isUseNohup() && outputRedirectStream == null && errorRedirectStream == null && inputRedirectStream == null));
/*     */           
/* 150 */           String executablePath = executable.exists() ? executable.getAbsolutePath() : executable.getPath();
/* 151 */           if (Util.isWindows() && (executablePath.toLowerCase(Locale.ENGLISH).endsWith(".bat") || executablePath
/* 152 */             .toLowerCase(Locale.ENGLISH).endsWith(".cmd") || Util.isAtLeastWindowsVista() || launchDescriptor.isShowWindowsConsole())) {
/*     */             
/* 154 */             process = launchOnWindows(launchDescriptor, executablePath, environment);
/*     */           } else {
/* 156 */             process = launchOtherwise(launchDescriptor, executablePath, environment);
/*     */           } 
/*     */           
/*     */           try {
/* 160 */             Thread.sleep(500L);
/* 161 */           } catch (InterruptedException e) {
/* 162 */             e.printStackTrace();
/*     */           }
/*     */         
/*     */         } else {
/*     */           
/* 167 */           Logger.getInstance().error(null, "executable is not a file: " + executable);
/*     */         } 
/*     */ 
/*     */         
/* 171 */         if (process == null) {
/* 172 */           Logger.getInstance().error(LaunchHelper.class, "process could not be created");
/* 173 */           closeStreams(inputRedirectStream, outputRedirectStream, errorRedirectStream);
/* 174 */           return null;
/*     */         } 
/*     */         
/* 177 */         if (launchDescriptor.getUsedStdoutRedirection() != null && launchDescriptor.getUsedStdoutRedirection().getRedirectionMode() != OutputRedirectionMode.INHERIT) {
/* 178 */           (new ConsumerThread(process.getInputStream(), outputRedirectStream)).start();
/*     */         }
/* 180 */         if (launchDescriptor.getUsedStderrRedirection() != null && launchDescriptor.getUsedStderrRedirection().getRedirectionMode() != OutputRedirectionMode.INHERIT) {
/* 181 */           (new ConsumerThread(process.getErrorStream(), errorRedirectStream)).start();
/*     */         }
/* 183 */         if (inputRedirectStream != null) {
/* 184 */           (new WriterThread(process.getOutputStream(), inputRedirectStream, inputRedirectStream instanceof UncloseableInputStream)).start();
/*     */         }
/*     */         
/* 187 */         if (launchDescriptor.isReceiveProcess()) {
/* 188 */           launchDescriptor.setProcess(process);
/*     */         }
/*     */         
/* 191 */         if (!launchDescriptor.isWait()) {
/* 192 */           return launchResult.returnCode(1);
/*     */         }
/*     */         
/* 195 */         boolean timeoutOccurred = true;
/*     */         try {
/* 197 */           int retVal = VersionSpecificHelper.waitForOrTerminate(process, launchDescriptor.getTimeout(), launchDescriptor.isTerminate());
/* 198 */           timeoutOccurred = (retVal == -10000);
/* 199 */           syncPreferences();
/* 200 */           if (retVal != 0 && 
/* 201 */             launchDescriptor.isLogReturnValue()) {
/* 202 */             Logger.getInstance().info(LaunchHelper.class, "return value is " + retVal);
/*     */           }
/*     */           
/* 205 */           return launchResult.returnCode(retVal);
/* 206 */         } catch (InterruptedException e) {
/*     */           
/* 208 */           Logger.getInstance().info(LaunchHelper.class, e.toString());
/* 209 */           e.printStackTrace();
/* 210 */           return null;
/*     */         } finally {
/* 212 */           if (launchDescriptor.isWait() && launchDescriptor.isWaitForStreams() && !timeoutOccurred && !Util.isMacOS()) {
/* 213 */             waitForStream(process.getInputStream());
/* 214 */             waitForStream(process.getErrorStream());
/*     */           } 
/* 216 */           closeStreams(inputRedirectStream, outputRedirectStream, errorRedirectStream);
/*     */         }
/*     */       
/*     */       } 
/* 220 */     } catch (IOException e) {
/*     */       try {
/* 222 */         Logger.getInstance().error(LaunchHelper.class, e.getMessage());
/* 223 */       } catch (Exception exception) {}
/*     */     } 
/*     */     
/* 226 */     return null;
/*     */   }
/*     */   
/*     */   private static void waitForStream(InputStream inputStream) {
/*     */     try {
/* 231 */       for (int i = 0; i < 10; i++) {
/* 232 */         if (inputStream.available() > 0) {
/* 233 */           Thread.sleep(100L);
/*     */         } else {
/*     */           return;
/*     */         } 
/*     */       } 
/* 238 */     } catch (Throwable throwable) {}
/*     */   }
/*     */ 
/*     */   
/*     */   private static Process launchOnMacOS(LaunchDescriptor launchDescriptor) throws IOException {
/* 243 */     File executable = launchDescriptor.getExecutable();
/*     */     
/* 245 */     executable = checkDmg(executable, launchDescriptor.isAttachWithNoBrowse());
/* 246 */     if (executable == null) {
/* 247 */       return null;
/*     */     }
/*     */     
/* 250 */     if (executable.isDirectory()) {
/* 251 */       List<String> args = new ArrayList<>();
/* 252 */       if (launchDescriptor.isReceiveProcess() || launchDescriptor.isWait()) {
/* 253 */         args.add("-W");
/*     */       }
/* 255 */       args.add(executable.getAbsolutePath());
/* 256 */       if (launchDescriptor.getArguments() != null) {
/* 257 */         args.add("--args");
/* 258 */         Collections.addAll(args, launchDescriptor.getArguments());
/*     */       } 
/* 260 */       launchDescriptor.arguments(args.<String>toArray(new String[0]));
/* 261 */       executable = new File("/usr/bin/open");
/*     */     } 
/*     */     
/* 264 */     File scriptFile = createMacStartScript(launchDescriptor, executable);
/* 265 */     if (DEBUG) {
/* 266 */       Util.logInfo(null, "script file: " + scriptFile);
/* 267 */       Util.logInfo(null, "script file exists: " + scriptFile.exists());
/* 268 */       Util.logInfo(null, "script file contents: " + InstallerUtil.readTextFile(scriptFile, StandardCharsets.UTF_8.name()));
/*     */     } 
/*     */     
/* 271 */     List<String> cmd = new ArrayList<>();
/*     */     
/* 273 */     cmd.add("/bin/sh");
/* 274 */     cmd.add(scriptFile.getAbsolutePath());
/*     */     
/* 276 */     Process process = createProcessBuilder(cmd, null, launchDescriptor).start();
/*     */     
/*     */     try {
/* 279 */       Thread.sleep(500L);
/* 280 */     } catch (InterruptedException e) {
/* 281 */       e.printStackTrace();
/*     */     } 
/* 283 */     return process;
/*     */   }
/*     */ 
/*     */   
/*     */   private static File createMacStartScript(LaunchDescriptor launchDescriptor, File executable) throws IOException {
/* 288 */     String[] arguments = launchDescriptor.getArguments();
/*     */     
/* 290 */     File scriptFile = File.createTempFile("i4j", ".sh", null);
/* 291 */     PrintWriter pw = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(scriptFile)), StandardCharsets.UTF_8));
/*     */ 
/*     */     
/* 294 */     pw.println("#!/bin/sh");
/* 295 */     if (launchDescriptor.getWorkingDirectory() != null) {
/* 296 */       pw.println("old_pwd=`pwd`");
/* 297 */       pw.println("cd \"" + launchDescriptor.getWorkingDirectory() + "\"");
/*     */     } 
/* 299 */     if (launchDescriptor.getSpecificEnvironmentVariables() != null) {
/* 300 */       for (Map.Entry<String, String> entry : launchDescriptor.getSpecificEnvironmentVariables().entrySet()) {
/* 301 */         pw.println(InstallerVariables.replaceVariables(entry.getKey()) + "=\"" + InstallerVariables.replaceVariables(entry.getValue()) + "\"");
/* 302 */         pw.println("export " + (String)entry.getKey());
/*     */       } 
/*     */     }
/*     */     
/* 306 */     if (launchDescriptor.isSuidRoot() && (UnixUserInfo.ROOT_USER || HelperCommunication.getInstance().isElevatedHelper()) && Util.isMacOS()) {
/* 307 */       boolean fromService = Boolean.getBoolean("install4j.fromService");
/* 308 */       boolean noSuid = Boolean.getBoolean("install4j.noSuid");
/* 309 */       Logger.getExistingInstance().info(null, "SUID elevation: " + (!fromService ? 1 : 0) + ", " + (!noSuid ? 1 : 0));
/* 310 */       if (!fromService && !noSuid) {
/* 311 */         File elevationUtil = InstallerUtil.getInstallerFile("install4j");
/* 312 */         if (elevationUtil.exists()) {
/* 313 */           pw.print("\"" + elevationUtil.getAbsolutePath() + "\" __i4j_setuid ");
/*     */         }
/*     */       } 
/*     */     } 
/* 317 */     pw.print("\"" + executable.getAbsolutePath() + "\"");
/* 318 */     if (arguments != null) {
/* 319 */       for (String argument : arguments) {
/* 320 */         pw.print(" \"" + argument + "\"");
/*     */       }
/*     */     }
/* 323 */     pw.println();
/* 324 */     pw.println("exitCode=$?");
/* 325 */     if (launchDescriptor.getWorkingDirectory() != null) {
/* 326 */       pw.println("  cd \"$old_pwd\"");
/*     */     }
/* 328 */     pw.println("rm \"$0\"");
/* 329 */     pw.println("exit $exitCode");
/* 330 */     pw.close();
/*     */     
/* 332 */     return scriptFile;
/*     */   }
/*     */   
/*     */   private static Process launchOnWindows(LaunchDescriptor launchDescriptor, String executablePath, Map<String, String> environmentVariables) throws IOException {
/* 336 */     List<String> cmdArray = new ArrayList<>();
/*     */     
/* 338 */     if (DEBUG) {
/* 339 */       Util.logInfo(null, "executable path: " + executablePath);
/*     */     }
/* 341 */     String shortPathName = executablePath;
/*     */     try {
/* 343 */       shortPathName = FolderInfo.getShortPathName(executablePath);
/* 344 */     } catch (Throwable throwable) {}
/* 345 */     if (DEBUG) {
/* 346 */       Util.logInfo(null, "short executable path: " + shortPathName);
/*     */     }
/*     */     
/* 349 */     boolean showConsole = launchDescriptor.isShowWindowsConsole();
/* 350 */     if (showConsole || !isExe(launchDescriptor)) {
/* 351 */       Logger.getExistingInstance().info(null, "execute using batch file");
/*     */       try {
/* 353 */         cmdArray.add((new File(WinFileSystem.getSystemDirectory(), "cmd.exe")).getAbsolutePath());
/* 354 */       } catch (NoClassDefFoundError|UnsatisfiedLinkError e) {
/* 355 */         cmdArray.add("cmd.exe");
/*     */       } 
/* 357 */       cmdArray.add("/D");
/*     */       
/* 359 */       if (showConsole && launchDescriptor.isKeepConsoleWindow()) {
/* 360 */         cmdArray.add("/K");
/*     */       } else {
/* 362 */         cmdArray.add("/C");
/*     */       } 
/*     */       
/* 365 */       File tempFile = createWindowsStartScript(launchDescriptor, shortPathName);
/* 366 */       cmdArray.add(tempFile.getAbsolutePath().replace("&", "^&"));
/* 367 */       if (showConsole) {
/* 368 */         StringBuilder buffer = new StringBuilder();
/* 369 */         buffer.append("start \"");
/* 370 */         buffer.append(executablePath);
/* 371 */         buffer.append("\" /WAIT ");
/* 372 */         for (int i = 0; i < cmdArray.size(); i++) {
/* 373 */           String argument = cmdArray.get(i);
/* 374 */           if (needsQuotes(argument, false)) {
/* 375 */             buffer.append('"').append(argument).append('"');
/*     */           } else {
/* 377 */             buffer.append(argument);
/*     */           } 
/* 379 */           if (i < cmdArray.size() - 1) {
/* 380 */             buffer.append(" ");
/*     */           }
/*     */         } 
/* 383 */         return createProcessBuilder(Arrays.asList(new String[] { "cmd.exe", "/D", "/C", buffer.toString() }, ), environmentVariables, launchDescriptor).start();
/*     */       } 
/* 385 */       return createProcessBuilder(cmdArray, environmentVariables, launchDescriptor).start();
/*     */     } 
/*     */     
/* 388 */     Logger.getExistingInstance().info(null, "execute directly");
/* 389 */     cmdArray.add(executablePath);
/* 390 */     String[] arguments = launchDescriptor.getArguments();
/* 391 */     if (arguments != null) {
/* 392 */       Collections.addAll(cmdArray, arguments);
/*     */     }
/* 394 */     return createProcessBuilder(cmdArray, environmentVariables, launchDescriptor).start();
/*     */   }
/*     */ 
/*     */   
/*     */   private static File createWindowsStartScript(LaunchDescriptor launchDescriptor, String executablePath) throws IOException {
/* 399 */     File tempFile = File.createTempFile("i4j", ".bat");
/* 400 */     PrintWriter pw = new PrintWriter(new FileOutputStream(tempFile));
/* 401 */     pw.println("@ECHO OFF");
/* 402 */     pw.print("\"" + executablePath + "\"");
/*     */     
/* 404 */     boolean isExe = isExe(launchDescriptor);
/* 405 */     String[] arguments = launchDescriptor.getArguments();
/* 406 */     if (arguments != null) {
/* 407 */       for (String argument : arguments) {
/* 408 */         argument = StringUtil.replace(argument, "%", "%%");
/* 409 */         if (needsQuotes(argument, isExe)) {
/* 410 */           pw.print(" \"" + argument + "\"");
/*     */         } else {
/* 412 */           pw.print(" " + argument);
/*     */         } 
/*     */       } 
/*     */     }
/* 416 */     pw.println();
/* 417 */     pw.close();
/* 418 */     if (DEBUG) {
/* 419 */       List<String> lines = Files.readAllLines(tempFile.toPath());
/* 420 */       Util.logInfo(null, "Start script content: " + lines);
/*     */     } 
/* 422 */     InstallerUtil.deleteOnExit(tempFile);
/* 423 */     return tempFile;
/*     */   }
/*     */   
/*     */   private static boolean isExe(LaunchDescriptor launchDescriptor) {
/* 427 */     return launchDescriptor.getExecutable().getName().toLowerCase(Locale.ENGLISH).endsWith(".exe");
/*     */   }
/*     */   
/*     */   private static boolean isAsciiOnly(String[] strings) {
/* 431 */     if (strings != null) {
/* 432 */       CharsetEncoder charsetEncoder = StandardCharsets.US_ASCII.newEncoder();
/* 433 */       for (String string : strings) {
/* 434 */         if (!charsetEncoder.canEncode(string)) {
/* 435 */           return false;
/*     */         }
/*     */       } 
/*     */     } 
/* 439 */     return true;
/*     */   }
/*     */   
/*     */   private static boolean needsQuotes(String argument, boolean isExe) {
/* 443 */     if (argument.startsWith("\"")) {
/* 444 */       return false;
/*     */     }
/* 446 */     int charCount = argument.length();
/* 447 */     for (int i = 0; i < charCount; i++) {
/* 448 */       char c = argument.charAt(i);
/* 449 */       if (c < ' ' || c > 'z' || Arrays.binarySearch(isExe ? SPECIAL_ARGUMENTS_CHARACTERS : SPECIAL_BATCH_FILE_CHARACTERS, c) >= 0) {
/* 450 */         return true;
/*     */       }
/*     */     } 
/* 453 */     return false;
/*     */   }
/*     */   
/*     */   private static Process launchOtherwise(LaunchDescriptor launchDescriptor, String executablePath, Map<String, String> environment) throws IOException {
/* 457 */     List<String> cmdArray = new ArrayList<>();
/*     */     
/* 459 */     if (launchDescriptor.isUseNohup()) {
/* 460 */       cmdArray.add("/bin/sh");
/* 461 */       cmdArray.add("-c");
/* 462 */       cmdArray.add("nohup \"" + executablePath + "\" " + StringUtil.makeCommandLine(launchDescriptor.getArguments()) + " > /dev/null 2>&1");
/*     */     } else {
/* 464 */       cmdArray.add(executablePath);
/* 465 */       String[] arguments = launchDescriptor.getArguments();
/* 466 */       if (arguments != null) {
/* 467 */         cmdArray.addAll(Arrays.asList(arguments));
/*     */       }
/*     */     } 
/*     */     
/* 471 */     return createProcessBuilder(cmdArray, environment, launchDescriptor).start();
/*     */   }
/*     */   
/*     */   private static ProcessBuilder createProcessBuilder(List<String> cmdArray, Map<String, String> environment, LaunchDescriptor launchDescriptor) {
/* 475 */     if (DEBUG) {
/* 476 */       Util.logInfo(null, "execute " + cmdArray);
/*     */     }
/* 478 */     ProcessBuilder processBuilder = (new ProcessBuilder(cmdArray)).directory(launchDescriptor.getWorkingDirectory());
/* 479 */     if (launchDescriptor.getUsedStdoutRedirection() != null && launchDescriptor.getUsedStdoutRedirection().getRedirectionMode() == OutputRedirectionMode.INHERIT) {
/* 480 */       processBuilder.redirectOutput(ProcessBuilder.Redirect.INHERIT);
/*     */     }
/* 482 */     if (launchDescriptor.getUsedStderrRedirection() != null && launchDescriptor.getUsedStderrRedirection().getRedirectionMode() == OutputRedirectionMode.INHERIT) {
/* 483 */       processBuilder.redirectError(ProcessBuilder.Redirect.INHERIT);
/*     */     }
/* 485 */     if (launchDescriptor.getUsedStdinRedirection() != null && launchDescriptor.getUsedStdinRedirection().getRedirectionMode() == InputRedirectionMode.INHERIT) {
/* 486 */       processBuilder.redirectInput(ProcessBuilder.Redirect.INHERIT);
/*     */     }
/* 488 */     if (launchDescriptor.isRedirectErrorStream()) {
/* 489 */       processBuilder.redirectErrorStream(true);
/*     */     }
/* 491 */     if (environment != null) {
/* 492 */       Map<String, String> actualEnvironment = processBuilder.environment();
/* 493 */       actualEnvironment.clear();
/* 494 */       actualEnvironment.putAll(environment);
/*     */     } 
/* 496 */     return processBuilder;
/*     */   }
/*     */   
/*     */   private static Map<String, String> getEnvironmentVariables(Map<String, String> specificEnvironmentVariables, boolean includeParentEnvironmentVariables) {
/* 500 */     if (specificEnvironmentVariables == null || specificEnvironmentVariables.isEmpty()) {
/* 501 */       if (includeParentEnvironmentVariables) {
/* 502 */         return null;
/*     */       }
/* 504 */       return Collections.emptyMap();
/*     */     } 
/*     */     
/* 507 */     Map<String, String> parentVariables = System.getenv();
/* 508 */     Map<String, String> uppercaseParentVariables = EnvironmentUtil.getUpperCaseVariables(parentVariables);
/* 509 */     Map<String, String> environment = new LinkedHashMap<>();
/* 510 */     Set<String> processedNames = new HashSet<>();
/* 511 */     boolean windows = InstallerUtil.isWindows();
/* 512 */     for (Map.Entry<String, String> entry : specificEnvironmentVariables.entrySet()) {
/* 513 */       String name = InstallerVariables.replaceVariables(entry.getKey());
/* 514 */       String value = InstallerVariables.replaceVariables(entry.getValue());
/* 515 */       processedNames.add(windows ? name.toUpperCase(Locale.ENGLISH) : name);
/* 516 */       environment.put(name, EnvironmentUtil.replaceEnvironmentVariables(value, windows ? uppercaseParentVariables : parentVariables));
/*     */     } 
/* 518 */     if (includeParentEnvironmentVariables) {
/* 519 */       for (Map.Entry<String, String> entry : parentVariables.entrySet()) {
/* 520 */         String name = entry.getKey();
/* 521 */         String value = entry.getValue();
/* 522 */         if (!processedNames.contains(windows ? name.toUpperCase(Locale.ENGLISH) : name)) {
/* 523 */           environment.put(name, value);
/*     */         }
/*     */       } 
/*     */     }
/* 527 */     return environment;
/*     */   }
/*     */ 
/*     */   
/*     */   public static File checkDmg(File executable, boolean noBrowse) throws IOException {
/* 532 */     executable = executable.getCanonicalFile();
/* 533 */     if (executable.getName().endsWith(".dmg")) {
/* 534 */       File mountPoint = VolumeInfo.attachDmg(executable, noBrowse);
/* 535 */       if (mountPoint == null) {
/* 536 */         mountPoint = VolumeInfo.findAttachedDmg(executable);
/*     */       }
/* 538 */       if (mountPoint != null) {
/* 539 */         File[] files = mountPoint.listFiles();
/* 540 */         if (files != null) {
/* 541 */           File file = findExecutableFile(files);
/* 542 */           if (file != null && file.isDirectory()) {
/*     */             try {
/* 544 */               MacFileSystem.notifyBundleChange(file);
/* 545 */             } catch (Throwable t) {
/* 546 */               Logger.getInstance().log(t);
/*     */             } 
/*     */           }
/* 549 */           return file;
/*     */         } 
/* 551 */         Logger.getInstance().error(null, "could not list files in " + mountPoint);
/* 552 */         return null;
/*     */       } 
/*     */       
/* 555 */       return null;
/*     */     } 
/*     */     
/* 558 */     return executable;
/*     */   }
/*     */ 
/*     */   
/*     */   public static File findExecutableFile(File[] files) {
/* 563 */     if (files != null) {
/* 564 */       for (File file : files) {
/* 565 */         if (file.isDirectory() && file.getName().endsWith(".app")) {
/* 566 */           Logger.getInstance().info(null, "mounted bundle is " + file);
/* 567 */           if (Objects.equals("_unknown:_unknown", LegacyUnixFileSystem.getOwnerInfo(file))) {
/* 568 */             File macDir = new File(file, "Contents/MacOS");
/* 569 */             if (macDir.isDirectory()) {
/*     */               
/* 571 */               File[] macFiles = macDir.listFiles();
/* 572 */               if (macFiles != null) {
/* 573 */                 for (File macFile : macFiles) {
/* 574 */                   if (macFile.isFile() && !macFile.getName().startsWith(".")) {
/* 575 */                     Logger.getInstance().info(null, "mounted as root, using executable " + macFile + ".");
/* 576 */                     return macFile;
/*     */                   } 
/*     */                 } 
/*     */               }
/*     */             } 
/*     */           } 
/*     */           
/* 583 */           return file;
/*     */         } 
/*     */       } 
/*     */     }
/* 587 */     Logger.getInstance().error(null, "could not find app bundle");
/* 588 */     return null;
/*     */   }
/*     */   
/*     */   private static void closeStreams(InputStream inputRedirectStream, OutputStream outputRedirectStream, OutputStream errorRedirectStream) {
/*     */     try {
/* 593 */       if (inputRedirectStream != null) {
/* 594 */         inputRedirectStream.close();
/*     */       }
/* 596 */     } catch (IOException iOException) {}
/*     */     
/*     */     try {
/* 599 */       if (outputRedirectStream != null) {
/* 600 */         outputRedirectStream.close();
/*     */       }
/* 602 */     } catch (IOException iOException) {}
/*     */     
/*     */     try {
/* 605 */       if (errorRedirectStream != null) {
/* 606 */         errorRedirectStream.close();
/*     */       }
/* 608 */     } catch (IOException iOException) {}
/*     */   }
/*     */ 
/*     */   
/*     */   private static OutputStream createOutputStream(OutputRedirection outputRedirection, String streamName, LaunchResult launchResult, boolean error) throws IOException {
/* 613 */     if (outputRedirection != null) {
/* 614 */       OutputRedirectionMode redirectionMode = outputRedirection.getRedirectionMode();
/* 615 */       if (redirectionMode == OutputRedirectionMode.FILE)
/* 616 */         return createFileOutputStream(outputRedirection); 
/* 617 */       if (redirectionMode == OutputRedirectionMode.VARIABLE || redirectionMode == OutputRedirectionMode.LOG_FILE) {
/* 618 */         return createStringOutputStream(outputRedirection, streamName, launchResult, error);
/*     */       }
/*     */     } 
/* 621 */     return null;
/*     */   }
/*     */   
/*     */   private static OutputStream createFileOutputStream(OutputRedirection outputRedirection) throws IOException {
/* 625 */     if (outputRedirection != null) {
/* 626 */       if (outputRedirection.isStdOutFile()) {
/* 627 */         return new UncloseableOutputStream(System.out);
/*     */       }
/* 629 */       if (outputRedirection.isStdErrFile()) {
/* 630 */         return new UncloseableOutputStream(System.err);
/*     */       }
/* 632 */       File file = outputRedirection.getFile();
/* 633 */       if (file != null) {
/*     */         try {
/* 635 */           return new BufferedOutputStream(new FileOutputStream(file));
/* 636 */         } catch (IOException e) {
/* 637 */           Logger.getInstance().error(LaunchHelper.class, "output file " + file.getPath() + " could not be created");
/* 638 */           if (outputRedirection.isFailOnFileError()) {
/* 639 */             throw e;
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/* 644 */     return null;
/*     */   }
/*     */   
/*     */   private static OutputStream createStringOutputStream(final OutputRedirection outputRedirection, final String streamName, final LaunchResult launchResult, final boolean error) {
/* 648 */     final OutputRedirectionMode redirectionMode = outputRedirection.getRedirectionMode();
/* 649 */     if (redirectionMode == OutputRedirectionMode.VARIABLE) {
/* 650 */       ContextInt context = ContextImpl.getSingleContextInt();
/* 651 */       if (context != null) {
/* 652 */         String variableName = outputRedirection.getVariableName();
/* 653 */         context.registerHiddenVariable(variableName);
/*     */       } 
/*     */     } 
/* 656 */     return new ByteArrayOutputStream()
/*     */       {
/*     */         boolean closed = false;
/*     */         
/*     */         public synchronized void write(byte[] b, int off, int len) {
/* 661 */           super.write(b, off, len);
/* 662 */           if (containsLineSeparators(b, off, len) && redirectionMode == OutputRedirectionMode.VARIABLE && outputRedirection.isUpdateLines()) {
/* 663 */             updateVariable();
/*     */           }
/*     */         }
/*     */         
/*     */         private boolean containsLineSeparators(byte[] buffer, int off, int len) {
/* 668 */           for (int i = 0; i < len; i++) {
/* 669 */             byte b = buffer[off + i];
/* 670 */             if (b == 10 || b == 13) {
/* 671 */               return true;
/*     */             }
/*     */           } 
/* 674 */           return false;
/*     */         }
/*     */         
/*     */         private void updateVariable() {
/* 678 */           ContextInt context = ContextImpl.getSingleContextInt();
/* 679 */           String variableName = outputRedirection.getVariableName();
/* 680 */           context.setVariable(variableName, toString());
/*     */         }
/*     */ 
/*     */         
/*     */         public synchronized String toString() {
/* 685 */           trimZeros();
/* 686 */           return super.toString();
/*     */         }
/*     */ 
/*     */         
/*     */         public void trimZeros() {
/* 691 */           int j = 0;
/* 692 */           for (int i = 0; i < this.count; i++) {
/* 693 */             if (this.buf[i] != 0) {
/* 694 */               this.buf[j++] = this.buf[i];
/*     */             }
/*     */           } 
/* 697 */           this.count = j;
/*     */         }
/*     */ 
/*     */         
/*     */         public synchronized void close() throws IOException {
/* 702 */           if (!this.closed) {
/* 703 */             if (outputRedirection instanceof DirectOutputRedirection) {
/* 704 */               if (error) {
/* 705 */                 launchResult.error = toString();
/*     */               } else {
/* 707 */                 launchResult.output = toString();
/*     */               } 
/*     */             } else {
/* 710 */               OutputRedirectionMode redirectionMode = outputRedirection.getRedirectionMode();
/* 711 */               if (redirectionMode == OutputRedirectionMode.VARIABLE) {
/* 712 */                 updateVariable();
/* 713 */               } else if (redirectionMode == OutputRedirectionMode.LOG_FILE) {
/* 714 */                 String content = StringUtil.trimLineSeparators(toString());
/* 715 */                 if (content.trim().length() == 0) {
/* 716 */                   Logger.getInstance().info(LaunchHelper.class, streamName + " output was empty");
/*     */                 } else {
/* 718 */                   Logger.getInstance().info(LaunchHelper.class, "\n" + streamName + " output:\n---BEGIN---\n" + content + "\n---END---");
/*     */                 } 
/*     */               } 
/*     */             } 
/* 722 */             this.closed = true;
/*     */           } 
/*     */         }
/*     */       };
/*     */   }
/*     */   
/*     */   private static InputStream createInputStream(InputRedirection inputRedirection) throws IOException {
/* 729 */     if (inputRedirection != null) {
/* 730 */       InputRedirectionMode redirectionMode = inputRedirection.getRedirectionMode();
/* 731 */       if (redirectionMode == InputRedirectionMode.FILE)
/* 732 */         return createFileInputStream(inputRedirection); 
/* 733 */       if (redirectionMode == InputRedirectionMode.STRING) {
/* 734 */         return createStringInputStream(inputRedirection);
/*     */       }
/*     */     } 
/* 737 */     return null;
/*     */   }
/*     */   
/*     */   private static InputStream createFileInputStream(InputRedirection inputRedirection) throws IOException {
/* 741 */     if (inputRedirection != null) {
/* 742 */       if (inputRedirection.isStdInFile()) {
/* 743 */         return new UncloseableInputStream(System.in);
/*     */       }
/* 745 */       File file = inputRedirection.getFile();
/* 746 */       if (file != null) {
/*     */         try {
/* 748 */           return new FileInputStream(file);
/* 749 */         } catch (IOException e) {
/* 750 */           Logger.getInstance().error(LaunchHelper.class, "input file " + file.getPath() + " could not be opened");
/* 751 */           if (inputRedirection.isFailOnFileError()) {
/* 752 */             throw e;
/*     */           }
/*     */         } 
/*     */       }
/*     */     } 
/* 757 */     return null;
/*     */   }
/*     */   
/*     */   private static InputStream createStringInputStream(InputRedirection inputRedirection) {
/* 761 */     return new ByteArrayInputStream(inputRedirection.getString().getBytes());
/*     */   }
/*     */   
/*     */   public static class ConsumerThread
/*     */     extends Thread {
/*     */     private boolean canceled;
/*     */     private InputStream stream;
/*     */     private OutputStream outputStream;
/*     */     
/*     */     public ConsumerThread(InputStream stream, OutputStream outputStream) {
/* 771 */       this.stream = stream;
/* 772 */       this.outputStream = outputStream;
/*     */     }
/*     */ 
/*     */     
/*     */     public void run() {
/* 777 */       byte[] buffer = new byte[512];
/* 778 */       while (!this.canceled) {
/*     */         try {
/* 780 */           int read = this.stream.read(buffer);
/* 781 */           if (read == -1) {
/* 782 */             cancel(); continue;
/*     */           } 
/* 784 */           if (this.outputStream != null) {
/* 785 */             this.outputStream.write(buffer, 0, read);
/*     */           }
/*     */         }
/* 788 */         catch (IOException e) {
/* 789 */           cancel();
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public synchronized void cancel() {
/* 795 */       this.canceled = true;
/*     */       try {
/* 797 */         if (this.outputStream != null) {
/* 798 */           this.outputStream.close();
/*     */         }
/* 800 */       } catch (IOException iOException) {}
/*     */     }
/*     */   }
/*     */   
/*     */   private static class WriterThread
/*     */     extends Thread
/*     */   {
/*     */     private boolean canceled;
/*     */     private OutputStream processOutput;
/*     */     private InputStream inputStream;
/*     */     private boolean unbuffered;
/*     */     
/*     */     public WriterThread(OutputStream processOutput, InputStream inputStream, boolean unbuffered) {
/* 813 */       this.processOutput = processOutput;
/* 814 */       this.inputStream = inputStream;
/* 815 */       this.unbuffered = unbuffered;
/*     */     }
/*     */ 
/*     */     
/*     */     public void run() {
/* 820 */       if (this.unbuffered) {
/* 821 */         while (!this.canceled) {
/*     */           try {
/* 823 */             int read = this.inputStream.read();
/* 824 */             if (read == -1) {
/* 825 */               cancel(); continue;
/*     */             } 
/* 827 */             this.processOutput.write(read);
/* 828 */             this.processOutput.flush();
/*     */           }
/* 830 */           catch (IOException e) {
/* 831 */             cancel();
/*     */           } 
/*     */         } 
/*     */       } else {
/*     */         
/* 836 */         byte[] buffer = new byte[512];
/* 837 */         while (!this.canceled) {
/*     */           try {
/* 839 */             int read = this.inputStream.read(buffer);
/* 840 */             if (read == -1) {
/* 841 */               cancel(); continue;
/*     */             } 
/* 843 */             this.processOutput.write(buffer, 0, read);
/*     */           }
/* 845 */           catch (IOException e) {
/* 846 */             cancel();
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/*     */     public synchronized void cancel() {
/* 853 */       this.canceled = true;
/*     */       try {
/* 855 */         this.inputStream.close();
/* 856 */         this.processOutput.close();
/* 857 */       } catch (IOException iOException) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public static class LaunchResult
/*     */     implements Serializable {
/*     */     private int returnCode;
/*     */     private String output;
/*     */     private String error;
/*     */     
/*     */     public LaunchResult returnCode(int returnCode) {
/* 868 */       this.returnCode = returnCode;
/* 869 */       return this;
/*     */     }
/*     */     
/*     */     public int getReturnCode() {
/* 873 */       return this.returnCode;
/*     */     }
/*     */     
/*     */     public String getOutput() {
/* 877 */       return this.output;
/*     */     }
/*     */     
/*     */     public String getError() {
/* 881 */       return this.error;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\launching\LaunchHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */