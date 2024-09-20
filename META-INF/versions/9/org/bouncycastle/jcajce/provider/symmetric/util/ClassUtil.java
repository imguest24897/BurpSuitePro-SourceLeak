package META-INF.versions.9.org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AccessController;
import java.security.PrivilegedAction;

public class ClassUtil {
  public static Class loadClass(Class paramClass, String paramString) {
    try {
      ClassLoader classLoader = paramClass.getClassLoader();
      return (classLoader != null) ? classLoader.loadClass(paramString) : AccessController.<Class<?>>doPrivileged((PrivilegedAction<Class<?>>)new Object(paramString));
    } catch (ClassNotFoundException classNotFoundException) {
      return null;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jcajce\provider\symmetri\\util\ClassUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */