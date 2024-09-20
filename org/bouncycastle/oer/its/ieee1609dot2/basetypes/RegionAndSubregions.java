package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

public class RegionAndSubregions extends ASN1Object implements RegionInterface {
  private final UINT8 region;
  
  private final SequenceOfUint16 subregions;
  
  public RegionAndSubregions(UINT8 paramUINT8, SequenceOfUint16 paramSequenceOfUint16) {
    this.region = paramUINT8;
    this.subregions = paramSequenceOfUint16;
  }
  
  private RegionAndSubregions(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.region = UINT8.getInstance(paramASN1Sequence.getObjectAt(0));
    this.subregions = SequenceOfUint16.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public UINT8 getRegion() {
    return this.region;
  }
  
  public SequenceOfUint16 getSubregions() {
    return this.subregions;
  }
  
  public static RegionAndSubregions getInstance(Object paramObject) {
    return (paramObject instanceof RegionAndSubregions) ? (RegionAndSubregions)paramObject : ((paramObject != null) ? new RegionAndSubregions(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.region, (ASN1Encodable)this.subregions });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private UINT8 region;
    
    private SequenceOfUint16 subRegions;
    
    public Builder setRegion(UINT8 param1UINT8) {
      this.region = param1UINT8;
      return this;
    }
    
    public Builder setSubregions(SequenceOfUint16 param1SequenceOfUint16) {
      this.subRegions = param1SequenceOfUint16;
      return this;
    }
    
    public RegionAndSubregions createRegionAndSubregions() {
      return new RegionAndSubregions(this.region, this.subRegions);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\RegionAndSubregions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */