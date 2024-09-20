package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.TlsStreamSigner;

class JcaTlsStreamSigner implements TlsStreamSigner {
  private final Signature signer;
  
  private final OutputStream output;
  
  JcaTlsStreamSigner(Signature paramSignature) {
    this.signer = paramSignature;
    this.output = OutputStreamFactory.createStream(paramSignature);
  }
  
  public OutputStream getOutputStream() throws IOException {
    return this.output;
  }
  
  public byte[] getSignature() throws IOException {
    try {
      return this.signer.sign();
    } catch (SignatureException signatureException) {
      throw new TlsFatalAlert((short)80, signatureException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaTlsStreamSigner.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */