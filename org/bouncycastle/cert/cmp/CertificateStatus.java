package org.bouncycastle.cert.cmp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.CertStatus;
import org.bouncycastle.asn1.cmp.PKIStatusInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.util.Arrays;

public class CertificateStatus {
  private DigestAlgorithmIdentifierFinder digestAlgFinder;
  
  private CertStatus certStatus;
  
  CertificateStatus(DigestAlgorithmIdentifierFinder paramDigestAlgorithmIdentifierFinder, CertStatus paramCertStatus) {
    this.digestAlgFinder = paramDigestAlgorithmIdentifierFinder;
    this.certStatus = paramCertStatus;
  }
  
  public PKIStatusInfo getStatusInfo() {
    return this.certStatus.getStatusInfo();
  }
  
  public BigInteger getCertRequestID() {
    return this.certStatus.getCertReqId().getValue();
  }
  
  public boolean isVerified(X509CertificateHolder paramX509CertificateHolder, DigestCalculatorProvider paramDigestCalculatorProvider) throws CMPException {
    return isVerified(new CMPCertificate(paramX509CertificateHolder.toASN1Structure()), paramX509CertificateHolder.getSignatureAlgorithm(), paramDigestCalculatorProvider);
  }
  
  public boolean isVerified(CMPCertificate paramCMPCertificate, AlgorithmIdentifier paramAlgorithmIdentifier, DigestCalculatorProvider paramDigestCalculatorProvider) throws CMPException {
    byte[] arrayOfByte = CMPUtil.calculateCertHash((ASN1Object)paramCMPCertificate, paramAlgorithmIdentifier, paramDigestCalculatorProvider, this.digestAlgFinder);
    return Arrays.constantTimeAreEqual(this.certStatus.getCertHash().getOctets(), arrayOfByte);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\cmp\CertificateStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */