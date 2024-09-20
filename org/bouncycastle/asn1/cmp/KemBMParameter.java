package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class KemBMParameter extends ASN1Object {
  private final AlgorithmIdentifier kdf;
  
  private final ASN1Integer len;
  
  private final AlgorithmIdentifier mac;
  
  private KemBMParameter(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 3)
      throw new IllegalArgumentException("sequence size should 3"); 
    this.kdf = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(0));
    this.len = ASN1Integer.getInstance(paramASN1Sequence.getObjectAt(1));
    this.mac = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(2));
  }
  
  public KemBMParameter(AlgorithmIdentifier paramAlgorithmIdentifier1, ASN1Integer paramASN1Integer, AlgorithmIdentifier paramAlgorithmIdentifier2) {
    this.kdf = paramAlgorithmIdentifier1;
    this.len = paramASN1Integer;
    this.mac = paramAlgorithmIdentifier2;
  }
  
  public KemBMParameter(AlgorithmIdentifier paramAlgorithmIdentifier1, long paramLong, AlgorithmIdentifier paramAlgorithmIdentifier2) {
    this(paramAlgorithmIdentifier1, new ASN1Integer(paramLong), paramAlgorithmIdentifier2);
  }
  
  public static KemBMParameter getInstance(Object paramObject) {
    return (paramObject instanceof KemBMParameter) ? (KemBMParameter)paramObject : ((paramObject != null) ? new KemBMParameter(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public AlgorithmIdentifier getKdf() {
    return this.kdf;
  }
  
  public ASN1Integer getLen() {
    return this.len;
  }
  
  public AlgorithmIdentifier getMac() {
    return this.mac;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
    aSN1EncodableVector.add((ASN1Encodable)this.kdf);
    aSN1EncodableVector.add((ASN1Encodable)this.len);
    aSN1EncodableVector.add((ASN1Encodable)this.mac);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\KemBMParameter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */