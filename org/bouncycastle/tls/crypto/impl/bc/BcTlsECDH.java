package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsSecret;

public class BcTlsECDH implements TlsAgreement {
  protected final BcTlsECDomain domain;
  
  protected AsymmetricCipherKeyPair localKeyPair;
  
  protected ECPublicKeyParameters peerPublicKey;
  
  public BcTlsECDH(BcTlsECDomain paramBcTlsECDomain) {
    this.domain = paramBcTlsECDomain;
  }
  
  public byte[] generateEphemeral() throws IOException {
    this.localKeyPair = this.domain.generateKeyPair();
    return this.domain.encodePublicKey((ECPublicKeyParameters)this.localKeyPair.getPublic());
  }
  
  public void receivePeerValue(byte[] paramArrayOfbyte) throws IOException {
    this.peerPublicKey = this.domain.decodePublicKey(paramArrayOfbyte);
  }
  
  public TlsSecret calculateSecret() throws IOException {
    return (TlsSecret)this.domain.calculateECDHAgreement((ECPrivateKeyParameters)this.localKeyPair.getPrivate(), this.peerPublicKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcTlsECDH.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */