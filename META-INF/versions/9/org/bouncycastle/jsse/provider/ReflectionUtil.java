package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

class ReflectionUtil {
  static Method findMethod(Method[] paramArrayOfMethod, String paramString) {
    if (paramArrayOfMethod != null)
      for (Method method : paramArrayOfMethod) {
        if (method.getName().equals(paramString))
          return method; 
      }  
    return null;
  }
  
  static boolean hasMethod(Method[] paramArrayOfMethod, String paramString) {
    return (null != findMethod(paramArrayOfMethod, paramString));
  }
  
  static Class<?> getClass(String paramString) {
    return (null == paramString) ? null : AccessController.<Class<?>>doPrivileged((PrivilegedAction<Class<?>>)new Object(paramString));
  }
  
  static <T> Constructor<T> getDeclaredConstructor(String paramString, Class<?>... paramVarArgs) {
    return (null == paramString) ? null : AccessController.<Constructor<T>>doPrivileged((PrivilegedAction<Constructor<T>>)new Object(paramString, paramVarArgs));
  }
  
  static Method getMethod(String paramString1, String paramString2, Class<?>... paramVarArgs) {
    return (null == paramString1 || null == paramString2) ? null : AccessController.<Method>doPrivileged((PrivilegedAction<Method>)new Object(paramString1, paramString2, paramVarArgs));
  }
  
  static Method[] getMethods(String paramString) {
    return (null == paramString) ? null : AccessController.<Method[]>doPrivileged((PrivilegedAction<Method>)new Object(paramString));
  }
  
  static Integer getStaticInt(String paramString1, String paramString2) {
    return AccessController.<Integer>doPrivileged((PrivilegedAction<Integer>)new Object(paramString1, paramString2));
  }
  
  static Integer getStaticIntOrDefault(String paramString1, String paramString2, int paramInt) {
    Integer integer = getStaticInt(paramString1, paramString2);
    return Integer.valueOf((null == integer) ? paramInt : integer.intValue());
  }
  
  static Object invokeGetter(Object paramObject, Method paramMethod) {
    return invokeMethod(paramObject, paramMethod, new Object[0]);
  }
  
  static Object invokeMethod(Object paramObject, Method paramMethod, Object... paramVarArgs) {
    return AccessController.doPrivileged((PrivilegedAction<?>)new Object(paramMethod, paramObject, paramVarArgs));
  }
  
  static void invokeSetter(Object paramObject1, Method paramMethod, Object paramObject2) {
    invokeMethod(paramObject1, paramMethod, new Object[] { paramObject2 });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ReflectionUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */