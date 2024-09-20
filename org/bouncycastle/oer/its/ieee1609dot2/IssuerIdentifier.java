package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashAlgorithm;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

public class IssuerIdentifier extends ASN1Object implements ASN1Choice {
  public static final int sha256AndDigest = 0;
  
  public static final int self = 1;
  
  public static final int sha384AndDigest = 2;
  
  private final int choice;
  
  private final ASN1Encodable issuerIdentifier;
  
  public static IssuerIdentifier sha256AndDigest(HashedId8 paramHashedId8) {
    return new IssuerIdentifier(0, (ASN1Encodable)paramHashedId8);
  }
  
  public static IssuerIdentifier self(HashAlgorithm paramHashAlgorithm) {
    return new IssuerIdentifier(1, (ASN1Encodable)paramHashAlgorithm);
  }
  
  public static IssuerIdentifier sha384AndDigest(HashedId8 paramHashedId8) {
    return new IssuerIdentifier(2, (ASN1Encodable)paramHashedId8);
  }
  
  public IssuerIdentifier(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.issuerIdentifier = paramASN1Encodable;
  }
  
  private IssuerIdentifier(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    ASN1Object aSN1Object = paramASN1TaggedObject.getExplicitBaseObject();
    switch (this.choice) {
      case 0:
      case 2:
        this.issuerIdentifier = (ASN1Encodable)HashedId8.getInstance(aSN1Object);
        return;
      case 1:
        this.issuerIdentifier = (ASN1Encodable)HashAlgorithm.getInstance(aSN1Object);
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static IssuerIdentifier getInstance(Object paramObject) {
    return (paramObject instanceof IssuerIdentifier) ? (IssuerIdentifier)paramObject : ((paramObject != null) ? new IssuerIdentifier(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public boolean isSelf() {
    return (this.choice == 1);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getIssuerIdentifier() {
    return this.issuerIdentifier;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.issuerIdentifier);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\IssuerIdentifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */