/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.property.BooleanProperty;
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
/*     */ class BidirectionalBooleanBinding
/*     */   extends BidirectionalBinding
/*     */ {
/*     */   private final WeakReference<BooleanProperty> propertyRef1;
/*     */   private final WeakReference<BooleanProperty> propertyRef2;
/*     */   private boolean oldValue;
/*     */   private boolean updating;
/*     */   
/*     */   private BidirectionalBooleanBinding(BooleanProperty paramBooleanProperty1, BooleanProperty paramBooleanProperty2) {
/* 232 */     super(paramBooleanProperty1, paramBooleanProperty2);
/* 233 */     this.oldValue = paramBooleanProperty1.get();
/* 234 */     this.propertyRef1 = new WeakReference<>(paramBooleanProperty1);
/* 235 */     this.propertyRef2 = new WeakReference<>(paramBooleanProperty2);
/*     */   }
/*     */ 
/*     */   
/*     */   protected Property<Boolean> getProperty1() {
/* 240 */     return (Property<Boolean>)this.propertyRef1.get();
/*     */   }
/*     */ 
/*     */   
/*     */   protected Property<Boolean> getProperty2() {
/* 245 */     return (Property<Boolean>)this.propertyRef2.get();
/*     */   }
/*     */ 
/*     */   
/*     */   public void invalidated(Observable paramObservable) {
/* 250 */     if (!this.updating) {
/* 251 */       BooleanProperty booleanProperty1 = this.propertyRef1.get();
/* 252 */       BooleanProperty booleanProperty2 = this.propertyRef2.get();
/* 253 */       if (booleanProperty1 == null || booleanProperty2 == null) {
/* 254 */         if (booleanProperty1 != null) {
/* 255 */           booleanProperty1.removeListener(this);
/*     */         }
/* 257 */         if (booleanProperty2 != null) {
/* 258 */           booleanProperty2.removeListener(this);
/*     */         }
/*     */       } else {
/*     */         try {
/* 262 */           this.updating = true;
/* 263 */           if (booleanProperty1 == paramObservable) {
/* 264 */             boolean bool = booleanProperty1.get();
/* 265 */             booleanProperty2.set(bool);
/* 266 */             booleanProperty2.get();
/* 267 */             this.oldValue = bool;
/*     */           } else {
/* 269 */             boolean bool = booleanProperty2.get();
/* 270 */             booleanProperty1.set(bool);
/* 271 */             booleanProperty1.get();
/* 272 */             this.oldValue = bool;
/*     */           } 
/* 274 */         } catch (RuntimeException runtimeException) {
/*     */           try {
/* 276 */             if (booleanProperty1 == paramObservable) {
/* 277 */               booleanProperty1.set(this.oldValue);
/* 278 */               booleanProperty1.get();
/*     */             } else {
/* 280 */               booleanProperty2.set(this.oldValue);
/* 281 */               booleanProperty2.get();
/*     */             } 
/* 283 */           } catch (Exception exception) {
/* 284 */             exception.addSuppressed(runtimeException);
/* 285 */             unbind((Property<?>)booleanProperty1, (Property<?>)booleanProperty2);
/* 286 */             throw new RuntimeException("Bidirectional binding failed together with an attempt to restore the source property to the previous value. Removing the bidirectional binding from properties " + String.valueOf(booleanProperty1) + " and " + String.valueOf(booleanProperty2), exception);
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 292 */           throw new RuntimeException("Bidirectional binding failed, setting to the previous value", runtimeException);
/*     */         } finally {
/*     */           
/* 295 */           this.updating = false;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\BidirectionalBinding$BidirectionalBooleanBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */