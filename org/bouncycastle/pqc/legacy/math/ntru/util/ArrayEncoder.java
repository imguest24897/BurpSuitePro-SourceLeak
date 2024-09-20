package org.bouncycastle.pqc.legacy.math.ntru.util;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

public class ArrayEncoder {
  private static final int[] COEFF1_TABLE = new int[] { 0, 0, 0, 1, 1, 1, -1, -1 };
  
  private static final int[] COEFF2_TABLE = new int[] { 0, 1, -1, 0, 1, -1, 0, 1 };
  
  private static final int[] BIT1_TABLE = new int[] { 1, 1, 1, 0, 0, 0, 1, 0, 1 };
  
  private static final int[] BIT2_TABLE = new int[] { 1, 1, 1, 1, 0, 0, 0, 1, 0 };
  
  private static final int[] BIT3_TABLE = new int[] { 1, 0, 1, 0, 0, 1, 1, 1, 0 };
  
  public static byte[] encodeModQ(int[] paramArrayOfint, int paramInt) {
    int i = 31 - Integer.numberOfLeadingZeros(paramInt);
    int j = paramArrayOfint.length * i;
    int k = (j + 7) / 8;
    byte[] arrayOfByte = new byte[k];
    byte b1 = 0;
    byte b2 = 0;
    for (byte b3 = 0; b3 < paramArrayOfint.length; b3++) {
      for (byte b = 0; b < i; b++) {
        int m = paramArrayOfint[b3] >> b & 0x1;
        arrayOfByte[b2] = (byte)(arrayOfByte[b2] | m << b1);
        if (b1 == 7) {
          b1 = 0;
          b2++;
        } else {
          b1++;
        } 
      } 
    } 
    return arrayOfByte;
  }
  
  public static int[] decodeModQ(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int[] arrayOfInt = new int[paramInt1];
    int i = 31 - Integer.numberOfLeadingZeros(paramInt2);
    int j = paramInt1 * i;
    byte b1 = 0;
    for (byte b2 = 0; b2 < j; b2++) {
      if (b2 > 0 && b2 % i == 0)
        b1++; 
      int k = getBit(paramArrayOfbyte, b2);
      arrayOfInt[b1] = arrayOfInt[b1] + (k << b2 % i);
    } 
    return arrayOfInt;
  }
  
  public static int[] decodeModQ(InputStream paramInputStream, int paramInt1, int paramInt2) throws IOException {
    int i = 31 - Integer.numberOfLeadingZeros(paramInt2);
    int j = (paramInt1 * i + 7) / 8;
    byte[] arrayOfByte = Util.readFullLength(paramInputStream, j);
    return decodeModQ(arrayOfByte, paramInt1, paramInt2);
  }
  
  public static int[] decodeMod3Sves(byte[] paramArrayOfbyte, int paramInt) {
    int[] arrayOfInt = new int[paramInt];
    byte b1 = 0;
    byte b2 = 0;
    while (b2 < paramArrayOfbyte.length * 8) {
      int i = getBit(paramArrayOfbyte, b2++);
      int j = getBit(paramArrayOfbyte, b2++);
      int k = getBit(paramArrayOfbyte, b2++);
      int m = i * 4 + j * 2 + k;
      arrayOfInt[b1++] = COEFF1_TABLE[m];
      arrayOfInt[b1++] = COEFF2_TABLE[m];
      if (b1 > paramInt - 2)
        break; 
    } 
    return arrayOfInt;
  }
  
  public static byte[] encodeMod3Sves(int[] paramArrayOfint) {
    int i = (paramArrayOfint.length * 3 + 1) / 2;
    int j = (i + 7) / 8;
    byte[] arrayOfByte = new byte[j];
    byte b1 = 0;
    byte b2 = 0;
    byte b3 = 0;
    while (b3 < paramArrayOfint.length / 2 * 2) {
      int k = paramArrayOfint[b3++] + 1;
      int m = paramArrayOfint[b3++] + 1;
      if (k == 0 && m == 0)
        throw new IllegalStateException("Illegal encoding!"); 
      int n = k * 3 + m;
      int[] arrayOfInt = { BIT1_TABLE[n], BIT2_TABLE[n], BIT3_TABLE[n] };
      for (byte b = 0; b < 3; b++) {
        arrayOfByte[b2] = (byte)(arrayOfByte[b2] | arrayOfInt[b] << b1);
        if (b1 == 7) {
          b1 = 0;
          b2++;
        } else {
          b1++;
        } 
      } 
    } 
    return arrayOfByte;
  }
  
  public static byte[] encodeMod3Tight(int[] paramArrayOfint) {
    BigInteger bigInteger = BigInteger.ZERO;
    int i;
    for (i = paramArrayOfint.length - 1; i >= 0; i--) {
      bigInteger = bigInteger.multiply(BigInteger.valueOf(3L));
      bigInteger = bigInteger.add(BigInteger.valueOf((paramArrayOfint[i] + 1)));
    } 
    i = (BigInteger.valueOf(3L).pow(paramArrayOfint.length).bitLength() + 7) / 8;
    byte[] arrayOfByte = bigInteger.toByteArray();
    if (arrayOfByte.length < i) {
      byte[] arrayOfByte1 = new byte[i];
      System.arraycopy(arrayOfByte, 0, arrayOfByte1, i - arrayOfByte.length, arrayOfByte.length);
      return arrayOfByte1;
    } 
    if (arrayOfByte.length > i)
      arrayOfByte = Arrays.copyOfRange(arrayOfByte, 1, arrayOfByte.length); 
    return arrayOfByte;
  }
  
  public static int[] decodeMod3Tight(byte[] paramArrayOfbyte, int paramInt) {
    BigInteger bigInteger = new BigInteger(1, paramArrayOfbyte);
    int[] arrayOfInt = new int[paramInt];
    for (byte b = 0; b < paramInt; b++) {
      arrayOfInt[b] = bigInteger.mod(BigInteger.valueOf(3L)).intValue() - 1;
      if (arrayOfInt[b] > 1)
        arrayOfInt[b] = arrayOfInt[b] - 3; 
      bigInteger = bigInteger.divide(BigInteger.valueOf(3L));
    } 
    return arrayOfInt;
  }
  
  public static int[] decodeMod3Tight(InputStream paramInputStream, int paramInt) throws IOException {
    int i = (int)Math.ceil(paramInt * Math.log(3.0D) / Math.log(2.0D) / 8.0D);
    byte[] arrayOfByte = Util.readFullLength(paramInputStream, i);
    return decodeMod3Tight(arrayOfByte, paramInt);
  }
  
  private static int getBit(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramInt / 8;
    int j = paramArrayOfbyte[i] & 0xFF;
    return j >> paramInt % 8 & 0x1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntr\\util\ArrayEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */