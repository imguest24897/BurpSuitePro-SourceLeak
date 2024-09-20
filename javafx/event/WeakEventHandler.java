/*    */ package javafx.event;
/*    */ 
/*    */ import java.lang.ref.WeakReference;
/*    */ import javafx.beans.NamedArg;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class WeakEventHandler<T extends Event>
/*    */   implements EventHandler<T>
/*    */ {
/*    */   private final WeakReference<EventHandler<T>> weakRef;
/*    */   
/*    */   public WeakEventHandler(@NamedArg("eventHandler") EventHandler<T> paramEventHandler) {
/* 55 */     this.weakRef = new WeakReference<>(paramEventHandler);
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
/*    */   public boolean wasGarbageCollected() {
/* 67 */     return (this.weakRef.get() == null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void handle(T paramT) {
/* 77 */     EventHandler<T> eventHandler = this.weakRef.get();
/* 78 */     if (eventHandler != null) {
/* 79 */       eventHandler.handle(paramT);
/*    */     }
/*    */   }
/*    */ 
/*    */   
/*    */   void clear() {
/* 85 */     this.weakRef.clear();
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\event\WeakEventHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */