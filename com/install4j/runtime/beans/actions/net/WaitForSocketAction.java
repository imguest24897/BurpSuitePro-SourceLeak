/*    */ package com.install4j.runtime.beans.actions.net;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import com.install4j.api.context.UserCanceledException;
/*    */ import com.install4j.runtime.installer.helper.Logger;
/*    */ import java.io.IOException;
/*    */ import java.net.InetSocketAddress;
/*    */ import java.net.Socket;
/*    */ 
/*    */ public class WaitForSocketAction
/*    */   extends AbstractWaitForConnectionAction
/*    */ {
/* 13 */   private String host = "localhost";
/* 14 */   private String port = "";
/*    */   
/*    */   public String getHost() {
/* 17 */     return replaceVariables(replaceVariables(this.host));
/*    */   }
/*    */   
/*    */   public void setHost(String host) {
/* 21 */     this.host = host;
/*    */   }
/*    */   
/*    */   public String getPort() {
/* 25 */     return replaceVariables(replaceVariables(this.port));
/*    */   }
/*    */   
/*    */   public void setPort(String port) {
/* 29 */     this.port = port;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean tryConnect(Context context) throws IOException, UserCanceledException {
/*    */     int port;
/*    */     try {
/* 37 */       port = Integer.parseInt(getPort());
/* 38 */     } catch (NumberFormatException e) {
/* 39 */       Logger.getInstance().log(this, "The port \"" + getPort() + "\" is invalid.", false);
/* 40 */       return false;
/*    */     } 
/*    */     
/* 43 */     Socket socket = new Socket();
/* 44 */     socket.connect(new InetSocketAddress(getHost(), port), 1000);
/*    */     
/* 46 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\beans\actions\net\WaitForSocketAction.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */