package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.DenseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.ProductFormPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.SparseTernaryPolynomial;

public class NTRUSigningPrivateKeyParameters extends AsymmetricKeyParameter {
  private List<Basis> bases = new ArrayList<>();
  
  private NTRUSigningPublicKeyParameters publicKey;
  
  public NTRUSigningPrivateKeyParameters(byte[] paramArrayOfbyte, NTRUSigningKeyGenerationParameters paramNTRUSigningKeyGenerationParameters) throws IOException {
    this(new ByteArrayInputStream(paramArrayOfbyte), paramNTRUSigningKeyGenerationParameters);
  }
  
  public NTRUSigningPrivateKeyParameters(InputStream paramInputStream, NTRUSigningKeyGenerationParameters paramNTRUSigningKeyGenerationParameters) throws IOException {
    super(true);
    for (byte b = 0; b <= paramNTRUSigningKeyGenerationParameters.B; b++)
      add(new Basis(paramInputStream, paramNTRUSigningKeyGenerationParameters, (b != 0))); 
    this.publicKey = new NTRUSigningPublicKeyParameters(paramInputStream, paramNTRUSigningKeyGenerationParameters.getSigningParameters());
  }
  
  public NTRUSigningPrivateKeyParameters(List<Basis> paramList, NTRUSigningPublicKeyParameters paramNTRUSigningPublicKeyParameters) {
    super(true);
    this.publicKey = paramNTRUSigningPublicKeyParameters;
  }
  
  private void add(Basis paramBasis) {
    this.bases.add(paramBasis);
  }
  
  public Basis getBasis(int paramInt) {
    return this.bases.get(paramInt);
  }
  
  public NTRUSigningPublicKeyParameters getPublicKey() {
    return this.publicKey;
  }
  
  public byte[] getEncoded() throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    for (byte b = 0; b < this.bases.size(); b++)
      ((Basis)this.bases.get(b)).encode(byteArrayOutputStream, (b != 0)); 
    byteArrayOutputStream.write(this.publicKey.getEncoded());
    return byteArrayOutputStream.toByteArray();
  }
  
  public void writeTo(OutputStream paramOutputStream) throws IOException {
    paramOutputStream.write(getEncoded());
  }
  
  public int hashCode() {
    int i = 1;
    i = 31 * i;
    if (this.bases == null)
      return i; 
    i += this.bases.hashCode();
    for (Basis basis : this.bases)
      i += basis.hashCode(); 
    return i;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters = (NTRUSigningPrivateKeyParameters)paramObject;
    if (((this.bases == null) ? true : false) != ((nTRUSigningPrivateKeyParameters.bases == null) ? true : false))
      return false; 
    if (this.bases == null)
      return true; 
    if (this.bases.size() != nTRUSigningPrivateKeyParameters.bases.size())
      return false; 
    for (byte b = 0; b < this.bases.size(); b++) {
      Basis basis1 = this.bases.get(b);
      Basis basis2 = nTRUSigningPrivateKeyParameters.bases.get(b);
      if (!basis1.f.equals(basis2.f))
        return false; 
      if (!basis1.fPrime.equals(basis2.fPrime))
        return false; 
      if (b != 0 && !basis1.h.equals(basis2.h))
        return false; 
      if (!basis1.params.equals(basis2.params))
        return false; 
    } 
    return true;
  }
  
  public static class Basis {
    public Polynomial f;
    
    public Polynomial fPrime;
    
    public IntegerPolynomial h;
    
    NTRUSigningKeyGenerationParameters params;
    
    protected Basis(Polynomial param1Polynomial1, Polynomial param1Polynomial2, IntegerPolynomial param1IntegerPolynomial, NTRUSigningKeyGenerationParameters param1NTRUSigningKeyGenerationParameters) {
      this.f = param1Polynomial1;
      this.fPrime = param1Polynomial2;
      this.h = param1IntegerPolynomial;
      this.params = param1NTRUSigningKeyGenerationParameters;
    }
    
    Basis(InputStream param1InputStream, NTRUSigningKeyGenerationParameters param1NTRUSigningKeyGenerationParameters, boolean param1Boolean) throws IOException {
      int i = param1NTRUSigningKeyGenerationParameters.N;
      int j = param1NTRUSigningKeyGenerationParameters.q;
      int k = param1NTRUSigningKeyGenerationParameters.d1;
      int m = param1NTRUSigningKeyGenerationParameters.d2;
      int n = param1NTRUSigningKeyGenerationParameters.d3;
      boolean bool = param1NTRUSigningKeyGenerationParameters.sparse;
      this.params = param1NTRUSigningKeyGenerationParameters;
      if (param1NTRUSigningKeyGenerationParameters.polyType == 1) {
        this.f = (Polynomial)ProductFormPolynomial.fromBinary(param1InputStream, i, k, m, n + 1, n);
      } else {
        IntegerPolynomial integerPolynomial = IntegerPolynomial.fromBinary3Tight(param1InputStream, i);
        this.f = bool ? (Polynomial)new SparseTernaryPolynomial(integerPolynomial) : (Polynomial)new DenseTernaryPolynomial(integerPolynomial);
      } 
      if (param1NTRUSigningKeyGenerationParameters.basisType == 0) {
        IntegerPolynomial integerPolynomial = IntegerPolynomial.fromBinary(param1InputStream, i, j);
        for (byte b = 0; b < integerPolynomial.coeffs.length; b++)
          integerPolynomial.coeffs[b] = integerPolynomial.coeffs[b] - j / 2; 
        this.fPrime = (Polynomial)integerPolynomial;
      } else if (param1NTRUSigningKeyGenerationParameters.polyType == 1) {
        this.fPrime = (Polynomial)ProductFormPolynomial.fromBinary(param1InputStream, i, k, m, n + 1, n);
      } else {
        this.fPrime = (Polynomial)IntegerPolynomial.fromBinary3Tight(param1InputStream, i);
      } 
      if (param1Boolean)
        this.h = IntegerPolynomial.fromBinary(param1InputStream, i, j); 
    }
    
    void encode(OutputStream param1OutputStream, boolean param1Boolean) throws IOException {
      int i = this.params.q;
      param1OutputStream.write(getEncoded(this.f));
      if (this.params.basisType == 0) {
        IntegerPolynomial integerPolynomial = this.fPrime.toIntegerPolynomial();
        for (byte b = 0; b < integerPolynomial.coeffs.length; b++)
          integerPolynomial.coeffs[b] = integerPolynomial.coeffs[b] + i / 2; 
        param1OutputStream.write(integerPolynomial.toBinary(i));
      } else {
        param1OutputStream.write(getEncoded(this.fPrime));
      } 
      if (param1Boolean)
        param1OutputStream.write(this.h.toBinary(i)); 
    }
    
    private byte[] getEncoded(Polynomial param1Polynomial) {
      return (param1Polynomial instanceof ProductFormPolynomial) ? ((ProductFormPolynomial)param1Polynomial).toBinary() : param1Polynomial.toIntegerPolynomial().toBinary3Tight();
    }
    
    public int hashCode() {
      null = 1;
      null = 31 * null + ((this.f == null) ? 0 : this.f.hashCode());
      null = 31 * null + ((this.fPrime == null) ? 0 : this.fPrime.hashCode());
      null = 31 * null + ((this.h == null) ? 0 : this.h.hashCode());
      return 31 * null + ((this.params == null) ? 0 : this.params.hashCode());
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object == null)
        return false; 
      if (!(param1Object instanceof Basis))
        return false; 
      Basis basis = (Basis)param1Object;
      if (this.f == null) {
        if (basis.f != null)
          return false; 
      } else if (!this.f.equals(basis.f)) {
        return false;
      } 
      if (this.fPrime == null) {
        if (basis.fPrime != null)
          return false; 
      } else if (!this.fPrime.equals(basis.fPrime)) {
        return false;
      } 
      if (this.h == null) {
        if (basis.h != null)
          return false; 
      } else if (!this.h.equals(basis.h)) {
        return false;
      } 
      if (this.params == null) {
        if (basis.params != null)
          return false; 
      } else if (!this.params.equals(basis.params)) {
        return false;
      } 
      return true;
    }
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUSigningPrivateKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */