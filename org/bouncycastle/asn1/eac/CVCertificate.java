package org.bouncycastle.asn1.eac;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

public class CVCertificate extends ASN1Object {
  private CertificateBody certificateBody;
  
  private byte[] signature;
  
  private int valid;
  
  private static int bodyValid = 1;
  
  private static int signValid = 2;
  
  private void setPrivateData(ASN1TaggedObject paramASN1TaggedObject) throws IOException {
    this.valid = 0;
    if (paramASN1TaggedObject.hasTag(64, 33)) {
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(paramASN1TaggedObject.getBaseUniversal(false, 16));
      Enumeration<Object> enumeration = aSN1Sequence.getObjects();
      while (enumeration.hasMoreElements()) {
        Object object = enumeration.nextElement();
        if (object instanceof ASN1TaggedObject) {
          ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(object, 64);
          switch (aSN1TaggedObject.getTagNo()) {
            case 78:
              this.certificateBody = CertificateBody.getInstance(aSN1TaggedObject);
              this.valid |= bodyValid;
              continue;
            case 55:
              this.signature = ASN1OctetString.getInstance(aSN1TaggedObject.getBaseUniversal(false, 4)).getOctets();
              this.valid |= signValid;
              continue;
          } 
          throw new IOException("Invalid tag, not an Iso7816CertificateStructure :" + aSN1TaggedObject.getTagNo());
        } 
        throw new IOException("Invalid Object, not an Iso7816CertificateStructure");
      } 
    } else {
      throw new IOException("not a CARDHOLDER_CERTIFICATE :" + paramASN1TaggedObject.getTagNo());
    } 
    if (this.valid != (signValid | bodyValid))
      throw new IOException("invalid CARDHOLDER_CERTIFICATE :" + paramASN1TaggedObject.getTagNo()); 
  }
  
  public CVCertificate(ASN1InputStream paramASN1InputStream) throws IOException {
    initFrom(paramASN1InputStream);
  }
  
  private void initFrom(ASN1InputStream paramASN1InputStream) throws IOException {
    ASN1Primitive aSN1Primitive;
    while ((aSN1Primitive = paramASN1InputStream.readObject()) != null) {
      if (aSN1Primitive instanceof ASN1TaggedObject) {
        setPrivateData((ASN1TaggedObject)aSN1Primitive);
        continue;
      } 
      throw new IOException("Invalid Input Stream for creating an Iso7816CertificateStructure");
    } 
  }
  
  private CVCertificate(ASN1TaggedObject paramASN1TaggedObject) throws IOException {
    setPrivateData(paramASN1TaggedObject);
  }
  
  public CVCertificate(CertificateBody paramCertificateBody, byte[] paramArrayOfbyte) throws IOException {
    this.certificateBody = paramCertificateBody;
    this.signature = Arrays.clone(paramArrayOfbyte);
    this.valid |= bodyValid;
    this.valid |= signValid;
  }
  
  public static CVCertificate getInstance(Object paramObject) {
    if (paramObject instanceof CVCertificate)
      return (CVCertificate)paramObject; 
    if (paramObject != null)
      try {
        return new CVCertificate(ASN1TaggedObject.getInstance(paramObject, 64));
      } catch (IOException iOException) {
        throw new ASN1ParsingException("unable to parse data: " + iOException.getMessage(), iOException);
      }  
    return null;
  }
  
  public byte[] getSignature() {
    return Arrays.clone(this.signature);
  }
  
  public CertificateBody getBody() {
    return this.certificateBody;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.certificateBody);
    aSN1EncodableVector.add((ASN1Encodable)EACTagged.create(55, this.signature));
    return (ASN1Primitive)EACTagged.create(33, (ASN1Sequence)new DERSequence(aSN1EncodableVector));
  }
  
  public ASN1ObjectIdentifier getHolderAuthorization() throws IOException {
    CertificateHolderAuthorization certificateHolderAuthorization = this.certificateBody.getCertificateHolderAuthorization();
    return certificateHolderAuthorization.getOid();
  }
  
  public PackedDate getEffectiveDate() throws IOException {
    return this.certificateBody.getCertificateEffectiveDate();
  }
  
  public int getCertificateType() {
    return this.certificateBody.getCertificateType();
  }
  
  public PackedDate getExpirationDate() throws IOException {
    return this.certificateBody.getCertificateExpirationDate();
  }
  
  public int getRole() throws IOException {
    CertificateHolderAuthorization certificateHolderAuthorization = this.certificateBody.getCertificateHolderAuthorization();
    return certificateHolderAuthorization.getAccessRights();
  }
  
  public CertificationAuthorityReference getAuthorityReference() throws IOException {
    return this.certificateBody.getCertificationAuthorityReference();
  }
  
  public CertificateHolderReference getHolderReference() throws IOException {
    return this.certificateBody.getCertificateHolderReference();
  }
  
  public int getHolderAuthorizationRole() throws IOException {
    int i = this.certificateBody.getCertificateHolderAuthorization().getAccessRights();
    return i & 0xC0;
  }
  
  public Flags getHolderAuthorizationRights() throws IOException {
    return new Flags(this.certificateBody.getCertificateHolderAuthorization().getAccessRights() & 0x1F);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\eac\CVCertificate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */