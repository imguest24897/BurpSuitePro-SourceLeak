package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class SM3Digest extends GeneralDigest {
  private static final int DIGEST_LENGTH = 32;
  
  private static final int BLOCK_SIZE = 16;
  
  private int[] V = new int[8];
  
  private int[] inwords = new int[16];
  
  private int xOff;
  
  private int[] W = new int[68];
  
  private static final int[] T = new int[64];
  
  public SM3Digest() {
    this(CryptoServicePurpose.ANY);
  }
  
  public SM3Digest(CryptoServicePurpose paramCryptoServicePurpose) {
    super(paramCryptoServicePurpose);
    CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    reset();
  }
  
  public SM3Digest(SM3Digest paramSM3Digest) {
    super(paramSM3Digest);
    CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    copyIn(paramSM3Digest);
  }
  
  private void copyIn(SM3Digest paramSM3Digest) {
    System.arraycopy(paramSM3Digest.V, 0, this.V, 0, this.V.length);
    System.arraycopy(paramSM3Digest.inwords, 0, this.inwords, 0, this.inwords.length);
    this.xOff = paramSM3Digest.xOff;
  }
  
  public String getAlgorithmName() {
    return "SM3";
  }
  
  public int getDigestSize() {
    return 32;
  }
  
  public Memoable copy() {
    return new SM3Digest(this);
  }
  
  public void reset(Memoable paramMemoable) {
    SM3Digest sM3Digest = (SM3Digest)paramMemoable;
    copyIn(sM3Digest);
    copyIn(sM3Digest);
  }
  
  public void reset() {
    super.reset();
    this.V[0] = 1937774191;
    this.V[1] = 1226093241;
    this.V[2] = 388252375;
    this.V[3] = -628488704;
    this.V[4] = -1452330820;
    this.V[5] = 372324522;
    this.V[6] = -477237683;
    this.V[7] = -1325724082;
    this.xOff = 0;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    finish();
    Pack.intToBigEndian(this.V, paramArrayOfbyte, paramInt);
    reset();
    return 32;
  }
  
  protected void processWord(byte[] paramArrayOfbyte, int paramInt) {
    this.inwords[this.xOff++] = Pack.bigEndianToInt(paramArrayOfbyte, paramInt);
    if (this.xOff >= 16)
      processBlock(); 
  }
  
  protected void processLength(long paramLong) {
    if (this.xOff > 14) {
      this.inwords[this.xOff] = 0;
      this.xOff++;
      processBlock();
    } 
    while (this.xOff < 14) {
      this.inwords[this.xOff] = 0;
      this.xOff++;
    } 
    this.inwords[this.xOff++] = (int)(paramLong >>> 32L);
    this.inwords[this.xOff++] = (int)paramLong;
  }
  
  private int P0(int paramInt) {
    int i = paramInt << 9 | paramInt >>> 23;
    int j = paramInt << 17 | paramInt >>> 15;
    return paramInt ^ i ^ j;
  }
  
  private int P1(int paramInt) {
    int i = paramInt << 15 | paramInt >>> 17;
    int j = paramInt << 23 | paramInt >>> 9;
    return paramInt ^ i ^ j;
  }
  
  private int FF0(int paramInt1, int paramInt2, int paramInt3) {
    return paramInt1 ^ paramInt2 ^ paramInt3;
  }
  
  private int FF1(int paramInt1, int paramInt2, int paramInt3) {
    return paramInt1 & paramInt2 | paramInt1 & paramInt3 | paramInt2 & paramInt3;
  }
  
  private int GG0(int paramInt1, int paramInt2, int paramInt3) {
    return paramInt1 ^ paramInt2 ^ paramInt3;
  }
  
  private int GG1(int paramInt1, int paramInt2, int paramInt3) {
    return paramInt1 & paramInt2 | (paramInt1 ^ 0xFFFFFFFF) & paramInt3;
  }
  
  protected void processBlock() {
    int i;
    for (i = 0; i < 16; i++)
      this.W[i] = this.inwords[i]; 
    for (i = 16; i < 68; i++) {
      int i4 = this.W[i - 3];
      int i5 = i4 << 15 | i4 >>> 17;
      int i6 = this.W[i - 13];
      int i7 = i6 << 7 | i6 >>> 25;
      this.W[i] = P1(this.W[i - 16] ^ this.W[i - 9] ^ i5) ^ i7 ^ this.W[i - 6];
    } 
    i = this.V[0];
    int j = this.V[1];
    int k = this.V[2];
    int m = this.V[3];
    int n = this.V[4];
    int i1 = this.V[5];
    int i2 = this.V[6];
    int i3 = this.V[7];
    byte b;
    for (b = 0; b < 16; b++) {
      int i4 = i << 12 | i >>> 20;
      int i5 = i4 + n + T[b];
      int i6 = i5 << 7 | i5 >>> 25;
      int i7 = i6 ^ i4;
      int i8 = this.W[b];
      int i9 = i8 ^ this.W[b + 4];
      int i10 = FF0(i, j, k) + m + i7 + i9;
      int i11 = GG0(n, i1, i2) + i3 + i6 + i8;
      m = k;
      k = j << 9 | j >>> 23;
      j = i;
      i = i10;
      i3 = i2;
      i2 = i1 << 19 | i1 >>> 13;
      i1 = n;
      n = P0(i11);
    } 
    for (b = 16; b < 64; b++) {
      int i4 = i << 12 | i >>> 20;
      int i5 = i4 + n + T[b];
      int i6 = i5 << 7 | i5 >>> 25;
      int i7 = i6 ^ i4;
      int i8 = this.W[b];
      int i9 = i8 ^ this.W[b + 4];
      int i10 = FF1(i, j, k) + m + i7 + i9;
      int i11 = GG1(n, i1, i2) + i3 + i6 + i8;
      m = k;
      k = j << 9 | j >>> 23;
      j = i;
      i = i10;
      i3 = i2;
      i2 = i1 << 19 | i1 >>> 13;
      i1 = n;
      n = P0(i11);
    } 
    this.V[0] = this.V[0] ^ i;
    this.V[1] = this.V[1] ^ j;
    this.V[2] = this.V[2] ^ k;
    this.V[3] = this.V[3] ^ m;
    this.V[4] = this.V[4] ^ n;
    this.V[5] = this.V[5] ^ i1;
    this.V[6] = this.V[6] ^ i2;
    this.V[7] = this.V[7] ^ i3;
    this.xOff = 0;
  }
  
  protected CryptoServiceProperties cryptoServiceProperties() {
    return Utils.getDefaultProperties((Digest)this, 256, this.purpose);
  }
  
  static {
    byte b;
    for (b = 0; b < 16; b++) {
      int i = 2043430169;
      T[b] = i << b | i >>> 32 - b;
    } 
    for (b = 16; b < 64; b++) {
      int i = b % 32;
      int j = 2055708042;
      T[b] = j << i | j >>> 32 - i;
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\SM3Digest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */