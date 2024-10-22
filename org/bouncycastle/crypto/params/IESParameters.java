package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

public class IESParameters implements CipherParameters {
  private byte[] derivation;
  
  private byte[] encoding;
  
  private int macKeySize;
  
  public IESParameters(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    this.derivation = Arrays.clone(paramArrayOfbyte1);
    this.encoding = Arrays.clone(paramArrayOfbyte2);
    this.macKeySize = paramInt;
  }
  
  public byte[] getDerivationV() {
    return Arrays.clone(this.derivation);
  }
  
  public byte[] getEncodingV() {
    return Arrays.clone(this.encoding);
  }
  
  public int getMacKeySize() {
    return this.macKeySize;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\params\IESParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */