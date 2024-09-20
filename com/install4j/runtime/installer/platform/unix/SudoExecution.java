/*    */ package com.install4j.runtime.installer.platform.unix;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.PrintWriter;
/*    */ 
/*    */ public class SudoExecution {
/*  7 */   private static String password = "";
/*    */   private static boolean passwordSet = false;
/*    */   
/*    */   public static boolean checkPassword(String password) throws IOException {
/* 11 */     if (UnixUserInfo.ROOT_USER) {
/* 12 */       return true;
/*    */     }
/*    */     
/* 15 */     SudoExecution.password = password;
/* 16 */     Process p = Runtime.getRuntime().exec(new String[] { "sudo", "-k" });
/*    */     try {
/* 18 */       p.waitFor();
/* 19 */     } catch (InterruptedException interruptedException) {}
/* 20 */     p = Runtime.getRuntime().exec(new String[] { "sudo", "-S", "-v" });
/* 21 */     PrintWriter pw = new PrintWriter(p.getOutputStream(), true);
/* 22 */     pw.println(password);
/* 23 */     pw.close();
/* 24 */     int retVal = 0;
/*    */     try {
/* 26 */       retVal = p.waitFor();
/* 27 */     } catch (InterruptedException interruptedException) {}
/* 28 */     passwordSet = (retVal == 0);
/* 29 */     return passwordSet;
/*    */   }
/*    */   
/*    */   public static boolean executeAndWait(String[] userCommand) throws IOException {
/* 33 */     return Execution.executeAndWait(getCommand(userCommand), null);
/*    */   }
/*    */   
/*    */   public static Process execute(String[] userCommand) throws IOException {
/* 37 */     return Execution.execute(getCommand(userCommand));
/*    */   }
/*    */   
/*    */   private static String[] getCommand(String[] userCommand) throws IOException {
/* 41 */     if (UnixUserInfo.ROOT_USER) {
/* 42 */       return userCommand;
/*    */     }
/* 44 */     String[] command = new String[userCommand.length + 1];
/* 45 */     command[0] = "sudo";
/* 46 */     System.arraycopy(userCommand, 0, command, 1, userCommand.length);
/*    */     
/* 48 */     if (!passwordSet) {
/* 49 */       throw new IOException("call checkPassword first.");
/*    */     }
/* 51 */     checkPassword(password);
/* 52 */     return command;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platfor\\unix\SudoExecution.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */