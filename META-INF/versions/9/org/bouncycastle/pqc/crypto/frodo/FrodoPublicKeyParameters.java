package META-INF.versions.9.org.bouncycastle.pqc.crypto.frodo;

import org.bouncycastle.pqc.crypto.frodo.FrodoKeyParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoParameters;
import org.bouncycastle.util.Arrays;

public class FrodoPublicKeyParameters extends FrodoKeyParameters {
  public byte[] publicKey;
  
  public byte[] getPublicKey() {
    return Arrays.clone(this.publicKey);
  }
  
  public byte[] getEncoded() {
    return getPublicKey();
  }
  
  public FrodoPublicKeyParameters(FrodoParameters paramFrodoParameters, byte[] paramArrayOfbyte) {
    super(false, paramFrodoParameters);
    this.publicKey = Arrays.clone(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\frodo\FrodoPublicKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */