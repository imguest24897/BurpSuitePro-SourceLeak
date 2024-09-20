package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.DefaultTlsCredentialedSigner;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsSigner;

public class JcaDefaultTlsCredentialedSigner extends DefaultTlsCredentialedSigner {
  private static JcaTlsCertificate getEndEntity(JcaTlsCrypto paramJcaTlsCrypto, Certificate paramCertificate) throws IOException {
    if (paramCertificate == null || paramCertificate.isEmpty())
      throw new IllegalArgumentException("No certificate"); 
    return JcaTlsCertificate.convert(paramJcaTlsCrypto, paramCertificate.getCertificateAt(0));
  }
  
  private static TlsSigner makeSigner(JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey, Certificate paramCertificate, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    JcaTlsEd448Signer jcaTlsEd448Signer;
    String str = paramPrivateKey.getAlgorithm();
    if (paramPrivateKey instanceof java.security.interfaces.RSAPrivateKey || "RSA".equalsIgnoreCase(str) || "RSASSA-PSS".equalsIgnoreCase(str)) {
      PublicKey publicKey;
      if (paramSignatureAndHashAlgorithm != null) {
        int i = SignatureScheme.from(paramSignatureAndHashAlgorithm);
        if (SignatureScheme.isRSAPSS(i))
          return new JcaTlsRSAPSSSigner(paramJcaTlsCrypto, paramPrivateKey, i); 
      } 
      try {
        publicKey = getEndEntity(paramJcaTlsCrypto, paramCertificate).getPubKeyRSA();
      } catch (Exception exception) {
        throw new RuntimeException(exception);
      } 
      JcaTlsRSASigner jcaTlsRSASigner = new JcaTlsRSASigner(paramJcaTlsCrypto, paramPrivateKey, publicKey);
    } else if (paramPrivateKey instanceof java.security.interfaces.DSAPrivateKey || "DSA".equalsIgnoreCase(str)) {
      JcaTlsDSASigner jcaTlsDSASigner = new JcaTlsDSASigner(paramJcaTlsCrypto, paramPrivateKey);
    } else if (ECUtil.isECPrivateKey(paramPrivateKey)) {
      if (paramSignatureAndHashAlgorithm != null) {
        int i = SignatureScheme.from(paramSignatureAndHashAlgorithm);
        if (SignatureScheme.isECDSA(i))
          return new JcaTlsECDSA13Signer(paramJcaTlsCrypto, paramPrivateKey, i); 
      } 
      JcaTlsECDSASigner jcaTlsECDSASigner = new JcaTlsECDSASigner(paramJcaTlsCrypto, paramPrivateKey);
    } else if ("Ed25519".equalsIgnoreCase(str)) {
      JcaTlsEd25519Signer jcaTlsEd25519Signer = new JcaTlsEd25519Signer(paramJcaTlsCrypto, paramPrivateKey);
    } else if ("Ed448".equalsIgnoreCase(str)) {
      jcaTlsEd448Signer = new JcaTlsEd448Signer(paramJcaTlsCrypto, paramPrivateKey);
    } else {
      throw new IllegalArgumentException("'privateKey' type not supported: " + paramPrivateKey.getClass().getName());
    } 
    return jcaTlsEd448Signer;
  }
  
  public JcaDefaultTlsCredentialedSigner(TlsCryptoParameters paramTlsCryptoParameters, JcaTlsCrypto paramJcaTlsCrypto, PrivateKey paramPrivateKey, Certificate paramCertificate, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    super(paramTlsCryptoParameters, makeSigner(paramJcaTlsCrypto, paramPrivateKey, paramCertificate, paramSignatureAndHashAlgorithm), paramCertificate, paramSignatureAndHashAlgorithm);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaDefaultTlsCredentialedSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */