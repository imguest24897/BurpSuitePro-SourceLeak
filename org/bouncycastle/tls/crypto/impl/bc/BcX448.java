package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsAgreement;
import org.bouncycastle.tls.crypto.TlsSecret;
import org.bouncycastle.util.Arrays;

public class BcX448 implements TlsAgreement {
  protected final BcTlsCrypto crypto;
  
  protected final byte[] privateKey = new byte[56];
  
  protected final byte[] peerPublicKey = new byte[56];
  
  public BcX448(BcTlsCrypto paramBcTlsCrypto) {
    this.crypto = paramBcTlsCrypto;
  }
  
  public byte[] generateEphemeral() throws IOException {
    this.crypto.getSecureRandom().nextBytes(this.privateKey);
    byte[] arrayOfByte = new byte[56];
    X448.scalarMultBase(this.privateKey, 0, arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public void receivePeerValue(byte[] paramArrayOfbyte) throws IOException {
    if (paramArrayOfbyte == null || paramArrayOfbyte.length != 56)
      throw new TlsFatalAlert((short)47); 
    System.arraycopy(paramArrayOfbyte, 0, this.peerPublicKey, 0, 56);
  }
  
  public TlsSecret calculateSecret() throws IOException {
    try {
      byte[] arrayOfByte = new byte[56];
      if (!X448.calculateAgreement(this.privateKey, 0, this.peerPublicKey, 0, arrayOfByte, 0))
        throw new TlsFatalAlert((short)40); 
      return (TlsSecret)this.crypto.adoptLocalSecret(arrayOfByte);
    } finally {
      Arrays.fill(this.privateKey, (byte)0);
      Arrays.fill(this.peerPublicKey, (byte)0);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcX448.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */