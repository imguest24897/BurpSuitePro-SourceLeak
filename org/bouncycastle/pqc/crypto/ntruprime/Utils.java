package org.bouncycastle.pqc.crypto.ntruprime;

import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

class Utils {
  protected static int getRandomUnsignedInteger(SecureRandom paramSecureRandom) {
    byte[] arrayOfByte = new byte[4];
    paramSecureRandom.nextBytes(arrayOfByte);
    return bToUnsignedInt(arrayOfByte[0]) + (bToUnsignedInt(arrayOfByte[1]) << 8) + (bToUnsignedInt(arrayOfByte[2]) << 16) + (bToUnsignedInt(arrayOfByte[3]) << 24);
  }
  
  protected static void getRandomSmallPolynomial(SecureRandom paramSecureRandom, byte[] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      paramArrayOfbyte[b] = (byte)(((getRandomUnsignedInteger(paramSecureRandom) & 0x3FFFFFFF) * 3 >>> 30) - 1); 
  }
  
  protected static int getModFreeze(int paramInt1, int paramInt2) {
    return getSignedDivMod(paramInt1 + (paramInt2 - 1) / 2, paramInt2)[1] - (paramInt2 - 1) / 2;
  }
  
  protected static boolean isInvertiblePolynomialInR3(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    byte[] arrayOfByte1 = new byte[paramInt + 1];
    byte[] arrayOfByte2 = new byte[paramInt + 1];
    byte[] arrayOfByte3 = new byte[paramInt + 1];
    byte[] arrayOfByte4 = new byte[paramInt + 1];
    arrayOfByte3[0] = 1;
    arrayOfByte1[0] = 1;
    arrayOfByte1[paramInt - 1] = -1;
    arrayOfByte1[paramInt] = -1;
    byte b2;
    for (b2 = 0; b2 < paramInt; b2++)
      arrayOfByte2[paramInt - 1 - b2] = paramArrayOfbyte1[b2]; 
    arrayOfByte2[paramInt] = 0;
    int i = 1;
    for (byte b1 = 0; b1 < 2 * paramInt - 1; b1++) {
      System.arraycopy(arrayOfByte4, 0, arrayOfByte4, 1, paramInt);
      arrayOfByte4[0] = 0;
      int j = -arrayOfByte2[0] * arrayOfByte1[0];
      int k = checkLessThanZero(-i) & checkNotEqualToZero(arrayOfByte2[0]);
      i ^= k & (i ^ -i);
      i++;
      for (b2 = 0; b2 < paramInt + 1; b2++) {
        int m = k & (arrayOfByte1[b2] ^ arrayOfByte2[b2]);
        arrayOfByte1[b2] = (byte)(arrayOfByte1[b2] ^ m);
        arrayOfByte2[b2] = (byte)(arrayOfByte2[b2] ^ m);
        m = k & (arrayOfByte4[b2] ^ arrayOfByte3[b2]);
        arrayOfByte4[b2] = (byte)(arrayOfByte4[b2] ^ m);
        arrayOfByte3[b2] = (byte)(arrayOfByte3[b2] ^ m);
      } 
      for (b2 = 0; b2 < paramInt + 1; b2++)
        arrayOfByte2[b2] = (byte)getModFreeze(arrayOfByte2[b2] + j * arrayOfByte1[b2], 3); 
      for (b2 = 0; b2 < paramInt + 1; b2++)
        arrayOfByte3[b2] = (byte)getModFreeze(arrayOfByte3[b2] + j * arrayOfByte4[b2], 3); 
      for (b2 = 0; b2 < paramInt; b2++)
        arrayOfByte2[b2] = arrayOfByte2[b2 + 1]; 
      arrayOfByte2[paramInt] = 0;
    } 
    byte b = arrayOfByte1[0];
    for (b2 = 0; b2 < paramInt; b2++)
      paramArrayOfbyte2[b2] = (byte)(b * arrayOfByte4[paramInt - 1 - b2]); 
    return (i == 0);
  }
  
  protected static void minmax(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    int i = paramArrayOfint[paramInt1];
    int j = paramArrayOfint[paramInt2];
    int k = i ^ j;
    int m = j - i;
    m ^= k & (m ^ j ^ Integer.MIN_VALUE);
    m >>>= 31;
    m = -m;
    m &= k;
    paramArrayOfint[paramInt1] = i ^ m;
    paramArrayOfint[paramInt2] = j ^ m;
  }
  
  protected static void cryptoSort(int[] paramArrayOfint, int paramInt) {
    if (paramInt < 2)
      return; 
    int i;
    for (i = 1; i < paramInt - i; i += i);
    for (int j = i; j > 0; j >>>= 1) {
      byte b;
      for (b = 0; b < paramInt - j; b++) {
        if ((b & j) == 0)
          minmax(paramArrayOfint, b, b + j); 
      } 
      int k;
      for (k = i; k > j; k >>>= 1) {
        for (b = 0; b < paramInt - k; b++) {
          if ((b & j) == 0)
            minmax(paramArrayOfint, b + j, b + k); 
        } 
      } 
    } 
  }
  
  protected static void sortGenerateShortPolynomial(byte[] paramArrayOfbyte, int[] paramArrayOfint, int paramInt1, int paramInt2) {
    int i;
    for (i = 0; i < paramInt2; i++)
      paramArrayOfint[i] = paramArrayOfint[i] & 0xFFFFFFFE; 
    for (i = paramInt2; i < paramInt1; i++)
      paramArrayOfint[i] = paramArrayOfint[i] & 0xFFFFFFFD | 0x1; 
    cryptoSort(paramArrayOfint, paramInt1);
    for (i = 0; i < paramInt1; i++)
      paramArrayOfbyte[i] = (byte)((paramArrayOfint[i] & 0x3) - 1); 
  }
  
  protected static void getRandomShortPolynomial(SecureRandom paramSecureRandom, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int[] arrayOfInt = new int[paramInt1];
    for (byte b = 0; b < paramInt1; b++)
      arrayOfInt[b] = getRandomUnsignedInteger(paramSecureRandom); 
    sortGenerateShortPolynomial(paramArrayOfbyte, arrayOfInt, paramInt1, paramInt2);
  }
  
  protected static int getInverseInRQ(int paramInt1, int paramInt2) {
    int i = paramInt1;
    for (byte b = 1; b < paramInt2 - 2; b++)
      i = getModFreeze(paramInt1 * i, paramInt2); 
    return i;
  }
  
  protected static void getOneThirdInverseInRQ(short[] paramArrayOfshort, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    short[] arrayOfShort1 = new short[paramInt1 + 1];
    short[] arrayOfShort2 = new short[paramInt1 + 1];
    short[] arrayOfShort3 = new short[paramInt1 + 1];
    short[] arrayOfShort4 = new short[paramInt1 + 1];
    arrayOfShort3[0] = (short)getInverseInRQ(3, paramInt2);
    arrayOfShort1[0] = 1;
    arrayOfShort1[paramInt1 - 1] = -1;
    arrayOfShort1[paramInt1] = -1;
    byte b2;
    for (b2 = 0; b2 < paramInt1; b2++)
      arrayOfShort2[paramInt1 - 1 - b2] = (short)paramArrayOfbyte[b2]; 
    arrayOfShort2[paramInt1] = 0;
    int i = 1;
    for (byte b1 = 0; b1 < 2 * paramInt1 - 1; b1++) {
      System.arraycopy(arrayOfShort4, 0, arrayOfShort4, 1, paramInt1);
      arrayOfShort4[0] = 0;
      int k = checkLessThanZero(-i) & checkNotEqualToZero(arrayOfShort2[0]);
      i ^= k & (i ^ -i);
      i++;
      for (b2 = 0; b2 < paramInt1 + 1; b2++) {
        int m = k & (arrayOfShort1[b2] ^ arrayOfShort2[b2]);
        arrayOfShort1[b2] = (short)(arrayOfShort1[b2] ^ m);
        arrayOfShort2[b2] = (short)(arrayOfShort2[b2] ^ m);
        m = k & (arrayOfShort4[b2] ^ arrayOfShort3[b2]);
        arrayOfShort4[b2] = (short)(arrayOfShort4[b2] ^ m);
        arrayOfShort3[b2] = (short)(arrayOfShort3[b2] ^ m);
      } 
      short s1 = arrayOfShort1[0];
      short s2 = arrayOfShort2[0];
      for (b2 = 0; b2 < paramInt1 + 1; b2++)
        arrayOfShort2[b2] = (short)getModFreeze(s1 * arrayOfShort2[b2] - s2 * arrayOfShort1[b2], paramInt2); 
      for (b2 = 0; b2 < paramInt1 + 1; b2++)
        arrayOfShort3[b2] = (short)getModFreeze(s1 * arrayOfShort3[b2] - s2 * arrayOfShort4[b2], paramInt2); 
      for (b2 = 0; b2 < paramInt1; b2++)
        arrayOfShort2[b2] = arrayOfShort2[b2 + 1]; 
      arrayOfShort2[paramInt1] = 0;
    } 
    int j = getInverseInRQ(arrayOfShort1[0], paramInt2);
    for (b2 = 0; b2 < paramInt1; b2++)
      paramArrayOfshort[b2] = (short)getModFreeze(j * arrayOfShort4[paramInt1 - 1 - b2], paramInt2); 
  }
  
  protected static void multiplicationInRQ(short[] paramArrayOfshort1, short[] paramArrayOfshort2, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    short[] arrayOfShort = new short[paramInt1 + paramInt1 - 1];
    int i;
    for (i = 0; i < paramInt1; i++) {
      short s = 0;
      for (byte b = 0; b <= i; b++)
        s = (short)getModFreeze(s + paramArrayOfshort2[b] * paramArrayOfbyte[i - b], paramInt2); 
      arrayOfShort[i] = s;
    } 
    for (i = paramInt1; i < paramInt1 + paramInt1 - 1; i++) {
      short s = 0;
      for (int j = i - paramInt1 + 1; j < paramInt1; j++)
        s = (short)getModFreeze(s + paramArrayOfshort2[j] * paramArrayOfbyte[i - j], paramInt2); 
      arrayOfShort[i] = s;
    } 
    for (i = paramInt1 + paramInt1 - 2; i >= paramInt1; i--) {
      arrayOfShort[i - paramInt1] = (short)getModFreeze(arrayOfShort[i - paramInt1] + arrayOfShort[i], paramInt2);
      arrayOfShort[i - paramInt1 + 1] = (short)getModFreeze(arrayOfShort[i - paramInt1 + 1] + arrayOfShort[i], paramInt2);
    } 
    for (i = 0; i < paramInt1; i++)
      paramArrayOfshort1[i] = arrayOfShort[i]; 
  }
  
  private static void encode(byte[] paramArrayOfbyte, short[] paramArrayOfshort1, short[] paramArrayOfshort2, int paramInt1, int paramInt2) {
    if (paramInt1 == 1) {
      short s1 = paramArrayOfshort1[0];
      short s2;
      for (s2 = paramArrayOfshort2[0]; s2 > 1; s2 = (short)(s2 + 255 >>> 8)) {
        paramArrayOfbyte[paramInt2++] = (byte)s1;
        s1 = (short)(s1 >>> 8);
      } 
    } 
    if (paramInt1 > 1) {
      short[] arrayOfShort1 = new short[(paramInt1 + 1) / 2];
      short[] arrayOfShort2 = new short[(paramInt1 + 1) / 2];
      byte b;
      for (b = 0; b < paramInt1 - 1; b += 2) {
        short s = paramArrayOfshort2[b];
        int i = paramArrayOfshort1[b] + paramArrayOfshort1[b + 1] * s;
        int j;
        for (j = paramArrayOfshort2[b + 1] * s; j >= 16384; j = j + 255 >>> 8) {
          paramArrayOfbyte[paramInt2++] = (byte)i;
          i >>>= 8;
        } 
        arrayOfShort1[b / 2] = (short)i;
        arrayOfShort2[b / 2] = (short)j;
      } 
      if (b < paramInt1) {
        arrayOfShort1[b / 2] = paramArrayOfshort1[b];
        arrayOfShort2[b / 2] = paramArrayOfshort2[b];
      } 
      encode(paramArrayOfbyte, arrayOfShort1, arrayOfShort2, (paramInt1 + 1) / 2, paramInt2);
    } 
  }
  
  protected static void getEncodedPolynomial(byte[] paramArrayOfbyte, short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    short[] arrayOfShort1 = new short[paramInt1];
    short[] arrayOfShort2 = new short[paramInt1];
    byte b;
    for (b = 0; b < paramInt1; b++)
      arrayOfShort1[b] = (short)(paramArrayOfshort[b] + (paramInt2 - 1) / 2); 
    for (b = 0; b < paramInt1; b++)
      arrayOfShort2[b] = (short)paramInt2; 
    encode(paramArrayOfbyte, arrayOfShort1, arrayOfShort2, paramInt1, 0);
  }
  
  protected static void getEncodedSmallPolynomial(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    byte b1 = 0;
    byte b2 = 0;
    for (byte b3 = 0; b3 < paramInt / 4; b3++) {
      byte b = (byte)(paramArrayOfbyte2[b1++] + 1);
      b = (byte)(b + ((byte)(paramArrayOfbyte2[b1++] + 1) << 2));
      b = (byte)(b + ((byte)(paramArrayOfbyte2[b1++] + 1) << 4));
      b = (byte)(b + ((byte)(paramArrayOfbyte2[b1++] + 1) << 6));
      paramArrayOfbyte1[b2++] = b;
    } 
    paramArrayOfbyte1[b2] = (byte)(paramArrayOfbyte2[b1] + 1);
  }
  
  private static void generateAES256CTRStream(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    CTRModeCipher cTRModeCipher = SICBlockCipher.newInstance((BlockCipher)AESEngine.newInstance());
    cTRModeCipher.init(true, (CipherParameters)new ParametersWithIV((CipherParameters)new KeyParameter(paramArrayOfbyte4), paramArrayOfbyte3));
    cTRModeCipher.processBytes(paramArrayOfbyte1, 0, paramArrayOfbyte2.length, paramArrayOfbyte2, 0);
  }
  
  protected static void expand(int[] paramArrayOfint, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte1 = new byte[paramArrayOfint.length * 4];
    byte[] arrayOfByte2 = new byte[paramArrayOfint.length * 4];
    byte[] arrayOfByte3 = new byte[16];
    generateAES256CTRStream(arrayOfByte1, arrayOfByte2, arrayOfByte3, paramArrayOfbyte);
    for (byte b = 0; b < paramArrayOfint.length; b++)
      paramArrayOfint[b] = bToUnsignedInt(arrayOfByte2[b * 4]) + (bToUnsignedInt(arrayOfByte2[b * 4 + 1]) << 8) + (bToUnsignedInt(arrayOfByte2[b * 4 + 2]) << 16) + (bToUnsignedInt(arrayOfByte2[b * 4 + 3]) << 24); 
  }
  
  private static int getUnsignedMod(int paramInt1, int paramInt2) {
    return getUnsignedDivMod(paramInt1, paramInt2)[1];
  }
  
  protected static void generatePolynomialInRQFromSeed(short[] paramArrayOfshort, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int[] arrayOfInt = new int[paramInt1];
    expand(arrayOfInt, paramArrayOfbyte);
    for (byte b = 0; b < paramInt1; b++)
      paramArrayOfshort[b] = (short)(getUnsignedMod(arrayOfInt[b], paramInt2) - (paramInt2 - 1) / 2); 
  }
  
  protected static void roundPolynomial(short[] paramArrayOfshort1, short[] paramArrayOfshort2) {
    for (byte b = 0; b < paramArrayOfshort1.length; b++)
      paramArrayOfshort1[b] = (short)(paramArrayOfshort2[b] - getModFreeze(paramArrayOfshort2[b], 3)); 
  }
  
  protected static void getRoundedEncodedPolynomial(byte[] paramArrayOfbyte, short[] paramArrayOfshort, int paramInt1, int paramInt2) {
    short[] arrayOfShort1 = new short[paramInt1];
    short[] arrayOfShort2 = new short[paramInt1];
    for (byte b = 0; b < paramInt1; b++) {
      arrayOfShort1[b] = (short)((paramArrayOfshort[b] + (paramInt2 - 1) / 2) * 10923 >>> 15);
      arrayOfShort2[b] = (short)((paramInt2 + 2) / 3);
    } 
    encode(paramArrayOfbyte, arrayOfShort1, arrayOfShort2, paramInt1, 0);
  }
  
  protected static byte[] getHashWithPrefix(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    byte[] arrayOfByte1 = new byte[64];
    byte[] arrayOfByte2 = new byte[paramArrayOfbyte1.length + paramArrayOfbyte2.length];
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte2, 0, paramArrayOfbyte1.length);
    System.arraycopy(paramArrayOfbyte2, 0, arrayOfByte2, paramArrayOfbyte1.length, paramArrayOfbyte2.length);
    SHA512Digest sHA512Digest = new SHA512Digest();
    sHA512Digest.update(arrayOfByte2, 0, arrayOfByte2.length);
    sHA512Digest.doFinal(arrayOfByte1, 0);
    return arrayOfByte1;
  }
  
  private static void decode(short[] paramArrayOfshort1, byte[] paramArrayOfbyte, short[] paramArrayOfshort2, int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 == 1)
      if (paramArrayOfshort2[0] == 1) {
        paramArrayOfshort1[paramInt2] = 0;
      } else if (paramArrayOfshort2[0] <= 256) {
        paramArrayOfshort1[paramInt2] = (short)getUnsignedMod(bToUnsignedInt(paramArrayOfbyte[paramInt3]), paramArrayOfshort2[0]);
      } else {
        paramArrayOfshort1[paramInt2] = (short)getUnsignedMod(bToUnsignedInt(paramArrayOfbyte[paramInt3]) + (paramArrayOfbyte[paramInt3 + 1] << 8), paramArrayOfshort2[0]);
      }  
    if (paramInt1 > 1) {
      short[] arrayOfShort1 = new short[(paramInt1 + 1) / 2];
      short[] arrayOfShort2 = new short[(paramInt1 + 1) / 2];
      short[] arrayOfShort3 = new short[paramInt1 / 2];
      int[] arrayOfInt = new int[paramInt1 / 2];
      byte b;
      for (b = 0; b < paramInt1 - 1; b += 2) {
        int i = paramArrayOfshort2[b] * paramArrayOfshort2[b + 1];
        if (i > 4194048) {
          arrayOfInt[b / 2] = 65536;
          arrayOfShort3[b / 2] = (short)(bToUnsignedInt(paramArrayOfbyte[paramInt3]) + 256 * bToUnsignedInt(paramArrayOfbyte[paramInt3 + 1]));
          paramInt3 += 2;
          arrayOfShort2[b / 2] = (short)((i + 255 >>> 8) + 255 >>> 8);
        } else if (i >= 16384) {
          arrayOfInt[b / 2] = 256;
          arrayOfShort3[b / 2] = (short)bToUnsignedInt(paramArrayOfbyte[paramInt3]);
          paramInt3++;
          arrayOfShort2[b / 2] = (short)(i + 255 >>> 8);
        } else {
          arrayOfInt[b / 2] = 1;
          arrayOfShort3[b / 2] = 0;
          arrayOfShort2[b / 2] = (short)i;
        } 
      } 
      if (b < paramInt1)
        arrayOfShort2[b / 2] = paramArrayOfshort2[b]; 
      decode(arrayOfShort1, paramArrayOfbyte, arrayOfShort2, (paramInt1 + 1) / 2, paramInt2, paramInt3);
      for (b = 0; b < paramInt1 - 1; b += 2) {
        int i = sToUnsignedInt(arrayOfShort3[b / 2]);
        i += arrayOfInt[b / 2] * sToUnsignedInt(arrayOfShort1[b / 2]);
        int[] arrayOfInt1 = getUnsignedDivMod(i, paramArrayOfshort2[b]);
        paramArrayOfshort1[paramInt2++] = (short)arrayOfInt1[1];
        paramArrayOfshort1[paramInt2++] = (short)getUnsignedMod(arrayOfInt1[0], paramArrayOfshort2[b + 1]);
      } 
      if (b < paramInt1)
        paramArrayOfshort1[paramInt2] = arrayOfShort1[b / 2]; 
    } 
  }
  
  protected static void getDecodedPolynomial(short[] paramArrayOfshort, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    short[] arrayOfShort1 = new short[paramInt1];
    short[] arrayOfShort2 = new short[paramInt1];
    byte b;
    for (b = 0; b < paramInt1; b++)
      arrayOfShort2[b] = (short)paramInt2; 
    decode(arrayOfShort1, paramArrayOfbyte, arrayOfShort2, paramInt1, 0, 0);
    for (b = 0; b < paramInt1; b++)
      paramArrayOfshort[b] = (short)(arrayOfShort1[b] - (paramInt2 - 1) / 2); 
  }
  
  protected static void getRandomInputs(SecureRandom paramSecureRandom, byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[paramArrayOfbyte.length / 8];
    paramSecureRandom.nextBytes(arrayOfByte);
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      paramArrayOfbyte[b] = (byte)(0x1 & arrayOfByte[b >>> 3] >>> (b & 0x7)); 
  }
  
  protected static void getEncodedInputs(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    for (byte b = 0; b < paramArrayOfbyte2.length; b++)
      paramArrayOfbyte1[b >>> 3] = (byte)(paramArrayOfbyte1[b >>> 3] | paramArrayOfbyte2[b] << (b & 0x7)); 
  }
  
  protected static void getRoundedDecodedPolynomial(short[] paramArrayOfshort, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    short[] arrayOfShort1 = new short[paramInt1];
    short[] arrayOfShort2 = new short[paramInt1];
    byte b;
    for (b = 0; b < paramInt1; b++)
      arrayOfShort2[b] = (short)((paramInt2 + 2) / 3); 
    decode(arrayOfShort1, paramArrayOfbyte, arrayOfShort2, paramInt1, 0, 0);
    for (b = 0; b < paramInt1; b++)
      paramArrayOfshort[b] = (short)(arrayOfShort1[b] * 3 - (paramInt2 - 1) / 2); 
  }
  
  protected static void top(byte[] paramArrayOfbyte1, short[] paramArrayOfshort, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < paramArrayOfbyte1.length; b++)
      paramArrayOfbyte1[b] = (byte)(paramInt3 * (getModFreeze(paramArrayOfshort[b] + paramArrayOfbyte2[b] * (paramInt1 - 1) / 2, paramInt1) + paramInt2) + 16384 >>> 15); 
  }
  
  protected static void getTopEncodedPolynomial(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    for (byte b = 0; b < paramArrayOfbyte1.length; b++)
      paramArrayOfbyte1[b] = (byte)(paramArrayOfbyte2[2 * b] + (paramArrayOfbyte2[2 * b + 1] << 4)); 
  }
  
  protected static void getDecodedSmallPolynomial(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    byte b1 = 0;
    byte b2 = 0;
    for (byte b3 = 0; b3 < paramInt / 4; b3++) {
      byte b4 = paramArrayOfbyte2[b2++];
      paramArrayOfbyte1[b1++] = (byte)((bToUnsignedInt(b4) & 0x3) - 1);
      b4 = (byte)(b4 >>> 2);
      paramArrayOfbyte1[b1++] = (byte)((bToUnsignedInt(b4) & 0x3) - 1);
      b4 = (byte)(b4 >>> 2);
      paramArrayOfbyte1[b1++] = (byte)((bToUnsignedInt(b4) & 0x3) - 1);
      b4 = (byte)(b4 >>> 2);
      paramArrayOfbyte1[b1++] = (byte)((bToUnsignedInt(b4) & 0x3) - 1);
    } 
    byte b = paramArrayOfbyte2[b2];
    paramArrayOfbyte1[b1] = (byte)((bToUnsignedInt(b) & 0x3) - 1);
  }
  
  protected static void scalarMultiplicationInRQ(short[] paramArrayOfshort1, short[] paramArrayOfshort2, int paramInt1, int paramInt2) {
    for (byte b = 0; b < paramArrayOfshort2.length; b++)
      paramArrayOfshort1[b] = (short)getModFreeze(paramInt1 * paramArrayOfshort2[b], paramInt2); 
  }
  
  protected static void transformRQToR3(byte[] paramArrayOfbyte, short[] paramArrayOfshort) {
    for (byte b = 0; b < paramArrayOfshort.length; b++)
      paramArrayOfbyte[b] = (byte)getModFreeze(paramArrayOfshort[b], 3); 
  }
  
  protected static void multiplicationInR3(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt + paramInt - 1];
    int i;
    for (i = 0; i < paramInt; i++) {
      byte b = 0;
      for (byte b1 = 0; b1 <= i; b1++)
        b = (byte)getModFreeze(b + paramArrayOfbyte2[b1] * paramArrayOfbyte3[i - b1], 3); 
      arrayOfByte[i] = b;
    } 
    for (i = paramInt; i < paramInt + paramInt - 1; i++) {
      byte b = 0;
      for (int j = i - paramInt + 1; j < paramInt; j++)
        b = (byte)getModFreeze(b + paramArrayOfbyte2[j] * paramArrayOfbyte3[i - j], 3); 
      arrayOfByte[i] = b;
    } 
    for (i = paramInt + paramInt - 2; i >= paramInt; i--) {
      arrayOfByte[i - paramInt] = (byte)getModFreeze(arrayOfByte[i - paramInt] + arrayOfByte[i], 3);
      arrayOfByte[i - paramInt + 1] = (byte)getModFreeze(arrayOfByte[i - paramInt + 1] + arrayOfByte[i], 3);
    } 
    for (i = 0; i < paramInt; i++)
      paramArrayOfbyte1[i] = arrayOfByte[i]; 
  }
  
  protected static void checkForSmallPolynomial(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    int i = 0;
    int j;
    for (j = 0; j != paramArrayOfbyte2.length; j++)
      i += paramArrayOfbyte2[j] & 0x1; 
    j = checkNotEqualToZero(i - paramInt2);
    int k;
    for (k = 0; k < paramInt2; k++)
      paramArrayOfbyte1[k] = (byte)((paramArrayOfbyte2[k] ^ 0x1) & (j ^ 0xFFFFFFFF) ^ 0x1); 
    for (k = paramInt2; k < paramInt1; k++)
      paramArrayOfbyte1[k] = (byte)(paramArrayOfbyte2[k] & (j ^ 0xFFFFFFFF)); 
  }
  
  protected static void updateDiffMask(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    for (byte b = 0; b < paramArrayOfbyte1.length; b++)
      paramArrayOfbyte1[b] = (byte)(paramArrayOfbyte1[b] ^ paramInt & (paramArrayOfbyte1[b] ^ paramArrayOfbyte2[b])); 
  }
  
  protected static void getTopDecodedPolynomial(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    for (byte b = 0; b < paramArrayOfbyte2.length; b++) {
      paramArrayOfbyte1[2 * b] = (byte)(paramArrayOfbyte2[b] & 0xF);
      paramArrayOfbyte1[2 * b + 1] = (byte)(paramArrayOfbyte2[b] >>> 4);
    } 
  }
  
  protected static void right(byte[] paramArrayOfbyte1, short[] paramArrayOfshort, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    for (byte b = 0; b < paramArrayOfbyte1.length; b++)
      paramArrayOfbyte1[b] = (byte)-checkLessThanZero(getModFreeze(getModFreeze(paramInt4 * paramArrayOfbyte2[b] - paramInt3, paramInt1) - paramArrayOfshort[b] + 4 * paramInt2 + 1, paramInt1)); 
  }
  
  private static int[] getUnsignedDivMod(int paramInt1, int paramInt2) {
    long l1 = iToUnsignedLong(paramInt1);
    long l2 = iToUnsignedLong(-2147483648);
    l2 /= paramInt2;
    long l3 = 0L;
    long l4 = l1 * l2 >>> 31L;
    l1 -= l4 * paramInt2;
    l3 += l4;
    l4 = l1 * l2 >>> 31L;
    l1 -= l4 * paramInt2;
    l3 += l4;
    l1 -= paramInt2;
    l3++;
    long l5 = -(l1 >>> 63L);
    l1 += l5 & paramInt2;
    l3 += l5;
    return new int[] { toIntExact(l3), toIntExact(l1) };
  }
  
  private static int[] getSignedDivMod(int paramInt1, int paramInt2) {
    int[] arrayOfInt1 = getUnsignedDivMod(toIntExact(-2147483648L + iToUnsignedLong(paramInt1)), paramInt2);
    int[] arrayOfInt2 = getUnsignedDivMod(-2147483648, paramInt2);
    int i = toIntExact(iToUnsignedLong(arrayOfInt1[0]) - iToUnsignedLong(arrayOfInt2[0]));
    int j = toIntExact(iToUnsignedLong(arrayOfInt1[1]) - iToUnsignedLong(arrayOfInt2[1]));
    int k = -(j >>> 31);
    j += k & paramInt2;
    i += k;
    return new int[] { i, j };
  }
  
  private static int checkLessThanZero(int paramInt) {
    return -(paramInt >>> 31);
  }
  
  private static int checkNotEqualToZero(int paramInt) {
    long l = iToUnsignedLong(paramInt);
    l = -l;
    return -((int)(l >>> 63L));
  }
  
  static int bToUnsignedInt(byte paramByte) {
    return paramByte & 0xFF;
  }
  
  static int sToUnsignedInt(short paramShort) {
    return paramShort & 0xFFFF;
  }
  
  static long iToUnsignedLong(int paramInt) {
    return paramInt & 0xFFFFFFFFL;
  }
  
  static int toIntExact(long paramLong) {
    int i = (int)paramLong;
    if (i != paramLong)
      throw new IllegalStateException("value out of integer range"); 
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\ntruprime\Utils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */