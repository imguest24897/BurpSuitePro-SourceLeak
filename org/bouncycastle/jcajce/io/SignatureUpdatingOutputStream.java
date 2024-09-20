package org.bouncycastle.jcajce.io;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.util.Exceptions;

class SignatureUpdatingOutputStream extends OutputStream {
  private Signature sig;
  
  SignatureUpdatingOutputStream(Signature paramSignature) {
    this.sig = paramSignature;
  }
  
  public void write(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    try {
      this.sig.update(paramArrayOfbyte, paramInt1, paramInt2);
    } catch (SignatureException signatureException) {
      throw Exceptions.ioException(signatureException.getMessage(), signatureException);
    } 
  }
  
  public void write(byte[] paramArrayOfbyte) throws IOException {
    try {
      this.sig.update(paramArrayOfbyte);
    } catch (SignatureException signatureException) {
      throw Exceptions.ioException(signatureException.getMessage(), signatureException);
    } 
  }
  
  public void write(int paramInt) throws IOException {
    try {
      this.sig.update((byte)paramInt);
    } catch (SignatureException signatureException) {
      throw Exceptions.ioException(signatureException.getMessage(), signatureException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\jcajce\io\SignatureUpdatingOutputStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */