package META-INF.versions.9.org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Pack;

class BIKEUtils {
  static int getHammingWeight(byte[] paramArrayOfbyte) {
    int i = 0;
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      i += paramArrayOfbyte[b]; 
    return i;
  }
  
  static void fromBitArrayToByteArray(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    byte b1 = 0;
    byte b2 = 0;
    long l = paramInt2;
    while (b1 < l) {
      if (b1 + 8 >= paramInt2) {
        int i = paramArrayOfbyte2[paramInt1 + b1];
        for (int j = paramInt2 - b1 - 1; j >= 1; j--)
          i = i | paramArrayOfbyte2[paramInt1 + b1 + j] << j; 
        paramArrayOfbyte1[b2] = (byte)i;
      } else {
        int i = paramArrayOfbyte2[paramInt1 + b1];
        for (byte b = 7; b >= 1; b--)
          i = i | paramArrayOfbyte2[paramInt1 + b1 + b] << b; 
        paramArrayOfbyte1[b2] = (byte)i;
      } 
      b1 += 8;
      b2++;
    } 
  }
  
  static void generateRandomByteArray(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, Xof paramXof) {
    byte[] arrayOfByte = new byte[4];
    for (int i = paramInt2 - 1; i >= 0; i--) {
      paramXof.doOutput(arrayOfByte, 0, 4);
      long l = Pack.littleEndianToInt(arrayOfByte, 0) & 0xFFFFFFFFL;
      l = l * (paramInt1 - i) >> 32L;
      int j = (int)l;
      j += i;
      if (CHECK_BIT(paramArrayOfbyte, j) != 0)
        j = i; 
      SET_BIT(paramArrayOfbyte, j);
    } 
  }
  
  protected static int CHECK_BIT(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramInt / 8;
    int j = paramInt % 8;
    return paramArrayOfbyte[i] >>> j & 0x1;
  }
  
  protected static void SET_BIT(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramInt / 8;
    int j = paramInt % 8;
    paramArrayOfbyte[i] = (byte)(int)(paramArrayOfbyte[i] | 1L << (int)j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\bike\BIKEUtils.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */