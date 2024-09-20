package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

public class SymmetricEncryptionKey extends ASN1Object implements ASN1Choice {
  public static final int aes128ccm = 0;
  
  private final int choice;
  
  private final ASN1Encodable symmetricEncryptionKey;
  
  public SymmetricEncryptionKey(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.symmetricEncryptionKey = paramASN1Encodable;
  }
  
  private SymmetricEncryptionKey(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    if (this.choice == 0) {
      ASN1OctetString aSN1OctetString = DEROctetString.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
      if ((aSN1OctetString.getOctets()).length != 16)
        throw new IllegalArgumentException("aes128ccm string not 16 bytes"); 
      this.symmetricEncryptionKey = (ASN1Encodable)aSN1OctetString;
    } else {
      throw new IllegalArgumentException("invalid choice value " + this.choice);
    } 
  }
  
  public static SymmetricEncryptionKey getInstance(Object paramObject) {
    return (paramObject instanceof SymmetricEncryptionKey) ? (SymmetricEncryptionKey)paramObject : ((paramObject != null) ? new SymmetricEncryptionKey(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public static SymmetricEncryptionKey aes128ccm(byte[] paramArrayOfbyte) {
    return new SymmetricEncryptionKey(0, (ASN1Encodable)new DEROctetString(paramArrayOfbyte));
  }
  
  public static SymmetricEncryptionKey aes128ccm(ASN1OctetString paramASN1OctetString) {
    return new SymmetricEncryptionKey(0, (ASN1Encodable)paramASN1OctetString);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getSymmetricEncryptionKey() {
    return this.symmetricEncryptionKey;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.symmetricEncryptionKey);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SymmetricEncryptionKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */