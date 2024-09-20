/*    */ package com.sun.javafx.binding;
/*    */ 
/*    */ import java.lang.ref.WeakReference;
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.Observable;
/*    */ import javafx.beans.WeakListener;
/*    */ import javafx.beans.binding.Binding;
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
/*    */ public class BindingHelperObserver
/*    */   implements InvalidationListener, WeakListener
/*    */ {
/*    */   private final WeakReference<Binding<?>> ref;
/*    */   
/*    */   public BindingHelperObserver(Binding<?> paramBinding) {
/* 40 */     if (paramBinding == null) {
/* 41 */       throw new NullPointerException("Binding has to be specified.");
/*    */     }
/* 43 */     this.ref = new WeakReference<>(paramBinding);
/*    */   }
/*    */ 
/*    */   
/*    */   public void invalidated(Observable paramObservable) {
/* 48 */     Binding binding = this.ref.get();
/* 49 */     if (binding == null) {
/* 50 */       paramObservable.removeListener(this);
/*    */     } else {
/* 52 */       binding.invalidate();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean wasGarbageCollected() {
/* 58 */     return (this.ref.get() == null);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\BindingHelperObserver.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */