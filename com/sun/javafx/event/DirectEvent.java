/*    */ package com.sun.javafx.event;
/*    */ 
/*    */ import javafx.event.Event;
/*    */ import javafx.event.EventTarget;
/*    */ import javafx.event.EventType;
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
/*    */ public class DirectEvent
/*    */   extends Event
/*    */ {
/*    */   private static final long serialVersionUID = 20121107L;
/* 40 */   public static final EventType<DirectEvent> DIRECT = new EventType(Event.ANY, "DIRECT");
/*    */   
/*    */   private final Event originalEvent;
/*    */ 
/*    */   
/*    */   public DirectEvent(Event paramEvent) {
/* 46 */     this(paramEvent, null, null);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public DirectEvent(Event paramEvent, Object paramObject, EventTarget paramEventTarget) {
/* 52 */     super(paramObject, paramEventTarget, DIRECT);
/* 53 */     this.originalEvent = paramEvent;
/*    */   }
/*    */   
/*    */   public Event getOriginalEvent() {
/* 57 */     return this.originalEvent;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\DirectEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */