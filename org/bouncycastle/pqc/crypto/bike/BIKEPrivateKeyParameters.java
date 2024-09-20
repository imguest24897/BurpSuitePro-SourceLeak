package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.util.Arrays;

public class BIKEPrivateKeyParameters extends BIKEKeyParameters {
  private byte[] h0;
  
  private byte[] h1;
  
  private byte[] sigma;
  
  public BIKEPrivateKeyParameters(BIKEParameters paramBIKEParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    super(true, paramBIKEParameters);
    this.h0 = Arrays.clone(paramArrayOfbyte1);
    this.h1 = Arrays.clone(paramArrayOfbyte2);
    this.sigma = Arrays.clone(paramArrayOfbyte3);
  }
  
  byte[] getH0() {
    return this.h0;
  }
  
  byte[] getH1() {
    return this.h1;
  }
  
  byte[] getSigma() {
    return this.sigma;
  }
  
  public byte[] getEncoded() {
    return Arrays.concatenate(this.h0, this.h1, this.sigma);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\bike\BIKEPrivateKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */