package META-INF.versions.9.org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.custom.sec.SecP256R1Field;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

public class SecP256R1FieldElement extends ECFieldElement.AbstractFp {
  public static final BigInteger Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));
  
  protected int[] x;
  
  public SecP256R1FieldElement(BigInteger paramBigInteger) {
    if (paramBigInteger == null || paramBigInteger.signum() < 0 || paramBigInteger.compareTo(Q) >= 0)
      throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement"); 
    this.x = SecP256R1Field.fromBigInteger(paramBigInteger);
  }
  
  public SecP256R1FieldElement() {
    this.x = Nat256.create();
  }
  
  protected SecP256R1FieldElement(int[] paramArrayOfint) {
    this.x = paramArrayOfint;
  }
  
  public boolean isZero() {
    return Nat256.isZero(this.x);
  }
  
  public boolean isOne() {
    return Nat256.isOne(this.x);
  }
  
  public boolean testBitZero() {
    return (Nat256.getBit(this.x, 0) == 1);
  }
  
  public BigInteger toBigInteger() {
    return Nat256.toBigInteger(this.x);
  }
  
  public String getFieldName() {
    return "SecP256R1Field";
  }
  
  public int getFieldSize() {
    return Q.bitLength();
  }
  
  public ECFieldElement add(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat256.create();
    SecP256R1Field.add(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement addOne() {
    int[] arrayOfInt = Nat256.create();
    SecP256R1Field.addOne(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement subtract(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat256.create();
    SecP256R1Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement multiply(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat256.create();
    SecP256R1Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement divide(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat256.create();
    SecP256R1Field.inv(((org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement)paramECFieldElement).x, arrayOfInt);
    SecP256R1Field.multiply(arrayOfInt, this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement negate() {
    int[] arrayOfInt = Nat256.create();
    SecP256R1Field.negate(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement square() {
    int[] arrayOfInt = Nat256.create();
    SecP256R1Field.square(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement invert() {
    int[] arrayOfInt = Nat256.create();
    SecP256R1Field.inv(this.x, arrayOfInt);
    return (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement sqrt() {
    int[] arrayOfInt1 = this.x;
    if (Nat256.isZero(arrayOfInt1) || Nat256.isOne(arrayOfInt1))
      return (ECFieldElement)this; 
    int[] arrayOfInt2 = Nat256.createExt();
    int[] arrayOfInt3 = Nat256.create();
    int[] arrayOfInt4 = Nat256.create();
    SecP256R1Field.square(arrayOfInt1, arrayOfInt3, arrayOfInt2);
    SecP256R1Field.multiply(arrayOfInt3, arrayOfInt1, arrayOfInt3, arrayOfInt2);
    SecP256R1Field.squareN(arrayOfInt3, 2, arrayOfInt4, arrayOfInt2);
    SecP256R1Field.multiply(arrayOfInt4, arrayOfInt3, arrayOfInt4, arrayOfInt2);
    SecP256R1Field.squareN(arrayOfInt4, 4, arrayOfInt3, arrayOfInt2);
    SecP256R1Field.multiply(arrayOfInt3, arrayOfInt4, arrayOfInt3, arrayOfInt2);
    SecP256R1Field.squareN(arrayOfInt3, 8, arrayOfInt4, arrayOfInt2);
    SecP256R1Field.multiply(arrayOfInt4, arrayOfInt3, arrayOfInt4, arrayOfInt2);
    SecP256R1Field.squareN(arrayOfInt4, 16, arrayOfInt3, arrayOfInt2);
    SecP256R1Field.multiply(arrayOfInt3, arrayOfInt4, arrayOfInt3, arrayOfInt2);
    SecP256R1Field.squareN(arrayOfInt3, 32, arrayOfInt3, arrayOfInt2);
    SecP256R1Field.multiply(arrayOfInt3, arrayOfInt1, arrayOfInt3, arrayOfInt2);
    SecP256R1Field.squareN(arrayOfInt3, 96, arrayOfInt3, arrayOfInt2);
    SecP256R1Field.multiply(arrayOfInt3, arrayOfInt1, arrayOfInt3, arrayOfInt2);
    SecP256R1Field.squareN(arrayOfInt3, 94, arrayOfInt3, arrayOfInt2);
    SecP256R1Field.square(arrayOfInt3, arrayOfInt4, arrayOfInt2);
    return Nat256.eq(arrayOfInt1, arrayOfInt4) ? (ECFieldElement)new org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement(arrayOfInt3) : null;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement))
      return false; 
    org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement secP256R1FieldElement = (org.bouncycastle.math.ec.custom.sec.SecP256R1FieldElement)paramObject;
    return Nat256.eq(this.x, secP256R1FieldElement.x);
  }
  
  public int hashCode() {
    return Q.hashCode() ^ Arrays.hashCode(this.x, 0, 8);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\math\ec\custom\sec\SecP256R1FieldElement.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */