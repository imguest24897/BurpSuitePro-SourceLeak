package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

public class SignerIdentifier extends ASN1Object implements ASN1Choice {
  public static final int digest = 0;
  
  public static final int certificate = 1;
  
  public static final int self = 2;
  
  private final int choice;
  
  private final ASN1Encodable signerIdentifier;
  
  public SignerIdentifier(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.signerIdentifier = paramASN1Encodable;
  }
  
  private SignerIdentifier(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.signerIdentifier = (ASN1Encodable)HashedId8.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this.signerIdentifier = (ASN1Encodable)SequenceOfCertificate.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 2:
        this.signerIdentifier = (ASN1Encodable)DERNull.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static SignerIdentifier getInstance(Object paramObject) {
    return (paramObject instanceof SignerIdentifier) ? (SignerIdentifier)paramObject : ((paramObject != null) ? new SignerIdentifier(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public static SignerIdentifier digest(HashedId8 paramHashedId8) {
    return new SignerIdentifier(0, (ASN1Encodable)paramHashedId8);
  }
  
  public static SignerIdentifier certificate(SequenceOfCertificate paramSequenceOfCertificate) {
    return new SignerIdentifier(1, (ASN1Encodable)paramSequenceOfCertificate);
  }
  
  public static SignerIdentifier self() {
    return new SignerIdentifier(2, (ASN1Encodable)DERNull.INSTANCE);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.signerIdentifier);
  }
  
  public ASN1Encodable getSignerIdentifier() {
    return this.signerIdentifier;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\SignerIdentifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */