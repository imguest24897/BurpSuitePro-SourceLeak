package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.HashAlgorithm;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsDSSVerifier;

public class JcaTlsDSAVerifier extends JcaTlsDSSVerifier {
  public JcaTlsDSAVerifier(JcaTlsCrypto paramJcaTlsCrypto, PublicKey paramPublicKey) {
    super(paramJcaTlsCrypto, paramPublicKey, (short)2, "NoneWithDSA");
  }
  
  public TlsStreamVerifier getStreamVerifier(DigitallySigned paramDigitallySigned) throws IOException {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramDigitallySigned.getAlgorithm();
    return (null != signatureAndHashAlgorithm && this.algorithmType == signatureAndHashAlgorithm.getSignature() && HashAlgorithm.getOutputSize(signatureAndHashAlgorithm.getHash()) != 20) ? this.crypto.createStreamVerifier(paramDigitallySigned, this.publicKey) : null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsDSAVerifier.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */