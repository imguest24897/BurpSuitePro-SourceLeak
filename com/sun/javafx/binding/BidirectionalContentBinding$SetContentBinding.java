/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.collections.ObservableSet;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private final WeakReference<ObservableSet<E>> propertyRef1;
/*     */   private final WeakReference<ObservableSet<E>> propertyRef2;
/*     */   private boolean updating = false;
/*     */   
/*     */   public SetContentBinding(ObservableSet<E> paramObservableSet1, ObservableSet<E> paramObservableSet2) {
/* 199 */     this.propertyRef1 = new WeakReference<>(paramObservableSet1);
/* 200 */     this.propertyRef2 = new WeakReference<>(paramObservableSet2);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onChanged(SetChangeListener.Change<? extends E> paramChange) {
/* 205 */     if (!this.updating) {
/* 206 */       ObservableSet observableSet1 = this.propertyRef1.get();
/* 207 */       ObservableSet observableSet2 = this.propertyRef2.get();
/* 208 */       if (observableSet1 == null || observableSet2 == null) {
/* 209 */         if (observableSet1 != null) {
/* 210 */           observableSet1.removeListener(this);
/*     */         }
/* 212 */         if (observableSet2 != null) {
/* 213 */           observableSet2.removeListener(this);
/*     */         }
/*     */       } else {
/*     */         try {
/* 217 */           this.updating = true;
/* 218 */           ObservableSet<Object> observableSet = (observableSet1 == paramChange.getSet()) ? observableSet2 : observableSet1;
/* 219 */           if (paramChange.wasRemoved()) {
/* 220 */             observableSet.remove(paramChange.getElementRemoved());
/*     */           } else {
/* 222 */             observableSet.add(paramChange.getElementAdded());
/*     */           } 
/*     */         } finally {
/* 225 */           this.updating = false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasGarbageCollected() {
/* 233 */     return (this.propertyRef1.get() == null || this.propertyRef2.get() == null);
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 238 */     ObservableSet observableSet1 = this.propertyRef1.get();
/* 239 */     ObservableSet observableSet2 = this.propertyRef2.get();
/* 240 */     byte b1 = (observableSet1 == null) ? 0 : observableSet1.hashCode();
/* 241 */     byte b2 = (observableSet2 == null) ? 0 : observableSet2.hashCode();
/* 242 */     return b1 * b2;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 247 */     if (this == paramObject) {
/* 248 */       return true;
/*     */     }
/*     */     
/* 251 */     Object object1 = this.propertyRef1.get();
/* 252 */     Object object2 = this.propertyRef2.get();
/* 253 */     if (object1 == null || object2 == null) {
/* 254 */       return false;
/*     */     }
/*     */     
/* 257 */     if (paramObject instanceof SetContentBinding) { SetContentBinding setContentBinding = (SetContentBinding)paramObject;
/* 258 */       Object object3 = setContentBinding.propertyRef1.get();
/* 259 */       Object object4 = setContentBinding.propertyRef2.get();
/* 260 */       if (object3 == null || object4 == null) {
/* 261 */         return false;
/*     */       }
/*     */       
/* 264 */       if (object1 == object3 && object2 == object4) {
/* 265 */         return true;
/*     */       }
/* 267 */       if (object1 == object4 && object2 == object3) {
/* 268 */         return true;
/*     */       } }
/*     */     
/* 271 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\BidirectionalContentBinding$SetContentBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */