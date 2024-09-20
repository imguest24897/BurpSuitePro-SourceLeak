/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.DoubleConstant;
/*     */ import com.sun.javafx.binding.FloatConstant;
/*     */ import com.sun.javafx.binding.IntegerConstant;
/*     */ import com.sun.javafx.binding.Logging;
/*     */ import com.sun.javafx.binding.LongConstant;
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.NamedArg;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ObservableBooleanValue;
/*     */ import javafx.beans.value.ObservableNumberValue;
/*     */ import javafx.beans.value.ObservableObjectValue;
/*     */ import javafx.beans.value.ObservableStringValue;
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
/*     */ public class When
/*     */ {
/*     */   private final ObservableBooleanValue condition;
/*     */   
/*     */   public When(@NamedArg("condition") ObservableBooleanValue paramObservableBooleanValue) {
/*  73 */     if (paramObservableBooleanValue == null) {
/*  74 */       throw new NullPointerException("Condition must be specified.");
/*     */     }
/*  76 */     this.condition = paramObservableBooleanValue;
/*     */   }
/*     */   
/*     */   private static class WhenListener
/*     */     implements InvalidationListener {
/*     */     private final ObservableBooleanValue condition;
/*     */     private final ObservableValue<?> thenValue;
/*     */     private final ObservableValue<?> otherwiseValue;
/*     */     private final WeakReference<Binding<?>> ref;
/*     */     
/*     */     private WhenListener(Binding<?> param1Binding, ObservableBooleanValue param1ObservableBooleanValue, ObservableValue<?> param1ObservableValue1, ObservableValue<?> param1ObservableValue2) {
/*  87 */       this.ref = new WeakReference<>(param1Binding);
/*  88 */       this.condition = param1ObservableBooleanValue;
/*  89 */       this.thenValue = param1ObservableValue1;
/*  90 */       this.otherwiseValue = param1ObservableValue2;
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/*  95 */       Binding binding = this.ref.get();
/*  96 */       if (binding == null) {
/*  97 */         this.condition.removeListener(this);
/*  98 */         if (this.thenValue != null) {
/*  99 */           this.thenValue.removeListener(this);
/*     */         }
/* 101 */         if (this.otherwiseValue != null) {
/* 102 */           this.otherwiseValue.removeListener(this);
/*     */ 
/*     */         
/*     */         }
/*     */       
/*     */       }
/* 108 */       else if (this.condition.equals(param1Observable) || (binding.isValid() && this.condition.get() == param1Observable.equals(this.thenValue))) {
/* 109 */         binding.invalidate();
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static NumberBinding createNumberCondition(final ObservableBooleanValue condition, final ObservableNumberValue thenValue, final ObservableNumberValue otherwiseValue) {
/* 120 */     if (thenValue instanceof javafx.beans.value.ObservableDoubleValue || otherwiseValue instanceof javafx.beans.value.ObservableDoubleValue)
/* 121 */       return new DoubleBinding()
/*     */         {
/*     */           final InvalidationListener observer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           public void dispose() {
/* 131 */             condition.removeListener(this.observer);
/* 132 */             thenValue.removeListener(this.observer);
/* 133 */             otherwiseValue.removeListener(this.observer);
/*     */           }
/*     */ 
/*     */           
/*     */           protected double computeValue() {
/* 138 */             boolean bool = condition.get();
/* 139 */             Logging.getLogger().finest("Condition of ternary binding expression was evaluated: {0}", new Object[] { Boolean.valueOf(bool) });
/* 140 */             return bool ? thenValue.doubleValue() : otherwiseValue.doubleValue();
/*     */           }
/*     */ 
/*     */           
/*     */           public ObservableList<ObservableValue<?>> getDependencies() {
/* 145 */             return FXCollections.unmodifiableObservableList(
/* 146 */                 FXCollections.observableArrayList((Object[])new ObservableValue[] { (ObservableValue)this.val$condition, (ObservableValue)this.val$thenValue, (ObservableValue)this.val$otherwiseValue }));
/*     */           }
/*     */         }; 
/* 149 */     if (thenValue instanceof javafx.beans.value.ObservableFloatValue || otherwiseValue instanceof javafx.beans.value.ObservableFloatValue)
/* 150 */       return new FloatBinding()
/*     */         {
/*     */           final InvalidationListener observer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           public void dispose() {
/* 160 */             condition.removeListener(this.observer);
/* 161 */             thenValue.removeListener(this.observer);
/* 162 */             otherwiseValue.removeListener(this.observer);
/*     */           }
/*     */ 
/*     */           
/*     */           protected float computeValue() {
/* 167 */             boolean bool = condition.get();
/* 168 */             Logging.getLogger().finest("Condition of ternary binding expression was evaluated: {0}", new Object[] { Boolean.valueOf(bool) });
/* 169 */             return bool ? thenValue.floatValue() : otherwiseValue.floatValue();
/*     */           }
/*     */ 
/*     */           
/*     */           public ObservableList<ObservableValue<?>> getDependencies() {
/* 174 */             return FXCollections.unmodifiableObservableList(
/* 175 */                 FXCollections.observableArrayList((Object[])new ObservableValue[] { (ObservableValue)this.val$condition, (ObservableValue)this.val$thenValue, (ObservableValue)this.val$otherwiseValue }));
/*     */           }
/*     */         }; 
/* 178 */     if (thenValue instanceof javafx.beans.value.ObservableLongValue || otherwiseValue instanceof javafx.beans.value.ObservableLongValue) {
/* 179 */       return new LongBinding()
/*     */         {
/*     */           final InvalidationListener observer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           public void dispose() {
/* 189 */             condition.removeListener(this.observer);
/* 190 */             thenValue.removeListener(this.observer);
/* 191 */             otherwiseValue.removeListener(this.observer);
/*     */           }
/*     */ 
/*     */           
/*     */           protected long computeValue() {
/* 196 */             boolean bool = condition.get();
/* 197 */             Logging.getLogger().finest("Condition of ternary binding expression was evaluated: {0}", new Object[] { Boolean.valueOf(bool) });
/* 198 */             return bool ? thenValue.longValue() : otherwiseValue.longValue();
/*     */           }
/*     */ 
/*     */           
/*     */           public ObservableList<ObservableValue<?>> getDependencies() {
/* 203 */             return FXCollections.unmodifiableObservableList(
/* 204 */                 FXCollections.observableArrayList((Object[])new ObservableValue[] { (ObservableValue)this.val$condition, (ObservableValue)this.val$thenValue, (ObservableValue)this.val$otherwiseValue }));
/*     */           }
/*     */         };
/*     */     }
/* 208 */     return new IntegerBinding()
/*     */       {
/*     */         final InvalidationListener observer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         public void dispose() {
/* 218 */           condition.removeListener(this.observer);
/* 219 */           thenValue.removeListener(this.observer);
/* 220 */           otherwiseValue.removeListener(this.observer);
/*     */         }
/*     */ 
/*     */         
/*     */         protected int computeValue() {
/* 225 */           boolean bool = condition.get();
/* 226 */           Logging.getLogger().finest("Condition of ternary binding expression was evaluated: {0}", new Object[] { Boolean.valueOf(bool) });
/* 227 */           return bool ? thenValue.intValue() : otherwiseValue.intValue();
/*     */         }
/*     */ 
/*     */         
/*     */         public ObservableList<ObservableValue<?>> getDependencies() {
/* 232 */           return FXCollections.unmodifiableObservableList(
/* 233 */               FXCollections.observableArrayList((Object[])new ObservableValue[] { (ObservableValue)this.val$condition, (ObservableValue)this.val$thenValue, (ObservableValue)this.val$otherwiseValue }));
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public class NumberConditionBuilder
/*     */   {
/*     */     private ObservableNumberValue thenValue;
/*     */ 
/*     */ 
/*     */     
/*     */     private NumberConditionBuilder(ObservableNumberValue param1ObservableNumberValue) {
/* 248 */       this.thenValue = param1ObservableNumberValue;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public NumberBinding otherwise(ObservableNumberValue param1ObservableNumberValue) {
/* 261 */       if (param1ObservableNumberValue == null) {
/* 262 */         throw new NullPointerException("Value needs to be specified");
/*     */       }
/* 264 */       return When.createNumberCondition(When.this.condition, this.thenValue, param1ObservableNumberValue);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public DoubleBinding otherwise(double param1Double) {
/* 276 */       return (DoubleBinding)otherwise((ObservableNumberValue)DoubleConstant.valueOf(param1Double));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public NumberBinding otherwise(float param1Float) {
/* 288 */       return otherwise((ObservableNumberValue)FloatConstant.valueOf(param1Float));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public NumberBinding otherwise(long param1Long) {
/* 300 */       return otherwise((ObservableNumberValue)LongConstant.valueOf(param1Long));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public NumberBinding otherwise(int param1Int) {
/* 312 */       return otherwise((ObservableNumberValue)IntegerConstant.valueOf(param1Int));
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NumberConditionBuilder then(ObservableNumberValue paramObservableNumberValue) {
/* 325 */     if (paramObservableNumberValue == null) {
/* 326 */       throw new NullPointerException("Value needs to be specified");
/*     */     }
/* 328 */     return new NumberConditionBuilder(paramObservableNumberValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NumberConditionBuilder then(double paramDouble) {
/* 340 */     return new NumberConditionBuilder((ObservableNumberValue)DoubleConstant.valueOf(paramDouble));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NumberConditionBuilder then(float paramFloat) {
/* 352 */     return new NumberConditionBuilder((ObservableNumberValue)FloatConstant.valueOf(paramFloat));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NumberConditionBuilder then(long paramLong) {
/* 364 */     return new NumberConditionBuilder((ObservableNumberValue)LongConstant.valueOf(paramLong));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public NumberConditionBuilder then(int paramInt) {
/* 376 */     return new NumberConditionBuilder((ObservableNumberValue)IntegerConstant.valueOf(paramInt));
/*     */   }
/*     */ 
/*     */   
/*     */   private class BooleanCondition
/*     */     extends BooleanBinding
/*     */   {
/*     */     private final ObservableBooleanValue trueResult;
/*     */     
/*     */     private final boolean trueResultValue;
/*     */     
/*     */     private final ObservableBooleanValue falseResult;
/*     */     private final boolean falseResultValue;
/*     */     private final InvalidationListener observer;
/*     */     
/*     */     private BooleanCondition(ObservableBooleanValue param1ObservableBooleanValue1, ObservableBooleanValue param1ObservableBooleanValue2) {
/* 392 */       this.trueResult = param1ObservableBooleanValue1;
/* 393 */       this.trueResultValue = false;
/* 394 */       this.falseResult = param1ObservableBooleanValue2;
/* 395 */       this.falseResultValue = false;
/* 396 */       this.observer = new When.WhenListener(this, When.this.condition, (ObservableValue<?>)param1ObservableBooleanValue1, (ObservableValue<?>)param1ObservableBooleanValue2);
/* 397 */       When.this.condition.addListener(this.observer);
/* 398 */       param1ObservableBooleanValue1.addListener(this.observer);
/* 399 */       param1ObservableBooleanValue2.addListener(this.observer);
/*     */     }
/*     */     
/*     */     private BooleanCondition(boolean param1Boolean, ObservableBooleanValue param1ObservableBooleanValue) {
/* 403 */       this.trueResult = null;
/* 404 */       this.trueResultValue = param1Boolean;
/* 405 */       this.falseResult = param1ObservableBooleanValue;
/* 406 */       this.falseResultValue = false;
/* 407 */       this.observer = new When.WhenListener(this, When.this.condition, null, (ObservableValue<?>)param1ObservableBooleanValue);
/* 408 */       When.this.condition.addListener(this.observer);
/* 409 */       param1ObservableBooleanValue.addListener(this.observer);
/*     */     }
/*     */     
/*     */     private BooleanCondition(ObservableBooleanValue param1ObservableBooleanValue, boolean param1Boolean) {
/* 413 */       this.trueResult = param1ObservableBooleanValue;
/* 414 */       this.trueResultValue = false;
/* 415 */       this.falseResult = null;
/* 416 */       this.falseResultValue = param1Boolean;
/* 417 */       this.observer = new When.WhenListener(this, When.this.condition, (ObservableValue<?>)param1ObservableBooleanValue, null);
/* 418 */       When.this.condition.addListener(this.observer);
/* 419 */       param1ObservableBooleanValue.addListener(this.observer);
/*     */     }
/*     */     
/*     */     private BooleanCondition(boolean param1Boolean1, boolean param1Boolean2) {
/* 423 */       this.trueResult = null;
/* 424 */       this.trueResultValue = param1Boolean1;
/* 425 */       this.falseResult = null;
/* 426 */       this.falseResultValue = param1Boolean2;
/* 427 */       this.observer = null;
/* 428 */       bind(new Observable[] { (Observable)this$0.condition });
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean computeValue() {
/* 433 */       boolean bool = When.this.condition.get();
/* 434 */       Logging.getLogger().finest("Condition of ternary binding expression was evaluated: {0}", new Object[] { Boolean.valueOf(bool) });
/* 435 */       return bool ? ((this.trueResult != null) ? this.trueResult.get() : this.trueResultValue) : (
/* 436 */         (this.falseResult != null) ? this.falseResult.get() : this.falseResultValue);
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/* 441 */       if (this.observer == null) {
/* 442 */         unbind(new Observable[] { (Observable)this.this$0.condition });
/*     */       } else {
/* 444 */         When.this.condition.removeListener(this.observer);
/* 445 */         if (this.trueResult != null) {
/* 446 */           this.trueResult.removeListener(this.observer);
/*     */         }
/* 448 */         if (this.falseResult != null) {
/* 449 */           this.falseResult.removeListener(this.observer);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public ObservableList<ObservableValue<?>> getDependencies() {
/* 456 */       assert When.this.condition != null;
/* 457 */       ObservableList observableList = FXCollections.observableArrayList((Object[])new ObservableValue[] { (ObservableValue)this.this$0.condition });
/* 458 */       if (this.trueResult != null) {
/* 459 */         observableList.add(this.trueResult);
/*     */       }
/* 461 */       if (this.falseResult != null) {
/* 462 */         observableList.add(this.falseResult);
/*     */       }
/* 464 */       return FXCollections.unmodifiableObservableList(observableList);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public class BooleanConditionBuilder
/*     */   {
/*     */     private ObservableBooleanValue trueResult;
/*     */ 
/*     */     
/*     */     private boolean trueResultValue;
/*     */ 
/*     */     
/*     */     private BooleanConditionBuilder(ObservableBooleanValue param1ObservableBooleanValue) {
/* 479 */       this.trueResult = param1ObservableBooleanValue;
/*     */     }
/*     */     
/*     */     private BooleanConditionBuilder(boolean param1Boolean) {
/* 483 */       this.trueResultValue = param1Boolean;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public BooleanBinding otherwise(ObservableBooleanValue param1ObservableBooleanValue) {
/* 496 */       if (param1ObservableBooleanValue == null) {
/* 497 */         throw new NullPointerException("Value needs to be specified");
/*     */       }
/* 499 */       if (this.trueResult != null) {
/* 500 */         return new When.BooleanCondition(this.trueResult, param1ObservableBooleanValue);
/*     */       }
/* 502 */       return new When.BooleanCondition(this.trueResultValue, param1ObservableBooleanValue);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public BooleanBinding otherwise(boolean param1Boolean) {
/* 514 */       if (this.trueResult != null) {
/* 515 */         return new When.BooleanCondition(this.trueResult, param1Boolean);
/*     */       }
/* 517 */       return new When.BooleanCondition(this.trueResultValue, param1Boolean);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanConditionBuilder then(ObservableBooleanValue paramObservableBooleanValue) {
/* 530 */     if (paramObservableBooleanValue == null) {
/* 531 */       throw new NullPointerException("Value needs to be specified");
/*     */     }
/* 533 */     return new BooleanConditionBuilder(paramObservableBooleanValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanConditionBuilder then(boolean paramBoolean) {
/* 545 */     return new BooleanConditionBuilder(paramBoolean);
/*     */   }
/*     */ 
/*     */   
/*     */   private class StringCondition
/*     */     extends StringBinding
/*     */   {
/*     */     private final ObservableStringValue trueResult;
/*     */     
/*     */     private final String trueResultValue;
/*     */     
/*     */     private final ObservableStringValue falseResult;
/*     */     
/*     */     private final String falseResultValue;
/*     */     private final InvalidationListener observer;
/*     */     
/*     */     private StringCondition(ObservableStringValue param1ObservableStringValue1, ObservableStringValue param1ObservableStringValue2) {
/* 562 */       this.trueResult = param1ObservableStringValue1;
/* 563 */       this.trueResultValue = "";
/* 564 */       this.falseResult = param1ObservableStringValue2;
/* 565 */       this.falseResultValue = "";
/* 566 */       this.observer = new When.WhenListener(this, When.this.condition, (ObservableValue<?>)param1ObservableStringValue1, (ObservableValue<?>)param1ObservableStringValue2);
/* 567 */       When.this.condition.addListener(this.observer);
/* 568 */       param1ObservableStringValue1.addListener(this.observer);
/* 569 */       param1ObservableStringValue2.addListener(this.observer);
/*     */     }
/*     */     
/*     */     private StringCondition(String param1String, ObservableStringValue param1ObservableStringValue) {
/* 573 */       this.trueResult = null;
/* 574 */       this.trueResultValue = param1String;
/* 575 */       this.falseResult = param1ObservableStringValue;
/* 576 */       this.falseResultValue = "";
/* 577 */       this.observer = new When.WhenListener(this, When.this.condition, null, (ObservableValue<?>)param1ObservableStringValue);
/* 578 */       When.this.condition.addListener(this.observer);
/* 579 */       param1ObservableStringValue.addListener(this.observer);
/*     */     }
/*     */     
/*     */     private StringCondition(ObservableStringValue param1ObservableStringValue, String param1String) {
/* 583 */       this.trueResult = param1ObservableStringValue;
/* 584 */       this.trueResultValue = "";
/* 585 */       this.falseResult = null;
/* 586 */       this.falseResultValue = param1String;
/* 587 */       this.observer = new When.WhenListener(this, When.this.condition, (ObservableValue<?>)param1ObservableStringValue, null);
/* 588 */       When.this.condition.addListener(this.observer);
/* 589 */       param1ObservableStringValue.addListener(this.observer);
/*     */     }
/*     */     
/*     */     private StringCondition(String param1String1, String param1String2) {
/* 593 */       this.trueResult = null;
/* 594 */       this.trueResultValue = param1String1;
/* 595 */       this.falseResult = null;
/* 596 */       this.falseResultValue = param1String2;
/* 597 */       this.observer = null;
/* 598 */       bind(new Observable[] { (Observable)this$0.condition });
/*     */     }
/*     */ 
/*     */     
/*     */     protected String computeValue() {
/* 603 */       boolean bool = When.this.condition.get();
/* 604 */       Logging.getLogger().finest("Condition of ternary binding expression was evaluated: {0}", new Object[] { Boolean.valueOf(bool) });
/* 605 */       return bool ? ((this.trueResult != null) ? (String)this.trueResult.get() : this.trueResultValue) : (
/* 606 */         (this.falseResult != null) ? (String)this.falseResult.get() : this.falseResultValue);
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/* 611 */       if (this.observer == null) {
/* 612 */         unbind(new Observable[] { (Observable)this.this$0.condition });
/*     */       } else {
/* 614 */         When.this.condition.removeListener(this.observer);
/* 615 */         if (this.trueResult != null) {
/* 616 */           this.trueResult.removeListener(this.observer);
/*     */         }
/* 618 */         if (this.falseResult != null) {
/* 619 */           this.falseResult.removeListener(this.observer);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public ObservableList<ObservableValue<?>> getDependencies() {
/* 627 */       assert When.this.condition != null;
/* 628 */       ObservableList observableList = FXCollections.observableArrayList((Object[])new ObservableValue[] { (ObservableValue)this.this$0.condition });
/* 629 */       if (this.trueResult != null) {
/* 630 */         observableList.add(this.trueResult);
/*     */       }
/* 632 */       if (this.falseResult != null) {
/* 633 */         observableList.add(this.falseResult);
/*     */       }
/* 635 */       return FXCollections.unmodifiableObservableList(observableList);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public class StringConditionBuilder
/*     */   {
/*     */     private ObservableStringValue trueResult;
/*     */ 
/*     */     
/*     */     private String trueResultValue;
/*     */ 
/*     */     
/*     */     private StringConditionBuilder(ObservableStringValue param1ObservableStringValue) {
/* 650 */       this.trueResult = param1ObservableStringValue;
/*     */     }
/*     */     
/*     */     private StringConditionBuilder(String param1String) {
/* 654 */       this.trueResultValue = param1String;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public StringBinding otherwise(ObservableStringValue param1ObservableStringValue) {
/* 667 */       if (this.trueResult != null) {
/* 668 */         return new When.StringCondition(this.trueResult, param1ObservableStringValue);
/*     */       }
/* 670 */       return new When.StringCondition(this.trueResultValue, param1ObservableStringValue);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public StringBinding otherwise(String param1String) {
/* 682 */       if (this.trueResult != null) {
/* 683 */         return new When.StringCondition(this.trueResult, param1String);
/*     */       }
/* 685 */       return new When.StringCondition(this.trueResultValue, param1String);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StringConditionBuilder then(ObservableStringValue paramObservableStringValue) {
/* 698 */     if (paramObservableStringValue == null) {
/* 699 */       throw new NullPointerException("Value needs to be specified");
/*     */     }
/* 701 */     return new StringConditionBuilder(paramObservableStringValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StringConditionBuilder then(String paramString) {
/* 713 */     return new StringConditionBuilder(paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   private class ObjectCondition<T>
/*     */     extends ObjectBinding<T>
/*     */   {
/*     */     private final ObservableObjectValue<T> trueResult;
/*     */     
/*     */     private final T trueResultValue;
/*     */     
/*     */     private final ObservableObjectValue<T> falseResult;
/*     */     
/*     */     private final T falseResultValue;
/*     */     private final InvalidationListener observer;
/*     */     
/*     */     private ObjectCondition(ObservableObjectValue<T> param1ObservableObjectValue1, ObservableObjectValue<T> param1ObservableObjectValue2) {
/* 730 */       this.trueResult = param1ObservableObjectValue1;
/* 731 */       this.trueResultValue = null;
/* 732 */       this.falseResult = param1ObservableObjectValue2;
/* 733 */       this.falseResultValue = null;
/* 734 */       this.observer = new When.WhenListener(this, When.this.condition, (ObservableValue<?>)param1ObservableObjectValue1, (ObservableValue<?>)param1ObservableObjectValue2);
/* 735 */       When.this.condition.addListener(this.observer);
/* 736 */       param1ObservableObjectValue1.addListener(this.observer);
/* 737 */       param1ObservableObjectValue2.addListener(this.observer);
/*     */     }
/*     */     
/*     */     private ObjectCondition(T param1T, ObservableObjectValue<T> param1ObservableObjectValue) {
/* 741 */       this.trueResult = null;
/* 742 */       this.trueResultValue = param1T;
/* 743 */       this.falseResult = param1ObservableObjectValue;
/* 744 */       this.falseResultValue = null;
/* 745 */       this.observer = new When.WhenListener(this, When.this.condition, null, (ObservableValue<?>)param1ObservableObjectValue);
/* 746 */       When.this.condition.addListener(this.observer);
/* 747 */       param1ObservableObjectValue.addListener(this.observer);
/*     */     }
/*     */     
/*     */     private ObjectCondition(ObservableObjectValue<T> param1ObservableObjectValue, T param1T) {
/* 751 */       this.trueResult = param1ObservableObjectValue;
/* 752 */       this.trueResultValue = null;
/* 753 */       this.falseResult = null;
/* 754 */       this.falseResultValue = param1T;
/* 755 */       this.observer = new When.WhenListener(this, When.this.condition, (ObservableValue<?>)param1ObservableObjectValue, null);
/* 756 */       When.this.condition.addListener(this.observer);
/* 757 */       param1ObservableObjectValue.addListener(this.observer);
/*     */     }
/*     */     
/*     */     private ObjectCondition(T param1T1, T param1T2) {
/* 761 */       this.trueResult = null;
/* 762 */       this.trueResultValue = param1T1;
/* 763 */       this.falseResult = null;
/* 764 */       this.falseResultValue = param1T2;
/* 765 */       this.observer = null;
/* 766 */       bind(new Observable[] { (Observable)this$0.condition });
/*     */     }
/*     */ 
/*     */     
/*     */     protected T computeValue() {
/* 771 */       boolean bool = When.this.condition.get();
/* 772 */       Logging.getLogger().finest("Condition of ternary binding expression was evaluated: {0}", new Object[] { Boolean.valueOf(bool) });
/* 773 */       return bool ? ((this.trueResult != null) ? (T)this.trueResult.get() : this.trueResultValue) : (
/* 774 */         (this.falseResult != null) ? (T)this.falseResult.get() : this.falseResultValue);
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/* 779 */       if (this.observer == null) {
/* 780 */         unbind(new Observable[] { (Observable)this.this$0.condition });
/*     */       } else {
/* 782 */         When.this.condition.removeListener(this.observer);
/* 783 */         if (this.trueResult != null) {
/* 784 */           this.trueResult.removeListener(this.observer);
/*     */         }
/* 786 */         if (this.falseResult != null) {
/* 787 */           this.falseResult.removeListener(this.observer);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public ObservableList<ObservableValue<?>> getDependencies() {
/* 795 */       assert When.this.condition != null;
/* 796 */       ObservableList observableList = FXCollections.observableArrayList((Object[])new ObservableValue[] { (ObservableValue)this.this$0.condition });
/* 797 */       if (this.trueResult != null) {
/* 798 */         observableList.add(this.trueResult);
/*     */       }
/* 800 */       if (this.falseResult != null) {
/* 801 */         observableList.add(this.falseResult);
/*     */       }
/* 803 */       return FXCollections.unmodifiableObservableList(observableList);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public class ObjectConditionBuilder<T>
/*     */   {
/*     */     private ObservableObjectValue<T> trueResult;
/*     */ 
/*     */     
/*     */     private T trueResultValue;
/*     */ 
/*     */     
/*     */     private ObjectConditionBuilder(ObservableObjectValue<T> param1ObservableObjectValue) {
/* 818 */       this.trueResult = param1ObservableObjectValue;
/*     */     }
/*     */     
/*     */     private ObjectConditionBuilder(T param1T) {
/* 822 */       this.trueResultValue = param1T;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public ObjectBinding<T> otherwise(ObservableObjectValue<T> param1ObservableObjectValue) {
/* 835 */       if (param1ObservableObjectValue == null) {
/* 836 */         throw new NullPointerException("Value needs to be specified");
/*     */       }
/* 838 */       if (this.trueResult != null) {
/* 839 */         return new When.ObjectCondition<>(this.trueResult, param1ObservableObjectValue);
/*     */       }
/* 841 */       return new When.ObjectCondition<>(this.trueResultValue, param1ObservableObjectValue);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public ObjectBinding<T> otherwise(T param1T) {
/* 853 */       if (this.trueResult != null) {
/* 854 */         return new When.ObjectCondition<>(this.trueResult, param1T);
/*     */       }
/* 856 */       return new When.ObjectCondition<>(this.trueResultValue, param1T);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> ObjectConditionBuilder<T> then(ObservableObjectValue<T> paramObservableObjectValue) {
/* 870 */     if (paramObservableObjectValue == null) {
/* 871 */       throw new NullPointerException("Value needs to be specified");
/*     */     }
/* 873 */     return new ObjectConditionBuilder<>(paramObservableObjectValue);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> ObjectConditionBuilder<T> then(T paramT) {
/* 886 */     return new ObjectConditionBuilder<>(paramT);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\When.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */