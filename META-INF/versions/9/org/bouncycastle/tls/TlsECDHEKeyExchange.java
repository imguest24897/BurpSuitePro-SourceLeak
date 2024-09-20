package META-INF.versions.9.org.bouncycastle.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.AbstractTlsKeyExchange;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.DigestInputBuffer;
import org.bouncycastle.tls.TlsCredentialedSigner;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsECCUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.io.TeeInputStream;

public class TlsECDHEKeyExchange extends AbstractTlsKeyExchange {
  protected TlsECConfig ecConfig;
  
  protected TlsCredentialedSigner serverCredentials = null;
  
  protected TlsCertificate serverCertificate = null;
  
  protected TlsAgreement agreement;
  
  private static int checkKeyExchange(int paramInt) {
    switch (paramInt) {
      case 17:
      case 19:
        return paramInt;
    } 
    throw new IllegalArgumentException("unsupported key exchange algorithm");
  }
  
  public TlsECDHEKeyExchange(int paramInt) {
    this(paramInt, null);
  }
  
  public TlsECDHEKeyExchange(int paramInt, TlsECConfig paramTlsECConfig) {
    super(checkKeyExchange(paramInt));
    this.ecConfig = paramTlsECConfig;
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
    TlsECCUtils.writeECConfig(this.ecConfig, (OutputStream)digestInputBuffer);
    this.agreement = this.context.getCrypto().createECDomain(this.ecConfig).createECDH();
    generateEphemeral((OutputStream)digestInputBuffer);
    TlsUtils.generateServerKeyExchangeSignature(this.context, this.serverCredentials, null, digestInputBuffer);
    return digestInputBuffer.toByteArray();
  }
  
  public void processServerKeyExchange(InputStream paramInputStream) throws IOException {
    DigestInputBuffer digestInputBuffer = new DigestInputBuffer();
    TeeInputStream teeInputStream = new TeeInputStream(paramInputStream, (OutputStream)digestInputBuffer);
    this.ecConfig = TlsECCUtils.receiveECDHConfig(this.context, (InputStream)teeInputStream);
    byte[] arrayOfByte = TlsUtils.readOpaque8((InputStream)teeInputStream, 1);
    TlsUtils.verifyServerKeyExchangeSignature(this.context, paramInputStream, this.serverCertificate, null, digestInputBuffer);
    this.agreement = this.context.getCrypto().createECDomain(this.ecConfig).createECDH();
    processEphemeral(arrayOfByte);
  }
  
  public short[] getClientCertificateTypes() {
    return new short[] { 2, 64, 1 };
  }
  
  public void processClientCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    TlsUtils.requireSignerCredentials(paramTlsCredentials);
  }
  
  public void generateClientKeyExchange(OutputStream paramOutputStream) throws IOException {
    generateEphemeral(paramOutputStream);
  }
  
  public void processClientKeyExchange(InputStream paramInputStream) throws IOException {
    byte[] arrayOfByte = TlsUtils.readOpaque8(paramInputStream, 1);
    processEphemeral(arrayOfByte);
  }
  
  public TlsSecret generatePreMasterSecret() throws IOException {
    return this.agreement.calculateSecret();
  }
  
  protected void generateEphemeral(OutputStream paramOutputStream) throws IOException {
    byte[] arrayOfByte = this.agreement.generateEphemeral();
    TlsUtils.writeOpaque8(arrayOfByte, paramOutputStream);
  }
  
  protected void processEphemeral(byte[] paramArrayOfbyte) throws IOException {
    TlsECCUtils.checkPointEncoding(this.ecConfig.getNamedGroup(), paramArrayOfbyte);
    this.agreement.receivePeerValue(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsECDHEKeyExchange.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */