package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;

public class SspRange extends ASN1Object implements ASN1Choice {
  public static final int opaque = 0;
  
  public static final int all = 1;
  
  public static final int bitmapSspRange = 2;
  
  private final int choice;
  
  private final ASN1Encodable sspRange;
  
  public static SspRange opaque(SequenceOfOctetString paramSequenceOfOctetString) {
    return new SspRange(0, (ASN1Encodable)paramSequenceOfOctetString);
  }
  
  public static SspRange all() {
    return new SspRange(1, (ASN1Encodable)DERNull.INSTANCE);
  }
  
  public static SspRange bitmapSspRange(BitmapSspRange paramBitmapSspRange) {
    return new SspRange(2, (ASN1Encodable)paramBitmapSspRange);
  }
  
  public SspRange(int paramInt, ASN1Encodable paramASN1Encodable) {
    switch (paramInt) {
      case 0:
      case 1:
      case 2:
        break;
      default:
        throw new IllegalArgumentException("invalid choice value " + paramInt);
    } 
    this.choice = paramInt;
    this.sspRange = paramASN1Encodable;
  }
  
  private SspRange(ASN1TaggedObject paramASN1TaggedObject) {
    this(paramASN1TaggedObject.getTagNo(), (ASN1Encodable)paramASN1TaggedObject.getExplicitBaseObject());
  }
  
  public static SspRange getInstance(Object paramObject) {
    return (paramObject instanceof SspRange) ? (SspRange)paramObject : ((paramObject != null) ? new SspRange(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getSspRange() {
    return this.sspRange;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.sspRange);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SspRange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */