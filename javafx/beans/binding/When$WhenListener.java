/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ObservableBooleanValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class WhenListener
/*     */   implements InvalidationListener
/*     */ {
/*     */   private final ObservableBooleanValue condition;
/*     */   private final ObservableValue<?> thenValue;
/*     */   private final ObservableValue<?> otherwiseValue;
/*     */   private final WeakReference<Binding<?>> ref;
/*     */   
/*     */   private WhenListener(Binding<?> paramBinding, ObservableBooleanValue paramObservableBooleanValue, ObservableValue<?> paramObservableValue1, ObservableValue<?> paramObservableValue2) {
/*  87 */     this.ref = new WeakReference<>(paramBinding);
/*  88 */     this.condition = paramObservableBooleanValue;
/*  89 */     this.thenValue = paramObservableValue1;
/*  90 */     this.otherwiseValue = paramObservableValue2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void invalidated(Observable paramObservable) {
/*  95 */     Binding binding = this.ref.get();
/*  96 */     if (binding == null) {
/*  97 */       this.condition.removeListener(this);
/*  98 */       if (this.thenValue != null) {
/*  99 */         this.thenValue.removeListener(this);
/*     */       }
/* 101 */       if (this.otherwiseValue != null) {
/* 102 */         this.otherwiseValue.removeListener(this);
/*     */ 
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 108 */     else if (this.condition.equals(paramObservable) || (binding.isValid() && this.condition.get() == paramObservable.equals(this.thenValue))) {
/* 109 */       binding.invalidate();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\When$WhenListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */