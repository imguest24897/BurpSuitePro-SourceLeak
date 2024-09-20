package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.OutputLengthException;

public class AsconDigest implements ExtendedDigest {
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
  
  public AsconDigest(AsconParameters paramAsconParameters) {
    this.asconParameters = paramAsconParameters;
    switch (paramAsconParameters) {
      case AsconHash:
        this.ASCON_PB_ROUNDS = 12;
        this.algorithmName = "Ascon-Hash";
        break;
      case AsconHashA:
        this.ASCON_PB_ROUNDS = 8;
        this.algorithmName = "Ascon-HashA";
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
  
  public int getByteLength() {
    return 8;
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
      STOREBYTES(paramArrayOfbyte, paramInt, this.x0, 8);
      P(this.ASCON_PB_ROUNDS);
      paramInt += b1;
    } 
    STOREBYTES(paramArrayOfbyte, paramInt, this.x0, i);
    reset();
    return 32;
  }
  
  public void reset() {
    this.buffer.reset();
    switch (this.asconParameters) {
      case AsconHashA:
        this.x0 = 92044056785660070L;
        this.x1 = 8326807761760157607L;
        this.x2 = 3371194088139667532L;
        this.x3 = -2956994353054992515L;
        this.x4 = -6828509670848688761L;
        break;
      case AsconHash:
        this.x0 = -1255492011513352131L;
        this.x1 = -8380609354527731710L;
        this.x2 = -5437372128236807582L;
        this.x3 = 4834782570098516968L;
        this.x4 = 3787428097924915520L;
        break;
    } 
  }
  
  public enum AsconParameters {
    AsconHash, AsconHashA;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\AsconDigest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */