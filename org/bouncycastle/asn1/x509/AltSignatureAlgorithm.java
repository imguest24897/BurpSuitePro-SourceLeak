package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

public class AltSignatureAlgorithm extends ASN1Object {
  private final AlgorithmIdentifier algorithm;
  
  public static AltSignatureAlgorithm getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(AlgorithmIdentifier.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public static AltSignatureAlgorithm getInstance(Object paramObject) {
    return (paramObject instanceof AltSignatureAlgorithm) ? (AltSignatureAlgorithm)paramObject : ((paramObject != null) ? new AltSignatureAlgorithm(AlgorithmIdentifier.getInstance(paramObject)) : null);
  }
  
  public static AltSignatureAlgorithm fromExtensions(Extensions paramExtensions) {
    return getInstance(Extensions.getExtensionParsedValue(paramExtensions, Extension.altSignatureAlgorithm));
  }
  
  public AltSignatureAlgorithm(AlgorithmIdentifier paramAlgorithmIdentifier) {
    this.algorithm = paramAlgorithmIdentifier;
  }
  
  public AltSignatureAlgorithm(ASN1ObjectIdentifier paramASN1ObjectIdentifier) {
    this(paramASN1ObjectIdentifier, null);
  }
  
  public AltSignatureAlgorithm(ASN1ObjectIdentifier paramASN1ObjectIdentifier, ASN1Encodable paramASN1Encodable) {
    this.algorithm = new AlgorithmIdentifier(paramASN1ObjectIdentifier, paramASN1Encodable);
  }
  
  public AlgorithmIdentifier getAlgorithm() {
    return this.algorithm;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return this.algorithm.toASN1Primitive();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\x509\AltSignatureAlgorithm.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */