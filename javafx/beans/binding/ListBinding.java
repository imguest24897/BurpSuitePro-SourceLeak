/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.BindingHelperObserver;
/*     */ import com.sun.javafx.binding.ListExpressionHelper;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.property.ReadOnlyBooleanProperty;
/*     */ import javafx.beans.property.ReadOnlyBooleanPropertyBase;
/*     */ import javafx.beans.property.ReadOnlyIntegerProperty;
/*     */ import javafx.beans.property.ReadOnlyIntegerPropertyBase;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.collections.FXCollections;
/*     */ import javafx.collections.ListChangeListener;
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
/*     */ public abstract class ListBinding<E>
/*     */   extends ListExpression<E>
/*     */   implements Binding<ObservableList<E>>
/*     */ {
/*  73 */   private final ListChangeListener<E> listChangeListener = new ListChangeListener<E>()
/*     */     {
/*     */       public void onChanged(ListChangeListener.Change<? extends E> param1Change) {
/*  76 */         ListBinding.this.invalidateProperties();
/*  77 */         ListBinding.this.onInvalidating();
/*  78 */         ListExpressionHelper.fireValueChangedEvent(ListBinding.this.helper, param1Change);
/*     */       }
/*     */     };
/*     */ 
/*     */ 
/*     */   
/*     */   private ObservableList<E> value;
/*     */ 
/*     */   
/*     */   private boolean valid = false;
/*     */ 
/*     */   
/*     */   private BindingHelperObserver observer;
/*     */   
/*  92 */   private ListExpressionHelper<E> helper = null;
/*     */   
/*     */   private SizeProperty size0;
/*     */   
/*     */   private EmptyProperty empty0;
/*     */   
/*     */   public ReadOnlyIntegerProperty sizeProperty() {
/*  99 */     if (this.size0 == null) {
/* 100 */       this.size0 = new SizeProperty();
/*     */     }
/* 102 */     return (ReadOnlyIntegerProperty)this.size0;
/*     */   }
/*     */   
/*     */   private class SizeProperty
/*     */     extends ReadOnlyIntegerPropertyBase {
/*     */     public int get() {
/* 108 */       return ListBinding.this.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 113 */       return ListBinding.this;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 118 */       return "size";
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 123 */       super.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ReadOnlyBooleanProperty emptyProperty() {
/* 129 */     if (this.empty0 == null) {
/* 130 */       this.empty0 = new EmptyProperty();
/*     */     }
/* 132 */     return (ReadOnlyBooleanProperty)this.empty0;
/*     */   }
/*     */   
/*     */   private class EmptyProperty
/*     */     extends ReadOnlyBooleanPropertyBase
/*     */   {
/*     */     public boolean get() {
/* 139 */       return ListBinding.this.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 144 */       return ListBinding.this;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 149 */       return "empty";
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 154 */       super.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/* 160 */     this.helper = ListExpressionHelper.addListener(this.helper, this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 165 */     this.helper = ListExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super ObservableList<E>> paramChangeListener) {
/* 170 */     this.helper = ListExpressionHelper.addListener(this.helper, this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super ObservableList<E>> paramChangeListener) {
/* 175 */     this.helper = ListExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ListChangeListener<? super E> paramListChangeListener) {
/* 180 */     this.helper = ListExpressionHelper.addListener(this.helper, this, paramListChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ListChangeListener<? super E> paramListChangeListener) {
/* 185 */     this.helper = ListExpressionHelper.removeListener(this.helper, paramListChangeListener);
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
/* 196 */     if (paramVarArgs != null && paramVarArgs.length > 0) {
/* 197 */       if (this.observer == null) {
/* 198 */         this.observer = new BindingHelperObserver(this);
/*     */       }
/* 200 */       for (Observable observable : paramVarArgs) {
/* 201 */         if (observable != null) {
/* 202 */           observable.addListener((InvalidationListener)this.observer);
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
/* 215 */     if (this.observer != null) {
/* 216 */       for (Observable observable : paramVarArgs) {
/* 217 */         if (observable != null) {
/* 218 */           observable.removeListener((InvalidationListener)this.observer);
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
/*     */   public void dispose() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObservableList<?> getDependencies() {
/* 239 */     return FXCollections.emptyObservableList();
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
/*     */   public final ObservableList<E> get() {
/* 252 */     if (!this.valid) {
/* 253 */       this.value = computeValue();
/* 254 */       this.valid = true;
/* 255 */       if (this.value != null) {
/* 256 */         this.value.addListener(this.listChangeListener);
/*     */       }
/*     */     } 
/* 259 */     return this.value;
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
/* 271 */     if (this.size0 != null) {
/* 272 */       this.size0.fireValueChangedEvent();
/*     */     }
/* 274 */     if (this.empty0 != null) {
/* 275 */       this.empty0.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public final void invalidate() {
/* 281 */     if (this.valid) {
/* 282 */       if (this.value != null) {
/* 283 */         this.value.removeListener(this.listChangeListener);
/*     */       }
/* 285 */       this.valid = false;
/* 286 */       invalidateProperties();
/* 287 */       onInvalidating();
/* 288 */       ListExpressionHelper.fireValueChangedEvent(this.helper);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean isValid() {
/* 294 */     return this.valid;
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
/* 313 */     return this.valid ? ("ListBinding [value: " + String.valueOf(get()) + "]") : 
/* 314 */       "ListBinding [invalid]";
/*     */   }
/*     */   
/*     */   protected abstract ObservableList<E> computeValue();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\ListBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */