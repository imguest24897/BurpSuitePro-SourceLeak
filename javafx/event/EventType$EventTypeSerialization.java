/*     */ package javafx.event;
/*     */ 
/*     */ import java.io.InvalidObjectException;
/*     */ import java.io.ObjectStreamException;
/*     */ import java.io.Serializable;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ class EventTypeSerialization
/*     */   implements Serializable
/*     */ {
/*     */   private List<String> path;
/*     */   
/*     */   public EventTypeSerialization(List<String> paramList) {
/* 206 */     this.path = paramList;
/*     */   }
/*     */   
/*     */   private Object readResolve() throws ObjectStreamException {
/* 210 */     EventType<Event> eventType = EventType.ROOT;
/* 211 */     for (byte b = 0; b < this.path.size(); b++) {
/* 212 */       String str = this.path.get(b);
/* 213 */       if (eventType.subTypes != null) {
/* 214 */         EventType<Event> eventType1 = findSubType((Set)eventType.subTypes.keySet(), str);
/* 215 */         if (eventType1 == null) {
/* 216 */           throw new InvalidObjectException("Cannot find event type \"" + str + "\" (of " + String.valueOf(eventType) + ")");
/*     */         }
/* 218 */         eventType = eventType1;
/*     */       } else {
/* 220 */         throw new InvalidObjectException("Cannot find event type \"" + str + "\" (of " + String.valueOf(eventType) + ")");
/*     */       } 
/*     */     } 
/* 223 */     return eventType;
/*     */   }
/*     */   
/*     */   private EventType findSubType(Set<EventType> paramSet, String paramString) {
/* 227 */     for (EventType eventType : paramSet) {
/* 228 */       if ((eventType.name == null && paramString == null) || (eventType.name != null && eventType.name.equals(paramString))) {
/* 229 */         return eventType;
/*     */       }
/*     */     } 
/* 232 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\event\EventType$EventTypeSerialization.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */