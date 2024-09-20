package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

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

public class SequenceOfUint8 extends ASN1Object {
  private final List<UINT8> uint8s;
  
  public SequenceOfUint8(List<UINT8> paramList) {
    this.uint8s = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfUint8(ASN1Sequence paramASN1Sequence) {
    ArrayList<UINT8> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(UINT8.getInstance(iterator.next())); 
    this.uint8s = Collections.unmodifiableList(arrayList);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static SequenceOfUint8 getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfUint8) ? (SequenceOfUint8)paramObject : ((paramObject != null) ? new SequenceOfUint8(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<UINT8> getUint8s() {
    return this.uint8s;
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    for (UINT8 uINT8 : this.uint8s)
      aSN1EncodableVector.add((ASN1Encodable)uINT8.toASN1Primitive()); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static class Builder {
    private final List<UINT8> items = new ArrayList<>();
    
    public Builder addHashId3(UINT8... param1VarArgs) {
      this.items.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public SequenceOfUint8 build() {
      return new SequenceOfUint8(this.items);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SequenceOfUint8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */