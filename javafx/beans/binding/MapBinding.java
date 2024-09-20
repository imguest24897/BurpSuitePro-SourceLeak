/*     */ package javafx.beans.binding;
/*     */ 
/*     */ import com.sun.javafx.binding.BindingHelperObserver;
/*     */ import com.sun.javafx.binding.MapExpressionHelper;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.property.ReadOnlyBooleanProperty;
/*     */ import javafx.beans.property.ReadOnlyBooleanPropertyBase;
/*     */ import javafx.beans.property.ReadOnlyIntegerProperty;
/*     */ import javafx.beans.property.ReadOnlyIntegerPropertyBase;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.collections.FXCollections;
/*     */ import javafx.collections.MapChangeListener;
/*     */ import javafx.collections.ObservableList;
/*     */ import javafx.collections.ObservableMap;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class MapBinding<K, V>
/*     */   extends MapExpression<K, V>
/*     */   implements Binding<ObservableMap<K, V>>
/*     */ {
/*  70 */   private final MapChangeListener<K, V> mapChangeListener = new MapChangeListener<K, V>()
/*     */     {
/*     */       public void onChanged(MapChangeListener.Change<? extends K, ? extends V> param1Change) {
/*  73 */         MapBinding.this.invalidateProperties();
/*  74 */         MapBinding.this.onInvalidating();
/*  75 */         MapExpressionHelper.fireValueChangedEvent(MapBinding.this.helper, param1Change);
/*     */       }
/*     */     };
/*     */   
/*     */   private ObservableMap<K, V> value;
/*     */   private boolean valid = false;
/*     */   private BindingHelperObserver observer;
/*  82 */   private MapExpressionHelper<K, V> helper = null;
/*     */ 
/*     */ 
/*     */   
/*     */   private SizeProperty size0;
/*     */ 
/*     */ 
/*     */   
/*     */   private EmptyProperty empty0;
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyIntegerProperty sizeProperty() {
/*  95 */     if (this.size0 == null) {
/*  96 */       this.size0 = new SizeProperty();
/*     */     }
/*  98 */     return (ReadOnlyIntegerProperty)this.size0;
/*     */   }
/*     */   
/*     */   private class SizeProperty
/*     */     extends ReadOnlyIntegerPropertyBase {
/*     */     public int get() {
/* 104 */       return MapBinding.this.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 109 */       return MapBinding.this;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 114 */       return "size";
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 119 */       super.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ReadOnlyBooleanProperty emptyProperty() {
/* 125 */     if (this.empty0 == null) {
/* 126 */       this.empty0 = new EmptyProperty();
/*     */     }
/* 128 */     return (ReadOnlyBooleanProperty)this.empty0;
/*     */   }
/*     */   
/*     */   private class EmptyProperty
/*     */     extends ReadOnlyBooleanPropertyBase
/*     */   {
/*     */     public boolean get() {
/* 135 */       return MapBinding.this.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 140 */       return MapBinding.this;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 145 */       return "empty";
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 150 */       super.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/* 156 */     this.helper = MapExpressionHelper.addListener(this.helper, this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 161 */     this.helper = MapExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 166 */     this.helper = MapExpressionHelper.addListener(this.helper, this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 171 */     this.helper = MapExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 176 */     this.helper = MapExpressionHelper.addListener(this.helper, this, paramMapChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 181 */     this.helper = MapExpressionHelper.removeListener(this.helper, paramMapChangeListener);
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
/* 192 */     if (paramVarArgs != null && paramVarArgs.length > 0) {
/* 193 */       if (this.observer == null) {
/* 194 */         this.observer = new BindingHelperObserver(this);
/*     */       }
/* 196 */       for (Observable observable : paramVarArgs) {
/* 197 */         if (observable != null) {
/* 198 */           observable.addListener((InvalidationListener)this.observer);
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
/* 211 */     if (this.observer != null) {
/* 212 */       for (Observable observable : paramVarArgs) {
/* 213 */         if (observable != null) {
/* 214 */           observable.removeListener((InvalidationListener)this.observer);
/*     */         }
/*     */       } 
/* 217 */       this.observer = null;
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
/* 236 */     return FXCollections.emptyObservableList();
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
/*     */   public final ObservableMap<K, V> get() {
/* 249 */     if (!this.valid) {
/* 250 */       this.value = computeValue();
/* 251 */       this.valid = true;
/* 252 */       if (this.value != null) {
/* 253 */         this.value.addListener(this.mapChangeListener);
/*     */       }
/*     */     } 
/* 256 */     return this.value;
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
/* 268 */     if (this.size0 != null) {
/* 269 */       this.size0.fireValueChangedEvent();
/*     */     }
/* 271 */     if (this.empty0 != null) {
/* 272 */       this.empty0.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public final void invalidate() {
/* 278 */     if (this.valid) {
/* 279 */       if (this.value != null) {
/* 280 */         this.value.removeListener(this.mapChangeListener);
/*     */       }
/* 282 */       this.valid = false;
/* 283 */       invalidateProperties();
/* 284 */       onInvalidating();
/* 285 */       MapExpressionHelper.fireValueChangedEvent(this.helper);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean isValid() {
/* 291 */     return this.valid;
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
/* 310 */     return this.valid ? ("MapBinding [value: " + String.valueOf(get()) + "]") : 
/* 311 */       "MapBinding [invalid]";
/*     */   }
/*     */   
/*     */   protected abstract ObservableMap<K, V> computeValue();
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\binding\MapBinding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */