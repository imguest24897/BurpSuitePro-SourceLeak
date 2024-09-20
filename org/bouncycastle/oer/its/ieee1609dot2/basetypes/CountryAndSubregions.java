package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class CountryAndSubregions extends ASN1Object {
  private final CountryOnly country;
  
  private final SequenceOfRegionAndSubregions regionAndSubregions;
  
  public CountryAndSubregions(CountryOnly paramCountryOnly, SequenceOfRegionAndSubregions paramSequenceOfRegionAndSubregions) {
    this.country = paramCountryOnly;
    this.regionAndSubregions = paramSequenceOfRegionAndSubregions;
  }
  
  private CountryAndSubregions(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.country = CountryOnly.getInstance(paramASN1Sequence.getObjectAt(0));
    this.regionAndSubregions = SequenceOfRegionAndSubregions.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static CountryAndSubregions getInstance(Object paramObject) {
    return (paramObject instanceof CountryAndSubregions) ? (CountryAndSubregions)paramObject : ((paramObject != null) ? new CountryAndSubregions(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public CountryOnly getCountry() {
    return this.country;
  }
  
  public SequenceOfRegionAndSubregions getRegionAndSubregions() {
    return this.regionAndSubregions;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.country, (ASN1Encodable)this.regionAndSubregions });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private CountryOnly country;
    
    private SequenceOfRegionAndSubregions regionAndSubregions;
    
    public Builder setCountry(CountryOnly param1CountryOnly) {
      this.country = param1CountryOnly;
      return this;
    }
    
    public Builder setRegionAndSubregions(SequenceOfRegionAndSubregions param1SequenceOfRegionAndSubregions) {
      this.regionAndSubregions = param1SequenceOfRegionAndSubregions;
      return this;
    }
    
    public CountryAndSubregions createCountryAndSubregions() {
      return new CountryAndSubregions(this.country, this.regionAndSubregions);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\CountryAndSubregions.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */