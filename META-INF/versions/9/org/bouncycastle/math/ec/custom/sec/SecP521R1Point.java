package META-INF.versions.9.org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;
import org.bouncycastle.math.ec.custom.sec.SecP521R1FieldElement;
import org.bouncycastle.math.raw.Nat;

public class SecP521R1Point extends ECPoint.AbstractFp {
  SecP521R1Point(ECCurve paramECCurve, ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2) {
    super(paramECCurve, paramECFieldElement1, paramECFieldElement2);
  }
  
  SecP521R1Point(ECCurve paramECCurve, ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2, ECFieldElement[] paramArrayOfECFieldElement) {
    super(paramECCurve, paramECFieldElement1, paramECFieldElement2, paramArrayOfECFieldElement);
  }
  
  protected ECPoint detach() {
    return (ECPoint)new org.bouncycastle.math.ec.custom.sec.SecP521R1Point(null, getAffineXCoord(), getAffineYCoord());
  }
  
  public ECPoint add(ECPoint paramECPoint) {
    int[] arrayOfInt6;
    int[] arrayOfInt7;
    int[] arrayOfInt8;
    int[] arrayOfInt9;
    if (isInfinity())
      return paramECPoint; 
    if (paramECPoint.isInfinity())
      return (ECPoint)this; 
    if (this == paramECPoint)
      return twice(); 
    ECCurve eCCurve = getCurve();
    SecP521R1FieldElement secP521R1FieldElement1 = (SecP521R1FieldElement)this.x;
    SecP521R1FieldElement secP521R1FieldElement2 = (SecP521R1FieldElement)this.y;
    SecP521R1FieldElement secP521R1FieldElement3 = (SecP521R1FieldElement)paramECPoint.getXCoord();
    SecP521R1FieldElement secP521R1FieldElement4 = (SecP521R1FieldElement)paramECPoint.getYCoord();
    SecP521R1FieldElement secP521R1FieldElement5 = (SecP521R1FieldElement)this.zs[0];
    SecP521R1FieldElement secP521R1FieldElement6 = (SecP521R1FieldElement)paramECPoint.getZCoord(0);
    int[] arrayOfInt1 = Nat.create(33);
    int[] arrayOfInt2 = Nat.create(17);
    int[] arrayOfInt3 = Nat.create(17);
    int[] arrayOfInt4 = Nat.create(17);
    int[] arrayOfInt5 = Nat.create(17);
    boolean bool1 = secP521R1FieldElement5.isOne();
    if (bool1) {
      arrayOfInt6 = secP521R1FieldElement3.x;
      arrayOfInt7 = secP521R1FieldElement4.x;
    } else {
      arrayOfInt7 = arrayOfInt4;
      SecP521R1Field.square(secP521R1FieldElement5.x, arrayOfInt7, arrayOfInt1);
      arrayOfInt6 = arrayOfInt3;
      SecP521R1Field.multiply(arrayOfInt7, secP521R1FieldElement3.x, arrayOfInt6, arrayOfInt1);
      SecP521R1Field.multiply(arrayOfInt7, secP521R1FieldElement5.x, arrayOfInt7, arrayOfInt1);
      SecP521R1Field.multiply(arrayOfInt7, secP521R1FieldElement4.x, arrayOfInt7, arrayOfInt1);
    } 
    boolean bool2 = secP521R1FieldElement6.isOne();
    if (bool2) {
      arrayOfInt8 = secP521R1FieldElement1.x;
      arrayOfInt9 = secP521R1FieldElement2.x;
    } else {
      arrayOfInt9 = arrayOfInt5;
      SecP521R1Field.square(secP521R1FieldElement6.x, arrayOfInt9, arrayOfInt1);
      arrayOfInt8 = arrayOfInt2;
      SecP521R1Field.multiply(arrayOfInt9, secP521R1FieldElement1.x, arrayOfInt8, arrayOfInt1);
      SecP521R1Field.multiply(arrayOfInt9, secP521R1FieldElement6.x, arrayOfInt9, arrayOfInt1);
      SecP521R1Field.multiply(arrayOfInt9, secP521R1FieldElement2.x, arrayOfInt9, arrayOfInt1);
    } 
    int[] arrayOfInt10 = Nat.create(17);
    SecP521R1Field.subtract(arrayOfInt8, arrayOfInt6, arrayOfInt10);
    int[] arrayOfInt11 = arrayOfInt3;
    SecP521R1Field.subtract(arrayOfInt9, arrayOfInt7, arrayOfInt11);
    if (Nat.isZero(17, arrayOfInt10))
      return Nat.isZero(17, arrayOfInt11) ? twice() : eCCurve.getInfinity(); 
    int[] arrayOfInt12 = arrayOfInt4;
    SecP521R1Field.square(arrayOfInt10, arrayOfInt12, arrayOfInt1);
    int[] arrayOfInt13 = Nat.create(17);
    SecP521R1Field.multiply(arrayOfInt12, arrayOfInt10, arrayOfInt13, arrayOfInt1);
    int[] arrayOfInt14 = arrayOfInt4;
    SecP521R1Field.multiply(arrayOfInt12, arrayOfInt8, arrayOfInt14, arrayOfInt1);
    SecP521R1Field.multiply(arrayOfInt9, arrayOfInt13, arrayOfInt2, arrayOfInt1);
    SecP521R1FieldElement secP521R1FieldElement7 = new SecP521R1FieldElement(arrayOfInt5);
    SecP521R1Field.square(arrayOfInt11, secP521R1FieldElement7.x, arrayOfInt1);
    SecP521R1Field.add(secP521R1FieldElement7.x, arrayOfInt13, secP521R1FieldElement7.x);
    SecP521R1Field.subtract(secP521R1FieldElement7.x, arrayOfInt14, secP521R1FieldElement7.x);
    SecP521R1Field.subtract(secP521R1FieldElement7.x, arrayOfInt14, secP521R1FieldElement7.x);
    SecP521R1FieldElement secP521R1FieldElement8 = new SecP521R1FieldElement(arrayOfInt13);
    SecP521R1Field.subtract(arrayOfInt14, secP521R1FieldElement7.x, secP521R1FieldElement8.x);
    SecP521R1Field.multiply(secP521R1FieldElement8.x, arrayOfInt11, arrayOfInt3, arrayOfInt1);
    SecP521R1Field.subtract(arrayOfInt3, arrayOfInt2, secP521R1FieldElement8.x);
    SecP521R1FieldElement secP521R1FieldElement9 = new SecP521R1FieldElement(arrayOfInt10);
    if (!bool1)
      SecP521R1Field.multiply(secP521R1FieldElement9.x, secP521R1FieldElement5.x, secP521R1FieldElement9.x, arrayOfInt1); 
    if (!bool2)
      SecP521R1Field.multiply(secP521R1FieldElement9.x, secP521R1FieldElement6.x, secP521R1FieldElement9.x, arrayOfInt1); 
    ECFieldElement[] arrayOfECFieldElement = { (ECFieldElement)secP521R1FieldElement9 };
    return (ECPoint)new org.bouncycastle.math.ec.custom.sec.SecP521R1Point(eCCurve, (ECFieldElement)secP521R1FieldElement7, (ECFieldElement)secP521R1FieldElement8, arrayOfECFieldElement);
  }
  
  public ECPoint twice() {
    if (isInfinity())
      return (ECPoint)this; 
    ECCurve eCCurve = getCurve();
    SecP521R1FieldElement secP521R1FieldElement1 = (SecP521R1FieldElement)this.y;
    if (secP521R1FieldElement1.isZero())
      return eCCurve.getInfinity(); 
    SecP521R1FieldElement secP521R1FieldElement2 = (SecP521R1FieldElement)this.x;
    SecP521R1FieldElement secP521R1FieldElement3 = (SecP521R1FieldElement)this.zs[0];
    int[] arrayOfInt1 = Nat.create(33);
    int[] arrayOfInt2 = Nat.create(17);
    int[] arrayOfInt3 = Nat.create(17);
    int[] arrayOfInt4 = Nat.create(17);
    SecP521R1Field.square(secP521R1FieldElement1.x, arrayOfInt4, arrayOfInt1);
    int[] arrayOfInt5 = Nat.create(17);
    SecP521R1Field.square(arrayOfInt4, arrayOfInt5, arrayOfInt1);
    boolean bool = secP521R1FieldElement3.isOne();
    int[] arrayOfInt6 = secP521R1FieldElement3.x;
    if (!bool) {
      arrayOfInt6 = arrayOfInt3;
      SecP521R1Field.square(secP521R1FieldElement3.x, arrayOfInt6, arrayOfInt1);
    } 
    SecP521R1Field.subtract(secP521R1FieldElement2.x, arrayOfInt6, arrayOfInt2);
    int[] arrayOfInt7 = arrayOfInt3;
    SecP521R1Field.add(secP521R1FieldElement2.x, arrayOfInt6, arrayOfInt7);
    SecP521R1Field.multiply(arrayOfInt7, arrayOfInt2, arrayOfInt7, arrayOfInt1);
    Nat.addBothTo(17, arrayOfInt7, arrayOfInt7, arrayOfInt7);
    SecP521R1Field.reduce23(arrayOfInt7);
    int[] arrayOfInt8 = arrayOfInt4;
    SecP521R1Field.multiply(arrayOfInt4, secP521R1FieldElement2.x, arrayOfInt8, arrayOfInt1);
    Nat.shiftUpBits(17, arrayOfInt8, 2, 0);
    SecP521R1Field.reduce23(arrayOfInt8);
    Nat.shiftUpBits(17, arrayOfInt5, 3, 0, arrayOfInt2);
    SecP521R1Field.reduce23(arrayOfInt2);
    SecP521R1FieldElement secP521R1FieldElement4 = new SecP521R1FieldElement(arrayOfInt5);
    SecP521R1Field.square(arrayOfInt7, secP521R1FieldElement4.x, arrayOfInt1);
    SecP521R1Field.subtract(secP521R1FieldElement4.x, arrayOfInt8, secP521R1FieldElement4.x);
    SecP521R1Field.subtract(secP521R1FieldElement4.x, arrayOfInt8, secP521R1FieldElement4.x);
    SecP521R1FieldElement secP521R1FieldElement5 = new SecP521R1FieldElement(arrayOfInt8);
    SecP521R1Field.subtract(arrayOfInt8, secP521R1FieldElement4.x, secP521R1FieldElement5.x);
    SecP521R1Field.multiply(secP521R1FieldElement5.x, arrayOfInt7, secP521R1FieldElement5.x, arrayOfInt1);
    SecP521R1Field.subtract(secP521R1FieldElement5.x, arrayOfInt2, secP521R1FieldElement5.x);
    SecP521R1FieldElement secP521R1FieldElement6 = new SecP521R1FieldElement(arrayOfInt7);
    SecP521R1Field.twice(secP521R1FieldElement1.x, secP521R1FieldElement6.x);
    if (!bool)
      SecP521R1Field.multiply(secP521R1FieldElement6.x, secP521R1FieldElement3.x, secP521R1FieldElement6.x, arrayOfInt1); 
    return (ECPoint)new org.bouncycastle.math.ec.custom.sec.SecP521R1Point(eCCurve, (ECFieldElement)secP521R1FieldElement4, (ECFieldElement)secP521R1FieldElement5, new ECFieldElement[] { (ECFieldElement)secP521R1FieldElement6 });
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
  
  protected ECFieldElement two(ECFieldElement paramECFieldElement) {
    return paramECFieldElement.add(paramECFieldElement);
  }
  
  protected ECFieldElement three(ECFieldElement paramECFieldElement) {
    return two(paramECFieldElement).add(paramECFieldElement);
  }
  
  protected ECFieldElement four(ECFieldElement paramECFieldElement) {
    return two(two(paramECFieldElement));
  }
  
  protected ECFieldElement eight(ECFieldElement paramECFieldElement) {
    return four(two(paramECFieldElement));
  }
  
  protected ECFieldElement doubleProductFromSquares(ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2, ECFieldElement paramECFieldElement3, ECFieldElement paramECFieldElement4) {
    return paramECFieldElement1.add(paramECFieldElement2).square().subtract(paramECFieldElement3).subtract(paramECFieldElement4);
  }
  
  public ECPoint negate() {
    return (ECPoint)(isInfinity() ? this : new org.bouncycastle.math.ec.custom.sec.SecP521R1Point(this.curve, this.x, this.y.negate(), this.zs));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\custom\sec\SecP521R1Point.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */