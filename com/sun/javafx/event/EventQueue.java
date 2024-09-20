/*    */ package com.sun.javafx.event;
/*    */ 
/*    */ import java.util.ArrayDeque;
/*    */ import java.util.Queue;
/*    */ import javafx.event.Event;
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
/*    */ public final class EventQueue
/*    */ {
/* 33 */   private Queue<Event> queue = new ArrayDeque<>();
/*    */   private boolean inLoop;
/*    */   
/*    */   public void postEvent(Event paramEvent) {
/* 37 */     this.queue.add(paramEvent);
/*    */   }
/*    */   
/*    */   public void fire() {
/* 41 */     if (this.inLoop) {
/*    */       return;
/*    */     }
/* 44 */     this.inLoop = true;
/*    */     try {
/* 46 */       while (!this.queue.isEmpty()) {
/* 47 */         Event event = this.queue.remove();
/* 48 */         Event.fireEvent(event.getTarget(), event);
/*    */       } 
/*    */     } finally {
/* 51 */       this.inLoop = false;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\EventQueue.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */