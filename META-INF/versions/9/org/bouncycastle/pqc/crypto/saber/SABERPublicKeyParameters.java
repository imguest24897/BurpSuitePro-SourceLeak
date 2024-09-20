package META-INF.versions.9.org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.pqc.crypto.saber.SABERKeyParameters;
import org.bouncycastle.pqc.crypto.saber.SABERParameters;
import org.bouncycastle.util.Arrays;

public class SABERPublicKeyParameters extends SABERKeyParameters {
  private final byte[] publicKey;
  
  public SABERPublicKeyParameters(SABERParameters paramSABERParameters, byte[] paramArrayOfbyte) {
    super(false, paramSABERParameters);
    this.publicKey = Arrays.clone(paramArrayOfbyte);
  }
  
  public byte[] getPublicKey() {
    return Arrays.clone(this.publicKey);
  }
  
  public byte[] getEncoded() {
    return getPublicKey();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\saber\SABERPublicKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */