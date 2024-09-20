/*     */ package com.sun.javafx.reflect;
/*     */ 
/*     */ import java.lang.reflect.Proxy;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ReflectUtil
/*     */ {
/*     */   public static final String PROXY_PACKAGE = "com.sun.proxy";
/*     */   
/*     */   public static void checkPackageAccess(Class<?> paramClass) {
/*  45 */     SecurityManager securityManager = System.getSecurityManager();
/*  46 */     if (securityManager != null) {
/*  47 */       privateCheckPackageAccess(securityManager, paramClass);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void privateCheckPackageAccess(SecurityManager paramSecurityManager, Class<?> paramClass) {
/*  55 */     while (paramClass.isArray()) {
/*  56 */       paramClass = paramClass.getComponentType();
/*     */     }
/*     */     
/*  59 */     String str = paramClass.getPackageName();
/*  60 */     if (str != null && !str.isEmpty()) {
/*  61 */       paramSecurityManager.checkPackageAccess(str);
/*     */     }
/*     */     
/*  64 */     if (isNonPublicProxyClass(paramClass)) {
/*  65 */       privateCheckProxyPackageAccess(paramSecurityManager, paramClass);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void checkPackageAccess(String paramString) {
/*  77 */     SecurityManager securityManager = System.getSecurityManager();
/*  78 */     if (securityManager != null) {
/*  79 */       String str = paramString.replace('/', '.');
/*  80 */       if (str.startsWith("[")) {
/*  81 */         int j = str.lastIndexOf('[') + 2;
/*  82 */         if (j > 1 && j < str.length()) {
/*  83 */           str = str.substring(j);
/*     */         }
/*     */       } 
/*  86 */       int i = str.lastIndexOf('.');
/*  87 */       if (i != -1) {
/*  88 */         securityManager.checkPackageAccess(str.substring(0, i));
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static boolean isPackageAccessible(Class<?> paramClass) {
/*     */     try {
/*  95 */       checkPackageAccess(paramClass);
/*  96 */     } catch (SecurityException securityException) {
/*  97 */       return false;
/*     */     } 
/*  99 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void privateCheckProxyPackageAccess(SecurityManager paramSecurityManager, Class<?> paramClass) {
/* 107 */     if (Proxy.isProxyClass(paramClass)) {
/* 108 */       for (Class<?> clazz : paramClass.getInterfaces()) {
/* 109 */         privateCheckPackageAccess(paramSecurityManager, clazz);
/*     */       }
/*     */     }
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
/*     */   public static boolean isNonPublicProxyClass(Class<?> paramClass) {
/* 124 */     if (!Proxy.isProxyClass(paramClass)) {
/* 125 */       return false;
/*     */     }
/* 127 */     String str = paramClass.getPackageName();
/* 128 */     return (str == null || !str.startsWith("com.sun.proxy"));
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\reflect\ReflectUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */