/*     */ package com.install4j.runtime.installer.helper;
/*     */ import com.exe4j.runtime.util.FileUtil;
/*     */ import com.install4j.api.Util;
/*     */ import com.install4j.api.actions.Action;
/*     */ import com.install4j.api.beans.Bean;
/*     */ import com.install4j.api.beans.PropertyLoggingInterceptor;
/*     */ import com.install4j.api.context.Context;
/*     */ import com.install4j.api.context.UserCanceledException;
/*     */ import com.install4j.api.events.EventType;
/*     */ import com.install4j.api.events.InstallerEvent;
/*     */ import com.install4j.api.events.InstallerEventListener;
/*     */ import com.install4j.api.screens.Screen;
/*     */ import com.install4j.api.unix.UnixFileSystem;
/*     */ import com.install4j.runtime.installer.InstallerVariables;
/*     */ import com.install4j.runtime.installer.config.InstallerConfig;
/*     */ import com.install4j.runtime.installer.helper.comm.actions.FetchBooleanAction;
/*     */ import com.install4j.runtime.util.StringUtil;
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStreamWriter;
/*     */ import java.io.PrintWriter;
/*     */ import java.lang.ref.WeakReference;
/*     */ import java.lang.reflect.Method;
/*     */ import java.text.DateFormat;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Comparator;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Objects;
/*     */ 
/*     */ public class LoggerImpl extends Logger implements InstallerEventListener {
/*  36 */   private static final Comparator<Method> METHOD_COMPARATOR = Comparator.comparing(Method::getName);
/*  37 */   private static final boolean LOG_TIMESTAMPS = Boolean.getBoolean("install4j.logTimestamps");
/*     */   
/*  39 */   private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
/*     */   
/*     */   private PrintWriter out;
/*     */   
/*     */   private File logFile;
/*     */   
/*     */   private boolean moved;
/*     */   
/*     */   private WeakReference<Object> lastSource;
/*     */   private String lastPrefix;
/*     */   private Action currentAction;
/*     */   private List<String> actionLogBuffer;
/*     */   private Screen currentScreen;
/*     */   private File finalLogFile;
/*     */   private boolean explicitLogFileSet = false;
/*     */   private String lastLoggedText;
/*  55 */   private int lastLoggedTextCounter = 0;
/*     */ 
/*     */   
/*     */   LoggerImpl() {
/*  59 */     InstallerConfig config = InstallerConfig.getCurrentInstance();
/*     */     try {
/*  61 */       String logFilePrefix = "i4j_log";
/*  62 */       String shortName = null;
/*  63 */       if (config != null) {
/*  64 */         shortName = (String)InstallerConfig.getCurrentInstance().getCompilerVariables().get("sys.shortName");
/*     */       }
/*  66 */       if (shortName != null) {
/*  67 */         logFilePrefix = logFilePrefix + "_" + shortName + "_";
/*     */       }
/*  69 */       this.logFile = File.createTempFile(logFilePrefix, ".log");
/*  70 */       Runtime.getRuntime().addShutdownHook(new Thread("delete_log")
/*     */           {
/*     */             public void run() {
/*  73 */               if (!Boolean.getBoolean("install4j.keepLog") && LoggerImpl.this.logFile != null && !LoggerImpl.this.moved && !Objects.equals("true", System.getenv("INSTALL4J_KEEP_LOG"))) {
/*  74 */                 LoggerImpl.this.out.close();
/*  75 */                 LoggerImpl.this.logFile.delete();
/*     */               } 
/*     */             }
/*     */           });
/*  79 */       openOutputStream(Boolean.getBoolean("install4j.appendLog"));
/*  80 */     } catch (IOException e) {
/*  81 */       e.printStackTrace();
/*  82 */       openFallbackOutputStream();
/*     */     } 
/*     */     
/*  85 */     InstallerVariables.registerVariableProvider("sys.logFile", new InstallerVariables.VariableProvider()
/*     */         {
/*     */           public Object getVariable() {
/*     */             try {
/*  89 */               return LoggerImpl.this.logFile.getCanonicalPath();
/*  90 */             } catch (IOException e) {
/*  91 */               return LoggerImpl.this.logFile.getAbsolutePath();
/*     */             } 
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           public void setVariable(Object value) {}
/*     */         });
/* 100 */     info(null, "Logger started at " + getIsoDateAndTime());
/* 101 */     info(null, "Executable name: " + System.getProperty("exe4j.moduleName"));
/* 102 */     if (config != null) {
/* 103 */       info(null, "install4j version: " + config.getInstall4jVersion() + " (build " + config.getInstall4jBuild() + ")");
/*     */     }
/*     */     
/* 106 */     info(null, "Properties: ");
/* 107 */     System.getProperties().list(this.out);
/*     */   }
/*     */   
/*     */   private String getIsoDateAndTime() {
/* 111 */     return ZonedDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
/*     */   }
/*     */   
/*     */   private void openFallbackOutputStream() {
/* 115 */     this.out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(FileDescriptor.out)));
/*     */   }
/*     */   
/*     */   private void openOutputStream(boolean append) {
/*     */     try {
/* 120 */       String logEncoding = System.getProperty("install4j.logEncoding");
/* 121 */       if (logEncoding != null) {
/* 122 */         this.out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.logFile, append), logEncoding));
/*     */       } else {
/* 124 */         this.out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.logFile, append)));
/*     */       } 
/* 126 */     } catch (IOException e) {
/* 127 */       e.printStackTrace();
/* 128 */       openFallbackOutputStream();
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<String> getActionLogBuffer() {
/* 133 */     return this.actionLogBuffer;
/*     */   }
/*     */   
/*     */   public File getLogFile() {
/* 137 */     return this.logFile;
/*     */   }
/*     */   
/*     */   public void closeLogFile() {
/* 141 */     if (this.out != null) {
/*     */       try {
/* 143 */         this.out.close();
/* 144 */       } catch (Exception exception) {}
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized void moveLogFileToFinalDestination() {
/* 151 */     if (this.logFile != null && this.finalLogFile != null && !Boolean.getBoolean("install4j.noPermanentLogFile")) {
/* 152 */       moveLogFile(this.finalLogFile, false);
/*     */     }
/* 154 */     closeLogFile();
/*     */   }
/*     */   
/*     */   public void moveLogFile(File newLogFile, boolean open) {
/* 158 */     if (this.logFile != null) {
/* 159 */       this.moved = true;
/* 160 */       closeLogFile();
/* 161 */       if (moveInt(this.logFile, newLogFile)) {
/* 162 */         this.logFile = newLogFile;
/* 163 */         if (open) {
/* 164 */           openOutputStream(true);
/*     */         }
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static boolean moveInt(final File logFile, final File newLogFile) {
/* 171 */     final String accessMode = System.getProperty("install4j.runtimeAccessMode");
/* 172 */     final boolean append = Boolean.getBoolean("install4j.appendLog");
/* 173 */     final boolean keepLogfile = Boolean.getBoolean("install4j.keepLog");
/* 174 */     return HelperCommunication.getInstance().fetchBoolean(ContentInstaller.getExecutionContext(), new FetchBooleanAction()
/*     */         {
/*     */           protected boolean fetchValue(Context context) throws UserCanceledException {
/*     */             try {
/* 178 */               FileUtil.copyFile(logFile, newLogFile, append);
/* 179 */               if (!keepLogfile) {
/* 180 */                 logFile.delete();
/*     */               }
/* 182 */               if (accessMode != null && !Util.isWindows()) {
/* 183 */                 UnixFileSystem.setMode(accessMode, newLogFile);
/*     */               }
/* 185 */               return true;
/* 186 */             } catch (IOException e) {
/* 187 */               if (Boolean.getBoolean("install4j.logFileError")) {
/* 188 */                 System.err.println("could not copy log file: " + e.getMessage());
/*     */               }
/*     */               
/* 191 */               return false;
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public void installerEvent(InstallerEvent event) {
/* 198 */     EventType type = event.getType();
/* 199 */     if (LOGGED_EVENT_TYPES.contains(type) || (!event.wasSuccessful() && LOGGED_EVENT_TYPES_FAILURE_ONLY.contains(type))) {
/* 200 */       log(event.getSource(), event.getVerbose() + (TIMESTAMP_EVENT_TYPES.contains(type) ? (" at " + getIsoDateAndTime()) : ""), event.wasSuccessful());
/*     */     }
/* 202 */     if (type == EventType.BEFORE_EXECUTE_ACTION) {
/* 203 */       logActionProperties(event.getSource());
/*     */     }
/*     */   }
/*     */   
/*     */   public void switchToSecondaryProcess() {
/* 208 */     System.getProperties().remove("install4j.alternativeLogfile");
/* 209 */     System.getProperties().remove("install4j.log");
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void log(Throwable e) {
/* 214 */     error(null, e.toString());
/* 215 */     String annotatedStackTrace = Util.getAnnotatedStackTrace(e);
/* 216 */     if (this.actionLogBuffer != null) {
/* 217 */       this.actionLogBuffer.add(annotatedStackTrace);
/*     */     }
/* 219 */     this.out.print(annotatedStackTrace);
/* 220 */     this.out.flush();
/* 221 */     if (Boolean.getBoolean("install4j.logToStderr")) {
/* 222 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void log(Object source, String text, boolean success) {
/* 228 */     if (source instanceof Context) {
/* 229 */       source = null;
/*     */     }
/* 231 */     if (source == null && this.currentAction != null) {
/* 232 */       source = this.currentAction;
/*     */     }
/* 234 */     if (source == null && this.currentScreen != null) {
/* 235 */       source = this.currentScreen;
/*     */     }
/*     */     
/* 238 */     StringBuilder buffer = new StringBuilder();
/* 239 */     String prefix = getPrefix(success);
/* 240 */     boolean sameOrigin = (this.lastSource != null && source != null && this.lastSource.get() == source && Objects.equals(prefix, this.lastPrefix));
/* 241 */     if (sameOrigin) {
/* 242 */       buffer.append(getPrefixIndent(prefix));
/*     */     } else {
/* 244 */       if (LOG_TIMESTAMPS) {
/* 245 */         buffer.append(DATE_FORMAT.format(new Date()));
/* 246 */         buffer.append(" ");
/*     */       } 
/* 248 */       buffer.append(prefix);
/* 249 */       if (source != null) {
/* 250 */         if (source instanceof Class) {
/* 251 */           buffer.append(((Class)source).getName());
/*     */         } else {
/* 253 */           buffer.append(source.getClass().getName());
/*     */         } 
/* 255 */         if (source instanceof Bean) {
/* 256 */           String id = AbstractBeanConfig.getDisplayedId((Bean)source);
/* 257 */           if (id != null) {
/* 258 */             buffer.append(" [ID ");
/* 259 */             buffer.append(id);
/* 260 */             buffer.append("]");
/*     */           } 
/*     */         } 
/* 263 */         buffer.append(": ");
/*     */       } 
/* 265 */       this.lastSource = new WeakReference(source);
/* 266 */       this.lastPrefix = prefix;
/*     */     } 
/*     */     
/* 269 */     buffer.append(text);
/* 270 */     String loggedText = buffer.toString();
/* 271 */     if (this.actionLogBuffer != null) {
/* 272 */       this.actionLogBuffer.add(loggedText);
/*     */     }
/* 274 */     if (loggedText.equals(this.lastLoggedText)) {
/* 275 */       this.lastLoggedTextCounter++;
/*     */     } else {
/* 277 */       this.lastLoggedText = loggedText;
/* 278 */       if (this.lastLoggedTextCounter > 0) {
/* 279 */         output(getPrefixIndent(this.lastPrefix) + "(+" + this.lastLoggedTextCounter + ")");
/* 280 */         this.lastLoggedTextCounter = 0;
/*     */       } 
/* 282 */       output(loggedText);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void output(String loggedText) {
/* 287 */     this.out.println(loggedText);
/* 288 */     this.out.flush();
/* 289 */     if (Boolean.getBoolean("install4j.logToStderr")) {
/* 290 */       System.err.println(loggedText);
/*     */     }
/*     */   }
/*     */   
/*     */   private String getPrefixIndent(String prefix) {
/* 295 */     return StringUtil.repeat(" ", prefix.length());
/*     */   }
/*     */   
/*     */   private String getPrefix(boolean success) {
/* 299 */     if (success) {
/* 300 */       return "[INFO] ";
/*     */     }
/* 302 */     return "[ERROR] ";
/*     */   }
/*     */ 
/*     */   
/*     */   private void logActionProperties(Object source) {
/* 307 */     InstallerVariables.setReplaceHiddenVariables(false);
/*     */     try {
/* 309 */       Method[] methods = source.getClass().getMethods();
/* 310 */       Arrays.sort(methods, METHOD_COMPARATOR);
/* 311 */       for (Method method : methods) {
/* 312 */         String name = method.getName();
/* 313 */         if ((method.getParameterTypes()).length == 0 && !Objects.equals(name, "getClass") && ((name
/* 314 */           .startsWith("get") && name.length() > 3) || (name.startsWith("is") && name.length() > 2))) {
/*     */           try {
/* 316 */             logProperty(source, name, method.invoke(source, new Object[0]));
/* 317 */           } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {}
/*     */         }
/*     */       }
/*     */     
/*     */     } finally {
/*     */       
/* 323 */       InstallerVariables.setReplaceHiddenVariables(true);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void logProperty(Object source, String methodName, Object value) {
/*     */     String propertyName;
/* 329 */     if (methodName.startsWith("get")) {
/* 330 */       propertyName = methodName.substring(3, 4).toLowerCase(Locale.ENGLISH) + methodName.substring(4);
/*     */     } else {
/* 332 */       propertyName = methodName.substring(2, 3).toLowerCase(Locale.ENGLISH) + methodName.substring(3);
/*     */     } 
/*     */     
/* 335 */     if (source instanceof PropertyLoggingInterceptor) {
/* 336 */       value = ((PropertyLoggingInterceptor)source).getLogValueForProperty(propertyName, value);
/*     */     }
/*     */     
/* 339 */     info(source, "Property " + propertyName + ": " + StringUtil.toStringWithArrays(value));
/*     */   }
/*     */   
/*     */   public void resetOrigin() {
/* 343 */     this.lastSource = null;
/* 344 */     this.lastPrefix = null;
/*     */   }
/*     */   
/*     */   public void setCurrentScreen(Screen currentScreen) {
/* 348 */     this.currentScreen = currentScreen;
/*     */   }
/*     */   
/*     */   public void setCurrentAction(Action currentAction) {
/* 352 */     this.currentAction = currentAction;
/* 353 */     this.actionLogBuffer = (currentAction != null) ? new ArrayList<>() : null;
/*     */   }
/*     */   
/*     */   public void setFinalLogFile(File finalLogFile) {
/* 357 */     if (!this.explicitLogFileSet) {
/* 358 */       this.finalLogFile = finalLogFile;
/*     */     }
/*     */   }
/*     */   
/*     */   public void checkAlternativeLogfile() {
/* 363 */     File alternativeLogFile = getAlternativeLogFile();
/* 364 */     if (alternativeLogFile == null) {
/*     */       return;
/*     */     }
/* 367 */     if (alternativeLogFile.getParent() == null) {
/* 368 */       log((Object)null, "Cannot switch to alternative log file \"" + alternativeLogFile + "\"", false);
/*     */       return;
/*     */     } 
/* 371 */     this.explicitLogFileSet = true;
/* 372 */     File oldLogFile = this.logFile;
/* 373 */     alternativeLogFile.getParentFile().mkdirs();
/* 374 */     moveLogFile(alternativeLogFile, true);
/* 375 */     if (oldLogFile != null && oldLogFile.exists()) {
/* 376 */       oldLogFile.delete();
/*     */     }
/*     */   }
/*     */   
/*     */   private File getAlternativeLogFile() {
/* 381 */     String propertyValue = InstallerVariables.replaceVariables(getAlternativeLogfileProperty());
/* 382 */     if (Objects.equals("null", propertyValue) || propertyValue == null) {
/* 383 */       return null;
/*     */     }
/* 385 */     File file = new File(propertyValue);
/* 386 */     if (!file.isAbsolute()) {
/* 387 */       if (InstallerVariables.getMediaFile() != null) {
/* 388 */         return new File(InstallerVariables.getMediaDir(), file.getName());
/*     */       }
/* 390 */       return file.getAbsoluteFile();
/*     */     } 
/*     */     
/* 393 */     return file;
/*     */   }
/*     */ 
/*     */   
/*     */   private String getAlternativeLogfileProperty() {
/* 398 */     String alternativeLogfile = System.getProperty("install4j.log");
/* 399 */     if (alternativeLogfile != null) {
/* 400 */       return alternativeLogfile;
/*     */     }
/* 402 */     return System.getProperty("install4j.alternativeLogfile");
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\LoggerImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */