/*    */ package com.install4j.runtime.installer.helper.comm.actions;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.runtime.installer.helper.comm.responses.ObjectResponse;
/*    */ import com.install4j.runtime.installer.helper.comm.responses.Response;
/*    */ import com.install4j.runtime.installer.helper.comm.responses.ThrowableResponse;
/*    */ 
/*    */ public abstract class FetchObjectAction<T>
/*    */   extends CommunicationAction {
/*    */   protected abstract T fetchValue(Context paramContext) throws Exception;
/*    */   
/*    */   public Response execute(Context context) throws Exception {
/*    */     try {
/* 14 */       return (Response)new ObjectResponse(fetchValue(context));
/* 15 */     } catch (Throwable t) {
/* 16 */       return (Response)new ThrowableResponse(t);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\actions\FetchObjectAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */