/*    */ package com.install4j.api.events;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import java.util.List;
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
/*    */ public class InstallerActionEvent
/*    */   extends InstallerEvent
/*    */ {
/*    */   private final String actionId;
/*    */   private long duration;
/*    */   private Exception exception;
/*    */   private List<String> log;
/*    */   
/*    */   public InstallerActionEvent(Object source, Context context, EventType type, boolean success, String actionId, long duration, Exception exception, List<String> log) {
/* 35 */     super(source, context, type, success);
/* 36 */     this.actionId = actionId;
/* 37 */     this.duration = duration;
/* 38 */     this.exception = exception;
/* 39 */     this.log = log;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getActionId() {
/* 47 */     return this.actionId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Exception getException() {
/* 55 */     return this.exception;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List<String> getLog() {
/* 63 */     return this.log;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public long getDuration() {
/* 71 */     return this.duration;
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 76 */     return super.toString() + "[id " + this.actionId + "][duration " + this.duration + " ms]";
/*    */   }
/*    */ 
/*    */   
/*    */   public String getVerbose() {
/* 81 */     return super.getVerbose() + " after " + this.duration + " ms";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\events\InstallerActionEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */