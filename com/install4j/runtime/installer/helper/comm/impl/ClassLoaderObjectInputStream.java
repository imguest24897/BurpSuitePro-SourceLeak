/*    */ package com.install4j.runtime.installer.helper.comm.impl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.ObjectInputStream;
/*    */ import java.io.ObjectStreamClass;
/*    */ import java.lang.reflect.Proxy;
/*    */ 
/*    */ public class ClassLoaderObjectInputStream extends ObjectInputStream {
/*    */   private final ClassLoader classLoader;
/*    */   
/*    */   public ClassLoaderObjectInputStream(ClassLoader classLoader, InputStream inputStream) throws IOException {
/* 13 */     super(inputStream);
/* 14 */     this.classLoader = classLoader;
/*    */   }
/*    */ 
/*    */   
/*    */   protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
/* 19 */     return Class.forName(objectStreamClass.getName(), false, this.classLoader);
/*    */   }
/*    */ 
/*    */   
/*    */   protected Class<?> resolveProxyClass(String[] interfaces) throws IOException, ClassNotFoundException {
/* 24 */     Class[] interfaceClasses = new Class[interfaces.length];
/*    */     
/* 26 */     for (int i = 0; i < interfaces.length; i++) {
/* 27 */       interfaceClasses[i] = Class.forName(interfaces[i], false, this.classLoader);
/*    */     }
/*    */     
/*    */     try {
/* 31 */       return Proxy.getProxyClass(this.classLoader, interfaceClasses);
/* 32 */     } catch (IllegalArgumentException e) {
/* 33 */       return super.resolveProxyClass(interfaces);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\comm\impl\ClassLoaderObjectInputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */