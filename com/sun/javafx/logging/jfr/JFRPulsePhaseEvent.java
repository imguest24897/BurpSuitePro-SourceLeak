/*    */ package com.sun.javafx.logging.jfr;
/*    */ 
/*    */ import jdk.jfr.Category;
/*    */ import jdk.jfr.Description;
/*    */ import jdk.jfr.Enabled;
/*    */ import jdk.jfr.Event;
/*    */ import jdk.jfr.Label;
/*    */ import jdk.jfr.Name;
/*    */ import jdk.jfr.StackTrace;
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
/*    */ @Name("javafx.PulsePhase")
/*    */ @Label("JavaFX Pulse Phase")
/*    */ @Category({"JavaFX"})
/*    */ @Description("Describes a phase in JavaFX pulse processing")
/*    */ @StackTrace(false)
/*    */ @Enabled(false)
/*    */ public final class JFRPulsePhaseEvent
/*    */   extends Event
/*    */ {
/*    */   @PulseId
/*    */   @Label("Pulse Id")
/*    */   private int pulseId;
/*    */   @Label("Phase Name")
/*    */   private String phaseName;
/*    */   
/*    */   public int getPulseId() {
/* 51 */     return this.pulseId;
/*    */   }
/*    */   
/*    */   public void setPulseId(int paramInt) {
/* 55 */     this.pulseId = paramInt;
/*    */   }
/*    */   
/*    */   public String getPhaseName() {
/* 59 */     return this.phaseName;
/*    */   }
/*    */   
/*    */   public void setPhaseName(String paramString) {
/* 63 */     this.phaseName = paramString;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\logging\jfr\JFRPulsePhaseEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */