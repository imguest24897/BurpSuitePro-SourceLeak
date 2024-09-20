package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class RecipientInfo extends ASN1Object implements ASN1Choice {
  public static final int pskRecipInfo = 0;
  
  public static final int symmRecipInfo = 1;
  
  public static final int certRecipInfo = 2;
  
  public static final int signedDataRecipInfo = 3;
  
  public static final int rekRecipInfo = 4;
  
  private final int choice;
  
  private final ASN1Encodable recipientInfo;
  
  public RecipientInfo(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.recipientInfo = paramASN1Encodable;
  }
  
  private RecipientInfo(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.recipientInfo = (ASN1Encodable)PreSharedKeyRecipientInfo.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this.recipientInfo = (ASN1Encodable)SymmRecipientInfo.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 2:
      case 3:
      case 4:
        this.recipientInfo = (ASN1Encodable)PKRecipientInfo.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static RecipientInfo getInstance(Object paramObject) {
    return (paramObject instanceof RecipientInfo) ? (RecipientInfo)paramObject : ((paramObject != null) ? new RecipientInfo(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getRecipientInfo() {
    return this.recipientInfo;
  }
  
  public static RecipientInfo pskRecipInfo(PreSharedKeyRecipientInfo paramPreSharedKeyRecipientInfo) {
    return new RecipientInfo(0, (ASN1Encodable)paramPreSharedKeyRecipientInfo);
  }
  
  public static RecipientInfo symmRecipInfo(SymmRecipientInfo paramSymmRecipientInfo) {
    return new RecipientInfo(1, (ASN1Encodable)paramSymmRecipientInfo);
  }
  
  public static RecipientInfo certRecipInfo(PKRecipientInfo paramPKRecipientInfo) {
    return new RecipientInfo(2, (ASN1Encodable)paramPKRecipientInfo);
  }
  
  public static RecipientInfo signedDataRecipInfo(PKRecipientInfo paramPKRecipientInfo) {
    return new RecipientInfo(3, (ASN1Encodable)paramPKRecipientInfo);
  }
  
  public static RecipientInfo rekRecipInfo(PKRecipientInfo paramPKRecipientInfo) {
    return new RecipientInfo(4, (ASN1Encodable)paramPKRecipientInfo);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.recipientInfo);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\RecipientInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */