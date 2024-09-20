/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.collections.ListChangeListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends ListListenerHelper<E>
/*     */ {
/*     */   private final InvalidationListener listener;
/*     */   
/*     */   private SingleInvalidation(InvalidationListener paramInvalidationListener) {
/*  98 */     this.listener = paramInvalidationListener;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListListenerHelper<E> addListener(InvalidationListener paramInvalidationListener) {
/* 103 */     return new ListListenerHelper.Generic<>(this.listener, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListListenerHelper<E> removeListener(InvalidationListener paramInvalidationListener) {
/* 108 */     return paramInvalidationListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListListenerHelper<E> addListener(ListChangeListener<? super E> paramListChangeListener) {
/* 113 */     return new ListListenerHelper.Generic<>(this.listener, paramListChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListListenerHelper<E> removeListener(ListChangeListener<? super E> paramListChangeListener) {
/* 118 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> paramChange) {
/*     */     try {
/* 124 */       this.listener.invalidated((Observable)paramChange.getList());
/* 125 */     } catch (Exception exception) {
/* 126 */       Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ListListenerHelper$SingleInvalidation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */