/*    */ package com.sun.javafx.event;
/*    */ 
/*    */ import java.util.concurrent.atomic.AtomicBoolean;
/*    */ import javafx.event.Event;
/*    */ import javafx.event.EventDispatchChain;
/*    */ import javafx.event.EventTarget;
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
/*    */ public final class EventUtil
/*    */ {
/* 35 */   private static final EventDispatchChainImpl eventDispatchChain = new EventDispatchChainImpl();
/*    */ 
/*    */   
/* 38 */   private static final AtomicBoolean eventDispatchChainInUse = new AtomicBoolean();
/*    */ 
/*    */   
/*    */   public static Event fireEvent(EventTarget paramEventTarget, Event paramEvent) {
/* 42 */     if (paramEvent.getTarget() != paramEventTarget) {
/* 43 */       paramEvent = paramEvent.copyFor(paramEvent.getSource(), paramEventTarget);
/*    */     }
/*    */     
/* 46 */     if (eventDispatchChainInUse.getAndSet(true))
/*    */     {
/*    */       
/* 49 */       return fireEventImpl(new EventDispatchChainImpl(), paramEventTarget, paramEvent);
/*    */     }
/*    */ 
/*    */     
/*    */     try {
/* 54 */       return fireEventImpl(eventDispatchChain, paramEventTarget, paramEvent);
/*    */     }
/*    */     finally {
/*    */       
/* 58 */       eventDispatchChain.reset();
/* 59 */       eventDispatchChainInUse.set(false);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static Event fireEvent(Event paramEvent, EventTarget... paramVarArgs) {
/* 64 */     return fireEventImpl(new EventDispatchTreeImpl(), new CompositeEventTargetImpl(paramVarArgs), paramEvent);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static Event fireEventImpl(EventDispatchChain paramEventDispatchChain, EventTarget paramEventTarget, Event paramEvent) {
/* 73 */     EventDispatchChain eventDispatchChain = paramEventTarget.buildEventDispatchChain(paramEventDispatchChain);
/* 74 */     return eventDispatchChain.dispatchEvent(paramEvent);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\EventUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */