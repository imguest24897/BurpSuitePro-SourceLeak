/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import javafx.beans.InvalidationListener;
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
/*     */ class SingleChange<E>
/*     */   extends SetListenerHelper<E>
/*     */ {
/*     */   private final SetChangeListener<? super E> listener;
/*     */   
/*     */   private SingleChange(SetChangeListener<? super E> paramSetChangeListener) {
/* 135 */     this.listener = paramSetChangeListener;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetListenerHelper<E> addListener(InvalidationListener paramInvalidationListener) {
/* 140 */     return new SetListenerHelper.Generic<>(paramInvalidationListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetListenerHelper<E> removeListener(InvalidationListener paramInvalidationListener) {
/* 145 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetListenerHelper<E> addListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 150 */     return new SetListenerHelper.Generic<>(this.listener, paramSetChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected SetListenerHelper<E> removeListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 155 */     return paramSetChangeListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(SetChangeListener.Change<? extends E> paramChange) {
/*     */     try {
/* 161 */       this.listener.onChanged(paramChange);
/* 162 */     } catch (Exception exception) {
/* 163 */       Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), exception);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\SetListenerHelper$SingleChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */