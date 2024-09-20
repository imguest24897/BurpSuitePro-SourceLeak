package org.bouncycastle.pqc.crypto.bike;

import java.security.SecureRandom;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

class BIKEEngine {
  private int r;
  
  private int w;
  
  private int hw;
  
  private int t;
  
  private int nbIter;
  
  private int tau;
  
  private final BIKERing bikeRing;
  
  private int L_BYTE;
  
  private int R_BYTE;
  
  private int R2_BYTE;
  
  public BIKEEngine(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.r = paramInt1;
    this.w = paramInt2;
    this.t = paramInt3;
    this.nbIter = paramInt5;
    this.tau = paramInt6;
    this.hw = this.w / 2;
    this.L_BYTE = paramInt4 / 8;
    this.R_BYTE = paramInt1 + 7 >>> 3;
    this.R2_BYTE = 2 * paramInt1 + 7 >>> 3;
    this.bikeRing = new BIKERing(paramInt1);
  }
  
  public int getSessionKeySize() {
    return this.L_BYTE;
  }
  
  private byte[] functionH(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[2 * this.R_BYTE];
    SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
    sHAKEDigest.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    BIKEUtils.generateRandomByteArray(arrayOfByte, 2 * this.r, this.t, (Xof)sHAKEDigest);
    return arrayOfByte;
  }
  
  private void functionL(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    byte[] arrayOfByte = new byte[48];
    SHA3Digest sHA3Digest = new SHA3Digest(384);
    sHA3Digest.update(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    sHA3Digest.update(paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
    sHA3Digest.doFinal(arrayOfByte, 0);
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte3, 0, this.L_BYTE);
  }
  
  private void functionK(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    byte[] arrayOfByte = new byte[48];
    SHA3Digest sHA3Digest = new SHA3Digest(384);
    sHA3Digest.update(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    sHA3Digest.update(paramArrayOfbyte2, 0, paramArrayOfbyte2.length);
    sHA3Digest.update(paramArrayOfbyte3, 0, paramArrayOfbyte3.length);
    sHA3Digest.doFinal(arrayOfByte, 0);
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte4, 0, this.L_BYTE);
  }
  
  public void genKeyPair(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, SecureRandom paramSecureRandom) {
    byte[] arrayOfByte = new byte[64];
    paramSecureRandom.nextBytes(arrayOfByte);
    SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
    sHAKEDigest.update(arrayOfByte, 0, this.L_BYTE);
    BIKEUtils.generateRandomByteArray(paramArrayOfbyte1, this.r, this.hw, (Xof)sHAKEDigest);
    BIKEUtils.generateRandomByteArray(paramArrayOfbyte2, this.r, this.hw, (Xof)sHAKEDigest);
    long[] arrayOfLong1 = this.bikeRing.create();
    long[] arrayOfLong2 = this.bikeRing.create();
    this.bikeRing.decodeBytes(paramArrayOfbyte1, arrayOfLong1);
    this.bikeRing.decodeBytes(paramArrayOfbyte2, arrayOfLong2);
    long[] arrayOfLong3 = this.bikeRing.create();
    this.bikeRing.inv(arrayOfLong1, arrayOfLong3);
    this.bikeRing.multiply(arrayOfLong3, arrayOfLong2, arrayOfLong3);
    this.bikeRing.encodeBytes(arrayOfLong3, paramArrayOfbyte4);
    System.arraycopy(arrayOfByte, this.L_BYTE, paramArrayOfbyte3, 0, paramArrayOfbyte3.length);
  }
  
  public void encaps(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, SecureRandom paramSecureRandom) {
    byte[] arrayOfByte1 = new byte[this.L_BYTE];
    paramSecureRandom.nextBytes(arrayOfByte1);
    byte[] arrayOfByte2 = functionH(arrayOfByte1);
    byte[] arrayOfByte3 = new byte[this.R_BYTE];
    byte[] arrayOfByte4 = new byte[this.R_BYTE];
    splitEBytes(arrayOfByte2, arrayOfByte3, arrayOfByte4);
    long[] arrayOfLong1 = this.bikeRing.create();
    long[] arrayOfLong2 = this.bikeRing.create();
    this.bikeRing.decodeBytes(arrayOfByte3, arrayOfLong1);
    this.bikeRing.decodeBytes(arrayOfByte4, arrayOfLong2);
    long[] arrayOfLong3 = this.bikeRing.create();
    this.bikeRing.decodeBytes(paramArrayOfbyte4, arrayOfLong3);
    this.bikeRing.multiply(arrayOfLong3, arrayOfLong2, arrayOfLong3);
    this.bikeRing.add(arrayOfLong3, arrayOfLong1, arrayOfLong3);
    this.bikeRing.encodeBytes(arrayOfLong3, paramArrayOfbyte1);
    functionL(arrayOfByte3, arrayOfByte4, paramArrayOfbyte2);
    Bytes.xorTo(this.L_BYTE, arrayOfByte1, paramArrayOfbyte2);
    functionK(arrayOfByte1, paramArrayOfbyte1, paramArrayOfbyte2, paramArrayOfbyte3);
  }
  
  public void decaps(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5, byte[] paramArrayOfbyte6) {
    int[] arrayOfInt1 = new int[this.hw];
    int[] arrayOfInt2 = new int[this.hw];
    convertToCompact(arrayOfInt1, paramArrayOfbyte2);
    convertToCompact(arrayOfInt2, paramArrayOfbyte3);
    byte[] arrayOfByte1 = computeSyndrome(paramArrayOfbyte5, paramArrayOfbyte2);
    byte[] arrayOfByte2 = BGFDecoder(arrayOfByte1, arrayOfInt1, arrayOfInt2);
    byte[] arrayOfByte3 = new byte[2 * this.R_BYTE];
    BIKEUtils.fromBitArrayToByteArray(arrayOfByte3, arrayOfByte2, 0, 2 * this.r);
    byte[] arrayOfByte4 = new byte[this.R_BYTE];
    byte[] arrayOfByte5 = new byte[this.R_BYTE];
    splitEBytes(arrayOfByte3, arrayOfByte4, arrayOfByte5);
    byte[] arrayOfByte6 = new byte[this.L_BYTE];
    functionL(arrayOfByte4, arrayOfByte5, arrayOfByte6);
    Bytes.xorTo(this.L_BYTE, paramArrayOfbyte6, arrayOfByte6);
    byte[] arrayOfByte7 = functionH(arrayOfByte6);
    if (Arrays.areEqual(arrayOfByte3, 0, this.R2_BYTE, arrayOfByte7, 0, this.R2_BYTE)) {
      functionK(arrayOfByte6, paramArrayOfbyte5, paramArrayOfbyte6, paramArrayOfbyte1);
    } else {
      functionK(paramArrayOfbyte4, paramArrayOfbyte5, paramArrayOfbyte6, paramArrayOfbyte1);
    } 
  }
  
  private byte[] computeSyndrome(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    long[] arrayOfLong1 = this.bikeRing.create();
    long[] arrayOfLong2 = this.bikeRing.create();
    this.bikeRing.decodeBytes(paramArrayOfbyte1, arrayOfLong1);
    this.bikeRing.decodeBytes(paramArrayOfbyte2, arrayOfLong2);
    this.bikeRing.multiply(arrayOfLong1, arrayOfLong2, arrayOfLong1);
    return this.bikeRing.encodeBitsTransposed(arrayOfLong1);
  }
  
  private byte[] BGFDecoder(byte[] paramArrayOfbyte, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    byte[] arrayOfByte1 = new byte[2 * this.r];
    int[] arrayOfInt1 = getColumnFromCompactVersion(paramArrayOfint1);
    int[] arrayOfInt2 = getColumnFromCompactVersion(paramArrayOfint2);
    byte[] arrayOfByte2 = new byte[2 * this.r];
    byte[] arrayOfByte3 = new byte[this.r];
    byte[] arrayOfByte4 = new byte[2 * this.r];
    int i = threshold(BIKEUtils.getHammingWeight(paramArrayOfbyte), this.r);
    BFIter(paramArrayOfbyte, arrayOfByte1, i, paramArrayOfint1, paramArrayOfint2, arrayOfInt1, arrayOfInt2, arrayOfByte2, arrayOfByte4, arrayOfByte3);
    BFMaskedIter(paramArrayOfbyte, arrayOfByte1, arrayOfByte2, (this.hw + 1) / 2 + 1, paramArrayOfint1, paramArrayOfint2, arrayOfInt1, arrayOfInt2);
    BFMaskedIter(paramArrayOfbyte, arrayOfByte1, arrayOfByte4, (this.hw + 1) / 2 + 1, paramArrayOfint1, paramArrayOfint2, arrayOfInt1, arrayOfInt2);
    for (byte b = 1; b < this.nbIter; b++) {
      Arrays.fill(arrayOfByte2, (byte)0);
      i = threshold(BIKEUtils.getHammingWeight(paramArrayOfbyte), this.r);
      BFIter2(paramArrayOfbyte, arrayOfByte1, i, paramArrayOfint1, paramArrayOfint2, arrayOfInt1, arrayOfInt2, arrayOfByte3);
    } 
    return (BIKEUtils.getHammingWeight(paramArrayOfbyte) == 0) ? arrayOfByte1 : null;
  }
  
  private void BFIter(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int[] paramArrayOfint4, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4, byte[] paramArrayOfbyte5) {
    ctrAll(paramArrayOfint3, paramArrayOfbyte1, paramArrayOfbyte5);
    int i = paramArrayOfbyte5[0] & 0xFF;
    int j = (i - paramInt >> 31) + 1;
    int k = (i - paramInt - this.tau >> 31) + 1;
    paramArrayOfbyte2[0] = (byte)(paramArrayOfbyte2[0] ^ (byte)j);
    paramArrayOfbyte3[0] = (byte)j;
    paramArrayOfbyte4[0] = (byte)k;
    for (i = 1; i < this.r; i++) {
      j = paramArrayOfbyte5[i] & 0xFF;
      k = (j - paramInt >> 31) + 1;
      int m = (j - paramInt - this.tau >> 31) + 1;
      paramArrayOfbyte2[this.r - i] = (byte)(paramArrayOfbyte2[this.r - i] ^ (byte)k);
      paramArrayOfbyte3[i] = (byte)k;
      paramArrayOfbyte4[i] = (byte)m;
    } 
    ctrAll(paramArrayOfint4, paramArrayOfbyte1, paramArrayOfbyte5);
    i = paramArrayOfbyte5[0] & 0xFF;
    j = (i - paramInt >> 31) + 1;
    k = (i - paramInt - this.tau >> 31) + 1;
    paramArrayOfbyte2[this.r] = (byte)(paramArrayOfbyte2[this.r] ^ (byte)j);
    paramArrayOfbyte3[this.r] = (byte)j;
    paramArrayOfbyte4[this.r] = (byte)k;
    for (i = 1; i < this.r; i++) {
      j = paramArrayOfbyte5[i] & 0xFF;
      k = (j - paramInt >> 31) + 1;
      int m = (j - paramInt - this.tau >> 31) + 1;
      paramArrayOfbyte2[this.r + this.r - i] = (byte)(paramArrayOfbyte2[this.r + this.r - i] ^ (byte)k);
      paramArrayOfbyte3[this.r + i] = (byte)k;
      paramArrayOfbyte4[this.r + i] = (byte)m;
    } 
    for (i = 0; i < 2 * this.r; i++)
      recomputeSyndrome(paramArrayOfbyte1, i, paramArrayOfint1, paramArrayOfint2, (paramArrayOfbyte3[i] != 0)); 
  }
  
  private void BFIter2(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int[] paramArrayOfint4, byte[] paramArrayOfbyte3) {
    int[] arrayOfInt = new int[2 * this.r];
    ctrAll(paramArrayOfint3, paramArrayOfbyte1, paramArrayOfbyte3);
    int i = paramArrayOfbyte3[0] & 0xFF;
    int j = (i - paramInt >> 31) + 1;
    paramArrayOfbyte2[0] = (byte)(paramArrayOfbyte2[0] ^ (byte)j);
    arrayOfInt[0] = j;
    for (i = 1; i < this.r; i++) {
      j = paramArrayOfbyte3[i] & 0xFF;
      int k = (j - paramInt >> 31) + 1;
      paramArrayOfbyte2[this.r - i] = (byte)(paramArrayOfbyte2[this.r - i] ^ (byte)k);
      arrayOfInt[i] = k;
    } 
    ctrAll(paramArrayOfint4, paramArrayOfbyte1, paramArrayOfbyte3);
    i = paramArrayOfbyte3[0] & 0xFF;
    j = (i - paramInt >> 31) + 1;
    paramArrayOfbyte2[this.r] = (byte)(paramArrayOfbyte2[this.r] ^ (byte)j);
    arrayOfInt[this.r] = j;
    for (i = 1; i < this.r; i++) {
      j = paramArrayOfbyte3[i] & 0xFF;
      int k = (j - paramInt >> 31) + 1;
      paramArrayOfbyte2[this.r + this.r - i] = (byte)(paramArrayOfbyte2[this.r + this.r - i] ^ (byte)k);
      arrayOfInt[this.r + i] = k;
    } 
    for (i = 0; i < 2 * this.r; i++)
      recomputeSyndrome(paramArrayOfbyte1, i, paramArrayOfint1, paramArrayOfint2, (arrayOfInt[i] == 1)); 
  }
  
  private void BFMaskedIter(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int[] paramArrayOfint4) {
    int[] arrayOfInt = new int[2 * this.r];
    byte b;
    for (b = 0; b < this.r; b++) {
      if (paramArrayOfbyte3[b] == 1) {
        boolean bool = (ctr(paramArrayOfint3, paramArrayOfbyte1, b) >= paramInt) ? true : false;
        updateNewErrorIndex(paramArrayOfbyte2, b, bool);
        arrayOfInt[b] = bool ? 1 : 0;
      } 
    } 
    for (b = 0; b < this.r; b++) {
      if (paramArrayOfbyte3[this.r + b] == 1) {
        boolean bool = (ctr(paramArrayOfint4, paramArrayOfbyte1, b) >= paramInt) ? true : false;
        updateNewErrorIndex(paramArrayOfbyte2, this.r + b, bool);
        arrayOfInt[this.r + b] = bool ? 1 : 0;
      } 
    } 
    for (b = 0; b < 2 * this.r; b++)
      recomputeSyndrome(paramArrayOfbyte1, b, paramArrayOfint1, paramArrayOfint2, (arrayOfInt[b] == 1)); 
  }
  
  private int threshold(int paramInt1, int paramInt2) {
    switch (paramInt2) {
      case 12323:
        return thresholdFromParameters(paramInt1, 0.0069722D, 13.53D, 36);
      case 24659:
        return thresholdFromParameters(paramInt1, 0.005265D, 15.2588D, 52);
      case 40973:
        return thresholdFromParameters(paramInt1, 0.00402312D, 17.8785D, 69);
    } 
    throw new IllegalArgumentException();
  }
  
  private static int thresholdFromParameters(int paramInt1, double paramDouble1, double paramDouble2, int paramInt2) {
    return Math.max(paramInt2, (int)Math.floor(paramDouble1 * paramInt1 + paramDouble2));
  }
  
  private int ctr(int[] paramArrayOfint, byte[] paramArrayOfbyte, int paramInt) {
    int i = 0;
    byte b = 0;
    int j = this.hw - 4;
    while (b <= j) {
      int k = paramArrayOfint[b + 0] + paramInt - this.r;
      int m = paramArrayOfint[b + 1] + paramInt - this.r;
      int n = paramArrayOfint[b + 2] + paramInt - this.r;
      int i1 = paramArrayOfint[b + 3] + paramInt - this.r;
      k += k >> 31 & this.r;
      m += m >> 31 & this.r;
      n += n >> 31 & this.r;
      i1 += i1 >> 31 & this.r;
      i += paramArrayOfbyte[k] & 0xFF;
      i += paramArrayOfbyte[m] & 0xFF;
      i += paramArrayOfbyte[n] & 0xFF;
      i += paramArrayOfbyte[i1] & 0xFF;
      b += 4;
    } 
    while (b < this.hw) {
      int k = paramArrayOfint[b] + paramInt - this.r;
      k += k >> 31 & this.r;
      i += paramArrayOfbyte[k] & 0xFF;
      b++;
    } 
    return i;
  }
  
  private void ctrAll(int[] paramArrayOfint, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    int i = paramArrayOfint[0];
    int j = this.r - i;
    System.arraycopy(paramArrayOfbyte1, i, paramArrayOfbyte2, 0, j);
    System.arraycopy(paramArrayOfbyte1, 0, paramArrayOfbyte2, j, i);
    for (i = 1; i < this.hw; i++) {
      j = paramArrayOfint[i];
      int k = this.r - j;
      byte b = 0;
      int m = k - 4;
      while (b <= m) {
        paramArrayOfbyte2[b + 0] = (byte)(paramArrayOfbyte2[b + 0] + (paramArrayOfbyte1[j + b + 0] & 0xFF));
        paramArrayOfbyte2[b + 1] = (byte)(paramArrayOfbyte2[b + 1] + (paramArrayOfbyte1[j + b + 1] & 0xFF));
        paramArrayOfbyte2[b + 2] = (byte)(paramArrayOfbyte2[b + 2] + (paramArrayOfbyte1[j + b + 2] & 0xFF));
        paramArrayOfbyte2[b + 3] = (byte)(paramArrayOfbyte2[b + 3] + (paramArrayOfbyte1[j + b + 3] & 0xFF));
        b += 4;
      } 
      while (b < k) {
        paramArrayOfbyte2[b] = (byte)(paramArrayOfbyte2[b] + (paramArrayOfbyte1[j + b] & 0xFF));
        b++;
      } 
      m = k;
      int n = this.r - 4;
      while (m <= n) {
        paramArrayOfbyte2[m + 0] = (byte)(paramArrayOfbyte2[m + 0] + (paramArrayOfbyte1[m + 0 - k] & 0xFF));
        paramArrayOfbyte2[m + 1] = (byte)(paramArrayOfbyte2[m + 1] + (paramArrayOfbyte1[m + 1 - k] & 0xFF));
        paramArrayOfbyte2[m + 2] = (byte)(paramArrayOfbyte2[m + 2] + (paramArrayOfbyte1[m + 2 - k] & 0xFF));
        paramArrayOfbyte2[m + 3] = (byte)(paramArrayOfbyte2[m + 3] + (paramArrayOfbyte1[m + 3 - k] & 0xFF));
        m += 4;
      } 
      while (m < this.r) {
        paramArrayOfbyte2[m] = (byte)(paramArrayOfbyte2[m] + (paramArrayOfbyte1[m - k] & 0xFF));
        m++;
      } 
    } 
  }
  
  private void convertToCompact(int[] paramArrayOfint, byte[] paramArrayOfbyte) {
    int i = 0;
    for (byte b = 0; b < this.R_BYTE; b++) {
      for (byte b1 = 0; b1 < 8 && b * 8 + b1 != this.r; b1++) {
        int j = paramArrayOfbyte[b] >> b1 & 0x1;
        paramArrayOfint[i] = b * 8 + b1 & -j | paramArrayOfint[i] & (-j ^ 0xFFFFFFFF);
        i = (i + j) % this.hw;
      } 
    } 
  }
  
  private int[] getColumnFromCompactVersion(int[] paramArrayOfint) {
    int[] arrayOfInt = new int[this.hw];
    if (paramArrayOfint[0] == 0) {
      arrayOfInt[0] = 0;
      for (byte b = 1; b < this.hw; b++)
        arrayOfInt[b] = this.r - paramArrayOfint[this.hw - b]; 
    } else {
      for (byte b = 0; b < this.hw; b++)
        arrayOfInt[b] = this.r - paramArrayOfint[this.hw - 1 - b]; 
    } 
    return arrayOfInt;
  }
  
  private void recomputeSyndrome(byte[] paramArrayOfbyte, int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2, boolean paramBoolean) {
    boolean bool = paramBoolean ? true : false;
    if (paramInt < this.r) {
      for (byte b = 0; b < this.hw; b++) {
        if (paramArrayOfint1[b] <= paramInt) {
          paramArrayOfbyte[paramInt - paramArrayOfint1[b]] = (byte)(paramArrayOfbyte[paramInt - paramArrayOfint1[b]] ^ bool);
        } else {
          paramArrayOfbyte[this.r + paramInt - paramArrayOfint1[b]] = (byte)(paramArrayOfbyte[this.r + paramInt - paramArrayOfint1[b]] ^ bool);
        } 
      } 
    } else {
      for (byte b = 0; b < this.hw; b++) {
        if (paramArrayOfint2[b] <= paramInt - this.r) {
          paramArrayOfbyte[paramInt - this.r - paramArrayOfint2[b]] = (byte)(paramArrayOfbyte[paramInt - this.r - paramArrayOfint2[b]] ^ bool);
        } else {
          paramArrayOfbyte[this.r - paramArrayOfint2[b] + paramInt - this.r] = (byte)(paramArrayOfbyte[this.r - paramArrayOfint2[b] + paramInt - this.r] ^ bool);
        } 
      } 
    } 
  }
  
  private void splitEBytes(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3) {
    int i = this.r & 0x7;
    System.arraycopy(paramArrayOfbyte1, 0, paramArrayOfbyte2, 0, this.R_BYTE - 1);
    byte b1 = paramArrayOfbyte1[this.R_BYTE - 1];
    byte b2 = (byte)(-1 << i);
    paramArrayOfbyte2[this.R_BYTE - 1] = (byte)(b1 & (b2 ^ 0xFFFFFFFF));
    byte b3 = (byte)(b1 & b2);
    for (byte b = 0; b < this.R_BYTE; b++) {
      byte b4 = paramArrayOfbyte1[this.R_BYTE + b];
      paramArrayOfbyte3[b] = (byte)(b4 << 8 - i | (b3 & 0xFF) >>> i);
      b3 = b4;
    } 
  }
  
  private void updateNewErrorIndex(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    int i = paramInt;
    if (paramInt != 0 && paramInt != this.r)
      if (paramInt > this.r) {
        i = 2 * this.r - paramInt + this.r;
      } else {
        i = this.r - paramInt;
      }  
    paramArrayOfbyte[i] = (byte)(paramArrayOfbyte[i] ^ (paramBoolean ? 1 : 0));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\bike\BIKEEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */