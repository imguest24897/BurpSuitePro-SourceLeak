package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

public class ProductFormPolynomial implements Polynomial {
  private SparseTernaryPolynomial f1;
  
  private SparseTernaryPolynomial f2;
  
  private SparseTernaryPolynomial f3;
  
  public ProductFormPolynomial(SparseTernaryPolynomial paramSparseTernaryPolynomial1, SparseTernaryPolynomial paramSparseTernaryPolynomial2, SparseTernaryPolynomial paramSparseTernaryPolynomial3) {
    this.f1 = paramSparseTernaryPolynomial1;
    this.f2 = paramSparseTernaryPolynomial2;
    this.f3 = paramSparseTernaryPolynomial3;
  }
  
  public static ProductFormPolynomial generateRandom(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, SecureRandom paramSecureRandom) {
    SparseTernaryPolynomial sparseTernaryPolynomial1 = SparseTernaryPolynomial.generateRandom(paramInt1, paramInt2, paramInt2, paramSecureRandom);
    SparseTernaryPolynomial sparseTernaryPolynomial2 = SparseTernaryPolynomial.generateRandom(paramInt1, paramInt3, paramInt3, paramSecureRandom);
    SparseTernaryPolynomial sparseTernaryPolynomial3 = SparseTernaryPolynomial.generateRandom(paramInt1, paramInt4, paramInt5, paramSecureRandom);
    return new ProductFormPolynomial(sparseTernaryPolynomial1, sparseTernaryPolynomial2, sparseTernaryPolynomial3);
  }
  
  public static ProductFormPolynomial fromBinary(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) throws IOException {
    return fromBinary(new ByteArrayInputStream(paramArrayOfbyte), paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public static ProductFormPolynomial fromBinary(InputStream paramInputStream, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) throws IOException {
    SparseTernaryPolynomial sparseTernaryPolynomial1 = SparseTernaryPolynomial.fromBinary(paramInputStream, paramInt1, paramInt2, paramInt2);
    SparseTernaryPolynomial sparseTernaryPolynomial2 = SparseTernaryPolynomial.fromBinary(paramInputStream, paramInt1, paramInt3, paramInt3);
    SparseTernaryPolynomial sparseTernaryPolynomial3 = SparseTernaryPolynomial.fromBinary(paramInputStream, paramInt1, paramInt4, paramInt5);
    return new ProductFormPolynomial(sparseTernaryPolynomial1, sparseTernaryPolynomial2, sparseTernaryPolynomial3);
  }
  
  public byte[] toBinary() {
    byte[] arrayOfByte1 = this.f1.toBinary();
    byte[] arrayOfByte2 = this.f2.toBinary();
    byte[] arrayOfByte3 = this.f3.toBinary();
    byte[] arrayOfByte4 = Arrays.copyOf(arrayOfByte1, arrayOfByte1.length + arrayOfByte2.length + arrayOfByte3.length);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte4, arrayOfByte1.length, arrayOfByte2.length);
    System.arraycopy(arrayOfByte3, 0, arrayOfByte4, arrayOfByte1.length + arrayOfByte2.length, arrayOfByte3.length);
    return arrayOfByte4;
  }
  
  public IntegerPolynomial mult(IntegerPolynomial paramIntegerPolynomial) {
    IntegerPolynomial integerPolynomial = this.f1.mult(paramIntegerPolynomial);
    integerPolynomial = this.f2.mult(integerPolynomial);
    integerPolynomial.add(this.f3.mult(paramIntegerPolynomial));
    return integerPolynomial;
  }
  
  public BigIntPolynomial mult(BigIntPolynomial paramBigIntPolynomial) {
    BigIntPolynomial bigIntPolynomial = this.f1.mult(paramBigIntPolynomial);
    bigIntPolynomial = this.f2.mult(bigIntPolynomial);
    bigIntPolynomial.add(this.f3.mult(paramBigIntPolynomial));
    return bigIntPolynomial;
  }
  
  public IntegerPolynomial toIntegerPolynomial() {
    IntegerPolynomial integerPolynomial = this.f1.mult(this.f2.toIntegerPolynomial());
    integerPolynomial.add(this.f3.toIntegerPolynomial());
    return integerPolynomial;
  }
  
  public IntegerPolynomial mult(IntegerPolynomial paramIntegerPolynomial, int paramInt) {
    IntegerPolynomial integerPolynomial = mult(paramIntegerPolynomial);
    integerPolynomial.mod(paramInt);
    return integerPolynomial;
  }
  
  public int hashCode() {
    null = 1;
    null = 31 * null + ((this.f1 == null) ? 0 : this.f1.hashCode());
    null = 31 * null + ((this.f2 == null) ? 0 : this.f2.hashCode());
    return 31 * null + ((this.f3 == null) ? 0 : this.f3.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    ProductFormPolynomial productFormPolynomial = (ProductFormPolynomial)paramObject;
    if (this.f1 == null) {
      if (productFormPolynomial.f1 != null)
        return false; 
    } else if (!this.f1.equals(productFormPolynomial.f1)) {
      return false;
    } 
    if (this.f2 == null) {
      if (productFormPolynomial.f2 != null)
        return false; 
    } else if (!this.f2.equals(productFormPolynomial.f2)) {
      return false;
    } 
    if (this.f3 == null) {
      if (productFormPolynomial.f3 != null)
        return false; 
    } else if (!this.f3.equals(productFormPolynomial.f3)) {
      return false;
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\math\ntru\polynomial\ProductFormPolynomial.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */