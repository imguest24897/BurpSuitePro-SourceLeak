/*    */ package com.install4j.api.windows;
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
/*    */ public enum ElevationState
/*    */ {
/* 15 */   ELEVATION_STATE_NOT_APPLICABLE(0),
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 21 */   ELEVATION_STATE_DEFAULT(1),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 26 */   ELEVATION_STATE_LIMITED(3),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 31 */   ELEVATION_STATE_FULL(2);
/*    */   
/*    */   private final int intValue;
/*    */   
/*    */   ElevationState(int intValue) {
/* 36 */     this.intValue = intValue;
/*    */   }
/*    */   
/*    */   static ElevationState getFromIntValue(int intValue) {
/* 40 */     for (ElevationState elevationState : values()) {
/* 41 */       if (elevationState.intValue == intValue) {
/* 42 */         return elevationState;
/*    */       }
/*    */     } 
/* 45 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 50 */     return "ElevationState{intValue=" + this.intValue + '}';
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\windows\ElevationState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */