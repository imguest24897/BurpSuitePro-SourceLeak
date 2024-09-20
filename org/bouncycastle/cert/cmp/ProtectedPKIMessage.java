package org.bouncycastle.cert.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.CMPCertificate;
import org.bouncycastle.asn1.cmp.CMPObjectIdentifiers;
import org.bouncycastle.asn1.cmp.PKIBody;
import org.bouncycastle.asn1.cmp.PKIHeader;
import org.bouncycastle.asn1.cmp.PKIMessage;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.operator.MacCalculator;
import org.bouncycastle.operator.PBEMacCalculatorProvider;
import org.bouncycastle.util.Arrays;

public class ProtectedPKIMessage {
  private PKIMessage pkiMessage;
  
  public ProtectedPKIMessage(GeneralPKIMessage paramGeneralPKIMessage) {
    if (!paramGeneralPKIMessage.hasProtection())
      throw new IllegalArgumentException("PKIMessage not protected"); 
    this.pkiMessage = paramGeneralPKIMessage.toASN1Structure();
  }
  
  ProtectedPKIMessage(PKIMessage paramPKIMessage) {
    if (paramPKIMessage.getHeader().getProtectionAlg() == null)
      throw new IllegalArgumentException("PKIMessage not protected"); 
    this.pkiMessage = paramPKIMessage;
  }
  
  public PKIHeader getHeader() {
    return this.pkiMessage.getHeader();
  }
  
  public PKIBody getBody() {
    return this.pkiMessage.getBody();
  }
  
  public PKIMessage toASN1Structure() {
    return this.pkiMessage;
  }
  
  public boolean hasPasswordBasedMacProtection() {
    return CMPObjectIdentifiers.passwordBasedMac.equals((ASN1Primitive)getProtectionAlgorithm().getAlgorithm());
  }
  
  public AlgorithmIdentifier getProtectionAlgorithm() {
    return this.pkiMessage.getHeader().getProtectionAlg();
  }
  
  public X509CertificateHolder[] getCertificates() {
    CMPCertificate[] arrayOfCMPCertificate = this.pkiMessage.getExtraCerts();
    if (arrayOfCMPCertificate == null)
      return new X509CertificateHolder[0]; 
    X509CertificateHolder[] arrayOfX509CertificateHolder = new X509CertificateHolder[arrayOfCMPCertificate.length];
    for (byte b = 0; b != arrayOfCMPCertificate.length; b++)
      arrayOfX509CertificateHolder[b] = new X509CertificateHolder(arrayOfCMPCertificate[b].getX509v3PKCert()); 
    return arrayOfX509CertificateHolder;
  }
  
  public boolean verify(ContentVerifierProvider paramContentVerifierProvider) throws CMPException {
    try {
      ContentVerifier contentVerifier = paramContentVerifierProvider.get(getProtectionAlgorithm());
      return verifySignature(this.pkiMessage.getProtection().getOctets(), contentVerifier);
    } catch (Exception exception) {
      throw new CMPException("unable to verify signature: " + exception.getMessage(), exception);
    } 
  }
  
  public boolean verify(PBEMacCalculatorProvider paramPBEMacCalculatorProvider, char[] paramArrayOfchar) throws CMPException {
    try {
      MacCalculator macCalculator = paramPBEMacCalculatorProvider.get(getProtectionAlgorithm(), paramArrayOfchar);
      CMPUtil.derEncodeToStream((ASN1Object)createProtected(), macCalculator.getOutputStream());
      return Arrays.constantTimeAreEqual(macCalculator.getMac(), this.pkiMessage.getProtection().getOctets());
    } catch (Exception exception) {
      throw new CMPException("unable to verify MAC: " + exception.getMessage(), exception);
    } 
  }
  
  private boolean verifySignature(byte[] paramArrayOfbyte, ContentVerifier paramContentVerifier) {
    CMPUtil.derEncodeToStream((ASN1Object)createProtected(), paramContentVerifier.getOutputStream());
    return paramContentVerifier.verify(paramArrayOfbyte);
  }
  
  private DERSequence createProtected() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.pkiMessage.getHeader());
    aSN1EncodableVector.add((ASN1Encodable)this.pkiMessage.getBody());
    return new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\cert\cmp\ProtectedPKIMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */