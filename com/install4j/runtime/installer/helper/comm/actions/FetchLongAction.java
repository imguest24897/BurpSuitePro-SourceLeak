/*    */ package com.install4j.runtime.installer.helper.comm.actions;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.installer.helper.comm.responses.LongResponse;
/*    */ import com.install4j.runtime.installer.helper.comm.responses.Response;
/*    */ 
/*    */ public abstract class FetchLongAction
/*    */   extends CommunicationAction {
/*    */   protected abstract long fetchValue(Context paramContext) throws Exception;
/*    */   
/*    */   public Response execute(Context context) throws Exception {
/* 12 */     return (Response)new LongResponse(fetchValue(context));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\actions\FetchLongAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */