package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.util.Arrays;

public class BIKEPublicKeyParameters extends BIKEKeyParameters {
  byte[] publicKey;
  
  public BIKEPublicKeyParameters(BIKEParameters paramBIKEParameters, byte[] paramArrayOfbyte) {
    super(false, paramBIKEParameters);
    this.publicKey = Arrays.clone(paramArrayOfbyte);
  }
  
  public byte[] getEncoded() {
    return Arrays.clone(this.publicKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\bike\BIKEPublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */