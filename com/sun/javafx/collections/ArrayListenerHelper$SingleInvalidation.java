/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
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
/*     */ class SingleInvalidation<T extends ObservableArray<T>>
/*     */   extends ArrayListenerHelper<T>
/*     */ {
/*     */   private final InvalidationListener listener;
/*     */   
/*     */   private SingleInvalidation(T paramT, InvalidationListener paramInvalidationListener) {
/* 103 */     super(paramT);
/* 104 */     this.listener = paramInvalidationListener;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArrayListenerHelper<T> addListener(InvalidationListener paramInvalidationListener) {
/* 109 */     return new ArrayListenerHelper.Generic<>(this.observable, this.listener, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArrayListenerHelper<T> removeListener(InvalidationListener paramInvalidationListener) {
/* 114 */     return paramInvalidationListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArrayListenerHelper<T> addListener(ArrayChangeListener<T> paramArrayChangeListener) {
/* 119 */     return new ArrayListenerHelper.Generic<>(this.observable, this.listener, paramArrayChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ArrayListenerHelper<T> removeListener(ArrayChangeListener<T> paramArrayChangeListener) {
/* 124 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(boolean paramBoolean, int paramInt1, int paramInt2) {
/*     */     try {
/* 130 */       this.listener.invalidated((Observable)this.observable);
/* 131 */     } catch (Exception exception) {
/* 132 */       Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ArrayListenerHelper$SingleInvalidation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */