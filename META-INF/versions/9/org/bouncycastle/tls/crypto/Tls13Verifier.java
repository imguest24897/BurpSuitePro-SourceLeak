package META-INF.versions.9.org.bouncycastle.tls.crypto;

import java.io.IOException;
import java.io.OutputStream;

public interface Tls13Verifier {
  OutputStream getOutputStream() throws IOException;
  
  boolean verifySignature(byte[] paramArrayOfbyte) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\Tls13Verifier.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */