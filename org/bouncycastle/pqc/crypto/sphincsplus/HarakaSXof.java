package org.bouncycastle.pqc.crypto.sphincsplus;

class HarakaSXof extends HarakaSBase {
  public String getAlgorithmName() {
    return "Haraka-S";
  }
  
  public HarakaSXof(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = new byte[640];
    update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    doFinal(arrayOfByte, 0, arrayOfByte.length);
    this.haraka512_rc = new long[10][8];
    this.haraka256_rc = new int[10][8];
    for (byte b = 0; b < 10; b++) {
      interleaveConstant32(this.haraka256_rc[b], arrayOfByte, b << 5);
      interleaveConstant(this.haraka512_rc[b], arrayOfByte, b << 6);
    } 
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt1;
    int j = paramInt2 + this.off >> 5;
    for (byte b = 0; b < j; b++) {
      while (this.off < 32)
        this.buffer[this.off++] = (byte)(this.buffer[this.off++] ^ paramArrayOfbyte[i++]); 
      haraka512Perm(this.buffer);
      this.off = 0;
    } 
    while (i < paramInt1 + paramInt2)
      this.buffer[this.off++] = (byte)(this.buffer[this.off++] ^ paramArrayOfbyte[i++]); 
  }
  
  public void update(byte paramByte) {
    this.buffer[this.off++] = (byte)(this.buffer[this.off++] ^ paramByte);
    if (this.off == 32) {
      haraka512Perm(this.buffer);
      this.off = 0;
    } 
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt2;
    this.buffer[this.off] = (byte)(this.buffer[this.off] ^ 0x1F);
    this.buffer[31] = (byte)(this.buffer[31] ^ 0x80);
    while (paramInt2 >= 32) {
      haraka512Perm(this.buffer);
      System.arraycopy(this.buffer, 0, paramArrayOfbyte, paramInt1, 32);
      paramInt1 += 32;
      paramInt2 -= 32;
    } 
    if (paramInt2 > 0) {
      haraka512Perm(this.buffer);
      System.arraycopy(this.buffer, 0, paramArrayOfbyte, paramInt1, paramInt2);
    } 
    reset();
    return i;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\HarakaSXof.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */