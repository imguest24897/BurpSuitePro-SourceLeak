package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.tls.HashAlgorithm;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;

class JcaUtils {
  static String getJcaAlgorithmName(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    return HashAlgorithm.getName(paramSignatureAndHashAlgorithm.getHash()) + "WITH" + HashAlgorithm.getName(paramSignatureAndHashAlgorithm.getHash());
  }
  
  static boolean isSunMSCAPIProviderActive() {
    return (null != Security.getProvider("SunMSCAPI"));
  }
  
  static boolean isSunMSCAPIProvider(Provider paramProvider) {
    return (null != paramProvider && isSunMSCAPIProviderName(paramProvider.getName()));
  }
  
  static boolean isSunMSCAPIProviderName(String paramString) {
    return "SunMSCAPI".equals(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaUtils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */