/*    */ package com.install4j.runtime.installer.frontend;
/*    */ 
/*    */ import com.install4j.api.laf.LookAndFeelHandler;
/*    */ 
/*    */ public class IntelliJLookAndFeelHandler
/*    */   implements LookAndFeelHandler {
/*    */   private boolean dark;
/*    */   
/*    */   public IntelliJLookAndFeelHandler(boolean dark) {
/* 10 */     this.dark = dark;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isDark() {
/* 15 */     return this.dark;
/*    */   }
/*    */ 
/*    */   
/*    */   public void applyLookAndFeel(boolean darkDesktop) throws Exception {
/* 20 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isWideTreeSelection() {
/* 25 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\frontend\IntelliJLookAndFeelHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */