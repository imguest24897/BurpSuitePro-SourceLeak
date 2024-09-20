package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class CertReqMessages extends ASN1Object {
  private ASN1Sequence content;
  
  private CertReqMessages(ASN1Sequence paramASN1Sequence) {
    this.content = paramASN1Sequence;
  }
  
  public static CertReqMessages getInstance(Object paramObject) {
    return (paramObject instanceof CertReqMessages) ? (CertReqMessages)paramObject : ((paramObject != null) ? new CertReqMessages(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public CertReqMessages(CertReqMsg paramCertReqMsg) {
    this.content = (ASN1Sequence)new DERSequence((ASN1Encodable)paramCertReqMsg);
  }
  
  public CertReqMessages(CertReqMsg[] paramArrayOfCertReqMsg) {
    this.content = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfCertReqMsg);
  }
  
  public CertReqMsg[] toCertReqMsgArray() {
    CertReqMsg[] arrayOfCertReqMsg = new CertReqMsg[this.content.size()];
    for (byte b = 0; b != arrayOfCertReqMsg.length; b++)
      arrayOfCertReqMsg[b] = CertReqMsg.getInstance(this.content.getObjectAt(b)); 
    return arrayOfCertReqMsg;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.content;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\crmf\CertReqMessages.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */