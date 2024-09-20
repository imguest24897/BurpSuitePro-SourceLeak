/*    */ package com.install4j.runtime.installer.helper;
/*    */ 
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.helper.console.ConsoleAccess;
/*    */ 
/*    */ public class UnattendedConsoleAccess
/*    */   implements ConsoleAccess {
/*    */   public void print(String text) {
/*  9 */     System.out.print(text);
/*    */   }
/*    */ 
/*    */   
/*    */   public void println(String text) {
/* 14 */     System.out.println(text);
/*    */   }
/*    */ 
/*    */   
/*    */   public void println() {
/* 19 */     System.out.println();
/*    */   }
/*    */ 
/*    */   
/*    */   public void flush() {
/* 24 */     System.out.flush();
/*    */   }
/*    */ 
/*    */   
/*    */   public String readLine(String prompt) throws UserCanceledException {
/* 29 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public String readPassword(String prompt) throws UserCanceledException {
/* 34 */     return null;
/*    */   }
/*    */   
/*    */   public void cancel() {}
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\UnattendedConsoleAccess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */