package org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.util.Arrays;

public class FrodoPrivateKeyParameters extends FrodoKeyParameters {
  private byte[] privateKey;
  
  public byte[] getPrivateKey() {
    return Arrays.clone(this.privateKey);
  }
  
  public FrodoPrivateKeyParameters(FrodoParameters paramFrodoParameters, byte[] paramArrayOfbyte) {
    super(true, paramFrodoParameters);
    this.privateKey = Arrays.clone(paramArrayOfbyte);
  }
  
  public byte[] getEncoded() {
    return Arrays.clone(this.privateKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\frodo\FrodoPrivateKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */