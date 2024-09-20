package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.Xof;

public class AsconXof implements Xof {
  AsconParameters asconParameters;
  
  private final String algorithmName;
  
  private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
  
  private long x0;
  
  private long x1;
  
  private long x2;
  
  private long x3;
  
  private long x4;
  
  private final int CRYPTO_BYTES = 32;
  
  private final int ASCON_PB_ROUNDS;
  
  public AsconXof(AsconParameters paramAsconParameters) {
    this.asconParameters = paramAsconParameters;
    switch (paramAsconParameters) {
      case AsconXof:
        this.ASCON_PB_ROUNDS = 12;
        this.algorithmName = "Ascon-Xof";
        break;
      case AsconXofA:
        this.ASCON_PB_ROUNDS = 8;
        this.algorithmName = "Ascon-XofA";
        break;
      default:
        throw new IllegalArgumentException("Invalid parameter settings for Ascon Hash");
    } 
    reset();
  }
  
  private long ROR(long paramLong, int paramInt) {
    return paramLong >>> paramInt | paramLong << 64 - paramInt;
  }
  
  private void ROUND(long paramLong) {
    long l1 = this.x0 ^ this.x1 ^ this.x2 ^ this.x3 ^ paramLong ^ this.x1 & (this.x0 ^ this.x2 ^ this.x4 ^ paramLong);
    long l2 = this.x0 ^ this.x2 ^ this.x3 ^ this.x4 ^ paramLong ^ (this.x1 ^ this.x2 ^ paramLong) & (this.x1 ^ this.x3);
    long l3 = this.x1 ^ this.x2 ^ this.x4 ^ paramLong ^ this.x3 & this.x4;
    long l4 = this.x0 ^ this.x1 ^ this.x2 ^ paramLong ^ (this.x0 ^ 0xFFFFFFFFFFFFFFFFL) & (this.x3 ^ this.x4);
    long l5 = this.x1 ^ this.x3 ^ this.x4 ^ (this.x0 ^ this.x4) & this.x1;
    this.x0 = l1 ^ ROR(l1, 19) ^ ROR(l1, 28);
    this.x1 = l2 ^ ROR(l2, 39) ^ ROR(l2, 61);
    this.x2 = l3 ^ ROR(l3, 1) ^ ROR(l3, 6) ^ 0xFFFFFFFFFFFFFFFFL;
    this.x3 = l4 ^ ROR(l4, 10) ^ ROR(l4, 17);
    this.x4 = l5 ^ ROR(l5, 7) ^ ROR(l5, 41);
  }
  
  private void P(int paramInt) {
    if (paramInt == 12) {
      ROUND(240L);
      ROUND(225L);
      ROUND(210L);
      ROUND(195L);
    } 
    if (paramInt >= 8) {
      ROUND(180L);
      ROUND(165L);
    } 
    ROUND(150L);
    ROUND(135L);
    ROUND(120L);
    ROUND(105L);
    ROUND(90L);
    ROUND(75L);
  }
  
  private long PAD(int paramInt) {
    return 128L << 56 - (paramInt << 3);
  }
  
  private long LOADBYTES(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    long l = 0L;
    for (byte b = 0; b < paramInt2; b++)
      l |= (paramArrayOfbyte[b + paramInt1] & 0xFFL) << 7 - b << 3; 
    return l;
  }
  
  private void STOREBYTES(byte[] paramArrayOfbyte, int paramInt1, long paramLong, int paramInt2) {
    for (byte b = 0; b < paramInt2; b++)
      paramArrayOfbyte[b + paramInt1] = (byte)(int)(paramLong >>> 7 - b << 3); 
  }
  
  public String getAlgorithmName() {
    return this.algorithmName;
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
  
  public int doOutput(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (32 + paramInt1 > paramArrayOfbyte.length)
      throw new OutputLengthException("output buffer is too short"); 
    byte[] arrayOfByte = this.buffer.toByteArray();
    int i = this.buffer.size();
    int j = 0;
    byte b1 = 8;
    while (i >= b1) {
      this.x0 ^= LOADBYTES(arrayOfByte, j, 8);
      P(this.ASCON_PB_ROUNDS);
      j += b1;
      i -= b1;
    } 
    this.x0 ^= LOADBYTES(arrayOfByte, j, i);
    this.x0 ^= PAD(i);
    byte b2 = 12;
    P(b2);
    for (i = 32; i > b1; i -= b1) {
      STOREBYTES(paramArrayOfbyte, paramInt1, this.x0, 8);
      P(this.ASCON_PB_ROUNDS);
      paramInt1 += b1;
    } 
    STOREBYTES(paramArrayOfbyte, paramInt1, this.x0, i);
    reset();
    return 32;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    return doOutput(paramArrayOfbyte, paramInt, getDigestSize());
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return doOutput(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public int getByteLength() {
    return 8;
  }
  
  public void reset() {
    this.buffer.reset();
    switch (this.asconParameters) {
      case AsconXof:
        this.x0 = -5368810569253202922L;
        this.x1 = 3121280575360345120L;
        this.x2 = 7395939140700676632L;
        this.x3 = 6533890155656471820L;
        this.x4 = 5710016986865767350L;
        break;
      case AsconXofA:
        this.x0 = 4940560291654768690L;
        this.x1 = -3635129828240960206L;
        this.x2 = -597534922722107095L;
        this.x3 = 2623493988082852443L;
        this.x4 = -6283826724160825537L;
        break;
    } 
  }
  
  public enum AsconParameters {
    AsconXof, AsconXofA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\AsconXof.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */