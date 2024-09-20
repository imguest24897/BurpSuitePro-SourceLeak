package META-INF.versions.9.org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsProtocol;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;

public final class SessionParameters {
  private int cipherSuite;
  
  private Certificate localCertificate;
  
  private TlsSecret masterSecret;
  
  private ProtocolVersion negotiatedVersion;
  
  private Certificate peerCertificate;
  
  private byte[] pskIdentity = null;
  
  private byte[] srpIdentity = null;
  
  private byte[] encodedServerExtensions;
  
  private boolean extendedMasterSecret;
  
  private SessionParameters(int paramInt, Certificate paramCertificate1, TlsSecret paramTlsSecret, ProtocolVersion paramProtocolVersion, Certificate paramCertificate2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, boolean paramBoolean) {
    this.cipherSuite = paramInt;
    this.localCertificate = paramCertificate1;
    this.masterSecret = paramTlsSecret;
    this.negotiatedVersion = paramProtocolVersion;
    this.peerCertificate = paramCertificate2;
    this.pskIdentity = Arrays.clone(paramArrayOfbyte1);
    this.srpIdentity = Arrays.clone(paramArrayOfbyte2);
    this.encodedServerExtensions = paramArrayOfbyte3;
    this.extendedMasterSecret = paramBoolean;
  }
  
  public void clear() {
    if (this.masterSecret != null)
      this.masterSecret.destroy(); 
  }
  
  public org.bouncycastle.tls.SessionParameters copy() {
    return new org.bouncycastle.tls.SessionParameters(this.cipherSuite, this.localCertificate, this.masterSecret, this.negotiatedVersion, this.peerCertificate, this.pskIdentity, this.srpIdentity, this.encodedServerExtensions, this.extendedMasterSecret);
  }
  
  public int getCipherSuite() {
    return this.cipherSuite;
  }
  
  public Certificate getLocalCertificate() {
    return this.localCertificate;
  }
  
  public TlsSecret getMasterSecret() {
    return this.masterSecret;
  }
  
  public ProtocolVersion getNegotiatedVersion() {
    return this.negotiatedVersion;
  }
  
  public Certificate getPeerCertificate() {
    return this.peerCertificate;
  }
  
  public byte[] getPSKIdentity() {
    return this.pskIdentity;
  }
  
  public byte[] getSRPIdentity() {
    return this.srpIdentity;
  }
  
  public boolean isExtendedMasterSecret() {
    return this.extendedMasterSecret;
  }
  
  public Hashtable readServerExtensions() throws IOException {
    if (this.encodedServerExtensions == null)
      return null; 
    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.encodedServerExtensions);
    return TlsProtocol.readExtensions(byteArrayInputStream);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\SessionParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */