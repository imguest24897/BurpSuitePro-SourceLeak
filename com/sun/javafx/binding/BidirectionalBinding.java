/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import java.text.Format;
/*     */ import java.text.ParseException;
/*     */ import java.util.Objects;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.beans.property.BooleanProperty;
/*     */ import javafx.beans.property.DoubleProperty;
/*     */ import javafx.beans.property.FloatProperty;
/*     */ import javafx.beans.property.IntegerProperty;
/*     */ import javafx.beans.property.LongProperty;
/*     */ import javafx.beans.property.Property;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.util.StringConverter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class BidirectionalBinding
/*     */   implements InvalidationListener, WeakListener
/*     */ {
/*     */   private final int cachedHashCode;
/*     */   
/*     */   private static void checkParameters(Object paramObject1, Object paramObject2) {
/*  51 */     Objects.requireNonNull(paramObject1, "Both properties must be specified.");
/*  52 */     Objects.requireNonNull(paramObject2, "Both properties must be specified.");
/*  53 */     if (paramObject1 == paramObject2) {
/*  54 */       throw new IllegalArgumentException("Cannot bind property to itself");
/*     */     }
/*     */   }
/*     */   
/*     */   public static <T> BidirectionalBinding bind(Property<T> paramProperty1, Property<T> paramProperty2) {
/*  59 */     checkParameters(paramProperty1, paramProperty2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  71 */     InvalidationListener invalidationListener = (InvalidationListener)((paramProperty1 instanceof DoubleProperty && paramProperty2 instanceof DoubleProperty) ? new BidirectionalDoubleBinding((DoubleProperty)paramProperty1, (DoubleProperty)paramProperty2) : ((paramProperty1 instanceof FloatProperty && paramProperty2 instanceof FloatProperty) ? new BidirectionalFloatBinding((FloatProperty)paramProperty1, (FloatProperty)paramProperty2) : ((paramProperty1 instanceof IntegerProperty && paramProperty2 instanceof IntegerProperty) ? new BidirectionalIntegerBinding((IntegerProperty)paramProperty1, (IntegerProperty)paramProperty2) : ((paramProperty1 instanceof LongProperty && paramProperty2 instanceof LongProperty) ? new BidirectionalLongBinding((LongProperty)paramProperty1, (LongProperty)paramProperty2) : ((paramProperty1 instanceof BooleanProperty && paramProperty2 instanceof BooleanProperty) ? new BidirectionalBooleanBinding((BooleanProperty)paramProperty1, (BooleanProperty)paramProperty2) : new TypedGenericBidirectionalBinding<>(paramProperty1, paramProperty2))))));
/*  72 */     paramProperty1.setValue(paramProperty2.getValue());
/*  73 */     paramProperty1.getValue();
/*  74 */     paramProperty1.addListener(invalidationListener);
/*  75 */     paramProperty2.addListener(invalidationListener);
/*  76 */     return (BidirectionalBinding)invalidationListener;
/*     */   }
/*     */   
/*     */   public static Object bind(Property<String> paramProperty, Property<?> paramProperty1, Format paramFormat) {
/*  80 */     checkParameters(paramProperty, paramProperty1);
/*  81 */     Objects.requireNonNull(paramFormat, "Format cannot be null");
/*  82 */     StringFormatBidirectionalBinding stringFormatBidirectionalBinding = new StringFormatBidirectionalBinding(paramProperty, paramProperty1, paramFormat);
/*  83 */     paramProperty.setValue(paramFormat.format(paramProperty1.getValue()));
/*  84 */     paramProperty.getValue();
/*  85 */     paramProperty.addListener(stringFormatBidirectionalBinding);
/*  86 */     paramProperty1.addListener(stringFormatBidirectionalBinding);
/*  87 */     return stringFormatBidirectionalBinding;
/*     */   }
/*     */   
/*     */   public static <T> Object bind(Property<String> paramProperty, Property<T> paramProperty1, StringConverter<T> paramStringConverter) {
/*  91 */     checkParameters(paramProperty, paramProperty1);
/*  92 */     Objects.requireNonNull(paramStringConverter, "Converter cannot be null");
/*  93 */     StringConverterBidirectionalBinding<T> stringConverterBidirectionalBinding = new StringConverterBidirectionalBinding<>(paramProperty, paramProperty1, paramStringConverter);
/*  94 */     paramProperty.setValue(paramStringConverter.toString(paramProperty1.getValue()));
/*  95 */     paramProperty.getValue();
/*  96 */     paramProperty.addListener(stringConverterBidirectionalBinding);
/*  97 */     paramProperty1.addListener(stringConverterBidirectionalBinding);
/*  98 */     return stringConverterBidirectionalBinding;
/*     */   }
/*     */   
/*     */   public static <T> void unbind(Property<T> paramProperty1, Property<T> paramProperty2) {
/* 102 */     checkParameters(paramProperty1, paramProperty2);
/* 103 */     UntypedGenericBidirectionalBinding untypedGenericBidirectionalBinding = new UntypedGenericBidirectionalBinding(paramProperty1, paramProperty2);
/* 104 */     paramProperty1.removeListener(untypedGenericBidirectionalBinding);
/* 105 */     paramProperty2.removeListener(untypedGenericBidirectionalBinding);
/*     */   }
/*     */   
/*     */   public static void unbind(Object paramObject1, Object paramObject2) {
/* 109 */     checkParameters(paramObject1, paramObject2);
/* 110 */     UntypedGenericBidirectionalBinding untypedGenericBidirectionalBinding = new UntypedGenericBidirectionalBinding(paramObject1, paramObject2);
/* 111 */     if (paramObject1 instanceof ObservableValue) {
/* 112 */       ((ObservableValue)paramObject1).removeListener(untypedGenericBidirectionalBinding);
/*     */     }
/* 114 */     if (paramObject2 instanceof ObservableValue) {
/* 115 */       ((ObservableValue)paramObject2).removeListener(untypedGenericBidirectionalBinding);
/*     */     }
/*     */   }
/*     */   
/*     */   public static BidirectionalBinding bindNumber(Property<Integer> paramProperty, IntegerProperty paramIntegerProperty) {
/* 120 */     return bindNumber(paramProperty, (Property<Number>)paramIntegerProperty);
/*     */   }
/*     */   
/*     */   public static BidirectionalBinding bindNumber(Property<Long> paramProperty, LongProperty paramLongProperty) {
/* 124 */     return bindNumber(paramProperty, (Property<Number>)paramLongProperty);
/*     */   }
/*     */   
/*     */   public static BidirectionalBinding bindNumber(Property<Float> paramProperty, FloatProperty paramFloatProperty) {
/* 128 */     return bindNumber(paramProperty, (Property<Number>)paramFloatProperty);
/*     */   }
/*     */   
/*     */   public static BidirectionalBinding bindNumber(Property<Double> paramProperty, DoubleProperty paramDoubleProperty) {
/* 132 */     return bindNumber(paramProperty, (Property<Number>)paramDoubleProperty);
/*     */   }
/*     */   
/*     */   public static BidirectionalBinding bindNumber(IntegerProperty paramIntegerProperty, Property<Integer> paramProperty) {
/* 136 */     return bindNumberObject((Property<Number>)paramIntegerProperty, paramProperty);
/*     */   }
/*     */   
/*     */   public static BidirectionalBinding bindNumber(LongProperty paramLongProperty, Property<Long> paramProperty) {
/* 140 */     return bindNumberObject((Property<Number>)paramLongProperty, paramProperty);
/*     */   }
/*     */   
/*     */   public static BidirectionalBinding bindNumber(FloatProperty paramFloatProperty, Property<Float> paramProperty) {
/* 144 */     return bindNumberObject((Property<Number>)paramFloatProperty, paramProperty);
/*     */   }
/*     */   
/*     */   public static BidirectionalBinding bindNumber(DoubleProperty paramDoubleProperty, Property<Double> paramProperty) {
/* 148 */     return bindNumberObject((Property<Number>)paramDoubleProperty, paramProperty);
/*     */   }
/*     */   
/*     */   private static <T extends Number> BidirectionalBinding bindNumberObject(Property<Number> paramProperty, Property<T> paramProperty1) {
/* 152 */     checkParameters(paramProperty, paramProperty1);
/*     */     
/* 154 */     TypedNumberBidirectionalBinding<T> typedNumberBidirectionalBinding = new TypedNumberBidirectionalBinding<>(paramProperty1, paramProperty);
/*     */     
/* 156 */     paramProperty.setValue(paramProperty1.getValue());
/* 157 */     paramProperty.getValue();
/* 158 */     paramProperty.addListener(typedNumberBidirectionalBinding);
/* 159 */     paramProperty1.addListener(typedNumberBidirectionalBinding);
/* 160 */     return typedNumberBidirectionalBinding;
/*     */   }
/*     */   
/*     */   private static <T extends Number> BidirectionalBinding bindNumber(Property<T> paramProperty, Property<Number> paramProperty1) {
/* 164 */     checkParameters(paramProperty, paramProperty1);
/*     */     
/* 166 */     TypedNumberBidirectionalBinding<T> typedNumberBidirectionalBinding = new TypedNumberBidirectionalBinding<>(paramProperty, paramProperty1);
/*     */     
/* 168 */     paramProperty.setValue(paramProperty1.getValue());
/* 169 */     paramProperty.getValue();
/* 170 */     paramProperty.addListener(typedNumberBidirectionalBinding);
/* 171 */     paramProperty1.addListener(typedNumberBidirectionalBinding);
/* 172 */     return typedNumberBidirectionalBinding;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private BidirectionalBinding(Object paramObject1, Object paramObject2) {
/* 178 */     this.cachedHashCode = paramObject1.hashCode() * paramObject2.hashCode();
/*     */   }
/*     */ 
/*     */   
/*     */   protected abstract Object getProperty1();
/*     */   
/*     */   protected abstract Object getProperty2();
/*     */   
/*     */   public int hashCode() {
/* 187 */     return this.cachedHashCode;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean wasGarbageCollected() {
/* 192 */     return (getProperty1() == null || getProperty2() == null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/* 197 */     if (this == paramObject) {
/* 198 */       return true;
/*     */     }
/*     */     
/* 201 */     Object object1 = getProperty1();
/* 202 */     Object object2 = getProperty2();
/* 203 */     if (object1 == null || object2 == null) {
/* 204 */       return false;
/*     */     }
/*     */     
/* 207 */     if (paramObject instanceof BidirectionalBinding) {
/* 208 */       BidirectionalBinding bidirectionalBinding = (BidirectionalBinding)paramObject;
/* 209 */       Object object3 = bidirectionalBinding.getProperty1();
/* 210 */       Object object4 = bidirectionalBinding.getProperty2();
/* 211 */       if (object3 == null || object4 == null) {
/* 212 */         return false;
/*     */       }
/*     */       
/* 215 */       if (object1 == object3 && object2 == object4) {
/* 216 */         return true;
/*     */       }
/* 218 */       if (object1 == object4 && object2 == object3) {
/* 219 */         return true;
/*     */       }
/*     */     } 
/* 222 */     return false;
/*     */   }
/*     */   
/*     */   private static class BidirectionalBooleanBinding extends BidirectionalBinding {
/*     */     private final WeakReference<BooleanProperty> propertyRef1;
/*     */     private final WeakReference<BooleanProperty> propertyRef2;
/*     */     private boolean oldValue;
/*     */     private boolean updating;
/*     */     
/*     */     private BidirectionalBooleanBinding(BooleanProperty param1BooleanProperty1, BooleanProperty param1BooleanProperty2) {
/* 232 */       super(param1BooleanProperty1, param1BooleanProperty2);
/* 233 */       this.oldValue = param1BooleanProperty1.get();
/* 234 */       this.propertyRef1 = new WeakReference<>(param1BooleanProperty1);
/* 235 */       this.propertyRef2 = new WeakReference<>(param1BooleanProperty2);
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<Boolean> getProperty1() {
/* 240 */       return (Property<Boolean>)this.propertyRef1.get();
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<Boolean> getProperty2() {
/* 245 */       return (Property<Boolean>)this.propertyRef2.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 250 */       if (!this.updating) {
/* 251 */         BooleanProperty booleanProperty1 = this.propertyRef1.get();
/* 252 */         BooleanProperty booleanProperty2 = this.propertyRef2.get();
/* 253 */         if (booleanProperty1 == null || booleanProperty2 == null) {
/* 254 */           if (booleanProperty1 != null) {
/* 255 */             booleanProperty1.removeListener(this);
/*     */           }
/* 257 */           if (booleanProperty2 != null) {
/* 258 */             booleanProperty2.removeListener(this);
/*     */           }
/*     */         } else {
/*     */           try {
/* 262 */             this.updating = true;
/* 263 */             if (booleanProperty1 == param1Observable) {
/* 264 */               boolean bool = booleanProperty1.get();
/* 265 */               booleanProperty2.set(bool);
/* 266 */               booleanProperty2.get();
/* 267 */               this.oldValue = bool;
/*     */             } else {
/* 269 */               boolean bool = booleanProperty2.get();
/* 270 */               booleanProperty1.set(bool);
/* 271 */               booleanProperty1.get();
/* 272 */               this.oldValue = bool;
/*     */             } 
/* 274 */           } catch (RuntimeException runtimeException) {
/*     */             try {
/* 276 */               if (booleanProperty1 == param1Observable) {
/* 277 */                 booleanProperty1.set(this.oldValue);
/* 278 */                 booleanProperty1.get();
/*     */               } else {
/* 280 */                 booleanProperty2.set(this.oldValue);
/* 281 */                 booleanProperty2.get();
/*     */               } 
/* 283 */             } catch (Exception exception) {
/* 284 */               exception.addSuppressed(runtimeException);
/* 285 */               unbind((Property<?>)booleanProperty1, (Property<?>)booleanProperty2);
/* 286 */               throw new RuntimeException("Bidirectional binding failed together with an attempt to restore the source property to the previous value. Removing the bidirectional binding from properties " + String.valueOf(booleanProperty1) + " and " + String.valueOf(booleanProperty2), exception);
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 292 */             throw new RuntimeException("Bidirectional binding failed, setting to the previous value", runtimeException);
/*     */           } finally {
/*     */             
/* 295 */             this.updating = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class BidirectionalDoubleBinding extends BidirectionalBinding {
/*     */     private final WeakReference<DoubleProperty> propertyRef1;
/*     */     private final WeakReference<DoubleProperty> propertyRef2;
/*     */     private double oldValue;
/*     */     private boolean updating = false;
/*     */     
/*     */     private BidirectionalDoubleBinding(DoubleProperty param1DoubleProperty1, DoubleProperty param1DoubleProperty2) {
/* 309 */       super(param1DoubleProperty1, param1DoubleProperty2);
/* 310 */       this.oldValue = param1DoubleProperty1.get();
/* 311 */       this.propertyRef1 = new WeakReference<>(param1DoubleProperty1);
/* 312 */       this.propertyRef2 = new WeakReference<>(param1DoubleProperty2);
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<Number> getProperty1() {
/* 317 */       return (Property<Number>)this.propertyRef1.get();
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<Number> getProperty2() {
/* 322 */       return (Property<Number>)this.propertyRef2.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 327 */       if (!this.updating) {
/* 328 */         DoubleProperty doubleProperty1 = this.propertyRef1.get();
/* 329 */         DoubleProperty doubleProperty2 = this.propertyRef2.get();
/* 330 */         if (doubleProperty1 == null || doubleProperty2 == null) {
/* 331 */           if (doubleProperty1 != null) {
/* 332 */             doubleProperty1.removeListener(this);
/*     */           }
/* 334 */           if (doubleProperty2 != null) {
/* 335 */             doubleProperty2.removeListener(this);
/*     */           }
/*     */         } else {
/*     */           try {
/* 339 */             this.updating = true;
/* 340 */             if (doubleProperty1 == param1Observable) {
/* 341 */               double d = doubleProperty1.get();
/* 342 */               doubleProperty2.set(d);
/* 343 */               doubleProperty2.get();
/* 344 */               this.oldValue = d;
/*     */             } else {
/* 346 */               double d = doubleProperty2.get();
/* 347 */               doubleProperty1.set(d);
/* 348 */               doubleProperty1.get();
/* 349 */               this.oldValue = d;
/*     */             } 
/* 351 */           } catch (RuntimeException runtimeException) {
/*     */             try {
/* 353 */               if (doubleProperty1 == param1Observable) {
/* 354 */                 doubleProperty1.set(this.oldValue);
/* 355 */                 doubleProperty1.get();
/*     */               } else {
/* 357 */                 doubleProperty2.set(this.oldValue);
/* 358 */                 doubleProperty2.get();
/*     */               } 
/* 360 */             } catch (Exception exception) {
/* 361 */               exception.addSuppressed(runtimeException);
/* 362 */               unbind((Property<?>)doubleProperty1, (Property<?>)doubleProperty2);
/* 363 */               throw new RuntimeException("Bidirectional binding failed together with an attempt to restore the source property to the previous value. Removing the bidirectional binding from properties " + String.valueOf(doubleProperty1) + " and " + String.valueOf(doubleProperty2), exception);
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 369 */             throw new RuntimeException("Bidirectional binding failed, setting to the previous value", runtimeException);
/*     */           } finally {
/*     */             
/* 372 */             this.updating = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class BidirectionalFloatBinding extends BidirectionalBinding {
/*     */     private final WeakReference<FloatProperty> propertyRef1;
/*     */     private final WeakReference<FloatProperty> propertyRef2;
/*     */     private float oldValue;
/*     */     private boolean updating = false;
/*     */     
/*     */     private BidirectionalFloatBinding(FloatProperty param1FloatProperty1, FloatProperty param1FloatProperty2) {
/* 386 */       super(param1FloatProperty1, param1FloatProperty2);
/* 387 */       this.oldValue = param1FloatProperty1.get();
/* 388 */       this.propertyRef1 = new WeakReference<>(param1FloatProperty1);
/* 389 */       this.propertyRef2 = new WeakReference<>(param1FloatProperty2);
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<Number> getProperty1() {
/* 394 */       return (Property<Number>)this.propertyRef1.get();
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<Number> getProperty2() {
/* 399 */       return (Property<Number>)this.propertyRef2.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 404 */       if (!this.updating) {
/* 405 */         FloatProperty floatProperty1 = this.propertyRef1.get();
/* 406 */         FloatProperty floatProperty2 = this.propertyRef2.get();
/* 407 */         if (floatProperty1 == null || floatProperty2 == null) {
/* 408 */           if (floatProperty1 != null) {
/* 409 */             floatProperty1.removeListener(this);
/*     */           }
/* 411 */           if (floatProperty2 != null) {
/* 412 */             floatProperty2.removeListener(this);
/*     */           }
/*     */         } else {
/*     */           try {
/* 416 */             this.updating = true;
/* 417 */             if (floatProperty1 == param1Observable) {
/* 418 */               float f = floatProperty1.get();
/* 419 */               floatProperty2.set(f);
/* 420 */               floatProperty2.get();
/* 421 */               this.oldValue = f;
/*     */             } else {
/* 423 */               float f = floatProperty2.get();
/* 424 */               floatProperty1.set(f);
/* 425 */               floatProperty1.get();
/* 426 */               this.oldValue = f;
/*     */             } 
/* 428 */           } catch (RuntimeException runtimeException) {
/*     */             try {
/* 430 */               if (floatProperty1 == param1Observable) {
/* 431 */                 floatProperty1.set(this.oldValue);
/* 432 */                 floatProperty1.get();
/*     */               } else {
/* 434 */                 floatProperty2.set(this.oldValue);
/* 435 */                 floatProperty2.get();
/*     */               } 
/* 437 */             } catch (Exception exception) {
/* 438 */               exception.addSuppressed(runtimeException);
/* 439 */               unbind((Property<?>)floatProperty1, (Property<?>)floatProperty2);
/* 440 */               throw new RuntimeException("Bidirectional binding failed together with an attempt to restore the source property to the previous value. Removing the bidirectional binding from properties " + String.valueOf(floatProperty1) + " and " + String.valueOf(floatProperty2), exception);
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 446 */             throw new RuntimeException("Bidirectional binding failed, setting to the previous value", runtimeException);
/*     */           } finally {
/*     */             
/* 449 */             this.updating = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class BidirectionalIntegerBinding extends BidirectionalBinding {
/*     */     private final WeakReference<IntegerProperty> propertyRef1;
/*     */     private final WeakReference<IntegerProperty> propertyRef2;
/*     */     private int oldValue;
/*     */     private boolean updating = false;
/*     */     
/*     */     private BidirectionalIntegerBinding(IntegerProperty param1IntegerProperty1, IntegerProperty param1IntegerProperty2) {
/* 463 */       super(param1IntegerProperty1, param1IntegerProperty2);
/* 464 */       this.oldValue = param1IntegerProperty1.get();
/* 465 */       this.propertyRef1 = new WeakReference<>(param1IntegerProperty1);
/* 466 */       this.propertyRef2 = new WeakReference<>(param1IntegerProperty2);
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<Number> getProperty1() {
/* 471 */       return (Property<Number>)this.propertyRef1.get();
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<Number> getProperty2() {
/* 476 */       return (Property<Number>)this.propertyRef2.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 481 */       if (!this.updating) {
/* 482 */         IntegerProperty integerProperty1 = this.propertyRef1.get();
/* 483 */         IntegerProperty integerProperty2 = this.propertyRef2.get();
/* 484 */         if (integerProperty1 == null || integerProperty2 == null) {
/* 485 */           if (integerProperty1 != null) {
/* 486 */             integerProperty1.removeListener(this);
/*     */           }
/* 488 */           if (integerProperty2 != null) {
/* 489 */             integerProperty2.removeListener(this);
/*     */           }
/*     */         } else {
/*     */           try {
/* 493 */             this.updating = true;
/* 494 */             if (integerProperty1 == param1Observable) {
/* 495 */               int i = integerProperty1.get();
/* 496 */               integerProperty2.set(i);
/* 497 */               integerProperty2.get();
/* 498 */               this.oldValue = i;
/*     */             } else {
/* 500 */               int i = integerProperty2.get();
/* 501 */               integerProperty1.set(i);
/* 502 */               integerProperty1.get();
/* 503 */               this.oldValue = i;
/*     */             } 
/* 505 */           } catch (RuntimeException runtimeException) {
/*     */             try {
/* 507 */               if (integerProperty1 == param1Observable) {
/* 508 */                 integerProperty1.set(this.oldValue);
/* 509 */                 integerProperty1.get();
/*     */               } else {
/* 511 */                 integerProperty2.set(this.oldValue);
/* 512 */                 integerProperty2.get();
/*     */               } 
/* 514 */             } catch (Exception exception) {
/* 515 */               exception.addSuppressed(runtimeException);
/* 516 */               unbind((Property<?>)integerProperty1, (Property<?>)integerProperty2);
/* 517 */               throw new RuntimeException("Bidirectional binding failed together with an attempt to restore the source property to the previous value. Removing the bidirectional binding from properties " + String.valueOf(integerProperty1) + " and " + String.valueOf(integerProperty2), exception);
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 523 */             throw new RuntimeException("Bidirectional binding failed, setting to the previous value", runtimeException);
/*     */           } finally {
/*     */             
/* 526 */             this.updating = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class BidirectionalLongBinding extends BidirectionalBinding {
/*     */     private final WeakReference<LongProperty> propertyRef1;
/*     */     private final WeakReference<LongProperty> propertyRef2;
/*     */     private long oldValue;
/*     */     private boolean updating = false;
/*     */     
/*     */     private BidirectionalLongBinding(LongProperty param1LongProperty1, LongProperty param1LongProperty2) {
/* 540 */       super(param1LongProperty1, param1LongProperty2);
/* 541 */       this.oldValue = param1LongProperty1.get();
/* 542 */       this.propertyRef1 = new WeakReference<>(param1LongProperty1);
/* 543 */       this.propertyRef2 = new WeakReference<>(param1LongProperty2);
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<Number> getProperty1() {
/* 548 */       return (Property<Number>)this.propertyRef1.get();
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<Number> getProperty2() {
/* 553 */       return (Property<Number>)this.propertyRef2.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 558 */       if (!this.updating) {
/* 559 */         LongProperty longProperty1 = this.propertyRef1.get();
/* 560 */         LongProperty longProperty2 = this.propertyRef2.get();
/* 561 */         if (longProperty1 == null || longProperty2 == null) {
/* 562 */           if (longProperty1 != null) {
/* 563 */             longProperty1.removeListener(this);
/*     */           }
/* 565 */           if (longProperty2 != null) {
/* 566 */             longProperty2.removeListener(this);
/*     */           }
/*     */         } else {
/*     */           try {
/* 570 */             this.updating = true;
/* 571 */             if (longProperty1 == param1Observable) {
/* 572 */               long l = longProperty1.get();
/* 573 */               longProperty2.set(l);
/* 574 */               longProperty2.get();
/* 575 */               this.oldValue = l;
/*     */             } else {
/* 577 */               long l = longProperty2.get();
/* 578 */               longProperty1.set(l);
/* 579 */               longProperty1.get();
/* 580 */               this.oldValue = l;
/*     */             } 
/* 582 */           } catch (RuntimeException runtimeException) {
/*     */             try {
/* 584 */               if (longProperty1 == param1Observable) {
/* 585 */                 longProperty1.set(this.oldValue);
/* 586 */                 longProperty1.get();
/*     */               } else {
/* 588 */                 longProperty2.set(this.oldValue);
/* 589 */                 longProperty2.get();
/*     */               } 
/* 591 */             } catch (Exception exception) {
/* 592 */               exception.addSuppressed(runtimeException);
/* 593 */               unbind((Property<?>)longProperty1, (Property<?>)longProperty2);
/* 594 */               throw new RuntimeException("Bidirectional binding failed together with an attempt to restore the source property to the previous value. Removing the bidirectional binding from properties " + String.valueOf(longProperty1) + " and " + String.valueOf(longProperty2), exception);
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 600 */             throw new RuntimeException("Bidirectional binding failed, setting to the previous value", runtimeException);
/*     */           } finally {
/*     */             
/* 603 */             this.updating = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class TypedGenericBidirectionalBinding<T> extends BidirectionalBinding {
/*     */     private final WeakReference<Property<T>> propertyRef1;
/*     */     private final WeakReference<Property<T>> propertyRef2;
/*     */     private T oldValue;
/*     */     private boolean updating = false;
/*     */     
/*     */     private TypedGenericBidirectionalBinding(Property<T> param1Property1, Property<T> param1Property2) {
/* 617 */       super(param1Property1, param1Property2);
/* 618 */       this.oldValue = (T)param1Property1.getValue();
/* 619 */       this.propertyRef1 = new WeakReference<>(param1Property1);
/* 620 */       this.propertyRef2 = new WeakReference<>(param1Property2);
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<T> getProperty1() {
/* 625 */       return this.propertyRef1.get();
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<T> getProperty2() {
/* 630 */       return this.propertyRef2.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 635 */       if (!this.updating) {
/* 636 */         Property<?> property1 = this.propertyRef1.get();
/* 637 */         Property<?> property2 = this.propertyRef2.get();
/* 638 */         if (property1 == null || property2 == null) {
/* 639 */           if (property1 != null) {
/* 640 */             property1.removeListener(this);
/*     */           }
/* 642 */           if (property2 != null) {
/* 643 */             property2.removeListener(this);
/*     */           }
/*     */         } else {
/*     */           try {
/* 647 */             this.updating = true;
/* 648 */             if (property1 == param1Observable) {
/* 649 */               Object object = property1.getValue();
/* 650 */               property2.setValue(object);
/* 651 */               property2.getValue();
/* 652 */               this.oldValue = (T)object;
/*     */             } else {
/* 654 */               Object object = property2.getValue();
/* 655 */               property1.setValue(object);
/* 656 */               property1.getValue();
/* 657 */               this.oldValue = (T)object;
/*     */             } 
/* 659 */           } catch (RuntimeException runtimeException) {
/*     */             try {
/* 661 */               if (property1 == param1Observable) {
/* 662 */                 property1.setValue(this.oldValue);
/* 663 */                 property1.getValue();
/*     */               } else {
/* 665 */                 property2.setValue(this.oldValue);
/* 666 */                 property2.getValue();
/*     */               } 
/* 668 */             } catch (Exception exception) {
/* 669 */               exception.addSuppressed(runtimeException);
/* 670 */               unbind(property1, property2);
/* 671 */               throw new RuntimeException("Bidirectional binding failed together with an attempt to restore the source property to the previous value. Removing the bidirectional binding from properties " + String.valueOf(property1) + " and " + String.valueOf(property2), exception);
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 677 */             throw new RuntimeException("Bidirectional binding failed, setting to the previous value", runtimeException);
/*     */           } finally {
/*     */             
/* 680 */             this.updating = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class TypedNumberBidirectionalBinding<T extends Number> extends BidirectionalBinding {
/*     */     private final WeakReference<Property<T>> propertyRef1;
/*     */     private final WeakReference<Property<Number>> propertyRef2;
/*     */     private T oldValue;
/*     */     private boolean updating = false;
/*     */     
/*     */     private TypedNumberBidirectionalBinding(Property<T> param1Property, Property<Number> param1Property1) {
/* 694 */       super(param1Property, param1Property1);
/* 695 */       this.oldValue = (T)param1Property.getValue();
/* 696 */       this.propertyRef1 = new WeakReference<>(param1Property);
/* 697 */       this.propertyRef2 = new WeakReference<>(param1Property1);
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<T> getProperty1() {
/* 702 */       return this.propertyRef1.get();
/*     */     }
/*     */ 
/*     */     
/*     */     protected Property<Number> getProperty2() {
/* 707 */       return this.propertyRef2.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 712 */       if (!this.updating) {
/* 713 */         Property property1 = this.propertyRef1.get();
/* 714 */         Property property2 = this.propertyRef2.get();
/* 715 */         if (property1 == null || property2 == null) {
/* 716 */           if (property1 != null) {
/* 717 */             property1.removeListener(this);
/*     */           }
/* 719 */           if (property2 != null) {
/* 720 */             property2.removeListener(this);
/*     */           }
/*     */         } else {
/*     */           try {
/* 724 */             this.updating = true;
/* 725 */             if (property1 == param1Observable) {
/* 726 */               Number number = (Number)property1.getValue();
/* 727 */               property2.setValue(number);
/* 728 */               property2.getValue();
/* 729 */               this.oldValue = (T)number;
/*     */             } else {
/* 731 */               Number number = (Number)property2.getValue();
/* 732 */               property1.setValue(number);
/* 733 */               property1.getValue();
/* 734 */               this.oldValue = (T)number;
/*     */             } 
/* 736 */           } catch (RuntimeException runtimeException) {
/*     */             try {
/* 738 */               if (property1 == param1Observable) {
/* 739 */                 property1.setValue(this.oldValue);
/* 740 */                 property1.getValue();
/*     */               } else {
/* 742 */                 property2.setValue(this.oldValue);
/* 743 */                 property2.getValue();
/*     */               } 
/* 745 */             } catch (Exception exception) {
/* 746 */               exception.addSuppressed(runtimeException);
/* 747 */               unbind(property1, property2);
/* 748 */               throw new RuntimeException("Bidirectional binding failed together with an attempt to restore the source property to the previous value. Removing the bidirectional binding from properties " + String.valueOf(property1) + " and " + String.valueOf(property2), exception);
/*     */             } 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 754 */             throw new RuntimeException("Bidirectional binding failed, setting to the previous value", runtimeException);
/*     */           } finally {
/*     */             
/* 757 */             this.updating = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class UntypedGenericBidirectionalBinding extends BidirectionalBinding {
/*     */     private final Object property1;
/*     */     private final Object property2;
/*     */     
/*     */     public UntypedGenericBidirectionalBinding(Object param1Object1, Object param1Object2) {
/* 769 */       super(param1Object1, param1Object2);
/* 770 */       this.property1 = param1Object1;
/* 771 */       this.property2 = param1Object2;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Object getProperty1() {
/* 776 */       return this.property1;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Object getProperty2() {
/* 781 */       return this.property2;
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 786 */       throw new RuntimeException("Should not reach here");
/*     */     }
/*     */   }
/*     */   
/*     */   public static abstract class StringConversionBidirectionalBinding<T> extends BidirectionalBinding {
/*     */     private final WeakReference<Property<String>> stringPropertyRef;
/*     */     private final WeakReference<Property<T>> otherPropertyRef;
/*     */     private boolean updating;
/*     */     
/*     */     public StringConversionBidirectionalBinding(Property<String> param1Property, Property<T> param1Property1) {
/* 796 */       super(param1Property, param1Property1);
/* 797 */       this.stringPropertyRef = new WeakReference<>(param1Property);
/* 798 */       this.otherPropertyRef = new WeakReference<>(param1Property1);
/*     */     }
/*     */ 
/*     */     
/*     */     protected abstract String toString(T param1T);
/*     */     
/*     */     protected abstract T fromString(String param1String) throws ParseException;
/*     */     
/*     */     protected Object getProperty1() {
/* 807 */       return this.stringPropertyRef.get();
/*     */     }
/*     */ 
/*     */     
/*     */     protected Object getProperty2() {
/* 812 */       return this.otherPropertyRef.get();
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 817 */       if (!this.updating) {
/* 818 */         Property property1 = this.stringPropertyRef.get();
/* 819 */         Property property2 = this.otherPropertyRef.get();
/* 820 */         if (property1 == null || property2 == null) {
/* 821 */           if (property1 != null) {
/* 822 */             property1.removeListener(this);
/*     */           }
/* 824 */           if (property2 != null) {
/* 825 */             property2.removeListener(this);
/*     */           }
/*     */         } else {
/*     */           try {
/* 829 */             this.updating = true;
/* 830 */             if (property1 == param1Observable) {
/*     */               try {
/* 832 */                 property2.setValue(fromString((String)property1.getValue()));
/* 833 */                 property2.getValue();
/* 834 */               } catch (Exception exception) {
/* 835 */                 Logging.getLogger().warning("Exception while parsing String in bidirectional binding", exception);
/* 836 */                 property2.setValue(null);
/* 837 */                 property2.getValue();
/*     */               } 
/*     */             } else {
/*     */               try {
/* 841 */                 property1.setValue(toString((T)property2.getValue()));
/* 842 */                 property1.getValue();
/* 843 */               } catch (Exception exception) {
/* 844 */                 Logging.getLogger().warning("Exception while converting Object to String in bidirectional binding", exception);
/* 845 */                 property1.setValue("");
/* 846 */                 property1.getValue();
/*     */               } 
/*     */             } 
/*     */           } finally {
/* 850 */             this.updating = false;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   private static class StringFormatBidirectionalBinding<T> extends StringConversionBidirectionalBinding<T> {
/*     */     private final Format format;
/*     */     
/*     */     public StringFormatBidirectionalBinding(Property<String> param1Property, Property<T> param1Property1, Format param1Format) {
/* 861 */       super(param1Property, param1Property1);
/* 862 */       this.format = param1Format;
/*     */     }
/*     */ 
/*     */     
/*     */     protected String toString(Object param1Object) {
/* 867 */       return this.format.format(param1Object);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     protected T fromString(String param1String) throws ParseException {
/* 873 */       return (T)this.format.parseObject(param1String);
/*     */     }
/*     */   }
/*     */   
/*     */   private static class StringConverterBidirectionalBinding<T> extends StringConversionBidirectionalBinding<T> {
/*     */     private final StringConverter<T> converter;
/*     */     
/*     */     public StringConverterBidirectionalBinding(Property<String> param1Property, Property<T> param1Property1, StringConverter<T> param1StringConverter) {
/* 881 */       super(param1Property, param1Property1);
/* 882 */       this.converter = param1StringConverter;
/*     */     }
/*     */ 
/*     */     
/*     */     protected String toString(T param1T) {
/* 887 */       return this.converter.toString(param1T);
/*     */     }
/*     */ 
/*     */     
/*     */     protected T fromString(String param1String) throws ParseException {
/* 892 */       return (T)this.converter.fromString(param1String);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\BidirectionalBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */