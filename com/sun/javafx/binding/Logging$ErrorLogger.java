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
/*     */ public class ErrorLogger
/*     */   extends PlatformLogger
/*     */ {
/*     */   ErrorLogger() {
/*  60 */     super(System.getLogger("javafx.beans"));
/*     */   }
/*     */   
/*  63 */   private static final ErrorLogger INSTANCE = new ErrorLogger();
/*     */   private ErrorLogRecord errorLogRecord;
/*     */   
/*     */   public static class ErrorLogRecord {
/*     */     private final PlatformLogger.Level level;
/*     */     
/*     */     public ErrorLogRecord(PlatformLogger.Level param2Level, Throwable param2Throwable) {
/*  70 */       this.level = param2Level;
/*  71 */       if (Logging.keepException) {
/*  72 */         this.thrown = param2Throwable;
/*     */       } else {
/*  74 */         this.thrown = null;
/*     */       } 
/*     */     }
/*     */     private final Throwable thrown;
/*     */     public Throwable getThrown() {
/*  79 */       return this.thrown;
/*     */     }
/*     */     
/*     */     public PlatformLogger.Level getLevel() {
/*  83 */       return this.level;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ErrorLogRecord getErrorLogRecord() {
/*  90 */     return this.errorLogRecord;
/*     */   }
/*     */   
/*     */   public void setErrorLogRecord(ErrorLogRecord paramErrorLogRecord) {
/*  94 */     this.errorLogRecord = paramErrorLogRecord;
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
/*     */   public void warning(String paramString, Throwable paramThrowable) {
/* 108 */     super.warning(paramString, paramThrowable);
/* 109 */     this.errorLogRecord = new ErrorLogRecord(PlatformLogger.Level.WARNING, paramThrowable);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void fine(String paramString, Throwable paramThrowable) {
/* 120 */     super.fine(paramString, paramThrowable);
/* 121 */     this.errorLogRecord = new ErrorLogRecord(PlatformLogger.Level.FINE, paramThrowable);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\Logging$ErrorLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */