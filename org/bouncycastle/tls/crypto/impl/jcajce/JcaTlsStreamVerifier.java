package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsStreamVerifier;

class JcaTlsStreamVerifier implements TlsStreamVerifier {
  private final Signature verifier;
  
  private final OutputStream output;
  
  private final byte[] signature;
  
  JcaTlsStreamVerifier(Signature paramSignature, byte[] paramArrayOfbyte) {
    this.verifier = paramSignature;
    this.output = OutputStreamFactory.createStream(paramSignature);
    this.signature = paramArrayOfbyte;
  }
  
  public OutputStream getOutputStream() throws IOException {
    return this.output;
  }
  
  public boolean isVerified() throws IOException {
    try {
      return this.verifier.verify(this.signature);
    } catch (SignatureException signatureException) {
      throw new TlsFatalAlert((short)80, signatureException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsStreamVerifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */