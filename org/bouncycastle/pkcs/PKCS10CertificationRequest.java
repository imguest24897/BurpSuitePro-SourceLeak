package org.bouncycastle.pkcs;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.pkcs.Attribute;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.asn1.pkcs.CertificationRequestInfo;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.operator.ContentVerifier;
import org.bouncycastle.operator.ContentVerifierProvider;
import org.bouncycastle.util.Exceptions;

public class PKCS10CertificationRequest {
  private static Attribute[] EMPTY_ARRAY = new Attribute[0];
  
  private final CertificationRequest certificationRequest;
  
  private final boolean isAltRequest;
  
  private final AlgorithmIdentifier altSignature;
  
  private final SubjectPublicKeyInfo altPublicKey;
  
  private final ASN1BitString altSignatureValue;
  
  private static CertificationRequest parseBytes(byte[] paramArrayOfbyte) throws IOException {
    try {
      CertificationRequest certificationRequest = CertificationRequest.getInstance(ASN1Primitive.fromByteArray(paramArrayOfbyte));
      if (certificationRequest == null)
        throw new PKCSIOException("empty data passed to constructor"); 
      return certificationRequest;
    } catch (ClassCastException classCastException) {
      throw new PKCSIOException("malformed data: " + classCastException.getMessage(), classCastException);
    } catch (IllegalArgumentException illegalArgumentException) {
      throw new PKCSIOException("malformed data: " + illegalArgumentException.getMessage(), illegalArgumentException);
    } 
  }
  
  private static ASN1Encodable getSingleValue(Attribute paramAttribute) {
    ASN1Encodable[] arrayOfASN1Encodable = paramAttribute.getAttributeValues();
    if (arrayOfASN1Encodable.length != 1)
      throw new IllegalArgumentException("single value attribute value not size of 1"); 
    return arrayOfASN1Encodable[0];
  }
  
  public PKCS10CertificationRequest(CertificationRequest paramCertificationRequest) {
    if (paramCertificationRequest == null)
      throw new NullPointerException("certificationRequest cannot be null"); 
    this.certificationRequest = paramCertificationRequest;
    ASN1Set aSN1Set = paramCertificationRequest.getCertificationRequestInfo().getAttributes();
    AlgorithmIdentifier algorithmIdentifier = null;
    SubjectPublicKeyInfo subjectPublicKeyInfo = null;
    ASN1BitString aSN1BitString = null;
    if (aSN1Set != null) {
      Enumeration enumeration = aSN1Set.getObjects();
      while (enumeration.hasMoreElements()) {
        Attribute attribute = Attribute.getInstance(enumeration.nextElement());
        if (Extension.altSignatureAlgorithm.equals((ASN1Primitive)attribute.getAttrType()))
          algorithmIdentifier = AlgorithmIdentifier.getInstance(getSingleValue(attribute)); 
        if (Extension.subjectAltPublicKeyInfo.equals((ASN1Primitive)attribute.getAttrType()))
          subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(getSingleValue(attribute)); 
        if (Extension.altSignatureValue.equals((ASN1Primitive)attribute.getAttrType()))
          aSN1BitString = ASN1BitString.getInstance(getSingleValue(attribute)); 
      } 
    } 
    this.isAltRequest = ((algorithmIdentifier != null)) | ((subjectPublicKeyInfo != null)) | ((aSN1BitString != null) ? 1 : 0);
    if (this.isAltRequest)
      if ((((algorithmIdentifier != null) ? 1 : 0) & ((subjectPublicKeyInfo != null) ? 1 : 0) & ((aSN1BitString != null) ? 1 : 0)) == 0)
        throw new IllegalArgumentException("invalid alternate public key details found");  
    this.altSignature = algorithmIdentifier;
    this.altPublicKey = subjectPublicKeyInfo;
    this.altSignatureValue = aSN1BitString;
  }
  
  public PKCS10CertificationRequest(byte[] paramArrayOfbyte) throws IOException {
    this(parseBytes(paramArrayOfbyte));
  }
  
  public CertificationRequest toASN1Structure() {
    return this.certificationRequest;
  }
  
  public X500Name getSubject() {
    return X500Name.getInstance(this.certificationRequest.getCertificationRequestInfo().getSubject());
  }
  
  public AlgorithmIdentifier getSignatureAlgorithm() {
    return this.certificationRequest.getSignatureAlgorithm();
  }
  
  public byte[] getSignature() {
    return this.certificationRequest.getSignature().getOctets();
  }
  
  public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
    return this.certificationRequest.getCertificationRequestInfo().getSubjectPublicKeyInfo();
  }
  
  public Attribute[] getAttributes() {
    ASN1Set aSN1Set = this.certificationRequest.getCertificationRequestInfo().getAttributes();
    if (aSN1Set == null)
      return EMPTY_ARRAY; 
    Attribute[] arrayOfAttribute = new Attribute[aSN1Set.size()];
    for (byte b = 0; b != aSN1Set.size(); b++)
      arrayOfAttribute[b] = Attribute.getInstance(aSN1Set.getObjectAt(b)); 
    return arrayOfAttribute;
  }
  
  public Attribute[] getAttributes(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    ASN1Set aSN1Set = this.certificationRequest.getCertificationRequestInfo().getAttributes();
    if (aSN1Set == null)
      return EMPTY_ARRAY; 
    ArrayList<Attribute> arrayList = new ArrayList();
    for (byte b = 0; b != aSN1Set.size(); b++) {
      Attribute attribute = Attribute.getInstance(aSN1Set.getObjectAt(b));
      if (attribute.getAttrType().equals((ASN1Primitive)paramASN1ObjectIdentifier))
        arrayList.add(attribute); 
    } 
    return (arrayList.size() == 0) ? EMPTY_ARRAY : arrayList.<Attribute>toArray(new Attribute[arrayList.size()]);
  }
  
  public byte[] getEncoded() throws IOException {
    return this.certificationRequest.getEncoded();
  }
  
  public boolean isSignatureValid(ContentVerifierProvider paramContentVerifierProvider) throws PKCSException {
    ContentVerifier contentVerifier;
    CertificationRequestInfo certificationRequestInfo = this.certificationRequest.getCertificationRequestInfo();
    try {
      contentVerifier = paramContentVerifierProvider.get(this.certificationRequest.getSignatureAlgorithm());
      OutputStream outputStream = contentVerifier.getOutputStream();
      outputStream.write(certificationRequestInfo.getEncoded("DER"));
      outputStream.close();
    } catch (Exception exception) {
      throw new PKCSException("unable to process signature: " + exception.getMessage(), exception);
    } 
    return contentVerifier.verify(getSignature());
  }
  
  public boolean hasAltPublicKey() {
    return this.isAltRequest;
  }
  
  public boolean isAltSignatureValid(ContentVerifierProvider paramContentVerifierProvider) throws PKCSException {
    ContentVerifier contentVerifier;
    if (!this.isAltRequest)
      throw new IllegalStateException("no alternate public key present"); 
    CertificationRequestInfo certificationRequestInfo = this.certificationRequest.getCertificationRequestInfo();
    ASN1Set aSN1Set = certificationRequestInfo.getAttributes();
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    Enumeration enumeration = aSN1Set.getObjects();
    while (enumeration.hasMoreElements()) {
      Attribute attribute = Attribute.getInstance(enumeration.nextElement());
      if (Extension.altSignatureValue.equals((ASN1Primitive)attribute.getAttrType()))
        continue; 
      aSN1EncodableVector.add((ASN1Encodable)attribute);
    } 
    certificationRequestInfo = new CertificationRequestInfo(certificationRequestInfo.getSubject(), certificationRequestInfo.getSubjectPublicKeyInfo(), (ASN1Set)new DERSet(aSN1EncodableVector));
    try {
      contentVerifier = paramContentVerifierProvider.get(this.altSignature);
      OutputStream outputStream = contentVerifier.getOutputStream();
      outputStream.write(certificationRequestInfo.getEncoded("DER"));
      outputStream.close();
    } catch (Exception exception) {
      throw new PKCSException("unable to process signature: " + exception.getMessage(), exception);
    } 
    return contentVerifier.verify(this.altSignatureValue.getOctets());
  }
  
  public Extensions getRequestedExtensions() {
    Attribute[] arrayOfAttribute = getAttributes();
    for (byte b = 0; b != arrayOfAttribute.length; b++) {
      Attribute attribute = arrayOfAttribute[b];
      if (PKCSObjectIdentifiers.pkcs_9_at_extensionRequest.equals((ASN1Primitive)attribute.getAttrType())) {
        ExtensionsGenerator extensionsGenerator = new ExtensionsGenerator();
        ASN1Set aSN1Set = attribute.getAttrValues();
        if (aSN1Set == null || aSN1Set.size() == 0)
          throw new IllegalStateException("pkcs_9_at_extensionRequest present but has no value"); 
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(aSN1Set.getObjectAt(0));
        try {
          Enumeration enumeration = aSN1Sequence.getObjects();
          while (enumeration.hasMoreElements()) {
            ASN1Sequence aSN1Sequence1 = ASN1Sequence.getInstance(enumeration.nextElement());
            boolean bool = (aSN1Sequence1.size() == 3 && ASN1Boolean.getInstance(aSN1Sequence1.getObjectAt(1)).isTrue()) ? true : false;
            if (aSN1Sequence1.size() == 2) {
              extensionsGenerator.addExtension(ASN1ObjectIdentifier.getInstance(aSN1Sequence1.getObjectAt(0)), false, ASN1OctetString.getInstance(aSN1Sequence1.getObjectAt(1)).getOctets());
              continue;
            } 
            if (aSN1Sequence1.size() == 3) {
              extensionsGenerator.addExtension(ASN1ObjectIdentifier.getInstance(aSN1Sequence1.getObjectAt(0)), bool, ASN1OctetString.getInstance(aSN1Sequence1.getObjectAt(2)).getOctets());
              continue;
            } 
            throw new IllegalStateException("incorrect sequence size of Extension get " + aSN1Sequence1.size() + " expected 2 or three");
          } 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw Exceptions.illegalStateException("asn1 processing issue: " + illegalArgumentException.getMessage(), illegalArgumentException);
        } 
        return extensionsGenerator.generate();
      } 
    } 
    return null;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof PKCS10CertificationRequest))
      return false; 
    PKCS10CertificationRequest pKCS10CertificationRequest = (PKCS10CertificationRequest)paramObject;
    return toASN1Structure().equals(pKCS10CertificationRequest.toASN1Structure());
  }
  
  public int hashCode() {
    return toASN1Structure().hashCode();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pkcs\PKCS10CertificationRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */