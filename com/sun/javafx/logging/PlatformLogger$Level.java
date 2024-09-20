/*    */ package com.sun.javafx.logging;
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
/*    */ public enum Level
/*    */ {
/* 53 */   ALL(System.Logger.Level.ALL),
/* 54 */   FINEST(System.Logger.Level.TRACE),
/* 55 */   FINER(System.Logger.Level.TRACE),
/* 56 */   FINE(System.Logger.Level.DEBUG),
/* 57 */   INFO(System.Logger.Level.INFO),
/* 58 */   WARNING(System.Logger.Level.WARNING),
/* 59 */   SEVERE(System.Logger.Level.ERROR),
/* 60 */   OFF(System.Logger.Level.OFF);
/*    */   final System.Logger.Level systemLevel;
/*    */   
/*    */   Level(System.Logger.Level paramLevel) {
/* 64 */     this.systemLevel = paramLevel;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\logging\PlatformLogger$Level.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */