package META-INF.versions.9.org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.pqc.crypto.frodo.FrodoKeyParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoParameters;
import org.bouncycastle.util.Arrays;

public class FrodoPrivateKeyParameters extends FrodoKeyParameters {
  private byte[] privateKey;
  
  public byte[] getPrivateKey() {
    return Arrays.clone(this.privateKey);
  }
  
  public FrodoPrivateKeyParameters(FrodoParameters paramFrodoParameters, byte[] paramArrayOfbyte) {
    super(true, paramFrodoParameters);
    this.privateKey = Arrays.clone(paramArrayOfbyte);
  }
  
  public byte[] getEncoded() {
    return Arrays.clone(this.privateKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\frodo\FrodoPrivateKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */