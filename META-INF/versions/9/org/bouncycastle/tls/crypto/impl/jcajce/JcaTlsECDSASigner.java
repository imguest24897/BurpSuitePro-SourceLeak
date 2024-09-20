package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.PrivateKey;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsDSSSigner;

public class JcaTlsECDSASigner extends JcaTlsDSSSigner {
  public JcaTlsECDSASigner(JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey) {
    super(paramJcaTlsCrypto, paramPrivateKey, (short)3, "NoneWithECDSA");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsECDSASigner.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */