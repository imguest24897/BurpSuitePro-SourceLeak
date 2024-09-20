package org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsEncryptor;
import org.bouncycastle.tls.crypto.TlsSecret;

public class TlsRSAKeyExchange extends AbstractTlsKeyExchange {
  protected TlsCredentialedDecryptor serverCredentials = null;
  
  protected TlsEncryptor serverEncryptor;
  
  protected TlsSecret preMasterSecret;
  
  private static int checkKeyExchange(int paramInt) {
    switch (paramInt) {
      case 1:
        return paramInt;
    } 
    throw new IllegalArgumentException("unsupported key exchange algorithm");
  }
  
  public TlsRSAKeyExchange(int paramInt) {
    super(checkKeyExchange(paramInt));
  }
  
  public void skipServerCredentials() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public void processServerCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    this.serverCredentials = TlsUtils.requireDecryptorCredentials(paramTlsCredentials);
  }
  
  public void processServerCertificate(Certificate paramCertificate) throws IOException {
    this.serverEncryptor = paramCertificate.getCertificateAt(0).createEncryptor(3);
  }
  
  public short[] getClientCertificateTypes() {
    return new short[] { 1, 2, 64 };
  }
  
  public void processClientCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    TlsUtils.requireSignerCredentials(paramTlsCredentials);
  }
  
  public void generateClientKeyExchange(OutputStream paramOutputStream) throws IOException {
    this.preMasterSecret = TlsUtils.generateEncryptedPreMasterSecret(this.context, this.serverEncryptor, paramOutputStream);
  }
  
  public void processClientKeyExchange(InputStream paramInputStream) throws IOException {
    byte[] arrayOfByte = TlsUtils.readEncryptedPMS(this.context, paramInputStream);
    this.preMasterSecret = this.serverCredentials.decrypt(new TlsCryptoParameters(this.context), arrayOfByte);
  }
  
  public TlsSecret generatePreMasterSecret() throws IOException {
    TlsSecret tlsSecret = this.preMasterSecret;
    this.preMasterSecret = null;
    return tlsSecret;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsRSAKeyExchange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */