package org.bouncycastle.jsse.provider;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.logging.Logger;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jsse.BCX509ExtendedTrustManager;

abstract class X509TrustManagerUtil {
  private static final Logger LOG = Logger.getLogger(X509TrustManagerUtil.class.getName());
  
  private static final Class<?> x509ExtendedTrustManagerClass;
  
  private static final Constructor<? extends X509TrustManager> exportX509TrustManagerConstructor;
  
  private static final Constructor<? extends BCX509ExtendedTrustManager> importX509TrustManagerConstructor;
  
  static X509TrustManager exportX509TrustManager(BCX509ExtendedTrustManager paramBCX509ExtendedTrustManager) {
    if (paramBCX509ExtendedTrustManager instanceof ImportX509TrustManager)
      return ((ImportX509TrustManager)paramBCX509ExtendedTrustManager).unwrap(); 
    if (null != exportX509TrustManagerConstructor)
      try {
        return exportX509TrustManagerConstructor.newInstance(new Object[] { paramBCX509ExtendedTrustManager });
      } catch (Exception exception) {} 
    return new ExportX509TrustManager_5(paramBCX509ExtendedTrustManager);
  }
  
  static BCX509ExtendedTrustManager importX509TrustManager(boolean paramBoolean, JcaJceHelper paramJcaJceHelper, X509TrustManager paramX509TrustManager) {
    LOG.fine("Importing X509TrustManager implementation: " + paramX509TrustManager.getClass().getName());
    if (paramX509TrustManager instanceof BCX509ExtendedTrustManager)
      return (BCX509ExtendedTrustManager)paramX509TrustManager; 
    if (paramX509TrustManager instanceof ExportX509TrustManager)
      return ((ExportX509TrustManager)paramX509TrustManager).unwrap(); 
    if (null != importX509TrustManagerConstructor && x509ExtendedTrustManagerClass.isInstance(paramX509TrustManager))
      try {
        return importX509TrustManagerConstructor.newInstance(new Object[] { paramX509TrustManager });
      } catch (Exception exception) {} 
    return new ImportX509TrustManager_5(paramBoolean, paramJcaJceHelper, paramX509TrustManager);
  }
  
  static {
    Class<?> clazz = null;
    try {
      clazz = ReflectionUtil.getClass("javax.net.ssl.X509ExtendedTrustManager");
    } catch (Exception exception) {}
    x509ExtendedTrustManagerClass = clazz;
    clazz = null;
    try {
      Method[] arrayOfMethod = ReflectionUtil.getMethods("javax.net.ssl.X509ExtendedTrustManager");
      if (null != arrayOfMethod) {
        String str = "org.bouncycastle.jsse.provider.ExportX509TrustManager_7";
        constructor = ReflectionUtil.getDeclaredConstructor(str, new Class[] { BCX509ExtendedTrustManager.class });
      } 
    } catch (Exception exception) {}
    exportX509TrustManagerConstructor = (Constructor)constructor;
    Constructor<?> constructor = null;
    if (null != x509ExtendedTrustManagerClass)
      try {
        String str = "org.bouncycastle.jsse.provider.ImportX509TrustManager_7";
        constructor = ReflectionUtil.getDeclaredConstructor(str, new Class[] { x509ExtendedTrustManagerClass });
      } catch (Exception exception) {} 
    importX509TrustManagerConstructor = (Constructor)constructor;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\X509TrustManagerUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */