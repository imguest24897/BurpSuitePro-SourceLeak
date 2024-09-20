/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.MapExpressionHelper;
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableMapValue;
/*     */ import javafx.beans.value.ObservableValue;
/*     */ import javafx.collections.MapChangeListener;
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
/*     */ public abstract class MapPropertyBase<K, V>
/*     */   extends MapProperty<K, V>
/*     */ {
/*     */   private final MapChangeListener<K, V> mapChangeListener;
/*     */   private ObservableMap<K, V> value;
/*     */   private ObservableValue<? extends ObservableMap<K, V>> observable;
/*     */   private InvalidationListener listener;
/*     */   private boolean valid;
/*     */   private MapExpressionHelper<K, V> helper;
/*     */   private SizeProperty size0;
/*     */   private EmptyProperty empty0;
/*     */   
/*     */   public MapPropertyBase() {
/*  54 */     this.mapChangeListener = (paramChange -> {
/*     */         invalidateProperties();
/*     */         
/*     */         invalidated();
/*     */         
/*     */         fireValueChangedEvent(paramChange);
/*     */       });
/*  61 */     this.observable = null;
/*  62 */     this.listener = null;
/*  63 */     this.valid = true;
/*  64 */     this.helper = null; } public MapPropertyBase(ObservableMap<K, V> paramObservableMap) { this.mapChangeListener = (paramChange -> { invalidateProperties(); invalidated(); fireValueChangedEvent(paramChange); }); this.observable = null; this.listener = null; this.valid = true; this.helper = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  81 */     this.value = paramObservableMap;
/*  82 */     if (paramObservableMap != null) {
/*  83 */       paramObservableMap.addListener(this.mapChangeListener);
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public ReadOnlyIntegerProperty sizeProperty() {
/*  89 */     if (this.size0 == null) {
/*  90 */       this.size0 = new SizeProperty();
/*     */     }
/*  92 */     return this.size0;
/*     */   }
/*     */   
/*     */   private class SizeProperty
/*     */     extends ReadOnlyIntegerPropertyBase {
/*     */     public int get() {
/*  98 */       return MapPropertyBase.this.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 103 */       return MapPropertyBase.this;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 108 */       return "size";
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 113 */       super.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public ReadOnlyBooleanProperty emptyProperty() {
/* 119 */     if (this.empty0 == null) {
/* 120 */       this.empty0 = new EmptyProperty();
/*     */     }
/* 122 */     return this.empty0;
/*     */   }
/*     */   
/*     */   private class EmptyProperty
/*     */     extends ReadOnlyBooleanPropertyBase
/*     */   {
/*     */     public boolean get() {
/* 129 */       return MapPropertyBase.this.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 134 */       return MapPropertyBase.this;
/*     */     }
/*     */ 
/*     */     
/*     */     public String getName() {
/* 139 */       return "empty";
/*     */     }
/*     */ 
/*     */     
/*     */     protected void fireValueChangedEvent() {
/* 144 */       super.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/* 150 */     this.helper = MapExpressionHelper.addListener(this.helper, (ObservableMapValue)this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 155 */     this.helper = MapExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 160 */     this.helper = MapExpressionHelper.addListener(this.helper, (ObservableMapValue)this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super ObservableMap<K, V>> paramChangeListener) {
/* 165 */     this.helper = MapExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 170 */     this.helper = MapExpressionHelper.addListener(this.helper, (ObservableMapValue)this, paramMapChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(MapChangeListener<? super K, ? super V> paramMapChangeListener) {
/* 175 */     this.helper = MapExpressionHelper.removeListener(this.helper, paramMapChangeListener);
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
/*     */   protected void fireValueChangedEvent() {
/* 189 */     MapExpressionHelper.fireValueChangedEvent(this.helper);
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
/*     */   protected void fireValueChangedEvent(MapChangeListener.Change<? extends K, ? extends V> paramChange) {
/* 203 */     MapExpressionHelper.fireValueChangedEvent(this.helper, paramChange);
/*     */   }
/*     */   
/*     */   private void invalidateProperties() {
/* 207 */     if (this.size0 != null) {
/* 208 */       this.size0.fireValueChangedEvent();
/*     */     }
/* 210 */     if (this.empty0 != null) {
/* 211 */       this.empty0.fireValueChangedEvent();
/*     */     }
/*     */   }
/*     */   
/*     */   private void markInvalid(ObservableMap<K, V> paramObservableMap) {
/* 216 */     if (this.valid) {
/* 217 */       if (paramObservableMap != null) {
/* 218 */         paramObservableMap.removeListener(this.mapChangeListener);
/*     */       }
/* 220 */       this.valid = false;
/* 221 */       invalidateProperties();
/* 222 */       invalidated();
/* 223 */       fireValueChangedEvent();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void invalidated() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObservableMap<K, V> get() {
/* 241 */     if (!this.valid) {
/* 242 */       this.value = (this.observable == null) ? this.value : (ObservableMap<K, V>)this.observable.getValue();
/* 243 */       this.valid = true;
/* 244 */       if (this.value != null) {
/* 245 */         this.value.addListener(this.mapChangeListener);
/*     */       }
/*     */     } 
/* 248 */     return this.value;
/*     */   }
/*     */ 
/*     */   
/*     */   public void set(ObservableMap<K, V> paramObservableMap) {
/* 253 */     if (isBound()) {
/* 254 */       throw new RuntimeException(((getBean() != null && getName() != null) ? (
/* 255 */           getBean().getClass().getSimpleName() + "." + getBean().getClass().getSimpleName() + " : ") : "") + "A bound value cannot be set.");
/*     */     }
/* 257 */     if (this.value != paramObservableMap) {
/* 258 */       ObservableMap<K, V> observableMap = this.value;
/* 259 */       this.value = paramObservableMap;
/* 260 */       markInvalid(observableMap);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isBound() {
/* 266 */     return (this.observable != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void bind(ObservableValue<? extends ObservableMap<K, V>> paramObservableValue) {
/* 271 */     if (paramObservableValue == null) {
/* 272 */       throw new NullPointerException("Cannot bind to null");
/*     */     }
/* 274 */     if (paramObservableValue != this.observable) {
/* 275 */       unbind();
/* 276 */       this.observable = paramObservableValue;
/* 277 */       if (this.listener == null) {
/* 278 */         this.listener = new Listener<>(this);
/*     */       }
/* 280 */       this.observable.addListener(this.listener);
/* 281 */       markInvalid(this.value);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void unbind() {
/* 287 */     if (this.observable != null) {
/* 288 */       this.value = (ObservableMap<K, V>)this.observable.getValue();
/* 289 */       this.observable.removeListener(this.listener);
/* 290 */       this.observable = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 300 */     Object object = getBean();
/* 301 */     String str = getName();
/* 302 */     StringBuilder stringBuilder = new StringBuilder("MapProperty [");
/* 303 */     if (object != null) {
/* 304 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 306 */     if (str != null && !str.equals("")) {
/* 307 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 309 */     if (isBound()) {
/* 310 */       stringBuilder.append("bound, ");
/* 311 */       if (this.valid) {
/* 312 */         stringBuilder.append("value: ").append(get());
/*     */       } else {
/* 314 */         stringBuilder.append("invalid");
/*     */       } 
/*     */     } else {
/* 317 */       stringBuilder.append("value: ").append(get());
/*     */     } 
/* 319 */     stringBuilder.append("]");
/* 320 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   private static class Listener<K, V>
/*     */     implements InvalidationListener, WeakListener {
/*     */     private final WeakReference<MapPropertyBase<K, V>> wref;
/*     */     
/*     */     public Listener(MapPropertyBase<K, V> param1MapPropertyBase) {
/* 328 */       this.wref = new WeakReference<>(param1MapPropertyBase);
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 333 */       MapPropertyBase mapPropertyBase = this.wref.get();
/* 334 */       if (mapPropertyBase == null) {
/* 335 */         param1Observable.removeListener(this);
/*     */       } else {
/* 337 */         mapPropertyBase.markInvalid(mapPropertyBase.value);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 343 */       return (this.wref.get() == null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\MapPropertyBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */