/*    */ package com.install4j.runtime.installer.helper.versionspecific;
/*    */ 
/*    */ import com.ejt.internal.util.JavaVersionUtil;
/*    */ import com.install4j.runtime.installer.helper.content.JavaHttpConnection;
/*    */ import java.io.IOException;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MethodType;
/*    */ import java.lang.invoke.VarHandle;
/*    */ import java.lang.reflect.Field;
/*    */ import java.net.Proxy;
/*    */ import java.net.URL;
/*    */ import java.net.http.HttpClient;
/*    */ import java.util.Locale;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class Java11Helper
/*    */   extends Java9Helper
/*    */ {
/*    */   public JavaHttpConnection createHttpConnection(URL url, Proxy proxy, boolean acceptAllCertificates) throws IOException {
/* 22 */     if (!Boolean.getBoolean("install4j.useHttpClient") || !isHttpClientAvailable() || !isHttpClientProtocol(url)) {
/* 23 */       return super.createHttpConnection(url, proxy, acceptAllCertificates);
/*    */     }
/* 25 */     return new HttpClientWrapper(url, proxy, acceptAllCertificates);
/*    */   }
/*    */ 
/*    */   
/*    */   private boolean isHttpClientProtocol(URL url) {
/* 30 */     String protocol = url.getProtocol().toLowerCase(Locale.ROOT);
/* 31 */     return (protocol.equals("http") || protocol.equals("https"));
/*    */   }
/*    */   
/*    */   private boolean isHttpClientAvailable() {
/*    */     try {
/* 36 */       Class.forName(HttpClient.class.getName());
/* 37 */       return true;
/* 38 */     } catch (Throwable t) {
/* 39 */       return false;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public void setSecurityManager(SecurityManager securityManager) {
/* 45 */     if (JavaVersionUtil.isJava17Plus()) {
/*    */       try {
/* 47 */         preventSecurityManagerDeprecationWarning();
/* 48 */       } catch (Throwable e) {
/* 49 */         e.printStackTrace();
/*    */       } 
/*    */     }
/*    */     try {
/* 53 */       System.setSecurityManager(securityManager);
/* 54 */     } catch (Throwable throwable) {}
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private void preventSecurityManagerDeprecationWarning() throws Throwable {
/* 60 */     Class<?> unsafe = Class.forName("sun.misc.Unsafe");
/* 61 */     MethodHandles.Lookup lookup = MethodHandles.privateLookupIn(unsafe, MethodHandles.lookup());
/* 62 */     VarHandle handle = lookup.findStaticVarHandle(unsafe, "theUnsafe", unsafe);
/* 63 */     Object theUnsafe = handle.get();
/* 64 */     Field callersHolder = Class.forName("java.lang.System$CallersHolder", true, (ClassLoader)null).getDeclaredField("callers");
/*    */     
/* 66 */     MethodHandle staticFieldBase = lookup.findVirtual(unsafe, "staticFieldBase", MethodType.methodType(Object.class, Field.class));
/* 67 */     staticFieldBase = staticFieldBase.asType(staticFieldBase.type().changeParameterType(0, Object.class));
/* 68 */     Object base = staticFieldBase.invokeExact(theUnsafe, callersHolder);
/*    */     
/* 70 */     MethodHandle staticFieldOffset = lookup.findVirtual(unsafe, "staticFieldOffset", MethodType.methodType(long.class, Field.class));
/* 71 */     staticFieldOffset = staticFieldOffset.asType(staticFieldOffset.type().changeParameterType(0, Object.class));
/* 72 */     long offset = staticFieldOffset.invokeExact(theUnsafe, callersHolder);
/*    */     
/* 74 */     MethodHandle getObject = lookup.findVirtual(unsafe, "getObject", MethodType.methodType(Object.class, Object.class, new Class[] { long.class }));
/* 75 */     getObject = getObject.asType(getObject.type().changeParameterType(0, Object.class));
/*    */ 
/*    */     
/* 78 */     Map<Class<?>, Boolean> callers = (Map<Class<?>, Boolean>)getObject.invokeExact(theUnsafe, base, offset);
/* 79 */     callers.put(Java11Helper.class, Boolean.valueOf(true));
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\helper\versionspecific\Java11Helper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */