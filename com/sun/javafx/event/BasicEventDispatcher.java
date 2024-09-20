/*    */ package com.sun.javafx.event;
/*    */ 
/*    */ import javafx.event.Event;
/*    */ import javafx.event.EventDispatchChain;
/*    */ import javafx.event.EventDispatcher;
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
/*    */ public abstract class BasicEventDispatcher
/*    */   implements EventDispatcher
/*    */ {
/*    */   private BasicEventDispatcher previousDispatcher;
/*    */   private BasicEventDispatcher nextDispatcher;
/*    */   
/*    */   public Event dispatchEvent(Event paramEvent, EventDispatchChain paramEventDispatchChain) {
/* 52 */     paramEvent = dispatchCapturingEvent(paramEvent);
/* 53 */     if (paramEvent.isConsumed()) {
/* 54 */       return null;
/*    */     }
/* 56 */     paramEvent = paramEventDispatchChain.dispatchEvent(paramEvent);
/* 57 */     if (paramEvent != null) {
/* 58 */       paramEvent = dispatchBubblingEvent(paramEvent);
/* 59 */       if (paramEvent.isConsumed()) {
/* 60 */         return null;
/*    */       }
/*    */     } 
/*    */     
/* 64 */     return paramEvent;
/*    */   }
/*    */   
/*    */   public Event dispatchCapturingEvent(Event paramEvent) {
/* 68 */     return paramEvent;
/*    */   }
/*    */   
/*    */   public Event dispatchBubblingEvent(Event paramEvent) {
/* 72 */     return paramEvent;
/*    */   }
/*    */   
/*    */   public final BasicEventDispatcher getPreviousDispatcher() {
/* 76 */     return this.previousDispatcher;
/*    */   }
/*    */   
/*    */   public final BasicEventDispatcher getNextDispatcher() {
/* 80 */     return this.nextDispatcher;
/*    */   }
/*    */ 
/*    */   
/*    */   public final void insertNextDispatcher(BasicEventDispatcher paramBasicEventDispatcher) {
/* 85 */     if (this.nextDispatcher != null) {
/* 86 */       this.nextDispatcher.previousDispatcher = paramBasicEventDispatcher;
/*    */     }
/* 88 */     paramBasicEventDispatcher.nextDispatcher = this.nextDispatcher;
/* 89 */     paramBasicEventDispatcher.previousDispatcher = this;
/* 90 */     this.nextDispatcher = paramBasicEventDispatcher;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\BasicEventDispatcher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */