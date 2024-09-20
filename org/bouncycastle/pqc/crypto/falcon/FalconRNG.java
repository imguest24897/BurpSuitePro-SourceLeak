package org.bouncycastle.pqc.crypto.falcon;

class FalconRNG {
  byte[] bd = new byte[512];
  
  long bdummy_u64 = 0L;
  
  int ptr = 0;
  
  byte[] sd = new byte[256];
  
  long sdummy_u64 = 0L;
  
  int type = 0;
  
  FalconConversions convertor = new FalconConversions();
  
  void prng_init(SHAKE256 paramSHAKE256) {
    byte[] arrayOfByte = new byte[56];
    paramSHAKE256.inner_shake256_extract(arrayOfByte, 0, 56);
    for (byte b = 0; b < 14; b++) {
      int i = arrayOfByte[(b << 2) + 0] & 0xFF | (arrayOfByte[(b << 2) + 1] & 0xFF) << 8 | (arrayOfByte[(b << 2) + 2] & 0xFF) << 16 | (arrayOfByte[(b << 2) + 3] & 0xFF) << 24;
      System.arraycopy(this.convertor.int_to_bytes(i), 0, this.sd, b << 2, 4);
    } 
    long l2 = this.convertor.bytes_to_int(this.sd, 48) & 0xFFFFFFFFL;
    long l1 = this.convertor.bytes_to_int(this.sd, 52) & 0xFFFFFFFFL;
    System.arraycopy(this.convertor.long_to_bytes(l2 + (l1 << 32L)), 0, this.sd, 48, 8);
    prng_refill();
  }
  
  void prng_refill() {
    int[] arrayOfInt = { 1634760805, 857760878, 2036477234, 1797285236 };
    long l = this.convertor.bytes_to_long(this.sd, 48);
    for (byte b = 0; b < 8; b++) {
      int[] arrayOfInt1 = new int[16];
      System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, arrayOfInt.length);
      System.arraycopy(this.convertor.bytes_to_int_array(this.sd, 0, 12), 0, arrayOfInt1, 4, 12);
      arrayOfInt1[14] = arrayOfInt1[14] ^ (int)l;
      arrayOfInt1[15] = arrayOfInt1[15] ^ (int)(l >>> 32L);
      for (byte b2 = 0; b2 < 10; b2++) {
        QROUND(0, 4, 8, 12, arrayOfInt1);
        QROUND(1, 5, 9, 13, arrayOfInt1);
        QROUND(2, 6, 10, 14, arrayOfInt1);
        QROUND(3, 7, 11, 15, arrayOfInt1);
        QROUND(0, 5, 10, 15, arrayOfInt1);
        QROUND(1, 6, 11, 12, arrayOfInt1);
        QROUND(2, 7, 8, 13, arrayOfInt1);
        QROUND(3, 4, 9, 14, arrayOfInt1);
      } 
      byte b1;
      for (b1 = 0; b1 < 4; b1++)
        arrayOfInt1[b1] = arrayOfInt1[b1] + arrayOfInt[b1]; 
      for (b1 = 4; b1 < 14; b1++)
        arrayOfInt1[b1] = arrayOfInt1[b1] + this.convertor.bytes_to_int(this.sd, 4 * b1 - 16); 
      arrayOfInt1[14] = arrayOfInt1[14] + (this.convertor.bytes_to_int(this.sd, 40) ^ (int)l);
      arrayOfInt1[15] = arrayOfInt1[15] + (this.convertor.bytes_to_int(this.sd, 44) ^ (int)(l >>> 32L));
      l++;
      for (b1 = 0; b1 < 16; b1++) {
        this.bd[(b << 2) + (b1 << 5) + 0] = (byte)arrayOfInt1[b1];
        this.bd[(b << 2) + (b1 << 5) + 1] = (byte)(arrayOfInt1[b1] >>> 8);
        this.bd[(b << 2) + (b1 << 5) + 2] = (byte)(arrayOfInt1[b1] >>> 16);
        this.bd[(b << 2) + (b1 << 5) + 3] = (byte)(arrayOfInt1[b1] >>> 24);
      } 
    } 
    System.arraycopy(this.convertor.long_to_bytes(l), 0, this.sd, 48, 8);
    this.ptr = 0;
  }
  
  void prng_get_bytes(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt1;
    while (paramInt2 > 0) {
      int j = this.bd.length - this.ptr;
      if (j > paramInt2)
        j = paramInt2; 
      System.arraycopy(this.bd, 0, paramArrayOfbyte, i, j);
      i += j;
      paramInt2 -= j;
      this.ptr += j;
      if (this.ptr == this.bd.length)
        prng_refill(); 
    } 
  }
  
  private void QROUND(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    paramArrayOfint[paramInt1] = paramArrayOfint[paramInt1] + paramArrayOfint[paramInt2];
    paramArrayOfint[paramInt4] = paramArrayOfint[paramInt4] ^ paramArrayOfint[paramInt1];
    paramArrayOfint[paramInt4] = paramArrayOfint[paramInt4] << 16 | paramArrayOfint[paramInt4] >>> 16;
    paramArrayOfint[paramInt3] = paramArrayOfint[paramInt3] + paramArrayOfint[paramInt4];
    paramArrayOfint[paramInt2] = paramArrayOfint[paramInt2] ^ paramArrayOfint[paramInt3];
    paramArrayOfint[paramInt2] = paramArrayOfint[paramInt2] << 12 | paramArrayOfint[paramInt2] >>> 20;
    paramArrayOfint[paramInt1] = paramArrayOfint[paramInt1] + paramArrayOfint[paramInt2];
    paramArrayOfint[paramInt4] = paramArrayOfint[paramInt4] ^ paramArrayOfint[paramInt1];
    paramArrayOfint[paramInt4] = paramArrayOfint[paramInt4] << 8 | paramArrayOfint[paramInt4] >>> 24;
    paramArrayOfint[paramInt3] = paramArrayOfint[paramInt3] + paramArrayOfint[paramInt4];
    paramArrayOfint[paramInt2] = paramArrayOfint[paramInt2] ^ paramArrayOfint[paramInt3];
    paramArrayOfint[paramInt2] = paramArrayOfint[paramInt2] << 7 | paramArrayOfint[paramInt2] >>> 25;
  }
  
  long prng_get_u64() {
    int i = this.ptr;
    if (i >= this.bd.length - 9) {
      prng_refill();
      i = 0;
    } 
    this.ptr = i + 8;
    return this.bd[i + 0] & 0xFFL | (this.bd[i + 1] & 0xFFL) << 8L | (this.bd[i + 2] & 0xFFL) << 16L | (this.bd[i + 3] & 0xFFL) << 24L | (this.bd[i + 4] & 0xFFL) << 32L | (this.bd[i + 5] & 0xFFL) << 40L | (this.bd[i + 6] & 0xFFL) << 48L | (this.bd[i + 7] & 0xFFL) << 56L;
  }
  
  byte prng_get_u8() {
    byte b = this.bd[this.ptr++];
    if (this.ptr == this.bd.length)
      prng_refill(); 
    return b;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\falcon\FalconRNG.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */