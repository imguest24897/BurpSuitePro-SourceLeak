package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Sequence;

public class NestedMessageContent extends PKIMessages {
  public NestedMessageContent(PKIMessage paramPKIMessage) {
    super(paramPKIMessage);
  }
  
  public NestedMessageContent(PKIMessage[] paramArrayOfPKIMessage) {
    super(paramArrayOfPKIMessage);
  }
  
  public NestedMessageContent(ASN1Sequence paramASN1Sequence) {
    super(paramASN1Sequence);
  }
  
  public static NestedMessageContent getInstance(Object paramObject) {
    return (paramObject instanceof NestedMessageContent) ? (NestedMessageContent)paramObject : ((paramObject != null) ? new NestedMessageContent(ASN1Sequence.getInstance(paramObject)) : null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\asn1\cmp\NestedMessageContent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */