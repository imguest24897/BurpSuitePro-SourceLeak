/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableListValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.ListChangeListener;
/*     */ import javafx.collections.ObservableList;
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
/*     */   extends ListExpressionHelper<E>
/*     */ {
/*     */   private final ChangeListener<? super ObservableList<E>> listener;
/*     */   private ObservableList<E> currentValue;
/*     */   
/*     */   private SingleChange(ObservableListValue<E> paramObservableListValue, ChangeListener<? super ObservableList<E>> paramChangeListener) {
/* 191 */     super(paramObservableListValue);
/* 192 */     this.listener = paramChangeListener;
/* 193 */     this.currentValue = (ObservableList<E>)paramObservableListValue.getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> addListener(InvalidationListener paramInvalidationListener) {
/* 198 */     return new ListExpressionHelper.Generic<>(this.observable, paramInvalidationListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> removeListener(InvalidationListener paramInvalidationListener) {
/* 203 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> addListener(ChangeListener<? super ObservableList<E>> paramChangeListener) {
/* 208 */     return new ListExpressionHelper.Generic<>(this.observable, this.listener, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> removeListener(ChangeListener<? super ObservableList<E>> paramChangeListener) {
/* 213 */     return paramChangeListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> addListener(ListChangeListener<? super E> paramListChangeListener) {
/* 218 */     return new ListExpressionHelper.Generic<>(this.observable, this.listener, paramListChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> removeListener(ListChangeListener<? super E> paramListChangeListener) {
/* 223 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 228 */     ObservableList<E> observableList = this.currentValue;
/* 229 */     this.currentValue = (ObservableList<E>)this.observable.getValue();
/* 230 */     if (this.currentValue != observableList) {
/* 231 */       this.listener.changed((ObservableValue)this.observable, observableList, this.currentValue);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> paramChange) {
/* 237 */     this.listener.changed((ObservableValue)this.observable, this.currentValue, this.currentValue);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ListExpressionHelper$SingleChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */