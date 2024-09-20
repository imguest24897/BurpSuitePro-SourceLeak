package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.IntegerPolynomial;

public class NTRUEncryptionPublicKeyParameters extends NTRUEncryptionKeyParameters {
  public IntegerPolynomial h;
  
  public NTRUEncryptionPublicKeyParameters(IntegerPolynomial paramIntegerPolynomial, NTRUEncryptionParameters paramNTRUEncryptionParameters) {
    super(false, paramNTRUEncryptionParameters);
    this.h = paramIntegerPolynomial;
  }
  
  public NTRUEncryptionPublicKeyParameters(byte[] paramArrayOfbyte, NTRUEncryptionParameters paramNTRUEncryptionParameters) {
    super(false, paramNTRUEncryptionParameters);
    this.h = IntegerPolynomial.fromBinary(paramArrayOfbyte, paramNTRUEncryptionParameters.N, paramNTRUEncryptionParameters.q);
  }
  
  public NTRUEncryptionPublicKeyParameters(InputStream paramInputStream, NTRUEncryptionParameters paramNTRUEncryptionParameters) throws IOException {
    super(false, paramNTRUEncryptionParameters);
    this.h = IntegerPolynomial.fromBinary(paramInputStream, paramNTRUEncryptionParameters.N, paramNTRUEncryptionParameters.q);
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
    if (!(paramObject instanceof NTRUEncryptionPublicKeyParameters))
      return false; 
    NTRUEncryptionPublicKeyParameters nTRUEncryptionPublicKeyParameters = (NTRUEncryptionPublicKeyParameters)paramObject;
    if (this.h == null) {
      if (nTRUEncryptionPublicKeyParameters.h != null)
        return false; 
    } else if (!this.h.equals(nTRUEncryptionPublicKeyParameters.h)) {
      return false;
    } 
    if (this.params == null) {
      if (nTRUEncryptionPublicKeyParameters.params != null)
        return false; 
    } else if (!this.params.equals(nTRUEncryptionPublicKeyParameters.params)) {
      return false;
    } 
    return true;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\pqc\legacy\crypto\ntru\NTRUEncryptionPublicKeyParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */