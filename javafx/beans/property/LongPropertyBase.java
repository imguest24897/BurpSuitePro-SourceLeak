/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.ExpressionHelper;
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.beans.binding.LongBinding;
/*     */ import javafx.beans.binding.ObjectExpression;
/*     */ import javafx.beans.value.ChangeListener;
/*     */ import javafx.beans.value.ObservableLongValue;
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
/*     */ public abstract class LongPropertyBase
/*     */   extends LongProperty
/*     */ {
/*     */   private long value;
/*  56 */   private ObservableLongValue observable = null;
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
/*     */   public LongPropertyBase(long paramLong) {
/*  74 */     this.value = paramLong;
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
/*     */   public long get() {
/* 133 */     this.valid = true;
/* 134 */     return (this.observable == null) ? this.value : this.observable.get();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set(long paramLong) {
/* 142 */     if (isBound()) {
/* 143 */       throw new RuntimeException(((getBean() != null && getName() != null) ? (
/* 144 */           getBean().getClass().getSimpleName() + "." + getBean().getClass().getSimpleName() + " : ") : "") + "A bound value cannot be set.");
/*     */     }
/* 146 */     if (this.value != paramLong) {
/* 147 */       this.value = paramLong;
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
/* 170 */     if (rawObservable instanceof ObservableLongValue) {
/* 171 */       ObservableLongValue observableLongValue = (ObservableLongValue)rawObservable;
/* 172 */     } else if (rawObservable instanceof ObservableNumberValue) {
/* 173 */       final ObservableNumberValue numberValue = (ObservableNumberValue)rawObservable;
/* 174 */       valueWrapper = new ValueWrapper(rawObservable)
/*     */         {
/*     */           protected long computeValue()
/*     */           {
/* 178 */             return numberValue.longValue();
/*     */           }
/*     */         };
/*     */     } else {
/* 182 */       valueWrapper = new ValueWrapper(rawObservable)
/*     */         {
/*     */           protected long computeValue()
/*     */           {
/* 186 */             Number number = (Number)rawObservable.getValue();
/* 187 */             return (number == null) ? 0L : number.longValue();
/*     */           }
/*     */         };
/*     */     } 
/*     */     
/* 192 */     if (!valueWrapper.equals(this.observable)) {
/* 193 */       unbind();
/* 194 */       this.observable = (ObservableLongValue)valueWrapper;
/* 195 */       if (this.listener == null) {
/* 196 */         this.listener = new Listener(this);
/*     */       }
/* 198 */       this.observable.addListener(this.listener);
/* 199 */       markInvalid();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbind() {
/* 208 */     if (this.observable != null) {
/* 209 */       this.value = this.observable.get();
/* 210 */       this.observable.removeListener(this.listener);
/* 211 */       if (this.observable instanceof ValueWrapper) {
/* 212 */         ((ValueWrapper)this.observable).dispose();
/*     */       }
/* 214 */       this.observable = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 224 */     Object object = getBean();
/* 225 */     String str = getName();
/* 226 */     StringBuilder stringBuilder = new StringBuilder("LongProperty [");
/* 227 */     if (object != null) {
/* 228 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 230 */     if (str != null && !str.equals("")) {
/* 231 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 233 */     if (isBound()) {
/* 234 */       stringBuilder.append("bound, ");
/* 235 */       if (this.valid) {
/* 236 */         stringBuilder.append("value: ").append(get());
/*     */       } else {
/* 238 */         stringBuilder.append("invalid");
/*     */       } 
/*     */     } else {
/* 241 */       stringBuilder.append("value: ").append(get());
/*     */     } 
/* 243 */     stringBuilder.append("]");
/* 244 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public LongPropertyBase() {}
/*     */   
/*     */   private static class Listener
/*     */     implements InvalidationListener, WeakListener {
/*     */     public Listener(LongPropertyBase param1LongPropertyBase) {
/* 252 */       this.wref = new WeakReference<>(param1LongPropertyBase);
/*     */     }
/*     */     private final WeakReference<LongPropertyBase> wref;
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 257 */       LongPropertyBase longPropertyBase = this.wref.get();
/* 258 */       if (longPropertyBase == null) {
/* 259 */         param1Observable.removeListener(this);
/*     */       } else {
/* 261 */         longPropertyBase.markInvalid();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 267 */       return (this.wref.get() == null);
/*     */     }
/*     */   }
/*     */   
/*     */   private abstract class ValueWrapper
/*     */     extends LongBinding {
/*     */     private ObservableValue<? extends Number> observable;
/*     */     
/*     */     public ValueWrapper(ObservableValue<? extends Number> param1ObservableValue) {
/* 276 */       this.observable = param1ObservableValue;
/* 277 */       bind(new Observable[] { (Observable)param1ObservableValue });
/*     */     }
/*     */ 
/*     */     
/*     */     public void dispose() {
/* 282 */       unbind(new Observable[] { (Observable)this.observable });
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\LongPropertyBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */