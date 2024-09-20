package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

public class PolygonalRegion extends ASN1Object implements RegionInterface {
  private final List<TwoDLocation> twoDLocations;
  
  public PolygonalRegion(List<TwoDLocation> paramList) {
    this.twoDLocations = Collections.unmodifiableList(paramList);
  }
  
  private PolygonalRegion(ASN1Sequence paramASN1Sequence) {
    ArrayList<TwoDLocation> arrayList = new ArrayList();
    Iterator iterator = paramASN1Sequence.iterator();
    while (iterator.hasNext())
      arrayList.add(TwoDLocation.getInstance(iterator.next())); 
    this.twoDLocations = Collections.unmodifiableList(arrayList);
  }
  
  public static PolygonalRegion getInstance(Object paramObject) {
    return (paramObject instanceof PolygonalRegion) ? (PolygonalRegion)paramObject : ((paramObject != null) ? new PolygonalRegion(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public List<TwoDLocation> getTwoDLocations() {
    return this.twoDLocations;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(this.twoDLocations);
  }
  
  public static class Builder {
    private List<TwoDLocation> locations = new ArrayList<>();
    
    public Builder setLocations(List<TwoDLocation> param1List) {
      this.locations = param1List;
      return this;
    }
    
    public Builder setLocations(TwoDLocation... param1VarArgs) {
      this.locations.addAll(Arrays.asList(param1VarArgs));
      return this;
    }
    
    public PolygonalRegion createPolygonalRegion() {
      return new PolygonalRegion(this.locations);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\PolygonalRegion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */