/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.ListExpressionHelper;
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableListValue;
/*     */ import javafx.beans.value.ObservableValue;
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
/*     */ public abstract class ListPropertyBase<E>
/*     */   extends ListProperty<E>
/*     */ {
/*     */   private final ListChangeListener<E> listChangeListener;
/*     */   private ObservableList<E> value;
/*     */   private ObservableValue<? extends ObservableList<E>> observable;
/*     */   private InvalidationListener listener;
/*     */   private boolean valid;
/*     */   private ListExpressionHelper<E> helper;
/*     */   private SizeProperty size0;
/*     */   private EmptyProperty empty0;
/*     */   
/*     */   public ListPropertyBase() {
/*  54 */     this.listChangeListener = (paramChange -> {
/*     */         invalidateProperties();
/*     */         
/*     */         invalidated();
/*     */         
/*     */         fireValueChangedEvent(paramChange);
/*     */       });
/*  61 */     this.observable = null;
/*  62 */     this.listener = null;
/*  63 */     this.valid = true;
/*  64 */     this.helper = null; } public ListPropertyBase(ObservableList<E> paramObservableList) { this.listChangeListener = (paramChange -> { invalidateProperties(); invalidated(); fireValueChangedEvent(paramChange); }); this.observable = null; this.listener = null; this.valid = true; this.helper = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  81 */     this.value = paramObservableList;
/*  82 */     if (paramObservableList != null) {
/*  83 */       paramObservableList.addListener(this.listChangeListener);
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
/*  98 */       return ListPropertyBase.this.size();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 103 */       return ListPropertyBase.this;
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
/* 129 */       return ListPropertyBase.this.isEmpty();
/*     */     }
/*     */ 
/*     */     
/*     */     public Object getBean() {
/* 134 */       return ListPropertyBase.this;
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
/* 150 */     this.helper = ListExpressionHelper.addListener(this.helper, (ObservableListValue)this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 155 */     this.helper = ListExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super ObservableList<E>> paramChangeListener) {
/* 160 */     this.helper = ListExpressionHelper.addListener(this.helper, (ObservableListValue)this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super ObservableList<E>> paramChangeListener) {
/* 165 */     this.helper = ListExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ListChangeListener<? super E> paramListChangeListener) {
/* 170 */     this.helper = ListExpressionHelper.addListener(this.helper, (ObservableListValue)this, paramListChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ListChangeListener<? super E> paramListChangeListener) {
/* 175 */     this.helper = ListExpressionHelper.removeListener(this.helper, paramListChangeListener);
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
/* 189 */     ListExpressionHelper.fireValueChangedEvent(this.helper);
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
/*     */   protected void fireValueChangedEvent(ListChangeListener.Change<? extends E> paramChange) {
/* 203 */     ListExpressionHelper.fireValueChangedEvent(this.helper, paramChange);
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
/*     */   private void markInvalid(ObservableList<E> paramObservableList) {
/* 216 */     if (this.valid) {
/* 217 */       if (paramObservableList != null) {
/* 218 */         paramObservableList.removeListener(this.listChangeListener);
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
/*     */   public ObservableList<E> get() {
/* 241 */     if (!this.valid) {
/* 242 */       this.value = (this.observable == null) ? this.value : (ObservableList<E>)this.observable.getValue();
/* 243 */       this.valid = true;
/* 244 */       if (this.value != null) {
/* 245 */         this.value.addListener(this.listChangeListener);
/*     */       }
/*     */     } 
/* 248 */     return this.value;
/*     */   }
/*     */ 
/*     */   
/*     */   public void set(ObservableList<E> paramObservableList) {
/* 253 */     if (isBound()) {
/* 254 */       throw new RuntimeException(((getBean() != null && getName() != null) ? (
/* 255 */           getBean().getClass().getSimpleName() + "." + getBean().getClass().getSimpleName() + " : ") : "") + "A bound value cannot be set.");
/*     */     }
/* 257 */     if (this.value != paramObservableList) {
/* 258 */       ObservableList<E> observableList = this.value;
/* 259 */       this.value = paramObservableList;
/* 260 */       markInvalid(observableList);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isBound() {
/* 266 */     return (this.observable != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void bind(ObservableValue<? extends ObservableList<E>> paramObservableValue) {
/* 271 */     if (paramObservableValue == null) {
/* 272 */       throw new NullPointerException("Cannot bind to null");
/*     */     }
/*     */     
/* 275 */     if (paramObservableValue != this.observable) {
/* 276 */       unbind();
/* 277 */       this.observable = paramObservableValue;
/* 278 */       if (this.listener == null) {
/* 279 */         this.listener = new Listener(this);
/*     */       }
/* 281 */       this.observable.addListener(this.listener);
/* 282 */       markInvalid(this.value);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void unbind() {
/* 288 */     if (this.observable != null) {
/* 289 */       this.value = (ObservableList<E>)this.observable.getValue();
/* 290 */       this.observable.removeListener(this.listener);
/* 291 */       this.observable = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 301 */     Object object = getBean();
/* 302 */     String str = getName();
/* 303 */     StringBuilder stringBuilder = new StringBuilder("ListProperty [");
/* 304 */     if (object != null) {
/* 305 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 307 */     if (str != null && !str.equals("")) {
/* 308 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 310 */     if (isBound()) {
/* 311 */       stringBuilder.append("bound, ");
/* 312 */       if (this.valid) {
/* 313 */         stringBuilder.append("value: ").append(get());
/*     */       } else {
/* 315 */         stringBuilder.append("invalid");
/*     */       } 
/*     */     } else {
/* 318 */       stringBuilder.append("value: ").append(get());
/*     */     } 
/* 320 */     stringBuilder.append("]");
/* 321 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   private static class Listener<E>
/*     */     implements InvalidationListener, WeakListener {
/*     */     private final WeakReference<ListPropertyBase<E>> wref;
/*     */     
/*     */     public Listener(ListPropertyBase<E> param1ListPropertyBase) {
/* 329 */       this.wref = new WeakReference<>(param1ListPropertyBase);
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 334 */       ListPropertyBase listPropertyBase = this.wref.get();
/* 335 */       if (listPropertyBase == null) {
/* 336 */         param1Observable.removeListener(this);
/*     */       } else {
/* 338 */         listPropertyBase.markInvalid(listPropertyBase.value);
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 344 */       return (this.wref.get() == null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ListPropertyBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */