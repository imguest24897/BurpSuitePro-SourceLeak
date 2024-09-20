/*    */ package com.sun.javafx.reflect;
/*    */ 
/*    */ import java.lang.reflect.InvocationTargetException;
/*    */ import java.lang.reflect.Method;
/*    */ import java.security.AccessController;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class Trampoline
/*    */ {
/*    */   static {
/* 46 */     if (Trampoline.class.getClassLoader() == null) {
/* 47 */       throw new Error("Trampoline must not be defined by the bootstrap classloader");
/*    */     }
/*    */     
/* 50 */     if (Trampoline.class.getClassLoader() == ClassLoader.getPlatformClassLoader()) {
/* 51 */       throw new Error("Trampoline must not be defined by the platform classloader");
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static void ensureInvocableMethod(Method paramMethod) throws InvocationTargetException {
/* 60 */     Class<?> clazz = paramMethod.getDeclaringClass();
/* 61 */     if (clazz.equals(AccessController.class) || clazz
/* 62 */       .equals(Method.class) || clazz
/* 63 */       .getName().startsWith("java.lang.invoke.")) {
/* 64 */       throw new InvocationTargetException(new UnsupportedOperationException("invocation not supported"));
/*    */     }
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static Object invoke(Method paramMethod, Object paramObject, Object[] paramArrayOfObject) throws InvocationTargetException, IllegalAccessException {
/* 71 */     ensureInvocableMethod(paramMethod);
/* 72 */     return paramMethod.invoke(paramObject, paramArrayOfObject);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\reflect\Trampoline.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */