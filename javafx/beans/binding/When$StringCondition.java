/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.Logging;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class StringCondition
/*     */   extends StringBinding
/*     */ {
/*     */   private final ObservableStringValue trueResult;
/*     */   private final String trueResultValue;
/*     */   private final ObservableStringValue falseResult;
/*     */   private final String falseResultValue;
/*     */   private final InvalidationListener observer;
/*     */   
/*     */   private StringCondition(ObservableStringValue paramObservableStringValue1, ObservableStringValue paramObservableStringValue2) {
/* 562 */     this.trueResult = paramObservableStringValue1;
/* 563 */     this.trueResultValue = "";
/* 564 */     this.falseResult = paramObservableStringValue2;
/* 565 */     this.falseResultValue = "";
/* 566 */     this.observer = new When.WhenListener(this, paramWhen.condition, (ObservableValue<?>)paramObservableStringValue1, (ObservableValue<?>)paramObservableStringValue2);
/* 567 */     paramWhen.condition.addListener(this.observer);
/* 568 */     paramObservableStringValue1.addListener(this.observer);
/* 569 */     paramObservableStringValue2.addListener(this.observer);
/*     */   }
/*     */   
/*     */   private StringCondition(String paramString, ObservableStringValue paramObservableStringValue) {
/* 573 */     this.trueResult = null;
/* 574 */     this.trueResultValue = paramString;
/* 575 */     this.falseResult = paramObservableStringValue;
/* 576 */     this.falseResultValue = "";
/* 577 */     this.observer = new When.WhenListener(this, paramWhen.condition, null, (ObservableValue<?>)paramObservableStringValue);
/* 578 */     paramWhen.condition.addListener(this.observer);
/* 579 */     paramObservableStringValue.addListener(this.observer);
/*     */   }
/*     */   
/*     */   private StringCondition(ObservableStringValue paramObservableStringValue, String paramString) {
/* 583 */     this.trueResult = paramObservableStringValue;
/* 584 */     this.trueResultValue = "";
/* 585 */     this.falseResult = null;
/* 586 */     this.falseResultValue = paramString;
/* 587 */     this.observer = new When.WhenListener(this, paramWhen.condition, (ObservableValue<?>)paramObservableStringValue, null);
/* 588 */     paramWhen.condition.addListener(this.observer);
/* 589 */     paramObservableStringValue.addListener(this.observer);
/*     */   }
/*     */   
/*     */   private StringCondition(String paramString1, String paramString2) {
/* 593 */     this.trueResult = null;
/* 594 */     this.trueResultValue = paramString1;
/* 595 */     this.falseResult = null;
/* 596 */     this.falseResultValue = paramString2;
/* 597 */     this.observer = null;
/* 598 */     bind(new Observable[] { (Observable)paramWhen.condition });
/*     */   }
/*     */ 
/*     */   
/*     */   protected String computeValue() {
/* 603 */     boolean bool = When.this.condition.get();
/* 604 */     Logging.getLogger().finest("Condition of ternary binding expression was evaluated: {0}", new Object[] { Boolean.valueOf(bool) });
/* 605 */     return bool ? ((this.trueResult != null) ? (String)this.trueResult.get() : this.trueResultValue) : (
/* 606 */       (this.falseResult != null) ? (String)this.falseResult.get() : this.falseResultValue);
/*     */   }
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 611 */     if (this.observer == null) {
/* 612 */       unbind(new Observable[] { (Observable)this.this$0.condition });
/*     */     } else {
/* 614 */       When.this.condition.removeListener(this.observer);
/* 615 */       if (this.trueResult != null) {
/* 616 */         this.trueResult.removeListener(this.observer);
/*     */       }
/* 618 */       if (this.falseResult != null) {
/* 619 */         this.falseResult.removeListener(this.observer);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ObservableList<ObservableValue<?>> getDependencies() {
/* 627 */     assert When.this.condition != null;
/* 628 */     ObservableList observableList = FXCollections.observableArrayList((Object[])new ObservableValue[] { (ObservableValue)this.this$0.condition });
/* 629 */     if (this.trueResult != null) {
/* 630 */       observableList.add(this.trueResult);
/*     */     }
/* 632 */     if (this.falseResult != null) {
/* 633 */       observableList.add(this.falseResult);
/*     */     }
/* 635 */     return FXCollections.unmodifiableObservableList(observableList);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\When$StringCondition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */