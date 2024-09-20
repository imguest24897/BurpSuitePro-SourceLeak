package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.SparkleEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

public class SparkleDigest implements ExtendedDigest {
  private static final int RATE_BYTES = 16;
  
  private static final int RATE_WORDS = 4;
  
  private String algorithmName;
  
  private final int[] state;
  
  private final byte[] m_buf = new byte[16];
  
  private final int DIGEST_BYTES;
  
  private final int SPARKLE_STEPS_SLIM;
  
  private final int SPARKLE_STEPS_BIG;
  
  private final int STATE_WORDS;
  
  private int m_bufPos = 0;
  
  public SparkleDigest(SparkleParameters paramSparkleParameters) {
    switch (paramSparkleParameters) {
      case ESCH256:
        this.algorithmName = "ESCH-256";
        this.DIGEST_BYTES = 32;
        this.SPARKLE_STEPS_SLIM = 7;
        this.SPARKLE_STEPS_BIG = 11;
        this.STATE_WORDS = 12;
        break;
      case ESCH384:
        this.algorithmName = "ESCH-384";
        this.DIGEST_BYTES = 48;
        this.SPARKLE_STEPS_SLIM = 8;
        this.SPARKLE_STEPS_BIG = 12;
        this.STATE_WORDS = 16;
        break;
      default:
        throw new IllegalArgumentException("Invalid definition of SCHWAEMM instance");
    } 
    this.state = new int[this.STATE_WORDS];
  }
  
  public String getAlgorithmName() {
    return this.algorithmName;
  }
  
  public int getDigestSize() {
    return this.DIGEST_BYTES;
  }
  
  public int getByteLength() {
    return 16;
  }
  
  public void update(byte paramByte) {
    if (this.m_bufPos == 16) {
      processBlock(this.m_buf, 0, this.SPARKLE_STEPS_SLIM);
      this.m_bufPos = 0;
    } 
    this.m_buf[this.m_bufPos++] = paramByte;
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt1 > paramArrayOfbyte.length - paramInt2)
      throw new DataLengthException(this.algorithmName + " input buffer too short"); 
    if (paramInt2 < 1)
      return; 
    int i = 16 - this.m_bufPos;
    if (paramInt2 <= i) {
      System.arraycopy(paramArrayOfbyte, paramInt1, this.m_buf, this.m_bufPos, paramInt2);
      this.m_bufPos += paramInt2;
      return;
    } 
    int j = 0;
    if (this.m_bufPos > 0) {
      System.arraycopy(paramArrayOfbyte, paramInt1, this.m_buf, this.m_bufPos, i);
      processBlock(this.m_buf, 0, this.SPARKLE_STEPS_SLIM);
      j += i;
    } 
    int k;
    while ((k = paramInt2 - j) > 16) {
      processBlock(paramArrayOfbyte, paramInt1 + j, this.SPARKLE_STEPS_SLIM);
      j += 16;
    } 
    System.arraycopy(paramArrayOfbyte, paramInt1 + j, this.m_buf, 0, k);
    this.m_bufPos = k;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    if (paramInt > paramArrayOfbyte.length - this.DIGEST_BYTES)
      throw new OutputLengthException(this.algorithmName + " input buffer too short"); 
    if (this.m_bufPos < 16) {
      this.state[(this.STATE_WORDS >> 1) - 1] = this.state[(this.STATE_WORDS >> 1) - 1] ^ 0x1000000;
      this.m_buf[this.m_bufPos] = Byte.MIN_VALUE;
      while (++this.m_bufPos < 16)
        this.m_buf[this.m_bufPos] = 0; 
    } else {
      this.state[(this.STATE_WORDS >> 1) - 1] = this.state[(this.STATE_WORDS >> 1) - 1] ^ 0x2000000;
    } 
    processBlock(this.m_buf, 0, this.SPARKLE_STEPS_BIG);
    Pack.intToLittleEndian(this.state, 0, 4, paramArrayOfbyte, paramInt);
    if (this.STATE_WORDS == 16) {
      SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
      Pack.intToLittleEndian(this.state, 0, 4, paramArrayOfbyte, paramInt + 16);
      SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
      Pack.intToLittleEndian(this.state, 0, 4, paramArrayOfbyte, paramInt + 32);
    } else {
      SparkleEngine.sparkle_opt12(Friend.INSTANCE, this.state, this.SPARKLE_STEPS_SLIM);
      Pack.intToLittleEndian(this.state, 0, 4, paramArrayOfbyte, paramInt + 16);
    } 
    reset();
    return this.DIGEST_BYTES;
  }
  
  public void reset() {
    Arrays.fill(this.state, 0);
    Arrays.fill(this.m_buf, (byte)0);
    this.m_bufPos = 0;
  }
  
  private void processBlock(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = Pack.littleEndianToInt(paramArrayOfbyte, paramInt1);
    int j = Pack.littleEndianToInt(paramArrayOfbyte, paramInt1 + 4);
    int k = Pack.littleEndianToInt(paramArrayOfbyte, paramInt1 + 8);
    int m = Pack.littleEndianToInt(paramArrayOfbyte, paramInt1 + 12);
    int n = ELL(i ^ k);
    int i1 = ELL(j ^ m);
    this.state[0] = this.state[0] ^ i ^ i1;
    this.state[1] = this.state[1] ^ j ^ n;
    this.state[2] = this.state[2] ^ k ^ i1;
    this.state[3] = this.state[3] ^ m ^ n;
    this.state[4] = this.state[4] ^ i1;
    this.state[5] = this.state[5] ^ n;
    if (this.STATE_WORDS == 16) {
      this.state[6] = this.state[6] ^ i1;
      this.state[7] = this.state[7] ^ n;
      SparkleEngine.sparkle_opt16(Friend.INSTANCE, this.state, paramInt2);
    } else {
      SparkleEngine.sparkle_opt12(Friend.INSTANCE, this.state, paramInt2);
    } 
  }
  
  private static int ELL(int paramInt) {
    return Integers.rotateRight(paramInt, 16) ^ paramInt & 0xFFFF;
  }
  
  public static class Friend {
    private static final Friend INSTANCE = new Friend();
  }
  
  public enum SparkleParameters {
    ESCH256, ESCH384;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\SparkleDigest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */