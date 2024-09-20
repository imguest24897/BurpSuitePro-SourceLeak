package org.bouncycastle.pqc.crypto.xwing;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPublicKeyParameters;
import org.bouncycastle.util.Arrays;

public class XWingPublicKeyParameters extends XWingKeyParameters {
  private final KyberPublicKeyParameters kybPub;
  
  private final X25519PublicKeyParameters xdhPub;
  
  XWingPublicKeyParameters(AsymmetricKeyParameter paramAsymmetricKeyParameter1, AsymmetricKeyParameter paramAsymmetricKeyParameter2) {
    super(false);
    this.kybPub = (KyberPublicKeyParameters)paramAsymmetricKeyParameter1;
    this.xdhPub = (X25519PublicKeyParameters)paramAsymmetricKeyParameter2;
  }
  
  public XWingPublicKeyParameters(byte[] paramArrayOfbyte) {
    super(false);
    this.kybPub = new KyberPublicKeyParameters(KyberParameters.kyber768, Arrays.copyOfRange(paramArrayOfbyte, 0, paramArrayOfbyte.length - 32));
    this.xdhPub = new X25519PublicKeyParameters(paramArrayOfbyte, paramArrayOfbyte.length - 32);
  }
  
  KyberPublicKeyParameters getKyberPublicKey() {
    return this.kybPub;
  }
  
  X25519PublicKeyParameters getXDHPublicKey() {
    return this.xdhPub;
  }
  
  public byte[] getEncoded() {
    return Arrays.concatenate(this.kybPub.getEncoded(), this.xdhPub.getEncoded());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\xwing\XWingPublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */