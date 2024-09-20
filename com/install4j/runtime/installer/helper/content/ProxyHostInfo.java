/*    */ package com.install4j.runtime.installer.helper.content;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class ProxyHostInfo implements Serializable {
/*    */   private String host;
/*    */   private int port;
/*    */   
/*    */   public ProxyHostInfo(String host, int port) {
/* 10 */     this.host = host;
/* 11 */     this.port = port;
/*    */   }
/*    */   
/*    */   public String getHost() {
/* 15 */     return this.host;
/*    */   }
/*    */   
/*    */   public int getPort() {
/* 19 */     return this.port;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 24 */     return "ProxyHostInfo{host='" + this.host + '\'' + ", port=" + this.port + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\ProxyHostInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */