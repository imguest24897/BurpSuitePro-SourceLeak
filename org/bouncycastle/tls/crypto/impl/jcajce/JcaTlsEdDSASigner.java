package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.PrivateKey;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.crypto.TlsSigner;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

public abstract class JcaTlsEdDSASigner implements TlsSigner {
  protected final JcaTlsCrypto crypto;
  
  protected final PrivateKey privateKey;
  
  protected final short algorithmType;
  
  protected final String algorithmName;
  
  public JcaTlsEdDSASigner(JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey, short paramShort, String paramString) {
    if (null == paramJcaTlsCrypto)
      throw new NullPointerException("crypto"); 
    if (null == paramPrivateKey)
      throw new NullPointerException("privateKey"); 
    this.crypto = paramJcaTlsCrypto;
    this.privateKey = paramPrivateKey;
    this.algorithmType = paramShort;
    this.algorithmName = paramString;
  }
  
  public byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException {
    throw new UnsupportedOperationException();
  }
  
  public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) throws IOException {
    if (paramSignatureAndHashAlgorithm == null || paramSignatureAndHashAlgorithm.getSignature() != this.algorithmType || paramSignatureAndHashAlgorithm.getHash() != 8)
      throw new IllegalStateException("Invalid algorithm: " + paramSignatureAndHashAlgorithm); 
    return this.crypto.createStreamSigner(this.algorithmName, null, this.privateKey, false);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsEdDSASigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */