/*    */ package javafx.event;
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
/*    */ public class ActionEvent
/*    */   extends Event
/*    */ {
/*    */   private static final long serialVersionUID = 20121107L;
/* 41 */   public static final EventType<ActionEvent> ACTION = (EventType)new EventType<>(Event.ANY, "ACTION");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 48 */   public static final EventType<ActionEvent> ANY = ACTION;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ActionEvent() {
/* 55 */     super((EventType)ACTION);
/*    */   }
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
/*    */   public ActionEvent(Object paramObject, EventTarget paramEventTarget) {
/* 68 */     super(paramObject, paramEventTarget, (EventType)ACTION);
/*    */   }
/*    */ 
/*    */   
/*    */   public ActionEvent copyFor(Object paramObject, EventTarget paramEventTarget) {
/* 73 */     return (ActionEvent)super.copyFor(paramObject, paramEventTarget);
/*    */   }
/*    */ 
/*    */   
/*    */   public EventType<? extends ActionEvent> getEventType() {
/* 78 */     return (EventType)super.getEventType();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\event\ActionEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */