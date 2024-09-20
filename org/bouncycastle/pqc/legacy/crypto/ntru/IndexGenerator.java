package org.bouncycastle.pqc.legacy.crypto.ntru;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;

public class IndexGenerator {
  private byte[] seed;
  
  private int N;
  
  private int c;
  
  private int minCallsR;
  
  private int totLen;
  
  private int remLen;
  
  private BitString buf;
  
  private int counter;
  
  private boolean initialized;
  
  private Digest hashAlg;
  
  private int hLen;
  
  IndexGenerator(byte[] paramArrayOfbyte, NTRUEncryptionParameters paramNTRUEncryptionParameters) {
    this.seed = paramArrayOfbyte;
    this.N = paramNTRUEncryptionParameters.N;
    this.c = paramNTRUEncryptionParameters.c;
    this.minCallsR = paramNTRUEncryptionParameters.minCallsR;
    this.totLen = 0;
    this.remLen = 0;
    this.counter = 0;
    this.hashAlg = paramNTRUEncryptionParameters.hashAlg;
    this.hLen = this.hashAlg.getDigestSize();
    this.initialized = false;
  }
  
  int nextIndex() {
    if (!this.initialized) {
      this.buf = new BitString();
      byte[] arrayOfByte = new byte[this.hashAlg.getDigestSize()];
      while (this.counter < this.minCallsR) {
        appendHash(this.buf, arrayOfByte);
        this.counter++;
      } 
      this.totLen = this.minCallsR * 8 * this.hLen;
      this.remLen = this.totLen;
      this.initialized = true;
    } 
    while (true) {
      this.totLen += this.c;
      BitString bitString = this.buf.getTrailing(this.remLen);
      if (this.remLen < this.c) {
        int j = this.c - this.remLen;
        int k = this.counter + (j + this.hLen - 1) / this.hLen;
        byte[] arrayOfByte = new byte[this.hashAlg.getDigestSize()];
        while (this.counter < k) {
          appendHash(bitString, arrayOfByte);
          this.counter++;
          if (j > 8 * this.hLen)
            j -= 8 * this.hLen; 
        } 
        this.remLen = 8 * this.hLen - j;
        this.buf = new BitString();
        this.buf.appendBits(arrayOfByte);
      } else {
        this.remLen -= this.c;
      } 
      int i = bitString.getLeadingAsInt(this.c);
      if (i < (1 << this.c) - (1 << this.c) % this.N)
        return i % this.N; 
    } 
  }
  
  private void appendHash(BitString paramBitString, byte[] paramArrayOfbyte) {
    this.hashAlg.update(this.seed, 0, this.seed.length);
    putInt(this.hashAlg, this.counter);
    this.hashAlg.doFinal(paramArrayOfbyte, 0);
    paramBitString.appendBits(paramArrayOfbyte);
  }
  
  private void putInt(Digest paramDigest, int paramInt) {
    paramDigest.update((byte)(paramInt >> 24));
    paramDigest.update((byte)(paramInt >> 16));
    paramDigest.update((byte)(paramInt >> 8));
    paramDigest.update((byte)paramInt);
  }
  
  private static byte[] copyOf(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, 0, (paramInt < paramArrayOfbyte.length) ? paramInt : paramArrayOfbyte.length);
    return arrayOfByte;
  }
  
  public static class BitString {
    byte[] bytes = new byte[4];
    
    int numBytes;
    
    int lastByteBits;
    
    void appendBits(byte[] param1ArrayOfbyte) {
      for (byte b = 0; b != param1ArrayOfbyte.length; b++)
        appendBits(param1ArrayOfbyte[b]); 
    }
    
    public void appendBits(byte param1Byte) {
      if (this.numBytes == this.bytes.length)
        this.bytes = IndexGenerator.copyOf(this.bytes, 2 * this.bytes.length); 
      if (this.numBytes == 0) {
        this.numBytes = 1;
        this.bytes[0] = param1Byte;
        this.lastByteBits = 8;
      } else if (this.lastByteBits == 8) {
        this.bytes[this.numBytes++] = param1Byte;
      } else {
        int i = 8 - this.lastByteBits;
        this.bytes[this.numBytes - 1] = (byte)(this.bytes[this.numBytes - 1] | (param1Byte & 0xFF) << this.lastByteBits);
        this.bytes[this.numBytes++] = (byte)((param1Byte & 0xFF) >> i);
      } 
    }
    
    public BitString getTrailing(int param1Int) {
      BitString bitString = new BitString();
      bitString.numBytes = (param1Int + 7) / 8;
      bitString.bytes = new byte[bitString.numBytes];
      int i;
      for (i = 0; i < bitString.numBytes; i++)
        bitString.bytes[i] = this.bytes[i]; 
      bitString.lastByteBits = param1Int % 8;
      if (bitString.lastByteBits == 0) {
        bitString.lastByteBits = 8;
      } else {
        i = 32 - bitString.lastByteBits;
        bitString.bytes[bitString.numBytes - 1] = (byte)(bitString.bytes[bitString.numBytes - 1] << i >>> i);
      } 
      return bitString;
    }
    
    public int getLeadingAsInt(int param1Int) {
      int i = (this.numBytes - 1) * 8 + this.lastByteBits - param1Int;
      int j = i / 8;
      int k = i % 8;
      int m = (this.bytes[j] & 0xFF) >>> k;
      int n = 8 - k;
      for (int i1 = j + 1; i1 < this.numBytes; i1++) {
        m |= (this.bytes[i1] & 0xFF) << n;
        n += 8;
      } 
      return m;
    }
    
    public byte[] getBytes() {
      return Arrays.clone(this.bytes);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\IndexGenerator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */