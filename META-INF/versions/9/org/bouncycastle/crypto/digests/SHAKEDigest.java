package META-INF.versions.9.org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.KeccakDigest;
import org.bouncycastle.crypto.digests.Utils;

public class SHAKEDigest extends KeccakDigest implements Xof {
  private static int checkBitLength(int paramInt) {
    switch (paramInt) {
      case 128:
      case 256:
        return paramInt;
    } 
    throw new IllegalArgumentException("'bitStrength' " + paramInt + " not supported for SHAKE");
  }
  
  public SHAKEDigest() {
    this(128);
  }
  
  public SHAKEDigest(CryptoServicePurpose paramCryptoServicePurpose) {
    this(128, paramCryptoServicePurpose);
  }
  
  public SHAKEDigest(int paramInt) {
    super(checkBitLength(paramInt), CryptoServicePurpose.ANY);
  }
  
  public SHAKEDigest(int paramInt, CryptoServicePurpose paramCryptoServicePurpose) {
    super(checkBitLength(paramInt), paramCryptoServicePurpose);
  }
  
  public SHAKEDigest(org.bouncycastle.crypto.digests.SHAKEDigest paramSHAKEDigest) {
    super(paramSHAKEDigest);
  }
  
  public String getAlgorithmName() {
    return "SHAKE" + this.fixedOutputLength;
  }
  
  public int getDigestSize() {
    return this.fixedOutputLength / 4;
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt) {
    return doFinal(paramArrayOfbyte, paramInt, getDigestSize());
  }
  
  public int doFinal(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = doOutput(paramArrayOfbyte, paramInt1, paramInt2);
    reset();
    return i;
  }
  
  public int doOutput(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (!this.squeezing)
      absorbBits(15, 4); 
    squeeze(paramArrayOfbyte, paramInt1, paramInt2 * 8L);
    return paramInt2;
  }
  
  protected int doFinal(byte[] paramArrayOfbyte, int paramInt1, byte paramByte, int paramInt2) {
    return doFinal(paramArrayOfbyte, paramInt1, getDigestSize(), paramByte, paramInt2);
  }
  
  protected int doFinal(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, byte paramByte, int paramInt3) {
    if (paramInt3 < 0 || paramInt3 > 7)
      throw new IllegalArgumentException("'partialBits' must be in the range [0,7]"); 
    int i = paramByte & (1 << paramInt3) - 1 | 15 << paramInt3;
    int j = paramInt3 + 4;
    if (j >= 8) {
      absorb((byte)i);
      j -= 8;
      i >>>= 8;
    } 
    if (j > 0)
      absorbBits(i, j); 
    squeeze(paramArrayOfbyte, paramInt1, paramInt2 * 8L);
    reset();
    return paramInt2;
  }
  
  protected CryptoServiceProperties cryptoServiceProperties() {
    return Utils.getDefaultProperties((Digest)this, this.purpose);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\crypto\digests\SHAKEDigest.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */