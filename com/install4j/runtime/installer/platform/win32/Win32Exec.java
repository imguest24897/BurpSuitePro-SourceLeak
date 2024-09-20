/*    */ package com.install4j.runtime.installer.platform.win32;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class Win32Exec {
/*    */   static {
/*  8 */     Common.init();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 13 */   private static final char[] ESCAPE_VERIFICATION = new char[] { ' ', '\t', '<', '>' };
/*    */   
/*    */   private static boolean needsEscaping(String arg) {
/* 16 */     for (char escapeChar : ESCAPE_VERIFICATION) {
/* 17 */       if (arg.indexOf(escapeChar) >= 0) {
/* 18 */         return true;
/*    */       }
/*    */     } 
/* 21 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void launch(String... command) throws IOException {
/* 26 */     StringBuilder commandLine = new StringBuilder();
/* 27 */     for (int i = 0; i < command.length; i++) {
/* 28 */       String currentArg = command[i];
/* 29 */       if (commandLine.length() > 0) {
/* 30 */         commandLine.append(" ");
/*    */       }
/* 32 */       if (i == 0 || needsEscaping(currentArg)) {
/* 33 */         commandLine.append("\"").append(currentArg).append("\"");
/*    */       } else {
/* 35 */         commandLine.append(currentArg);
/*    */       } 
/*    */     } 
/* 38 */     if (!(new File(command[0])).isFile()) {
/* 39 */       throw new IOException("not a file " + command[0]);
/*    */     }
/* 41 */     int ret = launch0(command[0], commandLine.toString());
/* 42 */     if (ret != 0)
/* 43 */       throw new IOException("error launching " + command[0] + ", commandLine: " + commandLine + ", error " + ret); 
/*    */   }
/*    */   
/*    */   private static native int launch0(String paramString1, String paramString2);
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\win32\Win32Exec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */