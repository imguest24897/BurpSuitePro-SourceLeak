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
/*     */ import javafx.beans.property.BooleanProperty;
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
/*     */ public final class JavaBeanBooleanProperty
/*     */   extends BooleanProperty
/*     */   implements JavaBeanProperty<Boolean>
/*     */ {
/*     */   private final PropertyDescriptor<Boolean> descriptor;
/*     */   private final PropertyDescriptor<Boolean>.Listener listener;
/*  96 */   private ObservableValue<? extends Boolean> observable = null;
/*  97 */   private ExpressionHelper<Boolean> helper = null;
/*     */ 
/*     */   
/* 100 */   private final AccessControlContext acc = AccessController.getContext();
/*     */   
/*     */   JavaBeanBooleanProperty(PropertyDescriptor<Boolean> paramPropertyDescriptor, Object paramObject) {
/* 103 */     this.descriptor = paramPropertyDescriptor;
/* 104 */     Objects.requireNonNull(paramPropertyDescriptor); this.listener = new PropertyDescriptor.Listener(paramPropertyDescriptor, paramObject, this);
/* 105 */     paramPropertyDescriptor.addListener((ReadOnlyPropertyDescriptor.ReadOnlyListener)this.listener);
/* 106 */     Disposer.addRecord(this, new DescriptorListenerCleaner<>((ReadOnlyPropertyDescriptor<Boolean>)paramPropertyDescriptor, (ReadOnlyPropertyDescriptor<Boolean>.ReadOnlyListener)this.listener));
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
/*     */   public boolean get() {
/* 119 */     return ((Boolean)AccessController.<Boolean>doPrivileged(() -> {
/*     */           try {
/*     */             return (Boolean)MethodHelper.invoke(this.descriptor.getGetter(), getBean(), (Object[])null);
/* 122 */           } catch (IllegalAccessException illegalAccessException) {
/*     */             throw new UndeclaredThrowableException(illegalAccessException);
/* 124 */           } catch (InvocationTargetException invocationTargetException) {
/*     */             throw new UndeclaredThrowableException(invocationTargetException);
/*     */           } 
/*     */         }this.acc)).booleanValue();
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
/*     */   public void set(boolean paramBoolean) {
/* 140 */     if (isBound()) {
/* 141 */       throw new RuntimeException("A bound value cannot be set.");
/*     */     }
/*     */     
/* 144 */     AccessController.doPrivileged(() -> {
/*     */           try {
/*     */             MethodHelper.invoke(this.descriptor.getSetter(), getBean(), new Object[] { Boolean.valueOf(paramBoolean) });
/*     */             ExpressionHelper.fireValueChangedEvent(this.helper);
/* 148 */           } catch (IllegalAccessException illegalAccessException) {
/*     */             throw new UndeclaredThrowableException(illegalAccessException);
/* 150 */           } catch (InvocationTargetException invocationTargetException) {
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
/*     */   public void bind(ObservableValue<? extends Boolean> paramObservableValue) {
/* 162 */     if (paramObservableValue == null) {
/* 163 */       throw new NullPointerException("Cannot bind to null");
/*     */     }
/*     */     
/* 166 */     if (!paramObservableValue.equals(this.observable)) {
/* 167 */       unbind();
/* 168 */       set(((Boolean)paramObservableValue.getValue()).booleanValue());
/* 169 */       this.observable = paramObservableValue;
/* 170 */       this.observable.addListener((ChangeListener)this.listener);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbind() {
/* 179 */     if (this.observable != null) {
/* 180 */       this.observable.removeListener((ChangeListener)this.listener);
/* 181 */       this.observable = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBound() {
/* 190 */     return (this.observable != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 198 */     return this.listener.getBean();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 206 */     return this.descriptor.getName();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super Boolean> paramChangeListener) {
/* 214 */     this.helper = ExpressionHelper.addListener(this.helper, (ObservableValue)this, paramChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super Boolean> paramChangeListener) {
/* 222 */     this.helper = ExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/* 230 */     this.helper = ExpressionHelper.addListener(this.helper, (ObservableValue)this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 238 */     this.helper = ExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void fireValueChangedEvent() {
/* 246 */     ExpressionHelper.fireValueChangedEvent(this.helper);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 254 */     this.descriptor.removeListener((ReadOnlyPropertyDescriptor.ReadOnlyListener)this.listener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 264 */     Object object = getBean();
/* 265 */     String str = getName();
/* 266 */     StringBuilder stringBuilder = new StringBuilder("BooleanProperty [");
/* 267 */     if (object != null) {
/* 268 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 270 */     if (str != null && !str.equals("")) {
/* 271 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 273 */     if (isBound()) {
/* 274 */       stringBuilder.append("bound, ");
/*     */     }
/* 276 */     stringBuilder.append("value: ").append(get());
/* 277 */     stringBuilder.append("]");
/* 278 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\JavaBeanBooleanProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */