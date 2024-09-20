package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class SequenceOfUint16 extends ASN1Object {
  private final List<UINT16> uint16s;
  
  public SequenceOfUint16(List<UINT16> paramList) {
    this.uint16s = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfUint16(ASN1Sequence paramASN1Sequence) {
    ArrayList<UINT16> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(UINT16.getInstance(iterator.next())); 
    this.uint16s = Collections.unmodifiableList(arrayList);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static SequenceOfUint16 getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfUint16) ? (SequenceOfUint16)paramObject : ((paramObject != null) ? new SequenceOfUint16(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<UINT16> getUint16s() {
    return this.uint16s;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(this.uint16s.<ASN1Encodable>toArray(new ASN1Encodable[0]));
  }
  
  public static class Builder {
    private final List<UINT16> items = new ArrayList<>();
    
    public Builder addHashId3(UINT16... param1VarArgs) {
      this.items.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public SequenceOfUint16 build() {
      return new SequenceOfUint16(this.items);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SequenceOfUint16.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */