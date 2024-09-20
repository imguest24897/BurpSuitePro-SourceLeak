package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import org.bouncycastle.tls.TlsUtils;
import org.bouncycastle.tls.crypto.TlsHMAC;
import org.bouncycastle.tls.crypto.TlsHash;
import org.bouncycastle.util.Arrays;

class JcaSSL3HMAC implements TlsHMAC {
  private static final byte IPAD_BYTE = 54;
  
  private static final byte OPAD_BYTE = 92;
  
  private static final byte[] IPAD = genPad((byte)54, 48);
  
  private static final byte[] OPAD = genPad((byte)92, 48);
  
  private TlsHash digest;
  
  private final int digestSize;
  
  private final int internalBlockSize;
  
  private int padLength;
  
  private byte[] secret;
  
  JcaSSL3HMAC(TlsHash paramTlsHash, int paramInt1, int paramInt2) {
    this.digest = paramTlsHash;
    this.digestSize = paramInt1;
    this.internalBlockSize = paramInt2;
    if (paramInt1 == 20) {
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
    byte[] arrayOfByte1 = this.digest.calculateHash();
    this.digest.update(this.secret, 0, this.secret.length);
    this.digest.update(OPAD, 0, this.padLength);
    this.digest.update(arrayOfByte1, 0, arrayOfByte1.length);
    byte[] arrayOfByte2 = this.digest.calculateHash();
    reset();
    return arrayOfByte2;
  }
  
  public void calculateMAC(byte[] paramArrayOfbyte, int paramInt) {
    byte[] arrayOfByte = calculateMAC();
    System.arraycopy(arrayOfByte, 0, paramArrayOfbyte, paramInt, arrayOfByte.length);
  }
  
  public int getInternalBlockSize() {
    return this.internalBlockSize;
  }
  
  public int getMacLength() {
    return this.digestSize;
  }
  
  public void reset() {
    this.digest.reset();
    this.digest.update(this.secret, 0, this.secret.length);
    this.digest.update(IPAD, 0, this.padLength);
  }
  
  private static byte[] genPad(byte paramByte, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    Arrays.fill(arrayOfByte, paramByte);
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaSSL3HMAC.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */