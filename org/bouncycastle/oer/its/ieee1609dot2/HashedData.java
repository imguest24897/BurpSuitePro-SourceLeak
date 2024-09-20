package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Arrays;

public class HashedData extends ASN1Object implements ASN1Choice {
  public static final int sha256HashedData = 0;
  
  public static final int sha384HashedData = 1;
  
  public static final int reserved = 2;
  
  private final int choice;
  
  private final ASN1Encodable hashedData;
  
  public HashedData(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.hashedData = paramASN1Encodable;
  }
  
  private HashedData(ASN1TaggedObject paramASN1TaggedObject) {
    switch (paramASN1TaggedObject.getTagNo()) {
      case 0:
      case 1:
      case 2:
        this.choice = paramASN1TaggedObject.getTagNo();
        this.hashedData = (ASN1Encodable)DEROctetString.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + paramASN1TaggedObject.getTagNo());
  }
  
  public static HashedData sha256HashedData(ASN1OctetString paramASN1OctetString) {
    return new HashedData(0, (ASN1Encodable)paramASN1OctetString);
  }
  
  public static HashedData sha256HashedData(byte[] paramArrayOfbyte) {
    return new HashedData(0, (ASN1Encodable)new DEROctetString(Arrays.clone(paramArrayOfbyte)));
  }
  
  public static HashedData sha384HashedData(ASN1OctetString paramASN1OctetString) {
    return new HashedData(1, (ASN1Encodable)paramASN1OctetString);
  }
  
  public static HashedData sha384HashedData(byte[] paramArrayOfbyte) {
    return new HashedData(1, (ASN1Encodable)new DEROctetString(Arrays.clone(paramArrayOfbyte)));
  }
  
  public static HashedData reserved(ASN1OctetString paramASN1OctetString) {
    return new HashedData(2, (ASN1Encodable)paramASN1OctetString);
  }
  
  public static HashedData reserved(byte[] paramArrayOfbyte) {
    return new HashedData(2, (ASN1Encodable)new DEROctetString(Arrays.clone(paramArrayOfbyte)));
  }
  
  public static HashedData getInstance(Object paramObject) {
    return (paramObject instanceof HashedData) ? (HashedData)paramObject : ((paramObject != null) ? new HashedData(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getHashedData() {
    return this.hashedData;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.hashedData);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\HashedData.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */