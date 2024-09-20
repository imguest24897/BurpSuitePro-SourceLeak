package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class GenMsgContent extends ASN1Object {
  private final ASN1Sequence content;
  
  private GenMsgContent(ASN1Sequence paramASN1Sequence) {
    this.content = paramASN1Sequence;
  }
  
  public GenMsgContent(InfoTypeAndValue paramInfoTypeAndValue) {
    this.content = (ASN1Sequence)new DERSequence((ASN1Encodable)paramInfoTypeAndValue);
  }
  
  public GenMsgContent(InfoTypeAndValue[] paramArrayOfInfoTypeAndValue) {
    this.content = (ASN1Sequence)new DERSequence((ASN1Encodable[])paramArrayOfInfoTypeAndValue);
  }
  
  public static GenMsgContent getInstance(Object paramObject) {
    return (paramObject instanceof GenMsgContent) ? (GenMsgContent)paramObject : ((paramObject != null) ? new GenMsgContent(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public InfoTypeAndValue[] toInfoTypeAndValueArray() {
    InfoTypeAndValue[] arrayOfInfoTypeAndValue = new InfoTypeAndValue[this.content.size()];
    for (byte b = 0; b != arrayOfInfoTypeAndValue.length; b++)
      arrayOfInfoTypeAndValue[b] = InfoTypeAndValue.getInstance(this.content.getObjectAt(b)); 
    return arrayOfInfoTypeAndValue;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)this.content;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\GenMsgContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */