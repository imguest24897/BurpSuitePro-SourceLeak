package org.bouncycastle.pkcs;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.pkcs.Attribute;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.asn1.pkcs.CertificationRequestInfo;
import org.bouncycastle.operator.ContentVerifierProvider;

public class DeltaCertAttributeUtils {
  public static boolean isDeltaRequestSignatureValid(PKCS10CertificationRequest paramPKCS10CertificationRequest, ContentVerifierProvider paramContentVerifierProvider) throws PKCSException {
    Attribute[] arrayOfAttribute = paramPKCS10CertificationRequest.getAttributes(new ASN1ObjectIdentifier("2.16.840.1.114027.80.6.2"));
    DeltaCertificateRequestAttributeValue deltaCertificateRequestAttributeValue = new DeltaCertificateRequestAttributeValue(arrayOfAttribute[0]);
    arrayOfAttribute = paramPKCS10CertificationRequest.getAttributes(new ASN1ObjectIdentifier("2.16.840.1.114027.80.6.3"));
    CertificationRequest certificationRequest = paramPKCS10CertificationRequest.toASN1Structure();
    CertificationRequestInfo certificationRequestInfo = certificationRequest.getCertificationRequestInfo();
    ASN1EncodableVector aSN1EncodableVector1 = new ASN1EncodableVector();
    aSN1EncodableVector1.add((ASN1Encodable)certificationRequestInfo.getVersion());
    aSN1EncodableVector1.add((ASN1Encodable)certificationRequestInfo.getSubject());
    aSN1EncodableVector1.add((ASN1Encodable)certificationRequestInfo.getSubjectPublicKeyInfo());
    ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
    Enumeration enumeration = certificationRequestInfo.getAttributes().getObjects();
    while (enumeration.hasMoreElements()) {
      Attribute attribute = Attribute.getInstance(enumeration.nextElement());
      if (!attribute.getAttrType().equals((ASN1Primitive)new ASN1ObjectIdentifier("2.16.840.1.114027.80.6.3")))
        aSN1EncodableVector2.add((ASN1Encodable)attribute); 
    } 
    aSN1EncodableVector1.add((ASN1Encodable)new DERTaggedObject(false, 0, (ASN1Encodable)new DERSet(aSN1EncodableVector2)));
    ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
    aSN1EncodableVector3.add((ASN1Encodable)new DERSequence(aSN1EncodableVector1));
    aSN1EncodableVector3.add((ASN1Encodable)deltaCertificateRequestAttributeValue.getSignatureAlgorithm());
    aSN1EncodableVector3.add(arrayOfAttribute[0].getAttributeValues()[0]);
    PKCS10CertificationRequest pKCS10CertificationRequest = new PKCS10CertificationRequest(CertificationRequest.getInstance(new DERSequence(aSN1EncodableVector3)));
    return pKCS10CertificationRequest.isSignatureValid(paramContentVerifierProvider);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\DeltaCertAttributeUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */