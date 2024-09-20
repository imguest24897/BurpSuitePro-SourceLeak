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
/*     */ import javafx.beans.property.ReadOnlyStringPropertyBase;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ReadOnlyJavaBeanStringProperty
/*     */   extends ReadOnlyStringPropertyBase
/*     */   implements ReadOnlyJavaBeanProperty<String>
/*     */ {
/*     */   private final ReadOnlyPropertyDescriptor<String> descriptor;
/*     */   private final ReadOnlyPropertyDescriptor<String>.ReadOnlyListener listener;
/*  89 */   private final AccessControlContext acc = AccessController.getContext();
/*     */   
/*     */   ReadOnlyJavaBeanStringProperty(ReadOnlyPropertyDescriptor<String> paramReadOnlyPropertyDescriptor, Object paramObject) {
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
/*     */   public String get() {
/* 108 */     return AccessController.<String>doPrivileged(() -> {
/*     */           try {
/*     */             return (String)MethodHelper.invoke(this.descriptor.getGetter(), getBean(), (Object[])null);
/* 111 */           } catch (IllegalAccessException illegalAccessException) {
/*     */             throw new UndeclaredThrowableException(illegalAccessException);
/* 113 */           } catch (InvocationTargetException invocationTargetException) {
/*     */             throw new UndeclaredThrowableException(invocationTargetException);
/*     */           } 
/*     */         }this.acc);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getBean() {
/* 124 */     return this.listener.getBean();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getName() {
/* 132 */     return this.descriptor.getName();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void fireValueChangedEvent() {
/* 140 */     super.fireValueChangedEvent();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispose() {
/* 148 */     this.descriptor.removeListener(this.listener);
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\adapter\ReadOnlyJavaBeanStringProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */