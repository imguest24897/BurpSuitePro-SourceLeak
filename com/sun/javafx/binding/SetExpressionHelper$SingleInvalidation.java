/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableSetValue;
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
/*     */ class SingleInvalidation<E>
/*     */   extends SetExpressionHelper<E>
/*     */ {
/*     */   private final InvalidationListener listener;
/*     */   
/*     */   private SingleInvalidation(ObservableSetValue<E> paramObservableSetValue, InvalidationListener paramInvalidationListener) {
/* 127 */     super(paramObservableSetValue);
/* 128 */     this.listener = paramInvalidationListener;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> addListener(InvalidationListener paramInvalidationListener) {
/* 133 */     return new SetExpressionHelper.Generic<>(this.observable, this.listener, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> removeListener(InvalidationListener paramInvalidationListener) {
/* 138 */     return paramInvalidationListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> addListener(ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/* 143 */     return new SetExpressionHelper.Generic<>(this.observable, this.listener, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> removeListener(ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/* 148 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> addListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 153 */     return new SetExpressionHelper.Generic<>(this.observable, this.listener, paramSetChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetExpressionHelper<E> removeListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 158 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 163 */     this.listener.invalidated((Observable)this.observable);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> paramChange) {
/* 168 */     this.listener.invalidated((Observable)this.observable);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\SetExpressionHelper$SingleInvalidation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */