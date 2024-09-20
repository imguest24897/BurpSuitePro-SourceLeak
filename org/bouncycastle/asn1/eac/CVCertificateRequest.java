package org.bouncycastle.asn1.eac;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

public class CVCertificateRequest extends ASN1Object {
  private final ASN1TaggedObject original;
  
  private CertificateBody certificateBody;
  
  private byte[] innerSignature = null;
  
  private byte[] outerSignature = null;
  
  private static final int bodyValid = 1;
  
  private static final int signValid = 2;
  
  private CVCertificateRequest(ASN1TaggedObject paramASN1TaggedObject) throws IOException {
    this.original = paramASN1TaggedObject;
    if (paramASN1TaggedObject.hasTag(64, 7)) {
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(paramASN1TaggedObject.getBaseUniversal(false, 16));
      initCertBody(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(0), 64));
      this.outerSignature = ASN1OctetString.getInstance(ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1)).getBaseUniversal(false, 4)).getOctets();
    } else {
      initCertBody(paramASN1TaggedObject);
    } 
  }
  
  private void initCertBody(ASN1TaggedObject paramASN1TaggedObject) throws IOException {
    if (paramASN1TaggedObject.hasTag(64, 33)) {
      int i = 0;
      ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(paramASN1TaggedObject.getBaseUniversal(false, 16));
      Enumeration enumeration = aSN1Sequence.getObjects();
      while (enumeration.hasMoreElements()) {
        ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(enumeration.nextElement(), 64);
        switch (aSN1TaggedObject.getTagNo()) {
          case 78:
            this.certificateBody = CertificateBody.getInstance(aSN1TaggedObject);
            i |= 0x1;
            continue;
          case 55:
            this.innerSignature = ASN1OctetString.getInstance(aSN1TaggedObject.getBaseUniversal(false, 4)).getOctets();
            i |= 0x2;
            continue;
        } 
        throw new IOException("Invalid tag, not an CV Certificate Request element:" + aSN1TaggedObject.getTagNo());
      } 
      if ((i & 0x3) == 0)
        throw new IOException("Invalid CARDHOLDER_CERTIFICATE in request:" + paramASN1TaggedObject.getTagNo()); 
    } else {
      throw new IOException("not a CARDHOLDER_CERTIFICATE in request:" + paramASN1TaggedObject.getTagNo());
    } 
  }
  
  public static CVCertificateRequest getInstance(Object paramObject) {
    if (paramObject instanceof CVCertificateRequest)
      return (CVCertificateRequest)paramObject; 
    if (paramObject != null)
      try {
        return new CVCertificateRequest(ASN1TaggedObject.getInstance(paramObject, 64));
      } catch (IOException iOException) {
        throw new ASN1ParsingException("unable to parse data: " + iOException.getMessage(), iOException);
      }  
    return null;
  }
  
  public CertificateBody getCertificateBody() {
    return this.certificateBody;
  }
  
  public PublicKeyDataObject getPublicKey() {
    return this.certificateBody.getPublicKey();
  }
  
  public byte[] getInnerSignature() {
    return Arrays.clone(this.innerSignature);
  }
  
  public byte[] getOuterSignature() {
    return Arrays.clone(this.outerSignature);
  }
  
  public boolean hasOuterSignature() {
    return (this.outerSignature != null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    if (this.original != null)
      return (ASN1Primitive)this.original; 
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.certificateBody);
    aSN1EncodableVector.add((ASN1Encodable)EACTagged.create(55, this.innerSignature));
    return (ASN1Primitive)EACTagged.create(33, (ASN1Sequence)new DERSequence(aSN1EncodableVector));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\eac\CVCertificateRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */