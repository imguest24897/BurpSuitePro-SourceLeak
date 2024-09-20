package org.bouncycastle.jsse.provider;

import java.security.cert.CertPathBuilder;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.Map;

abstract class PKIXUtil {
  private static final Class<?> pkixRevocationCheckerClass;
  
  static void addStatusResponses(CertPathBuilder paramCertPathBuilder, PKIXBuilderParameters paramPKIXBuilderParameters, Map<X509Certificate, byte[]> paramMap) {
    if (null != pkixRevocationCheckerClass)
      JsseUtils_8.addStatusResponses(paramCertPathBuilder, paramPKIXBuilderParameters, paramMap); 
  }
  
  static {
    Class<?> clazz = null;
    try {
      clazz = ReflectionUtil.getClass("java.security.cert.PKIXRevocationChecker");
    } catch (Exception exception) {}
    pkixRevocationCheckerClass = clazz;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\PKIXUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */