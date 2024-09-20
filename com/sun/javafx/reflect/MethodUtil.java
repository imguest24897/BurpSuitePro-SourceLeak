/*     */ package com.sun.javafx.reflect;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.lang.reflect.Modifier;
/*     */ import java.security.AccessController;
/*     */ import java.security.AllPermission;
/*     */ import java.security.CodeSource;
/*     */ import java.security.PermissionCollection;
/*     */ import java.security.PrivilegedExceptionAction;
/*     */ import java.security.SecureClassLoader;
/*     */ import java.security.cert.Certificate;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
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
/*     */ public final class MethodUtil
/*     */   extends SecureClassLoader
/*     */ {
/*     */   private static final String MISC_PKG = "com.sun.javafx.reflect.";
/*     */   private static final String TRAMPOLINE = "com.sun.javafx.reflect.Trampoline";
/*  82 */   private static final Method bounce = getTrampoline();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Method getMethod(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass) throws NoSuchMethodException {
/*  90 */     ReflectUtil.checkPackageAccess(paramClass);
/*  91 */     return paramClass.getMethod(paramString, paramArrayOfClass);
/*     */   }
/*     */   
/*     */   public static Method[] getMethods(Class<?> paramClass) {
/*  95 */     ReflectUtil.checkPackageAccess(paramClass);
/*  96 */     return paramClass.getMethods();
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
/*     */   static Method[] getPublicMethods(Class<?> paramClass) {
/* 109 */     if (System.getSecurityManager() == null) {
/* 110 */       return paramClass.getMethods();
/*     */     }
/* 112 */     HashMap<Object, Object> hashMap = new HashMap<>();
/* 113 */     while (paramClass != null) {
/* 114 */       boolean bool = getInternalPublicMethods(paramClass, (Map)hashMap);
/* 115 */       if (bool) {
/*     */         break;
/*     */       }
/* 118 */       getInterfaceMethods(paramClass, (Map)hashMap);
/* 119 */       paramClass = paramClass.getSuperclass();
/*     */     } 
/* 121 */     return (Method[])hashMap.values().toArray((Object[])new Method[hashMap.size()]);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void getInterfaceMethods(Class<?> paramClass, Map<Signature, Method> paramMap) {
/* 129 */     Class[] arrayOfClass = paramClass.getInterfaces();
/* 130 */     for (byte b = 0; b < arrayOfClass.length; b++) {
/* 131 */       Class<?> clazz = arrayOfClass[b];
/* 132 */       boolean bool = getInternalPublicMethods(clazz, paramMap);
/* 133 */       if (!bool) {
/* 134 */         getInterfaceMethods(clazz, paramMap);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static boolean getInternalPublicMethods(Class<?> paramClass, Map<Signature, Method> paramMap) {
/* 145 */     Method[] arrayOfMethod = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 152 */       if (!Modifier.isPublic(paramClass.getModifiers())) {
/* 153 */         return false;
/*     */       }
/* 155 */       if (!ReflectUtil.isPackageAccessible(paramClass)) {
/* 156 */         return false;
/*     */       }
/*     */       
/* 159 */       arrayOfMethod = paramClass.getMethods();
/* 160 */     } catch (SecurityException securityException) {
/* 161 */       return false;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     boolean bool = true; byte b;
/* 171 */     for (b = 0; b < arrayOfMethod.length; b++) {
/* 172 */       Class<?> clazz = arrayOfMethod[b].getDeclaringClass();
/* 173 */       if (!Modifier.isPublic(clazz.getModifiers())) {
/* 174 */         bool = false;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 179 */     if (bool) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 184 */       for (b = 0; b < arrayOfMethod.length; b++) {
/* 185 */         addMethod(paramMap, arrayOfMethod[b]);
/*     */       
/*     */       }
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 192 */       for (b = 0; b < arrayOfMethod.length; b++) {
/* 193 */         Class<?> clazz = arrayOfMethod[b].getDeclaringClass();
/* 194 */         if (paramClass.equals(clazz)) {
/* 195 */           addMethod(paramMap, arrayOfMethod[b]);
/*     */         }
/*     */       } 
/*     */     } 
/* 199 */     return bool;
/*     */   }
/*     */   
/*     */   private static void addMethod(Map<Signature, Method> paramMap, Method paramMethod) {
/* 203 */     Signature signature = new Signature(paramMethod);
/* 204 */     if (!paramMap.containsKey(signature)) {
/* 205 */       paramMap.put(signature, paramMethod);
/* 206 */     } else if (!paramMethod.getDeclaringClass().isInterface()) {
/*     */ 
/*     */ 
/*     */       
/* 210 */       Method method = paramMap.get(signature);
/* 211 */       if (method.getDeclaringClass().isInterface()) {
/* 212 */         paramMap.put(signature, paramMethod);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static class Signature
/*     */   {
/*     */     private final String methodName;
/*     */     
/*     */     private final Class<?>[] argClasses;
/*     */     
/*     */     private final int hashCode;
/*     */     
/*     */     Signature(Method param1Method) {
/* 227 */       this.methodName = param1Method.getName();
/* 228 */       this.argClasses = param1Method.getParameterTypes();
/* 229 */       this.hashCode = this.methodName.hashCode() + Arrays.hashCode((Object[])this.argClasses);
/*     */     }
/*     */     
/*     */     public int hashCode() {
/* 233 */       return this.hashCode;
/*     */     }
/*     */     
/*     */     public boolean equals(Object param1Object) {
/* 237 */       if (this == param1Object) {
/* 238 */         return true;
/*     */       }
/* 240 */       Signature signature = (Signature)param1Object;
/* 241 */       if (!this.methodName.equals(signature.methodName)) {
/* 242 */         return false;
/*     */       }
/* 244 */       if (this.argClasses.length != signature.argClasses.length) {
/* 245 */         return false;
/*     */       }
/* 247 */       for (byte b = 0; b < this.argClasses.length; b++) {
/* 248 */         if (this.argClasses[b] != signature.argClasses[b]) {
/* 249 */           return false;
/*     */         }
/*     */       } 
/* 252 */       return true;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Module getTrampolineModule() {
/* 261 */     return bounce.getDeclaringClass().getModule();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static Object invoke(Method paramMethod, Object paramObject, Object[] paramArrayOfObject) throws InvocationTargetException, IllegalAccessException {
/*     */     try {
/* 270 */       return bounce.invoke(null, new Object[] { paramMethod, paramObject, paramArrayOfObject });
/* 271 */     } catch (InvocationTargetException invocationTargetException) {
/* 272 */       Throwable throwable = invocationTargetException.getCause();
/*     */       
/* 274 */       if (throwable instanceof InvocationTargetException)
/* 275 */         throw (InvocationTargetException)throwable; 
/* 276 */       if (throwable instanceof IllegalAccessException)
/* 277 */         throw (IllegalAccessException)throwable; 
/* 278 */       if (throwable instanceof RuntimeException)
/* 279 */         throw (RuntimeException)throwable; 
/* 280 */       if (throwable instanceof Error) {
/* 281 */         throw (Error)throwable;
/*     */       }
/* 283 */       throw new Error("Unexpected invocation error", throwable);
/*     */     }
/* 285 */     catch (IllegalAccessException illegalAccessException) {
/*     */       
/* 287 */       throw new Error("Unexpected invocation error", illegalAccessException);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static Method getTrampoline() {
/*     */     try {
/* 294 */       return AccessController.<Method>doPrivileged(new PrivilegedExceptionAction<Method>()
/*     */           {
/*     */             public Method run() throws Exception
/*     */             {
/* 298 */               Class<?> clazz = MethodUtil.getTrampolineClass();
/* 299 */               Class[] arrayOfClass = { Method.class, Object.class, Object[].class };
/*     */ 
/*     */               
/* 302 */               Method method = clazz.getDeclaredMethod("invoke", arrayOfClass);
/* 303 */               method.setAccessible(true);
/* 304 */               return method;
/*     */             }
/*     */           });
/* 307 */     } catch (Exception exception) {
/* 308 */       throw new InternalError("bouncer cannot be found", exception);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected synchronized Class<?> loadClass(String paramString, boolean paramBoolean) throws ClassNotFoundException {
/* 318 */     ReflectUtil.checkPackageAccess(paramString);
/* 319 */     Class<?> clazz = findLoadedClass(paramString);
/* 320 */     if (clazz == null) {
/*     */       try {
/* 322 */         clazz = findClass(paramString);
/* 323 */       } catch (ClassNotFoundException classNotFoundException) {}
/*     */ 
/*     */       
/* 326 */       if (clazz == null) {
/* 327 */         clazz = getParent().loadClass(paramString);
/*     */       }
/*     */     } 
/* 330 */     if (paramBoolean) {
/* 331 */       resolveClass(clazz);
/*     */     }
/* 333 */     return clazz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Class<?> findClass(String paramString) throws ClassNotFoundException {
/* 341 */     if (!paramString.startsWith("com.sun.javafx.reflect.")) {
/* 342 */       throw new ClassNotFoundException(paramString);
/*     */     }
/* 344 */     String str = paramString.replace('.', '/').concat(".class");
/*     */     try {
/* 346 */       InputStream inputStream = MethodUtil.class.getModule().getResourceAsStream(str);
/* 347 */       if (inputStream != null)
/* 348 */       { InputStream inputStream1 = inputStream; 
/* 349 */         try { byte[] arrayOfByte = inputStream.readAllBytes();
/* 350 */           Class<?> clazz = defineClass(paramString, arrayOfByte);
/* 351 */           if (inputStream1 != null) inputStream1.close();  return clazz; } catch (Throwable throwable) { if (inputStream1 != null)
/*     */             try { inputStream1.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }  } 
/* 353 */     } catch (IOException iOException) {
/* 354 */       throw new ClassNotFoundException(paramString, iOException);
/*     */     } 
/*     */     
/* 357 */     throw new ClassNotFoundException(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Class<?> defineClass(String paramString, byte[] paramArrayOfbyte) throws IOException {
/* 365 */     CodeSource codeSource = new CodeSource(null, (Certificate[])null);
/* 366 */     if (!paramString.equals("com.sun.javafx.reflect.Trampoline")) {
/* 367 */       throw new IOException("MethodUtil: bad name " + paramString);
/*     */     }
/* 369 */     return defineClass(paramString, paramArrayOfbyte, 0, paramArrayOfbyte.length, codeSource);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected PermissionCollection getPermissions(CodeSource paramCodeSource) {
/* 375 */     PermissionCollection permissionCollection = super.getPermissions(paramCodeSource);
/* 376 */     permissionCollection.add(new AllPermission());
/* 377 */     return permissionCollection;
/*     */   }
/*     */   
/*     */   private static Class<?> getTrampolineClass() {
/*     */     try {
/* 382 */       return Class.forName("com.sun.javafx.reflect.Trampoline", true, new MethodUtil());
/* 383 */     } catch (ClassNotFoundException classNotFoundException) {
/*     */       
/* 385 */       return null;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\sun\javafx\reflect\MethodUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */