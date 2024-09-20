package org.bouncycastle.jsse.provider;

import java.util.Set;
import org.bouncycastle.tls.CipherSuite;

class ProvAlgorithmDecomposer extends JcaAlgorithmDecomposer {
  static final ProvAlgorithmDecomposer INSTANCE_TLS = new ProvAlgorithmDecomposer(true);
  
  static final ProvAlgorithmDecomposer INSTANCE_X509 = new ProvAlgorithmDecomposer(false);
  
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jsse\provider\ProvAlgorithmDecomposer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */