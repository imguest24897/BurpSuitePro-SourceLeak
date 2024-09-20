/*     */ package com.sun.javafx.event;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CopyOnWriteArrayList;
/*     */ import javafx.event.Event;
/*     */ import javafx.event.EventDispatcher;
/*     */ import javafx.event.EventType;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EventRedirector
/*     */   extends BasicEventDispatcher
/*     */ {
/*     */   private final EventDispatchChainImpl eventDispatchChain;
/*     */   private final List<EventDispatcher> eventDispatchers;
/*     */   private final Object eventSource;
/*     */   
/*     */   public EventRedirector(Object paramObject) {
/*  69 */     this.eventDispatchers = new CopyOnWriteArrayList<>();
/*  70 */     this.eventDispatchChain = new EventDispatchChainImpl();
/*  71 */     this.eventSource = paramObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void handleRedirectedEvent(Object paramObject, Event paramEvent) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void addEventDispatcher(EventDispatcher paramEventDispatcher) {
/*  87 */     this.eventDispatchers.add(paramEventDispatcher);
/*     */   }
/*     */ 
/*     */   
/*     */   public final void removeEventDispatcher(EventDispatcher paramEventDispatcher) {
/*  92 */     this.eventDispatchers.remove(paramEventDispatcher);
/*     */   }
/*     */ 
/*     */   
/*     */   public final Event dispatchCapturingEvent(Event paramEvent) {
/*  97 */     EventType<DirectEvent> eventType = paramEvent.getEventType();
/*     */     
/*  99 */     if (eventType == DirectEvent.DIRECT) {
/*     */       
/* 101 */       paramEvent = ((DirectEvent)paramEvent).getOriginalEvent();
/*     */     } else {
/* 103 */       redirectEvent(paramEvent);
/*     */       
/* 105 */       if (eventType == RedirectedEvent.REDIRECTED) {
/* 106 */         handleRedirectedEvent(paramEvent
/* 107 */             .getSource(), ((RedirectedEvent)paramEvent)
/* 108 */             .getOriginalEvent());
/*     */       }
/*     */     } 
/*     */     
/* 112 */     return paramEvent;
/*     */   }
/*     */   
/*     */   private void redirectEvent(Event paramEvent) {
/* 116 */     if (!this.eventDispatchers.isEmpty()) {
/*     */ 
/*     */ 
/*     */       
/* 120 */       RedirectedEvent redirectedEvent = (paramEvent.getEventType() == RedirectedEvent.REDIRECTED) ? (RedirectedEvent)paramEvent : new RedirectedEvent(paramEvent, this.eventSource, null);
/*     */       
/* 122 */       for (EventDispatcher eventDispatcher : this.eventDispatchers) {
/* 123 */         this.eventDispatchChain.reset();
/* 124 */         eventDispatcher.dispatchEvent(redirectedEvent, this.eventDispatchChain);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\EventRedirector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */