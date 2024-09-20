/*     */ package com.sun.javafx.property.adapter;
/*     */ 
/*     */ import com.sun.javafx.property.MethodHelper;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyVetoException;
/*     */ import java.beans.VetoableChangeListener;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import javafx.beans.property.Property;
/*     */ import javafx.beans.property.adapter.ReadOnlyJavaBeanProperty;
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
/*     */ public class PropertyDescriptor<T>
/*     */   extends ReadOnlyPropertyDescriptor<T>
/*     */ {
/*     */   private static final String ADD_VETOABLE_LISTENER_METHOD_NAME = "addVetoableChangeListener";
/*     */   private static final String REMOVE_VETOABLE_LISTENER_METHOD_NAME = "removeVetoableChangeListener";
/*     */   private static final String ADD_PREFIX = "add";
/*     */   private static final String REMOVE_PREFIX = "remove";
/*     */   private static final String SUFFIX = "Listener";
/*     */   private static final int ADD_VETOABLE_LISTENER_TAKES_NAME = 1;
/*     */   private static final int REMOVE_VETOABLE_LISTENER_TAKES_NAME = 2;
/*     */   private final Method setter;
/*     */   private final Method addVetoListener;
/*     */   private final Method removeVetoListener;
/*     */   private final int flags;
/*     */   
/*     */   public Method getSetter() {
/*  58 */     return this.setter;
/*     */   }
/*     */   public PropertyDescriptor(String paramString, Class<?> paramClass, Method paramMethod1, Method paramMethod2) {
/*  61 */     super(paramString, paramClass, paramMethod1);
/*  62 */     this.setter = paramMethod2;
/*     */     
/*  64 */     Method method1 = null;
/*  65 */     Method method2 = null;
/*  66 */     int i = 0;
/*     */ 
/*     */     
/*  69 */     String str1 = "add" + capitalizedName(this.name) + "Listener";
/*     */     try {
/*  71 */       method1 = paramClass.getMethod(str1, new Class[] { VetoableChangeListener.class });
/*  72 */     } catch (NoSuchMethodException noSuchMethodException) {
/*     */       try {
/*  74 */         method1 = paramClass.getMethod("addVetoableChangeListener", new Class[] { String.class, VetoableChangeListener.class });
/*  75 */         i |= 0x1;
/*  76 */       } catch (NoSuchMethodException noSuchMethodException1) {
/*     */         try {
/*  78 */           method1 = paramClass.getMethod("addVetoableChangeListener", new Class[] { VetoableChangeListener.class });
/*  79 */         } catch (NoSuchMethodException noSuchMethodException2) {}
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  86 */     String str2 = "remove" + capitalizedName(this.name) + "Listener";
/*     */     try {
/*  88 */       method2 = paramClass.getMethod(str2, new Class[] { VetoableChangeListener.class });
/*  89 */     } catch (NoSuchMethodException noSuchMethodException) {
/*     */       try {
/*  91 */         method2 = paramClass.getMethod("removeVetoableChangeListener", new Class[] { String.class, VetoableChangeListener.class });
/*  92 */         i |= 0x2;
/*  93 */       } catch (NoSuchMethodException noSuchMethodException1) {
/*     */         try {
/*  95 */           method2 = paramClass.getMethod("removeVetoableChangeListener", new Class[] { VetoableChangeListener.class });
/*  96 */         } catch (NoSuchMethodException noSuchMethodException2) {}
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 102 */     this.addVetoListener = method1;
/* 103 */     this.removeVetoListener = method2;
/* 104 */     this.flags = i;
/*     */   }
/*     */ 
/*     */   
/*     */   public void addListener(ReadOnlyPropertyDescriptor<T>.ReadOnlyListener paramReadOnlyListener) {
/* 109 */     super.addListener(paramReadOnlyListener);
/* 110 */     if (this.addVetoListener != null) {
/*     */       try {
/* 112 */         if ((this.flags & 0x1) > 0) {
/* 113 */           this.addVetoListener.invoke(paramReadOnlyListener.getBean(), new Object[] { this.name, paramReadOnlyListener });
/*     */         } else {
/* 115 */           this.addVetoListener.invoke(paramReadOnlyListener.getBean(), new Object[] { paramReadOnlyListener });
/*     */         } 
/* 117 */       } catch (IllegalAccessException illegalAccessException) {
/*     */       
/* 119 */       } catch (InvocationTargetException invocationTargetException) {}
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(ReadOnlyPropertyDescriptor<T>.ReadOnlyListener paramReadOnlyListener) {
/* 129 */     super.removeListener(paramReadOnlyListener);
/* 130 */     if (this.removeVetoListener != null) {
/*     */       try {
/* 132 */         if ((this.flags & 0x2) > 0) {
/* 133 */           this.removeVetoListener.invoke(paramReadOnlyListener.getBean(), new Object[] { this.name, paramReadOnlyListener });
/*     */         } else {
/* 135 */           this.removeVetoListener.invoke(paramReadOnlyListener.getBean(), new Object[] { paramReadOnlyListener });
/*     */         } 
/* 137 */       } catch (IllegalAccessException illegalAccessException) {
/*     */       
/* 139 */       } catch (InvocationTargetException invocationTargetException) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public class Listener
/*     */     extends ReadOnlyPropertyDescriptor<T>.ReadOnlyListener
/*     */     implements ChangeListener<T>, VetoableChangeListener
/*     */   {
/*     */     private boolean updating;
/*     */     
/*     */     public Listener(Object param1Object, ReadOnlyJavaBeanProperty<T> param1ReadOnlyJavaBeanProperty) {
/* 150 */       super(param1Object, param1ReadOnlyJavaBeanProperty);
/*     */     }
/*     */ 
/*     */     
/*     */     public void changed(ObservableValue<? extends T> param1ObservableValue, T param1T1, T param1T2) {
/* 155 */       ReadOnlyJavaBeanProperty<T> readOnlyJavaBeanProperty = checkRef();
/* 156 */       if (readOnlyJavaBeanProperty == null) {
/* 157 */         param1ObservableValue.removeListener(this);
/* 158 */       } else if (!this.updating) {
/* 159 */         this.updating = true;
/*     */         try {
/* 161 */           MethodHelper.invoke(PropertyDescriptor.this.setter, this.bean, new Object[] { param1T2 });
/* 162 */           readOnlyJavaBeanProperty.fireValueChangedEvent();
/* 163 */         } catch (IllegalAccessException illegalAccessException) {
/*     */         
/* 165 */         } catch (InvocationTargetException invocationTargetException) {
/*     */         
/*     */         } finally {
/* 168 */           this.updating = false;
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public void vetoableChange(PropertyChangeEvent param1PropertyChangeEvent) throws PropertyVetoException {
/* 175 */       if (this.bean.equals(param1PropertyChangeEvent.getSource()) && PropertyDescriptor.this.name.equals(param1PropertyChangeEvent.getPropertyName())) {
/* 176 */         ReadOnlyJavaBeanProperty<T> readOnlyJavaBeanProperty = checkRef(); if (readOnlyJavaBeanProperty instanceof Property) { Property property = (Property)readOnlyJavaBeanProperty; if (property.isBound() && !this.updating)
/* 177 */             throw new PropertyVetoException("A bound value cannot be set.", param1PropertyChangeEvent);  }
/*     */       
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\property\adapter\PropertyDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */