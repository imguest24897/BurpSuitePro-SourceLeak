package org.bouncycastle.pqc.crypto.xwing;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPrivateKeyParameters;
import org.bouncycastle.util.Arrays;

public class XWingPrivateKeyParameters extends XWingKeyParameters {
  private final KyberPrivateKeyParameters kybPriv;
  
  private final X25519PrivateKeyParameters xdhPriv;
  
  XWingPrivateKeyParameters(AsymmetricKeyParameter paramAsymmetricKeyParameter1, AsymmetricKeyParameter paramAsymmetricKeyParameter2) {
    super(true);
    this.kybPriv = (KyberPrivateKeyParameters)paramAsymmetricKeyParameter1;
    this.xdhPriv = (X25519PrivateKeyParameters)paramAsymmetricKeyParameter2;
  }
  
  public XWingPrivateKeyParameters(byte[] paramArrayOfbyte) {
    super(false);
    this.kybPriv = new KyberPrivateKeyParameters(KyberParameters.kyber768, Arrays.copyOfRange(paramArrayOfbyte, 0, paramArrayOfbyte.length - 32));
    this.xdhPriv = new X25519PrivateKeyParameters(paramArrayOfbyte, paramArrayOfbyte.length - 32);
  }
  
  KyberPrivateKeyParameters getKyberPrivateKey() {
    return this.kybPriv;
  }
  
  X25519PrivateKeyParameters getXDHPrivateKey() {
    return this.xdhPriv;
  }
  
  public byte[] getEncoded() {
    return Arrays.concatenate(this.kybPriv.getEncoded(), this.xdhPriv.getEncoded());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\xwing\XWingPrivateKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */