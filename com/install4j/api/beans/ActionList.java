/*    */ package com.install4j.api.beans;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ActionList
/*    */   implements Serializable
/*    */ {
/*    */   private String id;
/*    */   private boolean breakOnError = false;
/*    */   
/*    */   public String getId() {
/* 18 */     return this.id;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setId(String id) {
/* 25 */     this.id = id;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isBreakOnError() {
/* 33 */     return this.breakOnError;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setBreakOnError(boolean breakOnError) {
/* 41 */     this.breakOnError = breakOnError;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beans\ActionList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */