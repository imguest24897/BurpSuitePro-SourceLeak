package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Pack;

public class ISAPDigest implements Digest {
  private long x0;
  
  private long x1;
  
  private long x2;
  
  private long x3;
  
  private long x4;
  
  private long t0;
  
  private long t1;
  
  private long t2;
  
  private long t3;
  
  private long t4;
  
  private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
  
  private void ROUND(long paramLong) {
    this.t0 = this.x0 ^ this.x1 ^ this.x2 ^ this.x3 ^ paramLong ^ this.x1 & (this.x0 ^ this.x2 ^ this.x4 ^ paramLong);
    this.t1 = this.x0 ^ this.x2 ^ this.x3 ^ this.x4 ^ paramLong ^ (this.x1 ^ this.x2 ^ paramLong) & (this.x1 ^ this.x3);
    this.t2 = this.x1 ^ this.x2 ^ this.x4 ^ paramLong ^ this.x3 & this.x4;
    this.t3 = this.x0 ^ this.x1 ^ this.x2 ^ paramLong ^ (this.x0 ^ 0xFFFFFFFFFFFFFFFFL) & (this.x3 ^ this.x4);
    this.t4 = this.x1 ^ this.x3 ^ this.x4 ^ (this.x0 ^ this.x4) & this.x1;
    this.x0 = this.t0 ^ ROTR(this.t0, 19L) ^ ROTR(this.t0, 28L);
    this.x1 = this.t1 ^ ROTR(this.t1, 39L) ^ ROTR(this.t1, 61L);
    this.x2 = this.t2 ^ ROTR(this.t2, 1L) ^ ROTR(this.t2, 6L) ^ 0xFFFFFFFFFFFFFFFFL;
    this.x3 = this.t3 ^ ROTR(this.t3, 10L) ^ ROTR(this.t3, 17L);
    this.x4 = this.t4 ^ ROTR(this.t4, 7L) ^ ROTR(this.t4, 41L);
  }
  
  private void P12() {
    ROUND(240L);
    ROUND(225L);
    ROUND(210L);
    ROUND(195L);
    ROUND(180L);
    ROUND(165L);
    ROUND(150L);
    ROUND(135L);
    ROUND(120L);
    ROUND(105L);
    ROUND(90L);
    ROUND(75L);
  }
  
  private long ROTR(long paramLong1, long paramLong2) {
    return paramLong1 >>> (int)paramLong2 | paramLong1 << (int)(64L - paramLong2);
  }
  
  protected long U64BIG(long paramLong) {
    return ROTR(paramLong, 8L) & 0xFF000000FF000000L | ROTR(paramLong, 24L) & 0xFF000000FF0000L | ROTR(paramLong, 40L) & 0xFF000000FF00L | ROTR(paramLong, 56L) & 0xFF000000FFL;
  }
  
  public String getAlgorithmName() {
    return "ISAP Hash";
  }
  
  public int getDigestSize() {
    return 32;
  }
  
  public void update(byte paramByte) {
    this.buffer.write(paramByte);
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt1 + paramInt2 > paramArrayOfbyte.length)
      throw new DataLengthException("input buffer too short"); 
    this.buffer.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    if (32 + paramInt > paramArrayOfbyte.length)
      throw new OutputLengthException("output buffer is too short"); 
    this.t0 = this.t1 = this.t2 = this.t3 = this.t4 = 0L;
    this.x0 = -1255492011513352131L;
    this.x1 = -8380609354527731710L;
    this.x2 = -5437372128236807582L;
    this.x3 = 4834782570098516968L;
    this.x4 = 3787428097924915520L;
    byte[] arrayOfByte = this.buffer.toByteArray();
    int i = arrayOfByte.length;
    long[] arrayOfLong1 = new long[i >> 3];
    Pack.littleEndianToLong(arrayOfByte, 0, arrayOfLong1, 0, arrayOfLong1.length);
    byte b = 0;
    while (i >= 8) {
      this.x0 ^= U64BIG(arrayOfLong1[b++]);
      P12();
      i -= 8;
    } 
    this.x0 ^= 128L << 7 - i << 3;
    while (i > 0)
      this.x0 ^= (arrayOfByte[(b << 3) + --i] & 0xFFL) << 7 - i << 3; 
    P12();
    long[] arrayOfLong2 = new long[4];
    for (b = 0; b < 3; b++) {
      arrayOfLong2[b] = U64BIG(this.x0);
      P12();
    } 
    arrayOfLong2[b] = U64BIG(this.x0);
    Pack.longToLittleEndian(arrayOfLong2, paramArrayOfbyte, paramInt);
    this.buffer.reset();
    return 32;
  }
  
  public void reset() {
    this.buffer.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\ISAPDigest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */