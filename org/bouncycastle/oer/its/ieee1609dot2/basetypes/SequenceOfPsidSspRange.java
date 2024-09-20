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

public class SequenceOfPsidSspRange extends ASN1Object {
  private final List<PsidSspRange> psidSspRanges;
  
  public SequenceOfPsidSspRange(List<PsidSspRange> paramList) {
    this.psidSspRanges = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfPsidSspRange(ASN1Sequence paramASN1Sequence) {
    ArrayList<PsidSspRange> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(PsidSspRange.getInstance(iterator.next())); 
    this.psidSspRanges = Collections.unmodifiableList(arrayList);
  }
  
  public static SequenceOfPsidSspRange getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfPsidSspRange) ? (SequenceOfPsidSspRange)paramObject : ((paramObject != null) ? new SequenceOfPsidSspRange(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<PsidSspRange> getPsidSspRanges() {
    return this.psidSspRanges;
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public ASN1Primitive toASN1Primitive() {
    ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
    Iterator<PsidSspRange> iterator = this.psidSspRanges.iterator();
    while (iterator.hasNext())
      aSN1EncodableVector.add((ASN1Encodable)iterator.next()); 
    return (ASN1Primitive)new DERSequence(aSN1EncodableVector);
  }
  
  public static class Builder {
    private final ArrayList<PsidSspRange> psidSspRanges = new ArrayList<>();
    
    public Builder add(PsidSspRange... param1VarArgs) {
      this.psidSspRanges.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public SequenceOfPsidSspRange build() {
      return new SequenceOfPsidSspRange(this.psidSspRanges);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SequenceOfPsidSspRange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */