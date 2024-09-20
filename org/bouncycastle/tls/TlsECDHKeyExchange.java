package org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsSecret;

public class TlsECDHKeyExchange extends AbstractTlsKeyExchange {
  protected TlsCredentialedAgreement agreementCredentials;
  
  protected TlsCertificate ecdhPeerCertificate;
  
  private static int checkKeyExchange(int paramInt) {
    switch (paramInt) {
      case 16:
      case 18:
        return paramInt;
    } 
    throw new IllegalArgumentException("unsupported key exchange algorithm");
  }
  
  public TlsECDHKeyExchange(int paramInt) {
    super(checkKeyExchange(paramInt));
  }
  
  public void skipServerCredentials() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public void processServerCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    this.agreementCredentials = TlsUtils.requireAgreementCredentials(paramTlsCredentials);
  }
  
  public void processServerCertificate(Certificate paramCertificate) throws IOException {
    this.ecdhPeerCertificate = paramCertificate.getCertificateAt(0).checkUsageInRole(2);
  }
  
  public short[] getClientCertificateTypes() {
    return new short[] { 66, 65 };
  }
  
  public void skipClientCredentials() throws IOException {
    throw new TlsFatalAlert((short)10);
  }
  
  public void processClientCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    this.agreementCredentials = TlsUtils.requireAgreementCredentials(paramTlsCredentials);
  }
  
  public void generateClientKeyExchange(OutputStream paramOutputStream) throws IOException {}
  
  public void processClientCertificate(Certificate paramCertificate) throws IOException {
    this.ecdhPeerCertificate = paramCertificate.getCertificateAt(0).checkUsageInRole(2);
  }
  
  public void processClientKeyExchange(InputStream paramInputStream) throws IOException {}
  
  public boolean requiresCertificateVerify() {
    return false;
  }
  
  public TlsSecret generatePreMasterSecret() throws IOException {
    return this.agreementCredentials.generateAgreement(this.ecdhPeerCertificate);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\TlsECDHKeyExchange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */