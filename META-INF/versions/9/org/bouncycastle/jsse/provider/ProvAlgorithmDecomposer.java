package META-INF.versions.9.org.bouncycastle.jsse.provider;

import java.util.Set;
import org.bouncycastle.jsse.provider.CipherSuiteInfo;
import org.bouncycastle.jsse.provider.JcaAlgorithmDecomposer;
import org.bouncycastle.jsse.provider.ProvSSLContextSpi;
import org.bouncycastle.tls.CipherSuite;

class ProvAlgorithmDecomposer extends JcaAlgorithmDecomposer {
  static final org.bouncycastle.jsse.provider.ProvAlgorithmDecomposer INSTANCE_TLS = new org.bouncycastle.jsse.provider.ProvAlgorithmDecomposer(true);
  
  static final org.bouncycastle.jsse.provider.ProvAlgorithmDecomposer INSTANCE_X509 = new org.bouncycastle.jsse.provider.ProvAlgorithmDecomposer(false);
  
  private final boolean enableTLSAlgorithms;
  
  private ProvAlgorithmDecomposer(boolean paramBoolean) {
    this.enableTLSAlgorithms = paramBoolean;
  }
  
  public Set<String> decompose(String paramString) {
    if (paramString.startsWith("TLS_")) {
      CipherSuiteInfo cipherSuiteInfo = ProvSSLContextSpi.getCipherSuiteInfo(paramString);
      if (null != cipherSuiteInfo && !CipherSuite.isSCSV(cipherSuiteInfo.getCipherSuite()))
        return this.enableTLSAlgorithms ? cipherSuiteInfo.getDecompositionTLS() : cipherSuiteInfo.getDecompositionX509(); 
    } 
    return super.decompose(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\jsse\provider\ProvAlgorithmDecomposer.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */