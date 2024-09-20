package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public class ISO7816d4Padding implements BlockCipherPadding {
  public void init(SecureRandom paramSecureRandom) throws IllegalArgumentException {}
  
  public String getPaddingName() {
    return "ISO7816-4";
  }
  
  public int addPadding(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramArrayOfbyte.length - paramInt;
    paramArrayOfbyte[paramInt] = Byte.MIN_VALUE;
    while (++paramInt < paramArrayOfbyte.length) {
      paramArrayOfbyte[paramInt] = 0;
      paramInt++;
    } 
    return i;
  }
  
  public int padCount(byte[] paramArrayOfbyte) throws InvalidCipherTextException {
    int i = -1;
    int j = -1;
    int k = paramArrayOfbyte.length;
    while (--k >= 0) {
      int m = paramArrayOfbyte[k] & 0xFF;
      int n = (m ^ 0x0) - 1 >> 31;
      int i1 = (m ^ 0x80) - 1 >> 31;
      i ^= (k ^ i) & j & i1;
      j &= n;
    } 
    if (i < 0)
      throw new InvalidCipherTextException("pad block corrupted"); 
    return paramArrayOfbyte.length - i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\paddings\ISO7816d4Padding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */