package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class ThreeDLocation extends ASN1Object {
  private final Latitude latitude;
  
  private final Longitude longitude;
  
  private final Elevation elevation;
  
  public ThreeDLocation(Latitude paramLatitude, Longitude paramLongitude, Elevation paramElevation) {
    this.latitude = paramLatitude;
    this.longitude = paramLongitude;
    this.elevation = paramElevation;
  }
  
  private ThreeDLocation(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 3)
      throw new IllegalArgumentException("expected sequence size of 3"); 
    this.latitude = Latitude.getInstance(paramASN1Sequence.getObjectAt(0));
    this.longitude = Longitude.getInstance(paramASN1Sequence.getObjectAt(1));
    this.elevation = Elevation.getInstance(paramASN1Sequence.getObjectAt(2));
  }
  
  public static ThreeDLocation getInstance(Object paramObject) {
    return (paramObject instanceof ThreeDLocation) ? (ThreeDLocation)paramObject : ((paramObject != null) ? new ThreeDLocation(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.latitude, (ASN1Encodable)this.longitude, (ASN1Encodable)this.elevation });
  }
  
  public Latitude getLatitude() {
    return this.latitude;
  }
  
  public Longitude getLongitude() {
    return this.longitude;
  }
  
  public Elevation getElevation() {
    return this.elevation;
  }
  
  public static class Builder {
    private Latitude latitude;
    
    private Longitude longitude;
    
    private Elevation elevation;
    
    public Builder setLatitude(Latitude param1Latitude) {
      this.latitude = param1Latitude;
      return this;
    }
    
    public Builder setLongitude(Longitude param1Longitude) {
      this.longitude = param1Longitude;
      return this;
    }
    
    public Builder setElevation(Elevation param1Elevation) {
      this.elevation = param1Elevation;
      return this;
    }
    
    public ThreeDLocation createThreeDLocation() {
      return new ThreeDLocation(this.latitude, this.longitude, this.elevation);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\ThreeDLocation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */