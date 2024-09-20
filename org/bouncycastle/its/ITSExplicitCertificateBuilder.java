package org.bouncycastle.its;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.its.operator.ECDSAEncoder;
import org.bouncycastle.its.operator.ITSContentSigner;
import org.bouncycastle.oer.OEREncoder;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateBase;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateId;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateType;
import org.bouncycastle.oer.its.ieee1609dot2.IssuerIdentifier;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.oer.its.ieee1609dot2.VerificationKeyIndicator;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashAlgorithm;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;
import org.bouncycastle.util.Arrays;

public class ITSExplicitCertificateBuilder extends ITSCertificateBuilder {
  private final ITSContentSigner signer;
  
  public ITSExplicitCertificateBuilder(ITSContentSigner paramITSContentSigner, ToBeSignedCertificate.Builder paramBuilder) {
    super(paramBuilder);
    this.signer = paramITSContentSigner;
  }
  
  public ITSCertificate build(CertificateId paramCertificateId, ITSPublicVerificationKey paramITSPublicVerificationKey) {
    return build(paramCertificateId, paramITSPublicVerificationKey, (ITSPublicEncryptionKey)null);
  }
  
  public ITSCertificate build(CertificateId paramCertificateId, ITSPublicVerificationKey paramITSPublicVerificationKey, ITSPublicEncryptionKey paramITSPublicEncryptionKey) {
    VerificationKeyIndicator verificationKeyIndicator;
    IssuerIdentifier issuerIdentifier;
    ToBeSignedCertificate.Builder builder = new ToBeSignedCertificate.Builder(this.tbsCertificateBuilder);
    builder.setId(paramCertificateId);
    if (paramITSPublicEncryptionKey != null)
      builder.setEncryptionKey(paramITSPublicEncryptionKey.toASN1Structure()); 
    builder.setVerifyKeyIndicator(VerificationKeyIndicator.verificationKey(paramITSPublicVerificationKey.toASN1Structure()));
    ToBeSignedCertificate toBeSignedCertificate1 = builder.createToBeSignedCertificate();
    ToBeSignedCertificate toBeSignedCertificate2 = null;
    if (this.signer.isForSelfSigning()) {
      verificationKeyIndicator = toBeSignedCertificate1.getVerifyKeyIndicator();
    } else {
      toBeSignedCertificate2 = this.signer.getAssociatedCertificate().toASN1Structure().getToBeSigned();
      verificationKeyIndicator = toBeSignedCertificate2.getVerifyKeyIndicator();
    } 
    OutputStream outputStream = this.signer.getOutputStream();
    try {
      outputStream.write(OEREncoder.toByteArray((ASN1Encodable)toBeSignedCertificate1, IEEE1609dot2.ToBeSignedCertificate.build()));
      outputStream.close();
    } catch (IOException iOException) {
      throw new IllegalArgumentException("cannot produce certificate signature");
    } 
    Signature signature = null;
    switch (verificationKeyIndicator.getChoice()) {
      case 0:
        signature = ECDSAEncoder.toITS(SECObjectIdentifiers.secp256r1, this.signer.getSignature());
        break;
      case 1:
        signature = ECDSAEncoder.toITS(TeleTrusTObjectIdentifiers.brainpoolP256r1, this.signer.getSignature());
        break;
      case 2:
        signature = ECDSAEncoder.toITS(TeleTrusTObjectIdentifiers.brainpoolP384r1, this.signer.getSignature());
        break;
      default:
        throw new IllegalStateException("unknown key type");
    } 
    CertificateBase.Builder builder1 = new CertificateBase.Builder();
    ASN1ObjectIdentifier aSN1ObjectIdentifier = this.signer.getDigestAlgorithm().getAlgorithm();
    if (this.signer.isForSelfSigning()) {
      if (aSN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha256)) {
        issuerIdentifier = IssuerIdentifier.self(HashAlgorithm.sha256);
      } else if (aSN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha384)) {
        issuerIdentifier = IssuerIdentifier.self(HashAlgorithm.sha384);
      } else {
        throw new IllegalStateException("unknown digest");
      } 
    } else {
      byte[] arrayOfByte = this.signer.getAssociatedCertificateDigest();
      HashedId8 hashedId8 = new HashedId8(Arrays.copyOfRange(arrayOfByte, arrayOfByte.length - 8, arrayOfByte.length));
      if (aSN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha256)) {
        issuerIdentifier = IssuerIdentifier.sha256AndDigest(hashedId8);
      } else if (aSN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha384)) {
        issuerIdentifier = IssuerIdentifier.sha384AndDigest(hashedId8);
      } else {
        throw new IllegalStateException("unknown digest");
      } 
    } 
    builder1.setVersion(this.version);
    builder1.setType(CertificateType.explicit);
    builder1.setIssuer(issuerIdentifier);
    builder1.setToBeSigned(toBeSignedCertificate1);
    builder1.setSignature(signature);
    return new ITSCertificate(builder1.createCertificateBase());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ITSExplicitCertificateBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */