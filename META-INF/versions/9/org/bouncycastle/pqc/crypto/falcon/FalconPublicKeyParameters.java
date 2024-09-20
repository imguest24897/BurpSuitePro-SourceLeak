package META-INF.versions.9.org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.pqc.crypto.falcon.FalconKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.util.Arrays;

public class FalconPublicKeyParameters extends FalconKeyParameters {
  private byte[] H;
  
  public FalconPublicKeyParameters(FalconParameters paramFalconParameters, byte[] paramArrayOfbyte) {
    super(false, paramFalconParameters);
    this.H = Arrays.clone(paramArrayOfbyte);
  }
  
  public byte[] getH() {
    return Arrays.clone(this.H);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\falcon\FalconPublicKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */