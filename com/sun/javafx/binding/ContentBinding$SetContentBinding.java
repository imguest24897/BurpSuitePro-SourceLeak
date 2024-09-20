/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import java.util.Set;
/*     */ import javafx.beans.WeakListener;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class SetContentBinding<E>
/*     */   implements SetChangeListener<E>, WeakListener
/*     */ {
/*     */   private final WeakReference<Set<E>> setRef;
/*     */   
/*     */   public SetContentBinding(Set<E> paramSet) {
/* 169 */     this.setRef = new WeakReference<>(paramSet);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onChanged(SetChangeListener.Change<? extends E> paramChange) {
/* 174 */     Set<Object> set = (Set)this.setRef.get();
/* 175 */     if (set == null) {
/* 176 */       paramChange.getSet().removeListener(this);
/*     */     }
/* 178 */     else if (paramChange.wasRemoved()) {
/* 179 */       set.remove(paramChange.getElementRemoved());
/*     */     } else {
/* 181 */       set.add(paramChange.getElementAdded());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean wasGarbageCollected() {
/* 188 */     return (this.setRef.get() == null);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 193 */     Set set = this.setRef.get();
/* 194 */     return (set == null) ? 0 : set.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 199 */     if (this == paramObject) {
/* 200 */       return true;
/*     */     }
/*     */     
/* 203 */     Set set = this.setRef.get();
/* 204 */     if (set == null) {
/* 205 */       return false;
/*     */     }
/*     */     
/* 208 */     if (paramObject instanceof SetContentBinding) {
/* 209 */       SetContentBinding setContentBinding = (SetContentBinding)paramObject;
/* 210 */       Set set1 = setContentBinding.setRef.get();
/* 211 */       return (set == set1);
/*     */     } 
/* 213 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\ContentBinding$SetContentBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */