/*    */ package com.install4j.runtime.installer.helper.content.apache.archivers.tar;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ public class TarArchiveSparseEntry
/*    */   implements TarConstants
/*    */ {
/*    */   private final boolean isExtended;
/*    */   
/*    */   public TarArchiveSparseEntry(byte[] headerBuf) throws IOException {
/* 55 */     int offset = 0;
/* 56 */     offset += 504;
/* 57 */     this.isExtended = TarUtils.parseBoolean(headerBuf, offset);
/*    */   }
/*    */   
/*    */   public boolean isExtended() {
/* 61 */     return this.isExtended;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\content\apache\archivers\tar\TarArchiveSparseEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */