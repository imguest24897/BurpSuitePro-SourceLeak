package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class RectangularRegion extends ASN1Object implements RegionInterface {
  private final TwoDLocation northWest;
  
  private final TwoDLocation southEast;
  
  public RectangularRegion(TwoDLocation paramTwoDLocation1, TwoDLocation paramTwoDLocation2) {
    this.northWest = paramTwoDLocation1;
    this.southEast = paramTwoDLocation2;
  }
  
  private RectangularRegion(ASN1Sequence paramASN1Sequence) {
    if (paramASN1Sequence.size() != 2)
      throw new IllegalArgumentException("expected sequence size of 2"); 
    this.northWest = TwoDLocation.getInstance(paramASN1Sequence.getObjectAt(0));
    this.southEast = TwoDLocation.getInstance(paramASN1Sequence.getObjectAt(1));
  }
  
  public static RectangularRegion getInstance(Object paramObject) {
    return (paramObject instanceof RectangularRegion) ? (RectangularRegion)paramObject : ((paramObject != null) ? new RectangularRegion(ASN1Sequence.getInstance(paramObject)) : null);
  }
  
  public TwoDLocation getNorthWest() {
    return this.northWest;
  }
  
  public TwoDLocation getSouthEast() {
    return this.southEast;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERSequence(new ASN1Encodable[] { (ASN1Encodable)this.northWest, (ASN1Encodable)this.southEast });
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static class Builder {
    private TwoDLocation northWest;
    
    private TwoDLocation southEast;
    
    public Builder setNorthWest(TwoDLocation param1TwoDLocation) {
      this.northWest = param1TwoDLocation;
      return this;
    }
    
    public Builder setSouthEast(TwoDLocation param1TwoDLocation) {
      this.southEast = param1TwoDLocation;
      return this;
    }
    
    public RectangularRegion createRectangularRegion() {
      return new RectangularRegion(this.northWest, this.southEast);
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\RectangularRegion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */