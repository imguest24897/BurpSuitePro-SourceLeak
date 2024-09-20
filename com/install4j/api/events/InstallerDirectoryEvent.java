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
/*    */ public class InstallerDirectoryEvent
/*    */   extends InstallerEvent
/*    */ {
/*    */   private File directory;
/*    */   
/*    */   public InstallerDirectoryEvent(Object source, Context context, EventType type, boolean success, File directory) {
/* 30 */     super(source, context, type, success);
/* 31 */     this.directory = directory;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public File getDirectory() {
/* 39 */     return this.directory;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 44 */     return super.toString() + " [directory " + this.directory + "]";
/*    */   }
/*    */ 
/*    */   
/*    */   public String getVerbose() {
/* 49 */     String ret = super.getVerbose() + ": " + this.directory;
/* 50 */     if (getType() == EventType.DIRECTORY_CREATED) {
/* 51 */       ret = ret + "; exists: " + this.directory.exists();
/*    */     }
/* 53 */     return ret;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\events\InstallerDirectoryEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */