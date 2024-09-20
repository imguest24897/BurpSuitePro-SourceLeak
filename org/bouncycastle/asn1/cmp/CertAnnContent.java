package org.bouncycastle.asn1.cmp;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;

public class CertAnnContent extends CMPCertificate {
  public CertAnnContent(AttributeCertificate paramAttributeCertificate) {
    super(paramAttributeCertificate);
  }
  
  public CertAnnContent(int paramInt, ASN1Object paramASN1Object) {
    super(paramInt, paramASN1Object);
  }
  
  public CertAnnContent(Certificate paramCertificate) {
    super(paramCertificate);
  }
  
  public static CertAnnContent getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    if (paramASN1TaggedObject != null) {
      if (paramBoolean)
        return getInstance(paramASN1TaggedObject.getExplicitBaseObject()); 
      throw new IllegalArgumentException("tag must be explicit");
    } 
    return null;
  }
  
  public static CertAnnContent getInstance(Object paramObject) {
    if (paramObject == null || paramObject instanceof CertAnnContent)
      return (CertAnnContent)paramObject; 
    if (paramObject instanceof CMPCertificate)
      try {
        return getInstance(((CMPCertificate)paramObject).getEncoded());
      } catch (IOException iOException) {
        throw new IllegalArgumentException(iOException.getMessage(), iOException);
      }  
    if (paramObject instanceof byte[])
      try {
        paramObject = ASN1Primitive.fromByteArray((byte[])paramObject);
      } catch (IOException iOException) {
        throw new IllegalArgumentException("Invalid encoding in CertAnnContent");
      }  
    if (paramObject instanceof org.bouncycastle.asn1.ASN1Sequence)
      return new CertAnnContent(Certificate.getInstance(paramObject)); 
    if (paramObject instanceof ASN1TaggedObject) {
      ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(paramObject, 128);
      return new CertAnnContent(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getExplicitBaseObject());
    } 
    throw new IllegalArgumentException("Invalid object: " + paramObject.getClass().getName());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\CertAnnContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */