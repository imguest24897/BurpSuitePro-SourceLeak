package META-INF.versions.9.org.bouncycastle.pqc.crypto.ntruprime;

import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters;
import org.bouncycastle.util.Arrays;

public class SNTRUPrimePublicKeyParameters extends SNTRUPrimeKeyParameters {
  private final byte[] encH;
  
  public SNTRUPrimePublicKeyParameters(SNTRUPrimeParameters paramSNTRUPrimeParameters, byte[] paramArrayOfbyte) {
    super(false, paramSNTRUPrimeParameters);
    this.encH = Arrays.clone(paramArrayOfbyte);
  }
  
  byte[] getEncH() {
    return this.encH;
  }
  
  public byte[] getEncoded() {
    return Arrays.clone(this.encH);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\crypto\ntruprime\SNTRUPrimePublicKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */