package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;

public class AltSignatureValue extends ASN1Object {
  private final ASN1BitString signature;
  
  public static AltSignatureValue getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1BitString.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public static AltSignatureValue getInstance(Object paramObject) {
    return (paramObject instanceof AltSignatureValue) ? (AltSignatureValue)paramObject : ((paramObject != null) ? new AltSignatureValue(ASN1BitString.getInstance(paramObject)) : null);
  }
  
  public static AltSignatureValue fromExtensions(Extensions paramExtensions) {
    return getInstance(Extensions.getExtensionParsedValue(paramExtensions, Extension.altSignatureValue));
  }
  
  private AltSignatureValue(ASN1BitString paramASN1BitString) {
    this.signature = paramASN1BitString;
  }
  
  public AltSignatureValue(byte[] paramArrayOfbyte) {
    this.signature = (ASN1BitString)new DERBitString(paramArrayOfbyte);
  }
  
  public ASN1BitString getSignature() {
    return this.signature;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.signature;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x509\AltSignatureValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */