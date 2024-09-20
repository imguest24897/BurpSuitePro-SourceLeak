package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

public class DeltaCertificateDescriptor extends ASN1Object {
  private final ASN1Integer serialNumber;
  
  private AlgorithmIdentifier signature;
  
  private X500Name issuer;
  
  private ASN1Sequence validity;
  
  private X500Name subject;
  
  private SubjectPublicKeyInfo subjectPublicKeyInfo;
  
  private Extensions extensions;
  
  private final ASN1BitString signatureValue;
  
  public static DeltaCertificateDescriptor getInstance(Object paramObject) {
    return (paramObject instanceof DeltaCertificateDescriptor) ? (DeltaCertificateDescriptor)paramObject : ((paramObject != null) ? new DeltaCertificateDescriptor(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static DeltaCertificateDescriptor fromExtensions(Extensions paramExtensions) {
    return getInstance(Extensions.getExtensionParsedValue(paramExtensions, Extension.deltaCertificateDescriptor));
  }
  
  private DeltaCertificateDescriptor(ASN1Sequence paramASN1Sequence) {
    this.serialNumber = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(0));
    byte b = 1;
    ASN1Encodable aSN1Encodable;
    for (aSN1Encodable = paramASN1Sequence.getObjectAt(b); aSN1Encodable instanceof ASN1TaggedObject; aSN1Encodable = paramASN1Sequence.getObjectAt(b++)) {
      ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Encodable);
      switch (aSN1TaggedObject.getTagNo()) {
        case 0:
          this.signature = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
          break;
        case 1:
          this.issuer = X500Name.getInstance(aSN1TaggedObject, true);
          break;
        case 2:
          this.validity = ASN1Sequence.getInstance(aSN1TaggedObject, false);
          break;
        case 3:
          this.subject = X500Name.getInstance(aSN1TaggedObject, true);
          break;
      } 
    } 
    this.subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(aSN1Encodable);
    for (aSN1Encodable = paramASN1Sequence.getObjectAt(b); aSN1Encodable instanceof ASN1TaggedObject; aSN1Encodable = paramASN1Sequence.getObjectAt(b++)) {
      ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Encodable);
      switch (aSN1TaggedObject.getTagNo()) {
        case 4:
          this.extensions = Extensions.getInstance(aSN1TaggedObject, false);
          break;
      } 
    } 
    this.signatureValue = ASN1BitString.getInstance(aSN1Encodable);
  }
  
  public ASN1Integer getSerialNumber() {
    return this.serialNumber;
  }
  
  public AlgorithmIdentifier getSignature() {
    return this.signature;
  }
  
  public X500Name getIssuer() {
    return this.issuer;
  }
  
  public ASN1Sequence getValidity() {
    return this.validity;
  }
  
  public X500Name getSubject() {
    return this.subject;
  }
  
  public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
    return this.subjectPublicKeyInfo;
  }
  
  public Extensions getExtensions() {
    return this.extensions;
  }
  
  public ASN1BitString getSignatureValue() {
    return this.signatureValue;
  }
  
  public DeltaCertificateDescriptor trimTo(TBSCertificate paramTBSCertificate, Extensions paramExtensions) {
    AlgorithmIdentifier algorithmIdentifier = paramTBSCertificate.signature;
    X500Name x500Name1 = paramTBSCertificate.issuer;
    DERSequence dERSequence = new DERSequence(new ASN1Encodable[] { (ASN1Encodable)paramTBSCertificate.startDate, (ASN1Encodable)paramTBSCertificate.endDate });
    X500Name x500Name2 = paramTBSCertificate.subject;
    ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(toASN1Primitive());
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    Enumeration<ASN1Encodable> enumeration = aSN1Sequence.getObjects();
    aSN1EncodableVector.add(enumeration.nextElement());
    ASN1Encodable aSN1Encodable;
    for (aSN1Encodable = enumeration.nextElement(); aSN1Encodable instanceof ASN1TaggedObject; aSN1Encodable = enumeration.nextElement()) {
      AlgorithmIdentifier algorithmIdentifier1;
      X500Name x500Name3;
      ASN1Sequence aSN1Sequence1;
      X500Name x500Name4;
      ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Encodable);
      switch (aSN1TaggedObject.getTagNo()) {
        case 0:
          algorithmIdentifier1 = AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
          if (!algorithmIdentifier1.equals(algorithmIdentifier))
            aSN1EncodableVector.add(aSN1Encodable); 
          break;
        case 1:
          x500Name3 = X500Name.getInstance(aSN1TaggedObject, true);
          if (!x500Name3.equals(x500Name1))
            aSN1EncodableVector.add(aSN1Encodable); 
          break;
        case 2:
          aSN1Sequence1 = ASN1Sequence.getInstance(aSN1TaggedObject, false);
          if (!aSN1Sequence1.equals((ASN1Primitive)dERSequence))
            aSN1EncodableVector.add(aSN1Encodable); 
          break;
        case 3:
          x500Name4 = X500Name.getInstance(aSN1TaggedObject, true);
          if (!x500Name4.equals(x500Name2))
            aSN1EncodableVector.add(aSN1Encodable); 
          break;
      } 
    } 
    aSN1EncodableVector.add(aSN1Encodable);
    for (aSN1Encodable = enumeration.nextElement(); aSN1Encodable instanceof ASN1TaggedObject; aSN1Encodable = enumeration.nextElement()) {
      Extensions extensions;
      ExtensionsGenerator extensionsGenerator;
      Enumeration<ASN1ObjectIdentifier> enumeration1;
      ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Encodable);
      switch (aSN1TaggedObject.getTagNo()) {
        case 4:
          extensions = Extensions.getInstance(aSN1TaggedObject, false);
          extensionsGenerator = new ExtensionsGenerator();
          enumeration1 = extensions.oids();
          while (enumeration1.hasMoreElements()) {
            Extension extension1 = extensions.getExtension(enumeration1.nextElement());
            Extension extension2 = paramExtensions.getExtension(extension1.getExtnId());
            if (extension2 != null && !extension1.equals(extension2))
              extensionsGenerator.addExtension(extension1); 
          } 
          if (!extensionsGenerator.isEmpty())
            aSN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(false, 4, (ASN1Encodable)extensionsGenerator.generate())); 
          break;
      } 
    } 
    aSN1EncodableVector.add(aSN1Encodable);
    return new DeltaCertificateDescriptor((ASN1Sequence)new DERSequence(aSN1EncodableVector));
  }
  
  private void addOptional(ASN1EncodableVector paramASN1EncodableVector, int paramInt, boolean paramBoolean, ASN1Object paramASN1Object) {
    if (paramASN1Object != null)
      paramASN1EncodableVector.add((ASN1Encodable)new DERTaggedObject(paramBoolean, paramInt, (ASN1Encodable)paramASN1Object)); 
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
    aSN1EncodableVector.add((ASN1Encodable)this.serialNumber);
    addOptional(aSN1EncodableVector, 0, false, this.signature);
    addOptional(aSN1EncodableVector, 1, true, (ASN1Object)this.issuer);
    addOptional(aSN1EncodableVector, 2, false, (ASN1Object)this.validity);
    addOptional(aSN1EncodableVector, 3, true, (ASN1Object)this.subject);
    aSN1EncodableVector.add((ASN1Encodable)this.subjectPublicKeyInfo);
    addOptional(aSN1EncodableVector, 4, false, this.extensions);
    aSN1EncodableVector.add((ASN1Encodable)this.signatureValue);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x509\DeltaCertificateDescriptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */