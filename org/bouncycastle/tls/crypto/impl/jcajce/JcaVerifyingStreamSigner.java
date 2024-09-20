package org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsStreamSigner;
import org.bouncycastle.util.io.TeeOutputStream;

class JcaVerifyingStreamSigner implements TlsStreamSigner {
  private final Signature signer;
  
  private final Signature verifier;
  
  private final OutputStream output;
  
  JcaVerifyingStreamSigner(Signature paramSignature1, Signature paramSignature2) {
    OutputStream outputStream1 = OutputStreamFactory.createStream(paramSignature1);
    OutputStream outputStream2 = OutputStreamFactory.createStream(paramSignature2);
    this.signer = paramSignature1;
    this.verifier = paramSignature2;
    this.output = (OutputStream)new TeeOutputStream(outputStream1, outputStream2);
  }
  
  public OutputStream getOutputStream() throws IOException {
    return this.output;
  }
  
  public byte[] getSignature() throws IOException {
    try {
      byte[] arrayOfByte = this.signer.sign();
      if (this.verifier.verify(arrayOfByte))
        return arrayOfByte; 
    } catch (SignatureException signatureException) {
      throw new TlsFatalAlert((short)80, signatureException);
    } 
    throw new TlsFatalAlert((short)80);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\bouncycastle\tls\crypto\impl\jcajce\JcaVerifyingStreamSigner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */