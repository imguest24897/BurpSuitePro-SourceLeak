/*     */ package javafx.event;
/*     */ 
/*     */ import com.sun.javafx.event.EventUtil;
/*     */ import java.io.IOException;
/*     */ import java.io.ObjectInputStream;
/*     */ import java.util.EventObject;
/*     */ import javafx.beans.NamedArg;
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
/*     */ public class Event
/*     */   extends EventObject
/*     */   implements Cloneable
/*     */ {
/*     */   private static final long serialVersionUID = 20121107L;
/*     */   public static final EventTarget NULL_SOURCE_TARGET;
/*     */   
/*     */   static {
/*  50 */     NULL_SOURCE_TARGET = (paramEventDispatchChain -> paramEventDispatchChain);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*  55 */   public static final EventType<Event> ANY = EventType.ROOT;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected EventType<? extends Event> eventType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected transient EventTarget target;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean consumed;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Event(@NamedArg("eventType") EventType<? extends Event> paramEventType) {
/*  80 */     this(null, null, paramEventType);
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
/*     */   public Event(@NamedArg("source") Object paramObject, @NamedArg("target") EventTarget paramEventTarget, @NamedArg("eventType") EventType<? extends Event> paramEventType) {
/*  95 */     super((paramObject != null) ? paramObject : NULL_SOURCE_TARGET);
/*  96 */     this.target = (paramEventTarget != null) ? paramEventTarget : NULL_SOURCE_TARGET;
/*  97 */     this.eventType = paramEventType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EventTarget getTarget() {
/* 107 */     return this.target;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EventType<? extends Event> getEventType() {
/* 118 */     return this.eventType;
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
/*     */   public Event copyFor(Object paramObject, EventTarget paramEventTarget) {
/* 131 */     Event event = (Event)clone();
/*     */     
/* 133 */     event.source = (paramObject != null) ? paramObject : NULL_SOURCE_TARGET;
/* 134 */     event.target = (paramEventTarget != null) ? paramEventTarget : NULL_SOURCE_TARGET;
/* 135 */     event.consumed = false;
/*     */     
/* 137 */     return event;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isConsumed() {
/* 148 */     return this.consumed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void consume() {
/* 155 */     this.consumed = true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object clone() {
/*     */     try {
/* 166 */       return super.clone();
/* 167 */     } catch (CloneNotSupportedException cloneNotSupportedException) {
/*     */       
/* 169 */       throw new RuntimeException("Can't clone Event");
/*     */     } 
/*     */   }
/*     */   
/*     */   private void readObject(ObjectInputStream paramObjectInputStream) throws IOException, ClassNotFoundException {
/* 174 */     paramObjectInputStream.defaultReadObject();
/* 175 */     this.source = NULL_SOURCE_TARGET;
/* 176 */     this.target = NULL_SOURCE_TARGET;
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
/*     */   public static void fireEvent(EventTarget paramEventTarget, Event paramEvent) {
/* 190 */     if (paramEventTarget == null) {
/* 191 */       throw new NullPointerException("Event target must not be null!");
/*     */     }
/*     */     
/* 194 */     if (paramEvent == null) {
/* 195 */       throw new NullPointerException("Event must not be null!");
/*     */     }
/*     */     
/* 198 */     EventUtil.fireEvent(paramEventTarget, paramEvent);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\event\Event.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */