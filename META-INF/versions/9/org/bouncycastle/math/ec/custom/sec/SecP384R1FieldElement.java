package META-INF.versions.9.org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.custom.sec.SecP384R1Field;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

public class SecP384R1FieldElement extends ECFieldElement.AbstractFp {
  public static final BigInteger Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));
  
  protected int[] x;
  
  public SecP384R1FieldElement(BigInteger paramBigInteger) {
    if (paramBigInteger == null || paramBigInteger.signum() < 0 || paramBigInteger.compareTo(Q) >= 0)
      throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement"); 
    this.x = SecP384R1Field.fromBigInteger(paramBigInteger);
  }
  
  public SecP384R1FieldElement() {
    this.x = Nat.create(12);
  }
  
  protected SecP384R1FieldElement(int[] paramArrayOfint) {
    this.x = paramArrayOfint;
  }
  
  public boolean isZero() {
    return Nat.isZero(12, this.x);
  }
  
  public boolean isOne() {
    return Nat.isOne(12, this.x);
  }
  
  public boolean testBitZero() {
    return (Nat.getBit(this.x, 0) == 1);
  }
  
  public BigInteger toBigInteger() {
    return Nat.toBigInteger(12, this.x);
  }
  
  public String getFieldName() {
    return "SecP384R1Field";
  }
  
  public int getFieldSize() {
    return Q.bitLength();
  }
  
  public ECFieldElement add(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat.create(12);
    SecP384R1Field.add(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement addOne() {
    int[] arrayOfInt = Nat.create(12);
    SecP384R1Field.addOne(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement subtract(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat.create(12);
    SecP384R1Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement multiply(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat.create(12);
    SecP384R1Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement divide(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat.create(12);
    SecP384R1Field.inv(((org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement)paramECFieldElement).x, arrayOfInt);
    SecP384R1Field.multiply(arrayOfInt, this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement negate() {
    int[] arrayOfInt = Nat.create(12);
    SecP384R1Field.negate(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement square() {
    int[] arrayOfInt = Nat.create(12);
    SecP384R1Field.square(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement invert() {
    int[] arrayOfInt = Nat.create(12);
    SecP384R1Field.inv(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement sqrt() {
    int[] arrayOfInt1 = this.x;
    if (Nat.isZero(12, arrayOfInt1) || Nat.isOne(12, arrayOfInt1))
      return (ECFieldElement)this; 
    int[] arrayOfInt2 = Nat.create(24);
    int[] arrayOfInt3 = Nat.create(12);
    int[] arrayOfInt4 = Nat.create(12);
    int[] arrayOfInt5 = Nat.create(12);
    int[] arrayOfInt6 = Nat.create(12);
    SecP384R1Field.square(arrayOfInt1, arrayOfInt3, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt3, arrayOfInt1, arrayOfInt3, arrayOfInt2);
    SecP384R1Field.squareN(arrayOfInt3, 2, arrayOfInt4, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt4, arrayOfInt3, arrayOfInt4, arrayOfInt2);
    SecP384R1Field.square(arrayOfInt4, arrayOfInt4, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt4, arrayOfInt1, arrayOfInt4, arrayOfInt2);
    SecP384R1Field.squareN(arrayOfInt4, 5, arrayOfInt5, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt5, arrayOfInt4, arrayOfInt5, arrayOfInt2);
    SecP384R1Field.squareN(arrayOfInt5, 5, arrayOfInt6, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt6, arrayOfInt4, arrayOfInt6, arrayOfInt2);
    SecP384R1Field.squareN(arrayOfInt6, 15, arrayOfInt4, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt4, arrayOfInt6, arrayOfInt4, arrayOfInt2);
    SecP384R1Field.squareN(arrayOfInt4, 2, arrayOfInt5, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt3, arrayOfInt5, arrayOfInt3, arrayOfInt2);
    SecP384R1Field.squareN(arrayOfInt5, 28, arrayOfInt5, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt4, arrayOfInt5, arrayOfInt4, arrayOfInt2);
    SecP384R1Field.squareN(arrayOfInt4, 60, arrayOfInt5, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt5, arrayOfInt4, arrayOfInt5, arrayOfInt2);
    int[] arrayOfInt7 = arrayOfInt4;
    SecP384R1Field.squareN(arrayOfInt5, 120, arrayOfInt7, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt7, arrayOfInt5, arrayOfInt7, arrayOfInt2);
    SecP384R1Field.squareN(arrayOfInt7, 15, arrayOfInt7, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt7, arrayOfInt6, arrayOfInt7, arrayOfInt2);
    SecP384R1Field.squareN(arrayOfInt7, 33, arrayOfInt7, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt7, arrayOfInt3, arrayOfInt7, arrayOfInt2);
    SecP384R1Field.squareN(arrayOfInt7, 64, arrayOfInt7, arrayOfInt2);
    SecP384R1Field.multiply(arrayOfInt7, arrayOfInt1, arrayOfInt7, arrayOfInt2);
    SecP384R1Field.squareN(arrayOfInt7, 30, arrayOfInt3, arrayOfInt2);
    SecP384R1Field.square(arrayOfInt3, arrayOfInt4, arrayOfInt2);
    return Nat.eq(12, arrayOfInt1, arrayOfInt4) ? (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(arrayOfInt3) : null;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement))
      return false; 
    org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement secP384R1FieldElement = (org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement)paramObject;
    return Nat.eq(12, this.x, secP384R1FieldElement.x);
  }
  
  public int hashCode() {
    return Q.hashCode() ^ Arrays.hashCode(this.x, 0, 12);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\custom\sec\SecP384R1FieldElement.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */