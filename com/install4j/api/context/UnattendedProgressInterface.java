/*    */ package com.install4j.api.context;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface UnattendedProgressInterface
/*    */   extends ProgressInterface
/*    */ {
/*    */   void setVisible(boolean paramBoolean);
/*    */   
/*    */   void setCancelButtonEnabled(boolean paramBoolean);
/*    */   
/*    */   void setCancelButtonVisible(boolean paramBoolean);
/*    */   
/*    */   @Deprecated
/*    */   default boolean isAskForProxy() {
/* 41 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\context\UnattendedProgressInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */