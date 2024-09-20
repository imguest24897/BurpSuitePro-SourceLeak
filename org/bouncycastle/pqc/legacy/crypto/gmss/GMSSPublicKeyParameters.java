package org.bouncycastle.pqc.legacy.crypto.gmss;

public class GMSSPublicKeyParameters extends GMSSKeyParameters {
  private byte[] gmssPublicKey;
  
  public GMSSPublicKeyParameters(byte[] paramArrayOfbyte, GMSSParameters paramGMSSParameters) {
    super(false, paramGMSSParameters);
    this.gmssPublicKey = paramArrayOfbyte;
  }
  
  public byte[] getPublicKey() {
    return this.gmssPublicKey;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\gmss\GMSSPublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */