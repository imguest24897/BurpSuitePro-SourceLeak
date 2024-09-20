package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class SymmetricCiphertext extends ASN1Object implements ASN1Choice {
  public static final int aes128ccm = 0;
  
  private final int choice;
  
  private final ASN1Encodable symmetricCiphertext;
  
  public SymmetricCiphertext(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.symmetricCiphertext = paramASN1Encodable;
  }
  
  private SymmetricCiphertext(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.symmetricCiphertext = (ASN1Encodable)AesCcmCiphertext.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static SymmetricCiphertext aes128ccm(AesCcmCiphertext paramAesCcmCiphertext) {
    return new SymmetricCiphertext(0, (ASN1Encodable)paramAesCcmCiphertext);
  }
  
  public static SymmetricCiphertext getInstance(Object paramObject) {
    return (paramObject instanceof SymmetricCiphertext) ? (SymmetricCiphertext)paramObject : ((paramObject != null) ? new SymmetricCiphertext(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getSymmetricCiphertext() {
    return this.symmetricCiphertext;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.symmetricCiphertext);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\SymmetricCiphertext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */