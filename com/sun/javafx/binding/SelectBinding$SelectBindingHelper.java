/*     */ package com.sun.javafx.binding;
/*     */ 
/*     */ import com.sun.javafx.logging.PlatformLogger;
/*     */ import com.sun.javafx.property.JavaBeanAccessHelper;
/*     */ import com.sun.javafx.property.PropertyReference;
/*     */ import java.util.Arrays;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakInvalidationListener;
/*     */ import javafx.beans.binding.Binding;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.FXCollections;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class SelectBindingHelper
/*     */   implements InvalidationListener
/*     */ {
/*     */   private final Binding<?> binding;
/*     */   private final String[] propertyNames;
/*     */   private final ObservableValue<?>[] properties;
/*     */   private final PropertyReference<?>[] propRefs;
/*     */   private final WeakInvalidationListener observer;
/*     */   private ObservableList<ObservableValue<?>> dependencies;
/*     */   
/*     */   private SelectBindingHelper(Binding<?> paramBinding, ObservableValue<?> paramObservableValue, String... paramVarArgs) {
/* 418 */     if (paramObservableValue == null) {
/* 419 */       throw new NullPointerException("Must specify the root");
/*     */     }
/* 421 */     if (paramVarArgs == null) {
/* 422 */       paramVarArgs = new String[0];
/*     */     }
/*     */     
/* 425 */     this.binding = paramBinding;
/*     */     
/* 427 */     int i = paramVarArgs.length;
/* 428 */     for (byte b = 0; b < i; b++) {
/* 429 */       if (paramVarArgs[b] == null) {
/* 430 */         throw new NullPointerException("all steps must be specified");
/*     */       }
/*     */     } 
/*     */     
/* 434 */     this.observer = new WeakInvalidationListener(this);
/* 435 */     this.propertyNames = new String[i];
/* 436 */     System.arraycopy(paramVarArgs, 0, this.propertyNames, 0, i);
/* 437 */     this.propRefs = (PropertyReference<?>[])new PropertyReference[i];
/* 438 */     this.properties = (ObservableValue<?>[])new ObservableValue[i + 1];
/* 439 */     this.properties[0] = paramObservableValue;
/* 440 */     this.properties[0].addListener((InvalidationListener)this.observer);
/*     */   }
/*     */   
/*     */   private static ObservableValue<?> checkAndCreateFirstStep(Object paramObject, String[] paramArrayOfString) {
/* 444 */     if (paramObject == null || paramArrayOfString == null || paramArrayOfString[0] == null) {
/* 445 */       throw new NullPointerException("Must specify the root and the first property");
/*     */     }
/*     */     try {
/* 448 */       return (ObservableValue<?>)JavaBeanAccessHelper.createReadOnlyJavaBeanProperty(paramObject, paramArrayOfString[0]);
/* 449 */     } catch (NoSuchMethodException noSuchMethodException) {
/* 450 */       throw new IllegalArgumentException("The first property '" + paramArrayOfString[0] + "' doesn't exist");
/*     */     } 
/*     */   }
/*     */   
/*     */   private SelectBindingHelper(Binding<?> paramBinding, Object paramObject, String... paramVarArgs) {
/* 455 */     this(paramBinding, checkAndCreateFirstStep(paramObject, paramVarArgs), Arrays.<String>copyOfRange(paramVarArgs, 1, paramVarArgs.length));
/*     */   }
/*     */ 
/*     */   
/*     */   public void invalidated(Observable paramObservable) {
/* 460 */     this.binding.invalidate();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ObservableValue<?> getObservableValue() {
/* 466 */     int i = this.properties.length;
/* 467 */     for (byte b = 0; b < i - 1; b++) {
/* 468 */       Object object = this.properties[b].getValue();
/*     */       try {
/* 470 */         if (this.propRefs[b] == null || 
/* 471 */           !object.getClass().equals(this.propRefs[b]
/* 472 */             .getContainingClass())) {
/* 473 */           this.propRefs[b] = new PropertyReference(object.getClass(), this.propertyNames[b]);
/*     */         }
/*     */         
/* 476 */         if (this.propRefs[b].hasProperty()) {
/* 477 */           this.properties[b + 1] = (ObservableValue<?>)this.propRefs[b].getProperty(object);
/*     */         } else {
/* 479 */           this.properties[b + 1] = (ObservableValue<?>)JavaBeanAccessHelper.createReadOnlyJavaBeanProperty(object, this.propRefs[b].getName());
/*     */         } 
/* 481 */       } catch (NoSuchMethodException noSuchMethodException) {
/* 482 */         Logging.getLogger().warning("Exception while evaluating select-binding " + stepsToString(), noSuchMethodException);
/*     */         
/* 484 */         updateDependencies();
/* 485 */         return null;
/* 486 */       } catch (RuntimeException runtimeException) {
/* 487 */         Logging.ErrorLogger errorLogger = Logging.getLogger();
/* 488 */         if (errorLogger.isLoggable(PlatformLogger.Level.WARNING)) {
/* 489 */           String str = "Exception while evaluating select-binding " + stepsToString();
/* 490 */           if (runtimeException instanceof IllegalStateException) {
/* 491 */             errorLogger.warning(str);
/* 492 */             errorLogger.warning("Property '" + this.propertyNames[b] + "' does not exist in " + String.valueOf(object.getClass()), runtimeException);
/* 493 */           } else if (runtimeException instanceof NullPointerException) {
/* 494 */             errorLogger.fine(str);
/* 495 */             errorLogger.fine("Property '" + this.propertyNames[b] + "' in " + String.valueOf(this.properties[b]) + " is null", runtimeException);
/*     */           } else {
/* 497 */             errorLogger.warning(str, runtimeException);
/*     */           } 
/*     */         } 
/*     */         
/* 501 */         updateDependencies();
/* 502 */         return null;
/*     */       } 
/* 504 */       this.properties[b + 1].addListener((InvalidationListener)this.observer);
/*     */     } 
/* 506 */     updateDependencies();
/* 507 */     ObservableValue<?> observableValue = this.properties[i - 1];
/* 508 */     if (observableValue == null) {
/* 509 */       Logging.getLogger().fine("Property '" + this.propertyNames[i - 1] + "' in " + String.valueOf(this.properties[i - 1]) + " is null", new NullPointerException());
/*     */     }
/* 511 */     return observableValue;
/*     */   }
/*     */   
/*     */   private String stepsToString() {
/* 515 */     return Arrays.toString((Object[])this.propertyNames);
/*     */   }
/*     */   
/*     */   private void unregisterListener() {
/* 519 */     int i = this.properties.length;
/* 520 */     for (byte b = 1; b < i && 
/* 521 */       this.properties[b] != null; b++) {
/*     */ 
/*     */       
/* 524 */       this.properties[b].removeListener((InvalidationListener)this.observer);
/* 525 */       this.properties[b] = null;
/*     */     } 
/* 527 */     updateDependencies();
/*     */   }
/*     */   
/*     */   private void updateDependencies() {
/* 531 */     if (this.dependencies != null) {
/* 532 */       this.dependencies.clear();
/* 533 */       int i = this.properties.length;
/* 534 */       for (byte b = 0; b < i && 
/* 535 */         this.properties[b] != null; b++)
/*     */       {
/*     */         
/* 538 */         this.dependencies.add(this.properties[b]);
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public ObservableList<ObservableValue<?>> getDependencies() {
/* 544 */     if (this.dependencies == null) {
/* 545 */       this.dependencies = FXCollections.observableArrayList();
/* 546 */       updateDependencies();
/*     */     } 
/*     */     
/* 549 */     return FXCollections.unmodifiableObservableList(this.dependencies);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\SelectBinding$SelectBindingHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */