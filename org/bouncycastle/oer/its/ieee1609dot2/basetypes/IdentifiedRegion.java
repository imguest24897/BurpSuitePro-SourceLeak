package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class IdentifiedRegion extends ASN1Object implements ASN1Choice, RegionInterface {
  public static final int countryOnly = 0;
  
  public static final int countryAndRegions = 1;
  
  public static final int countryAndSubregions = 2;
  
  private final int choice;
  
  private final ASN1Encodable identifiedRegion;
  
  public IdentifiedRegion(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.identifiedRegion = paramASN1Encodable;
  }
  
  private IdentifiedRegion(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.identifiedRegion = (ASN1Encodable)CountryOnly.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this.identifiedRegion = (ASN1Encodable)CountryAndRegions.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 2:
        this.identifiedRegion = (ASN1Encodable)CountryAndSubregions.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static IdentifiedRegion countryOnly(CountryOnly paramCountryOnly) {
    return new IdentifiedRegion(0, (ASN1Encodable)paramCountryOnly);
  }
  
  public static IdentifiedRegion countryAndRegions(CountryAndRegions paramCountryAndRegions) {
    return new IdentifiedRegion(1, (ASN1Encodable)paramCountryAndRegions);
  }
  
  public static IdentifiedRegion countryAndSubregions(CountryAndSubregions paramCountryAndSubregions) {
    return new IdentifiedRegion(2, (ASN1Encodable)paramCountryAndSubregions);
  }
  
  public static IdentifiedRegion getInstance(Object paramObject) {
    return (paramObject instanceof IdentifiedRegion) ? (IdentifiedRegion)paramObject : ((paramObject != null) ? new IdentifiedRegion(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getIdentifiedRegion() {
    return this.identifiedRegion;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.identifiedRegion);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\IdentifiedRegion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */