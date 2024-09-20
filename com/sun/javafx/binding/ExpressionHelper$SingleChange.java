/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class SingleChange<T>
/*     */   extends ExpressionHelper<T>
/*     */ {
/*     */   private final ChangeListener<? super T> listener;
/*     */   private T currentValue;
/*     */   
/*     */   private SingleChange(ObservableValue<T> paramObservableValue, T paramT, ChangeListener<? super T> paramChangeListener) {
/* 160 */     super(paramObservableValue);
/* 161 */     this.listener = paramChangeListener;
/* 162 */     this.currentValue = paramT;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ExpressionHelper<T> addListener(InvalidationListener paramInvalidationListener) {
/* 167 */     return new ExpressionHelper.Generic<>(this.observable, this.currentValue, paramInvalidationListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ExpressionHelper<T> removeListener(InvalidationListener paramInvalidationListener) {
/* 172 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ExpressionHelper<T> addListener(ChangeListener<? super T> paramChangeListener) {
/* 177 */     return new ExpressionHelper.Generic<>(this.observable, this.currentValue, this.listener, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ExpressionHelper<T> removeListener(ChangeListener<? super T> paramChangeListener) {
/* 182 */     return paramChangeListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 187 */     T t = this.currentValue;
/* 188 */     this.currentValue = (T)this.observable.getValue();
/* 189 */     boolean bool = (this.currentValue == null) ? ((t != null) ? true : false) : (!this.currentValue.equals(t) ? true : false);
/* 190 */     if (bool)
/*     */       try {
/* 192 */         this.listener.changed(this.observable, t, this.currentValue);
/* 193 */       } catch (Exception exception) {
/* 194 */         Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ExpressionHelper$SingleChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */