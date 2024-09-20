package org.bouncycastle.crypto.fpe;

import java.math.BigInteger;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.util.RadixConverter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

class SP80038G {
  static final String FPE_DISABLED = "org.bouncycastle.fpe.disable";
  
  static final String FF1_DISABLED = "org.bouncycastle.fpe.disable_ff1";
  
  protected static final int BLOCK_SIZE = 16;
  
  protected static final double LOG2 = Math.log(2.0D);
  
  protected static final double TWO_TO_96 = Math.pow(2.0D, 96.0D);
  
  static byte[] decryptFF1(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    checkArgs(paramBlockCipher, true, paramRadixConverter.getRadix(), paramArrayOfbyte2, paramInt1, paramInt2);
    int i = paramInt2;
    int j = i / 2;
    int k = i - j;
    short[] arrayOfShort1 = toShort(paramArrayOfbyte2, paramInt1, j);
    short[] arrayOfShort2 = toShort(paramArrayOfbyte2, paramInt1 + j, k);
    short[] arrayOfShort3 = decFF1(paramBlockCipher, paramRadixConverter, paramArrayOfbyte1, i, j, k, arrayOfShort1, arrayOfShort2);
    return toByte(arrayOfShort3);
  }
  
  static short[] decryptFF1w(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    checkArgs(paramBlockCipher, true, paramRadixConverter.getRadix(), paramArrayOfshort, paramInt1, paramInt2);
    int i = paramInt2;
    int j = i / 2;
    int k = i - j;
    short[] arrayOfShort1 = new short[j];
    short[] arrayOfShort2 = new short[k];
    System.arraycopy(paramArrayOfshort, paramInt1, arrayOfShort1, 0, j);
    System.arraycopy(paramArrayOfshort, paramInt1 + j, arrayOfShort2, 0, k);
    return decFF1(paramBlockCipher, paramRadixConverter, paramArrayOfbyte, i, j, k, arrayOfShort1, arrayOfShort2);
  }
  
  static short[] decFF1(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    int i = paramRadixConverter.getRadix();
    int j = paramArrayOfbyte.length;
    int k = calculateB_FF1(i, paramInt3);
    int m = k + 7 & 0xFFFFFFFC;
    byte[] arrayOfByte = calculateP_FF1(i, (byte)paramInt2, paramInt1, j);
    BigInteger bigInteger = BigInteger.valueOf(i);
    BigInteger[] arrayOfBigInteger = calculateModUV(bigInteger, paramInt2, paramInt3);
    int n = paramInt2;
    for (byte b = 9; b >= 0; b--) {
      BigInteger bigInteger1 = calculateY_FF1(paramBlockCipher, paramArrayOfbyte, k, m, b, arrayOfByte, paramArrayOfshort1, paramRadixConverter);
      n = paramInt1 - n;
      BigInteger bigInteger2 = arrayOfBigInteger[b & 0x1];
      BigInteger bigInteger3 = paramRadixConverter.fromEncoding(paramArrayOfshort2).subtract(bigInteger1).mod(bigInteger2);
      short[] arrayOfShort = paramArrayOfshort2;
      paramArrayOfshort2 = paramArrayOfshort1;
      paramArrayOfshort1 = arrayOfShort;
      paramRadixConverter.toEncoding(bigInteger3, n, arrayOfShort);
    } 
    return Arrays.concatenate(paramArrayOfshort1, paramArrayOfshort2);
  }
  
  static byte[] decryptFF3(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    checkArgs(paramBlockCipher, false, paramRadixConverter.getRadix(), paramArrayOfbyte2, paramInt1, paramInt2);
    if (paramArrayOfbyte1.length != 8)
      throw new IllegalArgumentException(); 
    return implDecryptFF3(paramBlockCipher, paramRadixConverter, paramArrayOfbyte1, paramArrayOfbyte2, paramInt1, paramInt2);
  }
  
  static byte[] decryptFF3_1(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    checkArgs(paramBlockCipher, false, paramRadixConverter.getRadix(), paramArrayOfbyte2, paramInt1, paramInt2);
    if (paramArrayOfbyte1.length != 7)
      throw new IllegalArgumentException("tweak should be 56 bits"); 
    byte[] arrayOfByte = calculateTweak64_FF3_1(paramArrayOfbyte1);
    return implDecryptFF3(paramBlockCipher, paramRadixConverter, arrayOfByte, paramArrayOfbyte2, paramInt1, paramInt2);
  }
  
  static short[] decryptFF3_1w(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    checkArgs(paramBlockCipher, false, paramRadixConverter.getRadix(), paramArrayOfshort, paramInt1, paramInt2);
    if (paramArrayOfbyte.length != 7)
      throw new IllegalArgumentException("tweak should be 56 bits"); 
    byte[] arrayOfByte = calculateTweak64_FF3_1(paramArrayOfbyte);
    return implDecryptFF3w(paramBlockCipher, paramRadixConverter, arrayOfByte, paramArrayOfshort, paramInt1, paramInt2);
  }
  
  static byte[] encryptFF1(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    checkArgs(paramBlockCipher, true, paramRadixConverter.getRadix(), paramArrayOfbyte2, paramInt1, paramInt2);
    int i = paramInt2;
    int j = i / 2;
    int k = i - j;
    short[] arrayOfShort1 = toShort(paramArrayOfbyte2, paramInt1, j);
    short[] arrayOfShort2 = toShort(paramArrayOfbyte2, paramInt1 + j, k);
    return toByte(encFF1(paramBlockCipher, paramRadixConverter, paramArrayOfbyte1, i, j, k, arrayOfShort1, arrayOfShort2));
  }
  
  static short[] encryptFF1w(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    checkArgs(paramBlockCipher, true, paramRadixConverter.getRadix(), paramArrayOfshort, paramInt1, paramInt2);
    int i = paramInt2;
    int j = i / 2;
    int k = i - j;
    short[] arrayOfShort1 = new short[j];
    short[] arrayOfShort2 = new short[k];
    System.arraycopy(paramArrayOfshort, paramInt1, arrayOfShort1, 0, j);
    System.arraycopy(paramArrayOfshort, paramInt1 + j, arrayOfShort2, 0, k);
    return encFF1(paramBlockCipher, paramRadixConverter, paramArrayOfbyte, i, j, k, arrayOfShort1, arrayOfShort2);
  }
  
  private static short[] encFF1(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    int i = paramRadixConverter.getRadix();
    int j = paramArrayOfbyte.length;
    int k = calculateB_FF1(i, paramInt3);
    int m = k + 7 & 0xFFFFFFFC;
    byte[] arrayOfByte = calculateP_FF1(i, (byte)paramInt2, paramInt1, j);
    BigInteger bigInteger = BigInteger.valueOf(i);
    BigInteger[] arrayOfBigInteger = calculateModUV(bigInteger, paramInt2, paramInt3);
    int n = paramInt3;
    for (byte b = 0; b < 10; b++) {
      BigInteger bigInteger1 = calculateY_FF1(paramBlockCipher, paramArrayOfbyte, k, m, b, arrayOfByte, paramArrayOfshort2, paramRadixConverter);
      n = paramInt1 - n;
      BigInteger bigInteger2 = arrayOfBigInteger[b & 0x1];
      BigInteger bigInteger3 = paramRadixConverter.fromEncoding(paramArrayOfshort1);
      BigInteger bigInteger4 = bigInteger3.add(bigInteger1).mod(bigInteger2);
      short[] arrayOfShort = paramArrayOfshort1;
      paramArrayOfshort1 = paramArrayOfshort2;
      paramArrayOfshort2 = arrayOfShort;
      paramRadixConverter.toEncoding(bigInteger4, n, arrayOfShort);
    } 
    return Arrays.concatenate(paramArrayOfshort1, paramArrayOfshort2);
  }
  
  static byte[] encryptFF3(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    checkArgs(paramBlockCipher, false, paramRadixConverter.getRadix(), paramArrayOfbyte2, paramInt1, paramInt2);
    if (paramArrayOfbyte1.length != 8)
      throw new IllegalArgumentException(); 
    return implEncryptFF3(paramBlockCipher, paramRadixConverter, paramArrayOfbyte1, paramArrayOfbyte2, paramInt1, paramInt2);
  }
  
  static short[] encryptFF3w(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    checkArgs(paramBlockCipher, false, paramRadixConverter.getRadix(), paramArrayOfshort, paramInt1, paramInt2);
    if (paramArrayOfbyte.length != 8)
      throw new IllegalArgumentException(); 
    return implEncryptFF3w(paramBlockCipher, paramRadixConverter, paramArrayOfbyte, paramArrayOfshort, paramInt1, paramInt2);
  }
  
  static short[] encryptFF3_1w(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    checkArgs(paramBlockCipher, false, paramRadixConverter.getRadix(), paramArrayOfshort, paramInt1, paramInt2);
    if (paramArrayOfbyte.length != 7)
      throw new IllegalArgumentException("tweak should be 56 bits"); 
    byte[] arrayOfByte = calculateTweak64_FF3_1(paramArrayOfbyte);
    return encryptFF3w(paramBlockCipher, paramRadixConverter, arrayOfByte, paramArrayOfshort, paramInt1, paramInt2);
  }
  
  static byte[] encryptFF3_1(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    checkArgs(paramBlockCipher, false, paramRadixConverter.getRadix(), paramArrayOfbyte2, paramInt1, paramInt2);
    if (paramArrayOfbyte1.length != 7)
      throw new IllegalArgumentException("tweak should be 56 bits"); 
    byte[] arrayOfByte = calculateTweak64_FF3_1(paramArrayOfbyte1);
    return encryptFF3(paramBlockCipher, paramRadixConverter, arrayOfByte, paramArrayOfbyte2, paramInt1, paramInt2);
  }
  
  protected static int calculateB_FF1(int paramInt1, int paramInt2) {
    int i = Integers.numberOfTrailingZeros(paramInt1);
    int j = i * paramInt2;
    int k = paramInt1 >>> i;
    if (k != 1)
      j += BigInteger.valueOf(k).pow(paramInt2).bitLength(); 
    return (j + 7) / 8;
  }
  
  protected static BigInteger[] calculateModUV(BigInteger paramBigInteger, int paramInt1, int paramInt2) {
    BigInteger[] arrayOfBigInteger = new BigInteger[2];
    arrayOfBigInteger[0] = paramBigInteger.pow(paramInt1);
    arrayOfBigInteger[1] = arrayOfBigInteger[0];
    if (paramInt2 != paramInt1)
      arrayOfBigInteger[1] = arrayOfBigInteger[1].multiply(paramBigInteger); 
    return arrayOfBigInteger;
  }
  
  protected static byte[] calculateP_FF1(int paramInt1, byte paramByte, int paramInt2, int paramInt3) {
    byte[] arrayOfByte = new byte[16];
    arrayOfByte[0] = 1;
    arrayOfByte[1] = 2;
    arrayOfByte[2] = 1;
    arrayOfByte[3] = 0;
    arrayOfByte[4] = (byte)(paramInt1 >> 8);
    arrayOfByte[5] = (byte)paramInt1;
    arrayOfByte[6] = 10;
    arrayOfByte[7] = paramByte;
    Pack.intToBigEndian(paramInt2, arrayOfByte, 8);
    Pack.intToBigEndian(paramInt3, arrayOfByte, 12);
    return arrayOfByte;
  }
  
  protected static byte[] calculateTweak64_FF3_1(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[8];
    arrayOfByte[0] = paramArrayOfbyte[0];
    arrayOfByte[1] = paramArrayOfbyte[1];
    arrayOfByte[2] = paramArrayOfbyte[2];
    arrayOfByte[3] = (byte)(paramArrayOfbyte[3] & 0xF0);
    arrayOfByte[4] = paramArrayOfbyte[4];
    arrayOfByte[5] = paramArrayOfbyte[5];
    arrayOfByte[6] = paramArrayOfbyte[6];
    arrayOfByte[7] = (byte)(paramArrayOfbyte[3] << 4);
    return arrayOfByte;
  }
  
  protected static BigInteger calculateY_FF1(BlockCipher paramBlockCipher, byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfbyte2, short[] paramArrayOfshort, RadixConverter paramRadixConverter) {
    int i = paramArrayOfbyte1.length;
    BigInteger bigInteger = paramRadixConverter.fromEncoding(paramArrayOfshort);
    byte[] arrayOfByte1 = BigIntegers.asUnsignedByteArray(bigInteger);
    int j = -(i + paramInt1 + 1) & 0xF;
    byte[] arrayOfByte2 = new byte[i + j + 1 + paramInt1];
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte2, 0, i);
    arrayOfByte2[i + j] = (byte)paramInt3;
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, arrayOfByte2.length - arrayOfByte1.length, arrayOfByte1.length);
    byte[] arrayOfByte3 = prf(paramBlockCipher, Arrays.concatenate(paramArrayOfbyte2, arrayOfByte2));
    byte[] arrayOfByte4 = arrayOfByte3;
    if (paramInt2 > 16) {
      int k = (paramInt2 + 16 - 1) / 16;
      arrayOfByte4 = new byte[k * 16];
      int m = Pack.bigEndianToInt(arrayOfByte3, 12);
      System.arraycopy(arrayOfByte3, 0, arrayOfByte4, 0, 16);
      for (byte b = 1; b < k; b++) {
        int n = b * 16;
        System.arraycopy(arrayOfByte3, 0, arrayOfByte4, n, 12);
        Pack.intToBigEndian(m ^ b, arrayOfByte4, n + 16 - 4);
        paramBlockCipher.processBlock(arrayOfByte4, n, arrayOfByte4, n);
      } 
    } 
    return num(arrayOfByte4, 0, paramInt2);
  }
  
  protected static BigInteger calculateY_FF3(BlockCipher paramBlockCipher, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, short[] paramArrayOfshort, RadixConverter paramRadixConverter) {
    byte[] arrayOfByte1 = new byte[16];
    Pack.intToBigEndian(Pack.bigEndianToInt(paramArrayOfbyte, paramInt1) ^ paramInt2, arrayOfByte1, 0);
    BigInteger bigInteger = paramRadixConverter.fromEncoding(paramArrayOfshort);
    BigIntegers.asUnsignedByteArray(bigInteger, arrayOfByte1, 4, 12);
    Arrays.reverseInPlace(arrayOfByte1);
    paramBlockCipher.processBlock(arrayOfByte1, 0, arrayOfByte1, 0);
    Arrays.reverseInPlace(arrayOfByte1);
    byte[] arrayOfByte2 = arrayOfByte1;
    return num(arrayOfByte2, 0, arrayOfByte2.length);
  }
  
  protected static void checkArgs(BlockCipher paramBlockCipher, boolean paramBoolean, int paramInt1, short[] paramArrayOfshort, int paramInt2, int paramInt3) {
    checkCipher(paramBlockCipher);
    if (paramInt1 < 2 || paramInt1 > 65536)
      throw new IllegalArgumentException(); 
    checkData(paramBoolean, paramInt1, paramArrayOfshort, paramInt2, paramInt3);
  }
  
  protected static void checkArgs(BlockCipher paramBlockCipher, boolean paramBoolean, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    checkCipher(paramBlockCipher);
    if (paramInt1 < 2 || paramInt1 > 256)
      throw new IllegalArgumentException(); 
    checkData(paramBoolean, paramInt1, paramArrayOfbyte, paramInt2, paramInt3);
  }
  
  protected static void checkCipher(BlockCipher paramBlockCipher) {
    if (16 != paramBlockCipher.getBlockSize())
      throw new IllegalArgumentException(); 
  }
  
  protected static void checkData(boolean paramBoolean, int paramInt1, short[] paramArrayOfshort, int paramInt2, int paramInt3) {
    checkLength(paramBoolean, paramInt1, paramInt3);
    for (byte b = 0; b < paramInt3; b++) {
      int i = paramArrayOfshort[paramInt2 + b] & 0xFFFF;
      if (i >= paramInt1)
        throw new IllegalArgumentException("input data outside of radix"); 
    } 
  }
  
  protected static void checkData(boolean paramBoolean, int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    checkLength(paramBoolean, paramInt1, paramInt3);
    for (byte b = 0; b < paramInt3; b++) {
      int i = paramArrayOfbyte[paramInt2 + b] & 0xFF;
      if (i >= paramInt1)
        throw new IllegalArgumentException("input data outside of radix"); 
    } 
  }
  
  private static void checkLength(boolean paramBoolean, int paramInt1, int paramInt2) {
    if (paramInt2 < 2 || Math.pow(paramInt1, paramInt2) < 1000000.0D)
      throw new IllegalArgumentException("input too short"); 
    if (!paramBoolean) {
      int i = 2 * (int)Math.floor(Math.log(TWO_TO_96) / Math.log(paramInt1));
      if (paramInt2 > i)
        throw new IllegalArgumentException("maximum input length is " + i); 
    } 
  }
  
  protected static byte[] implDecryptFF3(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = paramArrayOfbyte1;
    int i = paramInt2;
    int j = i / 2;
    int k = i - j;
    short[] arrayOfShort1 = toShort(paramArrayOfbyte2, paramInt1, k);
    short[] arrayOfShort2 = toShort(paramArrayOfbyte2, paramInt1 + k, j);
    short[] arrayOfShort3 = decFF3_1(paramBlockCipher, paramRadixConverter, arrayOfByte, i, j, k, arrayOfShort1, arrayOfShort2);
    return toByte(arrayOfShort3);
  }
  
  protected static short[] implDecryptFF3w(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = paramInt2;
    int j = i / 2;
    int k = i - j;
    short[] arrayOfShort1 = new short[k];
    short[] arrayOfShort2 = new short[j];
    System.arraycopy(paramArrayOfshort, paramInt1, arrayOfShort1, 0, k);
    System.arraycopy(paramArrayOfshort, paramInt1 + k, arrayOfShort2, 0, j);
    return decFF3_1(paramBlockCipher, paramRadixConverter, arrayOfByte, i, j, k, arrayOfShort1, arrayOfShort2);
  }
  
  private static short[] decFF3_1(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    BigInteger bigInteger = BigInteger.valueOf(paramRadixConverter.getRadix());
    BigInteger[] arrayOfBigInteger = calculateModUV(bigInteger, paramInt2, paramInt3);
    int i = paramInt3;
    Arrays.reverseInPlace(paramArrayOfshort1);
    Arrays.reverseInPlace(paramArrayOfshort2);
    for (byte b = 7; b >= 0; b--) {
      i = paramInt1 - i;
      BigInteger bigInteger1 = arrayOfBigInteger[1 - (b & 0x1)];
      int j = 4 - (b & 0x1) * 4;
      BigInteger bigInteger2 = calculateY_FF3(paramBlockCipher, paramArrayOfbyte, j, b, paramArrayOfshort1, paramRadixConverter);
      BigInteger bigInteger3 = paramRadixConverter.fromEncoding(paramArrayOfshort2).subtract(bigInteger2).mod(bigInteger1);
      short[] arrayOfShort = paramArrayOfshort2;
      paramArrayOfshort2 = paramArrayOfshort1;
      paramArrayOfshort1 = arrayOfShort;
      paramRadixConverter.toEncoding(bigInteger3, i, arrayOfShort);
    } 
    Arrays.reverseInPlace(paramArrayOfshort1);
    Arrays.reverseInPlace(paramArrayOfshort2);
    return Arrays.concatenate(paramArrayOfshort1, paramArrayOfshort2);
  }
  
  protected static byte[] implEncryptFF3(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = paramArrayOfbyte1;
    int i = paramInt2;
    int j = i / 2;
    int k = i - j;
    short[] arrayOfShort1 = toShort(paramArrayOfbyte2, paramInt1, k);
    short[] arrayOfShort2 = toShort(paramArrayOfbyte2, paramInt1 + k, j);
    short[] arrayOfShort3 = encFF3_1(paramBlockCipher, paramRadixConverter, arrayOfByte, i, j, k, arrayOfShort1, arrayOfShort2);
    return toByte(arrayOfShort3);
  }
  
  protected static short[] implEncryptFF3w(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = paramArrayOfbyte;
    int i = paramInt2;
    int j = i / 2;
    int k = i - j;
    short[] arrayOfShort1 = new short[k];
    short[] arrayOfShort2 = new short[j];
    System.arraycopy(paramArrayOfshort, paramInt1, arrayOfShort1, 0, k);
    System.arraycopy(paramArrayOfshort, paramInt1 + k, arrayOfShort2, 0, j);
    return encFF3_1(paramBlockCipher, paramRadixConverter, arrayOfByte, i, j, k, arrayOfShort1, arrayOfShort2);
  }
  
  private static short[] encFF3_1(BlockCipher paramBlockCipher, RadixConverter paramRadixConverter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    BigInteger bigInteger = BigInteger.valueOf(paramRadixConverter.getRadix());
    BigInteger[] arrayOfBigInteger = calculateModUV(bigInteger, paramInt2, paramInt3);
    int i = paramInt2;
    Arrays.reverseInPlace(paramArrayOfshort1);
    Arrays.reverseInPlace(paramArrayOfshort2);
    for (byte b = 0; b < 8; b++) {
      i = paramInt1 - i;
      BigInteger bigInteger1 = arrayOfBigInteger[1 - (b & 0x1)];
      int j = 4 - (b & 0x1) * 4;
      BigInteger bigInteger2 = calculateY_FF3(paramBlockCipher, paramArrayOfbyte, j, b, paramArrayOfshort2, paramRadixConverter);
      BigInteger bigInteger3 = paramRadixConverter.fromEncoding(paramArrayOfshort1).add(bigInteger2).mod(bigInteger1);
      short[] arrayOfShort = paramArrayOfshort1;
      paramArrayOfshort1 = paramArrayOfshort2;
      paramArrayOfshort2 = arrayOfShort;
      paramRadixConverter.toEncoding(bigInteger3, i, arrayOfShort);
    } 
    Arrays.reverseInPlace(paramArrayOfshort1);
    Arrays.reverseInPlace(paramArrayOfshort2);
    return Arrays.concatenate(paramArrayOfshort1, paramArrayOfshort2);
  }
  
  protected static BigInteger num(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return new BigInteger(1, Arrays.copyOfRange(paramArrayOfbyte, paramInt1, paramInt1 + paramInt2));
  }
  
  protected static byte[] prf(BlockCipher paramBlockCipher, byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length % 16 != 0)
      throw new IllegalArgumentException(); 
    int i = paramArrayOfbyte.length / 16;
    byte[] arrayOfByte = new byte[16];
    for (byte b = 0; b < i; b++) {
      Bytes.xorTo(16, paramArrayOfbyte, b * 16, arrayOfByte, 0);
      paramBlockCipher.processBlock(arrayOfByte, 0, arrayOfByte, 0);
    } 
    return arrayOfByte;
  }
  
  private static byte[] toByte(short[] paramArrayOfshort) {
    byte[] arrayOfByte = new byte[paramArrayOfshort.length];
    for (byte b = 0; b != arrayOfByte.length; b++)
      arrayOfByte[b] = (byte)paramArrayOfshort[b]; 
    return arrayOfByte;
  }
  
  private static short[] toShort(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    short[] arrayOfShort = new short[paramInt2];
    for (byte b = 0; b != arrayOfShort.length; b++)
      arrayOfShort[b] = (short)(paramArrayOfbyte[paramInt1 + b] & 0xFF); 
    return arrayOfShort;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\fpe\SP80038G.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */