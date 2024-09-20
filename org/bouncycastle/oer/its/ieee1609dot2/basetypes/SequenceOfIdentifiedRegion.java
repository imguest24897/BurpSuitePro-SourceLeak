package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

public class SequenceOfIdentifiedRegion extends ASN1Object {
  private final List<IdentifiedRegion> identifiedRegions;
  
  public SequenceOfIdentifiedRegion(List<IdentifiedRegion> paramList) {
    this.identifiedRegions = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfIdentifiedRegion(ASN1Sequence paramASN1Sequence) {
    ArrayList<IdentifiedRegion> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(IdentifiedRegion.getInstance(iterator.next())); 
    this.identifiedRegions = Collections.unmodifiableList(arrayList);
  }
  
  public static SequenceOfIdentifiedRegion getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfIdentifiedRegion) ? (SequenceOfIdentifiedRegion)paramObject : ((paramObject != null) ? new SequenceOfIdentifiedRegion(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<IdentifiedRegion> getIdentifiedRegions() {
    return this.identifiedRegions;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(this.identifiedRegions);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SequenceOfIdentifiedRegion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */