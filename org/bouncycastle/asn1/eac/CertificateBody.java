package org.bouncycastle.asn1.eac;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class CertificateBody extends ASN1Object {
  ASN1InputStream seq;
  
  private ASN1TaggedObject certificateProfileIdentifier;
  
  private ASN1TaggedObject certificationAuthorityReference;
  
  private PublicKeyDataObject publicKey;
  
  private ASN1TaggedObject certificateHolderReference;
  
  private CertificateHolderAuthorization certificateHolderAuthorization;
  
  private ASN1TaggedObject certificateEffectiveDate;
  
  private ASN1TaggedObject certificateExpirationDate;
  
  private int certificateType = 0;
  
  private static final int CPI = 1;
  
  private static final int CAR = 2;
  
  private static final int PK = 4;
  
  private static final int CHR = 8;
  
  private static final int CHA = 16;
  
  private static final int CEfD = 32;
  
  private static final int CExD = 64;
  
  public static final int profileType = 127;
  
  private static final int profileType_m = 127;
  
  private static final int profileType_r = 0;
  
  public static final int requestType = 13;
  
  private static final int requestType_m = 13;
  
  private static final int requestType_r = 2;
  
  private void setIso7816CertificateBody(ASN1TaggedObject paramASN1TaggedObject) throws IOException {
    ASN1Sequence aSN1Sequence;
    if (paramASN1TaggedObject.hasTag(64, 78)) {
      aSN1Sequence = ASN1Sequence.getInstance(paramASN1TaggedObject.getBaseUniversal(false, 16));
    } else {
      throw new IOException("Bad tag : not an iso7816 CERTIFICATE_CONTENT_TEMPLATE");
    } 
    byte b = 0;
    int i = aSN1Sequence.size();
    while (b < i) {
      ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(b), 64);
      switch (aSN1TaggedObject.getTagNo()) {
        case 41:
          setCertificateProfileIdentifier(aSN1TaggedObject);
          break;
        case 2:
          setCertificationAuthorityReference(aSN1TaggedObject);
          break;
        case 73:
          setPublicKey(PublicKeyDataObject.getInstance(aSN1TaggedObject.getBaseUniversal(false, 16)));
          break;
        case 32:
          setCertificateHolderReference(aSN1TaggedObject);
          break;
        case 76:
          setCertificateHolderAuthorization(new CertificateHolderAuthorization(aSN1TaggedObject));
          break;
        case 37:
          setCertificateEffectiveDate(aSN1TaggedObject);
          break;
        case 36:
          setCertificateExpirationDate(aSN1TaggedObject);
          break;
        default:
          this.certificateType = 0;
          throw new IOException("Not a valid iso7816 ASN1TaggedObject tag " + aSN1TaggedObject.getTagNo());
      } 
      b++;
    } 
  }
  
  public CertificateBody(ASN1TaggedObject paramASN1TaggedObject, CertificationAuthorityReference paramCertificationAuthorityReference, PublicKeyDataObject paramPublicKeyDataObject, CertificateHolderReference paramCertificateHolderReference, CertificateHolderAuthorization paramCertificateHolderAuthorization, PackedDate paramPackedDate1, PackedDate paramPackedDate2) {
    setCertificateProfileIdentifier(paramASN1TaggedObject);
    setCertificationAuthorityReference(EACTagged.create(2, paramCertificationAuthorityReference.getEncoded()));
    setPublicKey(paramPublicKeyDataObject);
    setCertificateHolderReference(EACTagged.create(32, paramCertificateHolderReference.getEncoded()));
    setCertificateHolderAuthorization(paramCertificateHolderAuthorization);
    setCertificateEffectiveDate(EACTagged.create(37, paramPackedDate1.getEncoding()));
    setCertificateExpirationDate(EACTagged.create(36, paramPackedDate2.getEncoding()));
  }
  
  private CertificateBody(ASN1TaggedObject paramASN1TaggedObject) throws IOException {
    setIso7816CertificateBody(paramASN1TaggedObject);
  }
  
  private ASN1Primitive profileToASN1Object() throws IOException {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(7);
    aSN1EncodableVector.add((ASN1Encodable)this.certificateProfileIdentifier);
    aSN1EncodableVector.add((ASN1Encodable)this.certificationAuthorityReference);
    aSN1EncodableVector.add((ASN1Encodable)EACTagged.create(73, this.publicKey));
    aSN1EncodableVector.add((ASN1Encodable)this.certificateHolderReference);
    aSN1EncodableVector.add((ASN1Encodable)this.certificateHolderAuthorization);
    aSN1EncodableVector.add((ASN1Encodable)this.certificateEffectiveDate);
    aSN1EncodableVector.add((ASN1Encodable)this.certificateExpirationDate);
    return (ASN1Primitive)EACTagged.create(78, (ASN1Sequence)new DERSequence(aSN1EncodableVector));
  }
  
  private void setCertificateProfileIdentifier(ASN1TaggedObject paramASN1TaggedObject) throws IllegalArgumentException {
    if (paramASN1TaggedObject.hasTag(64, 41)) {
      this.certificateProfileIdentifier = paramASN1TaggedObject;
      this.certificateType |= 0x1;
    } else {
      throw new IllegalArgumentException("Not an Iso7816Tags.INTERCHANGE_PROFILE tag :" + paramASN1TaggedObject.getTagNo());
    } 
  }
  
  private void setCertificateHolderReference(ASN1TaggedObject paramASN1TaggedObject) throws IllegalArgumentException {
    if (paramASN1TaggedObject.hasTag(64, 32)) {
      this.certificateHolderReference = paramASN1TaggedObject;
      this.certificateType |= 0x8;
    } else {
      throw new IllegalArgumentException("Not an Iso7816Tags.CARDHOLDER_NAME tag");
    } 
  }
  
  private void setCertificationAuthorityReference(ASN1TaggedObject paramASN1TaggedObject) throws IllegalArgumentException {
    if (paramASN1TaggedObject.hasTag(64, 2)) {
      this.certificationAuthorityReference = paramASN1TaggedObject;
      this.certificateType |= 0x2;
    } else {
      throw new IllegalArgumentException("Not an Iso7816Tags.ISSUER_IDENTIFICATION_NUMBER tag");
    } 
  }
  
  private void setPublicKey(PublicKeyDataObject paramPublicKeyDataObject) {
    this.publicKey = PublicKeyDataObject.getInstance(paramPublicKeyDataObject);
    this.certificateType |= 0x4;
  }
  
  private ASN1Primitive requestToASN1Object() throws IOException {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    aSN1EncodableVector.add((ASN1Encodable)this.certificateProfileIdentifier);
    if (this.certificationAuthorityReference != null)
      aSN1EncodableVector.add((ASN1Encodable)this.certificationAuthorityReference); 
    aSN1EncodableVector.add((ASN1Encodable)EACTagged.create(73, this.publicKey));
    aSN1EncodableVector.add((ASN1Encodable)this.certificateHolderReference);
    return (ASN1Primitive)EACTagged.create(78, (ASN1Sequence)new DERSequence(aSN1EncodableVector));
  }
  
  public ASN1Primitive toASN1Primitive() {
    try {
      if ((this.certificateType & 0xFFFFFFFF) == 127)
        return profileToASN1Object(); 
      if ((this.certificateType & 0xFFFFFFFD) == 13)
        return requestToASN1Object(); 
    } catch (IOException iOException) {}
    return null;
  }
  
  public int getCertificateType() {
    return this.certificateType;
  }
  
  public static CertificateBody getInstance(Object paramObject) throws IOException {
    return (paramObject instanceof CertificateBody) ? (CertificateBody)paramObject : ((paramObject != null) ? new CertificateBody(ASN1TaggedObject.getInstance(paramObject, 64)) : null);
  }
  
  public PackedDate getCertificateEffectiveDate() {
    return ((this.certificateType & 0x20) == 32) ? new PackedDate(ASN1OctetString.getInstance(this.certificateEffectiveDate.getBaseUniversal(false, 4)).getOctets()) : null;
  }
  
  private void setCertificateEffectiveDate(ASN1TaggedObject paramASN1TaggedObject) throws IllegalArgumentException {
    if (paramASN1TaggedObject.hasTag(64, 37)) {
      this.certificateEffectiveDate = paramASN1TaggedObject;
      this.certificateType |= 0x20;
    } else {
      throw new IllegalArgumentException("Not an Iso7816Tags.APPLICATION_EFFECTIVE_DATE tag :" + paramASN1TaggedObject.getTagNo());
    } 
  }
  
  public PackedDate getCertificateExpirationDate() throws IOException {
    if ((this.certificateType & 0x40) == 64)
      return new PackedDate(ASN1OctetString.getInstance(this.certificateExpirationDate.getBaseUniversal(false, 4)).getOctets()); 
    throw new IOException("certificate Expiration Date not set");
  }
  
  private void setCertificateExpirationDate(ASN1TaggedObject paramASN1TaggedObject) throws IllegalArgumentException {
    if (paramASN1TaggedObject.hasTag(64, 36)) {
      this.certificateExpirationDate = paramASN1TaggedObject;
      this.certificateType |= 0x40;
    } else {
      throw new IllegalArgumentException("Not an Iso7816Tags.APPLICATION_EXPIRATION_DATE tag");
    } 
  }
  
  public CertificateHolderAuthorization getCertificateHolderAuthorization() throws IOException {
    if ((this.certificateType & 0x10) == 16)
      return this.certificateHolderAuthorization; 
    throw new IOException("Certificate Holder Authorisation not set");
  }
  
  private void setCertificateHolderAuthorization(CertificateHolderAuthorization paramCertificateHolderAuthorization) {
    this.certificateHolderAuthorization = paramCertificateHolderAuthorization;
    this.certificateType |= 0x10;
  }
  
  public CertificateHolderReference getCertificateHolderReference() {
    return new CertificateHolderReference(ASN1OctetString.getInstance(this.certificateHolderReference.getBaseUniversal(false, 4)).getOctets());
  }
  
  public ASN1TaggedObject getCertificateProfileIdentifier() {
    return this.certificateProfileIdentifier;
  }
  
  public CertificationAuthorityReference getCertificationAuthorityReference() throws IOException {
    if ((this.certificateType & 0x2) == 2)
      return new CertificationAuthorityReference(ASN1OctetString.getInstance(this.certificationAuthorityReference.getBaseUniversal(false, 4)).getOctets()); 
    throw new IOException("Certification authority reference not set");
  }
  
  public PublicKeyDataObject getPublicKey() {
    return this.publicKey;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\eac\CertificateBody.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */