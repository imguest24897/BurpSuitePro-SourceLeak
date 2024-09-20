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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MemoryLimitException
/*    */   extends XZIOException
/*    */ {
/*    */   private static final long serialVersionUID = 3L;
/*    */   private final int memoryNeeded;
/*    */   private final int memoryLimit;
/*    */   
/*    */   public MemoryLimitException(int memoryNeeded, int memoryLimit) {
/* 35 */     super("" + memoryNeeded + " KiB of memory would be needed; limit was " + memoryLimit + " KiB");
/*    */ 
/*    */     
/* 38 */     this.memoryNeeded = memoryNeeded;
/* 39 */     this.memoryLimit = memoryLimit;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getMemoryNeeded() {
/* 48 */     return this.memoryNeeded;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getMemoryLimit() {
/* 58 */     return this.memoryLimit;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\xz\MemoryLimitException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */