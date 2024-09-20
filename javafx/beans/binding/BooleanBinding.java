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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class BooleanBinding
/*     */   extends BooleanExpression
/*     */   implements Binding<Boolean>
/*     */ {
/*     */   private boolean value;
/*     */   private boolean valid = false;
/*     */   private BindingHelperObserver observer;
/*  78 */   private ExpressionHelper<Boolean> helper = null;
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/*  82 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/*  87 */     this.helper = ExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super Boolean> paramChangeListener) {
/*  92 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super Boolean> paramChangeListener) {
/*  97 */     this.helper = ExpressionHelper.removeListener(this.helper, paramChangeListener);
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
/* 108 */     if (paramVarArgs != null && paramVarArgs.length > 0) {
/* 109 */       if (this.observer == null) {
/* 110 */         this.observer = new BindingHelperObserver(this);
/*     */       }
/* 112 */       for (Observable observable : paramVarArgs) {
/* 113 */         observable.addListener((InvalidationListener)this.observer);
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
/* 125 */     if (this.observer != null) {
/* 126 */       for (Observable observable : paramVarArgs) {
/* 127 */         observable.removeListener((InvalidationListener)this.observer);
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
/* 147 */     return FXCollections.emptyObservableList();
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
/*     */   public final boolean get() {
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
/* 205 */     return this.valid ? ("BooleanBinding [value: " + get() + "]") : 
/* 206 */       "BooleanBinding [invalid]";
/*     */   }
/*     */   
/*     */   protected abstract boolean computeValue();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\BooleanBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */