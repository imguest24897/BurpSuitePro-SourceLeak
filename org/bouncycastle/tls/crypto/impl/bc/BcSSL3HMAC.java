package org.bouncycastle.tls.crypto.impl.bc;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.util.Arrays;

class BcSSL3HMAC implements TlsHMAC {
  private static final byte IPAD_BYTE = 54;
  
  private static final byte OPAD_BYTE = 92;
  
  private static final byte[] IPAD = genPad((byte)54, 48);
  
  private static final byte[] OPAD = genPad((byte)92, 48);
  
  private Digest digest;
  
  private int padLength;
  
  private byte[] secret;
  
  BcSSL3HMAC(Digest paramDigest) {
    this.digest = paramDigest;
    if (paramDigest.getDigestSize() == 20) {
      this.padLength = 40;
    } else {
      this.padLength = 48;
    } 
  }
  
  public void setKey(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.secret = TlsUtils.copyOfRangeExact(paramArrayOfbyte, paramInt1, paramInt1 + paramInt2);
    reset();
  }
  
  public void update(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.digest.update(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public byte[] calculateMAC() {
    byte[] arrayOfByte = new byte[this.digest.getDigestSize()];
    doFinal(arrayOfByte, 0);
    return arrayOfByte;
  }
  
  public void calculateMAC(byte[] paramArrayOfbyte, int paramInt) {
    doFinal(paramArrayOfbyte, paramInt);
  }
  
  public int getInternalBlockSize() {
    return ((ExtendedDigest)this.digest).getByteLength();
  }
  
  public int getMacLength() {
    return this.digest.getDigestSize();
  }
  
  public void reset() {
    this.digest.reset();
    this.digest.update(this.secret, 0, this.secret.length);
    this.digest.update(IPAD, 0, this.padLength);
  }
  
  private void doFinal(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = new byte[this.digest.getDigestSize()];
    this.digest.doFinal(arrayOfByte, 0);
    this.digest.update(this.secret, 0, this.secret.length);
    this.digest.update(OPAD, 0, this.padLength);
    this.digest.update(arrayOfByte, 0, arrayOfByte.length);
    this.digest.doFinal(paramArrayOfbyte, paramInt);
    reset();
  }
  
  private static byte[] genPad(byte paramByte, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    Arrays.fill(arrayOfByte, paramByte);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcSSL3HMAC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */