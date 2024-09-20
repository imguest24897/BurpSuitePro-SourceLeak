package META-INF.versions.9.org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.custom.sec.SecP256K1Field;
import org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

public class SecP256K1Point extends ECPoint.AbstractFp {
  SecP256K1Point(ECCurve paramECCurve, ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2) {
    super(paramECCurve, paramECFieldElement1, paramECFieldElement2);
  }
  
  SecP256K1Point(ECCurve paramECCurve, ECFieldElement paramECFieldElement1, ECFieldElement paramECFieldElement2, ECFieldElement[] paramArrayOfECFieldElement) {
    super(paramECCurve, paramECFieldElement1, paramECFieldElement2, paramArrayOfECFieldElement);
  }
  
  protected ECPoint detach() {
    return (ECPoint)new org.bouncycastle.math.ec.custom.sec.SecP256K1Point(null, getAffineXCoord(), getAffineYCoord());
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
    SecP256K1FieldElement secP256K1FieldElement1 = (SecP256K1FieldElement)this.x;
    SecP256K1FieldElement secP256K1FieldElement2 = (SecP256K1FieldElement)this.y;
    SecP256K1FieldElement secP256K1FieldElement3 = (SecP256K1FieldElement)paramECPoint.getXCoord();
    SecP256K1FieldElement secP256K1FieldElement4 = (SecP256K1FieldElement)paramECPoint.getYCoord();
    SecP256K1FieldElement secP256K1FieldElement5 = (SecP256K1FieldElement)this.zs[0];
    SecP256K1FieldElement secP256K1FieldElement6 = (SecP256K1FieldElement)paramECPoint.getZCoord(0);
    int[] arrayOfInt1 = Nat256.createExt();
    int[] arrayOfInt2 = Nat256.createExt();
    int[] arrayOfInt3 = Nat256.create();
    int[] arrayOfInt4 = Nat256.create();
    int[] arrayOfInt5 = Nat256.create();
    boolean bool1 = secP256K1FieldElement5.isOne();
    if (bool1) {
      arrayOfInt6 = secP256K1FieldElement3.x;
      arrayOfInt7 = secP256K1FieldElement4.x;
    } else {
      arrayOfInt7 = arrayOfInt4;
      SecP256K1Field.square(secP256K1FieldElement5.x, arrayOfInt7, arrayOfInt1);
      arrayOfInt6 = arrayOfInt3;
      SecP256K1Field.multiply(arrayOfInt7, secP256K1FieldElement3.x, arrayOfInt6, arrayOfInt1);
      SecP256K1Field.multiply(arrayOfInt7, secP256K1FieldElement5.x, arrayOfInt7, arrayOfInt1);
      SecP256K1Field.multiply(arrayOfInt7, secP256K1FieldElement4.x, arrayOfInt7, arrayOfInt1);
    } 
    boolean bool2 = secP256K1FieldElement6.isOne();
    if (bool2) {
      arrayOfInt8 = secP256K1FieldElement1.x;
      arrayOfInt9 = secP256K1FieldElement2.x;
    } else {
      arrayOfInt9 = arrayOfInt5;
      SecP256K1Field.square(secP256K1FieldElement6.x, arrayOfInt9, arrayOfInt1);
      arrayOfInt8 = arrayOfInt2;
      SecP256K1Field.multiply(arrayOfInt9, secP256K1FieldElement1.x, arrayOfInt8, arrayOfInt1);
      SecP256K1Field.multiply(arrayOfInt9, secP256K1FieldElement6.x, arrayOfInt9, arrayOfInt1);
      SecP256K1Field.multiply(arrayOfInt9, secP256K1FieldElement2.x, arrayOfInt9, arrayOfInt1);
    } 
    int[] arrayOfInt10 = Nat256.create();
    SecP256K1Field.subtract(arrayOfInt8, arrayOfInt6, arrayOfInt10);
    int[] arrayOfInt11 = arrayOfInt3;
    SecP256K1Field.subtract(arrayOfInt9, arrayOfInt7, arrayOfInt11);
    if (Nat256.isZero(arrayOfInt10))
      return Nat256.isZero(arrayOfInt11) ? twice() : eCCurve.getInfinity(); 
    int[] arrayOfInt12 = arrayOfInt4;
    SecP256K1Field.square(arrayOfInt10, arrayOfInt12, arrayOfInt1);
    int[] arrayOfInt13 = Nat256.create();
    SecP256K1Field.multiply(arrayOfInt12, arrayOfInt10, arrayOfInt13, arrayOfInt1);
    int[] arrayOfInt14 = arrayOfInt4;
    SecP256K1Field.multiply(arrayOfInt12, arrayOfInt8, arrayOfInt14, arrayOfInt1);
    SecP256K1Field.negate(arrayOfInt13, arrayOfInt13);
    Nat256.mul(arrayOfInt9, arrayOfInt13, arrayOfInt2);
    int i = Nat256.addBothTo(arrayOfInt14, arrayOfInt14, arrayOfInt13);
    SecP256K1Field.reduce32(i, arrayOfInt13);
    SecP256K1FieldElement secP256K1FieldElement7 = new SecP256K1FieldElement(arrayOfInt5);
    SecP256K1Field.square(arrayOfInt11, secP256K1FieldElement7.x, arrayOfInt1);
    SecP256K1Field.subtract(secP256K1FieldElement7.x, arrayOfInt13, secP256K1FieldElement7.x);
    SecP256K1FieldElement secP256K1FieldElement8 = new SecP256K1FieldElement(arrayOfInt13);
    SecP256K1Field.subtract(arrayOfInt14, secP256K1FieldElement7.x, secP256K1FieldElement8.x);
    SecP256K1Field.multiplyAddToExt(secP256K1FieldElement8.x, arrayOfInt11, arrayOfInt2);
    SecP256K1Field.reduce(arrayOfInt2, secP256K1FieldElement8.x);
    SecP256K1FieldElement secP256K1FieldElement9 = new SecP256K1FieldElement(arrayOfInt10);
    if (!bool1)
      SecP256K1Field.multiply(secP256K1FieldElement9.x, secP256K1FieldElement5.x, secP256K1FieldElement9.x, arrayOfInt1); 
    if (!bool2)
      SecP256K1Field.multiply(secP256K1FieldElement9.x, secP256K1FieldElement6.x, secP256K1FieldElement9.x, arrayOfInt1); 
    ECFieldElement[] arrayOfECFieldElement = { (ECFieldElement)secP256K1FieldElement9 };
    return (ECPoint)new org.bouncycastle.math.ec.custom.sec.SecP256K1Point(eCCurve, (ECFieldElement)secP256K1FieldElement7, (ECFieldElement)secP256K1FieldElement8, arrayOfECFieldElement);
  }
  
  public ECPoint twice() {
    if (isInfinity())
      return (ECPoint)this; 
    ECCurve eCCurve = getCurve();
    SecP256K1FieldElement secP256K1FieldElement1 = (SecP256K1FieldElement)this.y;
    if (secP256K1FieldElement1.isZero())
      return eCCurve.getInfinity(); 
    SecP256K1FieldElement secP256K1FieldElement2 = (SecP256K1FieldElement)this.x;
    SecP256K1FieldElement secP256K1FieldElement3 = (SecP256K1FieldElement)this.zs[0];
    int[] arrayOfInt1 = Nat256.createExt();
    int[] arrayOfInt2 = Nat256.create();
    SecP256K1Field.square(secP256K1FieldElement1.x, arrayOfInt2, arrayOfInt1);
    int[] arrayOfInt3 = Nat256.create();
    SecP256K1Field.square(arrayOfInt2, arrayOfInt3, arrayOfInt1);
    int[] arrayOfInt4 = Nat256.create();
    SecP256K1Field.square(secP256K1FieldElement2.x, arrayOfInt4, arrayOfInt1);
    int i = Nat256.addBothTo(arrayOfInt4, arrayOfInt4, arrayOfInt4);
    SecP256K1Field.reduce32(i, arrayOfInt4);
    int[] arrayOfInt5 = arrayOfInt2;
    SecP256K1Field.multiply(arrayOfInt2, secP256K1FieldElement2.x, arrayOfInt5, arrayOfInt1);
    i = Nat.shiftUpBits(8, arrayOfInt5, 2, 0);
    SecP256K1Field.reduce32(i, arrayOfInt5);
    int[] arrayOfInt6 = Nat256.create();
    i = Nat.shiftUpBits(8, arrayOfInt3, 3, 0, arrayOfInt6);
    SecP256K1Field.reduce32(i, arrayOfInt6);
    SecP256K1FieldElement secP256K1FieldElement4 = new SecP256K1FieldElement(arrayOfInt3);
    SecP256K1Field.square(arrayOfInt4, secP256K1FieldElement4.x, arrayOfInt1);
    SecP256K1Field.subtract(secP256K1FieldElement4.x, arrayOfInt5, secP256K1FieldElement4.x);
    SecP256K1Field.subtract(secP256K1FieldElement4.x, arrayOfInt5, secP256K1FieldElement4.x);
    SecP256K1FieldElement secP256K1FieldElement5 = new SecP256K1FieldElement(arrayOfInt5);
    SecP256K1Field.subtract(arrayOfInt5, secP256K1FieldElement4.x, secP256K1FieldElement5.x);
    SecP256K1Field.multiply(secP256K1FieldElement5.x, arrayOfInt4, secP256K1FieldElement5.x, arrayOfInt1);
    SecP256K1Field.subtract(secP256K1FieldElement5.x, arrayOfInt6, secP256K1FieldElement5.x);
    SecP256K1FieldElement secP256K1FieldElement6 = new SecP256K1FieldElement(arrayOfInt4);
    SecP256K1Field.twice(secP256K1FieldElement1.x, secP256K1FieldElement6.x);
    if (!secP256K1FieldElement3.isOne())
      SecP256K1Field.multiply(secP256K1FieldElement6.x, secP256K1FieldElement3.x, secP256K1FieldElement6.x, arrayOfInt1); 
    return (ECPoint)new org.bouncycastle.math.ec.custom.sec.SecP256K1Point(eCCurve, (ECFieldElement)secP256K1FieldElement4, (ECFieldElement)secP256K1FieldElement5, new ECFieldElement[] { (ECFieldElement)secP256K1FieldElement6 });
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
    return (ECPoint)(isInfinity() ? this : new org.bouncycastle.math.ec.custom.sec.SecP256K1Point(this.curve, this.x, this.y.negate(), this.zs));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\custom\sec\SecP256K1Point.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */