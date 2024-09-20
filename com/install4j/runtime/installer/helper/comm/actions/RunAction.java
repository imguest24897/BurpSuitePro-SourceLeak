/*    */ package com.install4j.runtime.installer.helper.comm.actions;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.installer.helper.comm.responses.Response;
/*    */ 
/*    */ public abstract class RunAction
/*    */   extends CommunicationAction {
/*    */   protected abstract void run(Context paramContext) throws Exception;
/*    */   
/*    */   public Response execute(Context context) throws Exception {
/* 11 */     run(context);
/* 12 */     return new Response();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\actions\RunAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */