package org.bouncycastle.its;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateBase;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateId;
import org.bouncycastle.oer.its.ieee1609dot2.CertificateType;
import org.bouncycastle.oer.its.ieee1609dot2.IssuerIdentifier;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.oer.its.ieee1609dot2.VerificationKeyIndicator;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;

public class ITSImplicitCertificateBuilder extends ITSCertificateBuilder {
  private final IssuerIdentifier issuerIdentifier;
  
  public ITSImplicitCertificateBuilder(ITSCertificate paramITSCertificate, DigestCalculatorProvider paramDigestCalculatorProvider, ToBeSignedCertificate.Builder paramBuilder) {
    super(paramITSCertificate, paramBuilder);
    DigestCalculator digestCalculator;
    AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
    ASN1ObjectIdentifier aSN1ObjectIdentifier = algorithmIdentifier.getAlgorithm();
    try {
      digestCalculator = paramDigestCalculatorProvider.get(algorithmIdentifier);
    } catch (OperatorCreationException operatorCreationException) {
      throw new IllegalStateException(operatorCreationException.getMessage(), operatorCreationException);
    } 
    try {
      OutputStream outputStream = digestCalculator.getOutputStream();
      outputStream.write(paramITSCertificate.getEncoded());
      outputStream.close();
    } catch (IOException iOException) {
      throw new IllegalStateException(iOException.getMessage(), iOException);
    } 
    byte[] arrayOfByte = digestCalculator.getDigest();
    HashedId8 hashedId8 = new HashedId8(Arrays.copyOfRange(arrayOfByte, arrayOfByte.length - 8, arrayOfByte.length));
    if (aSN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha256)) {
      this.issuerIdentifier = IssuerIdentifier.sha256AndDigest(hashedId8);
    } else if (aSN1ObjectIdentifier.equals((ASN1Primitive)NISTObjectIdentifiers.id_sha384)) {
      this.issuerIdentifier = IssuerIdentifier.sha384AndDigest(hashedId8);
    } else {
      throw new IllegalStateException("unknown digest");
    } 
  }
  
  public ITSCertificate build(CertificateId paramCertificateId, BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    return build(paramCertificateId, paramBigInteger1, paramBigInteger2, (PublicEncryptionKey)null);
  }
  
  public ITSCertificate build(CertificateId paramCertificateId, BigInteger paramBigInteger1, BigInteger paramBigInteger2, PublicEncryptionKey paramPublicEncryptionKey) {
    EccP256CurvePoint eccP256CurvePoint = EccP256CurvePoint.uncompressedP256(paramBigInteger1, paramBigInteger2);
    ToBeSignedCertificate.Builder builder = new ToBeSignedCertificate.Builder(this.tbsCertificateBuilder);
    builder.setId(paramCertificateId);
    if (paramPublicEncryptionKey != null)
      builder.setEncryptionKey(paramPublicEncryptionKey); 
    builder.setVerifyKeyIndicator(VerificationKeyIndicator.reconstructionValue(eccP256CurvePoint));
    CertificateBase.Builder builder1 = new CertificateBase.Builder();
    builder1.setVersion(this.version);
    builder1.setType(CertificateType.implicit);
    builder1.setIssuer(this.issuerIdentifier);
    builder1.setToBeSigned(builder.createToBeSignedCertificate());
    return new ITSCertificate(builder1.createCertificateBase());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\ITSImplicitCertificateBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */