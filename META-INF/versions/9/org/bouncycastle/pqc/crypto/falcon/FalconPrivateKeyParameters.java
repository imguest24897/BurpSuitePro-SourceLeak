package META-INF.versions.9.org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.pqc.crypto.falcon.FalconKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.util.Arrays;

public class FalconPrivateKeyParameters extends FalconKeyParameters {
  private final byte[] pk;
  
  private final byte[] f;
  
  private final byte[] g;
  
  private final byte[] F;
  
  public FalconPrivateKeyParameters(FalconParameters paramFalconParameters, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, byte[] paramArrayOfbyte3, byte[] paramArrayOfbyte4) {
    super(true, paramFalconParameters);
    this.f = Arrays.clone(paramArrayOfbyte1);
    this.g = Arrays.clone(paramArrayOfbyte2);
    this.F = Arrays.clone(paramArrayOfbyte3);
    this.pk = Arrays.clone(paramArrayOfbyte4);
  }
  
  public byte[] getEncoded() {
    return Arrays.concatenate(this.f, this.g, this.F);
  }
  
  public byte[] getPublicKey() {
    return Arrays.clone(this.pk);
  }
  
  public byte[] getSpolyf() {
    return Arrays.clone(this.f);
  }
  
  public byte[] getG() {
    return Arrays.clone(this.g);
  }
  
  public byte[] getSpolyF() {
    return Arrays.clone(this.F);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\falcon\FalconPrivateKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */