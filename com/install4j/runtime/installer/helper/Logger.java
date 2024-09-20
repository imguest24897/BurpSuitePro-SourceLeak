/*     */ package com.install4j.runtime.installer.helper;
/*     */ 
/*     */ import com.install4j.api.events.EventType;
/*     */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*     */ import com.install4j.runtime.installer.helper.comm.impl.HelperLoggerImpl;
/*     */ import com.install4j.runtime.util.LauncherLogger;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ public abstract class Logger
/*     */ {
/*  13 */   private static final Logger NULL_INSTANCE = new Logger()
/*     */     {
/*     */       public void log(Throwable e) {}
/*     */ 
/*     */ 
/*     */       
/*     */       public void log(Object source, String text, boolean success) {}
/*     */     };
/*     */ 
/*     */   
/*  23 */   private static final Logger SYSTEM_ERR_INSTANCE = new Logger()
/*     */     {
/*     */       public void log(Throwable e) {
/*  26 */         e.printStackTrace();
/*     */       }
/*     */ 
/*     */       
/*     */       public void log(Object source, String text, boolean success) {
/*  31 */         System.err.println(text);
/*     */       }
/*     */     };
/*     */   
/*  35 */   public static final List LOGGED_EVENT_TYPES = Arrays.asList(new EventType[] { EventType.BEFORE_EXECUTE_ACTION, EventType.AFTER_EXECUTE_ACTION, EventType.BEFORE_ROLLBACK_ACTION, EventType.AFTER_ROLLBACK_ACTION, EventType.BEFORE_INSTALL_FILE, EventType.BEFORE_DOWNLOAD, EventType.SHOW_SCREEN, EventType.FINISHED, EventType.CANCELED, EventType.VARIABLE_CHANGED });
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
/*  48 */   public static final List TIMESTAMP_EVENT_TYPES = Arrays.asList(new EventType[] { EventType.FINISHED, EventType.CANCELED });
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  53 */   public static final List LOGGED_EVENT_TYPES_FAILURE_ONLY = Arrays.asList(new EventType[] { EventType.AFTER_INSTALL_FILE, EventType.AFTER_DOWNLOAD });
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  58 */   public static final LauncherLogger LAUNCHER_LOGGER = new LauncherLogger()
/*     */     {
/*     */       public void info(String str) {
/*  61 */         Logger.getInstance().info(null, str);
/*     */       }
/*     */ 
/*     */       
/*     */       public void error(String str) {
/*  66 */         Logger.getInstance().error(null, str);
/*     */       }
/*     */ 
/*     */       
/*     */       public void error(Throwable throwable) {
/*  71 */         Logger.getInstance().log(throwable);
/*     */       }
/*     */     };
/*     */ 
/*     */   
/*     */   private static Logger instance;
/*     */   public static final String PROPNAME_KEEP_LOGFILE = "install4j.keepLog";
/*     */   public static final String PROPNAME_ALTERNATIVE_LOGFILE = "install4j.alternativeLogfile";
/*     */   public static final String PROPNAME_LOG = "install4j.log";
/*     */   public static final String PROPNAME_APPEND_LOG = "install4j.appendLog";
/*     */   public static final String PROPNAME_LOG_TO_STDERR = "install4j.logToStderr";
/*     */   public static final String PROPNAME_LOG_ENCODING = "install4j.logEncoding";
/*     */   
/*     */   public static Logger getInstance() {
/*  85 */     if (instance == null) {
/*  86 */       if (HelperCommunication.getInstance().isElevatedHelper()) {
/*  87 */         instance = (Logger)new HelperLoggerImpl();
/*     */       } else {
/*  89 */         instance = new LoggerImpl();
/*     */       } 
/*     */     }
/*  92 */     return instance;
/*     */   }
/*     */   
/*     */   public static Logger getExistingInstance() {
/*  96 */     return (instance == null) ? NULL_INSTANCE : instance;
/*     */   }
/*     */   
/*     */   public static Logger getDebugInstance() {
/* 100 */     return (instance == null) ? SYSTEM_ERR_INSTANCE : instance;
/*     */   }
/*     */ 
/*     */   
/*     */   public abstract void log(Throwable paramThrowable);
/*     */   
/*     */   public void error(Object source, String text) {
/* 107 */     log(source, text, false);
/*     */   }
/*     */   public abstract void log(Object paramObject, String paramString, boolean paramBoolean);
/*     */   public void info(Object source, String text) {
/* 111 */     log(source, text, true);
/*     */   }
/*     */   
/*     */   public static LoggerImpl getImpl() {
/* 115 */     HelperCommunication.helperUnsupported();
/* 116 */     return (LoggerImpl)getInstance();
/*     */   }
/*     */   
/*     */   public static String getUninstallPreviousLogFileName(int logFileIndex) {
/* 120 */     return "uninstallPrevious" + ((logFileIndex == 0) ? "" : ("." + (logFileIndex + 1))) + ".log";
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\Logger.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */