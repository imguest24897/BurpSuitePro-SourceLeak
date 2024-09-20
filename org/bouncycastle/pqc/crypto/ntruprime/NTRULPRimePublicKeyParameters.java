package org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.util.Arrays;

public class NTRULPRimePublicKeyParameters extends NTRULPRimeKeyParameters {
  private final byte[] seed;
  
  private final byte[] roundEncA;
  
  public NTRULPRimePublicKeyParameters(NTRULPRimeParameters paramNTRULPRimeParameters, byte[] paramArrayOfbyte) {
    super(false, paramNTRULPRimeParameters);
    this.seed = Arrays.copyOfRange(paramArrayOfbyte, 0, 32);
    this.roundEncA = Arrays.copyOfRange(paramArrayOfbyte, this.seed.length, paramArrayOfbyte.length);
  }
  
  NTRULPRimePublicKeyParameters(NTRULPRimeParameters paramNTRULPRimeParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    super(false, paramNTRULPRimeParameters);
    this.seed = Arrays.clone(paramArrayOfbyte1);
    this.roundEncA = Arrays.clone(paramArrayOfbyte2);
  }
  
  byte[] getSeed() {
    return this.seed;
  }
  
  byte[] getRoundEncA() {
    return this.roundEncA;
  }
  
  public byte[] getEncoded() {
    byte[] arrayOfByte = new byte[getParameters().getPublicKeyBytes()];
    System.arraycopy(this.seed, 0, arrayOfByte, 0, this.seed.length);
    System.arraycopy(this.roundEncA, 0, arrayOfByte, this.seed.length, this.roundEncA.length);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntruprime\NTRULPRimePublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */