package org.bouncycastle.asn1.eac;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

class EACTagged {
  static ASN1TaggedObject create(int paramInt, ASN1Sequence paramASN1Sequence) {
    return (ASN1TaggedObject)new DERTaggedObject(false, 64, paramInt, (ASN1Encodable)paramASN1Sequence);
  }
  
  static ASN1TaggedObject create(int paramInt, PublicKeyDataObject paramPublicKeyDataObject) {
    return (ASN1TaggedObject)new DERTaggedObject(false, 64, paramInt, (ASN1Encodable)paramPublicKeyDataObject);
  }
  
  static ASN1TaggedObject create(int paramInt, byte[] paramArrayOfbyte) {
    return (ASN1TaggedObject)new DERTaggedObject(false, 64, paramInt, (ASN1Encodable)new DEROctetString(paramArrayOfbyte));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\eac\EACTagged.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */