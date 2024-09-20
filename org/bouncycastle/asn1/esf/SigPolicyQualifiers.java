package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class SigPolicyQualifiers extends ASN1Object {
  ASN1Sequence qualifiers;
  
  public static SigPolicyQualifiers getInstance(Object paramObject) {
    return (paramObject instanceof SigPolicyQualifiers) ? (SigPolicyQualifiers)paramObject : ((paramObject instanceof ASN1Sequence) ? new SigPolicyQualifiers(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  private SigPolicyQualifiers(ASN1Sequence paramASN1Sequence) {
    this.qualifiers = paramASN1Sequence;
  }
  
  public SigPolicyQualifiers(SigPolicyQualifierInfo[] paramArrayOfSigPolicyQualifierInfo) {
    this.qualifiers = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfSigPolicyQualifierInfo);
  }
  
  public int size() {
    return this.qualifiers.size();
  }
  
  public SigPolicyQualifierInfo getInfoAt(int paramInt) {
    return SigPolicyQualifierInfo.getInstance(this.qualifiers.getObjectAt(paramInt));
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.qualifiers;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\esf\SigPolicyQualifiers.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */