package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;

public class ISO10126d2Padding implements BlockCipherPadding {
  SecureRandom random;
  
  public void init(SecureRandom paramSecureRandom) throws IllegalArgumentException {
    this.random = CryptoServicesRegistrar.getSecureRandom(paramSecureRandom);
  }
  
  public String getPaddingName() {
    return "ISO10126-2";
  }
  
  public int addPadding(byte[] paramArrayOfbyte, int paramInt) {
    byte b = (byte)(paramArrayOfbyte.length - paramInt);
    while (paramInt < paramArrayOfbyte.length - 1) {
      paramArrayOfbyte[paramInt] = (byte)this.random.nextInt();
      paramInt++;
    } 
    paramArrayOfbyte[paramInt] = b;
    return b;
  }
  
  public int padCount(byte[] paramArrayOfbyte) throws InvalidCipherTextException {
    int i = paramArrayOfbyte[paramArrayOfbyte.length - 1] & 0xFF;
    int j = paramArrayOfbyte.length - i;
    int k = (j | i - 1) >> 31;
    if (k != 0)
      throw new InvalidCipherTextException("pad block corrupted"); 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\paddings\ISO10126d2Padding.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */