/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.ExpressionHelper;
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.beans.binding.BooleanBinding;
/*     */ import javafx.beans.binding.ObjectExpression;
/*     */ import javafx.beans.value.ChangeListener;
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
/*     */ public abstract class BooleanPropertyBase
/*     */   extends BooleanProperty
/*     */ {
/*     */   private boolean value;
/*  53 */   private ObservableBooleanValue observable = null;
/*  54 */   private InvalidationListener listener = null;
/*     */   private boolean valid = true;
/*  56 */   private ExpressionHelper<Boolean> helper = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public BooleanPropertyBase(boolean paramBoolean) {
/*  71 */     this.value = paramBoolean;
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/*  76 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/*  81 */     this.helper = ExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super Boolean> paramChangeListener) {
/*  86 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super Boolean> paramChangeListener) {
/*  91 */     this.helper = ExpressionHelper.removeListener(this.helper, paramChangeListener);
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
/* 104 */     ExpressionHelper.fireValueChangedEvent(this.helper);
/*     */   }
/*     */   
/*     */   private void markInvalid() {
/* 108 */     if (this.valid) {
/* 109 */       this.valid = false;
/* 110 */       invalidated();
/* 111 */       fireValueChangedEvent();
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
/*     */   public boolean get() {
/* 130 */     this.valid = true;
/* 131 */     return (this.observable == null) ? this.value : this.observable.get();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set(boolean paramBoolean) {
/* 139 */     if (isBound()) {
/* 140 */       throw new RuntimeException(((getBean() != null && getName() != null) ? (
/* 141 */           getBean().getClass().getSimpleName() + "." + getBean().getClass().getSimpleName() + " : ") : "") + "A bound value cannot be set.");
/*     */     }
/* 143 */     if (this.value != paramBoolean) {
/* 144 */       this.value = paramBoolean;
/* 145 */       markInvalid();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBound() {
/* 154 */     return (this.observable != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bind(ObservableValue<? extends Boolean> paramObservableValue) {
/* 163 */     if (paramObservableValue == null) {
/* 164 */       throw new NullPointerException("Cannot bind to null");
/*     */     }
/*     */ 
/*     */     
/* 168 */     ObservableBooleanValue observableBooleanValue = (ObservableBooleanValue)((paramObservableValue instanceof ObservableBooleanValue) ? paramObservableValue : new ValueWrapper(paramObservableValue));
/*     */     
/* 170 */     if (!observableBooleanValue.equals(this.observable)) {
/* 171 */       unbind();
/* 172 */       this.observable = observableBooleanValue;
/* 173 */       if (this.listener == null) {
/* 174 */         this.listener = new Listener(this);
/*     */       }
/* 176 */       this.observable.addListener(this.listener);
/* 177 */       markInvalid();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbind() {
/* 186 */     if (this.observable != null) {
/* 187 */       this.value = this.observable.get();
/* 188 */       this.observable.removeListener(this.listener);
/* 189 */       if (this.observable instanceof ValueWrapper) {
/* 190 */         ((ValueWrapper)this.observable).dispose();
/*     */       }
/* 192 */       this.observable = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 202 */     Object object = getBean();
/* 203 */     String str = getName();
/* 204 */     StringBuilder stringBuilder = new StringBuilder("BooleanProperty [");
/* 205 */     if (object != null) {
/* 206 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 208 */     if (str != null && !str.equals("")) {
/* 209 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 211 */     if (isBound()) {
/* 212 */       stringBuilder.append("bound, ");
/* 213 */       if (this.valid) {
/* 214 */         stringBuilder.append("value: ").append(get());
/*     */       } else {
/* 216 */         stringBuilder.append("invalid");
/*     */       } 
/*     */     } else {
/* 219 */       stringBuilder.append("value: ").append(get());
/*     */     } 
/* 221 */     stringBuilder.append("]");
/* 222 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public BooleanPropertyBase() {}
/*     */   
/*     */   private static class Listener
/*     */     implements InvalidationListener, WeakListener {
/*     */     public Listener(BooleanPropertyBase param1BooleanPropertyBase) {
/* 230 */       this.wref = new WeakReference<>(param1BooleanPropertyBase);
/*     */     }
/*     */     private final WeakReference<BooleanPropertyBase> wref;
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 235 */       BooleanPropertyBase booleanPropertyBase = this.wref.get();
/* 236 */       if (booleanPropertyBase == null) {
/* 237 */         param1Observable.removeListener(this);
/*     */       } else {
/* 239 */         booleanPropertyBase.markInvalid();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 245 */       return (this.wref.get() == null);
/*     */     }
/*     */   }
/*     */   
/*     */   private class ValueWrapper extends BooleanBinding {
/*     */     private ObservableValue<? extends Boolean> observable;
/*     */     
/*     */     public ValueWrapper(ObservableValue<? extends Boolean> param1ObservableValue) {
/* 253 */       this.observable = param1ObservableValue;
/* 254 */       bind(new Observable[] { (Observable)param1ObservableValue });
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean computeValue() {
/* 259 */       Boolean bool = (Boolean)this.observable.getValue();
/* 260 */       return (bool == null) ? false : bool.booleanValue();
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/* 265 */       unbind(new Observable[] { (Observable)this.observable });
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\BooleanPropertyBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */