package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.EciesP256EncryptedKey;

public class EncryptedDataEncryptionKey extends ASN1Object implements ASN1Choice {
  public static final int eciesNistP256 = 0;
  
  public static final int eciesBrainpoolP256r1 = 1;
  
  private final int choice;
  
  private final ASN1Encodable encryptedDataEncryptionKey;
  
  public EncryptedDataEncryptionKey(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.encryptedDataEncryptionKey = paramASN1Encodable;
  }
  
  private EncryptedDataEncryptionKey(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (paramASN1TaggedObject.getTagNo()) {
      case 0:
      case 1:
        this.encryptedDataEncryptionKey = (ASN1Encodable)EciesP256EncryptedKey.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + paramASN1TaggedObject.getTagNo());
  }
  
  public static EncryptedDataEncryptionKey getInstance(Object paramObject) {
    return (paramObject instanceof EncryptedDataEncryptionKey) ? (EncryptedDataEncryptionKey)paramObject : ((paramObject != null) ? new EncryptedDataEncryptionKey(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getEncryptedDataEncryptionKey() {
    return this.encryptedDataEncryptionKey;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.encryptedDataEncryptionKey);
  }
  
  public static EncryptedDataEncryptionKey eciesNistP256(EciesP256EncryptedKey paramEciesP256EncryptedKey) {
    return new EncryptedDataEncryptionKey(0, (ASN1Encodable)paramEciesP256EncryptedKey);
  }
  
  public static EncryptedDataEncryptionKey eciesBrainpoolP256r1(EciesP256EncryptedKey paramEciesP256EncryptedKey) {
    return new EncryptedDataEncryptionKey(1, (ASN1Encodable)paramEciesP256EncryptedKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\EncryptedDataEncryptionKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */