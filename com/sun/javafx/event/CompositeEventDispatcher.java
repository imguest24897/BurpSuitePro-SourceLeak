/*    */ package com.sun.javafx.event;
/*    */ 
/*    */ import javafx.event.Event;
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
/*    */ public abstract class CompositeEventDispatcher
/*    */   extends BasicEventDispatcher
/*    */ {
/*    */   public abstract BasicEventDispatcher getFirstDispatcher();
/*    */   
/*    */   public abstract BasicEventDispatcher getLastDispatcher();
/*    */   
/*    */   public final Event dispatchCapturingEvent(Event paramEvent) {
/* 41 */     BasicEventDispatcher basicEventDispatcher = getFirstDispatcher();
/* 42 */     while (basicEventDispatcher != null) {
/* 43 */       paramEvent = basicEventDispatcher.dispatchCapturingEvent(paramEvent);
/* 44 */       if (paramEvent.isConsumed()) {
/*    */         break;
/*    */       }
/*    */       
/* 48 */       basicEventDispatcher = basicEventDispatcher.getNextDispatcher();
/*    */     } 
/*    */     
/* 51 */     return paramEvent;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public final Event dispatchBubblingEvent(Event paramEvent) {
/* 57 */     BasicEventDispatcher basicEventDispatcher = getLastDispatcher();
/* 58 */     while (basicEventDispatcher != null) {
/* 59 */       paramEvent = basicEventDispatcher.dispatchBubblingEvent(paramEvent);
/* 60 */       if (paramEvent.isConsumed()) {
/*    */         break;
/*    */       }
/*    */       
/* 64 */       basicEventDispatcher = basicEventDispatcher.getPreviousDispatcher();
/*    */     } 
/*    */     
/* 67 */     return paramEvent;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\CompositeEventDispatcher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */