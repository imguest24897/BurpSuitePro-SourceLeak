package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.Opaque;

public class ServiceSpecificPermissions extends ASN1Object implements ASN1Choice {
  public static final int opaque = 0;
  
  public static final int bitmapSsp = 1;
  
  private final int choice;
  
  private final ASN1Encodable serviceSpecificPermissions;
  
  public ServiceSpecificPermissions(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.serviceSpecificPermissions = paramASN1Encodable;
  }
  
  private ServiceSpecificPermissions(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.serviceSpecificPermissions = (ASN1Encodable)Opaque.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this.serviceSpecificPermissions = (ASN1Encodable)BitmapSsp.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static ServiceSpecificPermissions getInstance(Object paramObject) {
    return (paramObject instanceof ServiceSpecificPermissions) ? (ServiceSpecificPermissions)paramObject : ((paramObject != null) ? new ServiceSpecificPermissions(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public static ServiceSpecificPermissions opaque(ASN1OctetString paramASN1OctetString) {
    return new ServiceSpecificPermissions(0, (ASN1Encodable)paramASN1OctetString);
  }
  
  public static ServiceSpecificPermissions opaque(byte[] paramArrayOfbyte) {
    return new ServiceSpecificPermissions(0, (ASN1Encodable)new DEROctetString(paramArrayOfbyte));
  }
  
  public static ServiceSpecificPermissions bitmapSsp(BitmapSsp paramBitmapSsp) {
    return new ServiceSpecificPermissions(1, (ASN1Encodable)paramBitmapSsp);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getServiceSpecificPermissions() {
    return this.serviceSpecificPermissions;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.serviceSpecificPermissions);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\ServiceSpecificPermissions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */