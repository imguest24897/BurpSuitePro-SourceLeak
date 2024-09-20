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
/*     */ public class ReadOnlyJavaBeanPropertyBuilderHelper<T>
/*     */ {
/*     */   private static final String IS_PREFIX = "is";
/*     */   private static final String GET_PREFIX = "get";
/*     */   private String propertyName;
/*     */   private Class<?> beanClass;
/*     */   private Object bean;
/*     */   private String getterName;
/*     */   private Method getter;
/*     */   private ReadOnlyPropertyDescriptor<T> descriptor;
/*     */   
/*     */   public void name(String paramString) {
/*  46 */     if ((paramString == null) ? (this.propertyName != null) : !paramString.equals(this.propertyName)) {
/*  47 */       this.propertyName = paramString;
/*  48 */       this.descriptor = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void beanClass(Class<?> paramClass) {
/*  53 */     if ((paramClass == null) ? (this.beanClass != null) : !paramClass.equals(this.beanClass)) {
/*  54 */       ReflectUtil.checkPackageAccess(paramClass);
/*  55 */       this.beanClass = paramClass;
/*  56 */       this.descriptor = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void bean(Object paramObject) {
/*  61 */     this.bean = paramObject;
/*  62 */     if (paramObject != null) {
/*  63 */       Class<?> clazz = paramObject.getClass();
/*  64 */       if (this.beanClass == null || !this.beanClass.isAssignableFrom(clazz)) {
/*  65 */         ReflectUtil.checkPackageAccess(clazz);
/*  66 */         this.beanClass = paramObject.getClass();
/*  67 */         this.descriptor = null;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public Object getBean() {
/*  73 */     return this.bean;
/*     */   }
/*     */   
/*     */   public void getterName(String paramString) {
/*  77 */     if ((paramString == null) ? (this.getterName != null) : !paramString.equals(this.getterName)) {
/*  78 */       this.getterName = paramString;
/*  79 */       this.descriptor = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void getter(Method paramMethod) {
/*  84 */     if ((paramMethod == null) ? (this.getter != null) : !paramMethod.equals(this.getter)) {
/*  85 */       this.getter = paramMethod;
/*  86 */       this.descriptor = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public ReadOnlyPropertyDescriptor<T> getDescriptor() throws NoSuchMethodException {
/*  91 */     if (this.descriptor == null) {
/*  92 */       if (this.propertyName == null || this.bean == null) {
/*  93 */         throw new NullPointerException("Bean and property name have to be specified");
/*     */       }
/*  95 */       if (this.propertyName.isEmpty()) {
/*  96 */         throw new IllegalArgumentException("Property name cannot be empty");
/*     */       }
/*  98 */       String str = ReadOnlyPropertyDescriptor.capitalizedName(this.propertyName);
/*  99 */       if (this.getter == null) {
/* 100 */         if (this.getterName != null && !this.getterName.isEmpty()) {
/* 101 */           this.getter = this.beanClass.getMethod(this.getterName, new Class[0]);
/*     */         } else {
/*     */           try {
/* 104 */             this.getter = this.beanClass.getMethod("is" + str, new Class[0]);
/* 105 */           } catch (NoSuchMethodException noSuchMethodException) {
/* 106 */             this.getter = this.beanClass.getMethod("get" + str, new Class[0]);
/*     */           } 
/*     */         } 
/*     */       }
/* 110 */       this.descriptor = new ReadOnlyPropertyDescriptor<>(this.propertyName, this.beanClass, this.getter);
/*     */     } 
/* 112 */     return this.descriptor;
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\property\adapter\ReadOnlyJavaBeanPropertyBuilderHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */