package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.crypto.Digest;

class HarakaS512Digest extends HarakaSBase implements Digest {
  public HarakaS512Digest(HarakaSXof paramHarakaSXof) {
    this.haraka512_rc = paramHarakaSXof.haraka512_rc;
  }
  
  public String getAlgorithmName() {
    return "HarakaS-512";
  }
  
  public int getDigestSize() {
    return 32;
  }
  
  public void update(byte paramByte) {
    if (this.off > 63)
      throw new IllegalArgumentException("total input cannot be more than 64 bytes"); 
    this.buffer[this.off++] = paramByte;
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.off > 64 - paramInt2)
      throw new IllegalArgumentException("total input cannot be more than 64 bytes"); 
    System.arraycopy(paramArrayOfbyte, paramInt1, this.buffer, this.off, paramInt2);
    this.off += paramInt2;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[64];
    haraka512Perm(arrayOfByte);
    xor(arrayOfByte, 8, this.buffer, 8, paramArrayOfbyte, paramInt, 8);
    xor(arrayOfByte, 24, this.buffer, 24, paramArrayOfbyte, paramInt + 8, 16);
    xor(arrayOfByte, 48, this.buffer, 48, paramArrayOfbyte, paramInt + 24, 8);
    reset();
    return arrayOfByte.length;
  }
  
  public void reset() {
    super.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\HarakaS512Digest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */