package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.PrivateKey;

public class JcaTlsEd448Signer extends JcaTlsEdDSASigner {
  public JcaTlsEd448Signer(JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey) {
    super(paramJcaTlsCrypto, paramPrivateKey, (short)8, "Ed448");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsEd448Signer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */