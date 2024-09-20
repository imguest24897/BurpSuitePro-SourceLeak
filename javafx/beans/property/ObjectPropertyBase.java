/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.ExpressionHelper;
/*     */ import java.lang.ref.WeakReference;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.Observable;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.beans.value.ChangeListener;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class ObjectPropertyBase<T>
/*     */   extends ObjectProperty<T>
/*     */ {
/*     */   private T value;
/*  55 */   private ObservableValue<? extends T> observable = null;
/*  56 */   private InvalidationListener listener = null;
/*     */   private boolean valid = true;
/*  58 */   private ExpressionHelper<T> helper = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObjectPropertyBase() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObjectPropertyBase(T paramT) {
/*  73 */     this.value = paramT;
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/*  78 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/*  83 */     this.helper = ExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super T> paramChangeListener) {
/*  88 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super T> paramChangeListener) {
/*  93 */     this.helper = ExpressionHelper.removeListener(this.helper, paramChangeListener);
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
/* 106 */     ExpressionHelper.fireValueChangedEvent(this.helper);
/*     */   }
/*     */   
/*     */   private void markInvalid() {
/* 110 */     if (this.valid) {
/* 111 */       this.valid = false;
/* 112 */       invalidated();
/* 113 */       fireValueChangedEvent();
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
/*     */   public T get() {
/* 132 */     this.valid = true;
/* 133 */     return (this.observable == null) ? this.value : (T)this.observable.getValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set(T paramT) {
/* 141 */     if (isBound()) {
/* 142 */       throw new RuntimeException(((getBean() != null && getName() != null) ? (
/* 143 */           getBean().getClass().getSimpleName() + "." + getBean().getClass().getSimpleName() + " : ") : "") + "A bound value cannot be set.");
/*     */     }
/* 145 */     if (this.value != paramT) {
/* 146 */       this.value = paramT;
/* 147 */       markInvalid();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBound() {
/* 156 */     return (this.observable != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bind(ObservableValue<? extends T> paramObservableValue) {
/* 164 */     if (paramObservableValue == null) {
/* 165 */       throw new NullPointerException("Cannot bind to null");
/*     */     }
/*     */     
/* 168 */     if (!paramObservableValue.equals(this.observable)) {
/* 169 */       unbind();
/* 170 */       this.observable = paramObservableValue;
/* 171 */       if (this.listener == null) {
/* 172 */         this.listener = new Listener(this);
/*     */       }
/* 174 */       this.observable.addListener(this.listener);
/* 175 */       markInvalid();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbind() {
/* 184 */     if (this.observable != null) {
/* 185 */       this.value = (T)this.observable.getValue();
/* 186 */       this.observable.removeListener(this.listener);
/* 187 */       this.observable = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 197 */     Object object = getBean();
/* 198 */     String str = getName();
/* 199 */     StringBuilder stringBuilder = new StringBuilder("ObjectProperty [");
/* 200 */     if (object != null) {
/* 201 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 203 */     if (str != null && !str.equals("")) {
/* 204 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 206 */     if (isBound()) {
/* 207 */       stringBuilder.append("bound, ");
/* 208 */       if (this.valid) {
/* 209 */         stringBuilder.append("value: ").append(get());
/*     */       } else {
/* 211 */         stringBuilder.append("invalid");
/*     */       } 
/*     */     } else {
/* 214 */       stringBuilder.append("value: ").append(get());
/*     */     } 
/* 216 */     stringBuilder.append("]");
/* 217 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   private static class Listener
/*     */     implements InvalidationListener, WeakListener {
/*     */     private final WeakReference<ObjectPropertyBase<?>> wref;
/*     */     
/*     */     public Listener(ObjectPropertyBase<?> param1ObjectPropertyBase) {
/* 225 */       this.wref = new WeakReference<>(param1ObjectPropertyBase);
/*     */     }
/*     */ 
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 230 */       ObjectPropertyBase objectPropertyBase = this.wref.get();
/* 231 */       if (objectPropertyBase == null) {
/* 232 */         param1Observable.removeListener(this);
/*     */       } else {
/* 234 */         objectPropertyBase.markInvalid();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 240 */       return (this.wref.get() == null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\ObjectPropertyBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */