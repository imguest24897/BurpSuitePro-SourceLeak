package org.bouncycastle.tls.crypto.impl.jcajce;

import java.security.PrivateKey;

public class JcaTlsECDSASigner extends JcaTlsDSSSigner {
  public JcaTlsECDSASigner(JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey) {
    super(paramJcaTlsCrypto, paramPrivateKey, (short)3, "NoneWithECDSA");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsECDSASigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */