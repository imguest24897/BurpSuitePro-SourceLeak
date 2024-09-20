package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public class PKCS7Padding implements BlockCipherPadding {
  public void init(SecureRandom paramSecureRandom) throws IllegalArgumentException {}
  
  public String getPaddingName() {
    return "PKCS7";
  }
  
  public int addPadding(byte[] paramArrayOfbyte, int paramInt) {
    byte b = (byte)(paramArrayOfbyte.length - paramInt);
    while (paramInt < paramArrayOfbyte.length) {
      paramArrayOfbyte[paramInt] = b;
      paramInt++;
    } 
    return b;
  }
  
  public int padCount(byte[] paramArrayOfbyte) throws InvalidCipherTextException {
    byte b = paramArrayOfbyte[paramArrayOfbyte.length - 1];
    int i = b & 0xFF;
    int j = paramArrayOfbyte.length - i;
    int k = (j | i - 1) >> 31;
    for (byte b1 = 0; b1 < paramArrayOfbyte.length; b1++)
      k |= (paramArrayOfbyte[b1] ^ b) & (b1 - j >> 31 ^ 0xFFFFFFFF); 
    if (k != 0)
      throw new InvalidCipherTextException("pad block corrupted"); 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\paddings\PKCS7Padding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */