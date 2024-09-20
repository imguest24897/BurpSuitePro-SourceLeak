package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.tls.HashAlgorithm;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

public class JcaTlsDSASigner extends JcaTlsDSSSigner {
  public JcaTlsDSASigner(JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey) {
    super(paramJcaTlsCrypto, paramPrivateKey, (short)2, "NoneWithDSA");
  }
  
  public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) throws IOException {
    return (null != paramSignatureAndHashAlgorithm && this.algorithmType == paramSignatureAndHashAlgorithm.getSignature() && HashAlgorithm.getOutputSize(paramSignatureAndHashAlgorithm.getHash()) != 20) ? this.crypto.createStreamSigner(paramSignatureAndHashAlgorithm, this.privateKey, true) : null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsDSASigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */