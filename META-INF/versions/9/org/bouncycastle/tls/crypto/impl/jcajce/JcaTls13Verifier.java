package META-INF.versions.9.org.bouncycastle.tls.crypto.impl.jcajce;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.jcajce.io.OutputStreamFactory;
import org.bouncycastle.tls.TlsFatalAlert;
import org.bouncycastle.tls.crypto.Tls13Verifier;

final class JcaTls13Verifier implements Tls13Verifier {
  private final Signature verifier;
  
  private final OutputStream output;
  
  JcaTls13Verifier(Signature paramSignature) {
    this.verifier = paramSignature;
    this.output = OutputStreamFactory.createStream(paramSignature);
  }
  
  public final OutputStream getOutputStream() throws IOException {
    return this.output;
  }
  
  public final boolean verifySignature(byte[] paramArrayOfbyte) throws IOException {
    try {
      return this.verifier.verify(paramArrayOfbyte);
    } catch (SignatureException signatureException) {
      throw new TlsFatalAlert((short)80, signatureException);
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\impl\jcajce\JcaTls13Verifier.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */