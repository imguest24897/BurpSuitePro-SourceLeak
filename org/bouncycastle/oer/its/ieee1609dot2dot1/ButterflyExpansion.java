package org.bouncycastle.oer.its.ieee1609dot2dot1;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

public class ButterflyExpansion extends ASN1Object implements ASN1Choice {
  public static final int aes128 = 0;
  
  protected final int choice;
  
  protected final ASN1Encodable butterflyExpansion;
  
  ButterflyExpansion(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.butterflyExpansion = paramASN1Encodable;
  }
  
  private ButterflyExpansion(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.butterflyExpansion = (ASN1Encodable)DEROctetString.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static ButterflyExpansion getInstance(Object paramObject) {
    return (paramObject instanceof ButterflyExpansion) ? (ButterflyExpansion)paramObject : ((paramObject != null) ? new ButterflyExpansion(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public static ButterflyExpansion aes128(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte.length != 16)
      throw new IllegalArgumentException("length must be 16"); 
    return new ButterflyExpansion(0, (ASN1Encodable)new DEROctetString(paramArrayOfbyte));
  }
  
  public static ButterflyExpansion aes128(ASN1OctetString paramASN1OctetString) {
    return aes128(paramASN1OctetString.getOctets());
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.butterflyExpansion);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getButterflyExpansion() {
    return this.butterflyExpansion;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2dot1\ButterflyExpansion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */