package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.PrivateKey;

public class JcaTlsEd25519Signer extends JcaTlsEdDSASigner {
  public JcaTlsEd25519Signer(JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey) {
    super(paramJcaTlsCrypto, paramPrivateKey, (short)7, "Ed25519");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsEd25519Signer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */