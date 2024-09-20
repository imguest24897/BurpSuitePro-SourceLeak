package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.crmf.CertTemplate;

public class CertReqTemplateContent extends ASN1Object {
  private final CertTemplate certTemplate;
  
  private final ASN1Sequence keySpec;
  
  private CertReqTemplateContent(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 1 && paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 1 or 2"); 
    this.certTemplate = CertTemplate.getInstance(paramASN1Sequence.getObjectAt(0));
    if (paramASN1Sequence.size() > 1) {
      this.keySpec = ASN1Sequence.getInstance(paramASN1Sequence.getObjectAt(1));
    } else {
      this.keySpec = null;
    } 
  }
  
  public CertReqTemplateContent(CertTemplate paramCertTemplate, ASN1Sequence paramASN1Sequence) {
    this.certTemplate = paramCertTemplate;
    this.keySpec = paramASN1Sequence;
  }
  
  public static CertReqTemplateContent getInstance(Object paramObject) {
    return (paramObject instanceof CertReqTemplateContent) ? (CertReqTemplateContent)paramObject : ((paramObject != null) ? new CertReqTemplateContent(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public CertTemplate getCertTemplate() {
    return this.certTemplate;
  }
  
  public ASN1Sequence getKeySpec() {
    return this.keySpec;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
    aSN1EncodableVector.add((ASN1Encodable)this.certTemplate);
    if (this.keySpec != null)
      aSN1EncodableVector.add((ASN1Encodable)this.keySpec); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\CertReqTemplateContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */