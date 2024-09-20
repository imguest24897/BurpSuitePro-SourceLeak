/*    */ package com.install4j.api.events;
/*    */ 
/*    */ import com.install4j.api.context.Context;
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
/*    */ public class InstallerFileInstallationEvent
/*    */   extends InstallerEvent
/*    */ {
/*    */   private long totalSize;
/*    */   private long fileCount;
/*    */   
/*    */   public InstallerFileInstallationEvent(Object source, Context context, EventType type, long totalSize, long fileCount) {
/* 29 */     super(source, context, type, true);
/* 30 */     this.totalSize = totalSize;
/* 31 */     this.fileCount = fileCount;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getTotalSize() {
/* 39 */     return this.totalSize;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getFileCount() {
/* 47 */     return this.fileCount;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 52 */     return super.toString() + " [total size: " + this.totalSize + " bytes, file count: " + this.fileCount + "]";
/*    */   }
/*    */ 
/*    */   
/*    */   public String getVerbose() {
/* 57 */     return super.getVerbose() + ": total size: " + this.totalSize + " bytes; file count: " + this.fileCount;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\events\InstallerFileInstallationEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */