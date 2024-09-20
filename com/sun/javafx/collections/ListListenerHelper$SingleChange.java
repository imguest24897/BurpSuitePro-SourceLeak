/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends ListListenerHelper<E>
/*     */ {
/*     */   private final ListChangeListener<? super E> listener;
/*     */   
/*     */   private SingleChange(ListChangeListener<? super E> paramListChangeListener) {
/* 136 */     this.listener = paramListChangeListener;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListListenerHelper<E> addListener(InvalidationListener paramInvalidationListener) {
/* 141 */     return new ListListenerHelper.Generic<>(paramInvalidationListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListListenerHelper<E> removeListener(InvalidationListener paramInvalidationListener) {
/* 146 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListListenerHelper<E> addListener(ListChangeListener<? super E> paramListChangeListener) {
/* 151 */     return new ListListenerHelper.Generic<>(this.listener, paramListChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListListenerHelper<E> removeListener(ListChangeListener<? super E> paramListChangeListener) {
/* 156 */     return paramListChangeListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> paramChange) {
/*     */     try {
/* 162 */       this.listener.onChanged(paramChange);
/* 163 */     } catch (Exception exception) {
/* 164 */       Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ListListenerHelper$SingleChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */