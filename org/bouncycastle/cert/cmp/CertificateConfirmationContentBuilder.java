package org.bouncycastle.cert.cmp;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.CertConfirmContent;
import org.bouncycastle.asn1.cmp.CertStatus;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculatorProvider;

public class CertificateConfirmationContentBuilder {
  private DigestAlgorithmIdentifierFinder digestAlgFinder;
  
  private List<CMPCertificate> acceptedCerts = new ArrayList<>();
  
  private List<AlgorithmIdentifier> acceptedSignatureAlgorithms = new ArrayList<>();
  
  private List<ASN1Integer> acceptedReqIds = new ArrayList<>();
  
  public CertificateConfirmationContentBuilder() {
    this((DigestAlgorithmIdentifierFinder)new DefaultDigestAlgorithmIdentifierFinder());
  }
  
  public CertificateConfirmationContentBuilder(DigestAlgorithmIdentifierFinder paramDigestAlgorithmIdentifierFinder) {
    this.digestAlgFinder = paramDigestAlgorithmIdentifierFinder;
  }
  
  public CertificateConfirmationContentBuilder addAcceptedCertificate(X509CertificateHolder paramX509CertificateHolder, BigInteger paramBigInteger) {
    return addAcceptedCertificate(paramX509CertificateHolder, new ASN1Integer(paramBigInteger));
  }
  
  public CertificateConfirmationContentBuilder addAcceptedCertificate(X509CertificateHolder paramX509CertificateHolder, ASN1Integer paramASN1Integer) {
    return addAcceptedCertificate(new CMPCertificate(paramX509CertificateHolder.toASN1Structure()), paramX509CertificateHolder.getSignatureAlgorithm(), paramASN1Integer);
  }
  
  public CertificateConfirmationContentBuilder addAcceptedCertificate(CMPCertificate paramCMPCertificate, AlgorithmIdentifier paramAlgorithmIdentifier, ASN1Integer paramASN1Integer) {
    this.acceptedCerts.add(paramCMPCertificate);
    this.acceptedSignatureAlgorithms.add(paramAlgorithmIdentifier);
    this.acceptedReqIds.add(paramASN1Integer);
    return this;
  }
  
  public CertificateConfirmationContent build(DigestCalculatorProvider paramDigestCalculatorProvider) throws CMPException {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(this.acceptedCerts.size());
    for (byte b = 0; b != this.acceptedCerts.size(); b++) {
      byte[] arrayOfByte = CMPUtil.calculateCertHash((ASN1Object)this.acceptedCerts.get(b), this.acceptedSignatureAlgorithms.get(b), paramDigestCalculatorProvider, this.digestAlgFinder);
      ASN1Integer aSN1Integer = this.acceptedReqIds.get(b);
      aSN1EncodableVector.add((ASN1Encodable)new CertStatus(arrayOfByte, aSN1Integer));
    } 
    CertConfirmContent certConfirmContent = CertConfirmContent.getInstance(new DERSequence(aSN1EncodableVector));
    return new CertificateConfirmationContent(certConfirmContent, this.digestAlgFinder);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\cmp\CertificateConfirmationContentBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */