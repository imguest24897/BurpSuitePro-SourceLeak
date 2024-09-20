package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class Blake2spDigest implements ExtendedDigest {
  private int bufferPos = 0;
  
  private int keyLength = 0;
  
  private int digestLength;
  
  private int fanout;
  
  private int depth;
  
  private int nodeOffset = 0;
  
  private long innerHashLength;
  
  private Blake2sDigest[] S = new Blake2sDigest[8];
  
  private Blake2sDigest root;
  
  private byte[] buffer = null;
  
  private byte[] salt = null;
  
  private byte[] param = null;
  
  private byte[] key = null;
  
  private final int BLAKE2S_BLOCKBYTES = 64;
  
  private final int BLAKE2S_KEYBYTES = 32;
  
  private final int BLAKE2S_OUTBYTES = 32;
  
  private final int PARALLELISM_DEGREE = 8;
  
  private final byte[] singleByte = new byte[1];
  
  public Blake2spDigest(byte[] paramArrayOfbyte) {
    this.param = new byte[32];
    this.buffer = new byte[512];
    init(paramArrayOfbyte);
  }
  
  public String getAlgorithmName() {
    return "BLAKE2sp";
  }
  
  public int getDigestSize() {
    return this.digestLength;
  }
  
  public void update(byte paramByte) {
    this.singleByte[0] = paramByte;
    update(this.singleByte, 0, 1);
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = this.bufferPos;
    int j = 512 - i;
    if (i != 0 && paramInt2 >= j) {
      System.arraycopy(paramArrayOfbyte, paramInt1, this.buffer, i, j);
      for (byte b1 = 0; b1 < 8; b1++)
        this.S[b1].update(this.buffer, b1 * 64, 64); 
      paramInt1 += j;
      paramInt2 -= j;
      i = 0;
    } 
    for (byte b = 0; b < 8; b++) {
      int k = paramInt2;
      int m = paramInt1;
      m += b * 64;
      while (k >= 512) {
        this.S[b].update(paramArrayOfbyte, m, 64);
        m += 512;
        k -= 512;
      } 
    } 
    paramInt1 += paramInt2 - paramInt2 % 512;
    paramInt2 %= 512;
    if (paramInt2 > 0)
      System.arraycopy(paramArrayOfbyte, paramInt1, this.buffer, i, paramInt2); 
    this.bufferPos = i + paramInt2;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    byte[][] arrayOfByte = new byte[8][32];
    int i = 0;
    int j;
    for (j = 0; j < 8; j++) {
      if (this.bufferPos > j * 64) {
        i = this.bufferPos - j * 64;
        if (i > 64)
          i = 64; 
        this.S[j].update(this.buffer, j * 64, i);
      } 
      this.S[j].doFinal(arrayOfByte[j], 0);
    } 
    for (j = 0; j < 8; j++)
      this.root.update(arrayOfByte[j], 0, 32); 
    j = this.root.doFinal(paramArrayOfbyte, paramInt);
    reset();
    return j;
  }
  
  public void reset() {
    this.bufferPos = 0;
    this.digestLength = 32;
    this.root.reset();
    for (byte b = 0; b < 8; b++)
      this.S[b].reset(); 
    this.root.setAsLastNode();
    this.S[7].setAsLastNode();
    if (this.key != null) {
      byte[] arrayOfByte = new byte[64];
      System.arraycopy(this.key, 0, arrayOfByte, 0, this.keyLength);
      for (byte b1 = 0; b1 < 8; b1++)
        this.S[b1].update(arrayOfByte, 0, 64); 
    } 
  }
  
  public int getByteLength() {
    return 64;
  }
  
  private void init(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null && paramArrayOfbyte.length > 0) {
      this.keyLength = paramArrayOfbyte.length;
      if (this.keyLength > 32)
        throw new IllegalArgumentException("Keys > 32 bytes are not supported"); 
      this.key = Arrays.clone(paramArrayOfbyte);
    } 
    this.bufferPos = 0;
    this.digestLength = 32;
    this.fanout = 8;
    this.depth = 2;
    this.innerHashLength = 32L;
    this.param[0] = (byte)this.digestLength;
    this.param[1] = (byte)this.keyLength;
    this.param[2] = (byte)this.fanout;
    this.param[3] = (byte)this.depth;
    Pack.intToLittleEndian(0, this.param, 8);
    this.param[14] = 1;
    this.param[15] = (byte)(int)this.innerHashLength;
    this.root = new Blake2sDigest(null, this.param);
    Pack.intToLittleEndian(this.nodeOffset, this.param, 8);
    this.param[14] = 0;
    for (byte b = 0; b < 8; b++) {
      Pack.intToLittleEndian(b, this.param, 8);
      this.S[b] = new Blake2sDigest(null, this.param);
    } 
    this.root.setAsLastNode();
    this.S[7].setAsLastNode();
    if (paramArrayOfbyte != null && this.keyLength > 0) {
      byte[] arrayOfByte = new byte[64];
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, this.keyLength);
      for (byte b1 = 0; b1 < 8; b1++)
        this.S[b1].update(arrayOfByte, 0, 64); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\Blake2spDigest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */