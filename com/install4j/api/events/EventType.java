/*     */ package com.install4j.api.events;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public enum EventType
/*     */ {
/*  14 */   BEFORE_EXECUTE_ACTION("Before execute action", "Execute action"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  19 */   AFTER_EXECUTE_ACTION("After execute action", "Execute action"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  24 */   BEFORE_ROLLBACK_ACTION("Before rollback action", "Rollback action"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  29 */   AFTER_ROLLBACK_ACTION("After rollback action", "Rollback action finished"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  34 */   BEFORE_INSTALL_FILE("Before install file", "Install file"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   AFTER_INSTALL_FILE("After install file", "Install file"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  44 */   DIRECTORY_CREATED("After create directory", "Created directory"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  49 */   BEFORE_DOWNLOAD("Before a download", "Download"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  54 */   AFTER_DOWNLOAD("After a download", "Download"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  59 */   SHOW_SCREEN("Show screen"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  64 */   FINISHING("Finishing"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  69 */   FINISHED("Finished"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  74 */   CANCELLING("Cancelling"),
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  79 */   CANCELED("Canceled"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  85 */   VARIABLE_CHANGED("Variable changed"),
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  92 */   FILE_INSTALLATION_STARTED("File installation started");
/*     */ 
/*     */   
/*     */   private final String eventVerbose;
/*     */ 
/*     */   
/*     */   private final String operationVerbose;
/*     */ 
/*     */   
/*     */   EventType(String eventVerbose, String operationVerbose) {
/* 102 */     this.operationVerbose = operationVerbose;
/* 103 */     this.eventVerbose = eventVerbose;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getOperationVerbose() {
/* 111 */     return this.operationVerbose;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 116 */     return this.eventVerbose;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\events\EventType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */