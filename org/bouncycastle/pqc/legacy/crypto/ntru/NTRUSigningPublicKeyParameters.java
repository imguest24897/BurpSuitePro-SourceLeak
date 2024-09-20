package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;

public class NTRUSigningPublicKeyParameters extends AsymmetricKeyParameter {
  private NTRUSigningParameters params;
  
  public IntegerPolynomial h;
  
  public NTRUSigningPublicKeyParameters(IntegerPolynomial paramIntegerPolynomial, NTRUSigningParameters paramNTRUSigningParameters) {
    super(false);
    this.h = paramIntegerPolynomial;
    this.params = paramNTRUSigningParameters;
  }
  
  public NTRUSigningPublicKeyParameters(byte[] paramArrayOfbyte, NTRUSigningParameters paramNTRUSigningParameters) {
    super(false);
    this.h = IntegerPolynomial.fromBinary(paramArrayOfbyte, paramNTRUSigningParameters.N, paramNTRUSigningParameters.q);
    this.params = paramNTRUSigningParameters;
  }
  
  public NTRUSigningPublicKeyParameters(InputStream paramInputStream, NTRUSigningParameters paramNTRUSigningParameters) throws IOException {
    super(false);
    this.h = IntegerPolynomial.fromBinary(paramInputStream, paramNTRUSigningParameters.N, paramNTRUSigningParameters.q);
    this.params = paramNTRUSigningParameters;
  }
  
  public byte[] getEncoded() {
    return this.h.toBinary(this.params.q);
  }
  
  public void writeTo(OutputStream paramOutputStream) throws IOException {
    paramOutputStream.write(getEncoded());
  }
  
  public int hashCode() {
    null = 1;
    null = 31 * null + ((this.h == null) ? 0 : this.h.hashCode());
    return 31 * null + ((this.params == null) ? 0 : this.params.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() != paramObject.getClass())
      return false; 
    NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = (NTRUSigningPublicKeyParameters)paramObject;
    if (this.h == null) {
      if (nTRUSigningPublicKeyParameters.h != null)
        return false; 
    } else if (!this.h.equals(nTRUSigningPublicKeyParameters.h)) {
      return false;
    } 
    if (this.params == null) {
      if (nTRUSigningPublicKeyParameters.params != null)
        return false; 
    } else if (!this.params.equals(nTRUSigningPublicKeyParameters.params)) {
      return false;
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUSigningPublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */