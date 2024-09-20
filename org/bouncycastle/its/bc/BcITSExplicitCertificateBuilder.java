package org.bouncycastle.its.bc;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.ITSExplicitCertificateBuilder;
import org.bouncycastle.its.operator.ITSContentSigner;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateId;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;

public class BcITSExplicitCertificateBuilder extends ITSExplicitCertificateBuilder {
  public BcITSExplicitCertificateBuilder(ITSContentSigner paramITSContentSigner, ToBeSignedCertificate.Builder paramBuilder) {
    super(paramITSContentSigner, paramBuilder);
  }
  
  public ITSCertificate build(CertificateId paramCertificateId, ECPublicKeyParameters paramECPublicKeyParameters) {
    return build(paramCertificateId, paramECPublicKeyParameters, null);
  }
  
  public ITSCertificate build(CertificateId paramCertificateId, ECPublicKeyParameters paramECPublicKeyParameters1, ECPublicKeyParameters paramECPublicKeyParameters2) {
    BcITSPublicEncryptionKey bcITSPublicEncryptionKey = null;
    if (paramECPublicKeyParameters2 != null)
      bcITSPublicEncryptionKey = new BcITSPublicEncryptionKey((AsymmetricKeyParameter)paramECPublicKeyParameters2); 
    return build(paramCertificateId, new BcITSPublicVerificationKey((AsymmetricKeyParameter)paramECPublicKeyParameters1), bcITSPublicEncryptionKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\bc\BcITSExplicitCertificateBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */