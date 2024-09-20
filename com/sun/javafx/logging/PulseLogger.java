/*     */ package com.sun.javafx.logging;
/*     */ 
/*     */ import java.lang.reflect.Method;
/*     */ import java.security.AccessController;
/*     */ import java.util.ArrayList;
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
/*     */ public class PulseLogger
/*     */ {
/*     */   public static final boolean PULSE_LOGGING_ENABLED;
/*  38 */   private static final String[] DEFAULT_LOGGERS = new String[] { "com.sun.javafx.logging.PrintLogger", "com.sun.javafx.logging.jfr.JFRPulseLogger" };
/*     */   private static final Logger[] loggers;
/*     */   
/*     */   static {
/*  42 */     ArrayList<Logger> arrayList = new ArrayList();
/*  43 */     for (String str : DEFAULT_LOGGERS) {
/*  44 */       Logger logger = loadLogger(str);
/*  45 */       if (logger != null) {
/*  46 */         arrayList.add(logger);
/*     */       }
/*     */     } 
/*  49 */     loggers = arrayList.<Logger>toArray(new Logger[arrayList.size()]);
/*  50 */     PULSE_LOGGING_ENABLED = (loggers.length > 0);
/*     */   }
/*     */   
/*     */   public static void pulseStart() {
/*  54 */     for (Logger logger : loggers) {
/*  55 */       logger.pulseStart();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void pulseEnd() {
/*  60 */     for (Logger logger : loggers) {
/*  61 */       logger.pulseEnd();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void renderStart() {
/*  66 */     for (Logger logger : loggers) {
/*  67 */       logger.renderStart();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void renderEnd() {
/*  72 */     for (Logger logger : loggers) {
/*  73 */       logger.renderEnd();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void addMessage(String paramString) {
/*  78 */     for (Logger logger : loggers) {
/*  79 */       logger.addMessage(paramString);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void incrementCounter(String paramString) {
/*  84 */     for (Logger logger : loggers) {
/*  85 */       logger.incrementCounter(paramString);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void newPhase(String paramString) {
/*  90 */     for (Logger logger : loggers) {
/*  91 */       logger.newPhase(paramString);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void newInput(String paramString) {
/*  96 */     for (Logger logger : loggers) {
/*  97 */       logger.newInput(paramString);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean isPulseLoggingRequested() {
/* 107 */     return ((Boolean)AccessController.<Boolean>doPrivileged(() -> Boolean.valueOf(Boolean.getBoolean("javafx.pulseLogger")))).booleanValue();
/*     */   }
/*     */ 
/*     */   
/*     */   private static Logger loadLogger(String paramString) {
/*     */     try {
/* 113 */       Class<?> clazz = Class.forName(paramString);
/* 114 */       if (clazz != null) {
/* 115 */         Method method = clazz.getDeclaredMethod("createInstance", new Class[0]);
/* 116 */         return (Logger)method.invoke(null, new Object[0]);
/*     */       } 
/* 118 */     } catch (NoClassDefFoundError|ClassNotFoundException|NoSuchMethodException|IllegalAccessException|java.lang.reflect.InvocationTargetException noClassDefFoundError) {}
/*     */ 
/*     */     
/* 121 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\logging\PulseLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */