package com.fasterxml.Zm;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zf;
import com.fasterxml.Zb.Zi;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zr;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zw.Zl;
import com.fasterxml.Zw.Zt;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class Zx {
  private static final Class<?> ZI;
  
  private static final Annotation[] Zw;
  
  private static final Ze7[] ZE;
  
  private static final Iterator<?> ZZ;
  
  private static int ZW;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public static <T> Iterator<T> Zd() {
    return (Iterator)ZZ;
  }
  
  public static List<Class<?>> Zp(Class<?> paramClass1, Class<?> paramClass2, boolean paramBoolean) {
    try {
      if (paramClass1 != null)
        try {
          if (paramClass1 != paramClass2)
            try {
              if (paramClass1 != Object.class) {
                ArrayList<Class<?>> arrayList = new ArrayList(8);
                Zs(paramClass1, paramClass2, arrayList, paramBoolean);
                return arrayList;
              } 
              return Collections.emptyList();
            } catch (SecurityException securityException) {
              throw a(null);
            }  
        } catch (SecurityException securityException) {
          throw a(null);
        }  
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return Collections.emptyList();
  }
  
  public static List<Class<?>> ZO(Class<?> paramClass1, Class<?> paramClass2, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZY : ()I
    //   3: new java/util/ArrayList
    //   6: dup
    //   7: bipush #8
    //   9: invokespecial <init> : (I)V
    //   12: astore #4
    //   14: istore_3
    //   15: aload_0
    //   16: ifnull -> 103
    //   19: aload_0
    //   20: aload_1
    //   21: if_acmpeq -> 103
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   30: athrow
    //   31: iload_2
    //   32: ifeq -> 58
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   41: athrow
    //   42: aload #4
    //   44: aload_0
    //   45: invokeinterface add : (Ljava/lang/Object;)Z
    //   50: pop
    //   51: goto -> 58
    //   54: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   57: athrow
    //   58: aload_0
    //   59: invokevirtual getSuperclass : ()Ljava/lang/Class;
    //   62: dup
    //   63: astore_0
    //   64: ifnull -> 103
    //   67: aload_0
    //   68: aload_1
    //   69: if_acmpne -> 83
    //   72: iload_3
    //   73: ifeq -> 103
    //   76: goto -> 83
    //   79: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   82: athrow
    //   83: aload #4
    //   85: aload_0
    //   86: invokeinterface add : (Ljava/lang/Object;)Z
    //   91: pop
    //   92: iload_3
    //   93: ifeq -> 58
    //   96: goto -> 103
    //   99: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   102: athrow
    //   103: aload #4
    //   105: areturn
    // Exception table:
    //   from	to	target	type
    //   15	24	27	java/lang/SecurityException
    //   19	35	38	java/lang/SecurityException
    //   31	51	54	java/lang/SecurityException
    //   67	76	79	java/lang/SecurityException
    //   72	96	99	java/lang/SecurityException
  }
  
  private static void Zs(Class<?> paramClass1, Class<?> paramClass2, Collection<Class<?>> paramCollection, boolean paramBoolean) {
    int i = ZY();
    try {
      if (paramClass1 != paramClass2)
        try {
          if (paramClass1 != null)
            try {
              if (paramClass1 != Object.class) {
                try {
                  if (paramBoolean) {
                    try {
                      if (paramCollection.contains(paramClass1))
                        return; 
                    } catch (SecurityException securityException) {
                      throw a(null);
                    } 
                    paramCollection.add(paramClass1);
                  } 
                } catch (SecurityException securityException) {
                  throw a(null);
                } 
                Class[] arrayOfClass = Zx(paramClass1);
                int j = arrayOfClass.length;
                byte b = 0;
                while (b < j) {
                  Class<?> clazz = arrayOfClass[b];
                  Zs(clazz, paramClass2, paramCollection, true);
                  b++;
                  if (i != 0)
                    break; 
                } 
                Zs(paramClass1.getSuperclass(), paramClass2, paramCollection, true);
                return;
              } 
              return;
            } catch (SecurityException securityException) {
              throw a(null);
            }  
        } catch (SecurityException securityException) {
          throw a(null);
        }  
    } catch (SecurityException securityException) {
      throw a(null);
    } 
  }
  
  public static String ZE(Class<?> paramClass) {
    try {
      if (paramClass.isAnnotation())
        return a(-1451, 1103); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass.isArray())
        return a(-1470, -30990); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (Enum.class.isAssignableFrom(paramClass))
        return a(-1461, -22233); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass.isPrimitive())
        return a(-1469, 22084); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return null;
  }
  
  public static String ZA(Class<?> paramClass, boolean paramBoolean) {
    try {
      boolean bool = Modifier.isStatic(paramClass.getModifiers());
      try {
        if (!bool && ZX(paramClass))
          return a(-1464, 25014); 
      } catch (SecurityException securityException) {
        throw a(null);
      } 
      try {
        if (!paramBoolean)
          try {
            if (!bool && ZO(paramClass) != null)
              return a(-1454, -27146); 
          } catch (SecurityException securityException) {
            throw a(null);
          }  
      } catch (SecurityException securityException) {
        throw a(null);
      } 
    } catch (SecurityException securityException) {
    
    } catch (NullPointerException nullPointerException) {}
    return null;
  }
  
  public static Class<?> ZN(Class<?> paramClass) {
    if (!Modifier.isStatic(paramClass.getModifiers()))
      try {
        try {
          return ZX(paramClass) ? null : ZO(paramClass);
        } catch (SecurityException securityException) {}
      } catch (NullPointerException nullPointerException) {
        throw a(null);
      }  
    return null;
  }
  
  public static boolean Zi(Class<?> paramClass) {
    String str = paramClass.getName();
    try {
      if (!str.startsWith(a(-1449, 26259)))
        try {
          return !!str.startsWith(a(-1465, 22172));
        } catch (SecurityException securityException) {
          throw a(null);
        }  
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return true;
  }
  
  public static boolean Zv(Class<?> paramClass) {
    int i = paramClass.getModifiers();
    try {
    
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return ((i & 0x600) == 0);
  }
  
  public static boolean ZU(Class<?> paramClass) {
    try {
      if (paramClass.isArray())
        return true; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (Collection.class.isAssignableFrom(paramClass))
        return true; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (Map.class.isAssignableFrom(paramClass))
        return true; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return false;
  }
  
  public static boolean Zu(Class<?> paramClass) {
    try {
      if (paramClass != Void.class)
        try {
          if (paramClass != void.class) {
            try {
              if (paramClass == Zt.class);
            } catch (SecurityException securityException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (SecurityException securityException) {
          throw a(null);
        }  
    } catch (SecurityException securityException) {
      throw a(null);
    } 
  }
  
  public static boolean Zr(Class<?> paramClass) {
    Class<?> clazz = paramClass.getSuperclass();
    try {
      if (clazz != null)
        try {
          if (a(-1467, -21332).equals(clazz.getName()));
        } catch (SecurityException securityException) {
          throw a(null);
        }  
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return false;
  }
  
  public static boolean ZD(Class<?> paramClass) {
    try {
      if (paramClass != ZI) {
        try {
          if (paramClass.isPrimitive());
        } catch (SecurityException securityException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
  }
  
  public static boolean Zi(Object paramObject, Class<?> paramClass) {
    try {
      if (paramObject != null)
        try {
          if (paramObject.getClass() == paramClass);
        } catch (SecurityException securityException) {
          throw a(null);
        }  
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return false;
  }
  
  public static void ZW(Class<?> paramClass, Object paramObject, String paramString) {
    try {
      if (paramObject.getClass() != paramClass)
        throw new IllegalStateException(String.format(a(-1456, -7483), new Object[] { paramObject.getClass().getName(), paramClass.getName(), paramString })); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
  }
  
  public static Throwable Zo(Throwable paramThrowable) {
    try {
      if (paramThrowable instanceof Error)
        throw (Error)paramThrowable; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return paramThrowable;
  }
  
  public static Throwable Zq(Throwable paramThrowable) {
    try {
      if (paramThrowable instanceof RuntimeException)
        throw (RuntimeException)paramThrowable; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return paramThrowable;
  }
  
  public static Throwable Zf(Throwable paramThrowable) throws IOException {
    try {
      if (paramThrowable instanceof IOException)
        throw (IOException)paramThrowable; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return paramThrowable;
  }
  
  public static Throwable Zs(Throwable paramThrowable) {
    while (paramThrowable.getCause() != null)
      paramThrowable = paramThrowable.getCause(); 
    return paramThrowable;
  }
  
  public static Throwable Zy(Throwable paramThrowable) throws IOException {
    return Zf(Zs(paramThrowable));
  }
  
  public static void ZW(Throwable paramThrowable) {
    Ze(paramThrowable, paramThrowable.getMessage());
  }
  
  public static void Ze(Throwable paramThrowable, String paramString) {
    Zq(paramThrowable);
    Zo(paramThrowable);
    throw new IllegalArgumentException(paramString, paramThrowable);
  }
  
  public static <T> T ZG(Zyg paramZyg, IOException paramIOException) throws Zy_ {
    try {
      if (paramIOException instanceof Zy_)
        throw (Zy_)paramIOException; 
    } catch (Zy_ zy_) {
      throw a(null);
    } 
    throw Zy_.Z_(paramZyg, paramIOException.getMessage()).Zc(paramIOException);
  }
  
  public static void ZJ(Throwable paramThrowable) {
    ZW(Zs(paramThrowable));
  }
  
  public static void ZR(Throwable paramThrowable, String paramString) {
    Ze(Zs(paramThrowable), paramString);
  }
  
  public static void Zm(Zf paramZf, Exception paramException) throws IOException {
    paramZf.Zf(Zi.AUTO_CLOSE_JSON_CONTENT);
    try {
      paramZf.close();
    } catch (Exception exception) {
      paramException.addSuppressed(exception);
    } 
    Zf(paramException);
    Zq(paramException);
    throw new RuntimeException(paramException);
  }
  
  public static void ZP(Zf paramZf, Closeable paramCloseable, Exception paramException) throws IOException {
    if (paramZf != null) {
      paramZf.Zf(Zi.AUTO_CLOSE_JSON_CONTENT);
      try {
        paramZf.close();
      } catch (Exception exception) {
        paramException.addSuppressed(exception);
      } 
    } 
    if (paramCloseable != null)
      try {
        paramCloseable.close();
      } catch (Exception exception) {
        paramException.addSuppressed(exception);
      }  
    Zf(paramException);
    Zq(paramException);
    throw new RuntimeException(paramException);
  }
  
  public static <T> T ZR(Class<T> paramClass, boolean paramBoolean) throws IllegalArgumentException {
    Constructor<T> constructor = ZK(paramClass, paramBoolean);
    try {
      if (constructor == null)
        throw new IllegalArgumentException(a(-1471, -13166) + paramClass.getName() + a(-1445, -13068)); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      return constructor.newInstance(new Object[0]);
    } catch (Exception exception) {
      ZR(exception, a(-1429, 5621) + paramClass.getName() + a(-1446, -32485) + exception.getMessage());
      return null;
    } 
  }
  
  public static <T> Constructor<T> ZK(Class<T> paramClass, boolean paramBoolean) throws IllegalArgumentException {
    try {
      Constructor<T> constructor = paramClass.getDeclaredConstructor(new Class[0]);
      try {
        if (paramBoolean) {
          ZR(constructor, paramBoolean);
        } else {
          try {
            if (!Modifier.isPublic(constructor.getModifiers()))
              throw new IllegalArgumentException(a(-1466, 1463) + paramClass.getName() + a(-1462, -17790)); 
          } catch (NoSuchMethodException noSuchMethodException) {
            throw a(null);
          } 
        } 
      } catch (NoSuchMethodException noSuchMethodException) {
        throw a(null);
      } 
      return constructor;
    } catch (NoSuchMethodException noSuchMethodException) {
    
    } catch (Exception exception) {
      ZR(exception, a(-1452, 26245) + paramClass.getName() + a(-1453, 28257) + exception.getMessage());
    } 
    return null;
  }
  
  public static Class<?> Zs(Object paramObject) {
    try {
      if (paramObject == null)
        return null; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return paramObject.getClass();
  }
  
  public static Class<?> ZB(Zk paramZk) {
    try {
      if (paramZk == null)
        return null; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return paramZk.Zf();
  }
  
  public static <T> T ZO(T paramT1, T paramT2) {
    try {
    
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return (paramT1 == null) ? paramT2 : paramT1;
  }
  
  public static String Zh(Object paramObject) {
    try {
      if (paramObject == null)
        return null; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return paramObject.toString();
  }
  
  public static String ZH(String paramString) {
    try {
      if (paramString == null)
        return ""; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return paramString;
  }
  
  public static String Zn(Object paramObject, String paramString) {
    try {
      if (paramObject == null)
        return paramString; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return String.format(a(-1468, 23833), new Object[] { paramObject });
  }
  
  public static String Zy(Object paramObject) {
    try {
      if (paramObject == null)
        return a(-1432, 7565); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
    
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    Class<?> clazz = (paramObject instanceof Class) ? (Class)paramObject : paramObject.getClass();
    return Za(clazz);
  }
  
  public static String ZN(Zk paramZk) {
    int i = ZY();
    try {
      if (paramZk == null)
        return a(-1460, 3383); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    byte b = 0;
    while (paramZk.ZC()) {
      b++;
      paramZk = paramZk.ZB();
      if (i != 0)
        break; 
    } 
    StringBuilder stringBuilder = (new StringBuilder(80)).append('`');
    stringBuilder.append(paramZk.Zy());
    while (b-- > 0) {
      stringBuilder.append(a(-1463, -15564));
      if (i != 0)
        break; 
    } 
    return stringBuilder.append('`').toString();
  }
  
  public static String ZZ(Object paramObject) {
    try {
      if (paramObject == null)
        return a(-1460, 3383); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
    
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    Class<?> clazz = (paramObject instanceof Class) ? (Class)paramObject : paramObject.getClass();
    return Za(clazz);
  }
  
  public static String Za(Class<?> paramClass) {
    try {
      if (paramClass == null)
        return a(-1460, 3383); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    byte b = 0;
    while (paramClass.isArray()) {
      b++;
      paramClass = paramClass.getComponentType();
    } 
    try {
    
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    String str = paramClass.isPrimitive() ? paramClass.getSimpleName() : paramClass.getName();
    if (b > 0) {
      StringBuilder stringBuilder = new StringBuilder(str);
      while (true) {
        stringBuilder.append(a(-1458, 26601));
        if (--b <= 0) {
          str = stringBuilder.toString();
          break;
        } 
      } 
    } 
    return Zj(str);
  }
  
  public static String ZN(Zn paramZn) {
    try {
      if (paramZn == null)
        return a(-1460, 3383); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return ZK(paramZn.ZT());
  }
  
  public static String ZA(String paramString) {
    try {
      if (paramString == null)
        return a(-1460, 3383); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return ZK(paramString);
  }
  
  public static String Zk(Zr paramZr) {
    try {
      if (paramZr == null)
        return a(-1457, -29693); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return ZK(paramZr.Zb());
  }
  
  public static String Zj(String paramString) {
    try {
      if (paramString == null)
        return a(-1460, 3383); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return (new StringBuilder(paramString.length() + 2)).append('`').append(paramString).append('`').toString();
  }
  
  public static String ZK(String paramString) {
    try {
      if (paramString == null)
        return a(-1460, 3383); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return (new StringBuilder(paramString.length() + 2)).append('\'').append(paramString).append('\'').toString();
  }
  
  public static String Zr(Throwable paramThrowable) {
    try {
      if (paramThrowable instanceof Zd)
        return ((Zd)paramThrowable).ZU(); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramThrowable instanceof java.lang.reflect.InvocationTargetException)
        try {
          if (paramThrowable.getCause() != null)
            return paramThrowable.getCause().getMessage(); 
        } catch (SecurityException securityException) {
          throw a(null);
        }  
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return paramThrowable.getMessage();
  }
  
  public static Object ZJ(Class<?> paramClass) {
    try {
      if (paramClass == int.class)
        return Integer.valueOf(0); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == long.class)
        return Long.valueOf(0L); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == boolean.class)
        return Boolean.FALSE; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == double.class)
        return Double.valueOf(0.0D); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == float.class)
        return Float.valueOf(0.0F); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == byte.class)
        return Byte.valueOf((byte)0); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == short.class)
        return Short.valueOf((short)0); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == char.class)
        return Character.valueOf(false); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(a(-1430, -4565) + paramClass.getName() + a(-1448, -29982));
  }
  
  public static Class<?> ZP(Class<?> paramClass) {
    try {
      if (paramClass == int.class)
        return Integer.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == long.class)
        return Long.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == boolean.class)
        return Boolean.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == double.class)
        return Double.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == float.class)
        return Float.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == byte.class)
        return Byte.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == short.class)
        return Short.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == char.class)
        return Character.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(a(-1430, -4565) + paramClass.getName() + a(-1443, 28765));
  }
  
  public static Class<?> ZS(Class<?> paramClass) {
    try {
      if (paramClass.isPrimitive())
        return paramClass; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == Integer.class)
        return int.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == Long.class)
        return long.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == Boolean.class)
        return boolean.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == Double.class)
        return double.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == Float.class)
        return float.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == Byte.class)
        return byte.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == Short.class)
        return short.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    try {
      if (paramClass == Character.class)
        return char.class; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return null;
  }
  
  public static void ZR(Member paramMember, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: checkcast java/lang/reflect/AccessibleObject
    //   4: astore_2
    //   5: aload_0
    //   6: invokeinterface getDeclaringClass : ()Ljava/lang/Class;
    //   11: astore_3
    //   12: aload_0
    //   13: invokeinterface getModifiers : ()I
    //   18: invokestatic isPublic : (I)Z
    //   21: ifeq -> 49
    //   24: aload_3
    //   25: invokevirtual getModifiers : ()I
    //   28: invokestatic isPublic : (I)Z
    //   31: ifeq -> 49
    //   34: goto -> 41
    //   37: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   40: athrow
    //   41: iconst_1
    //   42: goto -> 50
    //   45: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   48: athrow
    //   49: iconst_0
    //   50: istore #4
    //   52: iload #4
    //   54: ifeq -> 82
    //   57: iload_1
    //   58: ifeq -> 94
    //   61: goto -> 68
    //   64: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   67: athrow
    //   68: aload_3
    //   69: invokestatic ZK : (Ljava/lang/Class;)Z
    //   72: ifne -> 94
    //   75: goto -> 82
    //   78: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   81: athrow
    //   82: aload_2
    //   83: iconst_1
    //   84: invokevirtual setAccessible : (Z)V
    //   87: goto -> 94
    //   90: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   93: athrow
    //   94: goto -> 291
    //   97: astore_3
    //   98: aload_2
    //   99: invokevirtual isAccessible : ()Z
    //   102: ifne -> 186
    //   105: aload_0
    //   106: invokeinterface getDeclaringClass : ()Ljava/lang/Class;
    //   111: astore #4
    //   113: new java/lang/IllegalArgumentException
    //   116: dup
    //   117: new java/lang/StringBuilder
    //   120: dup
    //   121: invokespecial <init> : ()V
    //   124: sipush #-1459
    //   127: sipush #-9444
    //   130: invokestatic a : (II)Ljava/lang/String;
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: aload_0
    //   137: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   140: sipush #-1442
    //   143: sipush #-26393
    //   146: invokestatic a : (II)Ljava/lang/String;
    //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload #4
    //   154: invokevirtual getName : ()Ljava/lang/String;
    //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: sipush #-1455
    //   163: sipush #13399
    //   166: invokestatic a : (II)Ljava/lang/String;
    //   169: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: aload_3
    //   173: invokevirtual getMessage : ()Ljava/lang/String;
    //   176: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   179: invokevirtual toString : ()Ljava/lang/String;
    //   182: invokespecial <init> : (Ljava/lang/String;)V
    //   185: athrow
    //   186: goto -> 291
    //   189: astore_3
    //   190: sipush #-1472
    //   193: sipush #-14410
    //   196: invokestatic a : (II)Ljava/lang/String;
    //   199: aload_3
    //   200: invokevirtual getClass : ()Ljava/lang/Class;
    //   203: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   206: invokevirtual equals : (Ljava/lang/Object;)Z
    //   209: ifeq -> 289
    //   212: new java/lang/IllegalArgumentException
    //   215: dup
    //   216: sipush #-1444
    //   219: sipush #18635
    //   222: invokestatic a : (II)Ljava/lang/String;
    //   225: iconst_5
    //   226: anewarray java/lang/Object
    //   229: dup
    //   230: iconst_0
    //   231: aload_0
    //   232: invokevirtual getClass : ()Ljava/lang/Class;
    //   235: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   238: aastore
    //   239: dup
    //   240: iconst_1
    //   241: aload_0
    //   242: invokeinterface getName : ()Ljava/lang/String;
    //   247: aastore
    //   248: dup
    //   249: iconst_2
    //   250: aload_0
    //   251: invokeinterface getDeclaringClass : ()Ljava/lang/Class;
    //   256: invokestatic Za : (Ljava/lang/Class;)Ljava/lang/String;
    //   259: aastore
    //   260: dup
    //   261: iconst_3
    //   262: aload_3
    //   263: invokevirtual getClass : ()Ljava/lang/Class;
    //   266: invokevirtual getName : ()Ljava/lang/String;
    //   269: aastore
    //   270: dup
    //   271: iconst_4
    //   272: aload_3
    //   273: invokevirtual getMessage : ()Ljava/lang/String;
    //   276: aastore
    //   277: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   280: aload_3
    //   281: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   284: athrow
    //   285: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   288: athrow
    //   289: aload_3
    //   290: athrow
    //   291: return
    // Exception table:
    //   from	to	target	type
    //   5	94	97	java/lang/SecurityException
    //   5	94	189	java/lang/RuntimeException
    //   12	34	37	java/lang/SecurityException
    //   24	45	45	java/lang/SecurityException
    //   52	61	64	java/lang/SecurityException
    //   57	75	78	java/lang/SecurityException
    //   68	87	90	java/lang/SecurityException
    //   190	285	285	java/lang/SecurityException
  }
  
  public static boolean Zb(Class<?> paramClass) {
    return Enum.class.isAssignableFrom(paramClass);
  }
  
  public static Class<? extends Enum<?>> ZF(EnumSet<?> paramEnumSet) {
    try {
      if (!paramEnumSet.isEmpty())
        return ZZ(paramEnumSet.iterator().next()); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return Zy.Zu.Zu(paramEnumSet);
  }
  
  public static Class<? extends Enum<?>> ZU(EnumMap<?, ?> paramEnumMap) {
    try {
      if (!paramEnumMap.isEmpty())
        return ZZ(paramEnumMap.keySet().iterator().next()); 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return Zy.Zu.ZU(paramEnumMap);
  }
  
  public static Class<? extends Enum<?>> ZZ(Enum<?> paramEnum) {
    return (Class)paramEnum.getDeclaringClass();
  }
  
  public static Class<? extends Enum<?>> ZI(Class<?> paramClass) {
    if (paramClass.getSuperclass() != Enum.class)
      paramClass = paramClass.getSuperclass(); 
    return (Class)paramClass;
  }
  
  public static <T extends Annotation> Enum<?> ZR(Class<Enum<?>> paramClass, Class<T> paramClass1) {
    Field[] arrayOfField1 = paramClass.getDeclaredFields();
    Field[] arrayOfField2 = arrayOfField1;
    int j = arrayOfField2.length;
    int i = Zo();
    byte b = 0;
    while (b < j) {
      Field field = arrayOfField2[b];
      if (field.isEnumConstant()) {
        Object object = field.getAnnotation((Class)paramClass1);
        if (object != null) {
          String str = field.getName();
          Enum[] arrayOfEnum = (Enum[])paramClass.getEnumConstants();
          int k = arrayOfEnum.length;
          byte b1 = 0;
          while (b1 < k) {
            Enum<?> enum_ = arrayOfEnum[b1];
            try {
              if (str.equals(enum_.name()))
                return enum_; 
            } catch (SecurityException securityException) {
              throw a(null);
            } 
            b1++;
            if (i == 0)
              break; 
          } 
        } 
      } 
      b++;
      if (i == 0)
        break; 
    } 
    return null;
  }
  
  public static boolean ZI(Object paramObject) {
    try {
      if (paramObject != null) {
        try {
          if (ZF(paramObject.getClass()));
        } catch (SecurityException securityException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
  }
  
  public static boolean ZF(Class<?> paramClass) {
    try {
    
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return (paramClass.getAnnotation(Zl.class) != null);
  }
  
  public static boolean ZK(Class<?> paramClass) {
    String str = paramClass.getName();
    try {
      if (!str.startsWith(a(-1447, -30772)))
        try {
          if (!str.startsWith(a(-1450, -15688))) {
            try {
              if (str.startsWith(a(-1441, -17242)));
            } catch (SecurityException securityException) {
              throw a(null);
            } 
            return false;
          } 
        } catch (SecurityException securityException) {
          throw a(null);
        }  
    } catch (SecurityException securityException) {
      throw a(null);
    } 
  }
  
  public static boolean Zg(Class<?> paramClass) {
    try {
      if (!Modifier.isStatic(paramClass.getModifiers()))
        try {
          if (ZO(paramClass) != null);
        } catch (SecurityException securityException) {
          throw a(null);
        }  
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return false;
  }
  
  public static boolean ZX(Class<?> paramClass) {
    try {
      if (!ZD(paramClass))
        try {
          if (paramClass.getEnclosingMethod() != null);
        } catch (SecurityException securityException) {
          throw a(null);
        }  
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return false;
  }
  
  public static Annotation[] ZC(Class<?> paramClass) {
    try {
      if (ZD(paramClass))
        return Zw; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return paramClass.getDeclaredAnnotations();
  }
  
  public static Method[] ZB(Class<?> paramClass) {
    try {
      return paramClass.getDeclaredMethods();
    } catch (NoClassDefFoundError noClassDefFoundError) {
      Class<?> clazz;
      ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
      try {
        if (classLoader == null)
          return ZQ(paramClass, noClassDefFoundError); 
      } catch (NoClassDefFoundError noClassDefFoundError1) {
        throw a(null);
      } 
      try {
        clazz = classLoader.loadClass(paramClass.getName());
      } catch (ClassNotFoundException classNotFoundException) {
        noClassDefFoundError.addSuppressed(classNotFoundException);
        return ZQ(paramClass, noClassDefFoundError);
      } 
      try {
        return clazz.getDeclaredMethods();
      } catch (Exception exception) {
        return ZQ(paramClass, exception);
      } 
    } catch (Exception exception) {
      return ZQ(paramClass, exception);
    } 
  }
  
  private static Method[] ZQ(Class<?> paramClass, Throwable paramThrowable) throws IllegalArgumentException {
    throw new IllegalArgumentException(String.format(a(-1431, 27351), new Object[] { paramClass.getName(), paramThrowable.getClass().getName(), paramThrowable.getMessage() }), paramThrowable);
  }
  
  public static Ze7[] Zd(Class<?> paramClass) {
    int i = ZY();
    try {
      if (!paramClass.isInterface())
        try {
          if (!ZD(paramClass)) {
            Constructor[] arrayOfConstructor = (Constructor[])paramClass.getDeclaredConstructors();
            int j = arrayOfConstructor.length;
            Ze7[] arrayOfZe7 = new Ze7[j];
            byte b = 0;
            while (b < j) {
              arrayOfZe7[b] = new Ze7(arrayOfConstructor[b]);
              b++;
              if (i != 0)
                break; 
            } 
            return arrayOfZe7;
          } 
          return ZE;
        } catch (SecurityException securityException) {
          throw a(null);
        }  
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return ZE;
  }
  
  public static Type ZH(Class<?> paramClass) {
    return paramClass.getGenericSuperclass();
  }
  
  public static Type[] ZG(Class<?> paramClass) {
    return paramClass.getGenericInterfaces();
  }
  
  public static Class<?> ZO(Class<?> paramClass) {
    try {
    
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return ZD(paramClass) ? null : paramClass.getEnclosingClass();
  }
  
  private static Class<?>[] Zx(Class<?> paramClass) {
    return paramClass.getInterfaces();
  }
  
  static {
    // Byte code:
    //   0: bipush #36
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_2
    //   8: iconst_0
    //   9: istore_3
    //   10: invokestatic ZD : (I)V
    //   13: ldc 'ã\\r2áûçî0]YYè_usXjø(Cì£åb$äXh~°­%9«\\n\\n_°iß§®Woe¹Å[zº!²$_YW#Fz×¦A6­Ã,èDcÎ;¸?U\\n SJGR[Vïÿ´J*¡R·ZðEüçl¬AÖÎ Â*!=@k?­óR±ÉLÎÌËÁúÏëÝ&6$³.ºV´÷¨ÉÅ\\fø¦2¥utÕMDv\\ná&¸\\tæµü¬hæ§ô0cd¦ÖºÎ3V6ºgå\\rÀtd\\fá«_ù(ËU_t<âçÚòLõ¸I73Ëé\\f+ódîÔ§tfÝQ¿\\nUWèru/§è©\\r¤e-'wÛüÏLÏî[Üg$²é,¿Ò7P»{?Û\\n\\tñ\\f(A/»x´\ÊÛîÖÜ`ì=°AxËÿMK®¥\\rÐõrâÏ¹ôjvÔj#Æ¶çÄHK?EÀ¤NC°Åz,±`ï»08oBvn8PDO~¢G!rP·q3¤é\\nòÏ4Ðpjq¶ìeõ<qA¥ZÄÉë1ùÆUÖÞñ#õÅÛÌÏ·^Áªt\\rþ¤èke1owG"{±¬3èW(@¦{ü0â¶#\\n çQP(4@2l2[òëÂ}ý P Ê¨Õ9{h]W8Q©¥GÓG·Ø{@\\tvñm^~Þ1à¿úõ1]ÖnôF×Ì\\b#Â÷Æ¢H»~#áíM[\\näÛ5¼òL@,,*¸átükCÒ <ùÔeëW- gó³sæj¼Ú}ØÒý«µèw«±*é>.õÂâ-!ô¾åÄ¾öÃìµHê¹Dä£¯\\f4~4}~±»Ôgw?îá}«øµVaÝ]EÑW6UDs=GX/'4Ú¡H«S.D£Ä>ó­GîÄD'×köè'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: iconst_2
    //   23: istore_1
    //   24: iconst_m1
    //   25: istore_0
    //   26: bipush #10
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 146
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: ldc '½¦àIyTët2C ^#Ø\\bt8)\\fòåeX.Ö'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #28
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #33
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic com/fasterxml/Zm/Zx.a : [Ljava/lang/String;
    //   135: bipush #36
    //   137: anewarray java/lang/String
    //   140: putstatic com/fasterxml/Zm/Zx.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #80
    //   218: goto -> 248
    //   221: bipush #43
    //   223: goto -> 248
    //   226: bipush #126
    //   228: goto -> 248
    //   231: bipush #22
    //   233: goto -> 248
    //   236: bipush #118
    //   238: goto -> 248
    //   241: bipush #39
    //   243: goto -> 248
    //   246: bipush #95
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: ldc java/lang/Object
    //   306: putstatic com/fasterxml/Zm/Zx.ZI : Ljava/lang/Class;
    //   309: iconst_0
    //   310: anewarray java/lang/annotation/Annotation
    //   313: putstatic com/fasterxml/Zm/Zx.Zw : [Ljava/lang/annotation/Annotation;
    //   316: iconst_0
    //   317: anewarray com/fasterxml/Zm/Ze7
    //   320: putstatic com/fasterxml/Zm/Zx.ZE : [Lcom/fasterxml/Zm/Ze7;
    //   323: invokestatic emptyIterator : ()Ljava/util/Iterator;
    //   326: putstatic com/fasterxml/Zm/Zx.ZZ : Ljava/util/Iterator;
    //   329: return
  }
  
  public static void ZD(int paramInt) {
    ZW = paramInt;
  }
  
  public static int Zo() {
    return ZW;
  }
  
  public static int ZY() {
    int i = Zo();
    try {
      if (i == 0)
        return 11; 
    } catch (SecurityException securityException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFFA49) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      byte b1 = 46;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */