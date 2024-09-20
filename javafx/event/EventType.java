/*     */ package javafx.event;
/*     */ 
/*     */ import java.io.InvalidObjectException;
/*     */ import java.io.ObjectStreamException;
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import java.util.WeakHashMap;
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
/*     */ public final class EventType<T extends Event>
/*     */   implements Serializable
/*     */ {
/*  67 */   public static final EventType<Event> ROOT = new EventType("EVENT", null);
/*     */ 
/*     */ 
/*     */   
/*     */   private WeakHashMap<EventType<? extends T>, Void> subTypes;
/*     */ 
/*     */   
/*     */   private final EventType<? super T> superType;
/*     */ 
/*     */   
/*     */   private final String name;
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public EventType() {
/*  83 */     this((EventType)ROOT, (String)null);
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
/*     */   public EventType(String paramString) {
/*  95 */     this((EventType)ROOT, paramString);
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
/*     */   public EventType(EventType<? super T> paramEventType) {
/* 107 */     this(paramEventType, (String)null);
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
/*     */   public EventType(EventType<? super T> paramEventType, String paramString) {
/* 121 */     if (paramEventType == null) {
/* 122 */       throw new NullPointerException("Event super type must not be null!");
/*     */     }
/*     */ 
/*     */     
/* 126 */     this.superType = paramEventType;
/* 127 */     this.name = paramString;
/* 128 */     paramEventType.register(this);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   EventType(String paramString, EventType<? super T> paramEventType) {
/* 136 */     this.superType = paramEventType;
/* 137 */     this.name = paramString;
/* 138 */     if (paramEventType != null) {
/* 139 */       if (paramEventType.subTypes != null) {
/* 140 */         for (Iterator<EventType> iterator = paramEventType.subTypes.keySet().iterator(); iterator.hasNext(); ) {
/* 141 */           EventType eventType = iterator.next();
/* 142 */           if ((paramString == null && eventType.name == null) || (paramString != null && paramString.equals(eventType.name))) {
/* 143 */             iterator.remove();
/*     */           }
/*     */         } 
/*     */       }
/* 147 */       paramEventType.register(this);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final EventType<? super T> getSuperType() {
/* 158 */     return this.superType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final String getName() {
/* 167 */     return this.name;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 176 */     return (this.name != null) ? this.name : super.toString();
/*     */   }
/*     */   
/*     */   private void register(EventType<? extends T> paramEventType) {
/* 180 */     if (this.subTypes == null) {
/* 181 */       this.subTypes = new WeakHashMap<>();
/*     */     }
/* 183 */     for (EventType<? extends T> eventType : this.subTypes.keySet()) {
/* 184 */       if ((eventType.name == null && paramEventType.name == null) || (eventType.name != null && eventType.name.equals(paramEventType.name))) {
/* 185 */         throw new IllegalArgumentException("EventType \"" + String.valueOf(paramEventType) + "\"with parent \"" + 
/* 186 */             String.valueOf(paramEventType.getSuperType()) + "\" already exists");
/*     */       }
/*     */     } 
/* 189 */     this.subTypes.put(paramEventType, null);
/*     */   }
/*     */   
/*     */   private Object writeReplace() {
/* 193 */     LinkedList<String> linkedList = new LinkedList();
/* 194 */     EventType<Event> eventType = this;
/* 195 */     while (eventType != ROOT) {
/* 196 */       linkedList.addFirst(eventType.name);
/* 197 */       eventType = (EventType)eventType.superType;
/*     */     } 
/* 199 */     return new EventTypeSerialization(new ArrayList<>(linkedList));
/*     */   }
/*     */   
/*     */   static class EventTypeSerialization implements Serializable {
/*     */     private List<String> path;
/*     */     
/*     */     public EventTypeSerialization(List<String> param1List) {
/* 206 */       this.path = param1List;
/*     */     }
/*     */     
/*     */     private Object readResolve() throws ObjectStreamException {
/* 210 */       EventType<Event> eventType = EventType.ROOT;
/* 211 */       for (byte b = 0; b < this.path.size(); b++) {
/* 212 */         String str = this.path.get(b);
/* 213 */         if (eventType.subTypes != null) {
/* 214 */           EventType<Event> eventType1 = findSubType((Set)eventType.subTypes.keySet(), str);
/* 215 */           if (eventType1 == null) {
/* 216 */             throw new InvalidObjectException("Cannot find event type \"" + str + "\" (of " + String.valueOf(eventType) + ")");
/*     */           }
/* 218 */           eventType = eventType1;
/*     */         } else {
/* 220 */           throw new InvalidObjectException("Cannot find event type \"" + str + "\" (of " + String.valueOf(eventType) + ")");
/*     */         } 
/*     */       } 
/* 223 */       return eventType;
/*     */     }
/*     */     
/*     */     private EventType findSubType(Set<EventType> param1Set, String param1String) {
/* 227 */       for (EventType eventType : param1Set) {
/* 228 */         if ((eventType.name == null && param1String == null) || (eventType.name != null && eventType.name.equals(param1String))) {
/* 229 */           return eventType;
/*     */         }
/*     */       } 
/* 232 */       return null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\event\EventType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */