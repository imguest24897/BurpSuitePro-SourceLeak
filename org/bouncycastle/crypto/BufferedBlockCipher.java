package org.bouncycastle.crypto;

public class BufferedBlockCipher {
  protected byte[] buf;
  
  protected int bufOff;
  
  protected boolean forEncryption;
  
  protected BlockCipher cipher;
  
  protected MultiBlockCipher mbCipher;
  
  protected boolean partialBlockOkay;
  
  protected boolean pgpCFB;
  
  BufferedBlockCipher() {}
  
  public BufferedBlockCipher(BlockCipher paramBlockCipher) {
    this.cipher = paramBlockCipher;
    if (paramBlockCipher instanceof MultiBlockCipher) {
      this.mbCipher = (MultiBlockCipher)paramBlockCipher;
      this.buf = new byte[this.mbCipher.getMultiBlockSize()];
    } else {
      this.mbCipher = null;
      this.buf = new byte[paramBlockCipher.getBlockSize()];
    } 
    this.bufOff = 0;
    String str = paramBlockCipher.getAlgorithmName();
    int i = str.indexOf('/') + 1;
    this.pgpCFB = (i > 0 && str.startsWith("PGP", i));
    if (this.pgpCFB || paramBlockCipher instanceof StreamCipher) {
      this.partialBlockOkay = true;
    } else {
      this.partialBlockOkay = (i > 0 && str.startsWith("OpenPGP", i));
    } 
  }
  
  public BlockCipher getUnderlyingCipher() {
    return this.cipher;
  }
  
  public void init(boolean paramBoolean, CipherParameters paramCipherParameters) throws IllegalArgumentException {
    this.forEncryption = paramBoolean;
    reset();
    this.cipher.init(paramBoolean, paramCipherParameters);
  }
  
  public int getBlockSize() {
    return this.cipher.getBlockSize();
  }
  
  public int getUpdateOutputSize(int paramInt) {
    int j;
    int i = paramInt + this.bufOff;
    if (this.pgpCFB) {
      if (this.forEncryption) {
        j = i % this.buf.length - this.cipher.getBlockSize() + 2;
      } else {
        j = i % this.buf.length;
      } 
    } else {
      j = i % this.buf.length;
    } 
    return i - j;
  }
  
  public int getOutputSize(int paramInt) {
    return (this.pgpCFB && this.forEncryption) ? (paramInt + this.bufOff + this.cipher.getBlockSize() + 2) : (paramInt + this.bufOff);
  }
  
  public int processByte(byte paramByte, byte[] paramArrayOfbyte, int paramInt) throws DataLengthException, IllegalStateException {
    int i = 0;
    this.buf[this.bufOff++] = paramByte;
    if (this.bufOff == this.buf.length) {
      i = this.cipher.processBlock(this.buf, 0, paramArrayOfbyte, paramInt);
      this.bufOff = 0;
    } 
    return i;
  }
  
  public int processBytes(byte[] paramArrayOfbyte1, int paramInt1, int paramInt2, byte[] paramArrayOfbyte2, int paramInt3) throws DataLengthException, IllegalStateException {
    if (paramInt2 < 0)
      throw new IllegalArgumentException("Can't have a negative input length!"); 
    int i = getBlockSize();
    int j = getUpdateOutputSize(paramInt2);
    if (j > 0 && paramInt3 + j > paramArrayOfbyte2.length)
      throw new OutputLengthException("output buffer too short"); 
    int k = 0;
    int m = this.buf.length - this.bufOff;
    if (paramInt2 > m) {
      System.arraycopy(paramArrayOfbyte1, paramInt1, this.buf, this.bufOff, m);
      k += this.cipher.processBlock(this.buf, 0, paramArrayOfbyte2, paramInt3);
      this.bufOff = 0;
      paramInt2 -= m;
      paramInt1 += m;
      if (this.mbCipher != null) {
        int n = paramInt2 / this.mbCipher.getMultiBlockSize();
        if (n > 0) {
          k += this.mbCipher.processBlocks(paramArrayOfbyte1, paramInt1, n, paramArrayOfbyte2, paramInt3 + k);
          int i1 = n * this.mbCipher.getMultiBlockSize();
          paramInt2 -= i1;
          paramInt1 += i1;
        } 
      } else {
        while (paramInt2 > this.buf.length) {
          k += this.cipher.processBlock(paramArrayOfbyte1, paramInt1, paramArrayOfbyte2, paramInt3 + k);
          paramInt2 -= i;
          paramInt1 += i;
        } 
      } 
    } 
    System.arraycopy(paramArrayOfbyte1, paramInt1, this.buf, this.bufOff, paramInt2);
    this.bufOff += paramInt2;
    if (this.bufOff == this.buf.length) {
      k += this.cipher.processBlock(this.buf, 0, paramArrayOfbyte2, paramInt3 + k);
      this.bufOff = 0;
    } 
    return k;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
    try {
      int i = 0;
      if (paramInt + this.bufOff > paramArrayOfbyte.length)
        throw new OutputLengthException("output buffer too short for doFinal()"); 
      if (this.bufOff != 0) {
        if (!this.partialBlockOkay)
          throw new DataLengthException("data not block size aligned"); 
        this.cipher.processBlock(this.buf, 0, this.buf, 0);
        i = this.bufOff;
        this.bufOff = 0;
        System.arraycopy(this.buf, 0, paramArrayOfbyte, paramInt, i);
      } 
      return i;
    } finally {
      reset();
    } 
  }
  
  public void reset() {
    for (byte b = 0; b < this.buf.length; b++)
      this.buf[b] = 0; 
    this.bufOff = 0;
    this.cipher.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\BufferedBlockCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */