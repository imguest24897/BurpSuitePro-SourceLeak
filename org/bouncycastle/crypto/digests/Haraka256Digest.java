package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

public class Haraka256Digest extends HarakaBase {
  private final byte[] buffer;
  
  private int off;
  
  private final CryptoServicePurpose purpose;
  
  private void mix256(byte[][] paramArrayOfbyte1, byte[][] paramArrayOfbyte2) {
    System.arraycopy(paramArrayOfbyte1[0], 0, paramArrayOfbyte2[0], 0, 4);
    System.arraycopy(paramArrayOfbyte1[1], 0, paramArrayOfbyte2[0], 4, 4);
    System.arraycopy(paramArrayOfbyte1[0], 4, paramArrayOfbyte2[0], 8, 4);
    System.arraycopy(paramArrayOfbyte1[1], 4, paramArrayOfbyte2[0], 12, 4);
    System.arraycopy(paramArrayOfbyte1[0], 8, paramArrayOfbyte2[1], 0, 4);
    System.arraycopy(paramArrayOfbyte1[1], 8, paramArrayOfbyte2[1], 4, 4);
    System.arraycopy(paramArrayOfbyte1[0], 12, paramArrayOfbyte2[1], 8, 4);
    System.arraycopy(paramArrayOfbyte1[1], 12, paramArrayOfbyte2[1], 12, 4);
  }
  
  private int haraka256256(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt) {
    byte[][] arrayOfByte1 = new byte[2][16];
    byte[][] arrayOfByte2 = new byte[2][16];
    System.arraycopy(paramArrayOfbyte1, 0, arrayOfByte1[0], 0, 16);
    System.arraycopy(paramArrayOfbyte1, 16, arrayOfByte1[1], 0, 16);
    arrayOfByte1[0] = aesEnc(arrayOfByte1[0], RC[0]);
    arrayOfByte1[1] = aesEnc(arrayOfByte1[1], RC[1]);
    arrayOfByte1[0] = aesEnc(arrayOfByte1[0], RC[2]);
    arrayOfByte1[1] = aesEnc(arrayOfByte1[1], RC[3]);
    mix256(arrayOfByte1, arrayOfByte2);
    arrayOfByte1[0] = aesEnc(arrayOfByte2[0], RC[4]);
    arrayOfByte1[1] = aesEnc(arrayOfByte2[1], RC[5]);
    arrayOfByte1[0] = aesEnc(arrayOfByte1[0], RC[6]);
    arrayOfByte1[1] = aesEnc(arrayOfByte1[1], RC[7]);
    mix256(arrayOfByte1, arrayOfByte2);
    arrayOfByte1[0] = aesEnc(arrayOfByte2[0], RC[8]);
    arrayOfByte1[1] = aesEnc(arrayOfByte2[1], RC[9]);
    arrayOfByte1[0] = aesEnc(arrayOfByte1[0], RC[10]);
    arrayOfByte1[1] = aesEnc(arrayOfByte1[1], RC[11]);
    mix256(arrayOfByte1, arrayOfByte2);
    arrayOfByte1[0] = aesEnc(arrayOfByte2[0], RC[12]);
    arrayOfByte1[1] = aesEnc(arrayOfByte2[1], RC[13]);
    arrayOfByte1[0] = aesEnc(arrayOfByte1[0], RC[14]);
    arrayOfByte1[1] = aesEnc(arrayOfByte1[1], RC[15]);
    mix256(arrayOfByte1, arrayOfByte2);
    arrayOfByte1[0] = aesEnc(arrayOfByte2[0], RC[16]);
    arrayOfByte1[1] = aesEnc(arrayOfByte2[1], RC[17]);
    arrayOfByte1[0] = aesEnc(arrayOfByte1[0], RC[18]);
    arrayOfByte1[1] = aesEnc(arrayOfByte1[1], RC[19]);
    mix256(arrayOfByte1, arrayOfByte2);
    Bytes.xor(16, arrayOfByte2[0], 0, paramArrayOfbyte1, 0, paramArrayOfbyte2, paramInt);
    Bytes.xor(16, arrayOfByte2[1], 0, paramArrayOfbyte1, 16, paramArrayOfbyte2, paramInt + 16);
    return 32;
  }
  
  public Haraka256Digest() {
    this(CryptoServicePurpose.ANY);
  }
  
  public Haraka256Digest(CryptoServicePurpose paramCryptoServicePurpose) {
    this.purpose = paramCryptoServicePurpose;
    this.buffer = new byte[32];
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize() * 4, paramCryptoServicePurpose));
  }
  
  public Haraka256Digest(Haraka256Digest paramHaraka256Digest) {
    this.purpose = paramHaraka256Digest.purpose;
    this.buffer = Arrays.clone(paramHaraka256Digest.buffer);
    this.off = paramHaraka256Digest.off;
    CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, getDigestSize() * 4, this.purpose));
  }
  
  public String getAlgorithmName() {
    return "Haraka-256";
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
    if (this.off != 32)
      throw new IllegalStateException("input must be exactly 32 bytes"); 
    if (paramArrayOfbyte.length - paramInt < 32)
      throw new IllegalArgumentException("output too short to receive digest"); 
    int i = haraka256256(this.buffer, paramArrayOfbyte, paramInt);
    reset();
    return i;
  }
  
  public void reset() {
    this.off = 0;
    Arrays.clear(this.buffer);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\Haraka256Digest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */