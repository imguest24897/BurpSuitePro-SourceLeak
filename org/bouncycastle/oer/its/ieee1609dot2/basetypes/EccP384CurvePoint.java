package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Arrays;

public class EccP384CurvePoint extends EccCurvePoint implements ASN1Choice {
  public static final int xonly = 0;
  
  public static final int fill = 1;
  
  public static final int compressedY0 = 2;
  
  public static final int compressedY1 = 3;
  
  public static final int uncompressedP384 = 4;
  
  private final int choice;
  
  private final ASN1Encodable eccP384CurvePoint;
  
  public EccP384CurvePoint(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.eccP384CurvePoint = paramASN1Encodable;
  }
  
  private EccP384CurvePoint(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (paramASN1TaggedObject.getTagNo()) {
      case 1:
        this.eccP384CurvePoint = (ASN1Encodable)ASN1Null.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 0:
      case 2:
      case 3:
        this.eccP384CurvePoint = (ASN1Encodable)ASN1OctetString.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 4:
        this.eccP384CurvePoint = (ASN1Encodable)ASN1Sequence.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + paramASN1TaggedObject.getTagNo());
  }
  
  public static EccP384CurvePoint getInstance(Object paramObject) {
    return (paramObject instanceof EccP384CurvePoint) ? (EccP384CurvePoint)paramObject : ((paramObject != null) ? new EccP384CurvePoint(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public static EccP384CurvePoint xOnly(ASN1OctetString paramASN1OctetString) {
    return new EccP384CurvePoint(0, (ASN1Encodable)paramASN1OctetString);
  }
  
  public static EccP384CurvePoint xOnly(byte[] paramArrayOfbyte) {
    return new EccP384CurvePoint(0, (ASN1Encodable)new DEROctetString(Arrays.clone(paramArrayOfbyte)));
  }
  
  public static EccP384CurvePoint fill() {
    return new EccP384CurvePoint(1, (ASN1Encodable)DERNull.INSTANCE);
  }
  
  public static EccP384CurvePoint compressedY0(ASN1OctetString paramASN1OctetString) {
    return new EccP384CurvePoint(2, (ASN1Encodable)paramASN1OctetString);
  }
  
  public static EccP384CurvePoint compressedY1(ASN1OctetString paramASN1OctetString) {
    return new EccP384CurvePoint(3, (ASN1Encodable)paramASN1OctetString);
  }
  
  public static EccP384CurvePoint compressedY0(byte[] paramArrayOfbyte) {
    return new EccP384CurvePoint(2, (ASN1Encodable)new DEROctetString(Arrays.clone(paramArrayOfbyte)));
  }
  
  public static EccP384CurvePoint compressedY1(byte[] paramArrayOfbyte) {
    return new EccP384CurvePoint(3, (ASN1Encodable)new DEROctetString(Arrays.clone(paramArrayOfbyte)));
  }
  
  public static EccP384CurvePoint uncompressedP384(Point384 paramPoint384) {
    return new EccP384CurvePoint(4, (ASN1Encodable)paramPoint384);
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Encodable getEccP384CurvePoint() {
    return this.eccP384CurvePoint;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.eccP384CurvePoint);
  }
  
  public byte[] getEncodedPoint() {
    byte[] arrayOfByte1;
    ASN1Sequence aSN1Sequence;
    byte[] arrayOfByte2;
    byte[] arrayOfByte3;
    switch (this.choice) {
      case 2:
        arrayOfByte1 = DEROctetString.getInstance(this.eccP384CurvePoint).getOctets();
        null = new byte[arrayOfByte1.length + 1];
        null[0] = 2;
        System.arraycopy(arrayOfByte1, 0, null, 1, arrayOfByte1.length);
        return null;
      case 3:
        arrayOfByte1 = DEROctetString.getInstance(this.eccP384CurvePoint).getOctets();
        null = new byte[arrayOfByte1.length + 1];
        null[0] = 3;
        System.arraycopy(arrayOfByte1, 0, null, 1, arrayOfByte1.length);
        return null;
      case 4:
        aSN1Sequence = ASN1Sequence.getInstance(this.eccP384CurvePoint);
        arrayOfByte2 = DEROctetString.getInstance(aSN1Sequence.getObjectAt(0)).getOctets();
        arrayOfByte3 = DEROctetString.getInstance(aSN1Sequence.getObjectAt(1)).getOctets();
        return Arrays.concatenate(new byte[] { 4 }, arrayOfByte2, arrayOfByte3);
      case 0:
        throw new IllegalStateException("x Only not implemented");
    } 
    throw new IllegalStateException("unknown point choice");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\EccP384CurvePoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */