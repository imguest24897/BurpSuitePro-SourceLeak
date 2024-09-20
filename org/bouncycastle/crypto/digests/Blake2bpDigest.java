package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class Blake2bpDigest implements ExtendedDigest {
  private int bufferPos = 0;
  
  private int keyLength = 0;
  
  private int digestLength;
  
  private int fanout;
  
  private int depth;
  
  private int nodeOffset = 0;
  
  private long innerHashLength;
  
  private Blake2bDigest[] S = new Blake2bDigest[4];
  
  private Blake2bDigest root;
  
  private byte[] buffer = null;
  
  private byte[] salt = null;
  
  private byte[] param = null;
  
  private byte[] key = null;
  
  private final int BLAKE2B_BLOCKBYTES = 128;
  
  private final int BLAKE2B_KEYBYTES = 64;
  
  private final int BLAKE2B_OUTBYTES = 64;
  
  private final int PARALLELISM_DEGREE = 4;
  
  private final byte[] singleByte = new byte[1];
  
  public Blake2bpDigest(byte[] paramArrayOfbyte) {
    this.param = new byte[64];
    this.buffer = new byte[512];
    init(paramArrayOfbyte);
  }
  
  public String getAlgorithmName() {
    return "BLAKE2bp";
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
    int j = 1024 - i;
    if (i != 0 && paramInt2 >= j) {
      System.arraycopy(paramArrayOfbyte, paramInt1, this.buffer, i, j);
      for (byte b1 = 0; b1 < 4; b1++)
        this.S[b1].update(this.buffer, b1 * 128, 128); 
      paramInt1 += j;
      paramInt2 -= j;
      i = 0;
    } 
    for (byte b = 0; b < 4; b++) {
      int k = paramInt2;
      int m = paramInt1;
      m += b * 128;
      while (k >= 512) {
        this.S[b].update(paramArrayOfbyte, m, 128);
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
    byte[][] arrayOfByte = new byte[4][64];
    int i = 0;
    int j;
    for (j = 0; j < 4; j++) {
      if (this.bufferPos > j * 128) {
        i = this.bufferPos - j * 128;
        if (i > 128)
          i = 128; 
        this.S[j].update(this.buffer, j * 128, i);
      } 
      this.S[j].doFinal(arrayOfByte[j], 0);
    } 
    for (j = 0; j < 4; j++)
      this.root.update(arrayOfByte[j], 0, 64); 
    j = this.root.doFinal(paramArrayOfbyte, paramInt);
    reset();
    return j;
  }
  
  public void reset() {
    this.bufferPos = 0;
    this.digestLength = 64;
    this.root.reset();
    for (byte b = 0; b < 4; b++)
      this.S[b].reset(); 
    this.root.setAsLastNode();
    this.S[3].setAsLastNode();
    if (this.key != null) {
      byte[] arrayOfByte = new byte[128];
      System.arraycopy(this.key, 0, arrayOfByte, 0, this.keyLength);
      for (byte b1 = 0; b1 < 4; b1++)
        this.S[b1].update(arrayOfByte, 0, 128); 
    } 
  }
  
  public int getByteLength() {
    return 0;
  }
  
  private void init(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null && paramArrayOfbyte.length > 0) {
      this.keyLength = paramArrayOfbyte.length;
      if (this.keyLength > 64)
        throw new IllegalArgumentException("Keys > 64 bytes are not supported"); 
      this.key = Arrays.clone(paramArrayOfbyte);
    } 
    this.bufferPos = 0;
    this.digestLength = 64;
    this.fanout = 4;
    this.depth = 2;
    this.innerHashLength = 64L;
    this.param[0] = (byte)this.digestLength;
    this.param[1] = (byte)this.keyLength;
    this.param[2] = (byte)this.fanout;
    this.param[3] = (byte)this.depth;
    this.param[16] = 1;
    this.param[17] = (byte)(int)this.innerHashLength;
    this.root = new Blake2bDigest(null, this.param);
    Pack.intToLittleEndian(this.nodeOffset, this.param, 8);
    this.param[16] = 0;
    for (byte b = 0; b < 4; b++) {
      Pack.intToLittleEndian(b, this.param, 8);
      this.S[b] = new Blake2bDigest(null, this.param);
    } 
    this.root.setAsLastNode();
    this.S[3].setAsLastNode();
    if (paramArrayOfbyte != null && this.keyLength > 0) {
      byte[] arrayOfByte = new byte[128];
      System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, this.keyLength);
      for (byte b1 = 0; b1 < 4; b1++)
        this.S[b1].update(arrayOfByte, 0, 128); 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\Blake2bpDigest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */