package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.AbstractTlsKeyExchange;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.DigestInputBuffer;
import org.bouncycastle.tls.TlsCredentialedSigner;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsDHGroupVerifier;
import org.bouncycastle.tls.TlsDHUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.io.TeeInputStream;

public class TlsDHEKeyExchange extends AbstractTlsKeyExchange {
  protected TlsDHGroupVerifier dhGroupVerifier;
  
  protected TlsDHConfig dhConfig;
  
  protected TlsCredentialedSigner serverCredentials = null;
  
  protected TlsCertificate serverCertificate = null;
  
  protected TlsAgreement agreement;
  
  private static int checkKeyExchange(int paramInt) {
    switch (paramInt) {
      case 3:
      case 5:
        return paramInt;
    } 
    throw new IllegalArgumentException("unsupported key exchange algorithm");
  }
  
  public TlsDHEKeyExchange(int paramInt, TlsDHGroupVerifier paramTlsDHGroupVerifier) {
    this(paramInt, paramTlsDHGroupVerifier, null);
  }
  
  public TlsDHEKeyExchange(int paramInt, TlsDHConfig paramTlsDHConfig) {
    this(paramInt, null, paramTlsDHConfig);
  }
  
  private TlsDHEKeyExchange(int paramInt, TlsDHGroupVerifier paramTlsDHGroupVerifier, TlsDHConfig paramTlsDHConfig) {
    super(checkKeyExchange(paramInt));
    this.dhGroupVerifier = paramTlsDHGroupVerifier;
    this.dhConfig = paramTlsDHConfig;
  }
  
  public void skipServerCredentials() throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public void processServerCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    this.serverCredentials = TlsUtils.requireSignerCredentials(paramTlsCredentials);
  }
  
  public void processServerCertificate(Certificate paramCertificate) throws IOException {
    this.serverCertificate = paramCertificate.getCertificateAt(0);
  }
  
  public boolean requiresServerKeyExchange() {
    return true;
  }
  
  public byte[] generateServerKeyExchange() throws IOException {
    DigestInputBuffer digestInputBuffer = new DigestInputBuffer();
    TlsDHUtils.writeDHConfig(this.dhConfig, (OutputStream)digestInputBuffer);
    this.agreement = this.context.getCrypto().createDHDomain(this.dhConfig).createDH();
    byte[] arrayOfByte = this.agreement.generateEphemeral();
    TlsUtils.writeOpaque16(arrayOfByte, (OutputStream)digestInputBuffer);
    TlsUtils.generateServerKeyExchangeSignature(this.context, this.serverCredentials, null, digestInputBuffer);
    return digestInputBuffer.toByteArray();
  }
  
  public void processServerKeyExchange(InputStream paramInputStream) throws IOException {
    DigestInputBuffer digestInputBuffer = new DigestInputBuffer();
    TeeInputStream teeInputStream = new TeeInputStream(paramInputStream, (OutputStream)digestInputBuffer);
    this.dhConfig = TlsDHUtils.receiveDHConfig(this.context, this.dhGroupVerifier, (InputStream)teeInputStream);
    byte[] arrayOfByte = TlsUtils.readOpaque16((InputStream)teeInputStream, 1);
    TlsUtils.verifyServerKeyExchangeSignature(this.context, paramInputStream, this.serverCertificate, null, digestInputBuffer);
    this.agreement = this.context.getCrypto().createDHDomain(this.dhConfig).createDH();
    this.agreement.receivePeerValue(arrayOfByte);
  }
  
  public short[] getClientCertificateTypes() {
    return new short[] { 2, 64, 1 };
  }
  
  public void processClientCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    TlsUtils.requireSignerCredentials(paramTlsCredentials);
  }
  
  public void generateClientKeyExchange(OutputStream paramOutputStream) throws IOException {
    byte[] arrayOfByte = this.agreement.generateEphemeral();
    TlsUtils.writeOpaque16(arrayOfByte, paramOutputStream);
  }
  
  public void processClientKeyExchange(InputStream paramInputStream) throws IOException {
    this.agreement.receivePeerValue(TlsUtils.readOpaque16(paramInputStream, 1));
  }
  
  public TlsSecret generatePreMasterSecret() throws IOException {
    return this.agreement.calculateSecret();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsDHEKeyExchange.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */