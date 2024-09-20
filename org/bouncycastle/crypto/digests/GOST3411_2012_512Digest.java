package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.util.Memoable;

public class GOST3411_2012_512Digest extends GOST3411_2012Digest {
  private static final byte[] IV = new byte[] { 
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 0 };
  
  public GOST3411_2012_512Digest(CryptoServicePurpose paramCryptoServicePurpose) {
    super(IV, paramCryptoServicePurpose);
  }
  
  public GOST3411_2012_512Digest() {
    super(IV, CryptoServicePurpose.ANY);
  }
  
  public GOST3411_2012_512Digest(GOST3411_2012_512Digest paramGOST3411_2012_512Digest) {
    super(IV, paramGOST3411_2012_512Digest.purpose);
    reset(paramGOST3411_2012_512Digest);
  }
  
  public String getAlgorithmName() {
    return "GOST3411-2012-512";
  }
  
  public int getDigestSize() {
    return 64;
  }
  
  public Memoable copy() {
    return new GOST3411_2012_512Digest(this);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\crypto\digests\GOST3411_2012_512Digest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */