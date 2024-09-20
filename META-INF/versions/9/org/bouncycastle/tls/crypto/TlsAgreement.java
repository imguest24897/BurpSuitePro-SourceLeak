package META-INF.versions.9.org.bouncycastle.tls.crypto;

import java.io.IOException;
import org.bouncycastle.tls.crypto.TlsSecret;

public interface TlsAgreement {
  byte[] generateEphemeral() throws IOException;
  
  void receivePeerValue(byte[] paramArrayOfbyte) throws IOException;
  
  TlsSecret calculateSecret() throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\META-INF\versions\9\org\bouncycastle\tls\crypto\TlsAgreement.class
 * Java compiler version: 9 (53.0)
 * JD-Core Version:       1.1.3
 */