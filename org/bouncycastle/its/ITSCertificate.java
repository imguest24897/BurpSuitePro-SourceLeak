package org.bouncycastle.its;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.its.operator.ECDSAEncoder;
import org.bouncycastle.its.operator.ITSContentVerifierProvider;
import org.bouncycastle.oer.OEREncoder;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateBase;
import org.bouncycastle.oer.its.ieee1609dot2.IssuerIdentifier;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.util.Encodable;

public class ITSCertificate implements Encodable {
  private final CertificateBase certificate;
  
  public ITSCertificate(CertificateBase paramCertificateBase) {
    this.certificate = paramCertificateBase;
  }
  
  public IssuerIdentifier getIssuer() {
    return this.certificate.getIssuer();
  }
  
  public ITSValidityPeriod getValidityPeriod() {
    return new ITSValidityPeriod(this.certificate.getToBeSigned().getValidityPeriod());
  }
  
  public ITSPublicEncryptionKey getPublicEncryptionKey() {
    PublicEncryptionKey publicEncryptionKey = this.certificate.getToBeSigned().getEncryptionKey();
    return (publicEncryptionKey != null) ? new ITSPublicEncryptionKey(publicEncryptionKey) : null;
  }
  
  public boolean isSignatureValid(ITSContentVerifierProvider paramITSContentVerifierProvider) throws Exception {
    ContentVerifier contentVerifier = paramITSContentVerifierProvider.get(this.certificate.getSignature().getChoice());
    OutputStream outputStream = contentVerifier.getOutputStream();
    outputStream.write(OEREncoder.toByteArray((ASN1Encodable)this.certificate.getToBeSigned(), IEEE1609dot2.ToBeSignedCertificate.build()));
    outputStream.close();
    Signature signature = this.certificate.getSignature();
    return contentVerifier.verify(ECDSAEncoder.toX962(signature));
  }
  
  public CertificateBase toASN1Structure() {
    return this.certificate;
  }
  
  public byte[] getEncoded() throws IOException {
    return OEREncoder.toByteArray((ASN1Encodable)this.certificate, IEEE1609dot2.CertificateBase.build());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ITSCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */