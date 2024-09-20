package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class TwoDLocation extends ASN1Object {
  private final Latitude latitude;
  
  private final Longitude longitude;
  
  public TwoDLocation(Latitude paramLatitude, Longitude paramLongitude) {
    this.latitude = paramLatitude;
    this.longitude = paramLongitude;
  }
  
  private TwoDLocation(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.latitude = Latitude.getInstance(paramASN1Sequence.getObjectAt(0));
    this.longitude = Longitude.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static TwoDLocation getInstance(Object paramObject) {
    return (paramObject instanceof TwoDLocation) ? (TwoDLocation)paramObject : ((paramObject != null) ? new TwoDLocation(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.latitude, (ASN1Encodable)this.longitude });
  }
  
  public Latitude getLatitude() {
    return this.latitude;
  }
  
  public Longitude getLongitude() {
    return this.longitude;
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private Latitude latitude;
    
    private Longitude longitude;
    
    public Builder setLatitude(Latitude param1Latitude) {
      this.latitude = param1Latitude;
      return this;
    }
    
    public Builder setLongitude(Longitude param1Longitude) {
      this.longitude = param1Longitude;
      return this;
    }
    
    public TwoDLocation createTwoDLocation() {
      return new TwoDLocation(this.latitude, this.longitude);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\TwoDLocation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */