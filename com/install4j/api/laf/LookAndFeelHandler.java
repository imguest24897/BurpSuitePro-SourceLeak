/*    */ package com.install4j.api.laf;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public interface LookAndFeelHandler
/*    */   extends LookAndFeelEnhancer
/*    */ {
/*    */   void applyLookAndFeel(boolean paramBoolean) throws Exception;
/*    */   
/*    */   default void setDark(boolean dark) {
/* 39 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\laf\LookAndFeelHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */