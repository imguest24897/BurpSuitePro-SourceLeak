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
/*     */ public abstract class ObjectBinding<T>
/*     */   extends ObjectExpression<T>
/*     */   implements Binding<T>
/*     */ {
/*     */   private T value;
/*     */   private boolean valid = false;
/*     */   private boolean observed;
/*     */   private BindingHelperObserver observer;
/*  75 */   private ExpressionHelper<T> helper = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/*  85 */     this.observed = (this.observed || paramInvalidationListener != null);
/*  86 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/*  91 */     this.helper = ExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*  92 */     this.observed = (this.helper != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super T> paramChangeListener) {
/*  97 */     this.observed = (this.observed || paramChangeListener != null);
/*  98 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super T> paramChangeListener) {
/* 103 */     this.helper = ExpressionHelper.removeListener(this.helper, paramChangeListener);
/* 104 */     this.observed = (this.helper != null);
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
/* 115 */     if (paramVarArgs != null && paramVarArgs.length > 0) {
/* 116 */       if (this.observer == null) {
/* 117 */         this.observer = new BindingHelperObserver(this);
/*     */       }
/* 119 */       for (Observable observable : paramVarArgs) {
/* 120 */         observable.addListener((InvalidationListener)this.observer);
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
/* 132 */     if (this.observer != null) {
/* 133 */       for (Observable observable : paramVarArgs) {
/* 134 */         observable.removeListener((InvalidationListener)this.observer);
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
/* 154 */     return FXCollections.emptyObservableList();
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
/*     */   public final T get() {
/* 167 */     if (!this.valid) {
/* 168 */       T t = computeValue();
/*     */       
/* 170 */       if (!allowValidation()) {
/* 171 */         return t;
/*     */       }
/*     */       
/* 174 */       this.value = t;
/* 175 */       this.valid = true;
/*     */     } 
/* 177 */     return this.value;
/*     */   }
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
/* 189 */     if (this.valid) {
/* 190 */       this.valid = false;
/* 191 */       onInvalidating();
/* 192 */       ExpressionHelper.fireValueChangedEvent(this.helper);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 199 */       if (!this.valid) {
/* 200 */         this.value = null;
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean isValid() {
/* 207 */     return this.valid;
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
/*     */   protected final boolean isObserved() {
/* 219 */     return this.observed;
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
/*     */   protected boolean allowValidation() {
/* 236 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected abstract T computeValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 255 */     return this.valid ? ("ObjectBinding [value: " + String.valueOf(get()) + "]") : 
/* 256 */       "ObjectBinding [invalid]";
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\ObjectBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */