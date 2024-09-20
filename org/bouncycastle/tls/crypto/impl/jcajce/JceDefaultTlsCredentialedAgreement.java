package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.TlsCredentialedAgreement;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsCryptoException;
import org.bouncycastle.tls.crypto.TlsSecret;

public class JceDefaultTlsCredentialedAgreement implements TlsCredentialedAgreement {
  private final JcaTlsCrypto crypto;
  
  private final Certificate certificate;
  
  private final PrivateKey privateKey;
  
  private final String agreementAlgorithm;
  
  public static String getAgreementAlgorithm(PrivateKey paramPrivateKey) {
    if (paramPrivateKey instanceof javax.crypto.interfaces.DHPrivateKey)
      return "DH"; 
    if (ECUtil.isECPrivateKey(paramPrivateKey))
      return "ECDH"; 
    throw new IllegalArgumentException("'privateKey' type not supported: " + paramPrivateKey.getClass().getName());
  }
  
  public JceDefaultTlsCredentialedAgreement(JcaTlsCrypto paramJcaTlsCrypto, Certificate paramCertificate, PrivateKey paramPrivateKey) {
    if (paramJcaTlsCrypto == null)
      throw new IllegalArgumentException("'crypto' cannot be null"); 
    if (paramCertificate == null)
      throw new IllegalArgumentException("'certificate' cannot be null"); 
    if (paramCertificate.isEmpty())
      throw new IllegalArgumentException("'certificate' cannot be empty"); 
    if (paramPrivateKey == null)
      throw new IllegalArgumentException("'privateKey' cannot be null"); 
    this.crypto = paramJcaTlsCrypto;
    this.certificate = paramCertificate;
    this.privateKey = paramPrivateKey;
    this.agreementAlgorithm = getAgreementAlgorithm(paramPrivateKey);
  }
  
  public Certificate getCertificate() {
    return this.certificate;
  }
  
  public TlsSecret generateAgreement(TlsCertificate paramTlsCertificate) throws IOException {
    try {
      PublicKey publicKey = JcaTlsCertificate.convert(this.crypto, paramTlsCertificate).getPublicKey();
      byte[] arrayOfByte = this.crypto.calculateKeyAgreement(this.agreementAlgorithm, this.privateKey, publicKey, "TlsPremasterSecret");
      return (TlsSecret)this.crypto.adoptLocalSecret(arrayOfByte);
    } catch (GeneralSecurityException generalSecurityException) {
      throw new TlsCryptoException("unable to perform agreement", generalSecurityException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JceDefaultTlsCredentialedAgreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */