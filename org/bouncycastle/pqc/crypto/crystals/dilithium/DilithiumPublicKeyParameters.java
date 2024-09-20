package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

public class DilithiumPublicKeyParameters extends DilithiumKeyParameters {
  final byte[] rho;
  
  final byte[] t1;
  
  static byte[] getEncoded(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return Arrays.concatenate(paramArrayOfbyte1, paramArrayOfbyte2);
  }
  
  public DilithiumPublicKeyParameters(DilithiumParameters paramDilithiumParameters, byte[] paramArrayOfbyte) {
    super(false, paramDilithiumParameters);
    this.rho = Arrays.copyOfRange(paramArrayOfbyte, 0, 32);
    this.t1 = Arrays.copyOfRange(paramArrayOfbyte, 32, paramArrayOfbyte.length);
  }
  
  public DilithiumPublicKeyParameters(DilithiumParameters paramDilithiumParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    super(false, paramDilithiumParameters);
    this.rho = Arrays.clone(paramArrayOfbyte1);
    this.t1 = Arrays.clone(paramArrayOfbyte2);
  }
  
  public byte[] getEncoded() {
    return getEncoded(this.rho, this.t1);
  }
  
  public byte[] getRho() {
    return Arrays.clone(this.rho);
  }
  
  public byte[] getT1() {
    return Arrays.clone(this.t1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\crystals\dilithium\DilithiumPublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */