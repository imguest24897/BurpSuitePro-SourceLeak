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
/*     */ public abstract class StringPropertyBase
/*     */   extends StringProperty
/*     */ {
/*     */   private String value;
/*  53 */   private ObservableValue<? extends String> observable = null;
/*  54 */   private InvalidationListener listener = null;
/*     */   private boolean valid = true;
/*  56 */   private ExpressionHelper<String> helper = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public StringPropertyBase(String paramString) {
/*  71 */     this.value = paramString;
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
/*     */   public void addListener(ChangeListener<? super String> paramChangeListener) {
/*  86 */     this.helper = ExpressionHelper.addListener(this.helper, this, paramChangeListener);
/*     */   }
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super String> paramChangeListener) {
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
/*     */   public String get() {
/* 130 */     this.valid = true;
/* 131 */     return (this.observable == null) ? this.value : (String)this.observable.getValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void set(String paramString) {
/* 139 */     if (isBound()) {
/* 140 */       throw new RuntimeException(((getBean() != null && getName() != null) ? (
/* 141 */           getBean().getClass().getSimpleName() + "." + getBean().getClass().getSimpleName() + " : ") : "") + "A bound value cannot be set.");
/*     */     }
/* 143 */     if ((this.value == null) ? (paramString != null) : !this.value.equals(paramString)) {
/* 144 */       this.value = paramString;
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
/*     */   public void bind(ObservableValue<? extends String> paramObservableValue) {
/* 162 */     if (paramObservableValue == null) {
/* 163 */       throw new NullPointerException("Cannot bind to null");
/*     */     }
/* 165 */     if (!paramObservableValue.equals(this.observable)) {
/* 166 */       unbind();
/* 167 */       this.observable = paramObservableValue;
/* 168 */       if (this.listener == null) {
/* 169 */         this.listener = new Listener(this);
/*     */       }
/* 171 */       this.observable.addListener(this.listener);
/* 172 */       markInvalid();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbind() {
/* 181 */     if (this.observable != null) {
/* 182 */       this.value = (String)this.observable.getValue();
/* 183 */       this.observable.removeListener(this.listener);
/* 184 */       this.observable = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 194 */     Object object = getBean();
/* 195 */     String str = getName();
/* 196 */     StringBuilder stringBuilder = new StringBuilder("StringProperty [");
/* 197 */     if (object != null) {
/* 198 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 200 */     if (str != null && !str.equals("")) {
/* 201 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 203 */     if (isBound()) {
/* 204 */       stringBuilder.append("bound, ");
/* 205 */       if (this.valid) {
/* 206 */         stringBuilder.append("value: ").append(get());
/*     */       } else {
/* 208 */         stringBuilder.append("invalid");
/*     */       } 
/*     */     } else {
/* 211 */       stringBuilder.append("value: ").append(get());
/*     */     } 
/* 213 */     stringBuilder.append("]");
/* 214 */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public StringPropertyBase() {}
/*     */   
/*     */   private static class Listener
/*     */     implements InvalidationListener, WeakListener {
/*     */     public Listener(StringPropertyBase param1StringPropertyBase) {
/* 222 */       this.wref = new WeakReference<>(param1StringPropertyBase);
/*     */     }
/*     */     private final WeakReference<StringPropertyBase> wref;
/*     */     
/*     */     public void invalidated(Observable param1Observable) {
/* 227 */       StringPropertyBase stringPropertyBase = this.wref.get();
/* 228 */       if (stringPropertyBase == null) {
/* 229 */         param1Observable.removeListener(this);
/*     */       } else {
/* 231 */         stringPropertyBase.markInvalid();
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 237 */       return (this.wref.get() == null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\StringPropertyBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */