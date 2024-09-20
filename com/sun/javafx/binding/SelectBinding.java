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
/*     */ import javafx.beans.binding.BooleanBinding;
/*     */ import javafx.beans.binding.DoubleBinding;
/*     */ import javafx.beans.binding.FloatBinding;
/*     */ import javafx.beans.binding.IntegerBinding;
/*     */ import javafx.beans.binding.LongBinding;
/*     */ import javafx.beans.binding.ObjectBinding;
/*     */ import javafx.beans.binding.StringBinding;
/*     */ import javafx.beans.value.ObservableBooleanValue;
/*     */ import javafx.beans.value.ObservableNumberValue;
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
/*     */ public class SelectBinding
/*     */ {
/*     */   public static class AsObject<T>
/*     */     extends ObjectBinding<T>
/*     */   {
/*     */     private final SelectBinding.SelectBindingHelper helper;
/*     */     
/*     */     public AsObject(ObservableValue<?> param1ObservableValue, String... param1VarArgs) {
/*  71 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1ObservableValue, param1VarArgs);
/*     */     }
/*     */     
/*     */     public AsObject(Object param1Object, String... param1VarArgs) {
/*  75 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1Object, param1VarArgs);
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/*  80 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected void onInvalidating() {
/*  85 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     protected T computeValue() {
/*  91 */       ObservableValue<?> observableValue = this.helper.getObservableValue();
/*  92 */       if (observableValue == null) {
/*  93 */         return null;
/*     */       }
/*     */       try {
/*  96 */         return (T)observableValue.getValue();
/*  97 */       } catch (ClassCastException classCastException) {
/*  98 */         Logging.getLogger().warning("Value of select-binding has wrong type, returning null.", classCastException);
/*     */         
/* 100 */         return null;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public ObservableList<ObservableValue<?>> getDependencies() {
/* 106 */       return this.helper.getDependencies();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class AsBoolean
/*     */     extends BooleanBinding
/*     */   {
/*     */     private static final boolean DEFAULT_VALUE = false;
/*     */     private final SelectBinding.SelectBindingHelper helper;
/*     */     
/*     */     public AsBoolean(ObservableValue<?> param1ObservableValue, String... param1VarArgs) {
/* 118 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1ObservableValue, param1VarArgs);
/*     */     }
/*     */     
/*     */     public AsBoolean(Object param1Object, String... param1VarArgs) {
/* 122 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1Object, param1VarArgs);
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/* 127 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected void onInvalidating() {
/* 132 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean computeValue() {
/* 137 */       ObservableValue<?> observableValue = this.helper.getObservableValue();
/* 138 */       if (observableValue == null) {
/* 139 */         return false;
/*     */       }
/* 141 */       if (observableValue instanceof ObservableBooleanValue) {
/* 142 */         return ((ObservableBooleanValue)observableValue).get();
/*     */       }
/*     */       try {
/* 145 */         return ((Boolean)observableValue.getValue()).booleanValue();
/* 146 */       } catch (NullPointerException nullPointerException) {
/* 147 */         Logging.getLogger().fine("Value of select binding is null, returning default value", nullPointerException);
/* 148 */       } catch (ClassCastException classCastException) {
/* 149 */         Logging.getLogger().warning("Value of select-binding has wrong type, returning default value.", classCastException);
/*     */       } 
/* 151 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     public ObservableList<ObservableValue<?>> getDependencies() {
/* 156 */       return this.helper.getDependencies();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class AsDouble
/*     */     extends DoubleBinding
/*     */   {
/*     */     private static final double DEFAULT_VALUE = 0.0D;
/*     */     private final SelectBinding.SelectBindingHelper helper;
/*     */     
/*     */     public AsDouble(ObservableValue<?> param1ObservableValue, String... param1VarArgs) {
/* 168 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1ObservableValue, param1VarArgs);
/*     */     }
/*     */     
/*     */     public AsDouble(Object param1Object, String... param1VarArgs) {
/* 172 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1Object, param1VarArgs);
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/* 177 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected void onInvalidating() {
/* 182 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected double computeValue() {
/* 187 */       ObservableValue<?> observableValue = this.helper.getObservableValue();
/* 188 */       if (observableValue == null) {
/* 189 */         return 0.0D;
/*     */       }
/* 191 */       if (observableValue instanceof ObservableNumberValue) {
/* 192 */         return ((ObservableNumberValue)observableValue).doubleValue();
/*     */       }
/*     */       try {
/* 195 */         return ((Number)observableValue.getValue()).doubleValue();
/* 196 */       } catch (NullPointerException nullPointerException) {
/* 197 */         Logging.getLogger().fine("Value of select binding is null, returning default value", nullPointerException);
/* 198 */       } catch (ClassCastException classCastException) {
/* 199 */         Logging.getLogger().warning("Exception while evaluating select-binding", classCastException);
/*     */       } 
/* 201 */       return 0.0D;
/*     */     }
/*     */ 
/*     */     
/*     */     public ObservableList<ObservableValue<?>> getDependencies() {
/* 206 */       return this.helper.getDependencies();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class AsFloat
/*     */     extends FloatBinding
/*     */   {
/*     */     private static final float DEFAULT_VALUE = 0.0F;
/*     */     private final SelectBinding.SelectBindingHelper helper;
/*     */     
/*     */     public AsFloat(ObservableValue<?> param1ObservableValue, String... param1VarArgs) {
/* 218 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1ObservableValue, param1VarArgs);
/*     */     }
/*     */     
/*     */     public AsFloat(Object param1Object, String... param1VarArgs) {
/* 222 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1Object, param1VarArgs);
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/* 227 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected void onInvalidating() {
/* 232 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected float computeValue() {
/* 237 */       ObservableValue<?> observableValue = this.helper.getObservableValue();
/* 238 */       if (observableValue == null) {
/* 239 */         return 0.0F;
/*     */       }
/* 241 */       if (observableValue instanceof ObservableNumberValue) {
/* 242 */         return ((ObservableNumberValue)observableValue).floatValue();
/*     */       }
/*     */       try {
/* 245 */         return ((Number)observableValue.getValue()).floatValue();
/* 246 */       } catch (NullPointerException nullPointerException) {
/* 247 */         Logging.getLogger().fine("Value of select binding is null, returning default value", nullPointerException);
/* 248 */       } catch (ClassCastException classCastException) {
/* 249 */         Logging.getLogger().warning("Exception while evaluating select-binding", classCastException);
/*     */       } 
/* 251 */       return 0.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     public ObservableList<ObservableValue<?>> getDependencies() {
/* 256 */       return this.helper.getDependencies();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class AsInteger
/*     */     extends IntegerBinding
/*     */   {
/*     */     private static final int DEFAULT_VALUE = 0;
/*     */     private final SelectBinding.SelectBindingHelper helper;
/*     */     
/*     */     public AsInteger(ObservableValue<?> param1ObservableValue, String... param1VarArgs) {
/* 268 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1ObservableValue, param1VarArgs);
/*     */     }
/*     */     
/*     */     public AsInteger(Object param1Object, String... param1VarArgs) {
/* 272 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1Object, param1VarArgs);
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/* 277 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected void onInvalidating() {
/* 282 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected int computeValue() {
/* 287 */       ObservableValue<?> observableValue = this.helper.getObservableValue();
/* 288 */       if (observableValue == null) {
/* 289 */         return 0;
/*     */       }
/* 291 */       if (observableValue instanceof ObservableNumberValue) {
/* 292 */         return ((ObservableNumberValue)observableValue).intValue();
/*     */       }
/*     */       try {
/* 295 */         return ((Number)observableValue.getValue()).intValue();
/* 296 */       } catch (NullPointerException nullPointerException) {
/* 297 */         Logging.getLogger().fine("Value of select binding is null, returning default value", nullPointerException);
/* 298 */       } catch (ClassCastException classCastException) {
/* 299 */         Logging.getLogger().warning("Exception while evaluating select-binding", classCastException);
/*     */       } 
/* 301 */       return 0;
/*     */     }
/*     */ 
/*     */     
/*     */     public ObservableList<ObservableValue<?>> getDependencies() {
/* 306 */       return this.helper.getDependencies();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class AsLong
/*     */     extends LongBinding
/*     */   {
/*     */     private static final long DEFAULT_VALUE = 0L;
/*     */     private final SelectBinding.SelectBindingHelper helper;
/*     */     
/*     */     public AsLong(ObservableValue<?> param1ObservableValue, String... param1VarArgs) {
/* 318 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1ObservableValue, param1VarArgs);
/*     */     }
/*     */     
/*     */     public AsLong(Object param1Object, String... param1VarArgs) {
/* 322 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1Object, param1VarArgs);
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/* 327 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected void onInvalidating() {
/* 332 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected long computeValue() {
/* 337 */       ObservableValue<?> observableValue = this.helper.getObservableValue();
/* 338 */       if (observableValue == null) {
/* 339 */         return 0L;
/*     */       }
/* 341 */       if (observableValue instanceof ObservableNumberValue) {
/* 342 */         return ((ObservableNumberValue)observableValue).longValue();
/*     */       }
/*     */       try {
/* 345 */         return ((Number)observableValue.getValue()).longValue();
/* 346 */       } catch (NullPointerException nullPointerException) {
/* 347 */         Logging.getLogger().fine("Value of select binding is null, returning default value", nullPointerException);
/* 348 */       } catch (ClassCastException classCastException) {
/* 349 */         Logging.getLogger().warning("Exception while evaluating select-binding", classCastException);
/*     */       } 
/* 351 */       return 0L;
/*     */     }
/*     */ 
/*     */     
/*     */     public ObservableList<ObservableValue<?>> getDependencies() {
/* 356 */       return this.helper.getDependencies();
/*     */     }
/*     */   }
/*     */   
/*     */   public static class AsString
/*     */     extends StringBinding
/*     */   {
/* 363 */     private static final String DEFAULT_VALUE = null;
/*     */     
/*     */     private final SelectBinding.SelectBindingHelper helper;
/*     */     
/*     */     public AsString(ObservableValue<?> param1ObservableValue, String... param1VarArgs) {
/* 368 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1ObservableValue, param1VarArgs);
/*     */     }
/*     */     
/*     */     public AsString(Object param1Object, String... param1VarArgs) {
/* 372 */       this.helper = new SelectBinding.SelectBindingHelper((Binding<?>)this, param1Object, param1VarArgs);
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/* 377 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected void onInvalidating() {
/* 382 */       this.helper.unregisterListener();
/*     */     }
/*     */ 
/*     */     
/*     */     protected String computeValue() {
/* 387 */       ObservableValue<?> observableValue = this.helper.getObservableValue();
/* 388 */       if (observableValue == null) {
/* 389 */         return DEFAULT_VALUE;
/*     */       }
/*     */       try {
/* 392 */         return observableValue.getValue().toString();
/* 393 */       } catch (RuntimeException runtimeException) {
/* 394 */         Logging.getLogger().warning("Exception while evaluating select-binding", runtimeException);
/*     */         
/* 396 */         return DEFAULT_VALUE;
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public ObservableList<ObservableValue<?>> getDependencies() {
/* 402 */       return this.helper.getDependencies();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   private static class SelectBindingHelper
/*     */     implements InvalidationListener
/*     */   {
/*     */     private final Binding<?> binding;
/*     */     private final String[] propertyNames;
/*     */     private final ObservableValue<?>[] properties;
/*     */     private final PropertyReference<?>[] propRefs;
/*     */     private final WeakInvalidationListener observer;
/*     */     private ObservableList<ObservableValue<?>> dependencies;
/*     */     
/*     */     private SelectBindingHelper(Binding<?> param1Binding, ObservableValue<?> param1ObservableValue, String... param1VarArgs) {
/* 418 */       if (param1ObservableValue == null) {
/* 419 */         throw new NullPointerException("Must specify the root");
/*     */       }
/* 421 */       if (param1VarArgs == null) {
/* 422 */         param1VarArgs = new String[0];
/*     */       }
/*     */       
/* 425 */       this.binding = param1Binding;
/*     */       
/* 427 */       int i = param1VarArgs.length;
/* 428 */       for (byte b = 0; b < i; b++) {
/* 429 */         if (param1VarArgs[b] == null) {
/* 430 */           throw new NullPointerException("all steps must be specified");
/*     */         }
/*     */       } 
/*     */       
/* 434 */       this.observer = new WeakInvalidationListener(this);
/* 435 */       this.propertyNames = new String[i];
/* 436 */       System.arraycopy(param1VarArgs, 0, this.propertyNames, 0, i);
/* 437 */       this.propRefs = (PropertyReference<?>[])new PropertyReference[i];
/* 438 */       this.properties = (ObservableValue<?>[])new ObservableValue[i + 1];
/* 439 */       this.properties[0] = param1ObservableValue;
/* 440 */       this.properties[0].addListener((InvalidationListener)this.observer);
/*     */     }
/*     */     
/*     */     private static ObservableValue<?> checkAndCreateFirstStep(Object param1Object, String[] param1ArrayOfString) {
/* 444 */       if (param1Object == null || param1ArrayOfString == null || param1ArrayOfString[0] == null) {
/* 445 */         throw new NullPointerException("Must specify the root and the first property");
/*     */       }
/*     */       try {
/* 448 */         return (ObservableValue<?>)JavaBeanAccessHelper.createReadOnlyJavaBeanProperty(param1Object, param1ArrayOfString[0]);
/* 449 */       } catch (NoSuchMethodException noSuchMethodException) {
/* 450 */         throw new IllegalArgumentException("The first property '" + param1ArrayOfString[0] + "' doesn't exist");
/*     */       } 
/*     */     }
/*     */     
/*     */     private SelectBindingHelper(Binding<?> param1Binding, Object param1Object, String... param1VarArgs) {
/* 455 */       this(param1Binding, checkAndCreateFirstStep(param1Object, param1VarArgs), Arrays.<String>copyOfRange(param1VarArgs, 1, param1VarArgs.length));
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 460 */       this.binding.invalidate();
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public ObservableValue<?> getObservableValue() {
/* 466 */       int i = this.properties.length;
/* 467 */       for (byte b = 0; b < i - 1; b++) {
/* 468 */         Object object = this.properties[b].getValue();
/*     */         try {
/* 470 */           if (this.propRefs[b] == null || 
/* 471 */             !object.getClass().equals(this.propRefs[b]
/* 472 */               .getContainingClass())) {
/* 473 */             this.propRefs[b] = new PropertyReference(object.getClass(), this.propertyNames[b]);
/*     */           }
/*     */           
/* 476 */           if (this.propRefs[b].hasProperty()) {
/* 477 */             this.properties[b + 1] = (ObservableValue<?>)this.propRefs[b].getProperty(object);
/*     */           } else {
/* 479 */             this.properties[b + 1] = (ObservableValue<?>)JavaBeanAccessHelper.createReadOnlyJavaBeanProperty(object, this.propRefs[b].getName());
/*     */           } 
/* 481 */         } catch (NoSuchMethodException noSuchMethodException) {
/* 482 */           Logging.getLogger().warning("Exception while evaluating select-binding " + stepsToString(), noSuchMethodException);
/*     */           
/* 484 */           updateDependencies();
/* 485 */           return null;
/* 486 */         } catch (RuntimeException runtimeException) {
/* 487 */           Logging.ErrorLogger errorLogger = Logging.getLogger();
/* 488 */           if (errorLogger.isLoggable(PlatformLogger.Level.WARNING)) {
/* 489 */             String str = "Exception while evaluating select-binding " + stepsToString();
/* 490 */             if (runtimeException instanceof IllegalStateException) {
/* 491 */               errorLogger.warning(str);
/* 492 */               errorLogger.warning("Property '" + this.propertyNames[b] + "' does not exist in " + String.valueOf(object.getClass()), runtimeException);
/* 493 */             } else if (runtimeException instanceof NullPointerException) {
/* 494 */               errorLogger.fine(str);
/* 495 */               errorLogger.fine("Property '" + this.propertyNames[b] + "' in " + String.valueOf(this.properties[b]) + " is null", runtimeException);
/*     */             } else {
/* 497 */               errorLogger.warning(str, runtimeException);
/*     */             } 
/*     */           } 
/*     */           
/* 501 */           updateDependencies();
/* 502 */           return null;
/*     */         } 
/* 504 */         this.properties[b + 1].addListener((InvalidationListener)this.observer);
/*     */       } 
/* 506 */       updateDependencies();
/* 507 */       ObservableValue<?> observableValue = this.properties[i - 1];
/* 508 */       if (observableValue == null) {
/* 509 */         Logging.getLogger().fine("Property '" + this.propertyNames[i - 1] + "' in " + String.valueOf(this.properties[i - 1]) + " is null", new NullPointerException());
/*     */       }
/* 511 */       return observableValue;
/*     */     }
/*     */     
/*     */     private String stepsToString() {
/* 515 */       return Arrays.toString((Object[])this.propertyNames);
/*     */     }
/*     */     
/*     */     private void unregisterListener() {
/* 519 */       int i = this.properties.length;
/* 520 */       for (byte b = 1; b < i && 
/* 521 */         this.properties[b] != null; b++) {
/*     */ 
/*     */         
/* 524 */         this.properties[b].removeListener((InvalidationListener)this.observer);
/* 525 */         this.properties[b] = null;
/*     */       } 
/* 527 */       updateDependencies();
/*     */     }
/*     */     
/*     */     private void updateDependencies() {
/* 531 */       if (this.dependencies != null) {
/* 532 */         this.dependencies.clear();
/* 533 */         int i = this.properties.length;
/* 534 */         for (byte b = 0; b < i && 
/* 535 */           this.properties[b] != null; b++)
/*     */         {
/*     */           
/* 538 */           this.dependencies.add(this.properties[b]);
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/*     */     public ObservableList<ObservableValue<?>> getDependencies() {
/* 544 */       if (this.dependencies == null) {
/* 545 */         this.dependencies = FXCollections.observableArrayList();
/* 546 */         updateDependencies();
/*     */       } 
/*     */       
/* 549 */       return FXCollections.unmodifiableObservableList(this.dependencies);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\binding\SelectBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */