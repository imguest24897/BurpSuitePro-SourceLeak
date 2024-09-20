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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends FloatBinding
/*     */ {
/*     */   final InvalidationListener observer;
/*     */   
/*     */   null() {
/* 151 */     this.observer = new When.WhenListener(this, condition, (ObservableValue<?>)thenValue, (ObservableValue<?>)otherwiseValue);
/*     */     
/* 153 */     condition.addListener(this.observer);
/* 154 */     thenValue.addListener(this.observer);
/* 155 */     otherwiseValue.addListener(this.observer);
/*     */   }
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 160 */     condition.removeListener(this.observer);
/* 161 */     thenValue.removeListener(this.observer);
/* 162 */     otherwiseValue.removeListener(this.observer);
/*     */   }
/*     */ 
/*     */   
/*     */   protected float computeValue() {
/* 167 */     boolean bool = condition.get();
/* 168 */     Logging.getLogger().finest("Condition of ternary binding expression was evaluated: {0}", new Object[] { Boolean.valueOf(bool) });
/* 169 */     return bool ? thenValue.floatValue() : otherwiseValue.floatValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public ObservableList<ObservableValue<?>> getDependencies() {
/* 174 */     return FXCollections.unmodifiableObservableList(
/* 175 */         FXCollections.observableArrayList((Object[])new ObservableValue[] { (ObservableValue)this.val$condition, (ObservableValue)this.val$thenValue, (ObservableValue)this.val$otherwiseValue }));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\When$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */