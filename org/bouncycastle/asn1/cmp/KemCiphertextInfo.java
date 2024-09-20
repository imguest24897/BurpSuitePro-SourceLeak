package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class KemCiphertextInfo extends ASN1Object {
  private final AlgorithmIdentifier kem;
  
  private final ASN1OctetString ct;
  
  private KemCiphertextInfo(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("sequence size should 2"); 
    this.kem = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(0));
    this.ct = ASN1OctetString.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public KemCiphertextInfo(AlgorithmIdentifier paramAlgorithmIdentifier, ASN1OctetString paramASN1OctetString) {
    this.kem = paramAlgorithmIdentifier;
    this.ct = paramASN1OctetString;
  }
  
  public static KemCiphertextInfo getInstance(Object paramObject) {
    return (paramObject instanceof KemCiphertextInfo) ? (KemCiphertextInfo)paramObject : ((paramObject != null) ? new KemCiphertextInfo(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public AlgorithmIdentifier getKem() {
    return this.kem;
  }
  
  public ASN1OctetString getCt() {
    return this.ct;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.kem);
    aSN1EncodableVector.add((ASN1Encodable)this.ct);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\KemCiphertextInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */