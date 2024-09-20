/*    */ package com.install4j.api.events;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import java.io.File;
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
/*    */ public class InstallerFileEvent
/*    */   extends InstallerEvent
/*    */ {
/*    */   private File destinationFile;
/*    */   private long fileSize;
/*    */   
/*    */   public InstallerFileEvent(Object source, Context context, EventType type, boolean success, File destinationFile, long fileSize) {
/* 32 */     super(source, context, type, success);
/* 33 */     this.destinationFile = destinationFile;
/* 34 */     this.fileSize = fileSize;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public InstallerFileEvent(Object source, Context context, EventType type, File destinationFile, long fileSize) {
/* 46 */     super(source, context, type);
/* 47 */     this.destinationFile = destinationFile;
/* 48 */     this.fileSize = fileSize;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public File getDestinationFile() {
/* 56 */     return this.destinationFile;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getFileSize() {
/* 64 */     return this.fileSize;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 69 */     return super.toString() + " [file " + this.destinationFile + ", size " + this.fileSize + "]";
/*    */   }
/*    */ 
/*    */   
/*    */   public String getVerbose() {
/* 74 */     String ret = super.getVerbose() + ": " + this.destinationFile;
/* 75 */     if (getType() == EventType.BEFORE_INSTALL_FILE) {
/* 76 */       ret = ret + "; size: " + this.fileSize + " bytes; exists: " + this.destinationFile.exists();
/*    */     }
/* 78 */     return ret;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\events\InstallerFileEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */