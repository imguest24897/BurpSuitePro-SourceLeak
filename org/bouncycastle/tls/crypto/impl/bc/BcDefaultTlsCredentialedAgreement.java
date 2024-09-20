package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.TlsCredentialedAgreement;
import org.bouncycastle.tls.crypto.TlsCertificate;
import org.bouncycastle.tls.crypto.TlsSecret;

public class BcDefaultTlsCredentialedAgreement implements TlsCredentialedAgreement {
  protected TlsCredentialedAgreement agreementCredentials;
  
  public BcDefaultTlsCredentialedAgreement(BcTlsCrypto paramBcTlsCrypto, Certificate paramCertificate, AsymmetricKeyParameter paramAsymmetricKeyParameter) {
    if (paramBcTlsCrypto == null)
      throw new IllegalArgumentException("'crypto' cannot be null"); 
    if (paramCertificate == null)
      throw new IllegalArgumentException("'certificate' cannot be null"); 
    if (paramCertificate.isEmpty())
      throw new IllegalArgumentException("'certificate' cannot be empty"); 
    if (paramAsymmetricKeyParameter == null)
      throw new IllegalArgumentException("'privateKey' cannot be null"); 
    if (!paramAsymmetricKeyParameter.isPrivate())
      throw new IllegalArgumentException("'privateKey' must be private"); 
    if (paramAsymmetricKeyParameter instanceof DHPrivateKeyParameters) {
      this.agreementCredentials = new DHCredentialedAgreement(paramBcTlsCrypto, paramCertificate, (DHPrivateKeyParameters)paramAsymmetricKeyParameter);
    } else if (paramAsymmetricKeyParameter instanceof ECPrivateKeyParameters) {
      this.agreementCredentials = new ECCredentialedAgreement(paramBcTlsCrypto, paramCertificate, (ECPrivateKeyParameters)paramAsymmetricKeyParameter);
    } else {
      throw new IllegalArgumentException("'privateKey' type not supported: " + paramAsymmetricKeyParameter.getClass().getName());
    } 
  }
  
  public Certificate getCertificate() {
    return this.agreementCredentials.getCertificate();
  }
  
  public TlsSecret generateAgreement(TlsCertificate paramTlsCertificate) throws IOException {
    return this.agreementCredentials.generateAgreement(paramTlsCertificate);
  }
  
  private static class DHCredentialedAgreement implements TlsCredentialedAgreement {
    final BcTlsCrypto crypto;
    
    final Certificate certificate;
    
    final DHPrivateKeyParameters privateKey;
    
    DHCredentialedAgreement(BcTlsCrypto param1BcTlsCrypto, Certificate param1Certificate, DHPrivateKeyParameters param1DHPrivateKeyParameters) {
      this.crypto = param1BcTlsCrypto;
      this.certificate = param1Certificate;
      this.privateKey = param1DHPrivateKeyParameters;
    }
    
    public TlsSecret generateAgreement(TlsCertificate param1TlsCertificate) throws IOException {
      DHPublicKeyParameters dHPublicKeyParameters = BcTlsCertificate.convert(this.crypto, param1TlsCertificate).getPubKeyDH();
      return (TlsSecret)BcTlsDHDomain.calculateDHAgreement(this.crypto, this.privateKey, dHPublicKeyParameters, false);
    }
    
    public Certificate getCertificate() {
      return this.certificate;
    }
  }
  
  private static class ECCredentialedAgreement implements TlsCredentialedAgreement {
    final BcTlsCrypto crypto;
    
    final Certificate certificate;
    
    final ECPrivateKeyParameters privateKey;
    
    ECCredentialedAgreement(BcTlsCrypto param1BcTlsCrypto, Certificate param1Certificate, ECPrivateKeyParameters param1ECPrivateKeyParameters) {
      this.crypto = param1BcTlsCrypto;
      this.certificate = param1Certificate;
      this.privateKey = param1ECPrivateKeyParameters;
    }
    
    public TlsSecret generateAgreement(TlsCertificate param1TlsCertificate) throws IOException {
      ECPublicKeyParameters eCPublicKeyParameters = BcTlsCertificate.convert(this.crypto, param1TlsCertificate).getPubKeyEC();
      return (TlsSecret)BcTlsECDomain.calculateECDHAgreement(this.crypto, this.privateKey, eCPublicKeyParameters);
    }
    
    public Certificate getCertificate() {
      return this.certificate;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcDefaultTlsCredentialedAgreement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */