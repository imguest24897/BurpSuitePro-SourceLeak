/*    */ package com.install4j.runtime.installer.helper.content.xz;
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
/*    */ public class CorruptedInputException
/*    */   extends XZIOException
/*    */ {
/*    */   private static final long serialVersionUID = 3L;
/*    */   
/*    */   public CorruptedInputException() {
/* 25 */     super("Compressed data is corrupt");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public CorruptedInputException(String s) {
/* 35 */     super(s);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\xz\CorruptedInputException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */