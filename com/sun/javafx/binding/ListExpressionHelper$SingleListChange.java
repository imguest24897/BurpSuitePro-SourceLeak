/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import com.sun.javafx.collections.NonIterableChange;
/*     */ import com.sun.javafx.collections.SourceAdapterChange;
/*     */ import java.util.List;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableListValue;
/*     */ import javafx.collections.FXCollections;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class SingleListChange<E>
/*     */   extends ListExpressionHelper<E>
/*     */ {
/*     */   private final ListChangeListener<? super E> listener;
/*     */   private ObservableList<E> currentValue;
/*     */   
/*     */   private SingleListChange(ObservableListValue<E> paramObservableListValue, ListChangeListener<? super E> paramListChangeListener) {
/* 247 */     super(paramObservableListValue);
/* 248 */     this.listener = paramListChangeListener;
/* 249 */     this.currentValue = (ObservableList<E>)paramObservableListValue.getValue();
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> addListener(InvalidationListener paramInvalidationListener) {
/* 254 */     return new ListExpressionHelper.Generic<>(this.observable, paramInvalidationListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> removeListener(InvalidationListener paramInvalidationListener) {
/* 259 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> addListener(ChangeListener<? super ObservableList<E>> paramChangeListener) {
/* 264 */     return new ListExpressionHelper.Generic<>(this.observable, paramChangeListener, this.listener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> removeListener(ChangeListener<? super ObservableList<E>> paramChangeListener) {
/* 269 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> addListener(ListChangeListener<? super E> paramListChangeListener) {
/* 274 */     return new ListExpressionHelper.Generic<>(this.observable, this.listener, paramListChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ListExpressionHelper<E> removeListener(ListChangeListener<? super E> paramListChangeListener) {
/* 279 */     return paramListChangeListener.equals(this.listener) ? null : this;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent() {
/* 284 */     ObservableList<E> observableList = this.currentValue;
/* 285 */     this.currentValue = (ObservableList<E>)this.observable.getValue();
/* 286 */     if (this.currentValue != observableList) {
/* 287 */       boolean bool = (this.currentValue == null) ? false : this.currentValue.size();
/*     */ 
/*     */       
/* 290 */       ObservableList observableList1 = (observableList == null) ? FXCollections.emptyObservableList() : FXCollections.unmodifiableObservableList(observableList);
/* 291 */       NonIterableChange.GenericAddRemoveChange genericAddRemoveChange = new NonIterableChange.GenericAddRemoveChange(0, bool, (List)observableList1, (ObservableList)this.observable);
/* 292 */       this.listener.onChanged((ListChangeListener.Change)genericAddRemoveChange);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> paramChange) {
/* 298 */     this.listener.onChanged((ListChangeListener.Change)new SourceAdapterChange((ObservableList)this.observable, paramChange));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ListExpressionHelper$SingleListChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */