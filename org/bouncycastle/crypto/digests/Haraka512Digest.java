package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

public class Haraka512Digest extends HarakaBase {
  private final byte[] buffer;
  
  private int off;
  
  private final CryptoServicePurpose purpose;
  
  public Haraka512Digest() {
    this(CryptoServicePurpose.ANY);
  }
  
  public Haraka512Digest(CryptoServicePurpose paramCryptoServicePurpose) {
    this.purpose = paramCryptoServicePurpose;
    this.buffer = new byte[64];
  }
  
  public Haraka512Digest(Haraka512Digest paramHaraka512Digest) {
    this.purpose = paramHaraka512Digest.purpose;
    this.buffer = Arrays.clone(paramHaraka512Digest.buffer);
    this.off = paramHaraka512Digest.off;
  }
  
  private void mix512(byte[][] paramArrayOfbyte1, byte[][] paramArrayOfbyte2) {
    System.arraycopy(paramArrayOfbyte1[0], 12, paramArrayOfbyte2[0], 0, 4);
    System.arraycopy(paramArrayOfbyte1[2], 12, paramArrayOfbyte2[0], 4, 4);
    System.arraycopy(paramArrayOfbyte1[1], 12, paramArrayOfbyte2[0], 8, 4);
    System.arraycopy(paramArrayOfbyte1[3], 12, paramArrayOfbyte2[0], 12, 4);
    System.arraycopy(paramArrayOfbyte1[2], 0, paramArrayOfbyte2[1], 0, 4);
    System.arraycopy(paramArrayOfbyte1[0], 0, paramArrayOfbyte2[1], 4, 4);
    System.arraycopy(paramArrayOfbyte1[3], 0, paramArrayOfbyte2[1], 8, 4);
    System.arraycopy(paramArrayOfbyte1[1], 0, paramArrayOfbyte2[1], 12, 4);
    System.arraycopy(paramArrayOfbyte1[2], 4, paramArrayOfbyte2[2], 0, 4);
    System.arraycopy(paramArrayOfbyte1[0], 4, paramArrayOfbyte2[2], 4, 4);
    System.arraycopy(paramArrayOfbyte1[3], 4, paramArrayOfbyte2[2], 8, 4);
    System.arraycopy(paramArrayOfbyte1[1], 4, paramArrayOfbyte2[2], 12, 4);
    System.arraycopy(paramArrayOfbyte1[0], 8, paramArrayOfbyte2[3], 0, 4);
    System.arraycopy(paramArrayOfbyte1[2], 8, paramArrayOfbyte2[3], 4, 4);
    System.arraycopy(paramArrayOfbyte1[1], 8, paramArrayOfbyte2[3], 8, 4);
    System.arraycopy(paramArrayOfbyte1[3], 8, paramArrayOfbyte2[3], 12, 4);
  }
  
  private int haraka512256(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    byte[][] arrayOfByte1 = new byte[4][16];
    byte[][] arrayOfByte2 = new byte[4][16];
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte1[0], 0, 16);
    System.arraycopy(paramArrayOfbyte1, 16, arrayOfByte1[1], 0, 16);
    System.arraycopy(paramArrayOfbyte1, 32, arrayOfByte1[2], 0, 16);
    System.arraycopy(paramArrayOfbyte1, 48, arrayOfByte1[3], 0, 16);
    arrayOfByte1[0] = aesEnc(arrayOfByte1[0], RC[0]);
    arrayOfByte1[1] = aesEnc(arrayOfByte1[1], RC[1]);
    arrayOfByte1[2] = aesEnc(arrayOfByte1[2], RC[2]);
    arrayOfByte1[3] = aesEnc(arrayOfByte1[3], RC[3]);
    arrayOfByte1[0] = aesEnc(arrayOfByte1[0], RC[4]);
    arrayOfByte1[1] = aesEnc(arrayOfByte1[1], RC[5]);
    arrayOfByte1[2] = aesEnc(arrayOfByte1[2], RC[6]);
    arrayOfByte1[3] = aesEnc(arrayOfByte1[3], RC[7]);
    mix512(arrayOfByte1, arrayOfByte2);
    arrayOfByte1[0] = aesEnc(arrayOfByte2[0], RC[8]);
    arrayOfByte1[1] = aesEnc(arrayOfByte2[1], RC[9]);
    arrayOfByte1[2] = aesEnc(arrayOfByte2[2], RC[10]);
    arrayOfByte1[3] = aesEnc(arrayOfByte2[3], RC[11]);
    arrayOfByte1[0] = aesEnc(arrayOfByte1[0], RC[12]);
    arrayOfByte1[1] = aesEnc(arrayOfByte1[1], RC[13]);
    arrayOfByte1[2] = aesEnc(arrayOfByte1[2], RC[14]);
    arrayOfByte1[3] = aesEnc(arrayOfByte1[3], RC[15]);
    mix512(arrayOfByte1, arrayOfByte2);
    arrayOfByte1[0] = aesEnc(arrayOfByte2[0], RC[16]);
    arrayOfByte1[1] = aesEnc(arrayOfByte2[1], RC[17]);
    arrayOfByte1[2] = aesEnc(arrayOfByte2[2], RC[18]);
    arrayOfByte1[3] = aesEnc(arrayOfByte2[3], RC[19]);
    arrayOfByte1[0] = aesEnc(arrayOfByte1[0], RC[20]);
    arrayOfByte1[1] = aesEnc(arrayOfByte1[1], RC[21]);
    arrayOfByte1[2] = aesEnc(arrayOfByte1[2], RC[22]);
    arrayOfByte1[3] = aesEnc(arrayOfByte1[3], RC[23]);
    mix512(arrayOfByte1, arrayOfByte2);
    arrayOfByte1[0] = aesEnc(arrayOfByte2[0], RC[24]);
    arrayOfByte1[1] = aesEnc(arrayOfByte2[1], RC[25]);
    arrayOfByte1[2] = aesEnc(arrayOfByte2[2], RC[26]);
    arrayOfByte1[3] = aesEnc(arrayOfByte2[3], RC[27]);
    arrayOfByte1[0] = aesEnc(arrayOfByte1[0], RC[28]);
    arrayOfByte1[1] = aesEnc(arrayOfByte1[1], RC[29]);
    arrayOfByte1[2] = aesEnc(arrayOfByte1[2], RC[30]);
    arrayOfByte1[3] = aesEnc(arrayOfByte1[3], RC[31]);
    mix512(arrayOfByte1, arrayOfByte2);
    arrayOfByte1[0] = aesEnc(arrayOfByte2[0], RC[32]);
    arrayOfByte1[1] = aesEnc(arrayOfByte2[1], RC[33]);
    arrayOfByte1[2] = aesEnc(arrayOfByte2[2], RC[34]);
    arrayOfByte1[3] = aesEnc(arrayOfByte2[3], RC[35]);
    arrayOfByte1[0] = aesEnc(arrayOfByte1[0], RC[36]);
    arrayOfByte1[1] = aesEnc(arrayOfByte1[1], RC[37]);
    arrayOfByte1[2] = aesEnc(arrayOfByte1[2], RC[38]);
    arrayOfByte1[3] = aesEnc(arrayOfByte1[3], RC[39]);
    mix512(arrayOfByte1, arrayOfByte2);
    Bytes.xor(16, arrayOfByte2[0], 0, paramArrayOfbyte1, 0, arrayOfByte1[0], 0);
    Bytes.xor(16, arrayOfByte2[1], 0, paramArrayOfbyte1, 16, arrayOfByte1[1], 0);
    Bytes.xor(16, arrayOfByte2[2], 0, paramArrayOfbyte1, 32, arrayOfByte1[2], 0);
    Bytes.xor(16, arrayOfByte2[3], 0, paramArrayOfbyte1, 48, arrayOfByte1[3], 0);
    System.arraycopy(arrayOfByte1[0], 8, paramArrayOfbyte2, paramInt, 8);
    System.arraycopy(arrayOfByte1[1], 8, paramArrayOfbyte2, paramInt + 8, 8);
    System.arraycopy(arrayOfByte1[2], 0, paramArrayOfbyte2, paramInt + 16, 8);
    System.arraycopy(arrayOfByte1[3], 0, paramArrayOfbyte2, paramInt + 24, 8);
    return 32;
  }
  
  public String getAlgorithmName() {
    return "Haraka-512";
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
    if (this.off != 64)
      throw new IllegalStateException("input must be exactly 64 bytes"); 
    if (paramArrayOfbyte.length - paramInt < 32)
      throw new IllegalArgumentException("output too short to receive digest"); 
    int i = haraka512256(this.buffer, paramArrayOfbyte, paramInt);
    reset();
    return i;
  }
  
  public void reset() {
    this.off = 0;
    Arrays.clear(this.buffer);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\Haraka512Digest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */