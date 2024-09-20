package org.bouncycastle.oer.its.etsi102941;

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

public class SequenceOfCrlEntry extends ASN1Object {
  private final List<CrlEntry> crlEntries;
  
  public SequenceOfCrlEntry(List<CrlEntry> paramList) {
    this.crlEntries = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfCrlEntry(ASN1Sequence paramASN1Sequence) {
    ArrayList<CrlEntry> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(CrlEntry.getInstance(iterator.next())); 
    this.crlEntries = Collections.unmodifiableList(arrayList);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static SequenceOfCrlEntry getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfCrlEntry) ? (SequenceOfCrlEntry)paramObject : ((paramObject != null) ? new SequenceOfCrlEntry(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<CrlEntry> getCrlEntries() {
    return this.crlEntries;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(this.crlEntries.<ASN1Encodable>toArray(new ASN1Encodable[0]));
  }
  
  public static class Builder {
    private final List<CrlEntry> items = new ArrayList<>();
    
    public Builder addCrlEntry(CrlEntry... param1VarArgs) {
      this.items.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public SequenceOfCrlEntry build() {
      return new SequenceOfCrlEntry(this.items);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\etsi102941\SequenceOfCrlEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */