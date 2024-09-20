/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.BindingHelperObserver;
/*     */ import com.sun.javafx.binding.SetExpressionHelper;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.property.ReadOnlyBooleanProperty;
/*     */ import javafx.beans.property.ReadOnlyBooleanPropertyBase;
/*     */ import javafx.beans.property.ReadOnlyIntegerProperty;
/*     */ import javafx.beans.property.ReadOnlyIntegerPropertyBase;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.collections.FXCollections;
/*     */ import javafx.collections.ObservableList;
/*     */ import javafx.collections.ObservableSet;
/*     */ import javafx.collections.SetChangeListener;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class SetBinding<E>
/*     */   extends SetExpression<E>
/*     */   implements Binding<ObservableSet<E>>
/*     */ {
/*  74 */   private final SetChangeListener<E> setChangeListener = new SetChangeListener<E>()
/*     */     {
/*     */       public void onChanged(SetChangeListener.Change<? extends E> param1Change) {
/*  77 */         SetBinding.this.invalidateProperties();
/*  78 */         SetBinding.this.onInvalidating();
/*  79 */         SetExpressionHelper.fireValueChangedEvent(SetBinding.this.helper, param1Change);
/*     */       }
/*     */     };
/*     */   
/*     */   private ObservableSet<E> value;
/*     */   private boolean valid = false;
/*     */   private BindingHelperObserver observer;
/*  86 */   private SetExpressionHelper<E> helper = null;
/*     */   
/*     */   private SizeProperty size0;
/*     */   
/*     */   private EmptyProperty empty0;
/*     */   
/*     */   public ReadOnlyIntegerProperty sizeProperty() {
/*  93 */     if (this.size0 == null) {
/*  94 */       this.size0 = new SizeProperty();
/*     */     }
/*  96 */     return (ReadOnlyIntegerProperty)this.size0;
/*     */   }
/*     */   
/*     */   private class SizeProperty
/*     */     extends ReadOnlyIntegerPropertyBase {
/*     */     public int get() {
/* 102 */       return SetBinding.this.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 107 */       return SetBinding.this;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 112 */       return "size";
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 117 */       super.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ReadOnlyBooleanProperty emptyProperty() {
/* 123 */     if (this.empty0 == null) {
/* 124 */       this.empty0 = new EmptyProperty();
/*     */     }
/* 126 */     return (ReadOnlyBooleanProperty)this.empty0;
/*     */   }
/*     */   
/*     */   private class EmptyProperty
/*     */     extends ReadOnlyBooleanPropertyBase
/*     */   {
/*     */     public boolean get() {
/* 133 */       return SetBinding.this.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 138 */       return SetBinding.this;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 143 */       return "empty";
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 148 */       super.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/* 154 */     this.helper = SetExpressionHelper.addListener(this.helper, this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 159 */     this.helper = SetExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/* 164 */     this.helper = SetExpressionHelper.addListener(this.helper, this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super ObservableSet<E>> paramChangeListener) {
/* 169 */     this.helper = SetExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 174 */     this.helper = SetExpressionHelper.addListener(this.helper, this, paramSetChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(SetChangeListener<? super E> paramSetChangeListener) {
/* 179 */     this.helper = SetExpressionHelper.removeListener(this.helper, paramSetChangeListener);
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
/* 190 */     if (paramVarArgs != null && paramVarArgs.length > 0) {
/* 191 */       if (this.observer == null) {
/* 192 */         this.observer = new BindingHelperObserver(this);
/*     */       }
/* 194 */       for (Observable observable : paramVarArgs) {
/* 195 */         if (observable != null) {
/* 196 */           observable.addListener((InvalidationListener)this.observer);
/*     */         }
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
/* 209 */     if (this.observer != null) {
/* 210 */       for (Observable observable : paramVarArgs) {
/* 211 */         if (observable != null) {
/* 212 */           observable.removeListener((InvalidationListener)this.observer);
/*     */         }
/*     */       } 
/* 215 */       this.observer = null;
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
/* 234 */     return FXCollections.emptyObservableList();
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
/*     */   public final ObservableSet<E> get() {
/* 247 */     if (!this.valid) {
/* 248 */       this.value = computeValue();
/* 249 */       this.valid = true;
/* 250 */       if (this.value != null) {
/* 251 */         this.value.addListener(this.setChangeListener);
/*     */       }
/*     */     } 
/* 254 */     return this.value;
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
/*     */   private void invalidateProperties() {
/* 266 */     if (this.size0 != null) {
/* 267 */       this.size0.fireValueChangedEvent();
/*     */     }
/* 269 */     if (this.empty0 != null) {
/* 270 */       this.empty0.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public final void invalidate() {
/* 276 */     if (this.valid) {
/* 277 */       if (this.value != null) {
/* 278 */         this.value.removeListener(this.setChangeListener);
/*     */       }
/* 280 */       this.valid = false;
/* 281 */       invalidateProperties();
/* 282 */       onInvalidating();
/* 283 */       SetExpressionHelper.fireValueChangedEvent(this.helper);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean isValid() {
/* 289 */     return this.valid;
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
/* 308 */     return this.valid ? ("SetBinding [value: " + String.valueOf(get()) + "]") : 
/* 309 */       "SetBinding [invalid]";
/*     */   }
/*     */   
/*     */   protected abstract ObservableSet<E> computeValue();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\SetBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */