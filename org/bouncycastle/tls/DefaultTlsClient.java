package org.bouncycastle.tls;

import org.bouncycastle.tls.crypto.TlsCrypto;

public abstract class DefaultTlsClient extends AbstractTlsClient {
  private static final int[] DEFAULT_CIPHER_SUITES = new int[] { 
      4867, 4865, 52393, 49195, 49187, 49161, 52392, 49199, 49191, 49171, 
      52394, 158, 103, 51 };
  
  public DefaultTlsClient(TlsCrypto paramTlsCrypto) {
    super(paramTlsCrypto);
  }
  
  protected int[] getSupportedCipherSuites() {
    return TlsUtils.getSupportedCipherSuites(getCrypto(), DEFAULT_CIPHER_SUITES);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\DefaultTlsClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */