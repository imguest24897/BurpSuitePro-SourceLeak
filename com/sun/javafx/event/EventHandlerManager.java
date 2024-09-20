/*     */ package com.sun.javafx.event;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import javafx.event.Event;
/*     */ import javafx.event.EventHandler;
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
/*     */ public class EventHandlerManager
/*     */   extends BasicEventDispatcher
/*     */ {
/*     */   private final Map<EventType<? extends Event>, CompositeEventHandler<? extends Event>> eventHandlerMap;
/*     */   private final Object eventSource;
/*     */   
/*     */   public EventHandlerManager(Object paramObject) {
/*  47 */     this.eventSource = paramObject;
/*     */     
/*  49 */     this.eventHandlerMap = new HashMap<>();
/*     */   }
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
/*     */   public final <T extends Event> void addEventHandler(EventType<T> paramEventType, EventHandler<? super T> paramEventHandler) {
/*  63 */     validateEventType(paramEventType);
/*  64 */     validateEventHandler(paramEventHandler);
/*     */ 
/*     */     
/*  67 */     CompositeEventHandler<T> compositeEventHandler = createGetCompositeEventHandler(paramEventType);
/*     */     
/*  69 */     compositeEventHandler.addEventHandler(paramEventHandler);
/*     */   }
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
/*     */   public final <T extends Event> void removeEventHandler(EventType<T> paramEventType, EventHandler<? super T> paramEventHandler) {
/*  83 */     validateEventType(paramEventType);
/*  84 */     validateEventHandler(paramEventHandler);
/*     */ 
/*     */     
/*  87 */     CompositeEventHandler<T> compositeEventHandler = (CompositeEventHandler)this.eventHandlerMap.get(paramEventType);
/*     */     
/*  89 */     if (compositeEventHandler != null) {
/*  90 */       compositeEventHandler.removeEventHandler(paramEventHandler);
/*     */     }
/*     */   }
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
/*     */   public final <T extends Event> void addEventFilter(EventType<T> paramEventType, EventHandler<? super T> paramEventHandler) {
/* 105 */     validateEventType(paramEventType);
/* 106 */     validateEventFilter(paramEventHandler);
/*     */ 
/*     */     
/* 109 */     CompositeEventHandler<T> compositeEventHandler = createGetCompositeEventHandler(paramEventType);
/*     */     
/* 111 */     compositeEventHandler.addEventFilter(paramEventHandler);
/*     */   }
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
/*     */   public final <T extends Event> void removeEventFilter(EventType<T> paramEventType, EventHandler<? super T> paramEventHandler) {
/* 125 */     validateEventType(paramEventType);
/* 126 */     validateEventFilter(paramEventHandler);
/*     */ 
/*     */     
/* 129 */     CompositeEventHandler<T> compositeEventHandler = (CompositeEventHandler)this.eventHandlerMap.get(paramEventType);
/*     */     
/* 131 */     if (compositeEventHandler != null) {
/* 132 */       compositeEventHandler.removeEventFilter(paramEventHandler);
/*     */     }
/*     */   }
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
/*     */   public final <T extends Event> void setEventHandler(EventType<T> paramEventType, EventHandler<? super T> paramEventHandler) {
/* 148 */     validateEventType(paramEventType);
/*     */ 
/*     */     
/* 151 */     CompositeEventHandler<Event> compositeEventHandler = (CompositeEventHandler)this.eventHandlerMap.get(paramEventType);
/*     */     
/* 153 */     if (compositeEventHandler == null) {
/* 154 */       if (paramEventHandler == null) {
/*     */         return;
/*     */       }
/* 157 */       compositeEventHandler = new CompositeEventHandler<>();
/* 158 */       this.eventHandlerMap.put(paramEventType, compositeEventHandler);
/*     */     } 
/*     */     
/* 161 */     compositeEventHandler.setEventHandler(paramEventHandler);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final <T extends Event> EventHandler<? super T> getEventHandler(EventType<T> paramEventType) {
/* 167 */     CompositeEventHandler<T> compositeEventHandler = (CompositeEventHandler)this.eventHandlerMap.get(paramEventType);
/*     */     
/* 169 */     return (compositeEventHandler != null) ? 
/* 170 */       compositeEventHandler.getEventHandler() : 
/* 171 */       null;
/*     */   }
/*     */ 
/*     */   
/*     */   public final Event dispatchCapturingEvent(Event paramEvent) {
/* 176 */     EventType<? extends Event> eventType = paramEvent.getEventType();
/*     */     do {
/* 178 */       paramEvent = dispatchCapturingEvent(eventType, paramEvent);
/* 179 */       eventType = eventType.getSuperType();
/* 180 */     } while (eventType != null);
/*     */     
/* 182 */     return paramEvent;
/*     */   }
/*     */ 
/*     */   
/*     */   public final Event dispatchBubblingEvent(Event paramEvent) {
/* 187 */     EventType<? extends Event> eventType = paramEvent.getEventType();
/*     */     do {
/* 189 */       paramEvent = dispatchBubblingEvent(eventType, paramEvent);
/* 190 */       eventType = eventType.getSuperType();
/* 191 */     } while (eventType != null);
/*     */     
/* 193 */     return paramEvent;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private <T extends Event> CompositeEventHandler<T> createGetCompositeEventHandler(EventType<T> paramEventType) {
/* 199 */     CompositeEventHandler<Event> compositeEventHandler = (CompositeEventHandler)this.eventHandlerMap.get(paramEventType);
/* 200 */     if (compositeEventHandler == null) {
/* 201 */       compositeEventHandler = new CompositeEventHandler<>();
/* 202 */       this.eventHandlerMap.put(paramEventType, compositeEventHandler);
/*     */     } 
/*     */     
/* 205 */     return (CompositeEventHandler)compositeEventHandler;
/*     */   }
/*     */   
/*     */   protected Object getEventSource() {
/* 209 */     return this.eventSource;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Event dispatchCapturingEvent(EventType<? extends Event> paramEventType, Event paramEvent) {
/* 215 */     CompositeEventHandler compositeEventHandler = this.eventHandlerMap.get(paramEventType);
/*     */     
/* 217 */     if (compositeEventHandler != null && compositeEventHandler.hasFilter()) {
/* 218 */       paramEvent = fixEventSource(paramEvent, this.eventSource);
/* 219 */       compositeEventHandler.dispatchCapturingEvent(paramEvent);
/*     */     } 
/*     */     
/* 222 */     return paramEvent;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Event dispatchBubblingEvent(EventType<? extends Event> paramEventType, Event paramEvent) {
/* 228 */     CompositeEventHandler compositeEventHandler = this.eventHandlerMap.get(paramEventType);
/*     */     
/* 230 */     if (compositeEventHandler != null && compositeEventHandler.hasHandler()) {
/* 231 */       paramEvent = fixEventSource(paramEvent, this.eventSource);
/* 232 */       compositeEventHandler.dispatchBubblingEvent(paramEvent);
/*     */     } 
/*     */     
/* 235 */     return paramEvent;
/*     */   }
/*     */ 
/*     */   
/*     */   private static Event fixEventSource(Event paramEvent, Object paramObject) {
/* 240 */     return (paramEvent.getSource() != paramObject) ? 
/* 241 */       paramEvent.copyFor(paramObject, paramEvent.getTarget()) : 
/* 242 */       paramEvent;
/*     */   }
/*     */   
/*     */   private static void validateEventType(EventType<?> paramEventType) {
/* 246 */     if (paramEventType == null) {
/* 247 */       throw new NullPointerException("Event type must not be null");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static void validateEventHandler(EventHandler<?> paramEventHandler) {
/* 253 */     if (paramEventHandler == null) {
/* 254 */       throw new NullPointerException("Event handler must not be null");
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static void validateEventFilter(EventHandler<?> paramEventHandler) {
/* 260 */     if (paramEventHandler == null)
/* 261 */       throw new NullPointerException("Event filter must not be null"); 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\EventHandlerManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */