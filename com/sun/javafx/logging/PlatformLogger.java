/*     */ package com.sun.javafx.logging;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.ResourceBundle;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PlatformLogger
/*     */   implements System.Logger
/*     */ {
/*     */   public enum Level
/*     */   {
/*  53 */     ALL((String)System.Logger.Level.ALL),
/*  54 */     FINEST((String)System.Logger.Level.TRACE),
/*  55 */     FINER((String)System.Logger.Level.TRACE),
/*  56 */     FINE((String)System.Logger.Level.DEBUG),
/*  57 */     INFO((String)System.Logger.Level.INFO),
/*  58 */     WARNING((String)System.Logger.Level.WARNING),
/*  59 */     SEVERE((String)System.Logger.Level.ERROR),
/*  60 */     OFF((String)System.Logger.Level.OFF);
/*     */     final System.Logger.Level systemLevel;
/*     */     
/*     */     Level(System.Logger.Level param1Level) {
/*  64 */       this.systemLevel = param1Level;
/*     */     }
/*     */   }
/*     */   
/*     */   private System.Logger.Level getSystemLoggerLevel(Level paramLevel) {
/*  69 */     switch (paramLevel) { case ALL:
/*  70 */         return System.Logger.Level.ALL;
/*  71 */       case FINEST: return System.Logger.Level.TRACE;
/*  72 */       case FINER: return System.Logger.Level.TRACE;
/*  73 */       case FINE: return System.Logger.Level.DEBUG;
/*  74 */       case INFO: return System.Logger.Level.INFO;
/*  75 */       case WARNING: return System.Logger.Level.WARNING;
/*  76 */       case SEVERE: return System.Logger.Level.ERROR;
/*  77 */       case OFF: return System.Logger.Level.OFF; }
/*  78 */      return System.Logger.Level.ALL;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  84 */   private static final Map<String, WeakReference<PlatformLogger>> loggers = new HashMap<>();
/*     */ 
/*     */   
/*     */   private final System.Logger loggerProxy;
/*     */   
/*     */   private boolean loggingEnabled;
/*     */ 
/*     */   
/*     */   public static synchronized PlatformLogger getLogger(String paramString) {
/*  93 */     PlatformLogger platformLogger = null;
/*  94 */     WeakReference<PlatformLogger> weakReference = loggers.get(paramString);
/*  95 */     if (weakReference != null) {
/*  96 */       platformLogger = weakReference.get();
/*     */     }
/*  98 */     if (platformLogger == null) {
/*  99 */       platformLogger = new PlatformLogger(System.getLogger(paramString));
/* 100 */       loggers.put(paramString, new WeakReference<>(platformLogger));
/*     */     } 
/* 102 */     return platformLogger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected PlatformLogger(System.Logger paramLogger) {
/* 271 */     this.loggingEnabled = true; this.loggerProxy = paramLogger;
/*     */   }
/* 273 */   public String getName() { return this.loggerProxy.getName(); } public boolean isLoggable(System.Logger.Level paramLevel) { return this.loggerProxy.isLoggable(paramLevel); } public void log(System.Logger.Level paramLevel, ResourceBundle paramResourceBundle, String paramString, Object... paramVarArgs) { this.loggerProxy.log(paramLevel, paramResourceBundle, paramString, paramVarArgs); } public void log(System.Logger.Level paramLevel, ResourceBundle paramResourceBundle, String paramString, Throwable paramThrowable) { this.loggerProxy.log(paramLevel, paramResourceBundle, paramString, paramThrowable); } public boolean isLoggable(Level paramLevel) { if (paramLevel == null) throw new NullPointerException();  return this.loggerProxy.isLoggable(getSystemLoggerLevel(paramLevel)); } public void severe(String paramString) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.ERROR, paramString, (Object[])null); } public void severe(String paramString, Throwable paramThrowable) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.ERROR, paramString, paramThrowable); } public void severe(String paramString, Object... paramVarArgs) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.ERROR, paramString, paramVarArgs); } public void warning(String paramString) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.WARNING, paramString, (Object[])null); } public void warning(String paramString, Throwable paramThrowable) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.WARNING, paramString, paramThrowable); } public void warning(String paramString, Object... paramVarArgs) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.WARNING, paramString, paramVarArgs); } public void enableLogging() { this.loggingEnabled = true; }
/*     */   public void info(String paramString) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.INFO, paramString, (Object[])null); }
/*     */   public void info(String paramString, Throwable paramThrowable) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.INFO, paramString, paramThrowable); }
/*     */   public void info(String paramString, Object... paramVarArgs) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.INFO, paramString, paramVarArgs); }
/* 277 */   public void fine(String paramString) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.DEBUG, paramString, (Object[])null); } public void fine(String paramString, Throwable paramThrowable) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.DEBUG, paramString, paramThrowable); } public void fine(String paramString, Object... paramVarArgs) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.DEBUG, paramString, paramVarArgs); } public void finer(String paramString) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.TRACE, paramString, (Object[])null); } public void finer(String paramString, Throwable paramThrowable) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.TRACE, paramString, paramThrowable); } public void finer(String paramString, Object... paramVarArgs) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.TRACE, paramString, paramVarArgs); } public void finest(String paramString) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.TRACE, paramString, (Object[])null); } public void finest(String paramString, Throwable paramThrowable) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.TRACE, paramString, paramThrowable); } public void finest(String paramString, Object... paramVarArgs) { if (!this.loggingEnabled) return;  this.loggerProxy.log(System.Logger.Level.TRACE, paramString, paramVarArgs); } public void disableLogging() { this.loggingEnabled = false; }
/*     */ 
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\logging\PlatformLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */