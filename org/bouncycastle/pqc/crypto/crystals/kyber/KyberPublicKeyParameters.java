package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.util.Arrays;

public class KyberPublicKeyParameters extends KyberKeyParameters {
  final byte[] t;
  
  final byte[] rho;
  
  static byte[] getEncoded(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return Arrays.concatenate(paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public KyberPublicKeyParameters(KyberParameters paramKyberParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    super(false, paramKyberParameters);
    this.t = Arrays.clone(paramArrayOfbyte1);
    this.rho = Arrays.clone(paramArrayOfbyte2);
  }
  
  public KyberPublicKeyParameters(KyberParameters paramKyberParameters, byte[] paramArrayOfbyte) {
    super(false, paramKyberParameters);
    this.t = Arrays.copyOfRange(paramArrayOfbyte, 0, paramArrayOfbyte.length - 32);
    this.rho = Arrays.copyOfRange(paramArrayOfbyte, paramArrayOfbyte.length - 32, paramArrayOfbyte.length);
  }
  
  public byte[] getEncoded() {
    return getEncoded(this.t, this.rho);
  }
  
  public byte[] getPublicKey() {
    return getEncoded();
  }
  
  public byte[] getRho() {
    return Arrays.clone(this.rho);
  }
  
  public byte[] getT() {
    return Arrays.clone(this.t);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\kyber\KyberPublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */