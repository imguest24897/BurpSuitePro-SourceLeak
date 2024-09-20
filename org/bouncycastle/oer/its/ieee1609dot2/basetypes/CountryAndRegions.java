package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

public class CountryAndRegions extends ASN1Object implements RegionInterface {
  private final CountryOnly countryOnly;
  
  private final SequenceOfUint8 regions;
  
  public CountryAndRegions(CountryOnly paramCountryOnly, SequenceOfUint8 paramSequenceOfUint8) {
    this.countryOnly = paramCountryOnly;
    this.regions = SequenceOfUint8.getInstance(paramSequenceOfUint8);
  }
  
  private CountryAndRegions(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.countryOnly = CountryOnly.getInstance(paramASN1Sequence.getObjectAt(0));
    this.regions = SequenceOfUint8.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static CountryAndRegions getInstance(Object paramObject) {
    return (paramObject instanceof CountryAndRegions) ? (CountryAndRegions)paramObject : ((paramObject != null) ? new CountryAndRegions(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.countryOnly, (ASN1Encodable)this.regions });
  }
  
  public CountryOnly getCountryOnly() {
    return this.countryOnly;
  }
  
  public SequenceOfUint8 getRegions() {
    return this.regions;
  }
  
  public static class Builder {
    private SequenceOfUint8 regionList;
    
    private CountryOnly countryOnly;
    
    public Builder setCountryOnly(CountryOnly param1CountryOnly) {
      this.countryOnly = param1CountryOnly;
      return this;
    }
    
    public Builder setRegions(SequenceOfUint8 param1SequenceOfUint8) {
      this.regionList = param1SequenceOfUint8;
      return this;
    }
    
    public CountryAndRegions createCountryAndRegions() {
      return new CountryAndRegions(this.countryOnly, this.regionList);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\CountryAndRegions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */