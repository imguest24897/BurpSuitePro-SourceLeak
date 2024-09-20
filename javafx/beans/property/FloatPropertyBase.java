/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.ExpressionHelper;
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.beans.binding.FloatBinding;
/*     */ import javafx.beans.binding.ObjectExpression;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableFloatValue;
/*     */ import javafx.beans.value.ObservableNumberValue;
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
/*     */ public abstract class FloatPropertyBase
/*     */   extends FloatProperty
/*     */ {
/*     */   private float value;
/*  56 */   private ObservableFloatValue observable = null;
/*  57 */   private InvalidationListener listener = null;
/*     */   private boolean valid = true;
/*  59 */   private ExpressionHelper<Number> helper = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FloatPropertyBase(float paramFloat) {
/*  74 */     this.value = paramFloat;
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/*  79 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/*  84 */     this.helper = ExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super Number> paramChangeListener) {
/*  89 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super Number> paramChangeListener) {
/*  94 */     this.helper = ExpressionHelper.removeListener(this.helper, paramChangeListener);
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
/*     */   protected void fireValueChangedEvent() {
/* 107 */     ExpressionHelper.fireValueChangedEvent(this.helper);
/*     */   }
/*     */   
/*     */   private void markInvalid() {
/* 111 */     if (this.valid) {
/* 112 */       this.valid = false;
/* 113 */       invalidated();
/* 114 */       fireValueChangedEvent();
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
/*     */   
/*     */   public float get() {
/* 133 */     this.valid = true;
/* 134 */     return (this.observable == null) ? this.value : this.observable.get();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set(float paramFloat) {
/* 142 */     if (isBound()) {
/* 143 */       throw new RuntimeException(((getBean() != null && getName() != null) ? (
/* 144 */           getBean().getClass().getSimpleName() + "." + getBean().getClass().getSimpleName() + " : ") : "") + "A bound value cannot be set.");
/*     */     }
/* 146 */     if (this.value != paramFloat) {
/* 147 */       this.value = paramFloat;
/* 148 */       markInvalid();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBound() {
/* 157 */     return (this.observable != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bind(final ObservableValue<? extends Number> rawObservable) {
/*     */     ValueWrapper valueWrapper;
/* 165 */     if (rawObservable == null) {
/* 166 */       throw new NullPointerException("Cannot bind to null");
/*     */     }
/*     */ 
/*     */     
/* 170 */     if (rawObservable instanceof ObservableFloatValue) {
/* 171 */       ObservableFloatValue observableFloatValue = (ObservableFloatValue)rawObservable;
/* 172 */     } else if (rawObservable instanceof ObservableNumberValue) {
/* 173 */       final ObservableNumberValue numberValue = (ObservableNumberValue)rawObservable;
/* 174 */       valueWrapper = new ValueWrapper(rawObservable)
/*     */         {
/*     */           protected float computeValue()
/*     */           {
/* 178 */             return numberValue.floatValue();
/*     */           }
/*     */         };
/*     */     } else {
/* 182 */       valueWrapper = new ValueWrapper(rawObservable)
/*     */         {
/*     */           protected float computeValue()
/*     */           {
/* 186 */             Number number = (Number)rawObservable.getValue();
/* 187 */             return (number == null) ? 0.0F : number.floatValue();
/*     */           }
/*     */         };
/*     */     } 
/*     */ 
/*     */     
/* 193 */     if (!valueWrapper.equals(this.observable)) {
/* 194 */       unbind();
/* 195 */       this.observable = (ObservableFloatValue)valueWrapper;
/* 196 */       if (this.listener == null) {
/* 197 */         this.listener = new Listener(this);
/*     */       }
/* 199 */       this.observable.addListener(this.listener);
/* 200 */       markInvalid();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbind() {
/* 209 */     if (this.observable != null) {
/* 210 */       this.value = this.observable.get();
/* 211 */       this.observable.removeListener(this.listener);
/* 212 */       if (this.observable instanceof ValueWrapper) {
/* 213 */         ((ValueWrapper)this.observable).dispose();
/*     */       }
/* 215 */       this.observable = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 225 */     Object object = getBean();
/* 226 */     String str = getName();
/* 227 */     StringBuilder stringBuilder = new StringBuilder("FloatProperty [");
/* 228 */     if (object != null) {
/* 229 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 231 */     if (str != null && !str.equals("")) {
/* 232 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 234 */     if (isBound()) {
/* 235 */       stringBuilder.append("bound, ");
/* 236 */       if (this.valid) {
/* 237 */         stringBuilder.append("value: ").append(get());
/*     */       } else {
/* 239 */         stringBuilder.append("invalid");
/*     */       } 
/*     */     } else {
/* 242 */       stringBuilder.append("value: ").append(get());
/*     */     } 
/* 244 */     stringBuilder.append("]");
/* 245 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public FloatPropertyBase() {}
/*     */   
/*     */   private static class Listener
/*     */     implements InvalidationListener, WeakListener {
/*     */     public Listener(FloatPropertyBase param1FloatPropertyBase) {
/* 253 */       this.wref = new WeakReference<>(param1FloatPropertyBase);
/*     */     }
/*     */     private final WeakReference<FloatPropertyBase> wref;
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 258 */       FloatPropertyBase floatPropertyBase = this.wref.get();
/* 259 */       if (floatPropertyBase == null) {
/* 260 */         param1Observable.removeListener(this);
/*     */       } else {
/* 262 */         floatPropertyBase.markInvalid();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 268 */       return (this.wref.get() == null);
/*     */     }
/*     */   }
/*     */   
/*     */   private abstract class ValueWrapper
/*     */     extends FloatBinding {
/*     */     private ObservableValue<? extends Number> observable;
/*     */     
/*     */     public ValueWrapper(ObservableValue<? extends Number> param1ObservableValue) {
/* 277 */       this.observable = param1ObservableValue;
/* 278 */       bind(new Observable[] { (Observable)param1ObservableValue });
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/* 283 */       unbind(new Observable[] { (Observable)this.observable });
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\FloatPropertyBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */