package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class XoodyakDigest implements Digest {
  private byte[] state = new byte[48];
  
  private int phase;
  
  private MODE mode;
  
  private int Rabsorb;
  
  private final int f_bPrime = 48;
  
  private final int Rhash = 16;
  
  private final int PhaseDown = 1;
  
  private final int PhaseUp = 2;
  
  private final int NLANES = 12;
  
  private final int NROWS = 3;
  
  private final int NCOLUMS = 4;
  
  private final int MAXROUNDS = 12;
  
  private final int TAGLEN = 16;
  
  private final int[] RC = new int[] { 
      88, 56, 960, 208, 288, 20, 96, 44, 896, 240, 
      416, 18 };
  
  private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();
  
  public XoodyakDigest() {
    reset();
  }
  
  public String getAlgorithmName() {
    return "Xoodyak Hash";
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
    byte[] arrayOfByte = this.buffer.toByteArray();
    int i = 0;
    int j = this.buffer.size();
    byte b = 3;
    while (true) {
      if (this.phase != 2)
        Up(null, 0, 0, 0); 
      int k = Math.min(j, this.Rabsorb);
      Down(arrayOfByte, i, k, b);
      b = 0;
      i += k;
      j -= k;
      if (j == 0) {
        Up(paramArrayOfbyte, paramInt, 16, 64);
        Down(null, 0, 0, 0);
        Up(paramArrayOfbyte, paramInt + 16, 16, 0);
        return 32;
      } 
    } 
  }
  
  public void reset() {
    Arrays.fill(this.state, (byte)0);
    this.phase = 2;
    this.mode = MODE.ModeHash;
    this.Rabsorb = 16;
    this.buffer.reset();
  }
  
  private void Up(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    if (this.mode != MODE.ModeHash)
      this.state[47] = (byte)(this.state[47] ^ paramInt3); 
    int[] arrayOfInt1 = new int[12];
    Pack.littleEndianToInt(this.state, 0, arrayOfInt1, 0, arrayOfInt1.length);
    int[] arrayOfInt2 = new int[12];
    int[] arrayOfInt3 = new int[4];
    int[] arrayOfInt4 = new int[4];
    for (byte b = 0; b < 12; b++) {
      byte b1;
      for (b1 = 0; b1 < 4; b1++)
        arrayOfInt3[b1] = arrayOfInt1[index(b1, 0)] ^ arrayOfInt1[index(b1, 1)] ^ arrayOfInt1[index(b1, 2)]; 
      for (b1 = 0; b1 < 4; b1++) {
        int i = arrayOfInt3[b1 + 3 & 0x3];
        arrayOfInt4[b1] = ROTL32(i, 5) ^ ROTL32(i, 14);
      } 
      for (b1 = 0; b1 < 4; b1++) {
        for (byte b2 = 0; b2 < 3; b2++)
          arrayOfInt1[index(b1, b2)] = arrayOfInt1[index(b1, b2)] ^ arrayOfInt4[b1]; 
      } 
      for (b1 = 0; b1 < 4; b1++) {
        arrayOfInt2[index(b1, 0)] = arrayOfInt1[index(b1, 0)];
        arrayOfInt2[index(b1, 1)] = arrayOfInt1[index(b1 + 3, 1)];
        arrayOfInt2[index(b1, 2)] = ROTL32(arrayOfInt1[index(b1, 2)], 11);
      } 
      arrayOfInt2[0] = arrayOfInt2[0] ^ this.RC[b];
      for (b1 = 0; b1 < 4; b1++) {
        for (byte b2 = 0; b2 < 3; b2++)
          arrayOfInt1[index(b1, b2)] = arrayOfInt2[index(b1, b2)] ^ (arrayOfInt2[index(b1, b2 + 1)] ^ 0xFFFFFFFF) & arrayOfInt2[index(b1, b2 + 2)]; 
      } 
      for (b1 = 0; b1 < 4; b1++) {
        arrayOfInt2[index(b1, 0)] = arrayOfInt1[index(b1, 0)];
        arrayOfInt2[index(b1, 1)] = ROTL32(arrayOfInt1[index(b1, 1)], 1);
        arrayOfInt2[index(b1, 2)] = ROTL32(arrayOfInt1[index(b1 + 2, 2)], 8);
      } 
      System.arraycopy(arrayOfInt2, 0, arrayOfInt1, 0, 12);
    } 
    Pack.intToLittleEndian(arrayOfInt1, 0, arrayOfInt1.length, this.state, 0);
    this.phase = 2;
    if (paramArrayOfbyte != null)
      System.arraycopy(this.state, 0, paramArrayOfbyte, paramInt1, paramInt2); 
  }
  
  void Down(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    for (byte b = 0; b < paramInt2; b++)
      this.state[b] = (byte)(this.state[b] ^ paramArrayOfbyte[paramInt1++]); 
    this.state[paramInt2] = (byte)(this.state[paramInt2] ^ 0x1);
    this.state[47] = (byte)(this.state[47] ^ ((this.mode == MODE.ModeHash) ? (paramInt3 & 0x1) : paramInt3));
    this.phase = 1;
  }
  
  private int index(int paramInt1, int paramInt2) {
    return paramInt2 % 3 * 4 + paramInt1 % 4;
  }
  
  private int ROTL32(int paramInt1, int paramInt2) {
    return paramInt1 << (paramInt2 & 0x1F) ^ paramInt1 >>> (32 - paramInt2 & 0x1F);
  }
  
  enum MODE {
    ModeHash, ModeKeyed;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\XoodyakDigest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */