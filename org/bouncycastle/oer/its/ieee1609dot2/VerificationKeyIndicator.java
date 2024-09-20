package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EccP256CurvePoint;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.PublicVerificationKey;

public class VerificationKeyIndicator extends ASN1Object implements ASN1Choice {
  public static final int verificationKey = 0;
  
  public static final int reconstructionValue = 1;
  
  private final int choice;
  
  private final ASN1Encodable verificationKeyIndicator;
  
  public VerificationKeyIndicator(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.verificationKeyIndicator = paramASN1Encodable;
  }
  
  private VerificationKeyIndicator(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.verificationKeyIndicator = (ASN1Encodable)PublicVerificationKey.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this.verificationKeyIndicator = (ASN1Encodable)EccP256CurvePoint.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static VerificationKeyIndicator verificationKey(PublicVerificationKey paramPublicVerificationKey) {
    return new VerificationKeyIndicator(0, (ASN1Encodable)paramPublicVerificationKey);
  }
  
  public static VerificationKeyIndicator reconstructionValue(EccP256CurvePoint paramEccP256CurvePoint) {
    return new VerificationKeyIndicator(1, (ASN1Encodable)paramEccP256CurvePoint);
  }
  
  public static VerificationKeyIndicator getInstance(Object paramObject) {
    return (paramObject instanceof VerificationKeyIndicator) ? (VerificationKeyIndicator)paramObject : ((paramObject != null) ? new VerificationKeyIndicator(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getVerificationKeyIndicator() {
    return this.verificationKeyIndicator;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.verificationKeyIndicator);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\VerificationKeyIndicator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */