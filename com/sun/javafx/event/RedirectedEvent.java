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
/*    */ public class RedirectedEvent
/*    */   extends Event
/*    */ {
/*    */   private static final long serialVersionUID = 20121107L;
/* 40 */   public static final EventType<RedirectedEvent> REDIRECTED = new EventType(Event.ANY, "REDIRECTED");
/*    */   
/*    */   private final Event originalEvent;
/*    */ 
/*    */   
/*    */   public RedirectedEvent(Event paramEvent) {
/* 46 */     this(paramEvent, null, null);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public RedirectedEvent(Event paramEvent, Object paramObject, EventTarget paramEventTarget) {
/* 52 */     super(paramObject, paramEventTarget, REDIRECTED);
/* 53 */     this.originalEvent = paramEvent;
/*    */   }
/*    */   
/*    */   public Event getOriginalEvent() {
/* 57 */     return this.originalEvent;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\RedirectedEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */