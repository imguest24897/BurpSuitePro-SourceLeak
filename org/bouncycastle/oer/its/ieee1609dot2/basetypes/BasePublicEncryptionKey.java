package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class BasePublicEncryptionKey extends ASN1Object implements ASN1Choice {
  public static final int eciesNistP256 = 0;
  
  public static final int eciesBrainpoolP256r1 = 1;
  
  private final int choice;
  
  private final ASN1Encodable basePublicEncryptionKey;
  
  private BasePublicEncryptionKey(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
      case 1:
        this.basePublicEncryptionKey = (ASN1Encodable)EccP256CurvePoint.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + paramASN1TaggedObject.getTagNo());
  }
  
  public BasePublicEncryptionKey(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.basePublicEncryptionKey = paramASN1Encodable;
  }
  
  public static BasePublicEncryptionKey getInstance(Object paramObject) {
    return (paramObject instanceof BasePublicEncryptionKey) ? (BasePublicEncryptionKey)paramObject : ((paramObject != null) ? new BasePublicEncryptionKey(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public static BasePublicEncryptionKey eciesNistP256(EccP256CurvePoint paramEccP256CurvePoint) {
    return new BasePublicEncryptionKey(0, (ASN1Encodable)paramEccP256CurvePoint);
  }
  
  public static BasePublicEncryptionKey eciesBrainpoolP256r1(EccP256CurvePoint paramEccP256CurvePoint) {
    return new BasePublicEncryptionKey(1, (ASN1Encodable)paramEccP256CurvePoint);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getBasePublicEncryptionKey() {
    return this.basePublicEncryptionKey;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.basePublicEncryptionKey);
  }
  
  public static class Builder {
    private int choice;
    
    private ASN1Encodable value;
    
    public Builder setChoice(int param1Int) {
      this.choice = param1Int;
      return this;
    }
    
    public Builder setValue(EccCurvePoint param1EccCurvePoint) {
      this.value = (ASN1Encodable)param1EccCurvePoint;
      return this;
    }
    
    public BasePublicEncryptionKey createBasePublicEncryptionKey() {
      return new BasePublicEncryptionKey(this.choice, this.value);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\BasePublicEncryptionKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */