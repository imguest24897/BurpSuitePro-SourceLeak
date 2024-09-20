/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import com.sun.javafx.logging.PlatformLogger;
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
/*     */ public class Logging
/*     */ {
/*     */   private static boolean keepException = false;
/*     */   
/*     */   public static void setKeepException(boolean paramBoolean) {
/*  39 */     keepException = paramBoolean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static boolean getKeepException() {
/*  47 */     return keepException;
/*     */   }
/*     */   
/*     */   public static ErrorLogger getLogger() {
/*  51 */     return ErrorLogger.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static class ErrorLogger
/*     */     extends PlatformLogger
/*     */   {
/*     */     ErrorLogger() {
/*  60 */       super(System.getLogger("javafx.beans"));
/*     */     }
/*     */     
/*  63 */     private static final ErrorLogger INSTANCE = new ErrorLogger();
/*     */     private ErrorLogRecord errorLogRecord;
/*     */     
/*     */     public static class ErrorLogRecord {
/*     */       private final PlatformLogger.Level level;
/*     */       
/*     */       public ErrorLogRecord(PlatformLogger.Level param2Level, Throwable param2Throwable) {
/*  70 */         this.level = param2Level;
/*  71 */         if (Logging.keepException) {
/*  72 */           this.thrown = param2Throwable;
/*     */         } else {
/*  74 */           this.thrown = null;
/*     */         } 
/*     */       }
/*     */       private final Throwable thrown;
/*     */       public Throwable getThrown() {
/*  79 */         return this.thrown;
/*     */       }
/*     */       
/*     */       public PlatformLogger.Level getLevel() {
/*  83 */         return this.level;
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public ErrorLogRecord getErrorLogRecord() {
/*  90 */       return this.errorLogRecord;
/*     */     }
/*     */     
/*     */     public void setErrorLogRecord(ErrorLogRecord param1ErrorLogRecord) {
/*  94 */       this.errorLogRecord = param1ErrorLogRecord;
/*     */     }
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
/*     */     public void warning(String param1String, Throwable param1Throwable) {
/* 108 */       super.warning(param1String, param1Throwable);
/* 109 */       this.errorLogRecord = new ErrorLogRecord(PlatformLogger.Level.WARNING, param1Throwable);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public void fine(String param1String, Throwable param1Throwable) {
/* 120 */       super.fine(param1String, param1Throwable);
/* 121 */       this.errorLogRecord = new ErrorLogRecord(PlatformLogger.Level.FINE, param1Throwable);
/*     */     }
/*     */   }
/*     */   
/*     */   public static class ErrorLogRecord {
/*     */     private final PlatformLogger.Level level;
/*     */     private final Throwable thrown;
/*     */     
/*     */     public ErrorLogRecord(PlatformLogger.Level param1Level, Throwable param1Throwable) {
/*     */       this.level = param1Level;
/*     */       if (Logging.keepException) {
/*     */         this.thrown = param1Throwable;
/*     */       } else {
/*     */         this.thrown = null;
/*     */       } 
/*     */     }
/*     */     
/*     */     public Throwable getThrown() {
/*     */       return this.thrown;
/*     */     }
/*     */     
/*     */     public PlatformLogger.Level getLevel() {
/*     */       return this.level;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\Logging.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */