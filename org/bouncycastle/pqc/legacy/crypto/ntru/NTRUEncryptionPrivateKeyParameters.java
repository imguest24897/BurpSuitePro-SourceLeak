package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.DenseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.ProductFormPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.SparseTernaryPolynomial;

public class NTRUEncryptionPrivateKeyParameters extends NTRUEncryptionKeyParameters {
  public Polynomial t;
  
  public IntegerPolynomial fp;
  
  public IntegerPolynomial h;
  
  public NTRUEncryptionPrivateKeyParameters(IntegerPolynomial paramIntegerPolynomial1, Polynomial paramPolynomial, IntegerPolynomial paramIntegerPolynomial2, NTRUEncryptionParameters paramNTRUEncryptionParameters) {
    super(true, paramNTRUEncryptionParameters);
    this.h = paramIntegerPolynomial1;
    this.t = paramPolynomial;
    this.fp = paramIntegerPolynomial2;
  }
  
  public NTRUEncryptionPrivateKeyParameters(byte[] paramArrayOfbyte, NTRUEncryptionParameters paramNTRUEncryptionParameters) throws IOException {
    this(new ByteArrayInputStream(paramArrayOfbyte), paramNTRUEncryptionParameters);
  }
  
  public NTRUEncryptionPrivateKeyParameters(InputStream paramInputStream, NTRUEncryptionParameters paramNTRUEncryptionParameters) throws IOException {
    super(true, paramNTRUEncryptionParameters);
    if (paramNTRUEncryptionParameters.polyType == 1) {
      int i = paramNTRUEncryptionParameters.N;
      int j = paramNTRUEncryptionParameters.df1;
      int k = paramNTRUEncryptionParameters.df2;
      int m = paramNTRUEncryptionParameters.df3;
      int n = paramNTRUEncryptionParameters.fastFp ? paramNTRUEncryptionParameters.df3 : (paramNTRUEncryptionParameters.df3 - 1);
      this.h = IntegerPolynomial.fromBinary(paramInputStream, paramNTRUEncryptionParameters.N, paramNTRUEncryptionParameters.q);
      this.t = (Polynomial)ProductFormPolynomial.fromBinary(paramInputStream, i, j, k, m, n);
    } else {
      this.h = IntegerPolynomial.fromBinary(paramInputStream, paramNTRUEncryptionParameters.N, paramNTRUEncryptionParameters.q);
      IntegerPolynomial integerPolynomial = IntegerPolynomial.fromBinary3Tight(paramInputStream, paramNTRUEncryptionParameters.N);
      this.t = paramNTRUEncryptionParameters.sparse ? (Polynomial)new SparseTernaryPolynomial(integerPolynomial) : (Polynomial)new DenseTernaryPolynomial(integerPolynomial);
    } 
    init();
  }
  
  private void init() {
    if (this.params.fastFp) {
      this.fp = new IntegerPolynomial(this.params.N);
      this.fp.coeffs[0] = 1;
    } else {
      this.fp = this.t.toIntegerPolynomial().invertF3();
    } 
  }
  
  public byte[] getEncoded() {
    byte[] arrayOfByte2;
    byte[] arrayOfByte1 = this.h.toBinary(this.params.q);
    if (this.t instanceof ProductFormPolynomial) {
      arrayOfByte2 = ((ProductFormPolynomial)this.t).toBinary();
    } else {
      arrayOfByte2 = this.t.toIntegerPolynomial().toBinary3Tight();
    } 
    byte[] arrayOfByte3 = new byte[arrayOfByte1.length + arrayOfByte2.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, arrayOfByte1.length);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte3, arrayOfByte1.length, arrayOfByte2.length);
    return arrayOfByte3;
  }
  
  public void writeTo(OutputStream paramOutputStream) throws IOException {
    paramOutputStream.write(getEncoded());
  }
  
  public int hashCode() {
    null = 1;
    null = 31 * null + ((this.params == null) ? 0 : this.params.hashCode());
    null = 31 * null + ((this.t == null) ? 0 : this.t.hashCode());
    return 31 * null + ((this.h == null) ? 0 : this.h.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (!(paramObject instanceof NTRUEncryptionPrivateKeyParameters))
      return false; 
    NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters = (NTRUEncryptionPrivateKeyParameters)paramObject;
    if (this.params == null) {
      if (nTRUEncryptionPrivateKeyParameters.params != null)
        return false; 
    } else if (!this.params.equals(nTRUEncryptionPrivateKeyParameters.params)) {
      return false;
    } 
    if (this.t == null) {
      if (nTRUEncryptionPrivateKeyParameters.t != null)
        return false; 
    } else if (!this.t.equals(nTRUEncryptionPrivateKeyParameters.t)) {
      return false;
    } 
    return !!this.h.equals(nTRUEncryptionPrivateKeyParameters.h);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUEncryptionPrivateKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */