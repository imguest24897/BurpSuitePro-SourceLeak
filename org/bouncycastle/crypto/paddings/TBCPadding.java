package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public class TBCPadding implements BlockCipherPadding {
  public void init(SecureRandom paramSecureRandom) throws IllegalArgumentException {}
  
  public String getPaddingName() {
    return "TBC";
  }
  
  public int addPadding(byte[] paramArrayOfbyte, int paramInt) {
    byte b;
    int i = paramArrayOfbyte.length - paramInt;
    if (paramInt > 0) {
      b = (byte)(((paramArrayOfbyte[paramInt - 1] & 0x1) == 0) ? 255 : 0);
    } else {
      b = (byte)(((paramArrayOfbyte[paramArrayOfbyte.length - 1] & 0x1) == 0) ? 255 : 0);
    } 
    while (paramInt < paramArrayOfbyte.length) {
      paramArrayOfbyte[paramInt] = b;
      paramInt++;
    } 
    return i;
  }
  
  public int padCount(byte[] paramArrayOfbyte) throws InvalidCipherTextException {
    int i = paramArrayOfbyte.length;
    int j = paramArrayOfbyte[--i] & 0xFF;
    int k = 1;
    int m = -1;
    while (--i >= 0) {
      int n = paramArrayOfbyte[i] & 0xFF;
      int i1 = (n ^ j) - 1 >> 31;
      m &= i1;
      k -= m;
    } 
    return k;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\paddings\TBCPadding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */