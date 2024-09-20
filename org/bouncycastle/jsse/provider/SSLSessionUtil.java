package org.bouncycastle.jsse.provider;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSession;
import org.bouncycastle.jsse.BCExtendedSSLSession;

abstract class SSLSessionUtil {
  private static final Class<?> extendedSSLSessionClass;
  
  private static final Constructor<? extends SSLSession> exportSSLSessionConstructor;
  
  private static final Constructor<? extends BCExtendedSSLSession> importSSLSessionConstructor;
  
  static SSLSession exportSSLSession(BCExtendedSSLSession paramBCExtendedSSLSession) {
    if (paramBCExtendedSSLSession instanceof ImportSSLSession)
      return ((ImportSSLSession)paramBCExtendedSSLSession).unwrap(); 
    if (null != exportSSLSessionConstructor)
      try {
        return exportSSLSessionConstructor.newInstance(new Object[] { paramBCExtendedSSLSession });
      } catch (Exception exception) {} 
    return new ExportSSLSession_5(paramBCExtendedSSLSession);
  }
  
  static BCExtendedSSLSession importSSLSession(SSLSession paramSSLSession) {
    if (paramSSLSession instanceof BCExtendedSSLSession)
      return (BCExtendedSSLSession)paramSSLSession; 
    if (paramSSLSession instanceof ExportSSLSession)
      return ((ExportSSLSession)paramSSLSession).unwrap(); 
    if (null != importSSLSessionConstructor && extendedSSLSessionClass.isInstance(paramSSLSession))
      try {
        return importSSLSessionConstructor.newInstance(new Object[] { paramSSLSession });
      } catch (Exception exception) {} 
    return new ImportSSLSession_5(paramSSLSession);
  }
  
  static {
    Class<?> clazz = null;
    try {
      clazz = ReflectionUtil.getClass("javax.net.ssl.ExtendedSSLSession");
    } catch (Exception exception) {}
    extendedSSLSessionClass = clazz;
    clazz = null;
    try {
      Method[] arrayOfMethod = ReflectionUtil.getMethods("javax.net.ssl.ExtendedSSLSession");
      if (null != arrayOfMethod) {
        String str;
        if (ReflectionUtil.hasMethod(arrayOfMethod, "getRequestedServerNames")) {
          str = "org.bouncycastle.jsse.provider.ExportSSLSession_8";
        } else {
          str = "org.bouncycastle.jsse.provider.ExportSSLSession_7";
        } 
        constructor = ReflectionUtil.getDeclaredConstructor(str, new Class[] { BCExtendedSSLSession.class });
      } 
    } catch (Exception exception) {}
    exportSSLSessionConstructor = (Constructor)constructor;
    Constructor<?> constructor = null;
    if (null != extendedSSLSessionClass)
      try {
        Method[] arrayOfMethod = ReflectionUtil.getMethods("javax.net.ssl.ExtendedSSLSession");
        if (null != arrayOfMethod) {
          String str;
          if (ReflectionUtil.hasMethod(arrayOfMethod, "getRequestedServerNames")) {
            str = "org.bouncycastle.jsse.provider.ImportSSLSession_8";
          } else {
            str = "org.bouncycastle.jsse.provider.ImportSSLSession_7";
          } 
          constructor = ReflectionUtil.getDeclaredConstructor(str, new Class[] { extendedSSLSessionClass });
        } 
      } catch (Exception exception) {} 
    importSSLSessionConstructor = (Constructor)constructor;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\SSLSessionUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */