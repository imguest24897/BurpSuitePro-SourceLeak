package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public class ZeroBytePadding implements BlockCipherPadding {
  public void init(SecureRandom paramSecureRandom) throws IllegalArgumentException {}
  
  public String getPaddingName() {
    return "ZeroByte";
  }
  
  public int addPadding(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramArrayOfbyte.length - paramInt;
    while (paramInt < paramArrayOfbyte.length) {
      paramArrayOfbyte[paramInt] = 0;
      paramInt++;
    } 
    return i;
  }
  
  public int padCount(byte[] paramArrayOfbyte) throws InvalidCipherTextException {
    int i = 0;
    int j = -1;
    int k = paramArrayOfbyte.length;
    while (--k >= 0) {
      int m = paramArrayOfbyte[k] & 0xFF;
      int n = (m ^ 0x0) - 1 >> 31;
      j &= n;
      i -= j;
    } 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\paddings\ZeroBytePadding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */