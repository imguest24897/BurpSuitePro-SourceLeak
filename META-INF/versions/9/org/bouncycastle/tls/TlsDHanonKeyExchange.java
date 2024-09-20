package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.AbstractTlsKeyExchange;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsDHGroupVerifier;
import org.bouncycastle.tls.TlsDHUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsSecret;

public class TlsDHanonKeyExchange extends AbstractTlsKeyExchange {
  protected TlsDHGroupVerifier dhGroupVerifier;
  
  protected TlsDHConfig dhConfig;
  
  protected TlsAgreement agreement;
  
  private static int checkKeyExchange(int paramInt) {
    switch (paramInt) {
      case 11:
        return paramInt;
    } 
    throw new IllegalArgumentException("unsupported key exchange algorithm");
  }
  
  public TlsDHanonKeyExchange(int paramInt, TlsDHGroupVerifier paramTlsDHGroupVerifier) {
    this(paramInt, paramTlsDHGroupVerifier, null);
  }
  
  public TlsDHanonKeyExchange(int paramInt, TlsDHConfig paramTlsDHConfig) {
    this(paramInt, null, paramTlsDHConfig);
  }
  
  private TlsDHanonKeyExchange(int paramInt, TlsDHGroupVerifier paramTlsDHGroupVerifier, TlsDHConfig paramTlsDHConfig) {
    super(checkKeyExchange(paramInt));
    this.dhGroupVerifier = paramTlsDHGroupVerifier;
    this.dhConfig = paramTlsDHConfig;
  }
  
  public void skipServerCredentials() throws IOException {}
  
  public void processServerCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public void processServerCertificate(Certificate paramCertificate) throws IOException {
    throw new TlsFatalAlert((short)10);
  }
  
  public boolean requiresServerKeyExchange() {
    return true;
  }
  
  public byte[] generateServerKeyExchange() throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    TlsDHUtils.writeDHConfig(this.dhConfig, byteArrayOutputStream);
    this.agreement = this.context.getCrypto().createDHDomain(this.dhConfig).createDH();
    byte[] arrayOfByte = this.agreement.generateEphemeral();
    TlsUtils.writeOpaque16(arrayOfByte, byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  public void processServerKeyExchange(InputStream paramInputStream) throws IOException {
    this.dhConfig = TlsDHUtils.receiveDHConfig(this.context, this.dhGroupVerifier, paramInputStream);
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream, 1);
    this.agreement = this.context.getCrypto().createDHDomain(this.dhConfig).createDH();
    this.agreement.receivePeerValue(arrayOfByte);
  }
  
  public short[] getClientCertificateTypes() {
    return null;
  }
  
  public void processClientCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public void generateClientKeyExchange(OutputStream paramOutputStream) throws IOException {
    byte[] arrayOfByte = this.agreement.generateEphemeral();
    TlsUtils.writeOpaque16(arrayOfByte, paramOutputStream);
  }
  
  public void processClientCertificate(Certificate paramCertificate) throws IOException {
    throw new TlsFatalAlert((short)10);
  }
  
  public void processClientKeyExchange(InputStream paramInputStream) throws IOException {
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream, 1);
    this.agreement.receivePeerValue(arrayOfByte);
  }
  
  public TlsSecret generatePreMasterSecret() throws IOException {
    return this.agreement.calculateSecret();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsDHanonKeyExchange.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */