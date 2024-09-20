package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.Time;

public class CRLStatus extends ASN1Object {
  private final CRLSource source;
  
  private final Time thisUpdate;
  
  private CRLStatus(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() == 1 || paramASN1Sequence.size() == 2) {
      this.source = CRLSource.getInstance(paramASN1Sequence.getObjectAt(0));
      if (paramASN1Sequence.size() == 2) {
        this.thisUpdate = Time.getInstance(paramASN1Sequence.getObjectAt(1));
      } else {
        this.thisUpdate = null;
      } 
    } else {
      throw new IllegalArgumentException("expected sequence size of 1 or 2, got " + paramASN1Sequence.size());
    } 
  }
  
  public CRLStatus(CRLSource paramCRLSource, Time paramTime) {
    this.source = paramCRLSource;
    this.thisUpdate = paramTime;
  }
  
  public static CRLStatus getInstance(Object paramObject) {
    return (paramObject instanceof CRLStatus) ? (CRLStatus)paramObject : ((paramObject != null) ? new CRLStatus(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public CRLSource getSource() {
    return this.source;
  }
  
  public Time getThisUpdate() {
    return this.thisUpdate;
  }
  
  public Time getTime() {
    return this.thisUpdate;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.source);
    if (this.thisUpdate != null)
      aSN1EncodableVector.add((ASN1Encodable)this.thisUpdate); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\CRLStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */