package META-INF.versions.9.org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.crypto.ntru.NTRUKeyParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.util.Arrays;

public class NTRUPrivateKeyParameters extends NTRUKeyParameters {
  final byte[] privateKey;
  
  public NTRUPrivateKeyParameters(NTRUParameters paramNTRUParameters, byte[] paramArrayOfbyte) {
    super(true, paramNTRUParameters);
    this.privateKey = Arrays.clone(paramArrayOfbyte);
  }
  
  public byte[] getPrivateKey() {
    return Arrays.clone(this.privateKey);
  }
  
  public byte[] getEncoded() {
    return getPrivateKey();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\ntru\NTRUPrivateKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */