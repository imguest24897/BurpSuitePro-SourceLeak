/*    */ package com.install4j.runtime.installer.helper.comm.impl;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.FetchStringAction;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*    */ import com.install4j.runtime.installer.helper.console.ConsoleAccess;
/*    */ import com.install4j.runtime.installer.helper.console.ConsoleImpl;
/*    */ import java.io.IOException;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class HelperConsoleAccess implements ConsoleAccess, Serializable {
/* 16 */   private transient HelperCommunication helperCommunication = HelperCommunication.getInstance();
/*    */ 
/*    */   
/*    */   public void println(String text) {
/* 20 */     print(text);
/* 21 */     println();
/*    */   }
/*    */ 
/*    */   
/*    */   public void print(final String text) {
/* 26 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*    */         {
/*    */           protected void run(Context context) {
/* 29 */             ConsoleImpl.getInstance().getConsoleAccess().print(text);
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public void println() {
/* 36 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*    */         {
/*    */           protected void run(Context context) {
/* 39 */             ConsoleImpl.getInstance().getConsoleAccess().println();
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public void flush() {
/* 46 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*    */         {
/*    */           protected void run(Context context) {
/* 49 */             ConsoleImpl.getInstance().getConsoleAccess().flush();
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public String readLine(final String prompt) throws UserCanceledException {
/*    */     try {
/* 57 */       return this.helperCommunication.fetchStringChecked(ExecutionContext.UNELEVATED, new FetchStringAction()
/*    */           {
/*    */             protected String fetchValue(Context context) throws UserCanceledException {
/* 60 */               return ConsoleImpl.getInstance().getConsoleAccess().readLine(prompt);
/*    */             }
/*    */           });
/* 63 */     } catch (IOException e) {
/* 64 */       throw new RuntimeException(e);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public String readPassword(final String prompt) throws UserCanceledException {
/*    */     try {
/* 71 */       return this.helperCommunication.fetchStringChecked(ExecutionContext.UNELEVATED, new FetchStringAction()
/*    */           {
/*    */             protected String fetchValue(Context context) throws UserCanceledException {
/* 74 */               return ConsoleImpl.getInstance().getConsoleAccess().readPassword(prompt);
/*    */             }
/*    */           });
/* 77 */     } catch (IOException e) {
/* 78 */       throw new RuntimeException(e);
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void cancel() {
/* 84 */     this.helperCommunication.executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*    */         {
/*    */           protected void run(Context context) {
/* 87 */             ConsoleImpl.getInstance().getConsoleAccess().cancel();
/*    */           }
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\impl\HelperConsoleAccess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */