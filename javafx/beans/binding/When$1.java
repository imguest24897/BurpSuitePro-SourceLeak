/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.Logging;
/*     */ import javafx.beans.InvalidationListener;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */   extends DoubleBinding
/*     */ {
/*     */   final InvalidationListener observer;
/*     */   
/*     */   null() {
/* 122 */     this.observer = new When.WhenListener(this, condition, (ObservableValue<?>)thenValue, (ObservableValue<?>)otherwiseValue);
/*     */     
/* 124 */     condition.addListener(this.observer);
/* 125 */     thenValue.addListener(this.observer);
/* 126 */     otherwiseValue.addListener(this.observer);
/*     */   }
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 131 */     condition.removeListener(this.observer);
/* 132 */     thenValue.removeListener(this.observer);
/* 133 */     otherwiseValue.removeListener(this.observer);
/*     */   }
/*     */ 
/*     */   
/*     */   protected double computeValue() {
/* 138 */     boolean bool = condition.get();
/* 139 */     Logging.getLogger().finest("Condition of ternary binding expression was evaluated: {0}", new Object[] { Boolean.valueOf(bool) });
/* 140 */     return bool ? thenValue.doubleValue() : otherwiseValue.doubleValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public ObservableList<ObservableValue<?>> getDependencies() {
/* 145 */     return FXCollections.unmodifiableObservableList(
/* 146 */         FXCollections.observableArrayList((Object[])new ObservableValue[] { (ObservableValue)this.val$condition, (ObservableValue)this.val$thenValue, (ObservableValue)this.val$otherwiseValue }));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\When$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */