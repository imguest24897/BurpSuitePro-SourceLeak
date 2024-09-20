package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.io.LimitedBuffer;

public class Prehash implements Digest {
  private final String algorithmName;
  
  private final LimitedBuffer buf;
  
  public static Prehash forDigest(Digest paramDigest) {
    return new Prehash(paramDigest);
  }
  
  private Prehash(Digest paramDigest) {
    this.algorithmName = paramDigest.getAlgorithmName();
    this.buf = new LimitedBuffer(paramDigest.getDigestSize());
  }
  
  public String getAlgorithmName() {
    return this.algorithmName;
  }
  
  public int getDigestSize() {
    return this.buf.limit();
  }
  
  public void update(byte paramByte) {
    this.buf.write(paramByte);
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.buf.write(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    try {
      if (getDigestSize() != this.buf.size())
        throw new IllegalStateException("Incorrect prehash size"); 
      return this.buf.copyTo(paramArrayOfbyte, paramInt);
    } finally {
      reset();
    } 
  }
  
  public void reset() {
    this.buf.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\Prehash.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */