package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.nio.ByteBuffer;
import org.bouncycastle.crypto.Digest;

public class NTRUSignerPrng {
  private int counter = 0;
  
  private byte[] seed;
  
  private Digest hashAlg;
  
  NTRUSignerPrng(byte[] paramArrayOfbyte, Digest paramDigest) {
    this.seed = paramArrayOfbyte;
    this.hashAlg = paramDigest;
  }
  
  byte[] nextBytes(int paramInt) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(paramInt);
    while (byteBuffer.hasRemaining()) {
      ByteBuffer byteBuffer1 = ByteBuffer.allocate(this.seed.length + 4);
      byteBuffer1.put(this.seed);
      byteBuffer1.putInt(this.counter);
      byte[] arrayOfByte1 = byteBuffer1.array();
      byte[] arrayOfByte2 = new byte[this.hashAlg.getDigestSize()];
      this.hashAlg.update(arrayOfByte1, 0, arrayOfByte1.length);
      this.hashAlg.doFinal(arrayOfByte2, 0);
      if (byteBuffer.remaining() < arrayOfByte2.length) {
        byteBuffer.put(arrayOfByte2, 0, byteBuffer.remaining());
      } else {
        byteBuffer.put(arrayOfByte2);
      } 
      this.counter++;
    } 
    return byteBuffer.array();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUSignerPrng.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */