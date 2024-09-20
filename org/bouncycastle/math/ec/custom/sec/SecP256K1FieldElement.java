package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

public class SecP256K1FieldElement extends ECFieldElement.AbstractFp {
  public static final BigInteger Q = new BigInteger(1, Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));
  
  protected int[] x;
  
  public SecP256K1FieldElement(BigInteger paramBigInteger) {
    if (paramBigInteger == null || paramBigInteger.signum() < 0 || paramBigInteger.compareTo(Q) >= 0)
      throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement"); 
    this.x = SecP256K1Field.fromBigInteger(paramBigInteger);
  }
  
  public SecP256K1FieldElement() {
    this.x = Nat256.create();
  }
  
  protected SecP256K1FieldElement(int[] paramArrayOfint) {
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
    return "SecP256K1Field";
  }
  
  public int getFieldSize() {
    return Q.bitLength();
  }
  
  public ECFieldElement add(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat256.create();
    SecP256K1Field.add(this.x, ((SecP256K1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new SecP256K1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement addOne() {
    int[] arrayOfInt = Nat256.create();
    SecP256K1Field.addOne(this.x, arrayOfInt);
    return (ECFieldElement)new SecP256K1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement subtract(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat256.create();
    SecP256K1Field.subtract(this.x, ((SecP256K1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new SecP256K1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement multiply(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat256.create();
    SecP256K1Field.multiply(this.x, ((SecP256K1FieldElement)paramECFieldElement).x, arrayOfInt);
    return (ECFieldElement)new SecP256K1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement divide(ECFieldElement paramECFieldElement) {
    int[] arrayOfInt = Nat256.create();
    SecP256K1Field.inv(((SecP256K1FieldElement)paramECFieldElement).x, arrayOfInt);
    SecP256K1Field.multiply(arrayOfInt, this.x, arrayOfInt);
    return (ECFieldElement)new SecP256K1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement negate() {
    int[] arrayOfInt = Nat256.create();
    SecP256K1Field.negate(this.x, arrayOfInt);
    return (ECFieldElement)new SecP256K1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement square() {
    int[] arrayOfInt = Nat256.create();
    SecP256K1Field.square(this.x, arrayOfInt);
    return (ECFieldElement)new SecP256K1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement invert() {
    int[] arrayOfInt = Nat256.create();
    SecP256K1Field.inv(this.x, arrayOfInt);
    return (ECFieldElement)new SecP256K1FieldElement(arrayOfInt);
  }
  
  public ECFieldElement sqrt() {
    int[] arrayOfInt1 = this.x;
    if (Nat256.isZero(arrayOfInt1) || Nat256.isOne(arrayOfInt1))
      return (ECFieldElement)this; 
    int[] arrayOfInt2 = Nat256.createExt();
    int[] arrayOfInt3 = Nat256.create();
    SecP256K1Field.square(arrayOfInt1, arrayOfInt3, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt3, arrayOfInt1, arrayOfInt3, arrayOfInt2);
    int[] arrayOfInt4 = Nat256.create();
    SecP256K1Field.square(arrayOfInt3, arrayOfInt4, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt4, arrayOfInt1, arrayOfInt4, arrayOfInt2);
    int[] arrayOfInt5 = Nat256.create();
    SecP256K1Field.squareN(arrayOfInt4, 3, arrayOfInt5, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt5, arrayOfInt4, arrayOfInt5, arrayOfInt2);
    int[] arrayOfInt6 = arrayOfInt5;
    SecP256K1Field.squareN(arrayOfInt5, 3, arrayOfInt6, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt6, arrayOfInt4, arrayOfInt6, arrayOfInt2);
    int[] arrayOfInt7 = arrayOfInt6;
    SecP256K1Field.squareN(arrayOfInt6, 2, arrayOfInt7, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt7, arrayOfInt3, arrayOfInt7, arrayOfInt2);
    int[] arrayOfInt8 = Nat256.create();
    SecP256K1Field.squareN(arrayOfInt7, 11, arrayOfInt8, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt8, arrayOfInt7, arrayOfInt8, arrayOfInt2);
    int[] arrayOfInt9 = arrayOfInt7;
    SecP256K1Field.squareN(arrayOfInt8, 22, arrayOfInt9, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt9, arrayOfInt8, arrayOfInt9, arrayOfInt2);
    int[] arrayOfInt10 = Nat256.create();
    SecP256K1Field.squareN(arrayOfInt9, 44, arrayOfInt10, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt10, arrayOfInt9, arrayOfInt10, arrayOfInt2);
    int[] arrayOfInt11 = Nat256.create();
    SecP256K1Field.squareN(arrayOfInt10, 88, arrayOfInt11, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt11, arrayOfInt10, arrayOfInt11, arrayOfInt2);
    int[] arrayOfInt12 = arrayOfInt10;
    SecP256K1Field.squareN(arrayOfInt11, 44, arrayOfInt12, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt12, arrayOfInt9, arrayOfInt12, arrayOfInt2);
    int[] arrayOfInt13 = arrayOfInt9;
    SecP256K1Field.squareN(arrayOfInt12, 3, arrayOfInt13, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt13, arrayOfInt4, arrayOfInt13, arrayOfInt2);
    int[] arrayOfInt14 = arrayOfInt13;
    SecP256K1Field.squareN(arrayOfInt14, 23, arrayOfInt14, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt14, arrayOfInt8, arrayOfInt14, arrayOfInt2);
    SecP256K1Field.squareN(arrayOfInt14, 6, arrayOfInt14, arrayOfInt2);
    SecP256K1Field.multiply(arrayOfInt14, arrayOfInt3, arrayOfInt14, arrayOfInt2);
    SecP256K1Field.squareN(arrayOfInt14, 2, arrayOfInt14, arrayOfInt2);
    int[] arrayOfInt15 = arrayOfInt3;
    SecP256K1Field.square(arrayOfInt14, arrayOfInt15, arrayOfInt2);
    return Nat256.eq(arrayOfInt1, arrayOfInt15) ? (ECFieldElement)new SecP256K1FieldElement(arrayOfInt14) : null;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof SecP256K1FieldElement))
      return false; 
    SecP256K1FieldElement secP256K1FieldElement = (SecP256K1FieldElement)paramObject;
    return Nat256.eq(this.x, secP256K1FieldElement.x);
  }
  
  public int hashCode() {
    return Q.hashCode() ^ Arrays.hashCode(this.x, 0, 8);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\math\ec\custom\sec\SecP256K1FieldElement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */