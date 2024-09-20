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
/*     */ import javafx.beans.property.DoubleProperty;
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
/*     */ public final class JavaBeanDoubleProperty
/*     */   extends DoubleProperty
/*     */   implements JavaBeanProperty<Number>
/*     */ {
/*     */   private final PropertyDescriptor<Number> descriptor;
/*     */   private final PropertyDescriptor<Number>.Listener listener;
/*  96 */   private ObservableValue<? extends Number> observable = null;
/*  97 */   private ExpressionHelper<Number> helper = null;
/*     */ 
/*     */   
/* 100 */   private final AccessControlContext acc = AccessController.getContext();
/*     */   
/*     */   JavaBeanDoubleProperty(PropertyDescriptor<Number> paramPropertyDescriptor, Object paramObject) {
/* 103 */     this.descriptor = paramPropertyDescriptor;
/* 104 */     Objects.requireNonNull(paramPropertyDescriptor); this.listener = new PropertyDescriptor.Listener(paramPropertyDescriptor, paramObject, this);
/* 105 */     paramPropertyDescriptor.addListener((ReadOnlyPropertyDescriptor.ReadOnlyListener)this.listener);
/* 106 */     Disposer.addRecord(this, new DescriptorListenerCleaner<>((ReadOnlyPropertyDescriptor<Number>)paramPropertyDescriptor, (ReadOnlyPropertyDescriptor<Number>.ReadOnlyListener)this.listener));
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
/*     */   public double get() {
/* 119 */     return ((Double)AccessController.<Double>doPrivileged(() -> {
/*     */           
/*     */           try {
/*     */             return Double.valueOf(((Number)MethodHelper.invoke(this.descriptor.getGetter(), getBean(), (Object[])null)).doubleValue());
/* 123 */           } catch (IllegalAccessException illegalAccessException) {
/*     */             throw new UndeclaredThrowableException(illegalAccessException);
/* 125 */           } catch (InvocationTargetException invocationTargetException) {
/*     */             throw new UndeclaredThrowableException(invocationTargetException);
/*     */           } 
/*     */         }this.acc)).doubleValue();
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
/*     */   public void set(double paramDouble) {
/* 141 */     if (isBound()) {
/* 142 */       throw new RuntimeException("A bound value cannot be set.");
/*     */     }
/*     */     
/* 145 */     AccessController.doPrivileged(() -> {
/*     */           try {
/*     */             MethodHelper.invoke(this.descriptor.getSetter(), getBean(), new Object[] { Double.valueOf(paramDouble) });
/*     */             ExpressionHelper.fireValueChangedEvent(this.helper);
/* 149 */           } catch (IllegalAccessException illegalAccessException) {
/*     */             throw new UndeclaredThrowableException(illegalAccessException);
/* 151 */           } catch (InvocationTargetException invocationTargetException) {
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
/*     */   public void bind(ObservableValue<? extends Number> paramObservableValue) {
/* 163 */     if (paramObservableValue == null) {
/* 164 */       throw new NullPointerException("Cannot bind to null");
/*     */     }
/*     */     
/* 167 */     if (!paramObservableValue.equals(this.observable)) {
/* 168 */       unbind();
/* 169 */       set(((Number)paramObservableValue.getValue()).doubleValue());
/* 170 */       this.observable = paramObservableValue;
/* 171 */       this.observable.addListener((ChangeListener)this.listener);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbind() {
/* 180 */     if (this.observable != null) {
/* 181 */       this.observable.removeListener((ChangeListener)this.listener);
/* 182 */       this.observable = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBound() {
/* 191 */     return (this.observable != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 199 */     return this.listener.getBean();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 207 */     return this.descriptor.getName();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super Number> paramChangeListener) {
/* 215 */     this.helper = ExpressionHelper.addListener(this.helper, (ObservableValue)this, paramChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super Number> paramChangeListener) {
/* 223 */     this.helper = ExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/* 231 */     this.helper = ExpressionHelper.addListener(this.helper, (ObservableValue)this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 239 */     this.helper = ExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void fireValueChangedEvent() {
/* 247 */     ExpressionHelper.fireValueChangedEvent(this.helper);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 255 */     this.descriptor.removeListener((ReadOnlyPropertyDescriptor.ReadOnlyListener)this.listener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 265 */     Object object = getBean();
/* 266 */     String str = getName();
/* 267 */     StringBuilder stringBuilder = new StringBuilder("DoubleProperty [");
/* 268 */     if (object != null) {
/* 269 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 271 */     if (str != null && !str.equals("")) {
/* 272 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 274 */     if (isBound()) {
/* 275 */       stringBuilder.append("bound, ");
/*     */     }
/* 277 */     stringBuilder.append("value: ").append(get());
/* 278 */     stringBuilder.append("]");
/* 279 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\JavaBeanDoubleProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */