package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.AbstractTlsKeyExchange;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsECCUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.tls.crypto.TlsSecret;

public class TlsECDHanonKeyExchange extends AbstractTlsKeyExchange {
  protected TlsECConfig ecConfig;
  
  protected TlsAgreement agreement;
  
  private static int checkKeyExchange(int paramInt) {
    switch (paramInt) {
      case 20:
        return paramInt;
    } 
    throw new IllegalArgumentException("unsupported key exchange algorithm");
  }
  
  public TlsECDHanonKeyExchange(int paramInt) {
    this(paramInt, null);
  }
  
  public TlsECDHanonKeyExchange(int paramInt, TlsECConfig paramTlsECConfig) {
    super(checkKeyExchange(paramInt));
    this.ecConfig = paramTlsECConfig;
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
    TlsECCUtils.writeECConfig(this.ecConfig, byteArrayOutputStream);
    this.agreement = this.context.getCrypto().createECDomain(this.ecConfig).createECDH();
    generateEphemeral(byteArrayOutputStream);
    return byteArrayOutputStream.toByteArray();
  }
  
  public void processServerKeyExchange(InputStream paramInputStream) throws IOException {
    this.ecConfig = TlsECCUtils.receiveECDHConfig(this.context, paramInputStream);
    byte[] arrayOfByte = TlsUtils.readOpaque8(paramInputStream, 1);
    this.agreement = this.context.getCrypto().createECDomain(this.ecConfig).createECDH();
    processEphemeral(arrayOfByte);
  }
  
  public short[] getClientCertificateTypes() {
    return null;
  }
  
  public void processClientCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public void generateClientKeyExchange(OutputStream paramOutputStream) throws IOException {
    generateEphemeral(paramOutputStream);
  }
  
  public void processClientCertificate(Certificate paramCertificate) throws IOException {
    throw new TlsFatalAlert((short)10);
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsECDHanonKeyExchange.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */