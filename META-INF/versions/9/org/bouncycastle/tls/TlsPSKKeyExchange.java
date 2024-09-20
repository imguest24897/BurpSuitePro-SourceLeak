package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.tls.AbstractTlsKeyExchange;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.TlsCredentialedDecryptor;
import org.bouncycastle.tls.TlsCredentials;
import org.bouncycastle.tls.TlsDHGroupVerifier;
import org.bouncycastle.tls.TlsDHUtils;
import org.bouncycastle.tls.TlsECCUtils;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.TlsPSKIdentity;
import org.bouncycastle.tls.TlsPSKIdentityManager;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsDHConfig;
import org.bouncycastle.tls.crypto.TlsECConfig;
import org.bouncycastle.tls.crypto.TlsEncryptor;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;

public class TlsPSKKeyExchange extends AbstractTlsKeyExchange {
  protected TlsPSKIdentity pskIdentity;
  
  protected TlsPSKIdentityManager pskIdentityManager;
  
  protected TlsDHGroupVerifier dhGroupVerifier;
  
  protected byte[] psk_identity_hint = null;
  
  protected byte[] psk = null;
  
  protected TlsDHConfig dhConfig;
  
  protected TlsECConfig ecConfig;
  
  protected TlsAgreement agreement;
  
  protected TlsCredentialedDecryptor serverCredentials = null;
  
  protected TlsEncryptor serverEncryptor;
  
  protected TlsSecret preMasterSecret;
  
  private static int checkKeyExchange(int paramInt) {
    switch (paramInt) {
      case 13:
      case 14:
      case 15:
      case 24:
        return paramInt;
    } 
    throw new IllegalArgumentException("unsupported key exchange algorithm");
  }
  
  public TlsPSKKeyExchange(int paramInt, TlsPSKIdentity paramTlsPSKIdentity, TlsDHGroupVerifier paramTlsDHGroupVerifier) {
    this(paramInt, paramTlsPSKIdentity, null, paramTlsDHGroupVerifier, null, null);
  }
  
  public TlsPSKKeyExchange(int paramInt, TlsPSKIdentityManager paramTlsPSKIdentityManager, TlsDHConfig paramTlsDHConfig, TlsECConfig paramTlsECConfig) {
    this(paramInt, null, paramTlsPSKIdentityManager, null, paramTlsDHConfig, paramTlsECConfig);
  }
  
  private TlsPSKKeyExchange(int paramInt, TlsPSKIdentity paramTlsPSKIdentity, TlsPSKIdentityManager paramTlsPSKIdentityManager, TlsDHGroupVerifier paramTlsDHGroupVerifier, TlsDHConfig paramTlsDHConfig, TlsECConfig paramTlsECConfig) {
    super(checkKeyExchange(paramInt));
    this.pskIdentity = paramTlsPSKIdentity;
    this.pskIdentityManager = paramTlsPSKIdentityManager;
    this.dhGroupVerifier = paramTlsDHGroupVerifier;
    this.dhConfig = paramTlsDHConfig;
    this.ecConfig = paramTlsECConfig;
  }
  
  public void skipServerCredentials() throws IOException {
    if (this.keyExchange == 15)
      throw new TlsFatalAlert((short)80); 
  }
  
  public void processServerCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    if (this.keyExchange != 15)
      throw new TlsFatalAlert((short)80); 
    this.serverCredentials = TlsUtils.requireDecryptorCredentials(paramTlsCredentials);
  }
  
  public void processServerCertificate(Certificate paramCertificate) throws IOException {
    if (this.keyExchange != 15)
      throw new TlsFatalAlert((short)10); 
    this.serverEncryptor = paramCertificate.getCertificateAt(0).createEncryptor(3);
  }
  
  public byte[] generateServerKeyExchange() throws IOException {
    this.psk_identity_hint = this.pskIdentityManager.getHint();
    if (this.psk_identity_hint == null && !requiresServerKeyExchange())
      return null; 
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    if (this.psk_identity_hint == null) {
      TlsUtils.writeOpaque16(TlsUtils.EMPTY_BYTES, byteArrayOutputStream);
    } else {
      TlsUtils.writeOpaque16(this.psk_identity_hint, byteArrayOutputStream);
    } 
    if (this.keyExchange == 14) {
      if (this.dhConfig == null)
        throw new TlsFatalAlert((short)80); 
      TlsDHUtils.writeDHConfig(this.dhConfig, byteArrayOutputStream);
      this.agreement = this.context.getCrypto().createDHDomain(this.dhConfig).createDH();
      generateEphemeralDH(byteArrayOutputStream);
    } else if (this.keyExchange == 24) {
      if (this.ecConfig == null)
        throw new TlsFatalAlert((short)80); 
      TlsECCUtils.writeECConfig(this.ecConfig, byteArrayOutputStream);
      this.agreement = this.context.getCrypto().createECDomain(this.ecConfig).createECDH();
      generateEphemeralECDH(byteArrayOutputStream);
    } 
    return byteArrayOutputStream.toByteArray();
  }
  
  public boolean requiresServerKeyExchange() {
    switch (this.keyExchange) {
      case 14:
      case 24:
        return true;
    } 
    return false;
  }
  
  public void processServerKeyExchange(InputStream paramInputStream) throws IOException {
    this.psk_identity_hint = TlsUtils.readOpaque16(paramInputStream);
    if (this.keyExchange == 14) {
      this.dhConfig = TlsDHUtils.receiveDHConfig(this.context, this.dhGroupVerifier, paramInputStream);
      byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream, 1);
      this.agreement = this.context.getCrypto().createDHDomain(this.dhConfig).createDH();
      processEphemeralDH(arrayOfByte);
    } else if (this.keyExchange == 24) {
      this.ecConfig = TlsECCUtils.receiveECDHConfig(this.context, paramInputStream);
      byte[] arrayOfByte = TlsUtils.readOpaque8(paramInputStream, 1);
      this.agreement = this.context.getCrypto().createECDomain(this.ecConfig).createECDH();
      processEphemeralECDH(arrayOfByte);
    } 
  }
  
  public void processClientCredentials(TlsCredentials paramTlsCredentials) throws IOException {
    throw new TlsFatalAlert((short)80);
  }
  
  public void generateClientKeyExchange(OutputStream paramOutputStream) throws IOException {
    if (this.psk_identity_hint == null) {
      this.pskIdentity.skipIdentityHint();
    } else {
      this.pskIdentity.notifyIdentityHint(this.psk_identity_hint);
    } 
    byte[] arrayOfByte = this.pskIdentity.getPSKIdentity();
    if (arrayOfByte == null)
      throw new TlsFatalAlert((short)80); 
    this.psk = this.pskIdentity.getPSK();
    if (this.psk == null)
      throw new TlsFatalAlert((short)80); 
    TlsUtils.writeOpaque16(arrayOfByte, paramOutputStream);
    (this.context.getSecurityParametersHandshake()).pskIdentity = Arrays.clone(arrayOfByte);
    if (this.keyExchange == 14) {
      generateEphemeralDH(paramOutputStream);
    } else if (this.keyExchange == 24) {
      generateEphemeralECDH(paramOutputStream);
    } else if (this.keyExchange == 15) {
      this.preMasterSecret = TlsUtils.generateEncryptedPreMasterSecret(this.context, this.serverEncryptor, paramOutputStream);
    } 
  }
  
  public void processClientKeyExchange(InputStream paramInputStream) throws IOException {
    byte[] arrayOfByte = TlsUtils.readOpaque16(paramInputStream);
    this.psk = this.pskIdentityManager.getPSK(arrayOfByte);
    if (this.psk == null)
      throw new TlsFatalAlert((short)115); 
    (this.context.getSecurityParametersHandshake()).pskIdentity = arrayOfByte;
    if (this.keyExchange == 14) {
      byte[] arrayOfByte1 = TlsUtils.readOpaque16(paramInputStream, 1);
      processEphemeralDH(arrayOfByte1);
    } else if (this.keyExchange == 24) {
      byte[] arrayOfByte1 = TlsUtils.readOpaque8(paramInputStream, 1);
      processEphemeralECDH(arrayOfByte1);
    } else if (this.keyExchange == 15) {
      byte[] arrayOfByte1 = TlsUtils.readEncryptedPMS(this.context, paramInputStream);
      this.preMasterSecret = this.serverCredentials.decrypt(new TlsCryptoParameters(this.context), arrayOfByte1);
    } 
  }
  
  public TlsSecret generatePreMasterSecret() throws IOException {
    byte[] arrayOfByte = generateOtherSecret(this.psk.length);
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4 + arrayOfByte.length + this.psk.length);
    TlsUtils.writeOpaque16(arrayOfByte, byteArrayOutputStream);
    TlsUtils.writeOpaque16(this.psk, byteArrayOutputStream);
    Arrays.fill(this.psk, (byte)0);
    this.psk = null;
    return this.context.getCrypto().createSecret(byteArrayOutputStream.toByteArray());
  }
  
  protected void generateEphemeralDH(OutputStream paramOutputStream) throws IOException {
    byte[] arrayOfByte = this.agreement.generateEphemeral();
    TlsUtils.writeOpaque16(arrayOfByte, paramOutputStream);
  }
  
  protected void generateEphemeralECDH(OutputStream paramOutputStream) throws IOException {
    byte[] arrayOfByte = this.agreement.generateEphemeral();
    TlsUtils.writeOpaque8(arrayOfByte, paramOutputStream);
  }
  
  protected byte[] generateOtherSecret(int paramInt) throws IOException {
    if (this.keyExchange == 13)
      return new byte[paramInt]; 
    if ((this.keyExchange == 14 || this.keyExchange == 24) && this.agreement != null)
      return this.agreement.calculateSecret().extract(); 
    if (this.keyExchange == 15 && this.preMasterSecret != null)
      return this.preMasterSecret.extract(); 
    throw new TlsFatalAlert((short)80);
  }
  
  protected void processEphemeralDH(byte[] paramArrayOfbyte) throws IOException {
    this.agreement.receivePeerValue(paramArrayOfbyte);
  }
  
  protected void processEphemeralECDH(byte[] paramArrayOfbyte) throws IOException {
    TlsECCUtils.checkPointEncoding(this.ecConfig.getNamedGroup(), paramArrayOfbyte);
    this.agreement.receivePeerValue(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\TlsPSKKeyExchange.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */