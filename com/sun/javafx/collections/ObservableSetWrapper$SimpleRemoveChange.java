/*     */ package com.sun.javafx.collections;
/*     */ 
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
/*     */ class SimpleRemoveChange
/*     */   extends SetChangeListener.Change<E>
/*     */ {
/*     */   private final E removed;
/*     */   
/*     */   public SimpleRemoveChange(E paramE) {
/*  96 */     super(paramObservableSetWrapper);
/*  97 */     this.removed = paramE;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasAdded() {
/* 102 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasRemoved() {
/* 107 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public E getElementAdded() {
/* 112 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public E getElementRemoved() {
/* 117 */     return this.removed;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 122 */     return "removed " + String.valueOf(this.removed);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\collections\ObservableSetWrapper$SimpleRemoveChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */