package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.security.cert.CertPathBuilder;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.Map;
import org.bouncycastle.jsse.provider.JsseUtils_8;

abstract class PKIXUtil {
  static void addStatusResponses(CertPathBuilder paramCertPathBuilder, PKIXBuilderParameters paramPKIXBuilderParameters, Map<X509Certificate, byte[]> paramMap) {
    JsseUtils_8.addStatusResponses(paramCertPathBuilder, paramPKIXBuilderParameters, paramMap);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\PKIXUtil.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */