/*    */ package com.install4j.runtime.installer.platform.macos;
/*    */ 
/*    */ import java.io.PrintWriter;
/*    */ import java.io.StringWriter;
/*    */ 
/*    */ public class MacLog {
/*    */   static {
/*  8 */     MacNative.init1012();
/*    */   }
/*    */ 
/*    */   
/*    */   public static void log(String message) {
/* 13 */     if (MacNative.MACOS_10_12_PLUS) {
/* 14 */       log0(message);
/*    */     } else {
/* 16 */       System.err.println(message);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void log(Throwable throwable) {
/* 21 */     log("", throwable);
/*    */   }
/*    */   
/*    */   public static void log(String prefix, Throwable throwable) {
/* 25 */     StringWriter stringWriter = new StringWriter();
/* 26 */     PrintWriter printWriter = new PrintWriter(stringWriter);
/* 27 */     printWriter.print(prefix);
/* 28 */     throwable.printStackTrace(printWriter);
/* 29 */     printWriter.close();
/* 30 */     log(stringWriter.toString());
/*    */   }
/*    */   
/*    */   private static native void log0(String paramString);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\MacLog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */