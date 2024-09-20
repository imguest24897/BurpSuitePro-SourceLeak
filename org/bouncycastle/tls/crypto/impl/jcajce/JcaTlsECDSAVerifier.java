package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.PublicKey;

public class JcaTlsECDSAVerifier extends JcaTlsDSSVerifier {
  public JcaTlsECDSAVerifier(JcaTlsCrypto paramJcaTlsCrypto, PublicKey paramPublicKey) {
    super(paramJcaTlsCrypto, paramPublicKey, (short)3, "NoneWithECDSA");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsECDSAVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */