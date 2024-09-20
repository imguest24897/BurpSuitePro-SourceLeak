package org.bouncycastle.oer.its.ieee1609dot2dot1;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicEncryptionKey;

public class AdditionalParams extends ASN1Object implements ASN1Choice {
  public static final int original = 0;
  
  public static final int unified = 1;
  
  public static final int compactUnified = 2;
  
  public static final int encryptionKey = 3;
  
  protected final int choice;
  
  protected final ASN1Encodable additionalParams;
  
  private AdditionalParams(int paramInt, ASN1Encodable paramASN1Encodable) {
    switch (paramInt) {
      case 0:
        this.additionalParams = (ASN1Encodable)ButterflyParamsOriginal.getInstance(paramASN1Encodable);
        break;
      case 1:
      case 2:
        this.additionalParams = (ASN1Encodable)ButterflyExpansion.getInstance(paramASN1Encodable);
        break;
      case 3:
        this.additionalParams = (ASN1Encodable)PublicEncryptionKey.getInstance(paramASN1Encodable);
        break;
      default:
        throw new IllegalArgumentException("invalid choice value " + paramInt);
    } 
    this.choice = paramInt;
  }
  
  private AdditionalParams(ASN1TaggedObject paramASN1TaggedObject) {
    this(paramASN1TaggedObject.getTagNo(), (ASN1Encodable)paramASN1TaggedObject.getExplicitBaseObject());
  }
  
  public static AdditionalParams getInstance(Object paramObject) {
    return (paramObject instanceof AdditionalParams) ? (AdditionalParams)paramObject : ((paramObject != null) ? new AdditionalParams(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public static AdditionalParams original(ButterflyParamsOriginal paramButterflyParamsOriginal) {
    return new AdditionalParams(0, (ASN1Encodable)paramButterflyParamsOriginal);
  }
  
  public static AdditionalParams unified(ButterflyExpansion paramButterflyExpansion) {
    return new AdditionalParams(1, (ASN1Encodable)paramButterflyExpansion);
  }
  
  public static AdditionalParams compactUnified(ButterflyExpansion paramButterflyExpansion) {
    return new AdditionalParams(2, (ASN1Encodable)paramButterflyExpansion);
  }
  
  public static AdditionalParams encryptionKey(PublicEncryptionKey paramPublicEncryptionKey) {
    return new AdditionalParams(3, (ASN1Encodable)paramPublicEncryptionKey);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getAdditionalParams() {
    return this.additionalParams;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.additionalParams);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2dot1\AdditionalParams.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */