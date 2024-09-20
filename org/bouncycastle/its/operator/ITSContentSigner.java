package org.bouncycastle.its.operator;

import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.its.ITSCertificate;

public interface ITSContentSigner {
  OutputStream getOutputStream();
  
  byte[] getSignature();
  
  ITSCertificate getAssociatedCertificate();
  
  byte[] getAssociatedCertificateDigest();
  
  AlgorithmIdentifier getDigestAlgorithm();
  
  ASN1ObjectIdentifier getCurveID();
  
  boolean isForSelfSigning();
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\its\operator\ITSContentSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */