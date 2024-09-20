package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsSecret;

public class BcTlsDH implements TlsAgreement {
  protected final BcTlsDHDomain domain;
  
  protected AsymmetricCipherKeyPair localKeyPair;
  
  protected DHPublicKeyParameters peerPublicKey;
  
  public BcTlsDH(BcTlsDHDomain paramBcTlsDHDomain) {
    this.domain = paramBcTlsDHDomain;
  }
  
  public byte[] generateEphemeral() throws IOException {
    this.localKeyPair = this.domain.generateKeyPair();
    return this.domain.encodePublicKey((DHPublicKeyParameters)this.localKeyPair.getPublic());
  }
  
  public void receivePeerValue(byte[] paramArrayOfbyte) throws IOException {
    this.peerPublicKey = this.domain.decodePublicKey(paramArrayOfbyte);
  }
  
  public TlsSecret calculateSecret() throws IOException {
    return (TlsSecret)this.domain.calculateDHAgreement((DHPrivateKeyParameters)this.localKeyPair.getPrivate(), this.peerPublicKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsDH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */