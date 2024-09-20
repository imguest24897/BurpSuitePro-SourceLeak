/*    */ package com.install4j.runtime.beans.actions.net;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import com.install4j.runtime.installer.helper.content.TextRequestHandler;
/*    */ import java.io.IOException;
/*    */ import java.net.MalformedURLException;
/*    */ import java.net.URL;
/*    */ 
/*    */ 
/*    */ public class WaitForHttpServerAction
/*    */   extends AbstractWaitForConnectionAction
/*    */ {
/* 15 */   private String url = "";
/*    */   private boolean acceptAllResponseCodes;
/*    */   private String responseCodeVariableName;
/*    */   
/*    */   public String getUrl() {
/* 20 */     return replaceVariables(replaceVariables(this.url));
/*    */   }
/*    */   
/*    */   public void setUrl(String url) {
/* 24 */     this.url = url;
/*    */   }
/*    */   
/*    */   public boolean isAcceptAllResponseCodes() {
/* 28 */     return replaceWithTextOverride("acceptAllResponseCodes", this.acceptAllResponseCodes);
/*    */   }
/*    */   
/*    */   public void setAcceptAllResponseCodes(boolean acceptAllResponseCodes) {
/* 32 */     this.acceptAllResponseCodes = acceptAllResponseCodes;
/*    */   }
/*    */   
/*    */   public String getResponseCodeVariableName() {
/* 36 */     return replaceVariables(this.responseCodeVariableName);
/*    */   }
/*    */   
/*    */   public void setResponseCodeVariableName(String responseCodeVariableName) {
/* 40 */     this.responseCodeVariableName = responseCodeVariableName;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean tryConnect(Context context) throws IOException, UserCanceledException {
/*    */     TextRequestHandler.TextResponse textResponse;
/* 47 */     TextRequestHandler textRequestHandler = new TextRequestHandler(3); 
/* 48 */     try { textRequestHandler.setAcceptAllCertificates(true);
/* 49 */       textRequestHandler.setConnectTimeout(2000);
/* 50 */       textRequestHandler.setReadTimeout(5000);
/* 51 */       textRequestHandler.setReadResponse(false);
/*    */       
/* 53 */       textResponse = textRequestHandler.connect(getUrl()).getTextResponse();
/* 54 */       textRequestHandler.close(); } catch (Throwable throwable) { try { textRequestHandler.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*    */        throw throwable; }
/* 56 */      int responseCode = textResponse.getResponseCode();
/* 57 */     boolean success = (isAcceptAllResponseCodes() || responseCode / 200 == 1);
/* 58 */     if (success && getResponseCodeVariableName() != null) {
/* 59 */       context.setVariable(getResponseCodeVariableName(), Integer.valueOf(responseCode));
/*    */     }
/* 61 */     return success;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean execute(Context context) throws UserCanceledException {
/*    */     try {
/* 67 */       new URL(getUrl());
/* 68 */     } catch (MalformedURLException e) {
/* 69 */       Logger.getInstance().log(e);
/* 70 */       return false;
/*    */     } 
/*    */     
/* 73 */     return super.execute(context);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\net\WaitForHttpServerAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */