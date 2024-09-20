/*    */ package com.install4j.runtime.installer.helper.comm.responses;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class Response
/*    */   implements Serializable {
/*    */   private boolean success = true;
/*    */   
/*    */   public Response() {}
/*    */   
/*    */   public Response(boolean success) {
/* 12 */     this.success = success;
/*    */   }
/*    */   
/*    */   public boolean isSuccess() {
/* 16 */     return this.success;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 21 */     return "Response{success=" + this.success + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\responses\Response.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */