package META-INF.versions.9.org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.custom.sec.SecP384R1Field;
import org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat384;

public class SecP384R1Point extends ECPoint.AbstractFp {
  SecP384R1Point(ECCurve paramECCurve, ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2) {
    super(paramECCurve, paramECFieldElement1, paramECFieldElement2);
  }
  
  SecP384R1Point(ECCurve paramECCurve, ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2, ECFieldElement[] paramArrayOfECFieldElement) {
    super(paramECCurve, paramECFieldElement1, paramECFieldElement2, paramArrayOfECFieldElement);
  }
  
  protected ECPoint detach() {
    return (ECPoint)new org.bouncycastle.math.ec.custom.sec.SecP384R1Point(null, getAffineXCoord(), getAffineYCoord());
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
    SecP384R1FieldElement secP384R1FieldElement1 = (SecP384R1FieldElement)this.x;
    SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement)this.y;
    SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement)paramECPoint.getXCoord();
    SecP384R1FieldElement secP384R1FieldElement4 = (SecP384R1FieldElement)paramECPoint.getYCoord();
    SecP384R1FieldElement secP384R1FieldElement5 = (SecP384R1FieldElement)this.zs[0];
    SecP384R1FieldElement secP384R1FieldElement6 = (SecP384R1FieldElement)paramECPoint.getZCoord(0);
    int[] arrayOfInt1 = Nat.create(24);
    int[] arrayOfInt2 = Nat.create(24);
    int[] arrayOfInt3 = Nat.create(24);
    int[] arrayOfInt4 = Nat.create(12);
    int[] arrayOfInt5 = Nat.create(12);
    boolean bool1 = secP384R1FieldElement5.isOne();
    if (bool1) {
      arrayOfInt6 = secP384R1FieldElement3.x;
      arrayOfInt7 = secP384R1FieldElement4.x;
    } else {
      arrayOfInt7 = arrayOfInt4;
      SecP384R1Field.square(secP384R1FieldElement5.x, arrayOfInt7, arrayOfInt1);
      arrayOfInt6 = arrayOfInt3;
      SecP384R1Field.multiply(arrayOfInt7, secP384R1FieldElement3.x, arrayOfInt6, arrayOfInt1);
      SecP384R1Field.multiply(arrayOfInt7, secP384R1FieldElement5.x, arrayOfInt7, arrayOfInt1);
      SecP384R1Field.multiply(arrayOfInt7, secP384R1FieldElement4.x, arrayOfInt7, arrayOfInt1);
    } 
    boolean bool2 = secP384R1FieldElement6.isOne();
    if (bool2) {
      arrayOfInt8 = secP384R1FieldElement1.x;
      arrayOfInt9 = secP384R1FieldElement2.x;
    } else {
      arrayOfInt9 = arrayOfInt5;
      SecP384R1Field.square(secP384R1FieldElement6.x, arrayOfInt9, arrayOfInt1);
      arrayOfInt8 = arrayOfInt2;
      SecP384R1Field.multiply(arrayOfInt9, secP384R1FieldElement1.x, arrayOfInt8, arrayOfInt1);
      SecP384R1Field.multiply(arrayOfInt9, secP384R1FieldElement6.x, arrayOfInt9, arrayOfInt1);
      SecP384R1Field.multiply(arrayOfInt9, secP384R1FieldElement2.x, arrayOfInt9, arrayOfInt1);
    } 
    int[] arrayOfInt10 = Nat.create(12);
    SecP384R1Field.subtract(arrayOfInt8, arrayOfInt6, arrayOfInt10);
    int[] arrayOfInt11 = Nat.create(12);
    SecP384R1Field.subtract(arrayOfInt9, arrayOfInt7, arrayOfInt11);
    if (Nat.isZero(12, arrayOfInt10))
      return Nat.isZero(12, arrayOfInt11) ? twice() : eCCurve.getInfinity(); 
    int[] arrayOfInt12 = arrayOfInt4;
    SecP384R1Field.square(arrayOfInt10, arrayOfInt12, arrayOfInt1);
    int[] arrayOfInt13 = Nat.create(12);
    SecP384R1Field.multiply(arrayOfInt12, arrayOfInt10, arrayOfInt13, arrayOfInt1);
    int[] arrayOfInt14 = arrayOfInt4;
    SecP384R1Field.multiply(arrayOfInt12, arrayOfInt8, arrayOfInt14, arrayOfInt1);
    SecP384R1Field.negate(arrayOfInt13, arrayOfInt13);
    Nat384.mul(arrayOfInt9, arrayOfInt13, arrayOfInt2);
    int i = Nat.addBothTo(12, arrayOfInt14, arrayOfInt14, arrayOfInt13);
    SecP384R1Field.reduce32(i, arrayOfInt13);
    SecP384R1FieldElement secP384R1FieldElement7 = new SecP384R1FieldElement(arrayOfInt5);
    SecP384R1Field.square(arrayOfInt11, secP384R1FieldElement7.x, arrayOfInt1);
    SecP384R1Field.subtract(secP384R1FieldElement7.x, arrayOfInt13, secP384R1FieldElement7.x);
    SecP384R1FieldElement secP384R1FieldElement8 = new SecP384R1FieldElement(arrayOfInt13);
    SecP384R1Field.subtract(arrayOfInt14, secP384R1FieldElement7.x, secP384R1FieldElement8.x);
    Nat384.mul(secP384R1FieldElement8.x, arrayOfInt11, arrayOfInt3);
    SecP384R1Field.addExt(arrayOfInt2, arrayOfInt3, arrayOfInt2);
    SecP384R1Field.reduce(arrayOfInt2, secP384R1FieldElement8.x);
    SecP384R1FieldElement secP384R1FieldElement9 = new SecP384R1FieldElement(arrayOfInt10);
    if (!bool1)
      SecP384R1Field.multiply(secP384R1FieldElement9.x, secP384R1FieldElement5.x, secP384R1FieldElement9.x, arrayOfInt1); 
    if (!bool2)
      SecP384R1Field.multiply(secP384R1FieldElement9.x, secP384R1FieldElement6.x, secP384R1FieldElement9.x, arrayOfInt1); 
    ECFieldElement[] arrayOfECFieldElement = { (ECFieldElement)secP384R1FieldElement9 };
    return (ECPoint)new org.bouncycastle.math.ec.custom.sec.SecP384R1Point(eCCurve, (ECFieldElement)secP384R1FieldElement7, (ECFieldElement)secP384R1FieldElement8, arrayOfECFieldElement);
  }
  
  public ECPoint twice() {
    if (isInfinity())
      return (ECPoint)this; 
    ECCurve eCCurve = getCurve();
    SecP384R1FieldElement secP384R1FieldElement1 = (SecP384R1FieldElement)this.y;
    if (secP384R1FieldElement1.isZero())
      return eCCurve.getInfinity(); 
    SecP384R1FieldElement secP384R1FieldElement2 = (SecP384R1FieldElement)this.x;
    SecP384R1FieldElement secP384R1FieldElement3 = (SecP384R1FieldElement)this.zs[0];
    int[] arrayOfInt1 = Nat.create(24);
    int[] arrayOfInt2 = Nat.create(12);
    int[] arrayOfInt3 = Nat.create(12);
    int[] arrayOfInt4 = Nat.create(12);
    SecP384R1Field.square(secP384R1FieldElement1.x, arrayOfInt4, arrayOfInt1);
    int[] arrayOfInt5 = Nat.create(12);
    SecP384R1Field.square(arrayOfInt4, arrayOfInt5, arrayOfInt1);
    boolean bool = secP384R1FieldElement3.isOne();
    int[] arrayOfInt6 = secP384R1FieldElement3.x;
    if (!bool) {
      arrayOfInt6 = arrayOfInt3;
      SecP384R1Field.square(secP384R1FieldElement3.x, arrayOfInt6, arrayOfInt1);
    } 
    SecP384R1Field.subtract(secP384R1FieldElement2.x, arrayOfInt6, arrayOfInt2);
    int[] arrayOfInt7 = arrayOfInt3;
    SecP384R1Field.add(secP384R1FieldElement2.x, arrayOfInt6, arrayOfInt7);
    SecP384R1Field.multiply(arrayOfInt7, arrayOfInt2, arrayOfInt7, arrayOfInt1);
    int i = Nat.addBothTo(12, arrayOfInt7, arrayOfInt7, arrayOfInt7);
    SecP384R1Field.reduce32(i, arrayOfInt7);
    int[] arrayOfInt8 = arrayOfInt4;
    SecP384R1Field.multiply(arrayOfInt4, secP384R1FieldElement2.x, arrayOfInt8, arrayOfInt1);
    i = Nat.shiftUpBits(12, arrayOfInt8, 2, 0);
    SecP384R1Field.reduce32(i, arrayOfInt8);
    i = Nat.shiftUpBits(12, arrayOfInt5, 3, 0, arrayOfInt2);
    SecP384R1Field.reduce32(i, arrayOfInt2);
    SecP384R1FieldElement secP384R1FieldElement4 = new SecP384R1FieldElement(arrayOfInt5);
    SecP384R1Field.square(arrayOfInt7, secP384R1FieldElement4.x, arrayOfInt1);
    SecP384R1Field.subtract(secP384R1FieldElement4.x, arrayOfInt8, secP384R1FieldElement4.x);
    SecP384R1Field.subtract(secP384R1FieldElement4.x, arrayOfInt8, secP384R1FieldElement4.x);
    SecP384R1FieldElement secP384R1FieldElement5 = new SecP384R1FieldElement(arrayOfInt8);
    SecP384R1Field.subtract(arrayOfInt8, secP384R1FieldElement4.x, secP384R1FieldElement5.x);
    SecP384R1Field.multiply(secP384R1FieldElement5.x, arrayOfInt7, secP384R1FieldElement5.x, arrayOfInt1);
    SecP384R1Field.subtract(secP384R1FieldElement5.x, arrayOfInt2, secP384R1FieldElement5.x);
    SecP384R1FieldElement secP384R1FieldElement6 = new SecP384R1FieldElement(arrayOfInt7);
    SecP384R1Field.twice(secP384R1FieldElement1.x, secP384R1FieldElement6.x);
    if (!bool)
      SecP384R1Field.multiply(secP384R1FieldElement6.x, secP384R1FieldElement3.x, secP384R1FieldElement6.x, arrayOfInt1); 
    return (ECPoint)new org.bouncycastle.math.ec.custom.sec.SecP384R1Point(eCCurve, (ECFieldElement)secP384R1FieldElement4, (ECFieldElement)secP384R1FieldElement5, new ECFieldElement[] { (ECFieldElement)secP384R1FieldElement6 });
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
    return (ECPoint)(isInfinity() ? this : new org.bouncycastle.math.ec.custom.sec.SecP384R1Point(this.curve, this.x, this.y.negate(), this.zs));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\custom\sec\SecP384R1Point.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */