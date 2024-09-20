package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Arrays;

public class Ieee1609Dot2Content extends ASN1Object implements ASN1Choice {
  public static final int unsecuredData = 0;
  
  public static final int signedData = 1;
  
  public static final int encryptedData = 2;
  
  public static final int signedCertificateRequest = 3;
  
  private final int choice;
  
  private final ASN1Encodable ieee1609Dot2Content;
  
  public Ieee1609Dot2Content(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.ieee1609Dot2Content = paramASN1Encodable;
  }
  
  public static Ieee1609Dot2Content unsecuredData(Opaque paramOpaque) {
    return new Ieee1609Dot2Content(0, (ASN1Encodable)paramOpaque);
  }
  
  public static Ieee1609Dot2Content unsecuredData(byte[] paramArrayOfbyte) {
    return new Ieee1609Dot2Content(0, (ASN1Encodable)new DEROctetString(Arrays.clone(paramArrayOfbyte)));
  }
  
  public static Ieee1609Dot2Content signedData(SignedData paramSignedData) {
    return new Ieee1609Dot2Content(1, (ASN1Encodable)paramSignedData);
  }
  
  public static Ieee1609Dot2Content encryptedData(EncryptedData paramEncryptedData) {
    return new Ieee1609Dot2Content(2, (ASN1Encodable)paramEncryptedData);
  }
  
  public static Ieee1609Dot2Content signedCertificateRequest(Opaque paramOpaque) {
    return new Ieee1609Dot2Content(3, (ASN1Encodable)paramOpaque);
  }
  
  public static Ieee1609Dot2Content signedCertificateRequest(byte[] paramArrayOfbyte) {
    return new Ieee1609Dot2Content(3, (ASN1Encodable)new DEROctetString(Arrays.clone(paramArrayOfbyte)));
  }
  
  private Ieee1609Dot2Content(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
      case 3:
        this.ieee1609Dot2Content = (ASN1Encodable)Opaque.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this.ieee1609Dot2Content = (ASN1Encodable)SignedData.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 2:
        this.ieee1609Dot2Content = (ASN1Encodable)EncryptedData.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + paramASN1TaggedObject.getTagNo());
  }
  
  public static Ieee1609Dot2Content getInstance(Object paramObject) {
    return (paramObject instanceof Ieee1609Dot2Content) ? (Ieee1609Dot2Content)paramObject : ((paramObject != null) ? new Ieee1609Dot2Content(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.ieee1609Dot2Content);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getIeee1609Dot2Content() {
    return this.ieee1609Dot2Content;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\Ieee1609Dot2Content.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */