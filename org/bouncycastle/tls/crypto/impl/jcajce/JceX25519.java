package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.KeyPair;
import java.security.PublicKey;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsSecret;

public class JceX25519 implements TlsAgreement {
  protected final JceX25519Domain domain;
  
  protected KeyPair localKeyPair;
  
  protected PublicKey peerPublicKey;
  
  public JceX25519(JceX25519Domain paramJceX25519Domain) {
    this.domain = paramJceX25519Domain;
  }
  
  public byte[] generateEphemeral() throws IOException {
    this.localKeyPair = this.domain.generateKeyPair();
    return this.domain.encodePublicKey(this.localKeyPair.getPublic());
  }
  
  public void receivePeerValue(byte[] paramArrayOfbyte) throws IOException {
    this.peerPublicKey = this.domain.decodePublicKey(paramArrayOfbyte);
  }
  
  public TlsSecret calculateSecret() throws IOException {
    return (TlsSecret)this.domain.calculateECDHAgreement(this.localKeyPair.getPrivate(), this.peerPublicKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JceX25519.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */