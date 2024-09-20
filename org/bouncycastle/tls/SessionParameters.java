package org.bouncycastle.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
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
  
  public SessionParameters copy() {
    return new SessionParameters(this.cipherSuite, this.localCertificate, this.masterSecret, this.negotiatedVersion, this.peerCertificate, this.pskIdentity, this.srpIdentity, this.encodedServerExtensions, this.extendedMasterSecret);
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
  
  public static final class Builder {
    private int cipherSuite = -1;
    
    private Certificate localCertificate = null;
    
    private TlsSecret masterSecret = null;
    
    private ProtocolVersion negotiatedVersion;
    
    private Certificate peerCertificate = null;
    
    private byte[] pskIdentity = null;
    
    private byte[] srpIdentity = null;
    
    private byte[] encodedServerExtensions = null;
    
    private boolean extendedMasterSecret = false;
    
    public SessionParameters build() {
      validate((this.cipherSuite >= 0), "cipherSuite");
      validate((this.masterSecret != null), "masterSecret");
      return new SessionParameters(this.cipherSuite, this.localCertificate, this.masterSecret, this.negotiatedVersion, this.peerCertificate, this.pskIdentity, this.srpIdentity, this.encodedServerExtensions, this.extendedMasterSecret);
    }
    
    public Builder setCipherSuite(int param1Int) {
      this.cipherSuite = param1Int;
      return this;
    }
    
    public Builder setExtendedMasterSecret(boolean param1Boolean) {
      this.extendedMasterSecret = param1Boolean;
      return this;
    }
    
    public Builder setLocalCertificate(Certificate param1Certificate) {
      this.localCertificate = param1Certificate;
      return this;
    }
    
    public Builder setMasterSecret(TlsSecret param1TlsSecret) {
      this.masterSecret = param1TlsSecret;
      return this;
    }
    
    public Builder setNegotiatedVersion(ProtocolVersion param1ProtocolVersion) {
      this.negotiatedVersion = param1ProtocolVersion;
      return this;
    }
    
    public Builder setPeerCertificate(Certificate param1Certificate) {
      this.peerCertificate = param1Certificate;
      return this;
    }
    
    public Builder setPSKIdentity(byte[] param1ArrayOfbyte) {
      this.pskIdentity = param1ArrayOfbyte;
      return this;
    }
    
    public Builder setSRPIdentity(byte[] param1ArrayOfbyte) {
      this.srpIdentity = param1ArrayOfbyte;
      return this;
    }
    
    public Builder setServerExtensions(Hashtable param1Hashtable) throws IOException {
      if (param1Hashtable == null || param1Hashtable.isEmpty()) {
        this.encodedServerExtensions = null;
      } else {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TlsProtocol.writeExtensions(byteArrayOutputStream, param1Hashtable);
        this.encodedServerExtensions = byteArrayOutputStream.toByteArray();
      } 
      return this;
    }
    
    private void validate(boolean param1Boolean, String param1String) {
      if (!param1Boolean)
        throw new IllegalStateException("Required session parameter '" + param1String + "' not configured"); 
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\SessionParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */