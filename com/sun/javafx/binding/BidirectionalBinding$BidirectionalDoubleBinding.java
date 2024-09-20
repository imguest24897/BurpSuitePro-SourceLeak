/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.property.DoubleProperty;
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
/*     */ class BidirectionalDoubleBinding
/*     */   extends BidirectionalBinding
/*     */ {
/*     */   private final WeakReference<DoubleProperty> propertyRef1;
/*     */   private final WeakReference<DoubleProperty> propertyRef2;
/*     */   private double oldValue;
/*     */   private boolean updating = false;
/*     */   
/*     */   private BidirectionalDoubleBinding(DoubleProperty paramDoubleProperty1, DoubleProperty paramDoubleProperty2) {
/* 309 */     super(paramDoubleProperty1, paramDoubleProperty2);
/* 310 */     this.oldValue = paramDoubleProperty1.get();
/* 311 */     this.propertyRef1 = new WeakReference<>(paramDoubleProperty1);
/* 312 */     this.propertyRef2 = new WeakReference<>(paramDoubleProperty2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Property<Number> getProperty1() {
/* 317 */     return (Property<Number>)this.propertyRef1.get();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Property<Number> getProperty2() {
/* 322 */     return (Property<Number>)this.propertyRef2.get();
/*     */   }
/*     */ 
/*     */   
/*     */   public void invalidated(Observable paramObservable) {
/* 327 */     if (!this.updating) {
/* 328 */       DoubleProperty doubleProperty1 = this.propertyRef1.get();
/* 329 */       DoubleProperty doubleProperty2 = this.propertyRef2.get();
/* 330 */       if (doubleProperty1 == null || doubleProperty2 == null) {
/* 331 */         if (doubleProperty1 != null) {
/* 332 */           doubleProperty1.removeListener(this);
/*     */         }
/* 334 */         if (doubleProperty2 != null) {
/* 335 */           doubleProperty2.removeListener(this);
/*     */         }
/*     */       } else {
/*     */         try {
/* 339 */           this.updating = true;
/* 340 */           if (doubleProperty1 == paramObservable) {
/* 341 */             double d = doubleProperty1.get();
/* 342 */             doubleProperty2.set(d);
/* 343 */             doubleProperty2.get();
/* 344 */             this.oldValue = d;
/*     */           } else {
/* 346 */             double d = doubleProperty2.get();
/* 347 */             doubleProperty1.set(d);
/* 348 */             doubleProperty1.get();
/* 349 */             this.oldValue = d;
/*     */           } 
/* 351 */         } catch (RuntimeException runtimeException) {
/*     */           try {
/* 353 */             if (doubleProperty1 == paramObservable) {
/* 354 */               doubleProperty1.set(this.oldValue);
/* 355 */               doubleProperty1.get();
/*     */             } else {
/* 357 */               doubleProperty2.set(this.oldValue);
/* 358 */               doubleProperty2.get();
/*     */             } 
/* 360 */           } catch (Exception exception) {
/* 361 */             exception.addSuppressed(runtimeException);
/* 362 */             unbind((Property<?>)doubleProperty1, (Property<?>)doubleProperty2);
/* 363 */             throw new RuntimeException("Bidirectional binding failed together with an attempt to restore the source property to the previous value. Removing the bidirectional binding from properties " + String.valueOf(doubleProperty1) + " and " + String.valueOf(doubleProperty2), exception);
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 369 */           throw new RuntimeException("Bidirectional binding failed, setting to the previous value", runtimeException);
/*     */         } finally {
/*     */           
/* 372 */           this.updating = false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\BidirectionalBinding$BidirectionalDoubleBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */