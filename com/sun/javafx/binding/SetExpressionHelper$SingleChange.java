/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableSetValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.ObservableSet;
/*     */ import javafx.collections.SetChangeListener;
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
/*     */ class SingleChange<E>
/*     */   extends SetExpressionHelper<E>
/*     */ {
/*     */   private final ChangeListener<? super ObservableSet<E>> listener;
/*     */   private ObservableSet<E> currentValue;
/*     */   
/*     */   private SingleChange(ObservableSetValue<E> paramObservableSetValue, ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/* 178 */     super(paramObservableSetValue);
/* 179 */     this.listener = paramChangeListener;
/* 180 */     this.currentValue = (ObservableSet<E>)paramObservableSetValue.getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> addListener(InvalidationListener paramInvalidationListener) {
/* 185 */     return new SetExpressionHelper.Generic<>(this.observable, paramInvalidationListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> removeListener(InvalidationListener paramInvalidationListener) {
/* 190 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> addListener(ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/* 195 */     return new SetExpressionHelper.Generic<>(this.observable, this.listener, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> removeListener(ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/* 200 */     return paramChangeListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> addListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 205 */     return new SetExpressionHelper.Generic<>(this.observable, this.listener, paramSetChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> removeListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 210 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 215 */     ObservableSet<E> observableSet = this.currentValue;
/* 216 */     this.currentValue = (ObservableSet<E>)this.observable.getValue();
/* 217 */     if (this.currentValue != observableSet) {
/* 218 */       this.listener.changed((ObservableValue)this.observable, observableSet, this.currentValue);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> paramChange) {
/* 224 */     this.listener.changed((ObservableValue)this.observable, this.currentValue, this.currentValue);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\SetExpressionHelper$SingleChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */