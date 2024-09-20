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
/*    */ @Name("javafx.Input")
/*    */ @Label("JavaFX Input")
/*    */ @Category({"JavaFX"})
/*    */ @Description("JavaFX input event")
/*    */ @StackTrace(false)
/*    */ @Enabled(false)
/*    */ public final class JFRInputEvent
/*    */   extends Event
/*    */ {
/*    */   @Label("Input Type")
/*    */   @Description("Input event type")
/*    */   private String input;
/*    */   
/*    */   public String getInput() {
/* 48 */     return this.input;
/*    */   }
/*    */   
/*    */   public void setInput(String paramString) {
/* 52 */     this.input = paramString;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\logging\jfr\JFRInputEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */