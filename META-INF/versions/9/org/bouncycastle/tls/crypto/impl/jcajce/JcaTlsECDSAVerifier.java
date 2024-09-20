package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.PublicKey;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsDSSVerifier;

public class JcaTlsECDSAVerifier extends JcaTlsDSSVerifier {
  public JcaTlsECDSAVerifier(JcaTlsCrypto paramJcaTlsCrypto, PublicKey paramPublicKey) {
    super(paramJcaTlsCrypto, paramPublicKey, (short)3, "NoneWithECDSA");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsECDSAVerifier.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */