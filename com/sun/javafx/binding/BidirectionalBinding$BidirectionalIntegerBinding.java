/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.property.IntegerProperty;
/*     */ import javafx.beans.property.Property;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class BidirectionalIntegerBinding
/*     */   extends BidirectionalBinding
/*     */ {
/*     */   private final WeakReference<IntegerProperty> propertyRef1;
/*     */   private final WeakReference<IntegerProperty> propertyRef2;
/*     */   private int oldValue;
/*     */   private boolean updating = false;
/*     */   
/*     */   private BidirectionalIntegerBinding(IntegerProperty paramIntegerProperty1, IntegerProperty paramIntegerProperty2) {
/* 463 */     super(paramIntegerProperty1, paramIntegerProperty2);
/* 464 */     this.oldValue = paramIntegerProperty1.get();
/* 465 */     this.propertyRef1 = new WeakReference<>(paramIntegerProperty1);
/* 466 */     this.propertyRef2 = new WeakReference<>(paramIntegerProperty2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Property<Number> getProperty1() {
/* 471 */     return (Property<Number>)this.propertyRef1.get();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Property<Number> getProperty2() {
/* 476 */     return (Property<Number>)this.propertyRef2.get();
/*     */   }
/*     */ 
/*     */   
/*     */   public void invalidated(Observable paramObservable) {
/* 481 */     if (!this.updating) {
/* 482 */       IntegerProperty integerProperty1 = this.propertyRef1.get();
/* 483 */       IntegerProperty integerProperty2 = this.propertyRef2.get();
/* 484 */       if (integerProperty1 == null || integerProperty2 == null) {
/* 485 */         if (integerProperty1 != null) {
/* 486 */           integerProperty1.removeListener(this);
/*     */         }
/* 488 */         if (integerProperty2 != null) {
/* 489 */           integerProperty2.removeListener(this);
/*     */         }
/*     */       } else {
/*     */         try {
/* 493 */           this.updating = true;
/* 494 */           if (integerProperty1 == paramObservable) {
/* 495 */             int i = integerProperty1.get();
/* 496 */             integerProperty2.set(i);
/* 497 */             integerProperty2.get();
/* 498 */             this.oldValue = i;
/*     */           } else {
/* 500 */             int i = integerProperty2.get();
/* 501 */             integerProperty1.set(i);
/* 502 */             integerProperty1.get();
/* 503 */             this.oldValue = i;
/*     */           } 
/* 505 */         } catch (RuntimeException runtimeException) {
/*     */           try {
/* 507 */             if (integerProperty1 == paramObservable) {
/* 508 */               integerProperty1.set(this.oldValue);
/* 509 */               integerProperty1.get();
/*     */             } else {
/* 511 */               integerProperty2.set(this.oldValue);
/* 512 */               integerProperty2.get();
/*     */             } 
/* 514 */           } catch (Exception exception) {
/* 515 */             exception.addSuppressed(runtimeException);
/* 516 */             unbind((Property<?>)integerProperty1, (Property<?>)integerProperty2);
/* 517 */             throw new RuntimeException("Bidirectional binding failed together with an attempt to restore the source property to the previous value. Removing the bidirectional binding from properties " + String.valueOf(integerProperty1) + " and " + String.valueOf(integerProperty2), exception);
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 523 */           throw new RuntimeException("Bidirectional binding failed, setting to the previous value", runtimeException);
/*     */         } finally {
/*     */           
/* 526 */           this.updating = false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\BidirectionalBinding$BidirectionalIntegerBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */