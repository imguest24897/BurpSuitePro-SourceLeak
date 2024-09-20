/*    */ package com.install4j.api.beaninfo;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum ActionElevationType
/*    */ {
/* 15 */   INHERIT(1),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 20 */   NONE(2),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 25 */   ELEVATE(3);
/*    */   
/*    */   private final int id;
/*    */   
/*    */   ActionElevationType(int id) {
/* 30 */     this.id = id;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getId() {
/* 38 */     return this.id;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\beaninfo\ActionElevationType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */