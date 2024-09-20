package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.crypto.TlsSigner;
import org.bouncycastle.tls.crypto.TlsStreamSigner;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;
import org.bouncycastle.tls.crypto.impl.jcajce.RSAUtil;

public class JcaTlsRSAPSSSigner implements TlsSigner {
  private final JcaTlsCrypto crypto;
  
  private final PrivateKey privateKey;
  
  private final int signatureScheme;
  
  public JcaTlsRSAPSSSigner(JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey, int paramInt) {
    if (null == paramJcaTlsCrypto)
      throw new NullPointerException("crypto"); 
    if (null == paramPrivateKey)
      throw new NullPointerException("privateKey"); 
    if (!SignatureScheme.isRSAPSS(paramInt))
      throw new IllegalArgumentException("signatureScheme"); 
    this.crypto = paramJcaTlsCrypto;
    this.privateKey = paramPrivateKey;
    this.signatureScheme = paramInt;
  }
  
  public byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException {
    throw new UnsupportedOperationException();
  }
  
  public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) throws IOException {
    if (paramSignatureAndHashAlgorithm == null || SignatureScheme.from(paramSignatureAndHashAlgorithm) != this.signatureScheme)
      throw new IllegalStateException("Invalid algorithm: " + paramSignatureAndHashAlgorithm); 
    int i = SignatureScheme.getCryptoHashAlgorithm(this.signatureScheme);
    String str1 = this.crypto.getDigestName(i);
    String str2 = RSAUtil.getDigestSigAlgName(str1) + "WITHRSAANDMGF1";
    AlgorithmParameterSpec algorithmParameterSpec = RSAUtil.getPSSParameterSpec(i, str1, this.crypto.getHelper());
    return this.crypto.createStreamSigner(str2, algorithmParameterSpec, this.privateKey, true);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsRSAPSSSigner.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */