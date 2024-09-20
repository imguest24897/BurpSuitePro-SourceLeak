/*    */ package com.sun.javafx.event;
/*    */ 
/*    */ import java.util.Arrays;
/*    */ import java.util.Collections;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
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
/*    */ public class CompositeEventTargetImpl
/*    */   implements CompositeEventTarget
/*    */ {
/*    */   private final Set<EventTarget> eventTargets;
/*    */   
/*    */   public CompositeEventTargetImpl(EventTarget... paramVarArgs) {
/* 39 */     HashSet<? extends EventTarget> hashSet = new HashSet(paramVarArgs.length);
/*    */     
/* 41 */     hashSet.addAll(Arrays.asList(paramVarArgs));
/*    */     
/* 43 */     this.eventTargets = Collections.unmodifiableSet(hashSet);
/*    */   }
/*    */ 
/*    */   
/*    */   public Set<EventTarget> getTargets() {
/* 48 */     return this.eventTargets;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean containsTarget(EventTarget paramEventTarget) {
/* 53 */     return this.eventTargets.contains(paramEventTarget);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public EventDispatchChain buildEventDispatchChain(EventDispatchChain paramEventDispatchChain) {
/* 59 */     EventDispatchTree eventDispatchTree = (EventDispatchTree)paramEventDispatchChain;
/*    */     
/* 61 */     for (EventTarget eventTarget : this.eventTargets) {
/*    */       
/* 63 */       EventDispatchTree eventDispatchTree1 = eventDispatchTree.createTree();
/* 64 */       eventDispatchTree = eventDispatchTree.mergeTree((EventDispatchTree)eventTarget
/* 65 */           .buildEventDispatchChain(eventDispatchTree1));
/*    */     } 
/*    */ 
/*    */     
/* 69 */     return eventDispatchTree;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\event\CompositeEventTargetImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */