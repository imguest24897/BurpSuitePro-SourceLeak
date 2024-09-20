/*    */ package com.nimbusds.jose.shaded.asm;
/*    */ 
/*    */ import java.lang.reflect.Method;
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
/*    */ class DynamicClassLoader
/*    */   extends ClassLoader
/*    */ {
/*    */   DynamicClassLoader(ClassLoader parent) {
/* 29 */     super(parent);
/*    */   }
/*    */   
/* 32 */   private static final String BEAN_AC = BeansAccess.class.getName();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 37 */   private static final Class<?>[] DEF_CLASS_SIG = new Class[] { String.class, byte[].class, int.class, int.class };
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static <T> Class<T> directLoad(Class<? extends T> parent, String clsName, byte[] clsData) {
/* 47 */     DynamicClassLoader loader = new DynamicClassLoader(parent.getClassLoader());
/*    */     
/* 49 */     Class<T> clzz = (Class)loader.defineClass(clsName, clsData);
/* 50 */     return clzz;
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T> T directInstance(Class<? extends T> parent, String clsName, byte[] clsData) throws InstantiationException, IllegalAccessException {
/* 55 */     Class<T> clzz = directLoad(parent, clsName, clsData);
/* 56 */     return clzz.newInstance();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected synchronized Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
/* 64 */     if (name.equals(BEAN_AC)) {
/* 65 */       return BeansAccess.class;
/*    */     }
/*    */ 
/*    */     
/* 69 */     return super.loadClass(name, resolve);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   Class<?> defineClass(String name, byte[] bytes) throws ClassFormatError {
/*    */     try {
/* 82 */       Method method = ClassLoader.class.getDeclaredMethod("defineClass", DEF_CLASS_SIG);
/* 83 */       method.setAccessible(true);
/* 84 */       return (Class)method.invoke(getParent(), new Object[] { name, bytes, Integer.valueOf(0), Integer.valueOf(bytes.length) });
/* 85 */     } catch (Exception exception) {
/*    */       
/* 87 */       return defineClass(name, bytes, 0, bytes.length);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\nimbusds\jose\shaded\asm\DynamicClassLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */