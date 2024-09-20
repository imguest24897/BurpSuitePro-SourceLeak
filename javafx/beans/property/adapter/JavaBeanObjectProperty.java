/*     */ package javafx.beans.property.adapter;
/*     */ 
/*     */ import com.sun.javafx.binding.ExpressionHelper;
/*     */ import com.sun.javafx.property.MethodHelper;
/*     */ import com.sun.javafx.property.adapter.Disposer;
/*     */ import com.sun.javafx.property.adapter.PropertyDescriptor;
/*     */ import com.sun.javafx.property.adapter.ReadOnlyPropertyDescriptor;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.UndeclaredThrowableException;
/*     */ import java.security.AccessControlContext;
/*     */ import java.security.AccessController;
/*     */ import java.util.Objects;
/*     */ import javafx.beans.InvalidationListener;
/*     */ import javafx.beans.property.ObjectProperty;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class JavaBeanObjectProperty<T>
/*     */   extends ObjectProperty<T>
/*     */   implements JavaBeanProperty<T>
/*     */ {
/*     */   private final PropertyDescriptor<T> descriptor;
/*     */   private final PropertyDescriptor<T>.Listener listener;
/*  98 */   private ObservableValue<? extends T> observable = null;
/*  99 */   private ExpressionHelper<T> helper = null;
/*     */ 
/*     */   
/* 102 */   private final AccessControlContext acc = AccessController.getContext();
/*     */   
/*     */   JavaBeanObjectProperty(PropertyDescriptor<T> paramPropertyDescriptor, Object paramObject) {
/* 105 */     this.descriptor = paramPropertyDescriptor;
/* 106 */     Objects.requireNonNull(paramPropertyDescriptor); this.listener = new PropertyDescriptor.Listener(paramPropertyDescriptor, paramObject, this);
/* 107 */     paramPropertyDescriptor.addListener((ReadOnlyPropertyDescriptor.ReadOnlyListener)this.listener);
/* 108 */     Disposer.addRecord(this, new DescriptorListenerCleaner<>((ReadOnlyPropertyDescriptor<T>)paramPropertyDescriptor, (ReadOnlyPropertyDescriptor<T>.ReadOnlyListener)this.listener));
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
/*     */   public T get() {
/* 121 */     return AccessController.doPrivileged(() -> {
/*     */           try {
/*     */             return MethodHelper.invoke(this.descriptor.getGetter(), getBean(), (Object[])null);
/* 124 */           } catch (IllegalAccessException illegalAccessException) {
/*     */             throw new UndeclaredThrowableException(illegalAccessException);
/* 126 */           } catch (InvocationTargetException invocationTargetException) {
/*     */             throw new UndeclaredThrowableException(invocationTargetException);
/*     */           } 
/*     */         }this.acc);
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
/*     */   public void set(T paramT) {
/* 142 */     if (isBound()) {
/* 143 */       throw new RuntimeException("A bound value cannot be set.");
/*     */     }
/*     */     
/* 146 */     AccessController.doPrivileged(() -> {
/*     */           try {
/*     */             MethodHelper.invoke(this.descriptor.getSetter(), getBean(), new Object[] { paramObject });
/*     */             ExpressionHelper.fireValueChangedEvent(this.helper);
/* 150 */           } catch (IllegalAccessException illegalAccessException) {
/*     */             throw new UndeclaredThrowableException(illegalAccessException);
/* 152 */           } catch (InvocationTargetException invocationTargetException) {
/*     */             throw new UndeclaredThrowableException(invocationTargetException);
/*     */           } 
/*     */           return null;
/*     */         }this.acc);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bind(ObservableValue<? extends T> paramObservableValue) {
/* 165 */     if (paramObservableValue == null) {
/* 166 */       throw new NullPointerException("Cannot bind to null");
/*     */     }
/*     */     
/* 169 */     if (!paramObservableValue.equals(this.observable)) {
/* 170 */       unbind();
/* 171 */       set((T)paramObservableValue.getValue());
/* 172 */       this.observable = paramObservableValue;
/* 173 */       this.observable.addListener((ChangeListener)this.listener);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbind() {
/* 182 */     if (this.observable != null) {
/* 183 */       this.observable.removeListener((ChangeListener)this.listener);
/* 184 */       this.observable = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBound() {
/* 193 */     return (this.observable != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 201 */     return this.listener.getBean();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 209 */     return this.descriptor.getName();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super T> paramChangeListener) {
/* 217 */     this.helper = ExpressionHelper.addListener(this.helper, (ObservableValue)this, paramChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super T> paramChangeListener) {
/* 225 */     this.helper = ExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/* 233 */     this.helper = ExpressionHelper.addListener(this.helper, (ObservableValue)this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 241 */     this.helper = ExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void fireValueChangedEvent() {
/* 249 */     ExpressionHelper.fireValueChangedEvent(this.helper);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 257 */     this.descriptor.removeListener((ReadOnlyPropertyDescriptor.ReadOnlyListener)this.listener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 267 */     Object object = getBean();
/* 268 */     String str = getName();
/* 269 */     StringBuilder stringBuilder = new StringBuilder("ObjectProperty [");
/* 270 */     if (object != null) {
/* 271 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 273 */     if (str != null && !str.equals("")) {
/* 274 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 276 */     if (isBound()) {
/* 277 */       stringBuilder.append("bound, ");
/*     */     }
/* 279 */     stringBuilder.append("value: ").append(get());
/* 280 */     stringBuilder.append("]");
/* 281 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\JavaBeanObjectProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */