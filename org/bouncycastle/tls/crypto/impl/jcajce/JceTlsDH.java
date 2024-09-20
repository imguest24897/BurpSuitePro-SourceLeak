package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.KeyPair;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsSecret;

public class JceTlsDH implements TlsAgreement {
  protected final JceTlsDHDomain domain;
  
  protected KeyPair localKeyPair;
  
  protected DHPublicKey peerPublicKey;
  
  public JceTlsDH(JceTlsDHDomain paramJceTlsDHDomain) {
    this.domain = paramJceTlsDHDomain;
  }
  
  public byte[] generateEphemeral() throws IOException {
    this.localKeyPair = this.domain.generateKeyPair();
    return this.domain.encodePublicKey((DHPublicKey)this.localKeyPair.getPublic());
  }
  
  public void receivePeerValue(byte[] paramArrayOfbyte) throws IOException {
    this.peerPublicKey = this.domain.decodePublicKey(paramArrayOfbyte);
  }
  
  public TlsSecret calculateSecret() throws IOException {
    return (TlsSecret)this.domain.calculateDHAgreement((DHPrivateKey)this.localKeyPair.getPrivate(), this.peerPublicKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JceTlsDH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */