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

public class SequenceOfHashedId8 extends ASN1Object {
  private final List<HashedId8> hashedId8s;
  
  public SequenceOfHashedId8(List<HashedId8> paramList) {
    this.hashedId8s = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfHashedId8(ASN1Sequence paramASN1Sequence) {
    ArrayList<HashedId8> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(HashedId8.getInstance(iterator.next())); 
    this.hashedId8s = Collections.unmodifiableList(arrayList);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static SequenceOfHashedId8 getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfHashedId8) ? (SequenceOfHashedId8)paramObject : ((paramObject != null) ? new SequenceOfHashedId8(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<HashedId8> getHashedId8s() {
    return this.hashedId8s;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(this.hashedId8s.<ASN1Encodable>toArray(new ASN1Encodable[0]));
  }
  
  public static class Builder {
    private final List<HashedId8> items = new ArrayList<>();
    
    public Builder addHashId8(HashedId8... param1VarArgs) {
      this.items.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public SequenceOfHashedId8 build() {
      return new SequenceOfHashedId8(this.items);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SequenceOfHashedId8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */