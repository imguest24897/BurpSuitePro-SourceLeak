package META-INF.versions.9.org.bouncycastle.tls.crypto;

import java.io.IOException;
import java.io.OutputStream;

public interface TlsStreamSigner {
  OutputStream getOutputStream() throws IOException;
  
  byte[] getSignature() throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsStreamSigner.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */