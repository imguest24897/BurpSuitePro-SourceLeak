package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.CMPObjectIdentifiers;
import org.bouncycastle.asn1.cmp.PBMParameter;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class PKMACValue extends ASN1Object {
  private AlgorithmIdentifier algId;
  
  private ASN1BitString value;
  
  private PKMACValue(ASN1Sequence paramASN1Sequence) {
    this.algId = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(0));
    this.value = ASN1BitString.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static PKMACValue getInstance(Object paramObject) {
    return (paramObject instanceof PKMACValue) ? (PKMACValue)paramObject : ((paramObject != null) ? new PKMACValue(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static PKMACValue getInstance(ASN1TaggedObject paramASN1TaggedObject, boolean paramBoolean) {
    return getInstance(ASN1Sequence.getInstance(paramASN1TaggedObject, paramBoolean));
  }
  
  public PKMACValue(PBMParameter paramPBMParameter, DERBitString paramDERBitString) {
    this(new AlgorithmIdentifier(CMPObjectIdentifiers.passwordBasedMac, (ASN1Encodable)paramPBMParameter), paramDERBitString);
  }
  
  public PKMACValue(AlgorithmIdentifier paramAlgorithmIdentifier, DERBitString paramDERBitString) {
    this.algId = paramAlgorithmIdentifier;
    this.value = (ASN1BitString)paramDERBitString;
  }
  
  public AlgorithmIdentifier getAlgId() {
    return this.algId;
  }
  
  public ASN1BitString getValue() {
    return this.value;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.algId);
    aSN1EncodableVector.add((ASN1Encodable)this.value);
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\crmf\PKMACValue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */