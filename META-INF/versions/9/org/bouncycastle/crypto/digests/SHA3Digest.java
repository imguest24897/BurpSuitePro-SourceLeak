package META-INF.versions.9.org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.digests.KeccakDigest;

public class SHA3Digest extends KeccakDigest {
  private static int checkBitLength(int paramInt) {
    switch (paramInt) {
      case 224:
      case 256:
      case 384:
      case 512:
        return paramInt;
    } 
    throw new IllegalArgumentException("'bitLength' " + paramInt + " not supported for SHA-3");
  }
  
  public SHA3Digest() {
    this(256, CryptoServicePurpose.ANY);
  }
  
  public SHA3Digest(CryptoServicePurpose paramCryptoServicePurpose) {
    this(256, paramCryptoServicePurpose);
  }
  
  public SHA3Digest(int paramInt) {
    super(checkBitLength(paramInt), CryptoServicePurpose.ANY);
  }
  
  public SHA3Digest(int paramInt, CryptoServicePurpose paramCryptoServicePurpose) {
    super(checkBitLength(paramInt), paramCryptoServicePurpose);
  }
  
  public SHA3Digest(org.bouncycastle.crypto.digests.SHA3Digest paramSHA3Digest) {
    super(paramSHA3Digest);
  }
  
  public String getAlgorithmName() {
    return "SHA3-" + this.fixedOutputLength;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    absorbBits(2, 2);
    return super.doFinal(paramArrayOfbyte, paramInt);
  }
  
  protected int doFinal(byte[] paramArrayOfbyte, int paramInt1, byte paramByte, int paramInt2) {
    if (paramInt2 < 0 || paramInt2 > 7)
      throw new IllegalArgumentException("'partialBits' must be in the range [0,7]"); 
    int i = paramByte & (1 << paramInt2) - 1 | 2 << paramInt2;
    int j = paramInt2 + 2;
    if (j >= 8) {
      absorb((byte)i);
      j -= 8;
      i >>>= 8;
    } 
    return super.doFinal(paramArrayOfbyte, paramInt1, (byte)i, j);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\digests\SHA3Digest.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */