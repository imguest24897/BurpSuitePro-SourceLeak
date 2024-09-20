package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.jsse.provider.PropertyUtils;

abstract class FipsUtils {
  private static final boolean provAllowGCMCiphersIn12 = false;
  
  private static final boolean provAllowRSAKeyExchange = PropertyUtils.getBooleanSystemProperty("org.bouncycastle.jsse.fips.allowRSAKeyExchange", false);
  
  private static final Set<String> FIPS_SUPPORTED_CIPHERSUITES = createFipsSupportedCipherSuites();
  
  private static final Set<String> FIPS_SUPPORTED_PROTOCOLS = createFipsSupportedProtocols();
  
  private static Set<String> createFipsSupportedCipherSuites() {
    HashSet<String> hashSet = new HashSet();
    hashSet.add("TLS_AES_128_CCM_8_SHA256");
    hashSet.add("TLS_AES_128_CCM_SHA256");
    hashSet.add("TLS_AES_128_GCM_SHA256");
    hashSet.add("TLS_AES_256_GCM_SHA384");
    hashSet.add("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
    hashSet.add("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
    hashSet.add("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
    hashSet.add("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
    hashSet.add("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
    hashSet.add("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
    hashSet.add("TLS_DHE_RSA_WITH_AES_128_CCM");
    hashSet.add("TLS_DHE_RSA_WITH_AES_128_CCM_8");
    hashSet.add("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
    hashSet.add("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
    hashSet.add("TLS_DHE_RSA_WITH_AES_256_CCM");
    hashSet.add("TLS_DHE_RSA_WITH_AES_256_CCM_8");
    hashSet.add("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
    hashSet.add("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
    hashSet.add("TLS_ECDHE_ECDSA_WITH_AES_128_CCM");
    hashSet.add("TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8");
    hashSet.add("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
    hashSet.add("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
    hashSet.add("TLS_ECDHE_ECDSA_WITH_AES_256_CCM");
    hashSet.add("TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8");
    hashSet.add("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    hashSet.add("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
    hashSet.add("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    hashSet.add("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
    if (provAllowRSAKeyExchange) {
      hashSet.add("TLS_RSA_WITH_AES_128_CBC_SHA");
      hashSet.add("TLS_RSA_WITH_AES_128_CBC_SHA256");
      hashSet.add("TLS_RSA_WITH_AES_128_CCM");
      hashSet.add("TLS_RSA_WITH_AES_128_CCM_8");
      hashSet.add("TLS_RSA_WITH_AES_256_CBC_SHA");
      hashSet.add("TLS_RSA_WITH_AES_256_CBC_SHA256");
      hashSet.add("TLS_RSA_WITH_AES_256_CCM");
      hashSet.add("TLS_RSA_WITH_AES_256_CCM_8");
    } 
    return Collections.unmodifiableSet(hashSet);
  }
  
  private static Set<String> createFipsSupportedProtocols() {
    HashSet<String> hashSet = new HashSet();
    hashSet.add("TLSv1");
    hashSet.add("TLSv1.1");
    hashSet.add("TLSv1.2");
    hashSet.add("TLSv1.3");
    return Collections.unmodifiableSet(hashSet);
  }
  
  static boolean isFipsCipherSuite(String paramString) {
    return (paramString != null && FIPS_SUPPORTED_CIPHERSUITES.contains(paramString));
  }
  
  static boolean isFipsNamedGroup(int paramInt) {
    switch (paramInt) {
      case 23:
      case 24:
      case 25:
      case 256:
      case 257:
      case 258:
      case 259:
      case 260:
        return true;
    } 
    return false;
  }
  
  static boolean isFipsProtocol(String paramString) {
    return (paramString != null && FIPS_SUPPORTED_PROTOCOLS.contains(paramString));
  }
  
  static boolean isFipsSignatureScheme(int paramInt) {
    switch (paramInt) {
      case 513:
      case 514:
      case 515:
      case 769:
      case 770:
      case 771:
      case 1025:
      case 1026:
      case 1027:
      case 1281:
      case 1283:
      case 1537:
      case 1539:
      case 2052:
      case 2053:
      case 2054:
      case 2057:
      case 2058:
      case 2059:
        return true;
    } 
    return false;
  }
  
  static void removeNonFipsCipherSuites(Collection<String> paramCollection) {
    paramCollection.retainAll(FIPS_SUPPORTED_CIPHERSUITES);
  }
  
  static void removeNonFipsProtocols(Collection<String> paramCollection) {
    paramCollection.retainAll(FIPS_SUPPORTED_PROTOCOLS);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\FipsUtils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */