package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat128;

public class SecP128R1Point extends ECPoint.AbstractFp {
  SecP128R1Point(ECCurve paramECCurve, ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2) {
    super(paramECCurve, paramECFieldElement1, paramECFieldElement2);
  }
  
  SecP128R1Point(ECCurve paramECCurve, ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2, ECFieldElement[] paramArrayOfECFieldElement) {
    super(paramECCurve, paramECFieldElement1, paramECFieldElement2, paramArrayOfECFieldElement);
  }
  
  protected ECPoint detach() {
    return (ECPoint)new SecP128R1Point(null, getAffineXCoord(), getAffineYCoord());
  }
  
  public ECPoint add(ECPoint paramECPoint) {
    int[] arrayOfInt5;
    int[] arrayOfInt6;
    int[] arrayOfInt7;
    int[] arrayOfInt8;
    if (isInfinity())
      return paramECPoint; 
    if (paramECPoint.isInfinity())
      return (ECPoint)this; 
    if (this == paramECPoint)
      return twice(); 
    ECCurve eCCurve = getCurve();
    SecP128R1FieldElement secP128R1FieldElement1 = (SecP128R1FieldElement)this.x;
    SecP128R1FieldElement secP128R1FieldElement2 = (SecP128R1FieldElement)this.y;
    SecP128R1FieldElement secP128R1FieldElement3 = (SecP128R1FieldElement)paramECPoint.getXCoord();
    SecP128R1FieldElement secP128R1FieldElement4 = (SecP128R1FieldElement)paramECPoint.getYCoord();
    SecP128R1FieldElement secP128R1FieldElement5 = (SecP128R1FieldElement)this.zs[0];
    SecP128R1FieldElement secP128R1FieldElement6 = (SecP128R1FieldElement)paramECPoint.getZCoord(0);
    int[] arrayOfInt1 = Nat128.createExt();
    int[] arrayOfInt2 = Nat128.create();
    int[] arrayOfInt3 = Nat128.create();
    int[] arrayOfInt4 = Nat128.create();
    boolean bool1 = secP128R1FieldElement5.isOne();
    if (bool1) {
      arrayOfInt5 = secP128R1FieldElement3.x;
      arrayOfInt6 = secP128R1FieldElement4.x;
    } else {
      arrayOfInt6 = arrayOfInt3;
      SecP128R1Field.square(secP128R1FieldElement5.x, arrayOfInt6);
      arrayOfInt5 = arrayOfInt2;
      SecP128R1Field.multiply(arrayOfInt6, secP128R1FieldElement3.x, arrayOfInt5);
      SecP128R1Field.multiply(arrayOfInt6, secP128R1FieldElement5.x, arrayOfInt6);
      SecP128R1Field.multiply(arrayOfInt6, secP128R1FieldElement4.x, arrayOfInt6);
    } 
    boolean bool2 = secP128R1FieldElement6.isOne();
    if (bool2) {
      arrayOfInt7 = secP128R1FieldElement1.x;
      arrayOfInt8 = secP128R1FieldElement2.x;
    } else {
      arrayOfInt8 = arrayOfInt4;
      SecP128R1Field.square(secP128R1FieldElement6.x, arrayOfInt8);
      arrayOfInt7 = arrayOfInt1;
      SecP128R1Field.multiply(arrayOfInt8, secP128R1FieldElement1.x, arrayOfInt7);
      SecP128R1Field.multiply(arrayOfInt8, secP128R1FieldElement6.x, arrayOfInt8);
      SecP128R1Field.multiply(arrayOfInt8, secP128R1FieldElement2.x, arrayOfInt8);
    } 
    int[] arrayOfInt9 = Nat128.create();
    SecP128R1Field.subtract(arrayOfInt7, arrayOfInt5, arrayOfInt9);
    int[] arrayOfInt10 = arrayOfInt2;
    SecP128R1Field.subtract(arrayOfInt8, arrayOfInt6, arrayOfInt10);
    if (Nat128.isZero(arrayOfInt9))
      return Nat128.isZero(arrayOfInt10) ? twice() : eCCurve.getInfinity(); 
    int[] arrayOfInt11 = arrayOfInt3;
    SecP128R1Field.square(arrayOfInt9, arrayOfInt11);
    int[] arrayOfInt12 = Nat128.create();
    SecP128R1Field.multiply(arrayOfInt11, arrayOfInt9, arrayOfInt12);
    int[] arrayOfInt13 = arrayOfInt3;
    SecP128R1Field.multiply(arrayOfInt11, arrayOfInt7, arrayOfInt13);
    SecP128R1Field.negate(arrayOfInt12, arrayOfInt12);
    Nat128.mul(arrayOfInt8, arrayOfInt12, arrayOfInt1);
    int i = Nat128.addBothTo(arrayOfInt13, arrayOfInt13, arrayOfInt12);
    SecP128R1Field.reduce32(i, arrayOfInt12);
    SecP128R1FieldElement secP128R1FieldElement7 = new SecP128R1FieldElement(arrayOfInt4);
    SecP128R1Field.square(arrayOfInt10, secP128R1FieldElement7.x);
    SecP128R1Field.subtract(secP128R1FieldElement7.x, arrayOfInt12, secP128R1FieldElement7.x);
    SecP128R1FieldElement secP128R1FieldElement8 = new SecP128R1FieldElement(arrayOfInt12);
    SecP128R1Field.subtract(arrayOfInt13, secP128R1FieldElement7.x, secP128R1FieldElement8.x);
    SecP128R1Field.multiplyAddToExt(secP128R1FieldElement8.x, arrayOfInt10, arrayOfInt1);
    SecP128R1Field.reduce(arrayOfInt1, secP128R1FieldElement8.x);
    SecP128R1FieldElement secP128R1FieldElement9 = new SecP128R1FieldElement(arrayOfInt9);
    if (!bool1)
      SecP128R1Field.multiply(secP128R1FieldElement9.x, secP128R1FieldElement5.x, secP128R1FieldElement9.x); 
    if (!bool2)
      SecP128R1Field.multiply(secP128R1FieldElement9.x, secP128R1FieldElement6.x, secP128R1FieldElement9.x); 
    ECFieldElement[] arrayOfECFieldElement = { (ECFieldElement)secP128R1FieldElement9 };
    return (ECPoint)new SecP128R1Point(eCCurve, (ECFieldElement)secP128R1FieldElement7, (ECFieldElement)secP128R1FieldElement8, arrayOfECFieldElement);
  }
  
  public ECPoint twice() {
    if (isInfinity())
      return (ECPoint)this; 
    ECCurve eCCurve = getCurve();
    SecP128R1FieldElement secP128R1FieldElement1 = (SecP128R1FieldElement)this.y;
    if (secP128R1FieldElement1.isZero())
      return eCCurve.getInfinity(); 
    SecP128R1FieldElement secP128R1FieldElement2 = (SecP128R1FieldElement)this.x;
    SecP128R1FieldElement secP128R1FieldElement3 = (SecP128R1FieldElement)this.zs[0];
    int[] arrayOfInt1 = Nat128.create();
    int[] arrayOfInt2 = Nat128.create();
    int[] arrayOfInt3 = Nat128.create();
    SecP128R1Field.square(secP128R1FieldElement1.x, arrayOfInt3);
    int[] arrayOfInt4 = Nat128.create();
    SecP128R1Field.square(arrayOfInt3, arrayOfInt4);
    boolean bool = secP128R1FieldElement3.isOne();
    int[] arrayOfInt5 = secP128R1FieldElement3.x;
    if (!bool) {
      arrayOfInt5 = arrayOfInt2;
      SecP128R1Field.square(secP128R1FieldElement3.x, arrayOfInt5);
    } 
    SecP128R1Field.subtract(secP128R1FieldElement2.x, arrayOfInt5, arrayOfInt1);
    int[] arrayOfInt6 = arrayOfInt2;
    SecP128R1Field.add(secP128R1FieldElement2.x, arrayOfInt5, arrayOfInt6);
    SecP128R1Field.multiply(arrayOfInt6, arrayOfInt1, arrayOfInt6);
    int i = Nat128.addBothTo(arrayOfInt6, arrayOfInt6, arrayOfInt6);
    SecP128R1Field.reduce32(i, arrayOfInt6);
    int[] arrayOfInt7 = arrayOfInt3;
    SecP128R1Field.multiply(arrayOfInt3, secP128R1FieldElement2.x, arrayOfInt7);
    i = Nat.shiftUpBits(4, arrayOfInt7, 2, 0);
    SecP128R1Field.reduce32(i, arrayOfInt7);
    i = Nat.shiftUpBits(4, arrayOfInt4, 3, 0, arrayOfInt1);
    SecP128R1Field.reduce32(i, arrayOfInt1);
    SecP128R1FieldElement secP128R1FieldElement4 = new SecP128R1FieldElement(arrayOfInt4);
    SecP128R1Field.square(arrayOfInt6, secP128R1FieldElement4.x);
    SecP128R1Field.subtract(secP128R1FieldElement4.x, arrayOfInt7, secP128R1FieldElement4.x);
    SecP128R1Field.subtract(secP128R1FieldElement4.x, arrayOfInt7, secP128R1FieldElement4.x);
    SecP128R1FieldElement secP128R1FieldElement5 = new SecP128R1FieldElement(arrayOfInt7);
    SecP128R1Field.subtract(arrayOfInt7, secP128R1FieldElement4.x, secP128R1FieldElement5.x);
    SecP128R1Field.multiply(secP128R1FieldElement5.x, arrayOfInt6, secP128R1FieldElement5.x);
    SecP128R1Field.subtract(secP128R1FieldElement5.x, arrayOfInt1, secP128R1FieldElement5.x);
    SecP128R1FieldElement secP128R1FieldElement6 = new SecP128R1FieldElement(arrayOfInt6);
    SecP128R1Field.twice(secP128R1FieldElement1.x, secP128R1FieldElement6.x);
    if (!bool)
      SecP128R1Field.multiply(secP128R1FieldElement6.x, secP128R1FieldElement3.x, secP128R1FieldElement6.x); 
    return (ECPoint)new SecP128R1Point(eCCurve, (ECFieldElement)secP128R1FieldElement4, (ECFieldElement)secP128R1FieldElement5, new ECFieldElement[] { (ECFieldElement)secP128R1FieldElement6 });
  }
  
  public ECPoint twicePlus(ECPoint paramECPoint) {
    if (this == paramECPoint)
      return threeTimes(); 
    if (isInfinity())
      return paramECPoint; 
    if (paramECPoint.isInfinity())
      return twice(); 
    ECFieldElement eCFieldElement = this.y;
    return eCFieldElement.isZero() ? paramECPoint : twice().add(paramECPoint);
  }
  
  public ECPoint threeTimes() {
    return (ECPoint)((isInfinity() || this.y.isZero()) ? this : twice().add((ECPoint)this));
  }
  
  public ECPoint negate() {
    return (ECPoint)(isInfinity() ? this : new SecP128R1Point(this.curve, this.x, this.y.negate(), this.zs));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\custom\sec\SecP128R1Point.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */