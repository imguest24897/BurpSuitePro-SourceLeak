package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class GeographicRegion extends ASN1Object implements ASN1Choice {
  public static final int circularRegion = 0;
  
  public static final int rectangularRegion = 1;
  
  public static final int polygonalRegion = 2;
  
  public static final int identifiedRegion = 3;
  
  private final int choice;
  
  private final ASN1Encodable geographicRegion;
  
  public GeographicRegion(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.geographicRegion = paramASN1Encodable;
  }
  
  private GeographicRegion(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (this.choice) {
      case 0:
        this.geographicRegion = (ASN1Encodable)CircularRegion.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 1:
        this.geographicRegion = (ASN1Encodable)SequenceOfRectangularRegion.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 2:
        this.geographicRegion = (ASN1Encodable)PolygonalRegion.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 3:
        this.geographicRegion = (ASN1Encodable)SequenceOfIdentifiedRegion.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + this.choice);
  }
  
  public static GeographicRegion circularRegion(CircularRegion paramCircularRegion) {
    return new GeographicRegion(0, (ASN1Encodable)paramCircularRegion);
  }
  
  public static GeographicRegion rectangularRegion(SequenceOfRectangularRegion paramSequenceOfRectangularRegion) {
    return new GeographicRegion(1, (ASN1Encodable)paramSequenceOfRectangularRegion);
  }
  
  public static GeographicRegion polygonalRegion(PolygonalRegion paramPolygonalRegion) {
    return new GeographicRegion(2, (ASN1Encodable)paramPolygonalRegion);
  }
  
  public static GeographicRegion identifiedRegion(SequenceOfIdentifiedRegion paramSequenceOfIdentifiedRegion) {
    return new GeographicRegion(3, (ASN1Encodable)paramSequenceOfIdentifiedRegion);
  }
  
  public static GeographicRegion getInstance(Object paramObject) {
    return (paramObject instanceof GeographicRegion) ? (GeographicRegion)paramObject : ((paramObject != null) ? new GeographicRegion(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getGeographicRegion() {
    return this.geographicRegion;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.geographicRegion);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\GeographicRegion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */