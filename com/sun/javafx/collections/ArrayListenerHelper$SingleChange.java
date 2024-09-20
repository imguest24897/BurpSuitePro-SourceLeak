/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.collections.ArrayChangeListener;
/*     */ import javafx.collections.ObservableArray;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class SingleChange<T extends ObservableArray<T>>
/*     */   extends ArrayListenerHelper<T>
/*     */ {
/*     */   private final ArrayChangeListener<T> listener;
/*     */   
/*     */   private SingleChange(T paramT, ArrayChangeListener<T> paramArrayChangeListener) {
/* 142 */     super(paramT);
/* 143 */     this.listener = paramArrayChangeListener;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArrayListenerHelper<T> addListener(InvalidationListener paramInvalidationListener) {
/* 148 */     return new ArrayListenerHelper.Generic<>(this.observable, paramInvalidationListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArrayListenerHelper<T> removeListener(InvalidationListener paramInvalidationListener) {
/* 153 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArrayListenerHelper<T> addListener(ArrayChangeListener<T> paramArrayChangeListener) {
/* 158 */     return new ArrayListenerHelper.Generic<>(this.observable, this.listener, paramArrayChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArrayListenerHelper<T> removeListener(ArrayChangeListener<T> paramArrayChangeListener) {
/* 163 */     return paramArrayChangeListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(boolean paramBoolean, int paramInt1, int paramInt2) {
/*     */     try {
/* 169 */       this.listener.onChanged((ObservableArray)this.observable, paramBoolean, paramInt1, paramInt2);
/* 170 */     } catch (Exception exception) {
/* 171 */       Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ArrayListenerHelper$SingleChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */