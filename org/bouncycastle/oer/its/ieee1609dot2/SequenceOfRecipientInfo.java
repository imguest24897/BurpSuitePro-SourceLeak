package org.bouncycastle.oer.its.ieee1609dot2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class SequenceOfRecipientInfo extends ASN1Object {
  private final List<RecipientInfo> recipientInfos;
  
  public SequenceOfRecipientInfo(List<RecipientInfo> paramList) {
    this.recipientInfos = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfRecipientInfo(ASN1Sequence paramASN1Sequence) {
    ArrayList<RecipientInfo> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(RecipientInfo.getInstance(iterator.next())); 
    this.recipientInfos = Collections.unmodifiableList(arrayList);
  }
  
  public static SequenceOfRecipientInfo getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfRecipientInfo) ? (SequenceOfRecipientInfo)paramObject : ((paramObject != null) ? new SequenceOfRecipientInfo(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    for (RecipientInfo recipientInfo : this.recipientInfos)
      aSN1EncodableVector.add((ASN1Encodable)recipientInfo); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public List<RecipientInfo> getRecipientInfos() {
    return this.recipientInfos;
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private List<RecipientInfo> recipientInfos;
    
    public Builder setRecipientInfos(List<RecipientInfo> param1List) {
      this.recipientInfos = param1List;
      return this;
    }
    
    public Builder addRecipients(RecipientInfo... param1VarArgs) {
      if (this.recipientInfos == null)
        this.recipientInfos = new ArrayList<>(); 
      this.recipientInfos.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public SequenceOfRecipientInfo createSequenceOfRecipientInfo() {
      return new SequenceOfRecipientInfo(this.recipientInfos);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\SequenceOfRecipientInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */