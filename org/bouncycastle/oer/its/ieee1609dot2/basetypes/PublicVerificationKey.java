package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

public class PublicVerificationKey extends ASN1Object implements ASN1Choice {
  public static final int ecdsaNistP256 = 0;
  
  public static final int ecdsaBrainpoolP256r1 = 1;
  
  public static final int ecdsaBrainpoolP384r1 = 2;
  
  private final int choice;
  
  private final ASN1Encodable publicVerificationKey;
  
  public PublicVerificationKey(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.publicVerificationKey = paramASN1Encodable;
  }
  
  private PublicVerificationKey(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
      case 1:
        this.publicVerificationKey = (ASN1Encodable)EccP256CurvePoint.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 2:
        this.publicVerificationKey = (ASN1Encodable)EccP384CurvePoint.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + paramASN1TaggedObject.getTagNo());
  }
  
  public static PublicVerificationKey ecdsaNistP256(EccP256CurvePoint paramEccP256CurvePoint) {
    return new PublicVerificationKey(0, (ASN1Encodable)paramEccP256CurvePoint);
  }
  
  public static PublicVerificationKey ecdsaBrainpoolP256r1(EccP256CurvePoint paramEccP256CurvePoint) {
    return new PublicVerificationKey(1, (ASN1Encodable)paramEccP256CurvePoint);
  }
  
  public static PublicVerificationKey ecdsaBrainpoolP384r1(EccP384CurvePoint paramEccP384CurvePoint) {
    return new PublicVerificationKey(2, (ASN1Encodable)paramEccP384CurvePoint);
  }
  
  public static PublicVerificationKey getInstance(Object paramObject) {
    return (paramObject instanceof PublicVerificationKey) ? (PublicVerificationKey)paramObject : ((paramObject != null) ? new PublicVerificationKey(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getPublicVerificationKey() {
    return this.publicVerificationKey;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.publicVerificationKey);
  }
  
  public static class Builder {
    private int choice;
    
    private ASN1Encodable curvePoint;
    
    public Builder setChoice(int param1Int) {
      this.choice = param1Int;
      return this;
    }
    
    public Builder setCurvePoint(EccCurvePoint param1EccCurvePoint) {
      this.curvePoint = (ASN1Encodable)param1EccCurvePoint;
      return this;
    }
    
    public Builder ecdsaNistP256(EccP256CurvePoint param1EccP256CurvePoint) {
      this.curvePoint = (ASN1Encodable)param1EccP256CurvePoint;
      return this;
    }
    
    public Builder ecdsaBrainpoolP256r1(EccP256CurvePoint param1EccP256CurvePoint) {
      this.curvePoint = (ASN1Encodable)param1EccP256CurvePoint;
      return this;
    }
    
    public Builder ecdsaBrainpoolP384r1(EccP384CurvePoint param1EccP384CurvePoint) {
      this.curvePoint = (ASN1Encodable)param1EccP384CurvePoint;
      return this;
    }
    
    public Builder extension(byte[] param1ArrayOfbyte) {
      this.curvePoint = (ASN1Encodable)new DEROctetString(param1ArrayOfbyte);
      return this;
    }
    
    public PublicVerificationKey createPublicVerificationKey() {
      return new PublicVerificationKey(this.choice, this.curvePoint);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\PublicVerificationKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */