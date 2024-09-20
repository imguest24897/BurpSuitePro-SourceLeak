/*     */ package com.sun.javafx.event;
/*     */ 
/*     */ import javafx.event.Event;
/*     */ import javafx.event.EventHandler;
/*     */ import javafx.event.WeakEventHandler;
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
/*     */ public final class CompositeEventHandler<T extends Event>
/*     */ {
/*     */   private EventProcessorRecord<T> firstRecord;
/*     */   private EventProcessorRecord<T> lastRecord;
/*     */   private EventHandler<? super T> eventHandler;
/*     */   
/*     */   public void setEventHandler(EventHandler<? super T> paramEventHandler) {
/*  39 */     this.eventHandler = paramEventHandler;
/*     */   }
/*     */   
/*     */   public EventHandler<? super T> getEventHandler() {
/*  43 */     return this.eventHandler;
/*     */   }
/*     */   
/*     */   public void addEventHandler(EventHandler<? super T> paramEventHandler) {
/*  47 */     if (find(paramEventHandler, false) == null) {
/*  48 */       append(this.lastRecord, createEventHandlerRecord(paramEventHandler));
/*     */     }
/*     */   }
/*     */   
/*     */   public void removeEventHandler(EventHandler<? super T> paramEventHandler) {
/*  53 */     EventProcessorRecord<T> eventProcessorRecord = find(paramEventHandler, false);
/*  54 */     if (eventProcessorRecord != null) {
/*  55 */       remove(eventProcessorRecord);
/*     */     }
/*     */   }
/*     */   
/*     */   public void addEventFilter(EventHandler<? super T> paramEventHandler) {
/*  60 */     if (find(paramEventHandler, true) == null) {
/*  61 */       append(this.lastRecord, createEventFilterRecord(paramEventHandler));
/*     */     }
/*     */   }
/*     */   
/*     */   public void removeEventFilter(EventHandler<? super T> paramEventHandler) {
/*  66 */     EventProcessorRecord<T> eventProcessorRecord = find(paramEventHandler, true);
/*  67 */     if (eventProcessorRecord != null) {
/*  68 */       remove(eventProcessorRecord);
/*     */     }
/*     */   }
/*     */   
/*     */   public void dispatchBubblingEvent(Event paramEvent) {
/*  73 */     Event event = paramEvent;
/*     */     
/*  75 */     EventProcessorRecord<T> eventProcessorRecord = this.firstRecord;
/*  76 */     while (eventProcessorRecord != null) {
/*  77 */       if (eventProcessorRecord.isDisconnected()) {
/*  78 */         remove(eventProcessorRecord);
/*     */       } else {
/*  80 */         eventProcessorRecord.handleBubblingEvent((T)event);
/*     */       } 
/*  82 */       eventProcessorRecord = eventProcessorRecord.nextRecord;
/*     */     } 
/*     */     
/*  85 */     if (this.eventHandler != null) {
/*  86 */       this.eventHandler.handle(event);
/*     */     }
/*     */   }
/*     */   
/*     */   public void dispatchCapturingEvent(Event paramEvent) {
/*  91 */     Event event = paramEvent;
/*     */     
/*  93 */     EventProcessorRecord<T> eventProcessorRecord = this.firstRecord;
/*  94 */     while (eventProcessorRecord != null) {
/*  95 */       if (eventProcessorRecord.isDisconnected()) {
/*  96 */         remove(eventProcessorRecord);
/*     */       } else {
/*  98 */         eventProcessorRecord.handleCapturingEvent((T)event);
/*     */       } 
/* 100 */       eventProcessorRecord = eventProcessorRecord.nextRecord;
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean hasFilter() {
/* 105 */     return find(true);
/*     */   }
/*     */   
/*     */   public boolean hasHandler() {
/* 109 */     if (getEventHandler() != null) return true; 
/* 110 */     return find(false);
/*     */   }
/*     */ 
/*     */   
/*     */   boolean containsHandler(EventHandler<? super T> paramEventHandler) {
/* 115 */     return (find(paramEventHandler, false) != null);
/*     */   }
/*     */ 
/*     */   
/*     */   boolean containsFilter(EventHandler<? super T> paramEventHandler) {
/* 120 */     return (find(paramEventHandler, true) != null);
/*     */   }
/*     */ 
/*     */   
/*     */   private EventProcessorRecord<T> createEventHandlerRecord(EventHandler<? super T> paramEventHandler) {
/* 125 */     return (paramEventHandler instanceof WeakEventHandler) ? 
/* 126 */       new WeakEventHandlerRecord<>((WeakEventHandler<? super T>)paramEventHandler) : 
/*     */       
/* 128 */       new NormalEventHandlerRecord<>(paramEventHandler);
/*     */   }
/*     */ 
/*     */   
/*     */   private EventProcessorRecord<T> createEventFilterRecord(EventHandler<? super T> paramEventHandler) {
/* 133 */     return (paramEventHandler instanceof WeakEventHandler) ? 
/* 134 */       new WeakEventFilterRecord<>((WeakEventHandler<? super T>)paramEventHandler) : 
/*     */       
/* 136 */       new NormalEventFilterRecord<>(paramEventHandler);
/*     */   }
/*     */   
/*     */   private void remove(EventProcessorRecord<T> paramEventProcessorRecord) {
/* 140 */     EventProcessorRecord<T> eventProcessorRecord1 = paramEventProcessorRecord.prevRecord;
/* 141 */     EventProcessorRecord<T> eventProcessorRecord2 = paramEventProcessorRecord.nextRecord;
/*     */     
/* 143 */     if (eventProcessorRecord1 != null) {
/* 144 */       eventProcessorRecord1.nextRecord = eventProcessorRecord2;
/*     */     } else {
/* 146 */       this.firstRecord = eventProcessorRecord2;
/*     */     } 
/*     */     
/* 149 */     if (eventProcessorRecord2 != null) {
/* 150 */       eventProcessorRecord2.prevRecord = eventProcessorRecord1;
/*     */     } else {
/* 152 */       this.lastRecord = eventProcessorRecord1;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void append(EventProcessorRecord<T> paramEventProcessorRecord1, EventProcessorRecord<T> paramEventProcessorRecord2) {
/*     */     EventProcessorRecord<T> eventProcessorRecord;
/* 161 */     if (paramEventProcessorRecord1 != null) {
/* 162 */       eventProcessorRecord = paramEventProcessorRecord1.nextRecord;
/* 163 */       paramEventProcessorRecord1.nextRecord = paramEventProcessorRecord2;
/*     */     } else {
/* 165 */       eventProcessorRecord = this.firstRecord;
/* 166 */       this.firstRecord = paramEventProcessorRecord2;
/*     */     } 
/*     */     
/* 169 */     if (eventProcessorRecord != null) {
/* 170 */       eventProcessorRecord.prevRecord = paramEventProcessorRecord2;
/*     */     } else {
/* 172 */       this.lastRecord = paramEventProcessorRecord2;
/*     */     } 
/*     */     
/* 175 */     paramEventProcessorRecord2.prevRecord = paramEventProcessorRecord1;
/* 176 */     paramEventProcessorRecord2.nextRecord = eventProcessorRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private EventProcessorRecord<T> find(EventHandler<? super T> paramEventHandler, boolean paramBoolean) {
/* 182 */     EventProcessorRecord<T> eventProcessorRecord = this.firstRecord;
/* 183 */     while (eventProcessorRecord != null) {
/* 184 */       if (eventProcessorRecord.isDisconnected()) {
/* 185 */         remove(eventProcessorRecord);
/* 186 */       } else if (eventProcessorRecord.stores(paramEventHandler, paramBoolean)) {
/* 187 */         return eventProcessorRecord;
/*     */       } 
/*     */       
/* 190 */       eventProcessorRecord = eventProcessorRecord.nextRecord;
/*     */     } 
/*     */     
/* 193 */     return null;
/*     */   }
/*     */   
/*     */   private boolean find(boolean paramBoolean) {
/* 197 */     EventProcessorRecord<T> eventProcessorRecord = this.firstRecord;
/* 198 */     while (eventProcessorRecord != null) {
/* 199 */       if (eventProcessorRecord.isDisconnected()) {
/* 200 */         remove(eventProcessorRecord);
/* 201 */       } else if (paramBoolean == eventProcessorRecord.isFilter()) {
/* 202 */         return true;
/*     */       } 
/* 204 */       eventProcessorRecord = eventProcessorRecord.nextRecord;
/*     */     } 
/* 206 */     return false;
/*     */   }
/*     */   
/*     */   private static abstract class EventProcessorRecord<T extends Event>
/*     */   {
/*     */     private EventProcessorRecord<T> nextRecord;
/*     */     private EventProcessorRecord<T> prevRecord;
/*     */     
/*     */     public abstract boolean stores(EventHandler<? super T> param1EventHandler, boolean param1Boolean);
/*     */     
/*     */     public abstract boolean isFilter();
/*     */     
/*     */     public abstract void handleBubblingEvent(T param1T);
/*     */     
/*     */     public abstract void handleCapturingEvent(T param1T);
/*     */     
/*     */     public abstract boolean isDisconnected();
/*     */   }
/*     */   
/*     */   private static final class NormalEventHandlerRecord<T extends Event>
/*     */     extends EventProcessorRecord<T>
/*     */   {
/*     */     private final EventHandler<? super T> eventHandler;
/*     */     
/*     */     public NormalEventHandlerRecord(EventHandler<? super T> param1EventHandler) {
/* 231 */       this.eventHandler = param1EventHandler;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean stores(EventHandler<? super T> param1EventHandler, boolean param1Boolean) {
/* 237 */       return (param1Boolean == isFilter() && this.eventHandler == param1EventHandler);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isFilter() {
/* 242 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void handleBubblingEvent(T param1T) {
/* 247 */       this.eventHandler.handle((Event)param1T);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void handleCapturingEvent(T param1T) {}
/*     */ 
/*     */     
/*     */     public boolean isDisconnected() {
/* 256 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final class WeakEventHandlerRecord<T extends Event>
/*     */     extends EventProcessorRecord<T>
/*     */   {
/*     */     private final WeakEventHandler<? super T> weakEventHandler;
/*     */     
/*     */     public WeakEventHandlerRecord(WeakEventHandler<? super T> param1WeakEventHandler) {
/* 266 */       this.weakEventHandler = param1WeakEventHandler;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean stores(EventHandler<? super T> param1EventHandler, boolean param1Boolean) {
/* 272 */       return (param1Boolean == isFilter() && this.weakEventHandler == param1EventHandler);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isFilter() {
/* 277 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public void handleBubblingEvent(T param1T) {
/* 282 */       this.weakEventHandler.handle((Event)param1T);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void handleCapturingEvent(T param1T) {}
/*     */ 
/*     */     
/*     */     public boolean isDisconnected() {
/* 291 */       return this.weakEventHandler.wasGarbageCollected();
/*     */     }
/*     */   }
/*     */   
/*     */   private static final class NormalEventFilterRecord<T extends Event>
/*     */     extends EventProcessorRecord<T>
/*     */   {
/*     */     private final EventHandler<? super T> eventFilter;
/*     */     
/*     */     public NormalEventFilterRecord(EventHandler<? super T> param1EventHandler) {
/* 301 */       this.eventFilter = param1EventHandler;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean stores(EventHandler<? super T> param1EventHandler, boolean param1Boolean) {
/* 307 */       return (param1Boolean == isFilter() && this.eventFilter == param1EventHandler);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isFilter() {
/* 312 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void handleBubblingEvent(T param1T) {}
/*     */ 
/*     */     
/*     */     public void handleCapturingEvent(T param1T) {
/* 321 */       this.eventFilter.handle((Event)param1T);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isDisconnected() {
/* 326 */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final class WeakEventFilterRecord<T extends Event>
/*     */     extends EventProcessorRecord<T>
/*     */   {
/*     */     private final WeakEventHandler<? super T> weakEventFilter;
/*     */     
/*     */     public WeakEventFilterRecord(WeakEventHandler<? super T> param1WeakEventHandler) {
/* 336 */       this.weakEventFilter = param1WeakEventHandler;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public boolean stores(EventHandler<? super T> param1EventHandler, boolean param1Boolean) {
/* 342 */       return (param1Boolean == isFilter() && this.weakEventFilter == param1EventHandler);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isFilter() {
/* 347 */       return true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void handleBubblingEvent(T param1T) {}
/*     */ 
/*     */     
/*     */     public void handleCapturingEvent(T param1T) {
/* 356 */       this.weakEventFilter.handle((Event)param1T);
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean isDisconnected() {
/* 361 */       return this.weakEventFilter.wasGarbageCollected();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\CompositeEventHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */