/*    */ package com.install4j.runtime.installer.platform.unix;
/*    */ import com.install4j.runtime.installer.helper.InstallerUtil;
/*    */ import java.io.BufferedOutputStream;
/*    */ import java.io.File;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ import java.nio.charset.StandardCharsets;
/*    */ 
/*    */ public class Execution {
/*    */   public static boolean executeAndWait(String[] command, StringBuffer output) throws IOException {
/* 12 */     return (executeWithReturnCode(command, output, false) == 0);
/*    */   }
/*    */   
/*    */   public static int executeWithReturnCode(String[] command, StringBuffer output, boolean utf8) throws IOException {
/* 16 */     return executeWithReturnCode(command, output, output, utf8);
/*    */   }
/*    */   
/*    */   public static int executeWithReturnCode(String[] command, StringBuffer output, StringBuffer error, boolean utf8) throws IOException {
/* 20 */     if (InstallerUtil.isWindows()) {
/* 21 */       Process process1 = (new ProcessBuilder(command)).start();
/* 22 */       return handleProcess(process1, output, error, utf8);
/*    */     } 
/* 24 */     File scriptFile = File.createTempFile("i4j", ".sh");
/* 25 */     Process process = executeWithScript(command, scriptFile);
/* 26 */     int ret = handleProcess(process, output, error, utf8);
/* 27 */     scriptFile.delete();
/* 28 */     return ret;
/*    */   }
/*    */ 
/*    */   
/*    */   public static Process execute(String[] command) throws IOException {
/* 33 */     if (InstallerUtil.isMacOS()) {
/* 34 */       File scriptFile = File.createTempFile("i4j", ".sh");
/* 35 */       return executeWithScript(command, scriptFile);
/*    */     } 
/* 37 */     return (new ProcessBuilder(command)).start();
/*    */   }
/*    */ 
/*    */   
/*    */   private static int handleProcess(Process process, StringBuffer output, StringBuffer error, boolean utf8) throws IOException {
/*    */     try {
/* 43 */       StreamConsumerThread.consumeOutput(process, output, error, utf8);
/* 44 */       return process.waitFor();
/*    */     }
/* 46 */     catch (InterruptedException e) {
/* 47 */       return 1;
/*    */     } finally {
/* 49 */       process.destroy();
/*    */     } 
/*    */   }
/*    */   
/*    */   private static Process executeWithScript(String[] command, File scriptFile) throws IOException {
/* 54 */     PrintWriter pw = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(scriptFile)), StandardCharsets.UTF_8));
/*    */ 
/*    */     
/* 57 */     pw.println("#!/bin/sh");
/* 58 */     for (int i = 0; i < command.length; i++) {
/* 59 */       pw.print("\"" + command[i] + "\"");
/* 60 */       if (i < command.length - 1) {
/* 61 */         pw.print(" ");
/*    */       }
/*    */     } 
/* 64 */     pw.println();
/* 65 */     pw.close();
/*    */     
/* 67 */     String[] cmd = new String[2];
/* 68 */     cmd[0] = "/bin/sh";
/* 69 */     cmd[1] = scriptFile.getAbsolutePath();
/*    */     
/* 71 */     return (new ProcessBuilder(cmd)).start();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platfor\\unix\Execution.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */