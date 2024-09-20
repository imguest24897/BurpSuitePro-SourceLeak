package META-INF.versions.9.org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.LongDigest;
import org.bouncycastle.crypto.digests.Utils;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class SHA384Digest extends LongDigest {
  private static final int DIGEST_LENGTH = 48;
  
  public SHA384Digest() {
    this(CryptoServicePurpose.ANY);
  }
  
  public SHA384Digest(CryptoServicePurpose paramCryptoServicePurpose) {
    super(paramCryptoServicePurpose);
    CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
    reset();
  }
  
  public SHA384Digest(org.bouncycastle.crypto.digests.SHA384Digest paramSHA384Digest) {
    super(paramSHA384Digest);
    CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
  }
  
  public SHA384Digest(byte[] paramArrayOfbyte) {
    super(CryptoServicePurpose.values()[paramArrayOfbyte[paramArrayOfbyte.length - 1]]);
    restoreState(paramArrayOfbyte);
    CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
  }
  
  public String getAlgorithmName() {
    return "SHA-384";
  }
  
  public int getDigestSize() {
    return 48;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    finish();
    Pack.longToBigEndian(this.H1, paramArrayOfbyte, paramInt);
    Pack.longToBigEndian(this.H2, paramArrayOfbyte, paramInt + 8);
    Pack.longToBigEndian(this.H3, paramArrayOfbyte, paramInt + 16);
    Pack.longToBigEndian(this.H4, paramArrayOfbyte, paramInt + 24);
    Pack.longToBigEndian(this.H5, paramArrayOfbyte, paramInt + 32);
    Pack.longToBigEndian(this.H6, paramArrayOfbyte, paramInt + 40);
    reset();
    return 48;
  }
  
  public void reset() {
    super.reset();
    this.H1 = -3766243637369397544L;
    this.H2 = 7105036623409894663L;
    this.H3 = -7973340178411365097L;
    this.H4 = 1526699215303891257L;
    this.H5 = 7436329637833083697L;
    this.H6 = -8163818279084223215L;
    this.H7 = -2662702644619276377L;
    this.H8 = 5167115440072839076L;
  }
  
  public Memoable copy() {
    return (Memoable)new org.bouncycastle.crypto.digests.SHA384Digest(this);
  }
  
  public void reset(Memoable paramMemoable) {
    org.bouncycastle.crypto.digests.SHA384Digest sHA384Digest = (org.bouncycastle.crypto.digests.SHA384Digest)paramMemoable;
    copyIn(sHA384Digest);
  }
  
  public byte[] getEncodedState() {
    byte[] arrayOfByte = new byte[getEncodedStateSize() + 1];
    populateState(arrayOfByte);
    arrayOfByte[arrayOfByte.length - 1] = (byte)this.purpose.ordinal();
    return arrayOfByte;
  }
  
  protected CryptoServiceProperties cryptoServiceProperties() {
    return Utils.getDefaultProperties((Digest)this, 256, this.purpose);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\digests\SHA384Digest.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */