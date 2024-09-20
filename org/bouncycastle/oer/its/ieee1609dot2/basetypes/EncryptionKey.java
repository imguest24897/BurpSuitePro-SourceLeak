package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class EncryptionKey extends ASN1Object implements ASN1Choice {
  public static final int publicOption = 0;
  
  public static final int symmetric = 1;
  
  private final int choice;
  
  private final ASN1Encodable encryptionKey;
  
  public static EncryptionKey getInstance(Object paramObject) {
    return (paramObject instanceof EncryptionKey) ? (EncryptionKey)paramObject : ((paramObject != null) ? new EncryptionKey(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public EncryptionKey(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    switch (paramInt) {
      case 0:
      case 1:
        this.encryptionKey = paramASN1Encodable;
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + paramInt);
  }
  
  public static EncryptionKey publicOption(PublicEncryptionKey paramPublicEncryptionKey) {
    return new EncryptionKey(0, (ASN1Encodable)paramPublicEncryptionKey);
  }
  
  public static EncryptionKey symmetric(SymmetricEncryptionKey paramSymmetricEncryptionKey) {
    return new EncryptionKey(1, (ASN1Encodable)paramSymmetricEncryptionKey);
  }
  
  private EncryptionKey(ASN1TaggedObject paramASN1TaggedObject) {
    this(paramASN1TaggedObject.getTagNo(), (ASN1Encodable)paramASN1TaggedObject.getExplicitBaseObject());
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getEncryptionKey() {
    return this.encryptionKey;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.encryptionKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\EncryptionKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */