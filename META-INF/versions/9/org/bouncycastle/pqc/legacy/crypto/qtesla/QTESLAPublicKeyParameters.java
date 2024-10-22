package META-INF.versions.9.org.bouncycastle.pqc.legacy.crypto.qtesla;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLASecurityCategory;
import org.bouncycastle.util.Arrays;

public final class QTESLAPublicKeyParameters extends AsymmetricKeyParameter {
  private int securityCategory;
  
  private byte[] publicKey;
  
  public QTESLAPublicKeyParameters(int paramInt, byte[] paramArrayOfbyte) {
    super(false);
    if (paramArrayOfbyte.length != QTESLASecurityCategory.getPublicSize(paramInt))
      throw new IllegalArgumentException("invalid key size for security category"); 
    this.securityCategory = paramInt;
    this.publicKey = Arrays.clone(paramArrayOfbyte);
  }
  
  public int getSecurityCategory() {
    return this.securityCategory;
  }
  
  public byte[] getPublicData() {
    return Arrays.clone(this.publicKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\pqc\legacy\crypto\qtesla\QTESLAPublicKeyParameters.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */