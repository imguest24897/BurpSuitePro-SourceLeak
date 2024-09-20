package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.tls.TlsRsaKeyExchange;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.ProtocolVersion;
import org.bouncycastle.tls.TlsCredentialedDecryptor;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsSecret;

public class BcDefaultTlsCredentialedDecryptor implements TlsCredentialedDecryptor {
  protected BcTlsCrypto crypto;
  
  protected Certificate certificate;
  
  protected AsymmetricKeyParameter privateKey;
  
  public BcDefaultTlsCredentialedDecryptor(BcTlsCrypto paramBcTlsCrypto, Certificate paramCertificate, AsymmetricKeyParameter paramAsymmetricKeyParameter) {
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
    if (paramAsymmetricKeyParameter instanceof RSAKeyParameters) {
      this.crypto = paramBcTlsCrypto;
      this.certificate = paramCertificate;
      this.privateKey = paramAsymmetricKeyParameter;
      return;
    } 
    throw new IllegalArgumentException("'privateKey' type not supported: " + paramAsymmetricKeyParameter.getClass().getName());
  }
  
  public Certificate getCertificate() {
    return this.certificate;
  }
  
  public TlsSecret decrypt(TlsCryptoParameters paramTlsCryptoParameters, byte[] paramArrayOfbyte) throws IOException {
    return safeDecryptPreMasterSecret(paramTlsCryptoParameters, (RSAKeyParameters)this.privateKey, paramArrayOfbyte);
  }
  
  protected TlsSecret safeDecryptPreMasterSecret(TlsCryptoParameters paramTlsCryptoParameters, RSAKeyParameters paramRSAKeyParameters, byte[] paramArrayOfbyte) {
    ProtocolVersion protocolVersion = paramTlsCryptoParameters.getRSAPreMasterSecretVersion();
    byte[] arrayOfByte = TlsRsaKeyExchange.decryptPreMasterSecret(paramArrayOfbyte, 0, paramArrayOfbyte.length, paramRSAKeyParameters, protocolVersion.getFullVersion(), this.crypto.getSecureRandom());
    return this.crypto.createSecret(arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcDefaultTlsCredentialedDecryptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */