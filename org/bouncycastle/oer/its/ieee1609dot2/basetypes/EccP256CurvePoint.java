package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

public class EccP256CurvePoint extends EccCurvePoint implements ASN1Choice {
  public static final int xonly = 0;
  
  public static final int fill = 1;
  
  public static final int compressedY0 = 2;
  
  public static final int compressedY1 = 3;
  
  public static final int uncompressedP256 = 4;
  
  private final int choice;
  
  private final ASN1Encodable eccp256CurvePoint;
  
  public EccP256CurvePoint(int paramInt, ASN1Encodable paramASN1Encodable) {
    this.choice = paramInt;
    this.eccp256CurvePoint = paramASN1Encodable;
  }
  
  private EccP256CurvePoint(ASN1TaggedObject paramASN1TaggedObject) {
    this.choice = paramASN1TaggedObject.getTagNo();
    switch (paramASN1TaggedObject.getTagNo()) {
      case 1:
        this.eccp256CurvePoint = (ASN1Encodable)ASN1Null.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 0:
      case 2:
      case 3:
        this.eccp256CurvePoint = (ASN1Encodable)ASN1OctetString.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
      case 4:
        this.eccp256CurvePoint = (ASN1Encodable)Point256.getInstance(paramASN1TaggedObject.getExplicitBaseObject());
        return;
    } 
    throw new IllegalArgumentException("invalid choice value " + paramASN1TaggedObject.getTagNo());
  }
  
  public static EccP256CurvePoint xOnly(ASN1OctetString paramASN1OctetString) {
    return new EccP256CurvePoint(0, (ASN1Encodable)paramASN1OctetString);
  }
  
  public static EccP256CurvePoint xOnly(byte[] paramArrayOfbyte) {
    return new EccP256CurvePoint(0, (ASN1Encodable)new DEROctetString(Arrays.clone(paramArrayOfbyte)));
  }
  
  public static EccP256CurvePoint fill() {
    return new EccP256CurvePoint(1, (ASN1Encodable)DERNull.INSTANCE);
  }
  
  public static EccP256CurvePoint compressedY0(ASN1OctetString paramASN1OctetString) {
    return new EccP256CurvePoint(2, (ASN1Encodable)paramASN1OctetString);
  }
  
  public static EccP256CurvePoint compressedY1(ASN1OctetString paramASN1OctetString) {
    return new EccP256CurvePoint(3, (ASN1Encodable)paramASN1OctetString);
  }
  
  public static EccP256CurvePoint compressedY0(byte[] paramArrayOfbyte) {
    return new EccP256CurvePoint(2, (ASN1Encodable)new DEROctetString(Arrays.clone(paramArrayOfbyte)));
  }
  
  public static EccP256CurvePoint compressedY1(byte[] paramArrayOfbyte) {
    return new EccP256CurvePoint(3, (ASN1Encodable)new DEROctetString(Arrays.clone(paramArrayOfbyte)));
  }
  
  public static EccP256CurvePoint uncompressedP256(Point256 paramPoint256) {
    return new EccP256CurvePoint(4, (ASN1Encodable)paramPoint256);
  }
  
  public static EccP256CurvePoint uncompressedP256(BigInteger paramBigInteger1, BigInteger paramBigInteger2) {
    return new EccP256CurvePoint(4, (ASN1Encodable)Point256.builder().setX(paramBigInteger1).setY(paramBigInteger2).createPoint256());
  }
  
  public static EccP256CurvePoint createEncodedPoint(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte[0] == 2) {
      byte[] arrayOfByte = new byte[paramArrayOfbyte.length - 1];
      System.arraycopy(paramArrayOfbyte, 1, arrayOfByte, 0, arrayOfByte.length);
      return new EccP256CurvePoint(2, (ASN1Encodable)new DEROctetString(arrayOfByte));
    } 
    if (paramArrayOfbyte[0] == 3) {
      byte[] arrayOfByte = new byte[paramArrayOfbyte.length - 1];
      System.arraycopy(paramArrayOfbyte, 1, arrayOfByte, 0, arrayOfByte.length);
      return new EccP256CurvePoint(3, (ASN1Encodable)new DEROctetString(arrayOfByte));
    } 
    if (paramArrayOfbyte[0] == 4)
      return new EccP256CurvePoint(4, (ASN1Encodable)new Point256((ASN1OctetString)new DEROctetString(Arrays.copyOfRange(paramArrayOfbyte, 1, 34)), (ASN1OctetString)new DEROctetString(Arrays.copyOfRange(paramArrayOfbyte, 34, 66)))); 
    throw new IllegalArgumentException("unrecognised encoding " + paramArrayOfbyte[0]);
  }
  
  public EccP256CurvePoint createCompressed(ECPoint paramECPoint) {
    byte b = 0;
    byte[] arrayOfByte1 = paramECPoint.getEncoded(true);
    if (arrayOfByte1[0] == 2) {
      b = 2;
    } else if (arrayOfByte1[0] == 3) {
      b = 3;
    } 
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length - 1];
    System.arraycopy(arrayOfByte1, 1, arrayOfByte2, 0, arrayOfByte2.length);
    return new EccP256CurvePoint(b, (ASN1Encodable)new DEROctetString(arrayOfByte2));
  }
  
  public static EccP256CurvePoint getInstance(Object paramObject) {
    return (paramObject instanceof EccP256CurvePoint) ? (EccP256CurvePoint)paramObject : ((paramObject != null) ? new EccP256CurvePoint(ASN1TaggedObject.getInstance(paramObject, 128)) : null);
  }
  
  public ASN1Encodable getEccp256CurvePoint() {
    return this.eccp256CurvePoint;
  }
  
  public int getChoice() {
    return this.choice;
  }
  
  public ASN1Primitive toASN1Primitive() {
    return (ASN1Primitive)new DERTaggedObject(this.choice, this.eccp256CurvePoint);
  }
  
  public byte[] getEncodedPoint() {
    byte[] arrayOfByte1;
    Point256 point256;
    byte[] arrayOfByte2;
    byte[] arrayOfByte3;
    switch (this.choice) {
      case 2:
        arrayOfByte1 = DEROctetString.getInstance(this.eccp256CurvePoint).getOctets();
        null = new byte[arrayOfByte1.length + 1];
        null[0] = 2;
        System.arraycopy(arrayOfByte1, 0, null, 1, arrayOfByte1.length);
        return null;
      case 3:
        arrayOfByte1 = DEROctetString.getInstance(this.eccp256CurvePoint).getOctets();
        null = new byte[arrayOfByte1.length + 1];
        null[0] = 3;
        System.arraycopy(arrayOfByte1, 0, null, 1, arrayOfByte1.length);
        return null;
      case 4:
        point256 = Point256.getInstance(this.eccp256CurvePoint);
        arrayOfByte2 = point256.getX().getOctets();
        arrayOfByte3 = point256.getY().getOctets();
        return Arrays.concatenate(new byte[] { 4 }, arrayOfByte2, arrayOfByte3);
      case 0:
        throw new IllegalStateException("x Only not implemented");
    } 
    throw new IllegalStateException("unknown point choice");
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\oer\its\ieee1609dot2\basetypes\EccP256CurvePoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */