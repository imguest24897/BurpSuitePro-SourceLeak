package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.crypto.Digest;

class HarakaS256Digest extends HarakaSBase implements Digest {
  public HarakaS256Digest(HarakaSXof paramHarakaSXof) {
    this.haraka256_rc = paramHarakaSXof.haraka256_rc;
  }
  
  public String getAlgorithmName() {
    return "HarakaS-256";
  }
  
  public int getDigestSize() {
    return 32;
  }
  
  public void update(byte paramByte) {
    if (this.off > 31)
      throw new IllegalArgumentException("total input cannot be more than 32 bytes"); 
    this.buffer[this.off++] = paramByte;
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.off > 32 - paramInt2)
      throw new IllegalArgumentException("total input cannot be more than 32 bytes"); 
    System.arraycopy(paramArrayOfbyte, paramInt1, this.buffer, this.off, paramInt2);
    this.off += paramInt2;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[32];
    haraka256Perm(arrayOfByte);
    xor(arrayOfByte, 0, this.buffer, 0, paramArrayOfbyte, paramInt, 32);
    reset();
    return paramArrayOfbyte.length;
  }
  
  public void reset() {
    super.reset();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\crypto\sphincsplus\HarakaS256Digest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */