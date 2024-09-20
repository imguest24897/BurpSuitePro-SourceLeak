package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Signature;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsSigner;
import org.bouncycastle.tls.crypto.TlsStreamSigner;
import org.bouncycastle.tls.crypto.impl.jcajce.JcaTlsCrypto;

public class JcaTlsECDSA13Signer implements TlsSigner {
  private final JcaTlsCrypto crypto;
  
  private final PrivateKey privateKey;
  
  private final int signatureScheme;
  
  public JcaTlsECDSA13Signer(JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey, int paramInt) {
    if (null == paramJcaTlsCrypto)
      throw new NullPointerException("crypto"); 
    if (null == paramPrivateKey)
      throw new NullPointerException("privateKey"); 
    if (!SignatureScheme.isECDSA(paramInt))
      throw new IllegalArgumentException("signatureScheme"); 
    this.crypto = paramJcaTlsCrypto;
    this.privateKey = paramPrivateKey;
    this.signatureScheme = paramInt;
  }
  
  public byte[] generateRawSignature(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm, byte[] paramArrayOfbyte) throws IOException {
    if (paramSignatureAndHashAlgorithm == null || SignatureScheme.from(paramSignatureAndHashAlgorithm) != this.signatureScheme)
      throw new IllegalStateException("Invalid algorithm: " + paramSignatureAndHashAlgorithm); 
    try {
      Signature signature = this.crypto.getHelper().createSignature("NoneWithECDSA");
      signature.initSign(this.privateKey, this.crypto.getSecureRandom());
      signature.update(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      return signature.sign();
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsFatalAlert((short)80, generalSecurityException);
    } 
  }
  
  public TlsStreamSigner getStreamSigner(SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) throws IOException {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsECDSA13Signer.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */