package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class Signature extends ASN1Object implements ASN1Choice {
  public static final int ecdsaNistP256Signature = 0;
  
  public static final int ecdsaBrainpoolP256r1Signature = 1;
  
  public static final int ecdsaBrainpoolP384r1Signature = 2;
  
  private final int choice;
  
  private final ASN1Encodable signature;
  
  public Signature(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.signature = paramASN1Encodable;
  }
  
  public static Signature ecdsaNistP256Signature(EcdsaP256Signature paramEcdsaP256Signature) {
    return new Signature(0, (ASN1Encodable)paramEcdsaP256Signature);
  }
  
  public static Signature ecdsaBrainpoolP256r1Signature(EcdsaP256Signature paramEcdsaP256Signature) {
    return new Signature(1, (ASN1Encodable)paramEcdsaP256Signature);
  }
  
  public static Signature ecdsaBrainpoolP384r1Signature(EcdsaP384Signature paramEcdsaP384Signature) {
    return new Signature(2, (ASN1Encodable)paramEcdsaP384Signature);
  }
  
  private Signature(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
      case 1:
        this.signature = (ASN1Encodable)EcdsaP256Signature.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 2:
        this.signature = (ASN1Encodable)EcdsaP384Signature.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + paramASN1TaggedObject.getTagNo());
  }
  
  public static Signature getInstance(Object paramObject) {
    return (paramObject instanceof Signature) ? (Signature)paramObject : ((paramObject != null) ? new Signature(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getSignature() {
    return this.signature;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.signature);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\Signature.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */