/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.BindingHelperObserver;
/*     */ import com.sun.javafx.binding.ExpressionHelper;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.value.ChangeListener;
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
/*     */ public abstract class FloatBinding
/*     */   extends FloatExpression
/*     */   implements NumberBinding
/*     */ {
/*     */   private float value;
/*     */   private boolean valid;
/*     */   private BindingHelperObserver observer;
/*  74 */   private ExpressionHelper<Number> helper = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/*  84 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/*  89 */     this.helper = ExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super Number> paramChangeListener) {
/*  94 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super Number> paramChangeListener) {
/*  99 */     this.helper = ExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected final void bind(Observable... paramVarArgs) {
/* 110 */     if (paramVarArgs != null && paramVarArgs.length > 0) {
/* 111 */       if (this.observer == null) {
/* 112 */         this.observer = new BindingHelperObserver(this);
/*     */       }
/* 114 */       for (Observable observable : paramVarArgs) {
/* 115 */         observable.addListener((InvalidationListener)this.observer);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected final void unbind(Observable... paramVarArgs) {
/* 127 */     if (this.observer != null) {
/* 128 */       for (Observable observable : paramVarArgs) {
/* 129 */         observable.removeListener((InvalidationListener)this.observer);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispose() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObservableList<?> getDependencies() {
/* 149 */     return FXCollections.emptyObservableList();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float get() {
/* 160 */     if (!this.valid) {
/* 161 */       this.value = computeValue();
/* 162 */       this.valid = true;
/*     */     } 
/* 164 */     return this.value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onInvalidating() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void invalidate() {
/* 177 */     if (this.valid) {
/* 178 */       this.valid = false;
/* 179 */       onInvalidating();
/* 180 */       ExpressionHelper.fireValueChangedEvent(this.helper);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean isValid() {
/* 186 */     return this.valid;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 205 */     return this.valid ? ("FloatBinding [value: " + get() + "]") : 
/* 206 */       "FloatBinding [invalid]";
/*     */   }
/*     */   
/*     */   protected abstract float computeValue();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\FloatBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */