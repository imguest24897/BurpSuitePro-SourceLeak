package META-INF.versions.9.org.bouncycastle.pqc.crypto.picnic;

import org.bouncycastle.pqc.crypto.picnic.PicnicKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicParameters;
import org.bouncycastle.util.Arrays;

public class PicnicPrivateKeyParameters extends PicnicKeyParameters {
  private final byte[] privateKey;
  
  public PicnicPrivateKeyParameters(PicnicParameters paramPicnicParameters, byte[] paramArrayOfbyte) {
    super(true, paramPicnicParameters);
    this.privateKey = Arrays.clone(paramArrayOfbyte);
  }
  
  public byte[] getEncoded() {
    return Arrays.clone(this.privateKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\picnic\PicnicPrivateKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */