package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

class RainbowUtil {
  public static short[] convertArray(byte[] paramArrayOfbyte) {
    short[] arrayOfShort = new short[paramArrayOfbyte.length];
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      arrayOfShort[b] = (short)(paramArrayOfbyte[b] & 0xFF); 
    return arrayOfShort;
  }
  
  public static byte[] convertArray(short[] paramArrayOfshort) {
    byte[] arrayOfByte = new byte[paramArrayOfshort.length];
    for (byte b = 0; b < paramArrayOfshort.length; b++)
      arrayOfByte[b] = (byte)paramArrayOfshort[b]; 
    return arrayOfByte;
  }
  
  public static boolean equals(short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    if (paramArrayOfshort1.length != paramArrayOfshort2.length)
      return false; 
    int i = 1;
    for (int j = paramArrayOfshort1.length - 1; j >= 0; j--)
      i &= (paramArrayOfshort1[j] == paramArrayOfshort2[j]) ? 1 : 0; 
    return i;
  }
  
  public static boolean equals(short[][] paramArrayOfshort1, short[][] paramArrayOfshort2) {
    if (paramArrayOfshort1.length != paramArrayOfshort2.length)
      return false; 
    boolean bool = true;
    for (int i = paramArrayOfshort1.length - 1; i >= 0; i--)
      bool &= equals(paramArrayOfshort1[i], paramArrayOfshort2[i]); 
    return bool;
  }
  
  public static boolean equals(short[][][] paramArrayOfshort1, short[][][] paramArrayOfshort2) {
    if (paramArrayOfshort1.length != paramArrayOfshort2.length)
      return false; 
    boolean bool = true;
    for (int i = paramArrayOfshort1.length - 1; i >= 0; i--)
      bool &= equals(paramArrayOfshort1[i], paramArrayOfshort2[i]); 
    return bool;
  }
  
  public static short[][] cloneArray(short[][] paramArrayOfshort) {
    short[][] arrayOfShort = new short[paramArrayOfshort.length][];
    for (byte b = 0; b < paramArrayOfshort.length; b++)
      arrayOfShort[b] = Arrays.clone(paramArrayOfshort[b]); 
    return arrayOfShort;
  }
  
  public static short[][][] cloneArray(short[][][] paramArrayOfshort) {
    short[][][] arrayOfShort = new short[paramArrayOfshort.length][(paramArrayOfshort[0]).length][];
    for (byte b = 0; b < paramArrayOfshort.length; b++) {
      for (byte b1 = 0; b1 < (paramArrayOfshort[0]).length; b1++)
        arrayOfShort[b][b1] = Arrays.clone(paramArrayOfshort[b][b1]); 
    } 
    return arrayOfShort;
  }
  
  public static byte[] hash(Digest paramDigest, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    int i = paramDigest.getDigestSize();
    paramDigest.update(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    paramDigest.update(paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
    if (paramArrayOfbyte3.length == i) {
      paramDigest.doFinal(paramArrayOfbyte3, 0);
      return paramArrayOfbyte3;
    } 
    byte[] arrayOfByte = new byte[i];
    paramDigest.doFinal(arrayOfByte, 0);
    if (paramArrayOfbyte3.length < i) {
      System.arraycopy(arrayOfByte, 0, paramArrayOfbyte3, 0, paramArrayOfbyte3.length);
      return paramArrayOfbyte3;
    } 
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte3, 0, arrayOfByte.length);
    int j = paramArrayOfbyte3.length - i;
    int k;
    for (k = i; j >= arrayOfByte.length; k += arrayOfByte.length) {
      paramDigest.update(arrayOfByte, 0, arrayOfByte.length);
      paramDigest.doFinal(arrayOfByte, 0);
      System.arraycopy(arrayOfByte, 0, paramArrayOfbyte3, k, arrayOfByte.length);
      j -= arrayOfByte.length;
    } 
    if (j > 0) {
      paramDigest.update(arrayOfByte, 0, arrayOfByte.length);
      paramDigest.doFinal(arrayOfByte, 0);
      System.arraycopy(arrayOfByte, 0, paramArrayOfbyte3, k, j);
    } 
    return paramArrayOfbyte3;
  }
  
  public static byte[] hash(Digest paramDigest, byte[] paramArrayOfbyte, int paramInt) {
    int i = paramDigest.getDigestSize();
    paramDigest.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    byte[] arrayOfByte2 = new byte[i];
    paramDigest.doFinal(arrayOfByte2, 0);
    if (paramInt == i)
      return arrayOfByte2; 
    if (paramInt < i)
      return Arrays.copyOf(arrayOfByte2, paramInt); 
    byte[] arrayOfByte1 = Arrays.copyOf(arrayOfByte2, i);
    int j;
    for (j = paramInt - i; j >= i; j -= i) {
      paramDigest.update(arrayOfByte2, 0, i);
      arrayOfByte2 = new byte[i];
      paramDigest.doFinal(arrayOfByte2, 0);
      arrayOfByte1 = Arrays.concatenate(arrayOfByte1, arrayOfByte2);
    } 
    if (j > 0) {
      paramDigest.update(arrayOfByte2, 0, i);
      arrayOfByte2 = new byte[i];
      paramDigest.doFinal(arrayOfByte2, 0);
      int k = arrayOfByte1.length;
      arrayOfByte1 = Arrays.copyOf(arrayOfByte1, k + j);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, k, j);
    } 
    return arrayOfByte1;
  }
  
  public static short[][] generate_random_2d(SecureRandom paramSecureRandom, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = new byte[paramInt1 * paramInt2];
    paramSecureRandom.nextBytes(arrayOfByte);
    short[][] arrayOfShort = new short[paramInt1][paramInt2];
    for (byte b = 0; b < paramInt2; b++) {
      for (byte b1 = 0; b1 < paramInt1; b1++)
        arrayOfShort[b1][b] = (short)(arrayOfByte[b * paramInt1 + b1] & 0xFF); 
    } 
    return arrayOfShort;
  }
  
  public static short[][][] generate_random(SecureRandom paramSecureRandom, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i;
    if (paramBoolean) {
      i = paramInt1 * paramInt2 * (paramInt2 + 1) / 2;
    } else {
      i = paramInt1 * paramInt2 * paramInt3;
    } 
    byte[] arrayOfByte = new byte[i];
    paramSecureRandom.nextBytes(arrayOfByte);
    byte b1 = 0;
    short[][][] arrayOfShort = new short[paramInt1][paramInt2][paramInt3];
    for (byte b2 = 0; b2 < paramInt2; b2++) {
      for (byte b = 0; b < paramInt3; b++) {
        for (byte b3 = 0; b3 < paramInt1; b3++) {
          if (!paramBoolean || b2 <= b)
            arrayOfShort[b3][b2][b] = (short)(arrayOfByte[b1++] & 0xFF); 
        } 
      } 
    } 
    return arrayOfShort;
  }
  
  public static byte[] getEncoded(short[][] paramArrayOfshort) {
    int i = paramArrayOfshort.length;
    int j = (paramArrayOfshort[0]).length;
    byte[] arrayOfByte = new byte[i * j];
    for (byte b = 0; b < j; b++) {
      for (byte b1 = 0; b1 < i; b1++)
        arrayOfByte[b * i + b1] = (byte)paramArrayOfshort[b1][b]; 
    } 
    return arrayOfByte;
  }
  
  public static byte[] getEncoded(short[][][] paramArrayOfshort, boolean paramBoolean) {
    int m;
    int i = paramArrayOfshort.length;
    int j = (paramArrayOfshort[0]).length;
    int k = (paramArrayOfshort[0][0]).length;
    if (paramBoolean) {
      m = i * j * (j + 1) / 2;
    } else {
      m = i * j * k;
    } 
    byte[] arrayOfByte = new byte[m];
    byte b1 = 0;
    for (byte b2 = 0; b2 < j; b2++) {
      for (byte b = 0; b < k; b++) {
        for (byte b3 = 0; b3 < i; b3++) {
          if (!paramBoolean || b2 <= b) {
            arrayOfByte[b1] = (byte)paramArrayOfshort[b3][b2][b];
            b1++;
          } 
        } 
      } 
    } 
    return arrayOfByte;
  }
  
  public static int loadEncoded(short[][] paramArrayOfshort, byte[] paramArrayOfbyte, int paramInt) {
    int i = paramArrayOfshort.length;
    int j = (paramArrayOfshort[0]).length;
    for (byte b = 0; b < j; b++) {
      for (byte b1 = 0; b1 < i; b1++)
        paramArrayOfshort[b1][b] = (short)(paramArrayOfbyte[paramInt + b * i + b1] & 0xFF); 
    } 
    return i * j;
  }
  
  public static int loadEncoded(short[][][] paramArrayOfshort, byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    int i = paramArrayOfshort.length;
    int j = (paramArrayOfshort[0]).length;
    int k = (paramArrayOfshort[0][0]).length;
    byte b1 = 0;
    for (byte b2 = 0; b2 < j; b2++) {
      for (byte b = 0; b < k; b++) {
        for (byte b3 = 0; b3 < i; b3++) {
          if (!paramBoolean || b2 <= b)
            paramArrayOfshort[b3][b2][b] = (short)(paramArrayOfbyte[paramInt + b1++] & 0xFF); 
        } 
      } 
    } 
    return b1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\rainbow\RainbowUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */