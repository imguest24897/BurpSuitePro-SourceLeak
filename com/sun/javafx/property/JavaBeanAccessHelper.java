/*    */ package com.sun.javafx.property;
/*    */ 
/*    */ import java.lang.reflect.InvocationTargetException;
/*    */ import java.lang.reflect.Method;
/*    */ import javafx.beans.property.ReadOnlyObjectProperty;
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
/*    */ public final class JavaBeanAccessHelper
/*    */ {
/*    */   private static Method JAVA_BEAN_QUICK_ACCESSOR_CREATE_RO;
/*    */   private static boolean initialized;
/*    */   
/*    */   public static <T> ReadOnlyObjectProperty<T> createReadOnlyJavaBeanProperty(Object paramObject, String paramString) throws NoSuchMethodException {
/* 42 */     init();
/* 43 */     if (JAVA_BEAN_QUICK_ACCESSOR_CREATE_RO == null) {
/* 44 */       throw new UnsupportedOperationException("Java beans are not supported.");
/*    */     }
/*    */     try {
/* 47 */       return (ReadOnlyObjectProperty<T>)JAVA_BEAN_QUICK_ACCESSOR_CREATE_RO.invoke(null, new Object[] { paramObject, paramString });
/* 48 */     } catch (IllegalAccessException illegalAccessException) {
/* 49 */       throw new UnsupportedOperationException("Java beans are not supported.");
/* 50 */     } catch (InvocationTargetException invocationTargetException) {
/* 51 */       if (invocationTargetException.getCause() instanceof NoSuchMethodException) {
/* 52 */         throw (NoSuchMethodException)invocationTargetException.getCause();
/*    */       }
/* 54 */       throw new UnsupportedOperationException("Java beans are not supported.");
/*    */     } 
/*    */   }
/*    */   
/*    */   private static void init() {
/* 59 */     if (!initialized) {
/*    */       try {
/* 61 */         Class<?> clazz = Class.forName("com.sun.javafx.property.adapter.JavaBeanQuickAccessor", true, JavaBeanAccessHelper.class
/*    */             
/* 63 */             .getClassLoader());
/*    */         
/* 65 */         JAVA_BEAN_QUICK_ACCESSOR_CREATE_RO = clazz.getDeclaredMethod("createReadOnlyJavaBeanObjectProperty", new Class[] { Object.class, String.class });
/*    */       }
/* 67 */       catch (ClassNotFoundException classNotFoundException) {
/*    */       
/* 69 */       } catch (NoSuchMethodException noSuchMethodException) {}
/*    */ 
/*    */       
/* 72 */       initialized = true;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\property\JavaBeanAccessHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */