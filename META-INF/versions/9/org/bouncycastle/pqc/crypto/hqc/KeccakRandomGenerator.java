package META-INF.versions.9.org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

class KeccakRandomGenerator {
  private static long[] KeccakRoundConstants = new long[] { 
      1L, 32898L, -9223372036854742902L, -9223372034707259392L, 32907L, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138L, 136L, 
      2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778L, -9223372034707292150L, 
      -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L };
  
  protected long[] state = new long[26];
  
  protected byte[] dataQueue = new byte[192];
  
  protected int rate;
  
  protected int bitsInQueue;
  
  protected int fixedOutputLength;
  
  public KeccakRandomGenerator() {
    this(288);
  }
  
  public KeccakRandomGenerator(int paramInt) {
    init(paramInt);
  }
  
  private void init(int paramInt) {
    switch (paramInt) {
      case 128:
      case 224:
      case 256:
      case 288:
      case 384:
      case 512:
        initSponge(1600 - (paramInt << 1));
        return;
    } 
    throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
  }
  
  private void initSponge(int paramInt) {
    if (paramInt <= 0 || paramInt >= 1600 || paramInt % 64 != 0)
      throw new IllegalStateException("invalid rate value"); 
    this.rate = paramInt;
    Arrays.fill(this.state, 0L);
    Arrays.fill(this.dataQueue, (byte)0);
    this.bitsInQueue = 0;
    this.fixedOutputLength = (1600 - paramInt) / 2;
  }
  
  private static void keccakPermutation(long[] paramArrayOflong) {
    long l1 = paramArrayOflong[0];
    long l2 = paramArrayOflong[1];
    long l3 = paramArrayOflong[2];
    long l4 = paramArrayOflong[3];
    long l5 = paramArrayOflong[4];
    long l6 = paramArrayOflong[5];
    long l7 = paramArrayOflong[6];
    long l8 = paramArrayOflong[7];
    long l9 = paramArrayOflong[8];
    long l10 = paramArrayOflong[9];
    long l11 = paramArrayOflong[10];
    long l12 = paramArrayOflong[11];
    long l13 = paramArrayOflong[12];
    long l14 = paramArrayOflong[13];
    long l15 = paramArrayOflong[14];
    long l16 = paramArrayOflong[15];
    long l17 = paramArrayOflong[16];
    long l18 = paramArrayOflong[17];
    long l19 = paramArrayOflong[18];
    long l20 = paramArrayOflong[19];
    long l21 = paramArrayOflong[20];
    long l22 = paramArrayOflong[21];
    long l23 = paramArrayOflong[22];
    long l24 = paramArrayOflong[23];
    long l25 = paramArrayOflong[24];
    for (byte b = 0; b < 24; b++) {
      long l26 = l1 ^ l6 ^ l11 ^ l16 ^ l21;
      long l27 = l2 ^ l7 ^ l12 ^ l17 ^ l22;
      long l28 = l3 ^ l8 ^ l13 ^ l18 ^ l23;
      long l29 = l4 ^ l9 ^ l14 ^ l19 ^ l24;
      long l30 = l5 ^ l10 ^ l15 ^ l20 ^ l25;
      long l31 = (l27 << 1L | l27 >>> -1L) ^ l30;
      long l32 = (l28 << 1L | l28 >>> -1L) ^ l26;
      long l33 = (l29 << 1L | l29 >>> -1L) ^ l27;
      long l34 = (l30 << 1L | l30 >>> -1L) ^ l28;
      long l35 = (l26 << 1L | l26 >>> -1L) ^ l29;
      l1 ^= l31;
      l6 ^= l31;
      l11 ^= l31;
      l16 ^= l31;
      l21 ^= l31;
      l2 ^= l32;
      l7 ^= l32;
      l12 ^= l32;
      l17 ^= l32;
      l22 ^= l32;
      l3 ^= l33;
      l8 ^= l33;
      l13 ^= l33;
      l18 ^= l33;
      l23 ^= l33;
      l4 ^= l34;
      l9 ^= l34;
      l14 ^= l34;
      l19 ^= l34;
      l24 ^= l34;
      l5 ^= l35;
      l10 ^= l35;
      l15 ^= l35;
      l20 ^= l35;
      l25 ^= l35;
      l27 = l2 << 1L | l2 >>> 63L;
      l2 = l7 << 44L | l7 >>> 20L;
      l7 = l10 << 20L | l10 >>> 44L;
      l10 = l23 << 61L | l23 >>> 3L;
      l23 = l15 << 39L | l15 >>> 25L;
      l15 = l21 << 18L | l21 >>> 46L;
      l21 = l3 << 62L | l3 >>> 2L;
      l3 = l13 << 43L | l13 >>> 21L;
      l13 = l14 << 25L | l14 >>> 39L;
      l14 = l20 << 8L | l20 >>> 56L;
      l20 = l24 << 56L | l24 >>> 8L;
      l24 = l16 << 41L | l16 >>> 23L;
      l16 = l5 << 27L | l5 >>> 37L;
      l5 = l25 << 14L | l25 >>> 50L;
      l25 = l22 << 2L | l22 >>> 62L;
      l22 = l9 << 55L | l9 >>> 9L;
      l9 = l17 << 45L | l17 >>> 19L;
      l17 = l6 << 36L | l6 >>> 28L;
      l6 = l4 << 28L | l4 >>> 36L;
      l4 = l19 << 21L | l19 >>> 43L;
      l19 = l18 << 15L | l18 >>> 49L;
      l18 = l12 << 10L | l12 >>> 54L;
      l12 = l8 << 6L | l8 >>> 58L;
      l8 = l11 << 3L | l11 >>> 61L;
      l11 = l27;
      l26 = l1 ^ (l2 ^ 0xFFFFFFFFFFFFFFFFL) & l3;
      l27 = l2 ^ (l3 ^ 0xFFFFFFFFFFFFFFFFL) & l4;
      l3 ^= (l4 ^ 0xFFFFFFFFFFFFFFFFL) & l5;
      l4 ^= (l5 ^ 0xFFFFFFFFFFFFFFFFL) & l1;
      l5 ^= (l1 ^ 0xFFFFFFFFFFFFFFFFL) & l2;
      l1 = l26;
      l2 = l27;
      l26 = l6 ^ (l7 ^ 0xFFFFFFFFFFFFFFFFL) & l8;
      l27 = l7 ^ (l8 ^ 0xFFFFFFFFFFFFFFFFL) & l9;
      l8 ^= (l9 ^ 0xFFFFFFFFFFFFFFFFL) & l10;
      l9 ^= (l10 ^ 0xFFFFFFFFFFFFFFFFL) & l6;
      l10 ^= (l6 ^ 0xFFFFFFFFFFFFFFFFL) & l7;
      l6 = l26;
      l7 = l27;
      l26 = l11 ^ (l12 ^ 0xFFFFFFFFFFFFFFFFL) & l13;
      l27 = l12 ^ (l13 ^ 0xFFFFFFFFFFFFFFFFL) & l14;
      l13 ^= (l14 ^ 0xFFFFFFFFFFFFFFFFL) & l15;
      l14 ^= (l15 ^ 0xFFFFFFFFFFFFFFFFL) & l11;
      l15 ^= (l11 ^ 0xFFFFFFFFFFFFFFFFL) & l12;
      l11 = l26;
      l12 = l27;
      l26 = l16 ^ (l17 ^ 0xFFFFFFFFFFFFFFFFL) & l18;
      l27 = l17 ^ (l18 ^ 0xFFFFFFFFFFFFFFFFL) & l19;
      l18 ^= (l19 ^ 0xFFFFFFFFFFFFFFFFL) & l20;
      l19 ^= (l20 ^ 0xFFFFFFFFFFFFFFFFL) & l16;
      l20 ^= (l16 ^ 0xFFFFFFFFFFFFFFFFL) & l17;
      l16 = l26;
      l17 = l27;
      l26 = l21 ^ (l22 ^ 0xFFFFFFFFFFFFFFFFL) & l23;
      l27 = l22 ^ (l23 ^ 0xFFFFFFFFFFFFFFFFL) & l24;
      l23 ^= (l24 ^ 0xFFFFFFFFFFFFFFFFL) & l25;
      l24 ^= (l25 ^ 0xFFFFFFFFFFFFFFFFL) & l21;
      l25 ^= (l21 ^ 0xFFFFFFFFFFFFFFFFL) & l22;
      l21 = l26;
      l22 = l27;
      l1 ^= KeccakRoundConstants[b];
    } 
    paramArrayOflong[0] = l1;
    paramArrayOflong[1] = l2;
    paramArrayOflong[2] = l3;
    paramArrayOflong[3] = l4;
    paramArrayOflong[4] = l5;
    paramArrayOflong[5] = l6;
    paramArrayOflong[6] = l7;
    paramArrayOflong[7] = l8;
    paramArrayOflong[8] = l9;
    paramArrayOflong[9] = l10;
    paramArrayOflong[10] = l11;
    paramArrayOflong[11] = l12;
    paramArrayOflong[12] = l13;
    paramArrayOflong[13] = l14;
    paramArrayOflong[14] = l15;
    paramArrayOflong[15] = l16;
    paramArrayOflong[16] = l17;
    paramArrayOflong[17] = l18;
    paramArrayOflong[18] = l19;
    paramArrayOflong[19] = l20;
    paramArrayOflong[20] = l21;
    paramArrayOflong[21] = l22;
    paramArrayOflong[22] = l23;
    paramArrayOflong[23] = l24;
    paramArrayOflong[24] = l25;
  }
  
  private void keccakIncAbsorb(byte[] paramArrayOfbyte, int paramInt) {
    int i = 0;
    int j = this.rate >> 3;
    while (paramInt + this.state[25] >= j) {
      for (byte b1 = 0; b1 < j - this.state[25]; b1++) {
        int k = (int)(this.state[25] + b1) >> 3;
        this.state[k] = this.state[k] ^ toUnsignedLong(paramArrayOfbyte[b1 + i] & 0xFF) << (int)(8L * (this.state[25] + b1 & 0x7L));
      } 
      paramInt = (int)(paramInt - j - this.state[25]);
      i = (int)(i + j - this.state[25]);
      this.state[25] = 0L;
      keccakPermutation(this.state);
    } 
    for (byte b = 0; b < paramInt; b++) {
      int k = (int)(this.state[25] + b) >> 3;
      this.state[k] = this.state[k] ^ toUnsignedLong(paramArrayOfbyte[b + i] & 0xFF) << (int)(8L * (this.state[25] + b & 0x7L));
    } 
    this.state[25] = this.state[25] + paramInt;
  }
  
  private void keccakIncFinalize(int paramInt) {
    int i = this.rate >> 3;
    this.state[(int)this.state[25] >> 3] = this.state[(int)this.state[25] >> 3] ^ toUnsignedLong(paramInt) << (int)(8L * (this.state[25] & 0x7L));
    this.state[i - 1 >> 3] = this.state[i - 1 >> 3] ^ toUnsignedLong(128) << 8 * (i - 1 & 0x7);
    this.state[25] = 0L;
  }
  
  private void keccakIncSqueeze(byte[] paramArrayOfbyte, int paramInt) {
    int i = this.rate >> 3;
    byte b;
    for (b = 0; b < paramInt && b < this.state[25]; b++)
      paramArrayOfbyte[b] = (byte)(int)(this.state[(int)(i - this.state[25] + b >> 3L)] >> (int)(8L * (i - this.state[25] + b & 0x7L))); 
    int j = b;
    paramInt -= b;
    this.state[25] = this.state[25] - b;
    while (paramInt > 0) {
      keccakPermutation(this.state);
      for (b = 0; b < paramInt && b < i; b++)
        paramArrayOfbyte[j + b] = (byte)(int)(this.state[b >> 3] >> 8 * (b & 0x7)); 
      j += b;
      paramInt -= b;
      this.state[25] = (i - b);
    } 
  }
  
  public void squeeze(byte[] paramArrayOfbyte, int paramInt) {
    keccakIncSqueeze(paramArrayOfbyte, paramInt);
  }
  
  public void randomGeneratorInit(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    byte[] arrayOfByte = { 1 };
    keccakIncAbsorb(paramArrayOfbyte1, paramInt1);
    keccakIncAbsorb(paramArrayOfbyte2, paramInt2);
    keccakIncAbsorb(arrayOfByte, arrayOfByte.length);
    keccakIncFinalize(31);
  }
  
  public void seedExpanderInit(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = { 2 };
    keccakIncAbsorb(paramArrayOfbyte, paramInt);
    keccakIncAbsorb(arrayOfByte, 1);
    keccakIncFinalize(31);
  }
  
  public void expandSeed(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramInt & 0x7;
    keccakIncSqueeze(paramArrayOfbyte, paramInt - i);
    if (i != 0) {
      byte[] arrayOfByte = new byte[8];
      keccakIncSqueeze(arrayOfByte, 8);
      System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramInt - i, i);
    } 
  }
  
  public void SHAKE256_512_ds(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt, byte[] paramArrayOfbyte3) {
    Arrays.fill(this.state, 0L);
    keccakIncAbsorb(paramArrayOfbyte2, paramInt);
    keccakIncAbsorb(paramArrayOfbyte3, paramArrayOfbyte3.length);
    keccakIncFinalize(31);
    keccakIncSqueeze(paramArrayOfbyte1, 64);
  }
  
  private static long toUnsignedLong(int paramInt) {
    return paramInt & 0xFFFFFFFFL;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\hqc\KeccakRandomGenerator.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */