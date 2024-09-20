/*     */ package com.sun.javafx.property.adapter;
/*     */ 
/*     */ import com.sun.javafx.reflect.ReflectUtil;
/*     */ import java.lang.reflect.Method;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JavaBeanPropertyBuilderHelper<T>
/*     */ {
/*     */   private static final String IS_PREFIX = "is";
/*     */   private static final String GET_PREFIX = "get";
/*     */   private static final String SET_PREFIX = "set";
/*     */   private String propertyName;
/*     */   private Class<?> beanClass;
/*     */   private Object bean;
/*     */   private String getterName;
/*     */   private String setterName;
/*     */   private Method getter;
/*     */   private Method setter;
/*     */   private PropertyDescriptor<T> descriptor;
/*     */   
/*     */   public void name(String paramString) {
/*  49 */     if ((paramString == null) ? (this.propertyName != null) : !paramString.equals(this.propertyName)) {
/*  50 */       this.propertyName = paramString;
/*  51 */       this.descriptor = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void beanClass(Class<?> paramClass) {
/*  56 */     if ((paramClass == null) ? (this.beanClass != null) : !paramClass.equals(this.beanClass)) {
/*  57 */       ReflectUtil.checkPackageAccess(paramClass);
/*  58 */       this.beanClass = paramClass;
/*  59 */       this.descriptor = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void bean(Object paramObject) {
/*  64 */     this.bean = paramObject;
/*  65 */     if (paramObject != null) {
/*  66 */       Class<?> clazz = paramObject.getClass();
/*  67 */       if (this.beanClass == null || !this.beanClass.isAssignableFrom(clazz)) {
/*  68 */         ReflectUtil.checkPackageAccess(clazz);
/*  69 */         this.beanClass = clazz;
/*  70 */         this.descriptor = null;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public Object getBean() {
/*  76 */     return this.bean;
/*     */   }
/*     */   
/*     */   public void getterName(String paramString) {
/*  80 */     if ((paramString == null) ? (this.getterName != null) : !paramString.equals(this.getterName)) {
/*  81 */       this.getterName = paramString;
/*  82 */       this.descriptor = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void setterName(String paramString) {
/*  87 */     if ((paramString == null) ? (this.setterName != null) : !paramString.equals(this.setterName)) {
/*  88 */       this.setterName = paramString;
/*  89 */       this.descriptor = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void getter(Method paramMethod) {
/*  94 */     if ((paramMethod == null) ? (this.getter != null) : !paramMethod.equals(this.getter)) {
/*  95 */       this.getter = paramMethod;
/*  96 */       this.descriptor = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void setter(Method paramMethod) {
/* 101 */     if ((paramMethod == null) ? (this.setter != null) : !paramMethod.equals(this.setter)) {
/* 102 */       this.setter = paramMethod;
/* 103 */       this.descriptor = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public PropertyDescriptor<T> getDescriptor() throws NoSuchMethodException {
/* 108 */     if (this.descriptor == null) {
/* 109 */       if (this.propertyName == null) {
/* 110 */         throw new NullPointerException("Property name has to be specified");
/*     */       }
/* 112 */       if (this.propertyName.isEmpty()) {
/* 113 */         throw new IllegalArgumentException("Property name cannot be empty");
/*     */       }
/* 115 */       String str = ReadOnlyPropertyDescriptor.capitalizedName(this.propertyName);
/* 116 */       Method method1 = this.getter;
/* 117 */       if (method1 == null) {
/* 118 */         if (this.getterName != null && !this.getterName.isEmpty()) {
/* 119 */           method1 = this.beanClass.getMethod(this.getterName, new Class[0]);
/*     */         } else {
/*     */           try {
/* 122 */             method1 = this.beanClass.getMethod("is" + str, new Class[0]);
/* 123 */           } catch (NoSuchMethodException noSuchMethodException) {
/* 124 */             method1 = this.beanClass.getMethod("get" + str, new Class[0]);
/*     */           } 
/*     */         } 
/*     */       }
/* 128 */       Method method2 = this.setter;
/* 129 */       if (method2 == null) {
/* 130 */         Class<?> clazz = method1.getReturnType();
/* 131 */         if (this.setterName != null && !this.setterName.isEmpty()) {
/* 132 */           method2 = this.beanClass.getMethod(this.setterName, new Class[] { clazz });
/*     */         } else {
/* 134 */           method2 = this.beanClass.getMethod("set" + str, new Class[] { clazz });
/*     */         } 
/*     */       } 
/* 137 */       this.descriptor = new PropertyDescriptor<>(this.propertyName, this.beanClass, method1, method2);
/*     */     } 
/* 139 */     return this.descriptor;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\property\adapter\JavaBeanPropertyBuilderHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */