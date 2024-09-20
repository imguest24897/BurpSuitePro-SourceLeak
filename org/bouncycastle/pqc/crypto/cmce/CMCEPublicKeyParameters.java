package org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.util.Arrays;

public class CMCEPublicKeyParameters extends CMCEKeyParameters {
  private final byte[] publicKey;
  
  public byte[] getPublicKey() {
    return Arrays.clone(this.publicKey);
  }
  
  public byte[] getEncoded() {
    return getPublicKey();
  }
  
  public CMCEPublicKeyParameters(CMCEParameters paramCMCEParameters, byte[] paramArrayOfbyte) {
    super(false, paramCMCEParameters);
    this.publicKey = Arrays.clone(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\cmce\CMCEPublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */