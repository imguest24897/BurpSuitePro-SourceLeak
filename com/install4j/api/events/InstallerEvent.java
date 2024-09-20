/*    */ package com.install4j.api.events;
/*    */ 
/*    */ import com.install4j.api.context.Context;
/*    */ import java.util.EventObject;
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
/*    */ public class InstallerEvent
/*    */   extends EventObject
/*    */ {
/*    */   private transient Context context;
/*    */   private EventType type;
/*    */   private Boolean success;
/*    */   
/*    */   public InstallerEvent(Object source, Context context, EventType type, boolean success) {
/* 29 */     this(source, context, type);
/* 30 */     this.success = Boolean.valueOf(success);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public InstallerEvent(Object source, Context context, EventType type) {
/* 40 */     super(source);
/* 41 */     this.context = context;
/* 42 */     this.type = type;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public EventType getType() {
/* 50 */     return this.type;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Context getContext() {
/* 58 */     return this.context;
/*    */   }
/*    */   
/*    */   public void setContext(Context context) {
/* 62 */     this.context = context;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean wasSuccessful() {
/* 70 */     return (this.success == null || this.success.booleanValue());
/*    */   }
/*    */ 
/*    */   
/*    */   public String toString() {
/* 75 */     return super.toString() + " [type " + this.type + "]";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getVerbose() {
/* 83 */     if (wasSuccessful()) {
/* 84 */       if (this.success == null) {
/* 85 */         return this.type.getOperationVerbose();
/*    */       }
/* 87 */       return this.type.getOperationVerbose() + " successful";
/*    */     } 
/*    */     
/* 90 */     return this.type.getOperationVerbose() + " not successful";
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\api\events\InstallerEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */