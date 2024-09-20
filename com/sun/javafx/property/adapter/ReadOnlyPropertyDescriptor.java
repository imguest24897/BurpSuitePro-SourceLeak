/*     */ package com.sun.javafx.property.adapter;
/*     */ 
/*     */ import com.sun.javafx.reflect.ReflectUtil;
/*     */ import java.beans.PropertyChangeEvent;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import java.lang.ref.WeakReference;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.Locale;
/*     */ import javafx.beans.WeakListener;
/*     */ import javafx.beans.property.adapter.ReadOnlyJavaBeanProperty;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ReadOnlyPropertyDescriptor<T>
/*     */ {
/*     */   private static final String ADD_LISTENER_METHOD_NAME = "addPropertyChangeListener";
/*     */   private static final String REMOVE_LISTENER_METHOD_NAME = "removePropertyChangeListener";
/*     */   private static final String ADD_PREFIX = "add";
/*     */   private static final String REMOVE_PREFIX = "remove";
/*     */   private static final String SUFFIX = "Listener";
/*     */   private static final int ADD_LISTENER_TAKES_NAME = 1;
/*     */   private static final int REMOVE_LISTENER_TAKES_NAME = 2;
/*     */   protected final String name;
/*     */   protected final Class<?> beanClass;
/*     */   private final Method getter;
/*     */   private final Class<?> type;
/*     */   private final Method addChangeListener;
/*     */   private final Method removeChangeListener;
/*     */   private final int flags;
/*     */   
/*     */   public String getName() {
/*  63 */     return this.name;
/*  64 */   } public Method getGetter() { return this.getter; } public Class<?> getType() {
/*  65 */     return this.type;
/*     */   }
/*     */   public ReadOnlyPropertyDescriptor(String paramString, Class<?> paramClass, Method paramMethod) {
/*  68 */     ReflectUtil.checkPackageAccess(paramClass);
/*     */     
/*  70 */     this.name = paramString;
/*  71 */     this.beanClass = paramClass;
/*  72 */     this.getter = paramMethod;
/*  73 */     this.type = paramMethod.getReturnType();
/*     */     
/*  75 */     Method method1 = null;
/*  76 */     Method method2 = null;
/*  77 */     int i = 0;
/*     */     
/*     */     try {
/*  80 */       String str = "add" + capitalizedName(this.name) + "Listener";
/*  81 */       method1 = paramClass.getMethod(str, new Class[] { PropertyChangeListener.class });
/*  82 */     } catch (NoSuchMethodException noSuchMethodException) {
/*     */       try {
/*  84 */         method1 = paramClass.getMethod("addPropertyChangeListener", new Class[] { String.class, PropertyChangeListener.class });
/*  85 */         i |= 0x1;
/*  86 */       } catch (NoSuchMethodException noSuchMethodException1) {
/*     */         try {
/*  88 */           method1 = paramClass.getMethod("addPropertyChangeListener", new Class[] { PropertyChangeListener.class });
/*  89 */         } catch (NoSuchMethodException noSuchMethodException2) {}
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  96 */       String str = "remove" + capitalizedName(this.name) + "Listener";
/*  97 */       method2 = paramClass.getMethod(str, new Class[] { PropertyChangeListener.class });
/*  98 */     } catch (NoSuchMethodException noSuchMethodException) {
/*     */       try {
/* 100 */         method2 = paramClass.getMethod("removePropertyChangeListener", new Class[] { String.class, PropertyChangeListener.class });
/* 101 */         i |= 0x2;
/* 102 */       } catch (NoSuchMethodException noSuchMethodException1) {
/*     */         try {
/* 104 */           method2 = paramClass.getMethod("removePropertyChangeListener", new Class[] { PropertyChangeListener.class });
/* 105 */         } catch (NoSuchMethodException noSuchMethodException2) {}
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 111 */     this.addChangeListener = method1;
/* 112 */     this.removeChangeListener = method2;
/* 113 */     this.flags = i;
/*     */   }
/*     */   
/*     */   public static String capitalizedName(String paramString) {
/* 117 */     return (paramString == null || paramString.length() == 0) ? paramString : (paramString.substring(0, 1).toUpperCase(Locale.ENGLISH) + paramString.substring(0, 1).toUpperCase(Locale.ENGLISH));
/*     */   }
/*     */   
/*     */   public void addListener(ReadOnlyListener paramReadOnlyListener) {
/* 121 */     if (this.addChangeListener != null) {
/*     */       try {
/* 123 */         if ((this.flags & 0x1) > 0) {
/* 124 */           this.addChangeListener.invoke(paramReadOnlyListener.getBean(), new Object[] { this.name, paramReadOnlyListener });
/*     */         } else {
/* 126 */           this.addChangeListener.invoke(paramReadOnlyListener.getBean(), new Object[] { paramReadOnlyListener });
/*     */         } 
/* 128 */       } catch (IllegalAccessException illegalAccessException) {
/*     */       
/* 130 */       } catch (InvocationTargetException invocationTargetException) {}
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void removeListener(ReadOnlyListener paramReadOnlyListener) {
/* 137 */     if (this.removeChangeListener != null) {
/*     */       try {
/* 139 */         if ((this.flags & 0x2) > 0) {
/* 140 */           this.removeChangeListener.invoke(paramReadOnlyListener.getBean(), new Object[] { this.name, paramReadOnlyListener });
/*     */         } else {
/* 142 */           this.removeChangeListener.invoke(paramReadOnlyListener.getBean(), new Object[] { paramReadOnlyListener });
/*     */         } 
/* 144 */       } catch (IllegalAccessException illegalAccessException) {
/*     */       
/* 146 */       } catch (InvocationTargetException invocationTargetException) {}
/*     */     }
/*     */   }
/*     */   
/*     */   public class ReadOnlyListener
/*     */     implements PropertyChangeListener, WeakListener
/*     */   {
/*     */     protected final Object bean;
/*     */     private final WeakReference<ReadOnlyJavaBeanProperty<T>> propertyRef;
/*     */     
/*     */     public Object getBean() {
/* 157 */       return this.bean;
/*     */     }
/*     */     public ReadOnlyListener(Object param1Object, ReadOnlyJavaBeanProperty<T> param1ReadOnlyJavaBeanProperty) {
/* 160 */       this.bean = param1Object;
/* 161 */       this.propertyRef = new WeakReference<>(param1ReadOnlyJavaBeanProperty);
/*     */     }
/*     */     
/*     */     protected ReadOnlyJavaBeanProperty<T> checkRef() {
/* 165 */       ReadOnlyJavaBeanProperty<T> readOnlyJavaBeanProperty = this.propertyRef.get();
/* 166 */       if (readOnlyJavaBeanProperty == null) {
/* 167 */         ReadOnlyPropertyDescriptor.this.removeListener(this);
/*     */       }
/* 169 */       return readOnlyJavaBeanProperty;
/*     */     }
/*     */ 
/*     */     
/*     */     public void propertyChange(PropertyChangeEvent param1PropertyChangeEvent) {
/* 174 */       if (this.bean.equals(param1PropertyChangeEvent.getSource()) && ReadOnlyPropertyDescriptor.this.name.equals(param1PropertyChangeEvent.getPropertyName())) {
/* 175 */         ReadOnlyJavaBeanProperty<T> readOnlyJavaBeanProperty = checkRef();
/* 176 */         if (readOnlyJavaBeanProperty != null) {
/* 177 */           readOnlyJavaBeanProperty.fireValueChangedEvent();
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/*     */     public boolean wasGarbageCollected() {
/* 184 */       return (checkRef() == null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\property\adapter\ReadOnlyPropertyDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */