/*    */ package com.sun.javafx.binding;
/*    */ 
/*    */ import com.sun.javafx.logging.PlatformLogger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ErrorLogRecord
/*    */ {
/*    */   private final PlatformLogger.Level level;
/*    */   private final Throwable thrown;
/*    */   
/*    */   public ErrorLogRecord(PlatformLogger.Level paramLevel, Throwable paramThrowable) {
/* 70 */     this.level = paramLevel;
/* 71 */     if (Logging.keepException) {
/* 72 */       this.thrown = paramThrowable;
/*    */     } else {
/* 74 */       this.thrown = null;
/*    */     } 
/*    */   }
/*    */   
/*    */   public Throwable getThrown() {
/* 79 */     return this.thrown;
/*    */   }
/*    */   
/*    */   public PlatformLogger.Level getLevel() {
/* 83 */     return this.level;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\Logging$ErrorLogger$ErrorLogRecord.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */