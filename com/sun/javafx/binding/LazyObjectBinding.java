/*    */ package com.sun.javafx.binding;
/*    */ 
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.binding.ObjectBinding;
/*    */ import javafx.beans.value.ChangeListener;
/*    */ import javafx.util.Subscription;
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
/*    */ abstract class LazyObjectBinding<T>
/*    */   extends ObjectBinding<T>
/*    */ {
/*    */   private Subscription subscription;
/*    */   private boolean wasObserved;
/*    */   
/*    */   public void addListener(ChangeListener<? super T> paramChangeListener) {
/* 46 */     super.addListener(paramChangeListener);
/*    */     
/* 48 */     updateSubscriptionAfterAdd();
/*    */   }
/*    */ 
/*    */   
/*    */   public void removeListener(ChangeListener<? super T> paramChangeListener) {
/* 53 */     super.removeListener(paramChangeListener);
/*    */     
/* 55 */     updateSubscriptionAfterRemove();
/*    */   }
/*    */ 
/*    */   
/*    */   public void addListener(InvalidationListener paramInvalidationListener) {
/* 60 */     super.addListener(paramInvalidationListener);
/*    */     
/* 62 */     updateSubscriptionAfterAdd();
/*    */   }
/*    */ 
/*    */   
/*    */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 67 */     super.removeListener(paramInvalidationListener);
/*    */     
/* 69 */     updateSubscriptionAfterRemove();
/*    */   }
/*    */ 
/*    */   
/*    */   protected boolean allowValidation() {
/* 74 */     return isObserved();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void updateSubscriptionAfterAdd() {
/* 81 */     if (!this.wasObserved) {
/* 82 */       this.subscription = observeSources();
/* 83 */       this.wasObserved = true;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void updateSubscriptionAfterRemove() {
/* 92 */     if (this.wasObserved && !isObserved()) {
/* 93 */       this.subscription.unsubscribe();
/* 94 */       this.subscription = null;
/* 95 */       invalidate();
/* 96 */       this.wasObserved = false;
/*    */     } 
/*    */   }
/*    */   
/*    */   protected abstract Subscription observeSources();
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\LazyObjectBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */