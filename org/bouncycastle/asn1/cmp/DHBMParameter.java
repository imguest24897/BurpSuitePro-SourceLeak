package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class DHBMParameter extends ASN1Object {
  private final AlgorithmIdentifier owf;
  
  private final AlgorithmIdentifier mac;
  
  private DHBMParameter(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expecting sequence size of 2"); 
    this.owf = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(0));
    this.mac = AlgorithmIdentifier.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public DHBMParameter(AlgorithmIdentifier paramAlgorithmIdentifier1, AlgorithmIdentifier paramAlgorithmIdentifier2) {
    this.owf = paramAlgorithmIdentifier1;
    this.mac = paramAlgorithmIdentifier2;
  }
  
  public static DHBMParameter getInstance(Object paramObject) {
    return (paramObject instanceof DHBMParameter) ? (DHBMParameter)paramObject : ((paramObject != null) ? new DHBMParameter(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public AlgorithmIdentifier getOwf() {
    return this.owf;
  }
  
  public AlgorithmIdentifier getMac() {
    return this.mac;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.owf, (ASN1Encodable)this.mac });
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\DHBMParameter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */