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

public class SequenceOfHashedId3 extends ASN1Object {
  private final List<HashedId3> hashedId3s;
  
  public SequenceOfHashedId3(List<HashedId3> paramList) {
    this.hashedId3s = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfHashedId3(ASN1Sequence paramASN1Sequence) {
    ArrayList<HashedId3> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(HashedId3.getInstance(iterator.next())); 
    this.hashedId3s = Collections.unmodifiableList(arrayList);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static SequenceOfHashedId3 getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfHashedId3) ? (SequenceOfHashedId3)paramObject : ((paramObject != null) ? new SequenceOfHashedId3(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<HashedId3> getHashedId3s() {
    return this.hashedId3s;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(this.hashedId3s.<ASN1Encodable>toArray(new ASN1Encodable[0]));
  }
  
  public static class Builder {
    private final List<HashedId3> items = new ArrayList<>();
    
    public Builder addHashId3(HashedId3... param1VarArgs) {
      this.items.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public SequenceOfHashedId3 build() {
      return new SequenceOfHashedId3(this.items);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SequenceOfHashedId3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */