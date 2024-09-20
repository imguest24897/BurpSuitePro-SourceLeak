package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

public class SequenceOfRectangularRegion extends ASN1Object {
  private final List<RectangularRegion> rectangularRegions;
  
  public SequenceOfRectangularRegion(List<RectangularRegion> paramList) {
    this.rectangularRegions = Collections.unmodifiableList(paramList);
  }
  
  private SequenceOfRectangularRegion(ASN1Sequence paramASN1Sequence) {
    ArrayList<RectangularRegion> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(RectangularRegion.getInstance(iterator.next())); 
    this.rectangularRegions = Collections.unmodifiableList(arrayList);
  }
  
  public static SequenceOfRectangularRegion getInstance(Object paramObject) {
    return (paramObject instanceof SequenceOfRectangularRegion) ? (SequenceOfRectangularRegion)paramObject : ((paramObject != null) ? new SequenceOfRectangularRegion(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<RectangularRegion> getRectangularRegions() {
    return this.rectangularRegions;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(this.rectangularRegions);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\SequenceOfRectangularRegion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */