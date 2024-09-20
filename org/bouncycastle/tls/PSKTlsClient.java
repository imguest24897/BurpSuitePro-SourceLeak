package org.bouncycastle.tls;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsCrypto;

public class PSKTlsClient extends AbstractTlsClient {
  private static final int[] DEFAULT_CIPHER_SUITES = new int[] { 52396, 49207, 49205, 52397, 170, 178, 144 };
  
  protected TlsPSKIdentity pskIdentity;
  
  public PSKTlsClient(TlsCrypto paramTlsCrypto, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    this(paramTlsCrypto, new BasicTlsPSKIdentity(paramArrayOfbyte1, paramArrayOfbyte2));
  }
  
  public PSKTlsClient(TlsCrypto paramTlsCrypto, TlsPSKIdentity paramTlsPSKIdentity) {
    super(paramTlsCrypto);
    this.pskIdentity = paramTlsPSKIdentity;
  }
  
  protected ProtocolVersion[] getSupportedVersions() {
    return ProtocolVersion.TLSv12.only();
  }
  
  protected int[] getSupportedCipherSuites() {
    return TlsUtils.getSupportedCipherSuites(getCrypto(), DEFAULT_CIPHER_SUITES);
  }
  
  public TlsPSKIdentity getPSKIdentity() {
    return this.pskIdentity;
  }
  
  public TlsAuthentication getAuthentication() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\PSKTlsClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */