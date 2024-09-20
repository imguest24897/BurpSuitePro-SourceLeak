package META-INF.versions.9.org.bouncycastle.pqc.crypto.cmce;

import org.bouncycastle.pqc.crypto.cmce.CMCEKeyParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEParameters;
import org.bouncycastle.util.Arrays;

public class CMCEPublicKeyParameters extends CMCEKeyParameters {
  private final byte[] publicKey;
  
  public byte[] getPublicKey() {
    return Arrays.clone(this.publicKey);
  }
  
  public byte[] getEncoded() {
    return getPublicKey();
  }
  
  public CMCEPublicKeyParameters(CMCEParameters paramCMCEParameters, byte[] paramArrayOfbyte) {
    super(false, paramCMCEParameters);
    this.publicKey = Arrays.clone(paramArrayOfbyte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\cmce\CMCEPublicKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */