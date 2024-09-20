package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

public class SequenceOfRegionAndSubregions extends ASN1Object {
  private final List<RegionAndSubregions> regionAndSubregions;
  
  public SequenceOfRegionAndSubregions(List<RegionAndSubregions> paramList) {
    this.regionAndSubregions = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfRegionAndSubregions(ASN1Sequence paramASN1Sequence) {
    ArrayList<RegionAndSubregions> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(RegionAndSubregions.getInstance(iterator.next())); 
    this.regionAndSubregions = Collections.unmodifiableList(arrayList);
  }
  
  public static SequenceOfRegionAndSubregions getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfRegionAndSubregions) ? (SequenceOfRegionAndSubregions)paramObject : ((paramObject != null) ? new SequenceOfRegionAndSubregions(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<RegionAndSubregions> getRegionAndSubregions() {
    return this.regionAndSubregions;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(this.regionAndSubregions);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SequenceOfRegionAndSubregions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */