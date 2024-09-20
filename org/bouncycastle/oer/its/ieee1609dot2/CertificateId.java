package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Hostname;

public class CertificateId extends ASN1Object implements ASN1Choice {
  public static final int linkageData = 0;
  
  public static final int name = 1;
  
  public static final int binaryId = 2;
  
  public static final int none = 3;
  
  private final int choice;
  
  private final ASN1Encodable certificateId;
  
  public CertificateId(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.certificateId = paramASN1Encodable;
  }
  
  private CertificateId(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.certificateId = (ASN1Encodable)LinkageData.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this.certificateId = (ASN1Encodable)Hostname.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 2:
        this.certificateId = (ASN1Encodable)DEROctetString.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 3:
        this.certificateId = (ASN1Encodable)ASN1Null.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static CertificateId linkageData(LinkageData paramLinkageData) {
    return new CertificateId(0, (ASN1Encodable)paramLinkageData);
  }
  
  public static CertificateId name(Hostname paramHostname) {
    return new CertificateId(1, (ASN1Encodable)paramHostname);
  }
  
  public static CertificateId binaryId(ASN1OctetString paramASN1OctetString) {
    return new CertificateId(2, (ASN1Encodable)paramASN1OctetString);
  }
  
  public static CertificateId binaryId(byte[] paramArrayOfbyte) {
    return new CertificateId(2, (ASN1Encodable)new DEROctetString(paramArrayOfbyte));
  }
  
  public static CertificateId none() {
    return new CertificateId(3, (ASN1Encodable)DERNull.INSTANCE);
  }
  
  public static CertificateId getInstance(Object paramObject) {
    return (paramObject instanceof CertificateId) ? (CertificateId)paramObject : ((paramObject != null) ? new CertificateId(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (new DERTaggedObject(this.choice, this.certificateId)).toASN1Primitive();
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getCertificateId() {
    return this.certificateId;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\CertificateId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */