/*    */ package com.install4j.runtime.installer.helper.comm.impl;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import com.install4j.runtime.installer.helper.comm.ExecutionContext;
/*    */ import com.install4j.runtime.installer.helper.comm.HelperCommunication;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.CommunicationAction;
/*    */ import com.install4j.runtime.installer.helper.comm.actions.RunAction;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class HelperLoggerImpl
/*    */   extends Logger implements Serializable {
/*    */   public void log(final Throwable e) {
/* 14 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*    */         {
/*    */           protected void run(Context context) {
/* 17 */             Logger instance = Logger.getInstance();
/* 18 */             if (instance instanceof HelperLoggerImpl) {
/* 19 */               e.printStackTrace();
/*    */             } else {
/* 21 */               instance.log(e);
/*    */             } 
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   public void log(Object source, final String text, final boolean success) {
/* 29 */     HelperCommunication.getInstance().executeAction(ExecutionContext.UNELEVATED, (CommunicationAction)new RunAction()
/*    */         {
/*    */           protected void run(Context context) {
/* 32 */             Logger instance = Logger.getInstance();
/* 33 */             if (instance instanceof HelperLoggerImpl) {
/* 34 */               System.err.println(text);
/*    */             } else {
/* 36 */               Logger.getInstance().log(null, text, success);
/*    */             } 
/*    */           }
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\impl\HelperLoggerImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */