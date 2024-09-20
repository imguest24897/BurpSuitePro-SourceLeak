/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.Logging;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ObservableBooleanValue;
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
/*     */ class BooleanCondition
/*     */   extends BooleanBinding
/*     */ {
/*     */   private final ObservableBooleanValue trueResult;
/*     */   private final boolean trueResultValue;
/*     */   private final ObservableBooleanValue falseResult;
/*     */   private final boolean falseResultValue;
/*     */   private final InvalidationListener observer;
/*     */   
/*     */   private BooleanCondition(ObservableBooleanValue paramObservableBooleanValue1, ObservableBooleanValue paramObservableBooleanValue2) {
/* 392 */     this.trueResult = paramObservableBooleanValue1;
/* 393 */     this.trueResultValue = false;
/* 394 */     this.falseResult = paramObservableBooleanValue2;
/* 395 */     this.falseResultValue = false;
/* 396 */     this.observer = new When.WhenListener(this, paramWhen.condition, (ObservableValue<?>)paramObservableBooleanValue1, (ObservableValue<?>)paramObservableBooleanValue2);
/* 397 */     paramWhen.condition.addListener(this.observer);
/* 398 */     paramObservableBooleanValue1.addListener(this.observer);
/* 399 */     paramObservableBooleanValue2.addListener(this.observer);
/*     */   }
/*     */   
/*     */   private BooleanCondition(boolean paramBoolean, ObservableBooleanValue paramObservableBooleanValue) {
/* 403 */     this.trueResult = null;
/* 404 */     this.trueResultValue = paramBoolean;
/* 405 */     this.falseResult = paramObservableBooleanValue;
/* 406 */     this.falseResultValue = false;
/* 407 */     this.observer = new When.WhenListener(this, paramWhen.condition, null, (ObservableValue<?>)paramObservableBooleanValue);
/* 408 */     paramWhen.condition.addListener(this.observer);
/* 409 */     paramObservableBooleanValue.addListener(this.observer);
/*     */   }
/*     */   
/*     */   private BooleanCondition(ObservableBooleanValue paramObservableBooleanValue, boolean paramBoolean) {
/* 413 */     this.trueResult = paramObservableBooleanValue;
/* 414 */     this.trueResultValue = false;
/* 415 */     this.falseResult = null;
/* 416 */     this.falseResultValue = paramBoolean;
/* 417 */     this.observer = new When.WhenListener(this, paramWhen.condition, (ObservableValue<?>)paramObservableBooleanValue, null);
/* 418 */     paramWhen.condition.addListener(this.observer);
/* 419 */     paramObservableBooleanValue.addListener(this.observer);
/*     */   }
/*     */   
/*     */   private BooleanCondition(boolean paramBoolean1, boolean paramBoolean2) {
/* 423 */     this.trueResult = null;
/* 424 */     this.trueResultValue = paramBoolean1;
/* 425 */     this.falseResult = null;
/* 426 */     this.falseResultValue = paramBoolean2;
/* 427 */     this.observer = null;
/* 428 */     bind(new Observable[] { (Observable)paramWhen.condition });
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean computeValue() {
/* 433 */     boolean bool = When.this.condition.get();
/* 434 */     Logging.getLogger().finest("Condition of ternary binding expression was evaluated: {0}", new Object[] { Boolean.valueOf(bool) });
/* 435 */     return bool ? ((this.trueResult != null) ? this.trueResult.get() : this.trueResultValue) : (
/* 436 */       (this.falseResult != null) ? this.falseResult.get() : this.falseResultValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 441 */     if (this.observer == null) {
/* 442 */       unbind(new Observable[] { (Observable)this.this$0.condition });
/*     */     } else {
/* 444 */       When.this.condition.removeListener(this.observer);
/* 445 */       if (this.trueResult != null) {
/* 446 */         this.trueResult.removeListener(this.observer);
/*     */       }
/* 448 */       if (this.falseResult != null) {
/* 449 */         this.falseResult.removeListener(this.observer);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public ObservableList<ObservableValue<?>> getDependencies() {
/* 456 */     assert When.this.condition != null;
/* 457 */     ObservableList observableList = FXCollections.observableArrayList((Object[])new ObservableValue[] { (ObservableValue)this.this$0.condition });
/* 458 */     if (this.trueResult != null) {
/* 459 */       observableList.add(this.trueResult);
/*     */     }
/* 461 */     if (this.falseResult != null) {
/* 462 */       observableList.add(this.falseResult);
/*     */     }
/* 464 */     return FXCollections.unmodifiableObservableList(observableList);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\When$BooleanCondition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */