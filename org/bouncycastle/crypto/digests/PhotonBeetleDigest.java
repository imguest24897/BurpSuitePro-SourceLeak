package org.bouncycastle.crypto.digests;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

public class PhotonBeetleDigest implements Digest {
  private byte[] state = new byte[this.STATE_INBYTES];
  
  private byte[][] state_2d = new byte[this.D][this.D];
  
  private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
  
  private final int INITIAL_RATE_INBYTES = 16;
  
  private int RATE_INBYTES = 4;
  
  private int SQUEEZE_RATE_INBYTES = 16;
  
  private int STATE_INBYTES = 32;
  
  private int TAG_INBYTES = 32;
  
  private int LAST_THREE_BITS_OFFSET = 5;
  
  private int ROUND = 12;
  
  private int D = 8;
  
  private int Dq = 3;
  
  private int Dr = 7;
  
  private int DSquare = 64;
  
  private int S = 4;
  
  private int S_1 = 3;
  
  private byte[][] RC = new byte[][] { { 
        1, 3, 7, 14, 13, 11, 6, 12, 9, 2, 
        5, 10 }, { 
        0, 2, 6, 15, 12, 10, 7, 13, 8, 3, 
        4, 11 }, { 
        2, 0, 4, 13, 14, 8, 5, 15, 10, 1, 
        6, 9 }, { 
        6, 4, 0, 9, 10, 12, 1, 11, 14, 5, 
        2, 13 }, { 
        14, 12, 8, 1, 2, 4, 9, 3, 6, 13, 
        10, 5 }, { 
        15, 13, 9, 0, 3, 5, 8, 2, 7, 12, 
        11, 4 }, { 
        13, 15, 11, 2, 1, 7, 10, 0, 5, 14, 
        9, 6 }, { 
        9, 11, 15, 6, 5, 3, 14, 4, 1, 10, 
        13, 2 } };
  
  private byte[][] MixColMatrix = new byte[][] { { 2, 4, 2, 11, 2, 8, 5, 6 }, { 12, 9, 8, 13, 7, 7, 5, 2 }, { 4, 4, 13, 13, 9, 4, 13, 9 }, { 1, 6, 5, 1, 12, 13, 15, 14 }, { 15, 12, 9, 13, 14, 5, 14, 13 }, { 9, 14, 5, 15, 4, 12, 9, 6 }, { 12, 2, 2, 10, 3, 1, 1, 14 }, { 15, 1, 13, 10, 5, 10, 2, 3 } };
  
  private byte[] sbox = new byte[] { 
      12, 5, 6, 11, 9, 0, 10, 13, 3, 14, 
      15, 8, 4, 7, 1, 2 };
  
  public String getAlgorithmName() {
    return "Photon-Beetle Hash";
  }
  
  public int getDigestSize() {
    return this.TAG_INBYTES;
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
    int i = arrayOfByte.length;
    if (i == 0) {
      this.state[this.STATE_INBYTES - 1] = (byte)(this.state[this.STATE_INBYTES - 1] ^ 1 << this.LAST_THREE_BITS_OFFSET);
    } else if (i <= 16) {
      System.arraycopy(arrayOfByte, 0, this.state, 0, i);
      if (i < 16)
        this.state[i] = (byte)(this.state[i] ^ 0x1); 
      this.state[this.STATE_INBYTES - 1] = (byte)(this.state[this.STATE_INBYTES - 1] ^ ((i < 16) ? 1 : 2) << this.LAST_THREE_BITS_OFFSET);
    } else {
      System.arraycopy(arrayOfByte, 0, this.state, 0, 16);
      i -= 16;
      int j = (i + this.RATE_INBYTES - 1) / this.RATE_INBYTES;
      byte b;
      for (b = 0; b < j - 1; b++) {
        PHOTON_Permutation();
        Bytes.xorTo(this.RATE_INBYTES, arrayOfByte, 16 + b * this.RATE_INBYTES, this.state, 0);
      } 
      PHOTON_Permutation();
      int k = i - b * this.RATE_INBYTES;
      Bytes.xorTo(k, arrayOfByte, 16 + b * this.RATE_INBYTES, this.state, 0);
      if (k < this.RATE_INBYTES)
        this.state[k] = (byte)(this.state[k] ^ 0x1); 
      this.state[this.STATE_INBYTES - 1] = (byte)(this.state[this.STATE_INBYTES - 1] ^ ((i % this.RATE_INBYTES == 0) ? 1 : 2) << this.LAST_THREE_BITS_OFFSET);
    } 
    PHOTON_Permutation();
    System.arraycopy(this.state, 0, paramArrayOfbyte, paramInt, this.SQUEEZE_RATE_INBYTES);
    PHOTON_Permutation();
    System.arraycopy(this.state, 0, paramArrayOfbyte, paramInt + this.SQUEEZE_RATE_INBYTES, this.TAG_INBYTES - this.SQUEEZE_RATE_INBYTES);
    return this.TAG_INBYTES;
  }
  
  public void reset() {
    this.buffer.reset();
    Arrays.fill(this.state, (byte)0);
  }
  
  void PHOTON_Permutation() {
    byte b1;
    for (b1 = 0; b1 < this.DSquare; b1++)
      this.state_2d[b1 >>> this.Dq][b1 & this.Dr] = (byte)((this.state[b1 >> 1] & 0xFF) >>> 4 * (b1 & 0x1) & 0xF); 
    for (byte b2 = 0; b2 < this.ROUND; b2++) {
      for (b1 = 0; b1 < this.D; b1++)
        this.state_2d[b1][0] = (byte)(this.state_2d[b1][0] ^ this.RC[b1][b2]); 
      for (b1 = 0; b1 < this.D; b1++) {
        for (byte b3 = 0; b3 < this.D; b3++)
          this.state_2d[b1][b3] = this.sbox[this.state_2d[b1][b3]]; 
      } 
      for (b1 = 1; b1 < this.D; b1++) {
        System.arraycopy(this.state_2d[b1], 0, this.state, 0, this.D);
        System.arraycopy(this.state, b1, this.state_2d[b1], 0, this.D - b1);
        System.arraycopy(this.state, 0, this.state_2d[b1], this.D - b1, b1);
      } 
      for (byte b = 0; b < this.D; b++) {
        for (b1 = 0; b1 < this.D; b1++) {
          byte b4 = 0;
          for (byte b3 = 0; b3 < this.D; b3++) {
            byte b6 = this.MixColMatrix[b1][b3];
            int i = 0;
            byte b7 = this.state_2d[b3][b];
            for (byte b5 = 0; b5 < this.S; b5++) {
              int j;
              if ((b7 >>> b5 & 0x1) != 0)
                i ^= b6; 
              if ((b6 >>> this.S_1 & 0x1) != 0) {
                j = b6 << 1;
                j ^= 0x3;
              } else {
                j <<= 1;
              } 
            } 
            b4 = (byte)(b4 ^ i & 0xF);
          } 
          this.state[b1] = b4;
        } 
        for (b1 = 0; b1 < this.D; b1++)
          this.state_2d[b1][b] = this.state[b1]; 
      } 
    } 
    for (b1 = 0; b1 < this.DSquare; b1 += 2)
      this.state[b1 >>> 1] = (byte)(this.state_2d[b1 >>> this.Dq][b1 & this.Dr] & 0xF | (this.state_2d[b1 >>> this.Dq][b1 + 1 & this.Dr] & 0xF) << 4); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\PhotonBeetleDigest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */