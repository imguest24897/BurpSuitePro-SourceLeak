/*     */ package javafx.beans.property.adapter;
/*     */ 
/*     */ import com.sun.javafx.property.MethodHelper;
/*     */ import com.sun.javafx.property.adapter.Disposer;
/*     */ import com.sun.javafx.property.adapter.ReadOnlyPropertyDescriptor;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.UndeclaredThrowableException;
/*     */ import java.security.AccessControlContext;
/*     */ import java.security.AccessController;
/*     */ import java.util.Objects;
/*     */ import javafx.beans.property.ReadOnlyDoublePropertyBase;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ReadOnlyJavaBeanDoubleProperty
/*     */   extends ReadOnlyDoublePropertyBase
/*     */   implements ReadOnlyJavaBeanProperty<Number>
/*     */ {
/*     */   private final ReadOnlyPropertyDescriptor<Number> descriptor;
/*     */   private final ReadOnlyPropertyDescriptor<Number>.ReadOnlyListener listener;
/*  89 */   private final AccessControlContext acc = AccessController.getContext();
/*     */   
/*     */   ReadOnlyJavaBeanDoubleProperty(ReadOnlyPropertyDescriptor<Number> paramReadOnlyPropertyDescriptor, Object paramObject) {
/*  92 */     this.descriptor = paramReadOnlyPropertyDescriptor;
/*  93 */     Objects.requireNonNull(paramReadOnlyPropertyDescriptor); this.listener = new ReadOnlyPropertyDescriptor.ReadOnlyListener(paramReadOnlyPropertyDescriptor, paramObject, this);
/*  94 */     paramReadOnlyPropertyDescriptor.addListener(this.listener);
/*  95 */     Disposer.addRecord(this, new DescriptorListenerCleaner<>(paramReadOnlyPropertyDescriptor, this.listener));
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
/* 108 */     return ((Double)AccessController.<Double>doPrivileged(() -> {
/*     */           
/*     */           try {
/*     */             return Double.valueOf(((Number)MethodHelper.invoke(this.descriptor.getGetter(), getBean(), (Object[])null)).doubleValue());
/* 112 */           } catch (IllegalAccessException illegalAccessException) {
/*     */             throw new UndeclaredThrowableException(illegalAccessException);
/* 114 */           } catch (InvocationTargetException invocationTargetException) {
/*     */             throw new UndeclaredThrowableException(invocationTargetException);
/*     */           } 
/*     */         }this.acc)).doubleValue();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 125 */     return this.listener.getBean();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 133 */     return this.descriptor.getName();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void fireValueChangedEvent() {
/* 141 */     super.fireValueChangedEvent();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 149 */     this.descriptor.removeListener(this.listener);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\ReadOnlyJavaBeanDoubleProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */