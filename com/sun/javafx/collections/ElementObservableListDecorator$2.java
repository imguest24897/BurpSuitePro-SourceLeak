/*     */ package com.sun.javafx.collections;
/*     */ 
/*     */ import java.util.List;
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
/*     */ class null
/*     */   implements ListChangeListener<E>
/*     */ {
/*     */   public void onChanged(ListChangeListener.Change<? extends E> paramChange) {
/*  89 */     while (paramChange.next()) {
/*  90 */       if (paramChange.wasAdded() || paramChange.wasRemoved()) {
/*  91 */         int i = paramChange.getRemovedSize();
/*  92 */         List list = paramChange.getRemoved(); int j;
/*  93 */         for (j = 0; j < i; j++) {
/*  94 */           ElementObservableListDecorator.this.observer.detachListener(list.get(j));
/*     */         }
/*  96 */         if (ElementObservableListDecorator.this.decoratedList instanceof java.util.RandomAccess) {
/*  97 */           j = paramChange.getTo();
/*  98 */           for (int k = paramChange.getFrom(); k < j; k++)
/*  99 */             ElementObservableListDecorator.this.observer.attachListener(ElementObservableListDecorator.this.decoratedList.get(k)); 
/*     */           continue;
/*     */         } 
/* 102 */         for (Object object : paramChange.getAddedSubList()) {
/* 103 */           ElementObservableListDecorator.this.observer.attachListener(object);
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/* 108 */     paramChange.reset();
/* 109 */     ElementObservableListDecorator.access$400(ElementObservableListDecorator.this, paramChange);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ElementObservableListDecorator$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */