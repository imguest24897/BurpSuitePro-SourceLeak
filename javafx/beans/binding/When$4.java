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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   extends IntegerBinding
/*     */ {
/*     */   final InvalidationListener observer;
/*     */   
/*     */   null() {
/* 209 */     this.observer = new When.WhenListener(this, condition, (ObservableValue<?>)thenValue, (ObservableValue<?>)otherwiseValue);
/*     */     
/* 211 */     condition.addListener(this.observer);
/* 212 */     thenValue.addListener(this.observer);
/* 213 */     otherwiseValue.addListener(this.observer);
/*     */   }
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 218 */     condition.removeListener(this.observer);
/* 219 */     thenValue.removeListener(this.observer);
/* 220 */     otherwiseValue.removeListener(this.observer);
/*     */   }
/*     */ 
/*     */   
/*     */   protected int computeValue() {
/* 225 */     boolean bool = condition.get();
/* 226 */     Logging.getLogger().finest("Condition of ternary binding expression was evaluated: {0}", new Object[] { Boolean.valueOf(bool) });
/* 227 */     return bool ? thenValue.intValue() : otherwiseValue.intValue();
/*     */   }
/*     */ 
/*     */   
/*     */   public ObservableList<ObservableValue<?>> getDependencies() {
/* 232 */     return FXCollections.unmodifiableObservableList(
/* 233 */         FXCollections.observableArrayList((Object[])new ObservableValue[] { (ObservableValue)this.val$condition, (ObservableValue)this.val$thenValue, (ObservableValue)this.val$otherwiseValue }));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\When$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */