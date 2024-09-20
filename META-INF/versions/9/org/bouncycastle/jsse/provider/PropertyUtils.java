package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.jsse.provider.JsseUtils;

class PropertyUtils {
  private static final Logger LOG = Logger.getLogger(org.bouncycastle.jsse.provider.PropertyUtils.class.getName());
  
  static String getSecurityProperty(String paramString) {
    return AccessController.<String>doPrivileged((PrivilegedAction<String>)new Object(paramString));
  }
  
  static String getSystemProperty(String paramString) {
    try {
      return AccessController.<String>doPrivileged((PrivilegedAction<String>)new Object(paramString));
    } catch (RuntimeException runtimeException) {
      LOG.log(Level.WARNING, "Failed to get system property", runtimeException);
      return null;
    } 
  }
  
  static boolean getBooleanSecurityProperty(String paramString, boolean paramBoolean) {
    String str = getSecurityProperty(paramString);
    if (null != str) {
      if ("true".equalsIgnoreCase(str)) {
        LOG.info("Found boolean security property [" + paramString + "]: true");
        return true;
      } 
      if ("false".equalsIgnoreCase(str)) {
        LOG.info("Found boolean security property [" + paramString + "]: false");
        return false;
      } 
      LOG.warning("Unrecognized value for boolean security property [" + paramString + "]: " + str);
    } 
    LOG.fine("Boolean security property [" + paramString + "] defaulted to: " + paramBoolean);
    return paramBoolean;
  }
  
  static boolean getBooleanSystemProperty(String paramString, boolean paramBoolean) {
    String str = getSystemProperty(paramString);
    if (null != str) {
      if ("true".equalsIgnoreCase(str)) {
        LOG.info("Found boolean system property [" + paramString + "]: true");
        return true;
      } 
      if ("false".equalsIgnoreCase(str)) {
        LOG.info("Found boolean system property [" + paramString + "]: false");
        return false;
      } 
      LOG.warning("Unrecognized value for boolean system property [" + paramString + "]: " + str);
    } 
    LOG.fine("Boolean system property [" + paramString + "] defaulted to: " + paramBoolean);
    return paramBoolean;
  }
  
  static int getIntegerSystemProperty(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    String str = getSystemProperty(paramString);
    if (null != str)
      try {
        int i = Integer.parseInt(str);
        if (i >= paramInt2 && i <= paramInt3) {
          LOG.info("Found integer system property [" + paramString + "]: " + i);
          return i;
        } 
        if (LOG.isLoggable(Level.WARNING)) {
          String str1 = getRangeString(paramInt2, paramInt3);
          LOG.warning("Out-of-range (" + str1 + ") integer system property [" + paramString + "]: " + str);
        } 
      } catch (Exception exception) {
        LOG.warning("Unrecognized value for integer system property [" + paramString + "]: " + str);
      }  
    LOG.fine("Integer system property [" + paramString + "] defaulted to: " + paramInt1);
    return paramInt1;
  }
  
  static String getSensitiveStringSystemProperty(String paramString) {
    String str = getSystemProperty(paramString);
    if (null != str) {
      LOG.info("Found sensitive string system property [" + paramString + "]");
      return str;
    } 
    return null;
  }
  
  static String getStringSecurityProperty(String paramString) {
    String str = getSecurityProperty(paramString);
    if (null != str) {
      LOG.info("Found string security property [" + paramString + "]: " + str);
      return str;
    } 
    return null;
  }
  
  static String getStringSecurityProperty(String paramString1, String paramString2) {
    String str = getSecurityProperty(paramString1);
    if (null != str) {
      LOG.info("Found string security property [" + paramString1 + "]: " + str);
      return str;
    } 
    LOG.warning("String security property [" + paramString1 + "] defaulted to: " + paramString2);
    return paramString2;
  }
  
  static String getStringSystemProperty(String paramString) {
    String str = getSystemProperty(paramString);
    if (null != str) {
      LOG.info("Found string system property [" + paramString + "]: " + str);
      return str;
    } 
    return null;
  }
  
  static String[] getStringArraySecurityProperty(String paramString1, String paramString2) {
    String str = getStringSecurityProperty(paramString1, paramString2);
    return parseStringArray(str);
  }
  
  static String[] getStringArraySystemProperty(String paramString) {
    String str = getStringSystemProperty(paramString);
    return parseStringArray(str);
  }
  
  private static String getRangeString(int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder(32);
    if (Integer.MIN_VALUE != paramInt1) {
      stringBuilder.append(paramInt1);
      stringBuilder.append(" <= ");
    } 
    stringBuilder.append('x');
    if (Integer.MAX_VALUE != paramInt2) {
      stringBuilder.append(" <= ");
      stringBuilder.append(paramInt2);
    } 
    return stringBuilder.toString();
  }
  
  private static String[] parseStringArray(String paramString) {
    if (null == paramString)
      return null; 
    String[] arrayOfString1 = JsseUtils.stripDoubleQuotes(paramString.trim()).split(",");
    String[] arrayOfString2 = new String[arrayOfString1.length];
    byte b = 0;
    for (String str : arrayOfString1) {
      str = str.trim();
      if (str.length() >= 1)
        arrayOfString2[b++] = str; 
    } 
    return JsseUtils.resize(arrayOfString2, b);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\PropertyUtils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */