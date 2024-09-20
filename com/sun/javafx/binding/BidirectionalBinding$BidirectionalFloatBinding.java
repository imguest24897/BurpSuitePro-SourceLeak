/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.property.FloatProperty;
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
/*     */ class BidirectionalFloatBinding
/*     */   extends BidirectionalBinding
/*     */ {
/*     */   private final WeakReference<FloatProperty> propertyRef1;
/*     */   private final WeakReference<FloatProperty> propertyRef2;
/*     */   private float oldValue;
/*     */   private boolean updating = false;
/*     */   
/*     */   private BidirectionalFloatBinding(FloatProperty paramFloatProperty1, FloatProperty paramFloatProperty2) {
/* 386 */     super(paramFloatProperty1, paramFloatProperty2);
/* 387 */     this.oldValue = paramFloatProperty1.get();
/* 388 */     this.propertyRef1 = new WeakReference<>(paramFloatProperty1);
/* 389 */     this.propertyRef2 = new WeakReference<>(paramFloatProperty2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Property<Number> getProperty1() {
/* 394 */     return (Property<Number>)this.propertyRef1.get();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Property<Number> getProperty2() {
/* 399 */     return (Property<Number>)this.propertyRef2.get();
/*     */   }
/*     */ 
/*     */   
/*     */   public void invalidated(Observable paramObservable) {
/* 404 */     if (!this.updating) {
/* 405 */       FloatProperty floatProperty1 = this.propertyRef1.get();
/* 406 */       FloatProperty floatProperty2 = this.propertyRef2.get();
/* 407 */       if (floatProperty1 == null || floatProperty2 == null) {
/* 408 */         if (floatProperty1 != null) {
/* 409 */           floatProperty1.removeListener(this);
/*     */         }
/* 411 */         if (floatProperty2 != null) {
/* 412 */           floatProperty2.removeListener(this);
/*     */         }
/*     */       } else {
/*     */         try {
/* 416 */           this.updating = true;
/* 417 */           if (floatProperty1 == paramObservable) {
/* 418 */             float f = floatProperty1.get();
/* 419 */             floatProperty2.set(f);
/* 420 */             floatProperty2.get();
/* 421 */             this.oldValue = f;
/*     */           } else {
/* 423 */             float f = floatProperty2.get();
/* 424 */             floatProperty1.set(f);
/* 425 */             floatProperty1.get();
/* 426 */             this.oldValue = f;
/*     */           } 
/* 428 */         } catch (RuntimeException runtimeException) {
/*     */           try {
/* 430 */             if (floatProperty1 == paramObservable) {
/* 431 */               floatProperty1.set(this.oldValue);
/* 432 */               floatProperty1.get();
/*     */             } else {
/* 434 */               floatProperty2.set(this.oldValue);
/* 435 */               floatProperty2.get();
/*     */             } 
/* 437 */           } catch (Exception exception) {
/* 438 */             exception.addSuppressed(runtimeException);
/* 439 */             unbind((Property<?>)floatProperty1, (Property<?>)floatProperty2);
/* 440 */             throw new RuntimeException("Bidirectional binding failed together with an attempt to restore the source property to the previous value. Removing the bidirectional binding from properties " + String.valueOf(floatProperty1) + " and " + String.valueOf(floatProperty2), exception);
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 446 */           throw new RuntimeException("Bidirectional binding failed, setting to the previous value", runtimeException);
/*     */         } finally {
/*     */           
/* 449 */           this.updating = false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\BidirectionalBinding$BidirectionalFloatBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */