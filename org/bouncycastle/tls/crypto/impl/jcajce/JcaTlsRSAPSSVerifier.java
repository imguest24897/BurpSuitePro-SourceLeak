package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.tls.DigitallySigned;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;
import org.bouncycastle.tls.crypto.TlsVerifier;

public class JcaTlsRSAPSSVerifier implements TlsVerifier {
  private final JcaTlsCrypto crypto;
  
  private final PublicKey publicKey;
  
  private final int signatureScheme;
  
  public JcaTlsRSAPSSVerifier(JcaTlsCrypto paramJcaTlsCrypto, PublicKey paramPublicKey, int paramInt) {
    if (null == paramJcaTlsCrypto)
      throw new NullPointerException("crypto"); 
    if (null == paramPublicKey)
      throw new NullPointerException("publicKey"); 
    if (!SignatureScheme.isRSAPSS(paramInt))
      throw new IllegalArgumentException("signatureScheme"); 
    this.crypto = paramJcaTlsCrypto;
    this.publicKey = paramPublicKey;
    this.signatureScheme = paramInt;
  }
  
  public boolean verifyRawSignature(DigitallySigned paramDigitallySigned, byte[] paramArrayOfbyte) throws IOException {
    throw new UnsupportedOperationException();
  }
  
  public TlsStreamVerifier getStreamVerifier(DigitallySigned paramDigitallySigned) throws IOException {
    SignatureAndHashAlgorithm signatureAndHashAlgorithm = paramDigitallySigned.getAlgorithm();
    if (signatureAndHashAlgorithm == null || SignatureScheme.from(signatureAndHashAlgorithm) != this.signatureScheme)
      throw new IllegalStateException("Invalid algorithm: " + signatureAndHashAlgorithm); 
    int i = SignatureScheme.getCryptoHashAlgorithm(this.signatureScheme);
    String str1 = this.crypto.getDigestName(i);
    String str2 = RSAUtil.getDigestSigAlgName(str1) + "WITHRSAANDMGF1";
    AlgorithmParameterSpec algorithmParameterSpec = RSAUtil.getPSSParameterSpec(i, str1, this.crypto.getHelper());
    return this.crypto.createStreamVerifier(str2, algorithmParameterSpec, paramDigitallySigned.getSignature(), this.publicKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsRSAPSSVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */