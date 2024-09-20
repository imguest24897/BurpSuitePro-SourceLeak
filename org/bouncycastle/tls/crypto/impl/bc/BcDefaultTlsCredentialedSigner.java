package org.bouncycastle.tls.crypto.impl.bc;

import java.io.IOException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.Ed448PrivateKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.tls.Certificate;
import org.bouncycastle.tls.DefaultTlsCredentialedSigner;
import org.bouncycastle.tls.SignatureAndHashAlgorithm;
import org.bouncycastle.tls.SignatureScheme;
import org.bouncycastle.tls.crypto.TlsCryptoParameters;
import org.bouncycastle.tls.crypto.TlsSigner;

public class BcDefaultTlsCredentialedSigner extends DefaultTlsCredentialedSigner {
  private static BcTlsCertificate getEndEntity(BcTlsCrypto paramBcTlsCrypto, Certificate paramCertificate) throws IOException {
    if (paramCertificate == null || paramCertificate.isEmpty())
      throw new IllegalArgumentException("No certificate"); 
    return BcTlsCertificate.convert(paramBcTlsCrypto, paramCertificate.getCertificateAt(0));
  }
  
  private static TlsSigner makeSigner(BcTlsCrypto paramBcTlsCrypto, AsymmetricKeyParameter paramAsymmetricKeyParameter, Certificate paramCertificate, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    BcTlsEd448Signer bcTlsEd448Signer;
    if (paramAsymmetricKeyParameter instanceof RSAKeyParameters) {
      RSAKeyParameters rSAKeyParameters2;
      RSAKeyParameters rSAKeyParameters1 = (RSAKeyParameters)paramAsymmetricKeyParameter;
      if (paramSignatureAndHashAlgorithm != null) {
        int i = SignatureScheme.from(paramSignatureAndHashAlgorithm);
        if (SignatureScheme.isRSAPSS(i))
          return new BcTlsRSAPSSSigner(paramBcTlsCrypto, rSAKeyParameters1, i); 
      } 
      try {
        rSAKeyParameters2 = getEndEntity(paramBcTlsCrypto, paramCertificate).getPubKeyRSA();
      } catch (Exception exception) {
        throw new RuntimeException(exception);
      } 
      BcTlsRSASigner bcTlsRSASigner = new BcTlsRSASigner(paramBcTlsCrypto, rSAKeyParameters1, rSAKeyParameters2);
    } else if (paramAsymmetricKeyParameter instanceof DSAPrivateKeyParameters) {
      BcTlsDSASigner bcTlsDSASigner = new BcTlsDSASigner(paramBcTlsCrypto, (DSAPrivateKeyParameters)paramAsymmetricKeyParameter);
    } else if (paramAsymmetricKeyParameter instanceof ECPrivateKeyParameters) {
      ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters)paramAsymmetricKeyParameter;
      if (paramSignatureAndHashAlgorithm != null) {
        int i = SignatureScheme.from(paramSignatureAndHashAlgorithm);
        if (SignatureScheme.isECDSA(i))
          return new BcTlsECDSA13Signer(paramBcTlsCrypto, eCPrivateKeyParameters, i); 
      } 
      BcTlsECDSASigner bcTlsECDSASigner = new BcTlsECDSASigner(paramBcTlsCrypto, eCPrivateKeyParameters);
    } else if (paramAsymmetricKeyParameter instanceof Ed25519PrivateKeyParameters) {
      BcTlsEd25519Signer bcTlsEd25519Signer = new BcTlsEd25519Signer(paramBcTlsCrypto, (Ed25519PrivateKeyParameters)paramAsymmetricKeyParameter);
    } else if (paramAsymmetricKeyParameter instanceof Ed448PrivateKeyParameters) {
      bcTlsEd448Signer = new BcTlsEd448Signer(paramBcTlsCrypto, (Ed448PrivateKeyParameters)paramAsymmetricKeyParameter);
    } else {
      throw new IllegalArgumentException("'privateKey' type not supported: " + paramAsymmetricKeyParameter.getClass().getName());
    } 
    return bcTlsEd448Signer;
  }
  
  public BcDefaultTlsCredentialedSigner(TlsCryptoParameters paramTlsCryptoParameters, BcTlsCrypto paramBcTlsCrypto, AsymmetricKeyParameter paramAsymmetricKeyParameter, Certificate paramCertificate, SignatureAndHashAlgorithm paramSignatureAndHashAlgorithm) {
    super(paramTlsCryptoParameters, makeSigner(paramBcTlsCrypto, paramAsymmetricKeyParameter, paramCertificate, paramSignatureAndHashAlgorithm), paramCertificate, paramSignatureAndHashAlgorithm);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\bc\BcDefaultTlsCredentialedSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */