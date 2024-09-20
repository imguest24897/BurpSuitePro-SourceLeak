/*    */ package com.sun.javafx.binding;
/*    */ 
/*    */ import java.util.Objects;
/*    */ import javafx.beans.InvalidationListener;
/*    */ import javafx.beans.value.ChangeListener;
/*    */ import javafx.beans.value.ObservableValue;
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
/*    */ public class ConditionalBinding<T>
/*    */   extends LazyObjectBinding<T>
/*    */ {
/*    */   private final ObservableValue<T> source;
/*    */   private final ObservableValue<Boolean> nonNullCondition;
/*    */   private Subscription subscription;
/*    */   
/*    */   public ConditionalBinding(ObservableValue<T> paramObservableValue, ObservableValue<Boolean> paramObservableValue1) {
/* 41 */     this.source = Objects.<ObservableValue<T>>requireNonNull(paramObservableValue, "source cannot be null");
/* 42 */     this.nonNullCondition = ((ObservableValue)Objects.<ObservableValue>requireNonNull(paramObservableValue1, "condition cannot be null")).orElse(Boolean.valueOf(false));
/*    */ 
/*    */     
/* 45 */     this.nonNullCondition.subscribe(this::conditionChanged);
/*    */   }
/*    */   
/*    */   private void conditionChanged(boolean paramBoolean) {
/* 49 */     if (!paramBoolean && !isValid()) {
/* 50 */       getValue();
/*    */     }
/* 52 */     else if (isValid() && this.source.getValue() != getValue()) {
/* 53 */       invalidate();
/*    */     } 
/*    */     
/* 56 */     updateSubscription();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected boolean allowValidation() {
/* 66 */     return (super.allowValidation() || !isActive());
/*    */   }
/*    */ 
/*    */   
/*    */   protected T computeValue() {
/* 71 */     updateSubscription();
/*    */     
/* 73 */     return (T)this.source.getValue();
/*    */   }
/*    */   
/*    */   private void updateSubscription() {
/* 77 */     if (isObserved() && isActive()) {
/* 78 */       if (this.subscription == null) {
/* 79 */         this.subscription = this.source.subscribe(this::invalidate);
/*    */       }
/*    */     } else {
/*    */       
/* 83 */       unsubscribe();
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   protected Subscription observeSources() {
/* 89 */     return this::unsubscribe;
/*    */   }
/*    */   
/*    */   private boolean isActive() {
/* 93 */     return ((Boolean)this.nonNullCondition.getValue()).booleanValue();
/*    */   }
/*    */   
/*    */   private void unsubscribe() {
/* 97 */     if (this.subscription != null) {
/* 98 */       this.subscription.unsubscribe();
/* 99 */       this.subscription = null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ConditionalBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */