package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

public class CircularRegion extends ASN1Object implements RegionInterface {
  private final TwoDLocation center;
  
  private final UINT16 radius;
  
  public CircularRegion(TwoDLocation paramTwoDLocation, UINT16 paramUINT16) {
    this.center = paramTwoDLocation;
    this.radius = paramUINT16;
  }
  
  private CircularRegion(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.center = TwoDLocation.getInstance(paramASN1Sequence.getObjectAt(0));
    this.radius = UINT16.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static CircularRegion getInstance(Object paramObject) {
    return (paramObject instanceof CircularRegion) ? (CircularRegion)paramObject : ((paramObject != null) ? new CircularRegion(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public TwoDLocation getCenter() {
    return this.center;
  }
  
  public UINT16 getRadius() {
    return this.radius;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)ItsUtils.toSequence(new ASN1Encodable[] { (ASN1Encodable)this.center, (ASN1Encodable)this.radius });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private TwoDLocation center;
    
    private UINT16 radius;
    
    public Builder setCenter(TwoDLocation param1TwoDLocation) {
      this.center = param1TwoDLocation;
      return this;
    }
    
    public Builder setRadius(UINT16 param1UINT16) {
      this.radius = param1UINT16;
      return this;
    }
    
    public CircularRegion createCircularRegion() {
      return new CircularRegion(this.center, this.radius);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\CircularRegion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */