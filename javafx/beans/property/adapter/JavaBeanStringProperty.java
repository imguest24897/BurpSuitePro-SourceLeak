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
/*     */ import javafx.beans.property.StringProperty;
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
/*     */ public final class JavaBeanStringProperty
/*     */   extends StringProperty
/*     */   implements JavaBeanProperty<String>
/*     */ {
/*     */   private final PropertyDescriptor<String> descriptor;
/*     */   private final PropertyDescriptor<String>.Listener listener;
/*  96 */   private ObservableValue<? extends String> observable = null;
/*  97 */   private ExpressionHelper<String> helper = null;
/*     */ 
/*     */   
/* 100 */   private final AccessControlContext acc = AccessController.getContext();
/*     */   
/*     */   JavaBeanStringProperty(PropertyDescriptor<String> paramPropertyDescriptor, Object paramObject) {
/* 103 */     this.descriptor = paramPropertyDescriptor;
/* 104 */     Objects.requireNonNull(paramPropertyDescriptor); this.listener = new PropertyDescriptor.Listener(paramPropertyDescriptor, paramObject, this);
/* 105 */     paramPropertyDescriptor.addListener((ReadOnlyPropertyDescriptor.ReadOnlyListener)this.listener);
/* 106 */     Disposer.addRecord(this, new DescriptorListenerCleaner<>((ReadOnlyPropertyDescriptor<String>)paramPropertyDescriptor, (ReadOnlyPropertyDescriptor<String>.ReadOnlyListener)this.listener));
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
/*     */   public String get() {
/* 119 */     return AccessController.<String>doPrivileged(() -> {
/*     */           try {
/*     */             return (String)MethodHelper.invoke(this.descriptor.getGetter(), getBean(), (Object[])null);
/* 122 */           } catch (IllegalAccessException illegalAccessException) {
/*     */             throw new UndeclaredThrowableException(illegalAccessException);
/* 124 */           } catch (InvocationTargetException invocationTargetException) {
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
/*     */   public void set(String paramString) {
/* 140 */     if (isBound()) {
/* 141 */       throw new RuntimeException("A bound value cannot be set.");
/*     */     }
/* 143 */     AccessController.doPrivileged(() -> {
/*     */           try {
/*     */             MethodHelper.invoke(this.descriptor.getSetter(), getBean(), new Object[] { paramString });
/*     */             ExpressionHelper.fireValueChangedEvent(this.helper);
/* 147 */           } catch (IllegalAccessException illegalAccessException) {
/*     */             throw new UndeclaredThrowableException(illegalAccessException);
/* 149 */           } catch (InvocationTargetException invocationTargetException) {
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
/*     */   public void bind(ObservableValue<? extends String> paramObservableValue) {
/* 161 */     if (paramObservableValue == null) {
/* 162 */       throw new NullPointerException("Cannot bind to null");
/*     */     }
/*     */     
/* 165 */     if (!paramObservableValue.equals(this.observable)) {
/* 166 */       unbind();
/* 167 */       set((String)paramObservableValue.getValue());
/* 168 */       this.observable = paramObservableValue;
/* 169 */       this.observable.addListener((ChangeListener)this.listener);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbind() {
/* 178 */     if (this.observable != null) {
/* 179 */       this.observable.removeListener((ChangeListener)this.listener);
/* 180 */       this.observable = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isBound() {
/* 189 */     return (this.observable != null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 197 */     return this.listener.getBean();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 205 */     return this.descriptor.getName();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(ChangeListener<? super String> paramChangeListener) {
/* 213 */     this.helper = ExpressionHelper.addListener(this.helper, (ObservableValue)this, paramChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(ChangeListener<? super String> paramChangeListener) {
/* 221 */     this.helper = ExpressionHelper.removeListener(this.helper, paramChangeListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addListener(InvalidationListener paramInvalidationListener) {
/* 229 */     this.helper = ExpressionHelper.addListener(this.helper, (ObservableValue)this, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(InvalidationListener paramInvalidationListener) {
/* 237 */     this.helper = ExpressionHelper.removeListener(this.helper, paramInvalidationListener);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void fireValueChangedEvent() {
/* 245 */     ExpressionHelper.fireValueChangedEvent(this.helper);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 253 */     this.descriptor.removeListener((ReadOnlyPropertyDescriptor.ReadOnlyListener)this.listener);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\JavaBeanStringProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */