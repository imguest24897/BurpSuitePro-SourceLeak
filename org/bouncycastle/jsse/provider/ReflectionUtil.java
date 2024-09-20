package org.bouncycastle.jsse.provider;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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
  
  static Class<?> getClass(final String className) {
    return (null == className) ? null : AccessController.<Class<?>>doPrivileged(new PrivilegedAction<Class<?>>() {
          public Class<?> run() {
            try {
              ClassLoader classLoader = ReflectionUtil.class.getClassLoader();
              return (null == classLoader) ? Class.forName(className) : classLoader.loadClass(className);
            } catch (Exception exception) {
              return null;
            } 
          }
        });
  }
  
  static <T> Constructor<T> getDeclaredConstructor(final String className, Class<?>... parameterTypes) {
    return (null == className) ? null : AccessController.<Constructor<T>>doPrivileged((PrivilegedAction)new PrivilegedAction<Constructor<Constructor<T>>>() {
          public Constructor<T> run() {
            try {
              ClassLoader classLoader = ReflectionUtil.class.getClassLoader();
              Class<?> clazz = (null == classLoader) ? Class.forName(className) : classLoader.loadClass(className);
              if (null != clazz)
                return (Constructor)clazz.getDeclaredConstructor(parameterTypes); 
            } catch (Exception exception) {}
            return null;
          }
        });
  }
  
  static Method getMethod(final String className, final String methodName, Class<?>... parameterTypes) {
    return (null == className || null == methodName) ? null : AccessController.<Method>doPrivileged(new PrivilegedAction<Method>() {
          public Method run() {
            try {
              ClassLoader classLoader = ReflectionUtil.class.getClassLoader();
              Class<?> clazz = (null == classLoader) ? Class.forName(className) : classLoader.loadClass(className);
              if (null != clazz)
                return clazz.getMethod(methodName, parameterTypes); 
            } catch (Exception exception) {}
            return null;
          }
        });
  }
  
  static Method[] getMethods(final String className) {
    return (null == className) ? null : AccessController.<Method[]>doPrivileged((PrivilegedAction)new PrivilegedAction<Method[]>() {
          public Method[] run() {
            try {
              ClassLoader classLoader = ReflectionUtil.class.getClassLoader();
              Class<?> clazz = (null == classLoader) ? Class.forName(className) : classLoader.loadClass(className);
              if (null != clazz)
                return clazz.getMethods(); 
            } catch (Exception exception) {}
            return null;
          }
        });
  }
  
  static Integer getStaticInt(final String className, final String fieldName) {
    return AccessController.<Integer>doPrivileged(new PrivilegedAction<Integer>() {
          public Integer run() {
            try {
              ClassLoader classLoader = ReflectionUtil.class.getClassLoader();
              Class<?> clazz = (null == classLoader) ? Class.forName(className) : classLoader.loadClass(className);
              if (null != clazz) {
                Field field = clazz.getField(fieldName);
                if (null != field) {
                  Class<?> clazz1 = field.getType();
                  if (int.class == clazz1)
                    return Integer.valueOf(field.getInt(null)); 
                } 
              } 
            } catch (Exception exception) {}
            return null;
          }
        });
  }
  
  static Integer getStaticIntOrDefault(String paramString1, String paramString2, int paramInt) {
    Integer integer = getStaticInt(paramString1, paramString2);
    return Integer.valueOf((null == integer) ? paramInt : integer.intValue());
  }
  
  static Object invokeGetter(Object paramObject, Method paramMethod) {
    return invokeMethod(paramObject, paramMethod, new Object[0]);
  }
  
  static Object invokeMethod(final Object obj, final Method method, Object... args) {
    return AccessController.doPrivileged(new PrivilegedAction() {
          public Object run() {
            try {
              return method.invoke(obj, args);
            } catch (IllegalAccessException illegalAccessException) {
              throw new RuntimeException(illegalAccessException);
            } catch (InvocationTargetException invocationTargetException) {
              throw new RuntimeException(invocationTargetException);
            } 
          }
        });
  }
  
  static void invokeSetter(Object paramObject1, Method paramMethod, Object paramObject2) {
    invokeMethod(paramObject1, paramMethod, new Object[] { paramObject2 });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ReflectionUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */